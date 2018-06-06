package b4a.VankoBet;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class appmaininterface extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.VankoBet.appmaininterface");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.VankoBet.appmaininterface.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
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
public b4a.VankoBet.useractions _actionsforuser = null;
public b4a.VankoBet.adminactions _actionsforadmin = null;
public b4a.VankoBet.main _main = null;
public b4a.VankoBet.types _types = null;
public b4a.VankoBet.starter _starter = null;
public b4a.VankoBet.helperfunctions _helperfunctions = null;
public b4a.VankoBet.db _db = null;
public anywheresoftware.b4a.objects.ConcreteViewWrapper  _asview() throws Exception{
 //BA.debugLineNum = 29;BA.debugLine="Sub AsView As View";
 //BA.debugLineNum = 30;BA.debugLine="Return pnlmainscreen";
if (true) return (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_pnlmainscreen.getObject()));
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return null;
}
public String  _build_ui() throws Exception{
 //BA.debugLineNum = 32;BA.debugLine="Sub Build_UI";
 //BA.debugLineNum = 33;BA.debugLine="pnlmainscreen.Color = Colors.RGB(24, 96, 178)";
_pnlmainscreen.setColor(__c.Colors.RGB((int) (24),(int) (96),(int) (178)));
 //BA.debugLineNum = 36;BA.debugLine="pnlleftmenu.Color = Colors.ARGB(150,0,0,0)";
_pnlleftmenu.setColor(__c.Colors.ARGB((int) (150),(int) (0),(int) (0),(int) (0)));
 //BA.debugLineNum = 37;BA.debugLine="avataricon.SetBackgroundImage(avatarimg)";
_avataricon.SetBackgroundImageNew((android.graphics.Bitmap)(_avatarimg.getObject()));
 //BA.debugLineNum = 39;BA.debugLine="accountname.Text = Types.currentuser.name";
_accountname.setText(BA.ObjectToCharSequence(_types._currentuser.name));
 //BA.debugLineNum = 40;BA.debugLine="accountname.TextSize = 30";
_accountname.setTextSize((float) (30));
 //BA.debugLineNum = 41;BA.debugLine="If accountname.Text.Length > 6 Then";
if (_accountname.getText().length()>6) { 
 //BA.debugLineNum = 42;BA.debugLine="accountname.TextSize = 20";
_accountname.setTextSize((float) (20));
 };
 //BA.debugLineNum = 44;BA.debugLine="accountname.TextColor = Colors.White";
_accountname.setTextColor(__c.Colors.White);
 //BA.debugLineNum = 46;BA.debugLine="accountrank.Text = \"Rank:\"";
_accountrank.setText(BA.ObjectToCharSequence("Rank:"));
 //BA.debugLineNum = 47;BA.debugLine="showrank.Text =  Types.currentuser.rank";
_showrank.setText(BA.ObjectToCharSequence(_types._currentuser.rank));
 //BA.debugLineNum = 48;BA.debugLine="accountrank.TextSize = 20";
_accountrank.setTextSize((float) (20));
 //BA.debugLineNum = 49;BA.debugLine="showrank.TextSize = 20";
_showrank.setTextSize((float) (20));
 //BA.debugLineNum = 50;BA.debugLine="accountrank.TextColor = Colors.White";
_accountrank.setTextColor(__c.Colors.White);
 //BA.debugLineNum = 51;BA.debugLine="showrank.TextColor = Colors.White";
_showrank.setTextColor(__c.Colors.White);
 //BA.debugLineNum = 53;BA.debugLine="accountbalance.Text = Types.currentuser.money";
_accountbalance.setText(BA.ObjectToCharSequence(_types._currentuser.money));
 //BA.debugLineNum = 54;BA.debugLine="accountbalance.Textsize = 20";
_accountbalance.setTextSize((float) (20));
 //BA.debugLineNum = 55;BA.debugLine="accountbalance.TextColor = Colors.White";
_accountbalance.setTextColor(__c.Colors.White);
 //BA.debugLineNum = 57;BA.debugLine="btn_logout.Text = \"Log out\"";
_btn_logout.setText(BA.ObjectToCharSequence("Log out"));
 //BA.debugLineNum = 58;BA.debugLine="HelperFunctions.Apply_ViewStyle(btn_logout,Colors";
_helperfunctions._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_btn_logout.getObject())),__c.Colors.Black,__c.Colors.White,__c.Colors.White,__c.Colors.LightGray,__c.Colors.LightGray,__c.Colors.Gray,__c.Colors.Gray,(int) (20));
 //BA.debugLineNum = 60;BA.debugLine="slotmachine.Text = \"Slots\"";
