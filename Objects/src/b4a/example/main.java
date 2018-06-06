package b4a.example;


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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.main");
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
		activityBA = new BA(this, layout, processBA, "b4a.example", "b4a.example.main");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.main", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
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



public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}
public static boolean isAnyActivityVisible() {
    boolean vis = false;
vis = vis | (main.mostCurrent != null);
return vis;}

private static BA killProgramHelper(BA ba) {
    if (ba == null)
        return null;
    anywheresoftware.b4a.BA.SharedProcessBA sharedProcessBA = ba.sharedProcessBA;
    if (sharedProcessBA == null || sharedProcessBA.activityBA == null)
        return null;
    return sharedProcessBA.activityBA.get();
}
public static void killProgram() {
     {
            Activity __a = null;
            if (main.previousOne != null) {
				__a = main.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(main.mostCurrent == null ? null : main.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

BA.applicationContext.stopService(new android.content.Intent(BA.applicationContext, starter.class));
}
public anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.sql.SQL _database = null;
public static anywheresoftware.b4a.sql.SQL _database1 = null;
public static b4a.example.types._user _currentuser = null;
public static b4a.example.types._masteradmin _admin = null;
public b4a.example.register _registerscreen = null;
public b4a.example.login _gotologinscr = null;
public b4a.example.appmaininterface _appmainscreen = null;
public b4a.example.admininterface _admininterface1 = null;
public b4a.example.login _loginscr = null;
public b4a.example.betpopup _bets_popup = null;
public b4a.example.promote _rankupdate = null;
public b4a.example.slotgame _slotgame1 = null;
public b4a.example.helperfunctions _helperfunctions = null;
public b4a.example.types _types = null;
public b4a.example.starter _starter = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime});
anywheresoftware.b4a.sql.SQL.CursorWrapper _cursor = null;
RDebugUtils.currentLine=131072;
 //BA.debugLineNum = 131072;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=131074;
 //BA.debugLineNum = 131074;BA.debugLine="registerscreen.Initialize";
mostCurrent._registerscreen._initialize(null,mostCurrent.activityBA);
RDebugUtils.currentLine=131075;
 //BA.debugLineNum = 131075;BA.debugLine="gotologinscr.Initialize";
mostCurrent._gotologinscr._initialize(null,mostCurrent.activityBA);
RDebugUtils.currentLine=131076;
 //BA.debugLineNum = 131076;BA.debugLine="admin.Initialize";
_admin.Initialize();
RDebugUtils.currentLine=131077;
 //BA.debugLineNum = 131077;BA.debugLine="currentuser.Initialize";
_currentuser.Initialize();
RDebugUtils.currentLine=131078;
 //BA.debugLineNum = 131078;BA.debugLine="appmainscreen.Initialize";
mostCurrent._appmainscreen._initialize(null,mostCurrent.activityBA);
RDebugUtils.currentLine=131080;
 //BA.debugLineNum = 131080;BA.debugLine="DATABASEinit";
_databaseinit();
RDebugUtils.currentLine=131081;
 //BA.debugLineNum = 131081;BA.debugLine="If File.Exists(File.DirDefaultExternal,\"userdatab";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),"userdatabase.db")) { 
RDebugUtils.currentLine=131082;
 //BA.debugLineNum = 131082;BA.debugLine="Try";
try {RDebugUtils.currentLine=131083;
 //BA.debugLineNum = 131083;BA.debugLine="Dim cursor As Cursor";
_cursor = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=131084;
 //BA.debugLineNum = 131084;BA.debugLine="cursor = database.ExecQuery(\"SELECT Username FR";
_cursor.setObject((android.database.Cursor)(_database.ExecQuery("SELECT Username FROM Users")));
RDebugUtils.currentLine=131085;
 //BA.debugLineNum = 131085;BA.debugLine="If cursor.RowCount > 0 Then";
if (_cursor.getRowCount()>0) { 
RDebugUtils.currentLine=131086;
 //BA.debugLineNum = 131086;BA.debugLine="Log(\"Super\")";
anywheresoftware.b4a.keywords.Common.Log("Super");
 };
 } 
       catch (Exception e15) {
			processBA.setLastException(e15);RDebugUtils.currentLine=131089;
 //BA.debugLineNum = 131089;BA.debugLine="TablesCreate";
_tablescreate();
RDebugUtils.currentLine=131090;
 //BA.debugLineNum = 131090;BA.debugLine="CreateAdmin";
_createadmin();
RDebugUtils.currentLine=131091;
 //BA.debugLineNum = 131091;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)));
 };
 };
