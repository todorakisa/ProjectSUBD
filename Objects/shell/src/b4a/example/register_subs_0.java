package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class register_subs_0 {


public static RemoteObject  _alrdyreg_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("alrdyreg_Click (register) ","register",7,__ref.getField(false, "ba"),__ref,72);
if (RapidSub.canDelegate("alrdyreg_click")) return __ref.runUserSub(false, "register","alrdyreg_click", __ref);
 BA.debugLineNum = 72;BA.debugLine="Sub alrdyreg_Click";
Debug.ShouldStop(128);
 BA.debugLineNum = 73;BA.debugLine="CallSub(Main,\"ShowHideLoginScreen\")";
Debug.ShouldStop(256);
register.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)((register._main.getObject())),(Object)(RemoteObject.createImmutable("ShowHideLoginScreen")));
 BA.debugLineNum = 74;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _asview(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AsView (register) ","register",7,__ref.getField(false, "ba"),__ref,21);
if (RapidSub.canDelegate("asview")) return __ref.runUserSub(false, "register","asview", __ref);
 BA.debugLineNum = 21;BA.debugLine="Sub AsView As View";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 22;BA.debugLine="Return pnlscreen";
Debug.ShouldStop(2097152);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_pnlscreen").getObject());
 BA.debugLineNum = 23;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buildui(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("BuildUI (register) ","register",7,__ref.getField(false, "ba"),__ref,25);
if (RapidSub.canDelegate("buildui")) return __ref.runUserSub(false, "register","buildui", __ref);
 BA.debugLineNum = 25;BA.debugLine="Sub BuildUI";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 27;BA.debugLine="pnlscreen.Color = Colors.RGB(24, 96, 178)";
Debug.ShouldStop(67108864);
__ref.getField(false,"_pnlscreen").runVoidMethod ("setColor",register.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 24)),(Object)(BA.numberCast(int.class, 96)),(Object)(BA.numberCast(int.class, 178))));
 BA.debugLineNum = 29;BA.debugLine="enterusername.Color = Colors.White";
