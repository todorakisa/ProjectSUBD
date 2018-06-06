package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class register extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.register");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.register.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.PanelWrapper _pnlscreen = null;
public anywheresoftware.b4a.objects.EditTextWrapper _enterusername = null;
public anywheresoftware.b4a.objects.EditTextWrapper _enterpassword = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnregister = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnalreadyreg = null;
public b4a.example.main _main = null;
public b4a.example.helperfunctions _helperfunctions = null;
public b4a.example.types _types = null;
public b4a.example.starter _starter = null;
public String  _initialize(b4a.example.register __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="register";
if (Debug.shouldDelegate(ba, "initialize"))
	return (String) Debug.delegate(ba, "initialize", new Object[] {_ba});
RDebugUtils.currentLine=4194304;
 //BA.debugLineNum = 4194304;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=4194305;
 //BA.debugLineNum = 4194305;BA.debugLine="pnlscreen.Initialize(\"mainscreen\")";
__ref._pnlscreen.Initialize(ba,"mainscreen");
RDebugUtils.currentLine=4194306;
 //BA.debugLineNum = 4194306;BA.debugLine="enterpassword.Initialize(\"pass\")";
__ref._enterpassword.Initialize(ba,"pass");
RDebugUtils.currentLine=4194307;
 //BA.debugLineNum = 4194307;BA.debugLine="enterusername.Initialize(\"username\")";
__ref._enterusername.Initialize(ba,"username");
RDebugUtils.currentLine=4194308;
 //BA.debugLineNum = 4194308;BA.debugLine="btnalreadyreg.Initialize(\"alrdyreg\")";
__ref._btnalreadyreg.Initialize(ba,"alrdyreg");
RDebugUtils.currentLine=4194309;
 //BA.debugLineNum = 4194309;BA.debugLine="btnregister.Initialize(\"register\")";
__ref._btnregister.Initialize(ba,"register");
RDebugUtils.currentLine=4194310;
 //BA.debugLineNum = 4194310;BA.debugLine="BuildUI";
__ref._buildui(null);
RDebugUtils.currentLine=4194311;
 //BA.debugLineNum = 4194311;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.ConcreteViewWrapper  _asview(b4a.example.register __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="register";
if (Debug.shouldDelegate(ba, "asview"))
	return (anywheresoftware.b4a.objects.ConcreteViewWrapper) Debug.delegate(ba, "asview", null);
RDebugUtils.currentLine=4259840;
 //BA.debugLineNum = 4259840;BA.debugLine="Sub AsView As View";
RDebugUtils.currentLine=4259841;
 //BA.debugLineNum = 4259841;BA.debugLine="Return pnlscreen";
if (true) return (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._pnlscreen.getObject()));
RDebugUtils.currentLine=4259842;
 //BA.debugLineNum = 4259842;BA.debugLine="End Sub";