RDebugUtils.currentLine=131094;
 //BA.debugLineNum = 131094;BA.debugLine="cursor.Close";
_cursor.Close();
RDebugUtils.currentLine=131095;
 //BA.debugLineNum = 131095;BA.debugLine="Activity.AddView(registerscreen.AsView,0,0,100%x,";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._registerscreen._asview(null).getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
RDebugUtils.currentLine=131096;
 //BA.debugLineNum = 131096;BA.debugLine="Activity.AddView(gotologinscr.AsView,0,0,100%x,10";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._gotologinscr._asview(null).getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
RDebugUtils.currentLine=131097;
 //BA.debugLineNum = 131097;BA.debugLine="Activity.AddView(appmainscreen.AsView,0,0,100%x,1";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._appmainscreen._asview(null).getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
RDebugUtils.currentLine=131098;
 //BA.debugLineNum = 131098;BA.debugLine="gotologinscr.AsView.Visible = False";
mostCurrent._gotologinscr._asview(null).setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=131099;
 //BA.debugLineNum = 131099;BA.debugLine="appmainscreen.AsView.Visible = False";
mostCurrent._appmainscreen._asview(null).setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=131101;
 //BA.debugLineNum = 131101;BA.debugLine="End Sub";
return "";
}
public static String  _databaseinit() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "databaseinit"))
	return (String) Debug.delegate(mostCurrent.activityBA, "databaseinit", null);
RDebugUtils.currentLine=458752;
 //BA.debugLineNum = 458752;BA.debugLine="Sub DATABASEinit";
RDebugUtils.currentLine=458753;
 //BA.debugLineNum = 458753;BA.debugLine="database.Initialize(File.DirDefaultExternal,\"user";
_database.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),"userdatabase.db",anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=458754;
 //BA.debugLineNum = 458754;BA.debugLine="database1.Initialize(File.DirDefaultExternal,\"bet";
_database1.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),"bets_database.db",anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=458755;
 //BA.debugLineNum = 458755;BA.debugLine="End Sub";
return "";
}
public static String  _tablescreate() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "tablescreate"))
	return (String) Debug.delegate(mostCurrent.activityBA, "tablescreate", null);
RDebugUtils.currentLine=524288;
 //BA.debugLineNum = 524288;BA.debugLine="Sub TablesCreate";
RDebugUtils.currentLine=524289;
 //BA.debugLineNum = 524289;BA.debugLine="database.ExecNonQuery(\"CREATE TABLE Users (Userna";
_database.ExecNonQuery("CREATE TABLE Users (Username TEXT,Password TEXT,Money DOUBLE,Rank TEXT,TypeOfUser INTEGER)");
RDebugUtils.currentLine=524290;
 //BA.debugLineNum = 524290;BA.debugLine="database1.ExecNonQuery(\"CREATE TABLE Bets (ID INT";
_database1.ExecNonQuery("CREATE TABLE Bets (ID INTEGER PRIMARY KEY AUTOINCREMENT,TeamA TEXT,TeamAcoef TEXT,TeamB TEXT,TeamBcoef TEXT,MatchInfo TEXT)");
RDebugUtils.currentLine=524291;
 //BA.debugLineNum = 524291;BA.debugLine="End Sub";
