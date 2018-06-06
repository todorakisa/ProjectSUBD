package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class appmaininterface extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.appmaininterface");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.appmaininterface.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.ButtonWrapper _avataricon = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btn_logout = null;
public anywheresoftware.b4a.objects.ButtonWrapper _slotmachine = null;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _avatarimg = null;
public anywheresoftware.b4a.objects.LabelWrapper _accountname = null;
public anywheresoftware.b4a.objects.LabelWrapper _accountbalance = null;
public anywheresoftware.b4a.objects.LabelWrapper _accountrank = null;
public anywheresoftware.b4a.objects.LabelWrapper _showbalance = null;
public anywheresoftware.b4a.objects.LabelWrapper _showrank = null;
public b4a.example.useractions _actionsforuser = null;
public b4a.example.adminactions _actionsforadmin = null;
public b4a.example.main _main = null;
public b4a.example.helperfunctions _helperfunctions = null;
public b4a.example.types _types = null;
public b4a.example.starter _starter = null;
public String  _initialize(b4a.example.appmaininterface __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="appmaininterface";
if (Debug.shouldDelegate(ba, "initialize"))
	return (String) Debug.delegate(ba, "initialize", new Object[] {_ba});
RDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="pnlmainscreen.Initialize(\"mainscreen\")";
__ref._pnlmainscreen.Initialize(ba,"mainscreen");
RDebugUtils.currentLine=1441795;
 //BA.debugLineNum = 1441795;BA.debugLine="pnlleftmenu.Initialize(\"leftmenu\")";
__ref._pnlleftmenu.Initialize(ba,"leftmenu");
RDebugUtils.currentLine=1441798;
 //BA.debugLineNum = 1441798;BA.debugLine="avataricon.Initialize(\"\")";
__ref._avataricon.Initialize(ba,"");
RDebugUtils.currentLine=1441799;
 //BA.debugLineNum = 1441799;BA.debugLine="accountname.Initialize(\"\")";
__ref._accountname.Initialize(ba,"");
RDebugUtils.currentLine=1441800;
 //BA.debugLineNum = 1441800;BA.debugLine="accountrank.Initialize(\"\")";
__ref._accountrank.Initialize(ba,"");
RDebugUtils.currentLine=1441801;
 //BA.debugLineNum = 1441801;BA.debugLine="accountbalance.Initialize(\"\")";
__ref._accountbalance.Initialize(ba,"");
RDebugUtils.currentLine=1441802;
 //BA.debugLineNum = 1441802;BA.debugLine="showbalance.Initialize(\"\")";
__ref._showbalance.Initialize(ba,"");
RDebugUtils.currentLine=1441803;
 //BA.debugLineNum = 1441803;BA.debugLine="showrank.Initialize(\"\")";
__ref._showrank.Initialize(ba,"");
RDebugUtils.currentLine=1441805;
 //BA.debugLineNum = 1441805;BA.debugLine="actionsforuser.Initialize";
__ref._actionsforuser._initialize(null,ba);
RDebugUtils.currentLine=1441806;
 //BA.debugLineNum = 1441806;BA.debugLine="actionsforadmin.Initialize";
__ref._actionsforadmin._initialize(null,ba);
RDebugUtils.currentLine=1441808;
 //BA.debugLineNum = 1441808;BA.debugLine="btn_logout.Initialize(\"logout\")";
__ref._btn_logout.Initialize(ba,"logout");
RDebugUtils.currentLine=1441809;
 //BA.debugLineNum = 1441809;BA.debugLine="slotmachine.Initialize(\"slotz\")";
__ref._slotmachine.Initialize(ba,"slotz");
RDebugUtils.currentLine=1441811;
 //BA.debugLineNum = 1441811;BA.debugLine="Build_UI";
__ref._build_ui(null);
RDebugUtils.currentLine=1441813;
 //BA.debugLineNum = 1441813;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.ConcreteViewWrapper  _asview(b4a.example.appmaininterface __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="appmaininterface";
if (Debug.shouldDelegate(ba, "asview"))
	return (anywheresoftware.b4a.objects.ConcreteViewWrapper) Debug.delegate(ba, "asview", null);
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Sub AsView As View";
RDebugUtils.currentLine=1507329;
 //BA.debugLineNum = 1507329;BA.debugLine="Return pnlmainscreen";
if (true) return (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._pnlmainscreen.getObject()));
RDebugUtils.currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="End Sub";
return null;
}
public String  _build_ui(b4a.example.appmaininterface __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="appmaininterface";
if (Debug.shouldDelegate(ba, "build_ui"))
	return (String) Debug.delegate(ba, "build_ui", null);
RDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Sub Build_UI";
RDebugUtils.currentLine=1572865;
 //BA.debugLineNum = 1572865;BA.debugLine="pnlmainscreen.Color = Colors.RGB(24, 96, 178)";
__ref._pnlmainscreen.setColor(__c.Colors.RGB((int) (24),(int) (96),(int) (178)));
RDebugUtils.currentLine=1572868;
 //BA.debugLineNum = 1572868;BA.debugLine="pnlleftmenu.Color = Colors.ARGB(150,0,0,0)";
__ref._pnlleftmenu.setColor(__c.Colors.ARGB((int) (150),(int) (0),(int) (0),(int) (0)));
RDebugUtils.currentLine=1572869;
 //BA.debugLineNum = 1572869;BA.debugLine="avataricon.SetBackgroundImage(avatarimg)";
__ref._avataricon.SetBackgroundImageNew((android.graphics.Bitmap)(__ref._avatarimg.getObject()));
RDebugUtils.currentLine=1572871;
 //BA.debugLineNum = 1572871;BA.debugLine="accountname.Text = Main.currentuser.name";
__ref._accountname.setText(BA.ObjectToCharSequence(_main._currentuser.name));
RDebugUtils.currentLine=1572872;
 //BA.debugLineNum = 1572872;BA.debugLine="accountname.TextSize = 30";
__ref._accountname.setTextSize((float) (30));
RDebugUtils.currentLine=1572873;
 //BA.debugLineNum = 1572873;BA.debugLine="If accountname.Text.Length > 6 Then";
if (__ref._accountname.getText().length()>6) { 
RDebugUtils.currentLine=1572874;
 //BA.debugLineNum = 1572874;BA.debugLine="accountname.TextSize = 20";
__ref._accountname.setTextSize((float) (20));
 };
RDebugUtils.currentLine=1572876;
 //BA.debugLineNum = 1572876;BA.debugLine="accountname.TextColor = Colors.White";
__ref._accountname.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=1572878;
 //BA.debugLineNum = 1572878;BA.debugLine="accountrank.Text = \"Rank:\"";
__ref._accountrank.setText(BA.ObjectToCharSequence("Rank:"));
RDebugUtils.currentLine=1572879;
 //BA.debugLineNum = 1572879;BA.debugLine="showrank.Text =  Main.currentuser.rank";
__ref._showrank.setText(BA.ObjectToCharSequence(_main._currentuser.rank));
RDebugUtils.currentLine=1572880;
 //BA.debugLineNum = 1572880;BA.debugLine="accountrank.TextSize = 20";
__ref._accountrank.setTextSize((float) (20));
RDebugUtils.currentLine=1572881;
 //BA.debugLineNum = 1572881;BA.debugLine="showrank.TextSize = 20";
__ref._showrank.setTextSize((float) (20));
RDebugUtils.currentLine=1572882;
 //BA.debugLineNum = 1572882;BA.debugLine="accountrank.TextColor = Colors.White";
__ref._accountrank.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=1572883;
 //BA.debugLineNum = 1572883;BA.debugLine="showrank.TextColor = Colors.White";
__ref._showrank.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=1572886;
 //BA.debugLineNum = 1572886;BA.debugLine="accountbalance.Text = Main.currentuser.money";
__ref._accountbalance.setText(BA.ObjectToCharSequence(_main._currentuser.money));
RDebugUtils.currentLine=1572887;
 //BA.debugLineNum = 1572887;BA.debugLine="accountbalance.Textsize = 20";
__ref._accountbalance.setTextSize((float) (20));
RDebugUtils.currentLine=1572888;
 //BA.debugLineNum = 1572888;BA.debugLine="accountbalance.TextColor = Colors.White";
__ref._accountbalance.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=1572891;
 //BA.debugLineNum = 1572891;BA.debugLine="btn_logout.Text = \"Log out\"";
__ref._btn_logout.setText(BA.ObjectToCharSequence("Log out"));
RDebugUtils.currentLine=1572892;
 //BA.debugLineNum = 1572892;BA.debugLine="HelperFunctions.Apply_ViewStyle(btn_logout,Colors";
_helperfunctions._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._btn_logout.getObject())),__c.Colors.Black,__c.Colors.White,__c.Colors.White,__c.Colors.LightGray,__c.Colors.LightGray,__c.Colors.Gray,__c.Colors.Gray,(int) (20));
RDebugUtils.currentLine=1572894;
 //BA.debugLineNum = 1572894;BA.debugLine="slotmachine.Text = \"Slots\"";
