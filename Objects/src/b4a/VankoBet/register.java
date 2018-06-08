package b4a.VankoBet;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class register extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.VankoBet.register");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.VankoBet.register.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlscreen = null;
public anywheresoftware.b4a.objects.EditTextWrapper _enterusername = null;
public anywheresoftware.b4a.objects.EditTextWrapper _enterpassword = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnregister = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnalreadyreg = null;
public b4a.VankoBet.main _main = null;
public b4a.VankoBet.db _db = null;
public b4a.VankoBet.types _types = null;
public b4a.VankoBet.starter _starter = null;
public b4a.VankoBet.helperfunctions _helperfunctions = null;
public String  _alrdyreg_click() throws Exception{
 //BA.debugLineNum = 70;BA.debugLine="Sub alrdyreg_Click";
 //BA.debugLineNum = 71;BA.debugLine="CallSub(Main,\"ShowHideLoginScreen\")";
__c.CallSubNew(ba,(Object)(_main.getObject()),"ShowHideLoginScreen");
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.ConcreteViewWrapper  _asview() throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Sub AsView As View";
 //BA.debugLineNum = 22;BA.debugLine="Return pnlscreen";
if (true) return (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_pnlscreen.getObject()));
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return null;
}
public String  _buildui() throws Exception{
 //BA.debugLineNum = 25;BA.debugLine="Sub BuildUI";
 //BA.debugLineNum = 27;BA.debugLine="pnlscreen.Color = Colors.RGB(24, 96, 178)";
_pnlscreen.setColor(__c.Colors.RGB((int) (24),(int) (96),(int) (178)));
 //BA.debugLineNum = 29;BA.debugLine="enterusername.Color = Colors.White";
_enterusername.setColor(__c.Colors.White);
 //BA.debugLineNum = 30;BA.debugLine="enterpassword.Color = Colors.White";
_enterpassword.setColor(__c.Colors.White);
 //BA.debugLineNum = 31;BA.debugLine="enterusername.TextColor = Colors.Black";
_enterusername.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 32;BA.debugLine="enterpassword.TextColor = Colors.Black";
_enterpassword.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 33;BA.debugLine="enterusername.Hint = \"Username\"";
_enterusername.setHint("Username");
 //BA.debugLineNum = 34;BA.debugLine="enterpassword.Hint = \"Password\"";
_enterpassword.setHint("Password");
 //BA.debugLineNum = 35;BA.debugLine="enterpassword.SingleLine = True";
_enterpassword.setSingleLine(__c.True);
 //BA.debugLineNum = 36;BA.debugLine="enterusername.SingleLine = True";
_enterusername.setSingleLine(__c.True);
 //BA.debugLineNum = 37;BA.debugLine="HelperFunctions.Apply_ViewStyle(enterusername,Col";
_helperfunctions._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_enterusername.getObject())),__c.Colors.Black,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.Gray,__c.Colors.Gray,(int) (20));
 //BA.debugLineNum = 38;BA.debugLine="HelperFunctions.Apply_ViewStyle(enterpassword,Col";
_helperfunctions._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_enterpassword.getObject())),__c.Colors.Black,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.Gray,__c.Colors.Gray,(int) (20));
 //BA.debugLineNum = 40;BA.debugLine="btnregister.Color = Colors.White";
_btnregister.setColor(__c.Colors.White);
 //BA.debugLineNum = 41;BA.debugLine="btnregister.Text = \"Submit\"";
_btnregister.setText(BA.ObjectToCharSequence("Submit"));
 //BA.debugLineNum = 42;BA.debugLine="btnregister.TextColor = Colors.Black";
_btnregister.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 43;BA.debugLine="HelperFunctions.Apply_ViewStyle(btnregister,Color";
_helperfunctions._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_btnregister.getObject())),__c.Colors.Black,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.Gray,__c.Colors.Gray,(int) (20));
 //BA.debugLineNum = 45;BA.debugLine="btnalreadyreg.Color = Colors.White";
_btnalreadyreg.setColor(__c.Colors.White);
 //BA.debugLineNum = 46;BA.debugLine="btnalreadyreg.Text = \"Already have and account? C";