return "";
}
public static String  _createadmin() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createadmin"))
	return (String) Debug.delegate(mostCurrent.activityBA, "createadmin", null);
RDebugUtils.currentLine=393216;
 //BA.debugLineNum = 393216;BA.debugLine="Sub CreateAdmin";
RDebugUtils.currentLine=393217;
 //BA.debugLineNum = 393217;BA.debugLine="database.ExecNonQuery(\"INSERT INTO Users (Usernam";
_database.ExecNonQuery("INSERT INTO Users (Username,Password,Money,Rank) VALUES ('admin','admin','0.00','Admin')");
RDebugUtils.currentLine=393218;
 //BA.debugLineNum = 393218;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="main";
RDebugUtils.currentLine=262144;
 //BA.debugLineNum = 262144;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=262146;
 //BA.debugLineNum = 262146;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null);
RDebugUtils.currentLine=196608;
 //BA.debugLineNum = 196608;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=196610;
 //BA.debugLineNum = 196610;BA.debugLine="End Sub";
return "";
}
public static String  _buildadmininterface() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buildadmininterface"))
	return (String) Debug.delegate(mostCurrent.activityBA, "buildadmininterface", null);
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Public Sub BuildAdminInterface";
RDebugUtils.currentLine=851969;
 //BA.debugLineNum = 851969;BA.debugLine="admininterface1.Initialize";
mostCurrent._admininterface1._initialize(null,mostCurrent.activityBA);
RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="Activity.AddView(admininterface1.pnlmainscreen,0,";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._admininterface1._pnlmainscreen.getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
RDebugUtils.currentLine=851971;
 //BA.debugLineNum = 851971;BA.debugLine="End Sub";
return "";
}
public static String  _buildpopupscreen() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buildpopupscreen"))
	return (String) Debug.delegate(mostCurrent.activityBA, "buildpopupscreen", null);
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Public Sub BuildPopUpScreen";
RDebugUtils.currentLine=1245185;
 //BA.debugLineNum = 1245185;BA.debugLine="If bets_popup.IsInitialized = False Then";
if (mostCurrent._bets_popup.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="bets_popup.Initialize";
mostCurrent._bets_popup._initialize(null,mostCurrent.activityBA);
RDebugUtils.currentLine=1245187;
 //BA.debugLineNum = 1245187;BA.debugLine="Activity.AddView(bets_popup.background,0,0,100%x,";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._bets_popup._background.getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
RDebugUtils.currentLine=1245188;
 //BA.debugLineNum = 1245188;BA.debugLine="bets_popup.background.Visible = False";
mostCurrent._bets_popup._background.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=1245190;
 //BA.debugLineNum = 1245190;BA.debugLine="End Sub";
return "";
}
public static String  _buildpromotebar() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buildpromotebar"))
	return (String) Debug.delegate(mostCurrent.activityBA, "buildpromotebar", null);
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Public Sub BuildPromoteBar";
RDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="If rankupdate.IsInitialized = False Then";
if (mostCurrent._rankupdate.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="rankupdate.Initialize";
mostCurrent._rankupdate._initialize(null,mostCurrent.activityBA);
RDebugUtils.currentLine=1179651;
 //BA.debugLineNum = 1179651;BA.debugLine="Activity.AddView(rankupdate.background,0,0,100%x";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._rankupdate._background.getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
RDebugUtils.currentLine=1179652;
 //BA.debugLineNum = 1179652;BA.debugLine="rankupdate.background.Visible = False";
mostCurrent._rankupdate._background.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=1179654;
 //BA.debugLineNum = 1179654;BA.debugLine="End Sub";
return "";
}
public static String  _databaseaddinfo(String _username,String _password) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "databaseaddinfo"))
	return (String) Debug.delegate(mostCurrent.activityBA, "databaseaddinfo", new Object[] {_username,_password});
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Sub DataBaseAddInfo(username As String,password As";
RDebugUtils.currentLine=589825;
 //BA.debugLineNum = 589825;BA.debugLine="database.ExecNonQuery(\"INSERT INTO Users (Usernam";
_database.ExecNonQuery("INSERT INTO Users (Username,Password,Money,Rank) VALUES ('"+_username+"','"+_password+"','0.00','user')");
RDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="End Sub";
return "";
}
public static String  _depositwithdrawmoney(double _money) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "depositwithdrawmoney"))
	return (String) Debug.delegate(mostCurrent.activityBA, "depositwithdrawmoney", new Object[] {_money});
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Public Sub DepositWithdrawMoney(money As Double)";
RDebugUtils.currentLine=983041;
 //BA.debugLineNum = 983041;BA.debugLine="appmainscreen.accountbalance.Text = money";
