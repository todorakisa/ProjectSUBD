package b4a.VankoBet;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class login extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.VankoBet.login");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.VankoBet.login.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlmainscreen = null;
public anywheresoftware.b4a.objects.EditTextWrapper _enterusername = null;
public anywheresoftware.b4a.objects.EditTextWrapper _enterpassword = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnlogin = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnnoreg = null;
public b4a.VankoBet.main _main = null;
public b4a.VankoBet.db _db = null;
public b4a.VankoBet.types _types = null;
public b4a.VankoBet.starter _starter = null;
public b4a.VankoBet.helperfunctions _helperfunctions = null;
public anywheresoftware.b4a.objects.ConcreteViewWrapper  _asview() throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Sub AsView As View";
 //BA.debugLineNum = 22;BA.debugLine="Return pnlmainscreen";
if (true) return (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_pnlmainscreen.getObject()));
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return null;
}
public String  _build_ui() throws Exception{
 //BA.debugLineNum = 25;BA.debugLine="Sub Build_UI";
 //BA.debugLineNum = 26;BA.debugLine="enterusername.Hint = \"Username\"";
_enterusername.setHint("Username");
 //BA.debugLineNum = 27;BA.debugLine="enterpassword.Hint = \"Password\"";
_enterpassword.setHint("Password");
 //BA.debugLineNum = 28;BA.debugLine="enterusername.SingleLine = True";
_enterusername.setSingleLine(__c.True);
 //BA.debugLineNum = 29;BA.debugLine="enterpassword.SingleLine = True";
_enterpassword.setSingleLine(__c.True);
 //BA.debugLineNum = 30;BA.debugLine="HelperFunctions.Apply_ViewStyle(enterusername,Col";
_helperfunctions._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_enterusername.getObject())),__c.Colors.Black,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.Gray,__c.Colors.Gray,(int) (20));
 //BA.debugLineNum = 31;BA.debugLine="HelperFunctions.Apply_ViewStyle(enterpassword,Col";
_helperfunctions._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_enterpassword.getObject())),__c.Colors.Black,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.Gray,__c.Colors.Gray,(int) (20));
 //BA.debugLineNum = 33;BA.debugLine="btnlogin.Text = \"Login\"";
_btnlogin.setText(BA.ObjectToCharSequence("Login"));
 //BA.debugLineNum = 34;BA.debugLine="HelperFunctions.Apply_ViewStyle(btnlogin,Colors.B";
_helperfunctions._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_btnlogin.getObject())),__c.Colors.Black,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.Gray,__c.Colors.Gray,(int) (20));
 //BA.debugLineNum = 36;BA.debugLine="btnnoreg.Text = \"Register\"";
_btnnoreg.setText(BA.ObjectToCharSequence("Register"));
 //BA.debugLineNum = 37;BA.debugLine="HelperFunctions.Apply_ViewStyle(btnnoreg,Colors.B";
_helperfunctions._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_btnnoreg.getObject())),__c.Colors.Black,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.Gray,__c.Colors.Gray,(int) (20));
 //BA.debugLineNum = 39;BA.debugLine="pnlmainscreen.SendToBack";
_pnlmainscreen.SendToBack();
 //BA.debugLineNum = 40;BA.debugLine="pnlmainscreen.Color = Colors.RGB(24, 96, 178)";
_pnlmainscreen.setColor(__c.Colors.RGB((int) (24),(int) (96),(int) (178)));
 //BA.debugLineNum = 41;BA.debugLine="pnlmainscreen.AddView(enterusername,35%x,20%y,30%";
_pnlmainscreen.AddView((android.view.View)(_enterusername.getObject()),__c.PerXToCurrent((float) (35),ba),__c.PerYToCurrent((float) (20),ba),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 42;BA.debugLine="pnlmainscreen.AddView(enterpassword,35%x,enteruse";
_pnlmainscreen.AddView((android.view.View)(_enterpassword.getObject()),__c.PerXToCurrent((float) (35),ba),(int) (_enterusername.getTop()+__c.PerYToCurrent((float) (15),ba)),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 43;BA.debugLine="pnlmainscreen.AddView(btnlogin,35%x,50%y,30%x,15%";
_pnlmainscreen.AddView((android.view.View)(_btnlogin.getObject()),__c.PerXToCurrent((float) (35),ba),__c.PerYToCurrent((float) (50),ba),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (15),ba));
 //BA.debugLineNum = 44;BA.debugLine="pnlmainscreen.AddView(btnnoreg,85%x,5%y,14%x,15%y";
_pnlmainscreen.AddView((android.view.View)(_btnnoreg.getObject()),__c.PerXToCurrent((float) (85),ba),__c.PerYToCurrent((float) (5),ba),__c.PerXToCurrent((float) (14),ba),__c.PerYToCurrent((float) (15),ba));
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Dim pnlmainscreen As Panel";
_pnlmainscreen = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 3;BA.debugLine="Dim enterusername As EditText";
_enterusername = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 4;BA.debugLine="Dim enterpassword As EditText";
_enterpassword = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 5;BA.debugLine="Dim btnlogin As Button";
_btnlogin = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 6;BA.debugLine="Dim btnnoreg As Button";
_btnnoreg = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
public String  _goback_click() throws Exception{
 //BA.debugLineNum = 56;BA.debugLine="Sub goback_Click";
 //BA.debugLineNum = 57;BA.debugLine="CallSub(Main,\"ShowHideLoginScreen\")";
__c.CallSubNew(ba,(Object)(_main.getObject()),"ShowHideLoginScreen");
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 11;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 12;BA.debugLine="pnlmainscreen.Initialize(\"loginscreen\")";
_pnlmainscreen.Initialize(ba,"loginscreen");
 //BA.debugLineNum = 13;BA.debugLine="enterusername.Initialize(\"username\")";
_enterusername.Initialize(ba,"username");
 //BA.debugLineNum = 14;BA.debugLine="enterpassword.Initialize(\"password\")";
_enterpassword.Initialize(ba,"password");
 //BA.debugLineNum = 15;BA.debugLine="btnlogin.Initialize(\"login\")";
_btnlogin.Initialize(ba,"login");
 //BA.debugLineNum = 16;BA.debugLine="btnnoreg.Initialize(\"goback\")";
_btnnoreg.Initialize(ba,"goback");
 //BA.debugLineNum = 18;BA.debugLine="Build_UI";
_build_ui();
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return "";
}
public String  _login_click() throws Exception{
 //BA.debugLineNum = 48;BA.debugLine="Sub login_Click";
 //BA.debugLineNum = 49;BA.debugLine="If enterusername.Text = \"\"  Or enterpassword.Text";
if ((_enterusername.getText()).equals("") || (_enterpassword.getText()).equals("")) { 
 //BA.debugLineNum = 50;BA.debugLine="ToastMessageShow(\"Nothing entered!\",False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("Nothing entered!"),__c.False);
 }else {
 //BA.debugLineNum = 52;BA.debugLine="DB.ValidateUser(enterusername.Text,enterpassword";
_db._validateuser(ba,_enterusername.getText(),_enterpassword.getText());
 };
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
