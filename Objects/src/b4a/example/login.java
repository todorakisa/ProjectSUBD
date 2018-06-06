package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class login extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.login");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.login.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.EditTextWrapper _enterusername = null;
public anywheresoftware.b4a.objects.EditTextWrapper _enterpassword = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnlogin = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnnoreg = null;
public b4a.example.main _main = null;
public b4a.example.helperfunctions _helperfunctions = null;
public b4a.example.types _types = null;
public b4a.example.starter _starter = null;
public String  _initialize(b4a.example.login __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="login";
if (Debug.shouldDelegate(ba, "initialize"))
	return (String) Debug.delegate(ba, "initialize", new Object[] {_ba});
RDebugUtils.currentLine=3145728;
 //BA.debugLineNum = 3145728;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=3145729;
 //BA.debugLineNum = 3145729;BA.debugLine="pnlmainscreen.Initialize(\"loginscreen\")";
__ref._pnlmainscreen.Initialize(ba,"loginscreen");
RDebugUtils.currentLine=3145730;
 //BA.debugLineNum = 3145730;BA.debugLine="enterusername.Initialize(\"username\")";
__ref._enterusername.Initialize(ba,"username");
RDebugUtils.currentLine=3145731;
 //BA.debugLineNum = 3145731;BA.debugLine="enterpassword.Initialize(\"password\")";
__ref._enterpassword.Initialize(ba,"password");
RDebugUtils.currentLine=3145732;
 //BA.debugLineNum = 3145732;BA.debugLine="btnlogin.Initialize(\"login\")";
__ref._btnlogin.Initialize(ba,"login");
RDebugUtils.currentLine=3145733;
 //BA.debugLineNum = 3145733;BA.debugLine="btnnoreg.Initialize(\"goback\")";
__ref._btnnoreg.Initialize(ba,"goback");
RDebugUtils.currentLine=3145735;
 //BA.debugLineNum = 3145735;BA.debugLine="Build_UI";
__ref._build_ui(null);
RDebugUtils.currentLine=3145736;
 //BA.debugLineNum = 3145736;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.ConcreteViewWrapper  _asview(b4a.example.login __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="login";
if (Debug.shouldDelegate(ba, "asview"))
	return (anywheresoftware.b4a.objects.ConcreteViewWrapper) Debug.delegate(ba, "asview", null);
RDebugUtils.currentLine=3211264;
 //BA.debugLineNum = 3211264;BA.debugLine="Sub AsView As View";
RDebugUtils.currentLine=3211265;
 //BA.debugLineNum = 3211265;BA.debugLine="Return pnlmainscreen";
if (true) return (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._pnlmainscreen.getObject()));
RDebugUtils.currentLine=3211266;
 //BA.debugLineNum = 3211266;BA.debugLine="End Sub";
return null;
}
public String  _build_ui(b4a.example.login __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="login";
if (Debug.shouldDelegate(ba, "build_ui"))
	return (String) Debug.delegate(ba, "build_ui", null);
RDebugUtils.currentLine=3276800;
 //BA.debugLineNum = 3276800;BA.debugLine="Sub Build_UI";
RDebugUtils.currentLine=3276801;
 //BA.debugLineNum = 3276801;BA.debugLine="enterusername.Hint = \"Username\"";
__ref._enterusername.setHint("Username");
RDebugUtils.currentLine=3276802;
 //BA.debugLineNum = 3276802;BA.debugLine="enterpassword.Hint = \"Password\"";
__ref._enterpassword.setHint("Password");
RDebugUtils.currentLine=3276803;
 //BA.debugLineNum = 3276803;BA.debugLine="enterusername.SingleLine = True";
__ref._enterusername.setSingleLine(__c.True);
RDebugUtils.currentLine=3276804;
 //BA.debugLineNum = 3276804;BA.debugLine="enterpassword.SingleLine = True";
__ref._enterpassword.setSingleLine(__c.True);
RDebugUtils.currentLine=3276805;
 //BA.debugLineNum = 3276805;BA.debugLine="HelperFunctions.Apply_ViewStyle(enterusername,Col";
_helperfunctions._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._enterusername.getObject())),__c.Colors.Black,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.Gray,__c.Colors.Gray,(int) (20));
RDebugUtils.currentLine=3276806;
 //BA.debugLineNum = 3276806;BA.debugLine="HelperFunctions.Apply_ViewStyle(enterpassword,Col";
_helperfunctions._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._enterpassword.getObject())),__c.Colors.Black,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.Gray,__c.Colors.Gray,(int) (20));
RDebugUtils.currentLine=3276808;
 //BA.debugLineNum = 3276808;BA.debugLine="btnlogin.Text = \"Login\"";
__ref._btnlogin.setText(BA.ObjectToCharSequence("Login"));
RDebugUtils.currentLine=3276809;
 //BA.debugLineNum = 3276809;BA.debugLine="HelperFunctions.Apply_ViewStyle(btnlogin,Colors.B";