_slotmachine.setText(BA.ObjectToCharSequence("Slots"));
 //BA.debugLineNum = 61;BA.debugLine="HelperFunctions.Apply_ViewStyle(slotmachine,Color";
_helperfunctions._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_slotmachine.getObject())),__c.Colors.Black,__c.Colors.White,__c.Colors.White,__c.Colors.LightGray,__c.Colors.LightGray,__c.Colors.Gray,__c.Colors.Gray,(int) (20));
 //BA.debugLineNum = 63;BA.debugLine="If Types.IsAdmin = True Then";
if (_types._isadmin(ba)==__c.True) { 
 //BA.debugLineNum = 64;BA.debugLine="pnlmainscreen.AddView(actionsforadmin.TabhostAct";
_pnlmainscreen.AddView((android.view.View)(_actionsforadmin._tabhostactions.getObject()),(int) (__c.PerXToCurrent((float) (20),ba)-__c.DipToCurrent((int) (5))),__c.PerYToCurrent((float) (0),ba),__c.PerXToCurrent((float) (82),ba),__c.PerYToCurrent((float) (100),ba));
 }else {
 //BA.debugLineNum = 66;BA.debugLine="pnlmainscreen.AddView(actionsforuser.TabhostActi";
_pnlmainscreen.AddView((android.view.View)(_actionsforuser._tabhostactions.getObject()),(int) (__c.PerXToCurrent((float) (20),ba)-__c.DipToCurrent((int) (5))),__c.PerYToCurrent((float) (0),ba),__c.PerXToCurrent((float) (82),ba),__c.PerYToCurrent((float) (100),ba));
 };
 //BA.debugLineNum = 69;BA.debugLine="pnlmainscreen.AddView(pnlleftmenu,0,0,20%x,100%y)";
_pnlmainscreen.AddView((android.view.View)(_pnlleftmenu.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (100),ba));
 //BA.debugLineNum = 70;BA.debugLine="pnlleftmenu.AddView(avataricon,0,0,20%x,25%y)";
_pnlleftmenu.AddView((android.view.View)(_avataricon.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (25),ba));
 //BA.debugLineNum = 71;BA.debugLine="pnlleftmenu.AddView(accountname,pnlleftmenu.Left";