__ref._slotmachine.setText(BA.ObjectToCharSequence("Slots"));
RDebugUtils.currentLine=1572895;
 //BA.debugLineNum = 1572895;BA.debugLine="HelperFunctions.Apply_ViewStyle(slotmachine,Color";
_helperfunctions._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._slotmachine.getObject())),__c.Colors.Black,__c.Colors.White,__c.Colors.White,__c.Colors.LightGray,__c.Colors.LightGray,__c.Colors.Gray,__c.Colors.Gray,(int) (20));
RDebugUtils.currentLine=1572897;
 //BA.debugLineNum = 1572897;BA.debugLine="If Main.currentuser.rank = \"Admin\" Then";
if ((_main._currentuser.rank).equals("Admin")) { 
RDebugUtils.currentLine=1572898;
 //BA.debugLineNum = 1572898;BA.debugLine="pnlmainscreen.AddView(actionsforadmin.TabhostAct";
__ref._pnlmainscreen.AddView((android.view.View)(__ref._actionsforadmin._tabhostactions.getObject()),(int) (__c.PerXToCurrent((float) (20),ba)-__c.DipToCurrent((int) (5))),__c.PerYToCurrent((float) (0),ba),__c.PerXToCurrent((float) (82),ba),__c.PerYToCurrent((float) (100),ba));
 }else 
{RDebugUtils.currentLine=1572899;
 //BA.debugLineNum = 1572899;BA.debugLine="Else if Main.currentuser.rank = \"user\" Then";
if ((_main._currentuser.rank).equals("user")) { 
RDebugUtils.currentLine=1572900;
 //BA.debugLineNum = 1572900;BA.debugLine="pnlmainscreen.AddView(actionsforuser.TabhostActi";
__ref._pnlmainscreen.AddView((android.view.View)(__ref._actionsforuser._tabhostactions.getObject()),(int) (__c.PerXToCurrent((float) (20),ba)-__c.DipToCurrent((int) (5))),__c.PerYToCurrent((float) (0),ba),__c.PerXToCurrent((float) (82),ba),__c.PerYToCurrent((float) (100),ba));
 }}