_helperfunctions._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._btnlogin.getObject())),__c.Colors.Black,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.Gray,__c.Colors.Gray,(int) (20));
RDebugUtils.currentLine=3276811;
 //BA.debugLineNum = 3276811;BA.debugLine="btnnoreg.Text = \"Register\"";
__ref._btnnoreg.setText(BA.ObjectToCharSequence("Register"));
RDebugUtils.currentLine=3276812;
 //BA.debugLineNum = 3276812;BA.debugLine="HelperFunctions.Apply_ViewStyle(btnnoreg,Colors.B";
_helperfunctions._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._btnnoreg.getObject())),__c.Colors.Black,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.Gray,__c.Colors.Gray,(int) (20));
RDebugUtils.currentLine=3276814;
 //BA.debugLineNum = 3276814;BA.debugLine="pnlmainscreen.SendToBack";
__ref._pnlmainscreen.SendToBack();
RDebugUtils.currentLine=3276815;
 //BA.debugLineNum = 3276815;BA.debugLine="pnlmainscreen.Color = Colors.RGB(24, 96, 178)";
__ref._pnlmainscreen.setColor(__c.Colors.RGB((int) (24),(int) (96),(int) (178)));
RDebugUtils.currentLine=3276816;
 //BA.debugLineNum = 3276816;BA.debugLine="pnlmainscreen.AddView(enterusername,35%x,20%y,30%";