return null;
}
public String  _alrdyreg_click(b4a.example.register __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="register";
if (Debug.shouldDelegate(ba, "alrdyreg_click"))
	return (String) Debug.delegate(ba, "alrdyreg_click", null);
RDebugUtils.currentLine=4456448;
 //BA.debugLineNum = 4456448;BA.debugLine="Sub alrdyreg_Click";
RDebugUtils.currentLine=4456449;
 //BA.debugLineNum = 4456449;BA.debugLine="CallSub(Main,\"ShowHideLoginScreen\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"ShowHideLoginScreen");
RDebugUtils.currentLine=4456450;
 //BA.debugLineNum = 4456450;BA.debugLine="End Sub";
return "";
}
public String  _buildui(b4a.example.register __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="register";
if (Debug.shouldDelegate(ba, "buildui"))
	return (String) Debug.delegate(ba, "buildui", null);
RDebugUtils.currentLine=4325376;
 //BA.debugLineNum = 4325376;BA.debugLine="Sub BuildUI";
RDebugUtils.currentLine=4325378;
 //BA.debugLineNum = 4325378;BA.debugLine="pnlscreen.Color = Colors.RGB(24, 96, 178)";
__ref._pnlscreen.setColor(__c.Colors.RGB((int) (24),(int) (96),(int) (178)));
RDebugUtils.currentLine=4325380;
 //BA.debugLineNum = 4325380;BA.debugLine="enterusername.Color = Colors.White";
__ref._enterusername.setColor(__c.Colors.White);
RDebugUtils.currentLine=4325381;
 //BA.debugLineNum = 4325381;BA.debugLine="enterpassword.Color = Colors.White";
__ref._enterpassword.setColor(__c.Colors.White);
RDebugUtils.currentLine=4325382;
 //BA.debugLineNum = 4325382;BA.debugLine="enterusername.TextColor = Colors.Black";
__ref._enterusername.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=4325383;
 //BA.debugLineNum = 4325383;BA.debugLine="enterpassword.TextColor = Colors.Black";
__ref._enterpassword.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=4325384;
 //BA.debugLineNum = 4325384;BA.debugLine="enterusername.Hint = \"Username\"";
__ref._enterusername.setHint("Username");
RDebugUtils.currentLine=4325385;
 //BA.debugLineNum = 4325385;BA.debugLine="enterpassword.Hint = \"Password\"";
__ref._enterpassword.setHint("Password");
RDebugUtils.currentLine=4325386;
 //BA.debugLineNum = 4325386;BA.debugLine="enterpassword.SingleLine = True";
__ref._enterpassword.setSingleLine(__c.True);
RDebugUtils.currentLine=4325387;
 //BA.debugLineNum = 4325387;BA.debugLine="enterusername.SingleLine = True";
__ref._enterusername.setSingleLine(__c.True);
RDebugUtils.currentLine=4325388;
 //BA.debugLineNum = 4325388;BA.debugLine="HelperFunctions.Apply_ViewStyle(enterusername,Col";
_helperfunctions._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._enterusername.getObject())),__c.Colors.Black,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.Gray,__c.Colors.Gray,(int) (20));
RDebugUtils.currentLine=4325389;
 //BA.debugLineNum = 4325389;BA.debugLine="HelperFunctions.Apply_ViewStyle(enterpassword,Col";
_helperfunctions._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._enterpassword.getObject())),__c.Colors.Black,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.Gray,__c.Colors.Gray,(int) (20));
RDebugUtils.currentLine=4325391;
 //BA.debugLineNum = 4325391;BA.debugLine="btnregister.Color = Colors.White";
__ref._btnregister.setColor(__c.Colors.White);
RDebugUtils.currentLine=4325392;
 //BA.debugLineNum = 4325392;BA.debugLine="btnregister.Text = \"Submit\"";
__ref._btnregister.setText(BA.ObjectToCharSequence("Submit"));
RDebugUtils.currentLine=4325393;
 //BA.debugLineNum = 4325393;BA.debugLine="btnregister.TextColor = Colors.Black";
__ref._btnregister.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=4325394;
 //BA.debugLineNum = 4325394;BA.debugLine="HelperFunctions.Apply_ViewStyle(btnregister,Color";
_helperfunctions._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._btnregister.getObject())),__c.Colors.Black,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.Gray,__c.Colors.Gray,(int) (20));
RDebugUtils.currentLine=4325396;
 //BA.debugLineNum = 4325396;BA.debugLine="btnalreadyreg.Color = Colors.White";
__ref._btnalreadyreg.setColor(__c.Colors.White);
RDebugUtils.currentLine=4325397;
 //BA.debugLineNum = 4325397;BA.debugLine="btnalreadyreg.Text = \"Already have and account? C";
__ref._btnalreadyreg.setText(BA.ObjectToCharSequence("Already have and account? Click here!"));
RDebugUtils.currentLine=4325398;
 //BA.debugLineNum = 4325398;BA.debugLine="btnalreadyreg.TextColor = Colors.Black";
__ref._btnalreadyreg.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=4325399;
 //BA.debugLineNum = 4325399;BA.debugLine="HelperFunctions.Apply_ViewStyle(btnalreadyreg,Col";
_helperfunctions._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._btnalreadyreg.getObject())),__c.Colors.Black,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.White,__c.Colors.Gray,__c.Colors.Gray,(int) (20));
RDebugUtils.currentLine=4325403;
 //BA.debugLineNum = 4325403;BA.debugLine="pnlscreen.AddView(enterusername,35%x,20%y,30%x,10";