Debug.ShouldStop(268435456);
__ref.getField(false,"_enterusername").runVoidMethod ("setColor",register.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 30;BA.debugLine="enterpassword.Color = Colors.White";
Debug.ShouldStop(536870912);
__ref.getField(false,"_enterpassword").runVoidMethod ("setColor",register.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 31;BA.debugLine="enterusername.TextColor = Colors.Black";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_enterusername").runMethod(true,"setTextColor",register.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 32;BA.debugLine="enterpassword.TextColor = Colors.Black";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_enterpassword").runMethod(true,"setTextColor",register.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 33;BA.debugLine="enterusername.Hint = \"Username\"";
Debug.ShouldStop(1);
__ref.getField(false,"_enterusername").runMethod(true,"setHint",BA.ObjectToString("Username"));
 BA.debugLineNum = 34;BA.debugLine="enterpassword.Hint = \"Password\"";
Debug.ShouldStop(2);
__ref.getField(false,"_enterpassword").runMethod(true,"setHint",BA.ObjectToString("Password"));
 BA.debugLineNum = 35;BA.debugLine="enterpassword.SingleLine = True";
Debug.ShouldStop(4);
__ref.getField(false,"_enterpassword").runVoidMethod ("setSingleLine",register.__c.getField(true,"True"));
 BA.debugLineNum = 36;BA.debugLine="enterusername.SingleLine = True";
Debug.ShouldStop(8);
__ref.getField(false,"_enterusername").runVoidMethod ("setSingleLine",register.__c.getField(true,"True"));
 BA.debugLineNum = 37;BA.debugLine="HelperFunctions.Apply_ViewStyle(enterusername,Col";
Debug.ShouldStop(16);
register._helperfunctions.runVoidMethod ("_apply_viewstyle",__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_enterusername").getObject()),(Object)(register.__c.getField(false,"Colors").getField(true,"Black")),(Object)(register.__c.getField(false,"Colors").getField(true,"White")),(Object)(register.__c.getField(false,"Colors").getField(true,"White")),(Object)(register.__c.getField(false,"Colors").getField(true,"White")),(Object)(register.__c.getField(false,"Colors").getField(true,"White")),(Object)(register.__c.getField(false,"Colors").getField(true,"Gray")),(Object)(register.__c.getField(false,"Colors").getField(true,"Gray")),(Object)(BA.numberCast(int.class, 20)));
 BA.debugLineNum = 38;BA.debugLine="HelperFunctions.Apply_ViewStyle(enterpassword,Col";
Debug.ShouldStop(32);
register._helperfunctions.runVoidMethod ("_apply_viewstyle",__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_enterpassword").getObject()),(Object)(register.__c.getField(false,"Colors").getField(true,"Black")),(Object)(register.__c.getField(false,"Colors").getField(true,"White")),(Object)(register.__c.getField(false,"Colors").getField(true,"White")),(Object)(register.__c.getField(false,"Colors").getField(true,"White")),(Object)(register.__c.getField(false,"Colors").getField(true,"White")),(Object)(register.__c.getField(false,"Colors").getField(true,"Gray")),(Object)(register.__c.getField(false,"Colors").getField(true,"Gray")),(Object)(BA.numberCast(int.class, 20)));
 BA.debugLineNum = 40;BA.debugLine="btnregister.Color = Colors.White";
Debug.ShouldStop(128);
__ref.getField(false,"_btnregister").runVoidMethod ("setColor",register.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 41;BA.debugLine="btnregister.Text = \"Submit\"";
Debug.ShouldStop(256);
__ref.getField(false,"_btnregister").runMethod(true,"setText",BA.ObjectToCharSequence("Submit"));
 BA.debugLineNum = 42;BA.debugLine="btnregister.TextColor = Colors.Black";
Debug.ShouldStop(512);
__ref.getField(false,"_btnregister").runMethod(true,"setTextColor",register.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 43;BA.debugLine="HelperFunctions.Apply_ViewStyle(btnregister,Color";
Debug.ShouldStop(1024);
register._helperfunctions.runVoidMethod ("_apply_viewstyle",__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_btnregister").getObject()),(Object)(register.__c.getField(false,"Colors").getField(true,"Black")),(Object)(register.__c.getField(false,"Colors").getField(true,"White")),(Object)(register.__c.getField(false,"Colors").getField(true,"White")),(Object)(register.__c.getField(false,"Colors").getField(true,"White")),(Object)(register.__c.getField(false,"Colors").getField(true,"White")),(Object)(register.__c.getField(false,"Colors").getField(true,"Gray")),(Object)(register.__c.getField(false,"Colors").getField(true,"Gray")),(Object)(BA.numberCast(int.class, 20)));
 BA.debugLineNum = 45;BA.debugLine="btnalreadyreg.Color = Colors.White";
Debug.ShouldStop(4096);
__ref.getField(false,"_btnalreadyreg").runVoidMethod ("setColor",register.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 46;BA.debugLine="btnalreadyreg.Text = \"Already have and account? C";
Debug.ShouldStop(8192);
__ref.getField(false,"_btnalreadyreg").runMethod(true,"setText",BA.ObjectToCharSequence("Already have and account? Click here!"));
 BA.debugLineNum = 47;BA.debugLine="btnalreadyreg.TextColor = Colors.Black";
Debug.ShouldStop(16384);
__ref.getField(false,"_btnalreadyreg").runMethod(true,"setTextColor",register.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 48;BA.debugLine="HelperFunctions.Apply_ViewStyle(btnalreadyreg,Col";
Debug.ShouldStop(32768);
register._helperfunctions.runVoidMethod ("_apply_viewstyle",__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_btnalreadyreg").getObject()),(Object)(register.__c.getField(false,"Colors").getField(true,"Black")),(Object)(register.__c.getField(false,"Colors").getField(true,"White")),(Object)(register.__c.getField(false,"Colors").getField(true,"White")),(Object)(register.__c.getField(false,"Colors").getField(true,"White")),(Object)(register.__c.getField(false,"Colors").getField(true,"White")),(Object)(register.__c.getField(false,"Colors").getField(true,"Gray")),(Object)(register.__c.getField(false,"Colors").getField(true,"Gray")),(Object)(BA.numberCast(int.class, 20)));
 BA.debugLineNum = 52;BA.debugLine="pnlscreen.AddView(enterusername,35%x,20%y,30%x,10";
Debug.ShouldStop(524288);
__ref.getField(false,"_pnlscreen").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_enterusername").getObject())),(Object)(register.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 35)),__ref.getField(false, "ba"))),(Object)(register.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 20)),__ref.getField(false, "ba"))),(Object)(register.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 30)),__ref.getField(false, "ba"))),(Object)(register.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 53;BA.debugLine="pnlscreen.AddView(enterpassword,35%x,enterusernam";
Debug.ShouldStop(1048576);
__ref.getField(false,"_pnlscreen").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_enterpassword").getObject())),(Object)(register.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 35)),__ref.getField(false, "ba"))),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_enterusername").runMethod(true,"getTop"),register.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 15)),__ref.getField(false, "ba"))}, "+",1, 1)),(Object)(register.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 30)),__ref.getField(false, "ba"))),(Object)(register.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 54;BA.debugLine="pnlscreen.AddView(btnregister,35%x,50%y,30%x,15%y";
Debug.ShouldStop(2097152);
__ref.getField(false,"_pnlscreen").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_btnregister").getObject())),(Object)(register.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 35)),__ref.getField(false, "ba"))),(Object)(register.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 50)),__ref.getField(false, "ba"))),(Object)(register.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 30)),__ref.getField(false, "ba"))),(Object)(register.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 15)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 55;BA.debugLine="pnlscreen.AddView(btnalreadyreg,35%x,70%y,30%x,15";
Debug.ShouldStop(4194304);
__ref.getField(false,"_pnlscreen").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_btnalreadyreg").getObject())),(Object)(register.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 35)),__ref.getField(false, "ba"))),(Object)(register.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 70)),__ref.getField(false, "ba"))),(Object)(register.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 30)),__ref.getField(false, "ba"))),(Object)(register.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 15)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 57;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Dim pnlscreen As Panel";
register._pnlscreen = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnlscreen",register._pnlscreen);
 //BA.debugLineNum = 3;BA.debugLine="Dim enterusername As EditText";
register._enterusername = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_enterusername",register._enterusername);
 //BA.debugLineNum = 4;BA.debugLine="Dim enterpassword As EditText";
register._enterpassword = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_enterpassword",register._enterpassword);
 //BA.debugLineNum = 5;BA.debugLine="Dim btnregister As Button";
register._btnregister = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_btnregister",register._btnregister);
 //BA.debugLineNum = 6;BA.debugLine="Dim btnalreadyreg As Button";
register._btnalreadyreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_btnalreadyreg",register._btnalreadyreg);
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (register) ","register",7,__ref.getField(false, "ba"),__ref,12);
if (RapidSub.canDelegate("initialize")) return __ref.runUserSub(false, "register","initialize", __ref, _ba);
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 12;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(2048);
 BA.debugLineNum = 13;BA.debugLine="pnlscreen.Initialize(\"mainscreen\")";
Debug.ShouldStop(4096);
__ref.getField(false,"_pnlscreen").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("mainscreen")));
 BA.debugLineNum = 14;BA.debugLine="enterpassword.Initialize(\"pass\")";
Debug.ShouldStop(8192);
__ref.getField(false,"_enterpassword").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("pass")));
 BA.debugLineNum = 15;BA.debugLine="enterusername.Initialize(\"username\")";