__ref._pnlmainscreen.AddView((android.view.View)(__ref._enterusername.getObject()),__c.PerXToCurrent((float) (35),ba),__c.PerYToCurrent((float) (20),ba),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=3276817;
 //BA.debugLineNum = 3276817;BA.debugLine="pnlmainscreen.AddView(enterpassword,35%x,enteruse";
__ref._pnlmainscreen.AddView((android.view.View)(__ref._enterpassword.getObject()),__c.PerXToCurrent((float) (35),ba),(int) (__ref._enterusername.getTop()+__c.PerYToCurrent((float) (15),ba)),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=3276818;
 //BA.debugLineNum = 3276818;BA.debugLine="pnlmainscreen.AddView(btnlogin,35%x,50%y,30%x,15%";
__ref._pnlmainscreen.AddView((android.view.View)(__ref._btnlogin.getObject()),__c.PerXToCurrent((float) (35),ba),__c.PerYToCurrent((float) (50),ba),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (15),ba));
RDebugUtils.currentLine=3276819;
 //BA.debugLineNum = 3276819;BA.debugLine="pnlmainscreen.AddView(btnnoreg,85%x,5%y,14%x,15%y";
__ref._pnlmainscreen.AddView((android.view.View)(__ref._btnnoreg.getObject()),__c.PerXToCurrent((float) (85),ba),__c.PerYToCurrent((float) (5),ba),__c.PerXToCurrent((float) (14),ba),__c.PerYToCurrent((float) (15),ba));
RDebugUtils.currentLine=3276821;
 //BA.debugLineNum = 3276821;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.login __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="login";
RDebugUtils.currentLine=3080192;
 //BA.debugLineNum = 3080192;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=3080193;
 //BA.debugLineNum = 3080193;BA.debugLine="Dim pnlmainscreen As Panel";
_pnlmainscreen = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=3080194;
 //BA.debugLineNum = 3080194;BA.debugLine="Dim enterusername As EditText";
_enterusername = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=3080195;
 //BA.debugLineNum = 3080195;BA.debugLine="Dim enterpassword As EditText";
_enterpassword = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=3080196;
 //BA.debugLineNum = 3080196;BA.debugLine="Dim btnlogin As Button";
_btnlogin = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=3080197;
 //BA.debugLineNum = 3080197;BA.debugLine="Dim btnnoreg As Button";
_btnnoreg = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=3080199;
 //BA.debugLineNum = 3080199;BA.debugLine="End Sub";
return "";
}
public String  _goback_click(b4a.example.login __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="login";
if (Debug.shouldDelegate(ba, "goback_click"))
	return (String) Debug.delegate(ba, "goback_click", null);
RDebugUtils.currentLine=3473408;
 //BA.debugLineNum = 3473408;BA.debugLine="Sub goback_Click";
RDebugUtils.currentLine=3473409;
 //BA.debugLineNum = 3473409;BA.debugLine="CallSub(Main,\"ShowHideLoginScreen\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"ShowHideLoginScreen");
RDebugUtils.currentLine=3473410;
 //BA.debugLineNum = 3473410;BA.debugLine="End Sub";
return "";
}
public String  _login_click(b4a.example.login __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="login";
if (Debug.shouldDelegate(ba, "login_click"))
	return (String) Debug.delegate(ba, "login_click", null);
RDebugUtils.currentLine=3342336;
 //BA.debugLineNum = 3342336;BA.debugLine="Sub login_Click";
RDebugUtils.currentLine=3342337;
 //BA.debugLineNum = 3342337;BA.debugLine="If enterusername.Text = \"\"  Or enterpassword.Text";
if ((__ref._enterusername.getText()).equals("") || (__ref._enterpassword.getText()).equals("")) { 
RDebugUtils.currentLine=3342338;
 //BA.debugLineNum = 3342338;BA.debugLine="ToastMessageShow(\"Nothing entered!\",False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("Nothing entered!"),__c.False);
 }else {
RDebugUtils.currentLine=3342340;
 //BA.debugLineNum = 3342340;BA.debugLine="Validate_User";
__ref._validate_user(null);
 };
RDebugUtils.currentLine=3342342;
 //BA.debugLineNum = 3342342;BA.debugLine="End Sub";
return "";
}
public String  _validate_user(b4a.example.login __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="login";
if (Debug.shouldDelegate(ba, "validate_user"))
	return (String) Debug.delegate(ba, "validate_user", null);
anywheresoftware.b4a.sql.SQL.CursorWrapper _cursor = null;
int _i = 0;
RDebugUtils.currentLine=3407872;
 //BA.debugLineNum = 3407872;BA.debugLine="Sub Validate_User";
RDebugUtils.currentLine=3407873;
 //BA.debugLineNum = 3407873;BA.debugLine="Main.database.Initialize(File.DirDefaultExternal,";
_main._database.Initialize(__c.File.getDirDefaultExternal(),"userdatabase.db",__c.True);
RDebugUtils.currentLine=3407874;
 //BA.debugLineNum = 3407874;BA.debugLine="Dim cursor As Cursor";
_cursor = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=3407875;
 //BA.debugLineNum = 3407875;BA.debugLine="cursor = Main.database.ExecQuery(\"SELECT Username";
_cursor.setObject((android.database.Cursor)(_main._database.ExecQuery("SELECT Username, Password, Money, Rank FROM Users where Username='"+__ref._enterusername.getText()+"'")));
RDebugUtils.currentLine=3407876;
 //BA.debugLineNum = 3407876;BA.debugLine="For i = 0 To cursor.RowCount - 1";
{
final int step4 = 1;
final int limit4 = (int) (_cursor.getRowCount()-1);
_i = (int) (0) ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
RDebugUtils.currentLine=3407877;
 //BA.debugLineNum = 3407877;BA.debugLine="cursor.Position = i";
_cursor.setPosition(_i);
RDebugUtils.currentLine=3407878;
 //BA.debugLineNum = 3407878;BA.debugLine="If cursor.GetString(\"Username\") = enterusername.";
if ((_cursor.GetString("Username")).equals(__ref._enterusername.getText())) { 
RDebugUtils.currentLine=3407879;
 //BA.debugLineNum = 3407879;BA.debugLine="If cursor.GetString(\"Password\") = enterpassword";
if ((_cursor.GetString("Password")).equals(__ref._enterpassword.getText())) { 
RDebugUtils.currentLine=3407880;
 //BA.debugLineNum = 3407880;BA.debugLine="Main.currentuser.name = enterusername.Text";
_main._currentuser.name = __ref._enterusername.getText();
RDebugUtils.currentLine=3407881;
 //BA.debugLineNum = 3407881;BA.debugLine="Main.currentuser.money = cursor.GetDouble(\"Mo";
_main._currentuser.money = _cursor.GetDouble("Money");
RDebugUtils.currentLine=3407882;
 //BA.debugLineNum = 3407882;BA.debugLine="Main.currentuser.rank = cursor.GetString(\"Ran";
_main._currentuser.rank = _cursor.GetString("Rank");
RDebugUtils.currentLine=3407883;
 //BA.debugLineNum = 3407883;BA.debugLine="ToastMessageShow(\"Login Successful!\",False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("Login Successful!"),__c.False);
RDebugUtils.currentLine=3407884;
 //BA.debugLineNum = 3407884;BA.debugLine="CallSub(Main,\"ShowHideMainUI\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"ShowHideMainUI");
 }else {
RDebugUtils.currentLine=3407886;
 //BA.debugLineNum = 3407886;BA.debugLine="ToastMessageShow(\"Wrong password!\",False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("Wrong password!"),__c.False);
 };
 }else {
RDebugUtils.currentLine=3407889;
 //BA.debugLineNum = 3407889;BA.debugLine="ToastMessageShow(\"Wrong username!\",False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("Wrong username!"),__c.False);
 };
 }
};
RDebugUtils.currentLine=3407892;
 //BA.debugLineNum = 3407892;BA.debugLine="cursor.Close";
_cursor.Close();
RDebugUtils.currentLine=3407893;
 //BA.debugLineNum = 3407893;BA.debugLine="Main.database.Close";
_main._database.Close();
RDebugUtils.currentLine=3407894;
 //BA.debugLineNum = 3407894;BA.debugLine="End Sub";
return "";
}
}