mostCurrent._appmainscreen._accountbalance.setText(BA.ObjectToCharSequence(_money));
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="End Sub";
return "";
}
public static b4a.example.login  _get_loginscrn() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "get_loginscrn"))
	return (b4a.example.login) Debug.delegate(mostCurrent.activityBA, "get_loginscrn", null);
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Public Sub Get_loginscrn As login";
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="Return loginscr";
if (true) return mostCurrent._loginscr;
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="End Sub";
return null;
}
public static String  _logintoadminapp() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "logintoadminapp"))
	return (String) Debug.delegate(mostCurrent.activityBA, "logintoadminapp", null);
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Public Sub LoginToAdminApp";
RDebugUtils.currentLine=786433;
 //BA.debugLineNum = 786433;BA.debugLine="gotologinscr.pnlmainscreen.Visible = False";
mostCurrent._gotologinscr._pnlmainscreen.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="admininterface1.pnlmainscreen.Visible = True";
mostCurrent._admininterface1._pnlmainscreen.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=786435;
 //BA.debugLineNum = 786435;BA.debugLine="End Sub";
return "";
}
public static String  _logoutadminui() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "logoutadminui"))
	return (String) Debug.delegate(mostCurrent.activityBA, "logoutadminui", null);
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Sub LogOUTadminUI";
RDebugUtils.currentLine=655361;
 //BA.debugLineNum = 655361;BA.debugLine="admininterface1.pnlmainscreen.Visible = False";
mostCurrent._admininterface1._pnlmainscreen.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="gotologinscr.pnlmainscreen.Visible = True";
mostCurrent._gotologinscr._pnlmainscreen.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=655363;
 //BA.debugLineNum = 655363;BA.debugLine="End Sub";
return "";
}
public static String  _showbetspopup() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "showbetspopup"))
	return (String) Debug.delegate(mostCurrent.activityBA, "showbetspopup", null);
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Public Sub ShowBetsPopUp";
RDebugUtils.currentLine=1048577;
 //BA.debugLineNum = 1048577;BA.debugLine="If bets_popup.background.Visible = False Then";
if (mostCurrent._bets_popup._background.getVisible()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="bets_popup.background.Visible = True";
mostCurrent._bets_popup._background.setVisible(anywheresoftware.b4a.keywords.Common.True);
 }else {
RDebugUtils.currentLine=1048580;
 //BA.debugLineNum = 1048580;BA.debugLine="bets_popup.background.Visible = False";
mostCurrent._bets_popup._background.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=1048582;
 //BA.debugLineNum = 1048582;BA.debugLine="End Sub";
return "";
}
public static String  _showhideloginscreen() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "showhideloginscreen"))
	return (String) Debug.delegate(mostCurrent.activityBA, "showhideloginscreen", null);
RDebugUtils.currentLine=327680;
 //BA.debugLineNum = 327680;BA.debugLine="Sub ShowHideLoginScreen";
RDebugUtils.currentLine=327681;
 //BA.debugLineNum = 327681;BA.debugLine="If 	gotologinscr.AsView.Visible = False Then";