_btnalreadyreg.setText(BA.ObjectToCharSequence("Already have and account? Click here!"));
 //BA.debugLineNum = 47;BA.debugLine="btnalreadyreg.TextColor = Colors.Black";
_btnalreadyreg.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 48;BA.debugLine="HelperFunctions.Apply_ViewStyle(btnalreadyreg,Col";
_helperfunctions._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_btnalreadyreg.getObject())),__c.Colors.Black,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.Gray,__c.Colors.Gray,(int) (20));
 //BA.debugLineNum = 52;BA.debugLine="pnlscreen.AddView(enterusername,35%x,20%y,30%x,10";
_pnlscreen.AddView((android.view.View)(_enterusername.getObject()),__c.PerXToCurrent((float) (35),ba),__c.PerYToCurrent((float) (20),ba),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 53;BA.debugLine="pnlscreen.AddView(enterpassword,35%x,enterusernam";
_pnlscreen.AddView((android.view.View)(_enterpassword.getObject()),__c.PerXToCurrent((float) (35),ba),(int) (_enterusername.getTop()+__c.PerYToCurrent((float) (15),ba)),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 54;BA.debugLine="pnlscreen.AddView(btnregister,35%x,50%y,30%x,15%y";
_pnlscreen.AddView((android.view.View)(_btnregister.getObject()),__c.PerXToCurrent((float) (35),ba),__c.PerYToCurrent((float) (50),ba),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (15),ba));
 //BA.debugLineNum = 55;BA.debugLine="pnlscreen.AddView(btnalreadyreg,35%x,70%y,30%x,15";
_pnlscreen.AddView((android.view.View)(_btnalreadyreg.getObject()),__c.PerXToCurrent((float) (35),ba),__c.PerYToCurrent((float) (70),ba),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (15),ba));
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Dim pnlscreen As Panel";
_pnlscreen = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 3;BA.debugLine="Dim enterusername As EditText";
_enterusername = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 4;BA.debugLine="Dim enterpassword As EditText";
_enterpassword = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 5;BA.debugLine="Dim btnregister As Button";
_btnregister = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 6;BA.debugLine="Dim btnalreadyreg As Button";
_btnalreadyreg = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 12;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 13;BA.debugLine="pnlscreen.Initialize(\"mainscreen\")";
_pnlscreen.Initialize(ba,"mainscreen");
 //BA.debugLineNum = 14;BA.debugLine="enterpassword.Initialize(\"pass\")";
_enterpassword.Initialize(ba,"pass");
 //BA.debugLineNum = 15;BA.debugLine="enterusername.Initialize(\"username\")";
_enterusername.Initialize(ba,"username");
 //BA.debugLineNum = 16;BA.debugLine="btnalreadyreg.Initialize(\"alrdyreg\")";
_btnalreadyreg.Initialize(ba,"alrdyreg");
 //BA.debugLineNum = 17;BA.debugLine="btnregister.Initialize(\"register\")";
_btnregister.Initialize(ba,"register");
 //BA.debugLineNum = 18;BA.debugLine="BuildUI";
_buildui();
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return "";
}
public String  _register_click() throws Exception{
 //BA.debugLineNum = 60;BA.debugLine="Sub register_Click";
 //BA.debugLineNum = 61;BA.debugLine="If enterusername.Text = \"\"  Or enterpassword.Text";
if ((_enterusername.getText()).equals("") || (_enterpassword.getText()).equals("")) { 
 //BA.debugLineNum = 62;BA.debugLine="ToastMessageShow(\"Nothing entered\",False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("Nothing entered"),__c.False);
 }else {
 //BA.debugLineNum = 64;BA.debugLine="DB.DataBaseCreateUser(enterusername.Text,enterp";
_db._databasecreateuser(ba,_enterusername.getText(),_enterpassword.getText());
 //BA.debugLineNum = 65;BA.debugLine="ToastMessageShow(\"SUCCESSFULY REGISTERED!\",Fals";
__c.ToastMessageShow(BA.ObjectToCharSequence("SUCCESSFULY REGISTERED!"),__c.False);
 //BA.debugLineNum = 66;BA.debugLine="CallSub(Main,\"ShowHideLoginScreen\")";
__c.CallSubNew(ba,(Object)(_main.getObject()),"ShowHideLoginScreen");
 };
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
