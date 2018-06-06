package b4a.VankoBet;


import anywheresoftware.b4a.B4AMenuItem;
import android.app.Activity;
import android.os.Bundle;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.B4AActivity;
import anywheresoftware.b4a.ObjectWrapper;
import anywheresoftware.b4a.objects.ActivityWrapper;
import java.lang.reflect.InvocationTargetException;
import anywheresoftware.b4a.B4AUncaughtException;
import anywheresoftware.b4a.debug.*;
import java.lang.ref.WeakReference;

public class main extends Activity implements B4AActivity{
	public static main mostCurrent;
	static boolean afterFirstLayout;
	static boolean isFirst = true;
    private static boolean processGlobalsRun = false;
	BALayout layout;
	public static BA processBA;
	BA activityBA;
    ActivityWrapper _activity;
    java.util.ArrayList<B4AMenuItem> menuItems;
	public static final boolean fullScreen = true;
	public static final boolean includeTitle = false;
    public static WeakReference<Activity> previousOne;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        mostCurrent = this;
		if (processBA == null) {
			processBA = new BA(this.getApplicationContext(), null, null, "b4a.VankoBet", "b4a.VankoBet.main");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (main).");
				p.finish();
			}
		}
        processBA.setActivityPaused(true);
        processBA.runHook("oncreate", this, null);
		if (!includeTitle) {
        	this.getWindow().requestFeature(android.view.Window.FEATURE_NO_TITLE);
        }
        if (fullScreen) {
        	getWindow().setFlags(android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN,   
        			android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
		
        processBA.sharedProcessBA.activityBA = null;
		layout = new BALayout(this);
		setContentView(layout);
		afterFirstLayout = false;
        WaitForLayout wl = new WaitForLayout();
        if (anywheresoftware.b4a.objects.ServiceHelper.StarterHelper.startFromActivity(processBA, wl, false))
		    BA.handler.postDelayed(wl, 5);

	}
	static class WaitForLayout implements Runnable {
		public void run() {
			if (afterFirstLayout)
				return;
			if (mostCurrent == null)
				return;
            
			if (mostCurrent.layout.getWidth() == 0) {
				BA.handler.postDelayed(this, 5);
				return;
			}
			mostCurrent.layout.getLayoutParams().height = mostCurrent.layout.getHeight();
			mostCurrent.layout.getLayoutParams().width = mostCurrent.layout.getWidth();
			afterFirstLayout = true;
			mostCurrent.afterFirstLayout();
		}
	}
	private void afterFirstLayout() {
        if (this != mostCurrent)
			return;
		activityBA = new BA(this, layout, processBA, "b4a.VankoBet", "b4a.VankoBet.main");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.VankoBet.main", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (main) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (main) Resume **");
        processBA.raiseEvent(null, "activity_resume");
        if (android.os.Build.VERSION.SDK_INT >= 11) {
			try {
				android.app.Activity.class.getMethod("invalidateOptionsMenu").invoke(this,(Object[]) null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	public void addMenuItem(B4AMenuItem item) {
		if (menuItems == null)
			menuItems = new java.util.ArrayList<B4AMenuItem>();
		menuItems.add(item);
	}
	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		super.onCreateOptionsMenu(menu);
        try {
            if (processBA.subExists("activity_actionbarhomeclick")) {
                Class.forName("android.app.ActionBar").getMethod("setHomeButtonEnabled", boolean.class).invoke(
                    getClass().getMethod("getActionBar").invoke(this), true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (processBA.runHook("oncreateoptionsmenu", this, new Object[] {menu}))
            return true;
		if (menuItems == null)
			return false;
		for (B4AMenuItem bmi : menuItems) {
			android.view.MenuItem mi = menu.add(bmi.title);
			if (bmi.drawable != null)
				mi.setIcon(bmi.drawable);
            if (android.os.Build.VERSION.SDK_INT >= 11) {
				try {
                    if (bmi.addToBar) {
				        android.view.MenuItem.class.getMethod("setShowAsAction", int.class).invoke(mi, 1);
                    }
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			mi.setOnMenuItemClickListener(new B4AMenuItemsClickListener(bmi.eventName.toLowerCase(BA.cul)));
		}
        
		return true;
	}   
 @Override
 public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if (item.getItemId() == 16908332) {
        processBA.raiseEvent(null, "activity_actionbarhomeclick");
        return true;
    }
    else
        return super.onOptionsItemSelected(item); 
}
@Override
 public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    super.onPrepareOptionsMenu(menu);
    processBA.runHook("onprepareoptionsmenu", this, new Object[] {menu});
    return true;
    
 }
 protected void onStart() {
    super.onStart();
    processBA.runHook("onstart", this, null);
}
 protected void onStop() {
    super.onStop();
    processBA.runHook("onstop", this, null);
}
    public void onWindowFocusChanged(boolean hasFocus) {
       super.onWindowFocusChanged(hasFocus);
       if (processBA.subExists("activity_windowfocuschanged"))
           processBA.raiseEvent2(null, true, "activity_windowfocuschanged", false, hasFocus);
    }
	private class B4AMenuItemsClickListener implements android.view.MenuItem.OnMenuItemClickListener {
		private final String eventName;
		public B4AMenuItemsClickListener(String eventName) {
			this.eventName = eventName;
		}
		public boolean onMenuItemClick(android.view.MenuItem item) {
			processBA.raiseEventFromUI(item.getTitle(), eventName + "_click");
			return true;
		}
	}
    public static Class<?> getObject() {
		return main.class;
	}
    private Boolean onKeySubExist = null;
    private Boolean onKeyUpSubExist = null;
	@Override
	public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeydown", this, new Object[] {keyCode, event}))
            return true;
		if (onKeySubExist == null)
			onKeySubExist = processBA.subExists("activity_keypress");
		if (onKeySubExist) {
			if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK &&
					android.os.Build.VERSION.SDK_INT >= 18) {
				HandleKeyDelayed hk = new HandleKeyDelayed();
				hk.kc = keyCode;
				BA.handler.post(hk);
				return true;
			}
			else {
				boolean res = new HandleKeyDelayed().runDirectly(keyCode);
				if (res)
					return true;
			}
		}
		return super.onKeyDown(keyCode, event);
	}
	private class HandleKeyDelayed implements Runnable {
		int kc;
		public void run() {
			runDirectly(kc);
		}
		public boolean runDirectly(int keyCode) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keypress", false, keyCode);
			if (res == null || res == true) {
                return true;
            }
            else if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK) {
				finish();
				return true;
			}
            return false;
		}
		
	}
    @Override
	public boolean onKeyUp(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeyup", this, new Object[] {keyCode, event}))
            return true;
		if (onKeyUpSubExist == null)
			onKeyUpSubExist = processBA.subExists("activity_keyup");
		if (onKeyUpSubExist) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keyup", false, keyCode);
			if (res == null || res == true)
				return true;
		}
		return super.onKeyUp(keyCode, event);
	}
	@Override
	public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
		this.setIntent(intent);
        processBA.runHook("onnewintent", this, new Object[] {intent});
	}
    @Override 
	public void onPause() {
		super.onPause();
        if (_activity == null)
            return;
        if (this != mostCurrent)
			return;
		anywheresoftware.b4a.Msgbox.dismiss(true);
        BA.LogInfo("** Activity (main) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        if (mostCurrent != null)
            processBA.raiseEvent2(_activity, true, "activity_pause", false, activityBA.activity.isFinishing());		
        processBA.setActivityPaused(true);
        mostCurrent = null;
        if (!activityBA.activity.isFinishing())
			previousOne = new WeakReference<Activity>(this);
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        processBA.runHook("onpause", this, null);
	}

	@Override
	public void onDestroy() {
        super.onDestroy();
		previousOne = null;
        processBA.runHook("ondestroy", this, null);
	}
    @Override 
	public void onResume() {
		super.onResume();
        mostCurrent = this;
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (activityBA != null) { //will be null during activity create (which waits for AfterLayout).
        	ResumeMessage rm = new ResumeMessage(mostCurrent);
        	BA.handler.post(rm);
        }
        processBA.runHook("onresume", this, null);
	}
    private static class ResumeMessage implements Runnable {
    	private final WeakReference<Activity> activity;
    	public ResumeMessage(Activity activity) {
    		this.activity = new WeakReference<Activity>(activity);
    	}
		public void run() {
			if (mostCurrent == null || mostCurrent != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (main) Resume **");
		    processBA.raiseEvent(mostCurrent._activity, "activity_resume", (Object[])null);
		}
    }
	@Override
	protected void onActivityResult(int requestCode, int resultCode,
	      android.content.Intent data) {
		processBA.onActivityResult(requestCode, resultCode, data);
        processBA.runHook("onactivityresult", this, new Object[] {requestCode, resultCode});
	}
	private static void initializeGlobals() {
		processBA.raiseEvent2(null, true, "globals", false, (Object[])null);
	}
    public void onRequestPermissionsResult(int requestCode,
        String permissions[], int[] grantResults) {
        for (int i = 0;i < permissions.length;i++) {
            Object[] o = new Object[] {permissions[i], grantResults[i] == 0};
            processBA.raiseEventFromDifferentThread(null,null, 0, "activity_permissionresult", true, o);
        }
            
    }

public anywheresoftware.b4a.keywords.Common __c = null;
public b4a.VankoBet.register _registerscreen = null;
public b4a.VankoBet.login _loginscr = null;
public b4a.VankoBet.appmaininterface _appmainscreen = null;
public b4a.VankoBet.betpopup _bets_popup = null;
public b4a.VankoBet.promote _rankupdate = null;
public b4a.VankoBet.slotgame _slotgame1 = null;
public static boolean _isfirsttime = false;
public b4a.VankoBet.types _types = null;
public b4a.VankoBet.starter _starter = null;
public b4a.VankoBet.helperfunctions _helperfunctions = null;
public b4a.VankoBet.db _db = null;

public static boolean isAnyActivityVisible() {
    boolean vis = false;
vis = vis | (main.mostCurrent != null);
return vis;}
public static String  _activity_create(boolean _firsttime) throws Exception{
anywheresoftware.b4a.sql.SQL.CursorWrapper _cursor = null;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cursor1 = null;
 //BA.debugLineNum = 31;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
 //BA.debugLineNum = 33;BA.debugLine="DB.DATABASEinit";
mostCurrent._db._databaseinit(mostCurrent.activityBA);
 //BA.debugLineNum = 34;BA.debugLine="If File.Exists(File.DirDefaultExternal,\"UserAndBe";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),"UserAndBetsDatabase.db")) { 
 //BA.debugLineNum = 35;BA.debugLine="Try";
try { //BA.debugLineNum = 36;BA.debugLine="Dim cursor As Cursor";
_cursor = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
 //BA.debugLineNum = 37;BA.debugLine="cursor = DB.database.ExecQuery(\"SELECT Username";
_cursor.setObject((android.database.Cursor)(mostCurrent._db._database.ExecQuery("SELECT Username FROM Users")));
 //BA.debugLineNum = 38;BA.debugLine="If cursor.RowCount > 0 Then";
if (_cursor.getRowCount()>0) { 
 //BA.debugLineNum = 39;BA.debugLine="Log(\"Super1\")";
anywheresoftware.b4a.keywords.Common.Log("Super1");
 };
 //BA.debugLineNum = 41;BA.debugLine="cursor.Close";
_cursor.Close();
 //BA.debugLineNum = 42;BA.debugLine="Dim cursor1 As Cursor";
_cursor1 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
 //BA.debugLineNum = 43;BA.debugLine="cursor1 = DB.database.ExecQuery(\"SELECT ID FROM";
_cursor1.setObject((android.database.Cursor)(mostCurrent._db._database.ExecQuery("SELECT ID FROM Bets")));
 //BA.debugLineNum = 44;BA.debugLine="If cursor1.RowCount > 0 Then";
if (_cursor1.getRowCount()>0) { 
 //BA.debugLineNum = 45;BA.debugLine="Log(\"Super2\")";
anywheresoftware.b4a.keywords.Common.Log("Super2");
 };
 //BA.debugLineNum = 47;BA.debugLine="cursor1.Close";
_cursor1.Close();
 } 
       catch (Exception e17) {
			processBA.setLastException(e17); //BA.debugLineNum = 49;BA.debugLine="DB.TablesCreate";
mostCurrent._db._tablescreate(mostCurrent.activityBA);
 //BA.debugLineNum = 50;BA.debugLine="DB.CreateAdmin";
mostCurrent._db._createadmin(mostCurrent.activityBA);
 //BA.debugLineNum = 51;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)));
 };
 };
 //BA.debugLineNum = 54;BA.debugLine="registerscreen.Initialize";
mostCurrent._registerscreen._initialize(mostCurrent.activityBA);
 //BA.debugLineNum = 55;BA.debugLine="loginscr.Initialize";
mostCurrent._loginscr._initialize(mostCurrent.activityBA);
 //BA.debugLineNum = 56;BA.debugLine="appmainscreen.Initialize";
mostCurrent._appmainscreen._initialize(mostCurrent.activityBA);
 //BA.debugLineNum = 57;BA.debugLine="Activity.AddView(registerscreen.AsView,0,0,100%x,";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._registerscreen._asview().getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
 //BA.debugLineNum = 58;BA.debugLine="Activity.AddView(loginscr.AsView,0,0,100%x,100%y)";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._loginscr._asview().getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
 //BA.debugLineNum = 59;BA.debugLine="loginscr.AsView.Visible = False";
mostCurrent._loginscr._asview().setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 60;BA.debugLine="Activity.AddView(appmainscreen.AsView,0,0,100%x,1";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._appmainscreen._asview().getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
 //BA.debugLineNum = 61;BA.debugLine="appmainscreen.AsView.Visible = False";
mostCurrent._appmainscreen._asview().setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
 //BA.debugLineNum = 76;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
 //BA.debugLineNum = 72;BA.debugLine="Sub Activity_Resume";
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return "";
}
public static String  _buildinterface() throws Exception{
 //BA.debugLineNum = 65;BA.debugLine="Public Sub BuildInterface";
 //BA.debugLineNum = 66;BA.debugLine="If IsFirstTime = True Then";
if (_isfirsttime==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 67;BA.debugLine="appmainscreen.Build_UI";
mostCurrent._appmainscreen._build_ui();
 //BA.debugLineNum = 68;BA.debugLine="IsFirstTime = False";
_isfirsttime = anywheresoftware.b4a.keywords.Common.False;
 };
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return "";
}
public static String  _buildpopupscreen() throws Exception{
 //BA.debugLineNum = 128;BA.debugLine="Public Sub BuildPopUpScreen";
 //BA.debugLineNum = 129;BA.debugLine="If bets_popup.IsInitialized = False Then";
if (mostCurrent._bets_popup.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 130;BA.debugLine="bets_popup.Initialize";
mostCurrent._bets_popup._initialize(mostCurrent.activityBA);
 //BA.debugLineNum = 131;BA.debugLine="Activity.AddView(bets_popup.background,0,0,100%x,";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._bets_popup._background.getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
 //BA.debugLineNum = 132;BA.debugLine="bets_popup.background.Visible = False";
mostCurrent._bets_popup._background.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
 //BA.debugLineNum = 134;BA.debugLine="End Sub";
return "";
}
public static String  _buildpromotebar() throws Exception{
 //BA.debugLineNum = 120;BA.debugLine="Public Sub BuildPromoteBar";
 //BA.debugLineNum = 121;BA.debugLine="If rankupdate.IsInitialized = False Then";
if (mostCurrent._rankupdate.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 122;BA.debugLine="rankupdate.Initialize";
mostCurrent._rankupdate._initialize(mostCurrent.activityBA);
 //BA.debugLineNum = 123;BA.debugLine="Activity.AddView(rankupdate.background,0,0,100%x";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._rankupdate._background.getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
 //BA.debugLineNum = 124;BA.debugLine="rankupdate.background.Visible = False";
mostCurrent._rankupdate._background.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
 //BA.debugLineNum = 126;BA.debugLine="End Sub";
return "";
}
public static String  _depositwithdrawmoney(double _money) throws Exception{
 //BA.debugLineNum = 100;BA.debugLine="Public Sub DepositWithdrawMoney(money As Double)";
 //BA.debugLineNum = 101;BA.debugLine="appmainscreen.accountbalance.Text = money";
mostCurrent._appmainscreen._accountbalance.setText(BA.ObjectToCharSequence(_money));
 //BA.debugLineNum = 102;BA.debugLine="End Sub";
return "";
}
public static b4a.VankoBet.login  _get_loginscrn() throws Exception{
 //BA.debugLineNum = 96;BA.debugLine="Public Sub Get_loginscrn As Login";
 //BA.debugLineNum = 97;BA.debugLine="Return loginscr";
if (true) return mostCurrent._loginscr;
 //BA.debugLineNum = 98;BA.debugLine="End Sub";
return null;
}
public static String  _globals() throws Exception{
 //BA.debugLineNum = 19;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 21;BA.debugLine="Dim registerscreen As Register";
mostCurrent._registerscreen = new b4a.VankoBet.register();
 //BA.debugLineNum = 22;BA.debugLine="Public loginscr As Login";
mostCurrent._loginscr = new b4a.VankoBet.login();
 //BA.debugLineNum = 23;BA.debugLine="Dim appmainscreen As appmaininterface";
mostCurrent._appmainscreen = new b4a.VankoBet.appmaininterface();
 //BA.debugLineNum = 24;BA.debugLine="Dim bets_popup As BetPopUp";
mostCurrent._bets_popup = new b4a.VankoBet.betpopup();
 //BA.debugLineNum = 25;BA.debugLine="Dim rankupdate As Promote";
mostCurrent._rankupdate = new b4a.VankoBet.promote();
 //BA.debugLineNum = 26;BA.debugLine="Dim slotgame1 As SlotGame";
mostCurrent._slotgame1 = new b4a.VankoBet.slotgame();
 //BA.debugLineNum = 27;BA.debugLine="Dim IsFirstTime As Boolean = True";
_isfirsttime = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return "";
}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main._process_globals();
types._process_globals();
starter._process_globals();
helperfunctions._process_globals();
db._process_globals();
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return "";
}
public static String  _showbetspopup() throws Exception{
 //BA.debugLineNum = 104;BA.debugLine="Public Sub ShowBetsPopUp";
 //BA.debugLineNum = 105;BA.debugLine="If bets_popup.background.Visible = False Then";
if (mostCurrent._bets_popup._background.getVisible()==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 106;BA.debugLine="bets_popup.background.Visible = True";
mostCurrent._bets_popup._background.setVisible(anywheresoftware.b4a.keywords.Common.True);
 }else {
 //BA.debugLineNum = 108;BA.debugLine="bets_popup.background.Visible = False";
mostCurrent._bets_popup._background.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
 //BA.debugLineNum = 110;BA.debugLine="End Sub";
return "";
}
public static String  _showhideloginscreen() throws Exception{
 //BA.debugLineNum = 80;BA.debugLine="Sub ShowHideLoginScreen";
 //BA.debugLineNum = 81;BA.debugLine="If 	loginscr.AsView.Visible = False Then";
if (mostCurrent._loginscr._asview().getVisible()==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 82;BA.debugLine="loginscr.AsView.Visible = True";
mostCurrent._loginscr._asview().setVisible(anywheresoftware.b4a.keywords.Common.True);
 }else {
 //BA.debugLineNum = 84;BA.debugLine="loginscr.AsView.Visible = False";
mostCurrent._loginscr._asview().setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return "";
}
public static String  _showhidemainui() throws Exception{
 //BA.debugLineNum = 88;BA.debugLine="Sub ShowHideMainUI";
 //BA.debugLineNum = 89;BA.debugLine="If appmainscreen.AsView.Visible = False Then";
if (mostCurrent._appmainscreen._asview().getVisible()==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 90;BA.debugLine="appmainscreen.AsView.Visible = True";
mostCurrent._appmainscreen._asview().setVisible(anywheresoftware.b4a.keywords.Common.True);
 }else {
 //BA.debugLineNum = 92;BA.debugLine="appmainscreen.AsView.Visible = False";
mostCurrent._appmainscreen._asview().setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return "";
}
public static String  _showhideslotgame() throws Exception{
 //BA.debugLineNum = 136;BA.debugLine="Public Sub ShowHideSlotGame";
 //BA.debugLineNum = 137;BA.debugLine="If slotgame1.IsInitialized = False Then";
if (mostCurrent._slotgame1.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 138;BA.debugLine="slotgame1.Initialize";
mostCurrent._slotgame1._initialize(mostCurrent.activityBA);
 //BA.debugLineNum = 139;BA.debugLine="Activity.AddView(slotgame1.pnlmain,20%x - 5dip,0%";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._slotgame1._pnlmain.getObject()),(int) (anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (20),mostCurrent.activityBA)-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (5))),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (0),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (82),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
 //BA.debugLineNum = 140;BA.debugLine="slotgame1.pnlmain.Visible = False";
mostCurrent._slotgame1._pnlmain.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
 //BA.debugLineNum = 143;BA.debugLine="If slotgame1.pnlmain.Visible = False Then";
if (mostCurrent._slotgame1._pnlmain.getVisible()==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 144;BA.debugLine="slotgame1.pnlmain.Visible = True";
mostCurrent._slotgame1._pnlmain.setVisible(anywheresoftware.b4a.keywords.Common.True);
 }else {
 //BA.debugLineNum = 146;BA.debugLine="slotgame1.pnlmain.Visible = False";
mostCurrent._slotgame1._pnlmain.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
 //BA.debugLineNum = 149;BA.debugLine="End Sub";
return "";
}
public static String  _showrankupdate() throws Exception{
 //BA.debugLineNum = 112;BA.debugLine="Public Sub ShowRankUpdate";
 //BA.debugLineNum = 113;BA.debugLine="If rankupdate.background.Visible = False Then";
if (mostCurrent._rankupdate._background.getVisible()==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 114;BA.debugLine="rankupdate.background.Visible = True";
mostCurrent._rankupdate._background.setVisible(anywheresoftware.b4a.keywords.Common.True);
 }else {
 //BA.debugLineNum = 116;BA.debugLine="rankupdate.background.Visible = False";
mostCurrent._rankupdate._background.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
 //BA.debugLineNum = 118;BA.debugLine="End Sub";
return "";
}
}