if (mostCurrent._gotologinscr._asview(null).getVisible()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=327682;
 //BA.debugLineNum = 327682;BA.debugLine="gotologinscr.AsView.Visible = True";
mostCurrent._gotologinscr._asview(null).setVisible(anywheresoftware.b4a.keywords.Common.True);
 }else {
RDebugUtils.currentLine=327686;
 //BA.debugLineNum = 327686;BA.debugLine="gotologinscr.AsView.Visible = False";
mostCurrent._gotologinscr._asview(null).setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=327688;
 //BA.debugLineNum = 327688;BA.debugLine="End Sub";
return "";
}
public static String  _showhidemainui() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "showhidemainui"))
	return (String) Debug.delegate(mostCurrent.activityBA, "showhidemainui", null);
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Sub ShowHideMainUI";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="If appmainscreen.AsView.Visible = False Then";
if (mostCurrent._appmainscreen._asview(null).getVisible()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="appmainscreen.AsView.Visible = True";
mostCurrent._appmainscreen._asview(null).setVisible(anywheresoftware.b4a.keywords.Common.True);
 }else {
RDebugUtils.currentLine=720900;
 //BA.debugLineNum = 720900;BA.debugLine="appmainscreen.AsView.Visible = False";
mostCurrent._appmainscreen._asview(null).setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=720902;
 //BA.debugLineNum = 720902;BA.debugLine="End Sub";
return "";
}
public static String  _showhideslotgame() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "showhideslotgame"))
	return (String) Debug.delegate(mostCurrent.activityBA, "showhideslotgame", null);
RDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Public Sub ShowHideSlotGame";
RDebugUtils.currentLine=1310721;
 //BA.debugLineNum = 1310721;BA.debugLine="If slotgame1.IsInitialized = False Then";
if (mostCurrent._slotgame1.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=1310722;
 //BA.debugLineNum = 1310722;BA.debugLine="slotgame1.Initialize";
mostCurrent._slotgame1._initialize(null,mostCurrent.activityBA);
RDebugUtils.currentLine=1310723;
 //BA.debugLineNum = 1310723;BA.debugLine="Activity.AddView(slotgame1.pnlmain,20%x - 5dip,0%";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._slotgame1._pnlmain.getObject()),(int) (anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (20),mostCurrent.activityBA)-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (5))),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (0),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (82),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
RDebugUtils.currentLine=1310724;
 //BA.debugLineNum = 1310724;BA.debugLine="slotgame1.pnlmain.Visible = False";
mostCurrent._slotgame1._pnlmain.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=1310727;
 //BA.debugLineNum = 1310727;BA.debugLine="If slotgame1.pnlmain.Visible = False Then";
if (mostCurrent._slotgame1._pnlmain.getVisible()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=1310728;
 //BA.debugLineNum = 1310728;BA.debugLine="slotgame1.pnlmain.Visible = True";
mostCurrent._slotgame1._pnlmain.setVisible(anywheresoftware.b4a.keywords.Common.True);
 }else {
RDebugUtils.currentLine=1310730;
 //BA.debugLineNum = 1310730;BA.debugLine="slotgame1.pnlmain.Visible = False";
mostCurrent._slotgame1._pnlmain.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=1310733;
 //BA.debugLineNum = 1310733;BA.debugLine="End Sub";
return "";
}
public static String  _showrankupdate() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "showrankupdate"))
	return (String) Debug.delegate(mostCurrent.activityBA, "showrankupdate", null);
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Public Sub ShowRankUpdate";
RDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="If rankupdate.background.Visible = False Then";
if (mostCurrent._rankupdate._background.getVisible()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="rankupdate.background.Visible = True";
mostCurrent._rankupdate._background.setVisible(anywheresoftware.b4a.keywords.Common.True);
 }else {
RDebugUtils.currentLine=1114116;
 //BA.debugLineNum = 1114116;BA.debugLine="rankupdate.background.Visible = False";
mostCurrent._rankupdate._background.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=1114118;
 //BA.debugLineNum = 1114118;BA.debugLine="End Sub";
return "";
}
}