__ref._pnlscreen.AddView((android.view.View)(__ref._enterusername.getObject()),__c.PerXToCurrent((float) (35),ba),__c.PerYToCurrent((float) (20),ba),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=4325404;
 //BA.debugLineNum = 4325404;BA.debugLine="pnlscreen.AddView(enterpassword,35%x,enterusernam";
__ref._pnlscreen.AddView((android.view.View)(__ref._enterpassword.getObject()),__c.PerXToCurrent((float) (35),ba),(int) (__ref._enterusername.getTop()+__c.PerYToCurrent((float) (15),ba)),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=4325405;
 //BA.debugLineNum = 4325405;BA.debugLine="pnlscreen.AddView(btnregister,35%x,50%y,30%x,15%y";
__ref._pnlscreen.AddView((android.view.View)(__ref._btnregister.getObject()),__c.PerXToCurrent((float) (35),ba),__c.PerYToCurrent((float) (50),ba),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (15),ba));
RDebugUtils.currentLine=4325406;
 //BA.debugLineNum = 4325406;BA.debugLine="pnlscreen.AddView(btnalreadyreg,35%x,70%y,30%x,15";
__ref._pnlscreen.AddView((android.view.View)(__ref._btnalreadyreg.getObject()),__c.PerXToCurrent((float) (35),ba),__c.PerYToCurrent((float) (70),ba),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (15),ba));
RDebugUtils.currentLine=4325408;
 //BA.debugLineNum = 4325408;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.register __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="register";
RDebugUtils.currentLine=4128768;
 //BA.debugLineNum = 4128768;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=4128769;
 //BA.debugLineNum = 4128769;BA.debugLine="Dim pnlscreen As Panel";
_pnlscreen = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=4128770;
 //BA.debugLineNum = 4128770;BA.debugLine="Dim enterusername As EditText";
_enterusername = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=4128771;
 //BA.debugLineNum = 4128771;BA.debugLine="Dim enterpassword As EditText";
_enterpassword = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=4128772;
 //BA.debugLineNum = 4128772;BA.debugLine="Dim btnregister As Button";
_btnregister = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=4128773;
 //BA.debugLineNum = 4128773;BA.debugLine="Dim btnalreadyreg As Button";
_btnalreadyreg = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=4128776;
 //BA.debugLineNum = 4128776;BA.debugLine="End Sub";
return "";
}
public String  _register_click(b4a.example.register __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="register";
if (Debug.shouldDelegate(ba, "register_click"))
	return (String) Debug.delegate(ba, "register_click", null);
RDebugUtils.currentLine=4390912;
 //BA.debugLineNum = 4390912;BA.debugLine="Sub register_Click";
RDebugUtils.currentLine=4390913;
 //BA.debugLineNum = 4390913;BA.debugLine="If enterusername.Text = \"\"  Or enterpassword.Text";
if ((__ref._enterusername.getText()).equals("") || (__ref._enterpassword.getText()).equals("")) { 
RDebugUtils.currentLine=4390914;
 //BA.debugLineNum = 4390914;BA.debugLine="ToastMessageShow(\"Nothing entered\",False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("Nothing entered"),__c.False);
 }else {
RDebugUtils.currentLine=4390916;
 //BA.debugLineNum = 4390916;BA.debugLine="If Main.database.IsInitialized = True Then";
if (_main._database.IsInitialized()==__c.True) { 
RDebugUtils.currentLine=4390917;
 //BA.debugLineNum = 4390917;BA.debugLine="CallSub3(Main,\"DataBaseAddInfo\",enterusername.T";
__c.CallSubDebug3(ba,(Object)(_main.getObject()),"DataBaseAddInfo",(Object)(__ref._enterusername.getText()),(Object)(__ref._enterpassword.getText()));
RDebugUtils.currentLine=4390918;
 //BA.debugLineNum = 4390918;BA.debugLine="ToastMessageShow(\"SUCCESSFULY REGISTERED!\",Fals";
__c.ToastMessageShow(BA.ObjectToCharSequence("SUCCESSFULY REGISTERED!"),__c.False);
RDebugUtils.currentLine=4390919;
 //BA.debugLineNum = 4390919;BA.debugLine="CallSub(Main,\"ShowHideLoginScreen\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"ShowHideLoginScreen");
 };
 };
RDebugUtils.currentLine=4390922;
 //BA.debugLineNum = 4390922;BA.debugLine="End Sub";
return "";
}
}