;
RDebugUtils.currentLine=1572904;
 //BA.debugLineNum = 1572904;BA.debugLine="pnlmainscreen.AddView(pnlleftmenu,0,0,20%x,100%y)";
__ref._pnlmainscreen.AddView((android.view.View)(__ref._pnlleftmenu.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (100),ba));
RDebugUtils.currentLine=1572905;
 //BA.debugLineNum = 1572905;BA.debugLine="pnlleftmenu.AddView(avataricon,0,0,20%x,25%y)";
__ref._pnlleftmenu.AddView((android.view.View)(__ref._avataricon.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (25),ba));
RDebugUtils.currentLine=1572906;
 //BA.debugLineNum = 1572906;BA.debugLine="pnlleftmenu.AddView(accountname,pnlleftmenu.Left";
__ref._pnlleftmenu.AddView((android.view.View)(__ref._accountname.getObject()),(int) (__ref._pnlleftmenu.getLeft()+__c.PerXToCurrent((float) (1),ba)),__c.PerYToCurrent((float) (25),ba),(int) (__ref._pnlleftmenu.getWidth()-__c.PerXToCurrent((float) (2),ba)),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=1572907;
 //BA.debugLineNum = 1572907;BA.debugLine="pnlleftmenu.AddView(accountrank,pnlleftmenu.Left";
__ref._pnlleftmenu.AddView((android.view.View)(__ref._accountrank.getObject()),(int) (__ref._pnlleftmenu.getLeft()+__c.PerXToCurrent((float) (1),ba)),__c.PerYToCurrent((float) (35),ba),(int) (__ref._pnlleftmenu.getWidth()/(double)2),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=1572908;
 //BA.debugLineNum = 1572908;BA.debugLine="pnlleftmenu.AddView(showrank,(accountrank.Left +";
__ref._pnlleftmenu.AddView((android.view.View)(__ref._showrank.getObject()),(int) ((__ref._accountrank.getLeft()+__ref._accountrank.getWidth())+__c.PerXToCurrent((float) (1),ba)),__c.PerYToCurrent((float) (35),ba),(int) (__ref._pnlleftmenu.getWidth()/(double)2),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=1572909;
 //BA.debugLineNum = 1572909;BA.debugLine="pnlleftmenu.AddView(accountbalance,pnlleftmenu.Le";
__ref._pnlleftmenu.AddView((android.view.View)(__ref._accountbalance.getObject()),(int) (__ref._pnlleftmenu.getLeft()+__c.PerXToCurrent((float) (1),ba)),__c.PerYToCurrent((float) (45),ba),(int) (__ref._pnlleftmenu.getWidth()-__c.PerXToCurrent((float) (2),ba)),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=1572911;
 //BA.debugLineNum = 1572911;BA.debugLine="pnlleftmenu.AddView(slotmachine,pnlleftmenu.Left";
__ref._pnlleftmenu.AddView((android.view.View)(__ref._slotmachine.getObject()),(int) (__ref._pnlleftmenu.getLeft()+__c.PerXToCurrent((float) (1),ba)),__c.PerYToCurrent((float) (65),ba),(int) (__ref._pnlleftmenu.getWidth()-__c.PerXToCurrent((float) (2),ba)),__ref._accountname.getHeight());
RDebugUtils.currentLine=1572912;
 //BA.debugLineNum = 1572912;BA.debugLine="pnlleftmenu.AddView(btn_logout,pnlleftmenu.Left +";
__ref._pnlleftmenu.AddView((android.view.View)(__ref._btn_logout.getObject()),(int) (__ref._pnlleftmenu.getLeft()+__c.PerXToCurrent((float) (1),ba)),(int) ((__ref._slotmachine.getTop()+__ref._slotmachine.getHeight())+__c.PerYToCurrent((float) (5),ba)),(int) (__ref._pnlleftmenu.getWidth()-__c.PerXToCurrent((float) (2),ba)),__ref._slotmachine.getHeight());
RDebugUtils.currentLine=1572913;
 //BA.debugLineNum = 1572913;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.appmaininterface __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="appmaininterface";
RDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=1376257;
 //BA.debugLineNum = 1376257;BA.debugLine="Dim pnlmainscreen,pnlleftmenu As Panel";
_pnlmainscreen = new anywheresoftware.b4a.objects.PanelWrapper();
_pnlleftmenu = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="Dim avataricon,btn_logout,slotmachine As Button";
_avataricon = new anywheresoftware.b4a.objects.ButtonWrapper();
_btn_logout = new anywheresoftware.b4a.objects.ButtonWrapper();
_slotmachine = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=1376259;
 //BA.debugLineNum = 1376259;BA.debugLine="Dim avatarimg As Bitmap = LoadBitmapSample(File.D";
_avatarimg = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
_avatarimg = __c.LoadBitmapSample(__c.File.getDirAssets(),"avatar.png",__c.DipToCurrent((int) (215)),__c.DipToCurrent((int) (215)));
RDebugUtils.currentLine=1376260;
 //BA.debugLineNum = 1376260;BA.debugLine="Dim accountname,accountbalance,accountrank,showba";
_accountname = new anywheresoftware.b4a.objects.LabelWrapper();
_accountbalance = new anywheresoftware.b4a.objects.LabelWrapper();
_accountrank = new anywheresoftware.b4a.objects.LabelWrapper();
_showbalance = new anywheresoftware.b4a.objects.LabelWrapper();
_showrank = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=1376261;
 //BA.debugLineNum = 1376261;BA.debugLine="Dim actionsforuser As UserActions";
_actionsforuser = new b4a.example.useractions();
RDebugUtils.currentLine=1376262;
 //BA.debugLineNum = 1376262;BA.debugLine="Dim actionsforadmin As AdminActions";
_actionsforadmin = new b4a.example.adminactions();
RDebugUtils.currentLine=1376263;
 //BA.debugLineNum = 1376263;BA.debugLine="End Sub";
return "";
}
public String  _logout_click(b4a.example.appmaininterface __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="appmaininterface";
if (Debug.shouldDelegate(ba, "logout_click"))
	return (String) Debug.delegate(ba, "logout_click", null);
RDebugUtils.currentLine=1703936;
 //BA.debugLineNum = 1703936;BA.debugLine="Sub logout_Click";
RDebugUtils.currentLine=1703937;
 //BA.debugLineNum = 1703937;BA.debugLine="CallSub(Main,\"ShowHideMainUI\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"ShowHideMainUI");
RDebugUtils.currentLine=1703938;
 //BA.debugLineNum = 1703938;BA.debugLine="End Sub";
return "";
}
public String  _slotz_click(b4a.example.appmaininterface __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="appmaininterface";
if (Debug.shouldDelegate(ba, "slotz_click"))
	return (String) Debug.delegate(ba, "slotz_click", null);
RDebugUtils.currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="Sub slotz_Click";
RDebugUtils.currentLine=1638401;
 //BA.debugLineNum = 1638401;BA.debugLine="CallSub(Main,\"ShowHideSlotGame\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"ShowHideSlotGame");
RDebugUtils.currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="End Sub";
return "";
}
}