_pnlleftmenu.AddView((android.view.View)(_accountname.getObject()),(int) (_pnlleftmenu.getLeft()+__c.PerXToCurrent((float) (1),ba)),__c.PerYToCurrent((float) (25),ba),(int) (_pnlleftmenu.getWidth()-__c.PerXToCurrent((float) (2),ba)),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 72;BA.debugLine="pnlleftmenu.AddView(accountrank,pnlleftmenu.Left";
_pnlleftmenu.AddView((android.view.View)(_accountrank.getObject()),(int) (_pnlleftmenu.getLeft()+__c.PerXToCurrent((float) (1),ba)),__c.PerYToCurrent((float) (35),ba),(int) (_pnlleftmenu.getWidth()/(double)2),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 73;BA.debugLine="pnlleftmenu.AddView(showrank,(accountrank.Left +";
_pnlleftmenu.AddView((android.view.View)(_showrank.getObject()),(int) ((_accountrank.getLeft()+_accountrank.getWidth())+__c.PerXToCurrent((float) (1),ba)),__c.PerYToCurrent((float) (35),ba),(int) (_pnlleftmenu.getWidth()/(double)2),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 74;BA.debugLine="pnlleftmenu.AddView(accountbalance,pnlleftmenu.Le";
_pnlleftmenu.AddView((android.view.View)(_accountbalance.getObject()),(int) (_pnlleftmenu.getLeft()+__c.PerXToCurrent((float) (1),ba)),__c.PerYToCurrent((float) (45),ba),(int) (_pnlleftmenu.getWidth()-__c.PerXToCurrent((float) (2),ba)),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 75;BA.debugLine="pnlleftmenu.AddView(slotmachine,pnlleftmenu.Left";
_pnlleftmenu.AddView((android.view.View)(_slotmachine.getObject()),(int) (_pnlleftmenu.getLeft()+__c.PerXToCurrent((float) (1),ba)),__c.PerYToCurrent((float) (65),ba),(int) (_pnlleftmenu.getWidth()-__c.PerXToCurrent((float) (2),ba)),_accountname.getHeight());
 //BA.debugLineNum = 76;BA.debugLine="pnlleftmenu.AddView(btn_logout,pnlleftmenu.Left +";
_pnlleftmenu.AddView((android.view.View)(_btn_logout.getObject()),(int) (_pnlleftmenu.getLeft()+__c.PerXToCurrent((float) (1),ba)),(int) ((_slotmachine.getTop()+_slotmachine.getHeight())+__c.PerYToCurrent((float) (5),ba)),(int) (_pnlleftmenu.getWidth()-__c.PerXToCurrent((float) (2),ba)),_slotmachine.getHeight());
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Dim pnlmainscreen,pnlleftmenu As Panel";
_pnlmainscreen = new anywheresoftware.b4a.objects.PanelWrapper();
_pnlleftmenu = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 3;BA.debugLine="Dim avataricon,btn_logout,slotmachine As Button";
_avataricon = new anywheresoftware.b4a.objects.ButtonWrapper();
_btn_logout = new anywheresoftware.b4a.objects.ButtonWrapper();
_slotmachine = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 4;BA.debugLine="Dim avatarimg As Bitmap = LoadBitmapSample(File.D";
_avatarimg = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
_avatarimg = __c.LoadBitmapSample(__c.File.getDirAssets(),"avatar.png",__c.DipToCurrent((int) (215)),__c.DipToCurrent((int) (215)));
 //BA.debugLineNum = 5;BA.debugLine="Dim accountname,accountbalance,accountrank,showba";
_accountname = new anywheresoftware.b4a.objects.LabelWrapper();
_accountbalance = new anywheresoftware.b4a.objects.LabelWrapper();
_accountrank = new anywheresoftware.b4a.objects.LabelWrapper();
_showbalance = new anywheresoftware.b4a.objects.LabelWrapper();
_showrank = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 6;BA.debugLine="Dim actionsforuser As UserActions";
_actionsforuser = new b4a.VankoBet.useractions();
 //BA.debugLineNum = 7;BA.debugLine="Dim actionsforadmin As AdminActions";
_actionsforadmin = new b4a.VankoBet.adminactions();
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 11;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 12;BA.debugLine="actionsforuser.Initialize";
_actionsforuser._initialize(ba);
 //BA.debugLineNum = 13;BA.debugLine="actionsforadmin.Initialize";
_actionsforadmin._initialize(ba);
 //BA.debugLineNum = 15;BA.debugLine="pnlmainscreen.Initialize(\"mainscreen\")";
_pnlmainscreen.Initialize(ba,"mainscreen");
 //BA.debugLineNum = 16;BA.debugLine="pnlleftmenu.Initialize(\"leftmenu\")";
_pnlleftmenu.Initialize(ba,"leftmenu");
 //BA.debugLineNum = 19;BA.debugLine="avataricon.Initialize(\"\")";
_avataricon.Initialize(ba,"");
 //BA.debugLineNum = 20;BA.debugLine="accountname.Initialize(\"\")";
_accountname.Initialize(ba,"");
 //BA.debugLineNum = 21;BA.debugLine="accountrank.Initialize(\"\")";
_accountrank.Initialize(ba,"");
 //BA.debugLineNum = 22;BA.debugLine="accountbalance.Initialize(\"\")";
_accountbalance.Initialize(ba,"");
 //BA.debugLineNum = 23;BA.debugLine="showbalance.Initialize(\"\")";
_showbalance.Initialize(ba,"");
 //BA.debugLineNum = 24;BA.debugLine="showrank.Initialize(\"\")";
_showrank.Initialize(ba,"");
 //BA.debugLineNum = 25;BA.debugLine="btn_logout.Initialize(\"logout\")";
_btn_logout.Initialize(ba,"logout");
 //BA.debugLineNum = 26;BA.debugLine="slotmachine.Initialize(\"slotz\")";
_slotmachine.Initialize(ba,"slotz");
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return "";
}
public String  _logout_click() throws Exception{
 //BA.debugLineNum = 82;BA.debugLine="Sub logout_Click";
 //BA.debugLineNum = 83;BA.debugLine="CallSub(Main,\"ShowHideMainUI\")";
__c.CallSubNew(ba,(Object)(_main.getObject()),"ShowHideMainUI");
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return "";
}
public String  _slotz_click() throws Exception{
 //BA.debugLineNum = 78;BA.debugLine="Sub slotz_Click";
 //BA.debugLineNum = 79;BA.debugLine="CallSub(Main,\"ShowHideSlotGame\")";
__c.CallSubNew(ba,(Object)(_main.getObject()),"ShowHideSlotGame");
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