Debug.ShouldStop(16384);
__ref.getField(false,"_enterusername").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("username")));
 BA.debugLineNum = 16;BA.debugLine="btnalreadyreg.Initialize(\"alrdyreg\")";
Debug.ShouldStop(32768);
__ref.getField(false,"_btnalreadyreg").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("alrdyreg")));
 BA.debugLineNum = 17;BA.debugLine="btnregister.Initialize(\"register\")";
Debug.ShouldStop(65536);
__ref.getField(false,"_btnregister").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("register")));
 BA.debugLineNum = 18;BA.debugLine="BuildUI";
Debug.ShouldStop(131072);
__ref.runClassMethod (b4a.example.register.class, "_buildui");
 BA.debugLineNum = 19;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _register_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("register_Click (register) ","register",7,__ref.getField(false, "ba"),__ref,60);
if (RapidSub.canDelegate("register_click")) return __ref.runUserSub(false, "register","register_click", __ref);
 BA.debugLineNum = 60;BA.debugLine="Sub register_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 61;BA.debugLine="If enterusername.Text = \"\"  Or enterpassword.Text";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_enterusername").runMethod(true,"getText"),BA.ObjectToString("")) || RemoteObject.solveBoolean("=",__ref.getField(false,"_enterpassword").runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 62;BA.debugLine="ToastMessageShow(\"Nothing entered\",False)";
Debug.ShouldStop(536870912);
register.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Nothing entered")),(Object)(register.__c.getField(true,"False")));
 }else {
 BA.debugLineNum = 64;BA.debugLine="If Main.database.IsInitialized = True Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",register._main._database.runMethod(true,"IsInitialized"),register.__c.getField(true,"True"))) { 
 BA.debugLineNum = 65;BA.debugLine="CallSub3(Main,\"DataBaseAddInfo\",enterusername.T";
Debug.ShouldStop(1);
register.__c.runMethodAndSync(false,"CallSubNew3",__ref.getField(false, "ba"),(Object)((register._main.getObject())),(Object)(BA.ObjectToString("DataBaseAddInfo")),(Object)((__ref.getField(false,"_enterusername").runMethod(true,"getText"))),(Object)((__ref.getField(false,"_enterpassword").runMethod(true,"getText"))));
 BA.debugLineNum = 66;BA.debugLine="ToastMessageShow(\"SUCCESSFULY REGISTERED!\",Fals";
Debug.ShouldStop(2);
register.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("SUCCESSFULY REGISTERED!")),(Object)(register.__c.getField(true,"False")));
 BA.debugLineNum = 67;BA.debugLine="CallSub(Main,\"ShowHideLoginScreen\")";
Debug.ShouldStop(4);
register.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)((register._main.getObject())),(Object)(RemoteObject.createImmutable("ShowHideLoginScreen")));
 };
 };
 BA.debugLineNum = 70;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}