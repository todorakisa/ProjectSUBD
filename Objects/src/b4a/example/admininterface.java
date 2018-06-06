package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class admininterface extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.admininterface");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.admininterface.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlmainscreen = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlleftmenu = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnluppermenu = null;
public anywheresoftware.b4a.objects.ButtonWrapper _avataricon = null;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _avatarimg = null;
public anywheresoftware.b4a.objects.LabelWrapper _accountname = null;
public anywheresoftware.b4a.objects.LabelWrapper _accountrank = null;
public anywheresoftware.b4a.objects.LabelWrapper _accountbalance = null;
public b4a.example.adminactions _actionsforadmin = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btn_logout = null;
public anywheresoftware.b4a.objects.ButtonWrapper _promote = null;
public b4a.example.main _main = null;
public b4a.example.helperfunctions _helperfunctions = null;
public b4a.example.types _types = null;
public b4a.example.starter _starter = null;
public String  _initialize(b4a.example.admininterface __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="admininterface";
if (Debug.shouldDelegate(ba, "initialize"))
	return (String) Debug.delegate(ba, "initialize", new Object[] {_ba});
RDebugUtils.currentLine=5046272;
 //BA.debugLineNum = 5046272;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=5046274;
 //BA.debugLineNum = 5046274;BA.debugLine="pnlmainscreen.Initialize(\"mainscreen\")";
__ref._pnlmainscreen.Initialize(ba,"mainscreen");
RDebugUtils.currentLine=5046275;
 //BA.debugLineNum = 5046275;BA.debugLine="pnlleftmenu.Initialize(\"leftmenu\")";
__ref._pnlleftmenu.Initialize(ba,"leftmenu");
RDebugUtils.currentLine=5046278;
 //BA.debugLineNum = 5046278;BA.debugLine="avataricon.Initialize(\"avatar\")";
__ref._avataricon.Initialize(ba,"avatar");
RDebugUtils.currentLine=5046279;
 //BA.debugLineNum = 5046279;BA.debugLine="accountname.Initialize(\"username\")";
__ref._accountname.Initialize(ba,"username");
RDebugUtils.currentLine=5046280;
 //BA.debugLineNum = 5046280;BA.debugLine="accountrank.Initialize(\"rank\")";
__ref._accountrank.Initialize(ba,"rank");
RDebugUtils.currentLine=5046281;
 //BA.debugLineNum = 5046281;BA.debugLine="accountbalance.Initialize(\"money\")";
__ref._accountbalance.Initialize(ba,"money");
RDebugUtils.currentLine=5046283;
 //BA.debugLineNum = 5046283;BA.debugLine="actionsforadmin.Initialize";
__ref._actionsforadmin._initialize(null,ba);
RDebugUtils.currentLine=5046285;
 //BA.debugLineNum = 5046285;BA.debugLine="btn_logout.Initialize(\"logout\")";
__ref._btn_logout.Initialize(ba,"logout");
RDebugUtils.currentLine=5046287;
 //BA.debugLineNum = 5046287;BA.debugLine="promote.Initialize(\"promote1\")";
__ref._promote.Initialize(ba,"promote1");
RDebugUtils.currentLine=5046288;
 //BA.debugLineNum = 5046288;BA.debugLine="Build_UI";
__ref._build_ui(null);
RDebugUtils.currentLine=5046290;
 //BA.debugLineNum = 5046290;BA.debugLine="End Sub";
return "";
}
public String  _accountmoney(b4a.example.admininterface __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="admininterface";
if (Debug.shouldDelegate(ba, "accountmoney"))
	return (String) Debug.delegate(ba, "accountmoney", null);
RDebugUtils.currentLine=5308416;
 //BA.debugLineNum = 5308416;BA.debugLine="Sub AccountMoney";
RDebugUtils.currentLine=5308417;
 //BA.debugLineNum = 5308417;BA.debugLine="accountbalance.Text = \"Earned funds:\" & CRLF & Ma";
__ref._accountbalance.setText(BA.ObjectToCharSequence("Earned funds:"+__c.CRLF+BA.NumberToString(_main._admin.funds)));
RDebugUtils.currentLine=5308418;
 //BA.debugLineNum = 5308418;BA.debugLine="End Sub";
return "";
}
public String  _build_ui(b4a.example.admininterface __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="admininterface";
if (Debug.shouldDelegate(ba, "build_ui"))
	return (String) Debug.delegate(ba, "build_ui", null);
RDebugUtils.currentLine=5111808;
 //BA.debugLineNum = 5111808;BA.debugLine="Sub Build_UI";
RDebugUtils.currentLine=5111809;
 //BA.debugLineNum = 5111809;BA.debugLine="pnlmainscreen.Color = Colors.RGB(24, 96, 178)";
__ref._pnlmainscreen.setColor(__c.Colors.RGB((int) (24),(int) (96),(int) (178)));
RDebugUtils.currentLine=5111810;
 //BA.debugLineNum = 5111810;BA.debugLine="pnlmainscreen.AddView(pnlleftmenu,0,0,20%x,100%y)";
__ref._pnlmainscreen.AddView((android.view.View)(__ref._pnlleftmenu.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (100),ba));
RDebugUtils.currentLine=5111812;
 //BA.debugLineNum = 5111812;BA.debugLine="pnlleftmenu.Color = Colors.RGB(255, 108, 0)";
__ref._pnlleftmenu.setColor(__c.Colors.RGB((int) (255),(int) (108),(int) (0)));
RDebugUtils.currentLine=5111814;
 //BA.debugLineNum = 5111814;BA.debugLine="pnlleftmenu.AddView(avataricon,0,0,20%x,25%y)";
__ref._pnlleftmenu.AddView((android.view.View)(__ref._avataricon.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (25),ba));
RDebugUtils.currentLine=5111815;
 //BA.debugLineNum = 5111815;BA.debugLine="avataricon.SetBackgroundImage(avatarimg)";
__ref._avataricon.SetBackgroundImageNew((android.graphics.Bitmap)(__ref._avatarimg.getObject()));
RDebugUtils.currentLine=5111817;
 //BA.debugLineNum = 5111817;BA.debugLine="pnlleftmenu.AddView(accountname,2%x,25%y,20%x,10%";
__ref._pnlleftmenu.AddView((android.view.View)(__ref._accountname.getObject()),__c.PerXToCurrent((float) (2),ba),__c.PerYToCurrent((float) (25),ba),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=5111818;
 //BA.debugLineNum = 5111818;BA.debugLine="accountname.Text = Main.admin.name";
__ref._accountname.setText(BA.ObjectToCharSequence(_main._admin.name));
RDebugUtils.currentLine=5111819;
 //BA.debugLineNum = 5111819;BA.debugLine="accountname.TextSize = 40";
__ref._accountname.setTextSize((float) (40));
RDebugUtils.currentLine=5111820;
 //BA.debugLineNum = 5111820;BA.debugLine="accountname.TextColor = Colors.Black";
__ref._accountname.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=5111822;
 //BA.debugLineNum = 5111822;BA.debugLine="pnlleftmenu.AddView(accountrank,2%x,35%y,20%x,10%";
__ref._pnlleftmenu.AddView((android.view.View)(__ref._accountrank.getObject()),__c.PerXToCurrent((float) (2),ba),__c.PerYToCurrent((float) (35),ba),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=5111823;
 //BA.debugLineNum = 5111823;BA.debugLine="accountrank.Text = \"Rank:\" & \" \" & Main.admin.ran";
__ref._accountrank.setText(BA.ObjectToCharSequence("Rank:"+" "+_main._admin.rank));
RDebugUtils.currentLine=5111824;
 //BA.debugLineNum = 5111824;BA.debugLine="accountrank.TextSize = 25";
__ref._accountrank.setTextSize((float) (25));
RDebugUtils.currentLine=5111825;
 //BA.debugLineNum = 5111825;BA.debugLine="accountrank.TextColor = Colors.Black";
__ref._accountrank.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=5111827;
 //BA.debugLineNum = 5111827;BA.debugLine="pnlleftmenu.AddView(accountbalance,2%x,45%y,20%x,";
__ref._pnlleftmenu.AddView((android.view.View)(__ref._accountbalance.getObject()),__c.PerXToCurrent((float) (2),ba),__c.PerYToCurrent((float) (45),ba),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (15),ba));
RDebugUtils.currentLine=5111828;
 //BA.debugLineNum = 5111828;BA.debugLine="accountbalance.TextSize = 25";
__ref._accountbalance.setTextSize((float) (25));
RDebugUtils.currentLine=5111829;
 //BA.debugLineNum = 5111829;BA.debugLine="accountbalance.Text = \"Funds:\" & Main.admin.funds";
__ref._accountbalance.setText(BA.ObjectToCharSequence("Funds:"+BA.NumberToString(_main._admin.funds)));
RDebugUtils.currentLine=5111830;
 //BA.debugLineNum = 5111830;BA.debugLine="accountbalance.TextColor = Colors.Black";
__ref._accountbalance.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=5111832;
 //BA.debugLineNum = 5111832;BA.debugLine="pnlleftmenu.AddView(btn_logout,1%x,55%y,18%x,10%y";
__ref._pnlleftmenu.AddView((android.view.View)(__ref._btn_logout.getObject()),__c.PerXToCurrent((float) (1),ba),__c.PerYToCurrent((float) (55),ba),__c.PerXToCurrent((float) (18),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=5111833;
 //BA.debugLineNum = 5111833;BA.debugLine="btn_logout.Color = Colors.ARGB(100,0,0,0)";
__ref._btn_logout.setColor(__c.Colors.ARGB((int) (100),(int) (0),(int) (0),(int) (0)));
RDebugUtils.currentLine=5111834;
 //BA.debugLineNum = 5111834;BA.debugLine="btn_logout.Text = \"Log out\"";
__ref._btn_logout.setText(BA.ObjectToCharSequence("Log out"));
RDebugUtils.currentLine=5111835;
 //BA.debugLineNum = 5111835;BA.debugLine="btn_logout.TextColor = Colors.White";
__ref._btn_logout.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=5111837;
 //BA.debugLineNum = 5111837;BA.debugLine="pnlleftmenu.AddView(promote,1%x,65%y,18%x,10%y)";
__ref._pnlleftmenu.AddView((android.view.View)(__ref._promote.getObject()),__c.PerXToCurrent((float) (1),ba),__c.PerYToCurrent((float) (65),ba),__c.PerXToCurrent((float) (18),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=5111838;
 //BA.debugLineNum = 5111838;BA.debugLine="promote.Color = Colors.ARGB(100,0,0,0)";
__ref._promote.setColor(__c.Colors.ARGB((int) (100),(int) (0),(int) (0),(int) (0)));
RDebugUtils.currentLine=5111839;
 //BA.debugLineNum = 5111839;BA.debugLine="promote.Text = \"Promote\"";
__ref._promote.setText(BA.ObjectToCharSequence("Promote"));
RDebugUtils.currentLine=5111841;
 //BA.debugLineNum = 5111841;BA.debugLine="pnlmainscreen.AddView(actionsforadmin.TabhostActi";
__ref._pnlmainscreen.AddView((android.view.View)(__ref._actionsforadmin._tabhostactions.getObject()),(int) (__c.PerXToCurrent((float) (20),ba)-__c.DipToCurrent((int) (5))),(int) (__c.PerYToCurrent((float) (0),ba)-__c.DipToCurrent((int) (5))),__c.PerXToCurrent((float) (82),ba),(int) (__c.PerYToCurrent((float) (100),ba)+__c.DipToCurrent((int) (10))));
RDebugUtils.currentLine=5111843;
 //BA.debugLineNum = 5111843;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.admininterface __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="admininterface";
RDebugUtils.currentLine=4980736;
 //BA.debugLineNum = 4980736;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=4980737;
 //BA.debugLineNum = 4980737;BA.debugLine="Dim pnlmainscreen As Panel";
_pnlmainscreen = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=4980738;
 //BA.debugLineNum = 4980738;BA.debugLine="Dim pnlleftmenu As Panel";
_pnlleftmenu = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=4980739;
 //BA.debugLineNum = 4980739;BA.debugLine="Dim pnluppermenu As Panel";
_pnluppermenu = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=4980741;
 //BA.debugLineNum = 4980741;BA.debugLine="Dim avataricon As Button";
_avataricon = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=4980742;
 //BA.debugLineNum = 4980742;BA.debugLine="Dim avatarimg As Bitmap = LoadBitmapSample(File.D";
_avatarimg = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
_avatarimg = __c.LoadBitmapSample(__c.File.getDirAssets(),"avatar2.png",__c.DipToCurrent((int) (215)),__c.DipToCurrent((int) (215)));
RDebugUtils.currentLine=4980743;
 //BA.debugLineNum = 4980743;BA.debugLine="Dim accountname As Label";
_accountname = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=4980744;
 //BA.debugLineNum = 4980744;BA.debugLine="Dim accountrank As Label";
_accountrank = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=4980745;
 //BA.debugLineNum = 4980745;BA.debugLine="Dim accountbalance As Label";
_accountbalance = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=4980747;
 //BA.debugLineNum = 4980747;BA.debugLine="Dim actionsforadmin As AdminActions";
_actionsforadmin = new b4a.example.adminactions();
RDebugUtils.currentLine=4980749;
 //BA.debugLineNum = 4980749;BA.debugLine="Dim btn_logout As Button";
_btn_logout = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=4980751;
 //BA.debugLineNum = 4980751;BA.debugLine="Dim promote As Button";
_promote = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=4980753;
 //BA.debugLineNum = 4980753;BA.debugLine="End Sub";
return "";
}
public String  _logout_click(b4a.example.admininterface __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="admininterface";
if (Debug.shouldDelegate(ba, "logout_click"))
	return (String) Debug.delegate(ba, "logout_click", null);
RDebugUtils.currentLine=5242880;
 //BA.debugLineNum = 5242880;BA.debugLine="Sub logout_Click";
RDebugUtils.currentLine=5242881;
 //BA.debugLineNum = 5242881;BA.debugLine="CallSub(Main,\"LogOUTadminUI\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"LogOUTadminUI");
RDebugUtils.currentLine=5242882;
 //BA.debugLineNum = 5242882;BA.debugLine="End Sub";
return "";
}
public String  _promote1_click(b4a.example.admininterface __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="admininterface";
if (Debug.shouldDelegate(ba, "promote1_click"))
	return (String) Debug.delegate(ba, "promote1_click", null);
RDebugUtils.currentLine=5177344;
 //BA.debugLineNum = 5177344;BA.debugLine="Sub promote1_Click";
RDebugUtils.currentLine=5177345;
 //BA.debugLineNum = 5177345;BA.debugLine="CallSub(Main,\"BuildPromoteBar\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"BuildPromoteBar");
RDebugUtils.currentLine=5177346;
 //BA.debugLineNum = 5177346;BA.debugLine="CallSub(Main,\"ShowRankUpdate\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"ShowRankUpdate");
RDebugUtils.currentLine=5177347;
 //BA.debugLineNum = 5177347;BA.debugLine="End Sub";
return "";
}
}