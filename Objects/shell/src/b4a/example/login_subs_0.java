package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class login_subs_0 {


public static RemoteObject  _asview(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AsView (login) ","login",4,__ref.getField(false, "ba"),__ref,21);
if (RapidSub.canDelegate("asview")) return __ref.runUserSub(false, "login","asview", __ref);
 BA.debugLineNum = 21;BA.debugLine="Sub AsView As View";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 22;BA.debugLine="Return pnlmainscreen";
Debug.ShouldStop(2097152);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_pnlmainscreen").getObject());
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
public static RemoteObject  _build_ui(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Build_UI (login) ","login",4,__ref.getField(false, "ba"),__ref,25);
if (RapidSub.canDelegate("build_ui")) return __ref.runUserSub(false, "login","build_ui", __ref);
 BA.debugLineNum = 25;BA.debugLine="Sub Build_UI";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 26;BA.debugLine="enterusername.Hint = \"Username\"";
Debug.ShouldStop(33554432);
__ref.getField(false,"_enterusername").runMethod(true,"setHint",BA.ObjectToString("Username"));
 BA.debugLineNum = 27;BA.debugLine="enterpassword.Hint = \"Password\"";
Debug.ShouldStop(67108864);
__ref.getField(false,"_enterpassword").runMethod(true,"setHint",BA.ObjectToString("Password"));
 BA.debugLineNum = 28;BA.debugLine="enterusername.SingleLine = True";
Debug.ShouldStop(134217728);
__ref.getField(false,"_enterusername").runVoidMethod ("setSingleLine",login.__c.getField(true,"True"));
 BA.debugLineNum = 29;BA.debugLine="enterpassword.SingleLine = True";
Debug.ShouldStop(268435456);
__ref.getField(false,"_enterpassword").runVoidMethod ("setSingleLine",login.__c.getField(true,"True"));
 BA.debugLineNum = 30;BA.debugLine="HelperFunctions.Apply_ViewStyle(enterusername,Col";
Debug.ShouldStop(536870912);
login._helperfunctions.runVoidMethod ("_apply_viewstyle",__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_enterusername").getObject()),(Object)(login.__c.getField(false,"Colors").getField(true,"Black")),(Object)(login.__c.getField(false,"Colors").getField(true,"White")),(Object)(login.__c.getField(false,"Colors").getField(true,"White")),(Object)(login.__c.getField(false,"Colors").getField(true,"White")),(Object)(login.__c.getField(false,"Colors").getField(true,"White")),(Object)(login.__c.getField(false,"Colors").getField(true,"Gray")),(Object)(login.__c.getField(false,"Colors").getField(true,"Gray")),(Object)(BA.numberCast(int.class, 20)));
 BA.debugLineNum = 31;BA.debugLine="HelperFunctions.Apply_ViewStyle(enterpassword,Col";
Debug.ShouldStop(1073741824);
login._helperfunctions.runVoidMethod ("_apply_viewstyle",__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_enterpassword").getObject()),(Object)(login.__c.getField(false,"Colors").getField(true,"Black")),(Object)(login.__c.getField(false,"Colors").getField(true,"White")),(Object)(login.__c.getField(false,"Colors").getField(true,"White")),(Object)(login.__c.getField(false,"Colors").getField(true,"White")),(Object)(login.__c.getField(false,"Colors").getField(true,"White")),(Object)(login.__c.getField(false,"Colors").getField(true,"Gray")),(Object)(login.__c.getField(false,"Colors").getField(true,"Gray")),(Object)(BA.numberCast(int.class, 20)));
 BA.debugLineNum = 33;BA.debugLine="btnlogin.Text = \"Login\"";
Debug.ShouldStop(1);
__ref.getField(false,"_btnlogin").runMethod(true,"setText",BA.ObjectToCharSequence("Login"));
 BA.debugLineNum = 34;BA.debugLine="HelperFunctions.Apply_ViewStyle(btnlogin,Colors.B";
Debug.ShouldStop(2);
login._helperfunctions.runVoidMethod ("_apply_viewstyle",__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_btnlogin").getObject()),(Object)(login.__c.getField(false,"Colors").getField(true,"Black")),(Object)(login.__c.getField(false,"Colors").getField(true,"White")),(Object)(login.__c.getField(false,"Colors").getField(true,"White")),(Object)(login.__c.getField(false,"Colors").getField(true,"White")),(Object)(login.__c.getField(false,"Colors").getField(true,"White")),(Object)(login.__c.getField(false,"Colors").getField(true,"Gray")),(Object)(login.__c.getField(false,"Colors").getField(true,"Gray")),(Object)(BA.numberCast(int.class, 20)));
 BA.debugLineNum = 36;BA.debugLine="btnnoreg.Text = \"Register\"";
Debug.ShouldStop(8);
__ref.getField(false,"_btnnoreg").runMethod(true,"setText",BA.ObjectToCharSequence("Register"));
 BA.debugLineNum = 37;BA.debugLine="HelperFunctions.Apply_ViewStyle(btnnoreg,Colors.B";
Debug.ShouldStop(16);
login._helperfunctions.runVoidMethod ("_apply_viewstyle",__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_btnnoreg").getObject()),(Object)(login.__c.getField(false,"Colors").getField(true,"Black")),(Object)(login.__c.getField(false,"Colors").getField(true,"White")),(Object)(login.__c.getField(false,"Colors").getField(true,"White")),(Object)(login.__c.getField(false,"Colors").getField(true,"White")),(Object)(login.__c.getField(false,"Colors").getField(true,"White")),(Object)(login.__c.getField(false,"Colors").getField(true,"Gray")),(Object)(login.__c.getField(false,"Colors").getField(true,"Gray")),(Object)(BA.numberCast(int.class, 20)));
 BA.debugLineNum = 39;BA.debugLine="pnlmainscreen.SendToBack";
Debug.ShouldStop(64);
__ref.getField(false,"_pnlmainscreen").runVoidMethod ("SendToBack");
 BA.debugLineNum = 40;BA.debugLine="pnlmainscreen.Color = Colors.RGB(24, 96, 178)";
Debug.ShouldStop(128);
__ref.getField(false,"_pnlmainscreen").runVoidMethod ("setColor",login.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 24)),(Object)(BA.numberCast(int.class, 96)),(Object)(BA.numberCast(int.class, 178))));
 BA.debugLineNum = 41;BA.debugLine="pnlmainscreen.AddView(enterusername,35%x,20%y,30%";
Debug.ShouldStop(256);
__ref.getField(false,"_pnlmainscreen").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_enterusername").getObject())),(Object)(login.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 35)),__ref.getField(false, "ba"))),(Object)(login.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 20)),__ref.getField(false, "ba"))),(Object)(login.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 30)),__ref.getField(false, "ba"))),(Object)(login.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 42;BA.debugLine="pnlmainscreen.AddView(enterpassword,35%x,enteruse";
Debug.ShouldStop(512);
__ref.getField(false,"_pnlmainscreen").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_enterpassword").getObject())),(Object)(login.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 35)),__ref.getField(false, "ba"))),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_enterusername").runMethod(true,"getTop"),login.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 15)),__ref.getField(false, "ba"))}, "+",1, 1)),(Object)(login.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 30)),__ref.getField(false, "ba"))),(Object)(login.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 43;BA.debugLine="pnlmainscreen.AddView(btnlogin,35%x,50%y,30%x,15%";
Debug.ShouldStop(1024);
__ref.getField(false,"_pnlmainscreen").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_btnlogin").getObject())),(Object)(login.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 35)),__ref.getField(false, "ba"))),(Object)(login.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 50)),__ref.getField(false, "ba"))),(Object)(login.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 30)),__ref.getField(false, "ba"))),(Object)(login.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 15)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 44;BA.debugLine="pnlmainscreen.AddView(btnnoreg,85%x,5%y,14%x,15%y";
Debug.ShouldStop(2048);
__ref.getField(false,"_pnlmainscreen").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_btnnoreg").getObject())),(Object)(login.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 85)),__ref.getField(false, "ba"))),(Object)(login.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))),(Object)(login.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 14)),__ref.getField(false, "ba"))),(Object)(login.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 15)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 46;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
 //BA.debugLineNum = 2;BA.debugLine="Dim pnlmainscreen As Panel";
login._pnlmainscreen = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnlmainscreen",login._pnlmainscreen);
 //BA.debugLineNum = 3;BA.debugLine="Dim enterusername As EditText";
login._enterusername = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_enterusername",login._enterusername);
 //BA.debugLineNum = 4;BA.debugLine="Dim enterpassword As EditText";
login._enterpassword = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_enterpassword",login._enterpassword);
 //BA.debugLineNum = 5;BA.debugLine="Dim btnlogin As Button";
login._btnlogin = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_btnlogin",login._btnlogin);
 //BA.debugLineNum = 6;BA.debugLine="Dim btnnoreg As Button";
login._btnnoreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_btnnoreg",login._btnnoreg);
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _goback_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("goback_Click (login) ","login",4,__ref.getField(false, "ba"),__ref,81);
if (RapidSub.canDelegate("goback_click")) return __ref.runUserSub(false, "login","goback_click", __ref);
 BA.debugLineNum = 81;BA.debugLine="Sub goback_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 82;BA.debugLine="CallSub(Main,\"ShowHideLoginScreen\")";
Debug.ShouldStop(131072);
login.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)((login._main.getObject())),(Object)(RemoteObject.createImmutable("ShowHideLoginScreen")));
 BA.debugLineNum = 83;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (login) ","login",4,__ref.getField(false, "ba"),__ref,11);
if (RapidSub.canDelegate("initialize")) return __ref.runUserSub(false, "login","initialize", __ref, _ba);
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 11;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(1024);
 BA.debugLineNum = 12;BA.debugLine="pnlmainscreen.Initialize(\"loginscreen\")";
Debug.ShouldStop(2048);
__ref.getField(false,"_pnlmainscreen").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("loginscreen")));
 BA.debugLineNum = 13;BA.debugLine="enterusername.Initialize(\"username\")";
Debug.ShouldStop(4096);
__ref.getField(false,"_enterusername").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("username")));
 BA.debugLineNum = 14;BA.debugLine="enterpassword.Initialize(\"password\")";
Debug.ShouldStop(8192);
__ref.getField(false,"_enterpassword").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("password")));
 BA.debugLineNum = 15;BA.debugLine="btnlogin.Initialize(\"login\")";
Debug.ShouldStop(16384);
__ref.getField(false,"_btnlogin").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("login")));
 BA.debugLineNum = 16;BA.debugLine="btnnoreg.Initialize(\"goback\")";
Debug.ShouldStop(32768);
__ref.getField(false,"_btnnoreg").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("goback")));
 BA.debugLineNum = 18;BA.debugLine="Build_UI";
Debug.ShouldStop(131072);
__ref.runClassMethod (b4a.example.login.class, "_build_ui");
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
public static RemoteObject  _login_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("login_Click (login) ","login",4,__ref.getField(false, "ba"),__ref,48);
if (RapidSub.canDelegate("login_click")) return __ref.runUserSub(false, "login","login_click", __ref);
 BA.debugLineNum = 48;BA.debugLine="Sub login_Click";
Debug.ShouldStop(32768);
 BA.debugLineNum = 49;BA.debugLine="If enterusername.Text = \"\"  Or enterpassword.Text";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_enterusername").runMethod(true,"getText"),BA.ObjectToString("")) || RemoteObject.solveBoolean("=",__ref.getField(false,"_enterpassword").runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 50;BA.debugLine="ToastMessageShow(\"Nothing entered!\",False)";
Debug.ShouldStop(131072);
login.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Nothing entered!")),(Object)(login.__c.getField(true,"False")));
 }else {
 BA.debugLineNum = 52;BA.debugLine="Validate_User";
Debug.ShouldStop(524288);
__ref.runClassMethod (b4a.example.login.class, "_validate_user");
 };
 BA.debugLineNum = 54;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _validate_user(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Validate_User (login) ","login",4,__ref.getField(false, "ba"),__ref,56);
if (RapidSub.canDelegate("validate_user")) return __ref.runUserSub(false, "login","validate_user", __ref);
RemoteObject _cursor = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
 BA.debugLineNum = 56;BA.debugLine="Sub Validate_User";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 57;BA.debugLine="Main.database.Initialize(File.DirDefaultExternal,";
Debug.ShouldStop(16777216);
login._main._database.runVoidMethod ("Initialize",(Object)(login.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(BA.ObjectToString("userdatabase.db")),(Object)(login.__c.getField(true,"True")));
 BA.debugLineNum = 58;BA.debugLine="Dim cursor As Cursor";
Debug.ShouldStop(33554432);
_cursor = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("cursor", _cursor);
 BA.debugLineNum = 59;BA.debugLine="cursor = Main.database.ExecQuery(\"SELECT Username";
Debug.ShouldStop(67108864);
_cursor.setObject(login._main._database.runMethod(false,"ExecQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT Username, Password, Money, Rank FROM Users where Username='"),__ref.getField(false,"_enterusername").runMethod(true,"getText"),RemoteObject.createImmutable("'")))));
 BA.debugLineNum = 60;BA.debugLine="For i = 0 To cursor.RowCount - 1";
Debug.ShouldStop(134217728);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {_cursor.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 61;BA.debugLine="cursor.Position = i";
Debug.ShouldStop(268435456);
_cursor.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 62;BA.debugLine="If cursor.GetString(\"Username\") = enterusername.";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Username"))),__ref.getField(false,"_enterusername").runMethod(true,"getText"))) { 
 BA.debugLineNum = 63;BA.debugLine="If cursor.GetString(\"Password\") = enterpassword";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Password"))),__ref.getField(false,"_enterpassword").runMethod(true,"getText"))) { 
 BA.debugLineNum = 64;BA.debugLine="Main.currentuser.name = enterusername.Text";
Debug.ShouldStop(-2147483648);
login._main._currentuser.setField ("name",__ref.getField(false,"_enterusername").runMethod(true,"getText"));
 BA.debugLineNum = 65;BA.debugLine="Main.currentuser.money = cursor.GetDouble(\"Mo";
Debug.ShouldStop(1);
login._main._currentuser.setField ("money",_cursor.runMethod(true,"GetDouble",(Object)(RemoteObject.createImmutable("Money"))));
 BA.debugLineNum = 66;BA.debugLine="Main.currentuser.rank = cursor.GetString(\"Ran";
Debug.ShouldStop(2);
login._main._currentuser.setField ("rank",_cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Rank"))));
 BA.debugLineNum = 67;BA.debugLine="ToastMessageShow(\"Login Successful!\",False)";
Debug.ShouldStop(4);
login.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Login Successful!")),(Object)(login.__c.getField(true,"False")));
 BA.debugLineNum = 68;BA.debugLine="CallSub(Main,\"ShowHideMainUI\")";
Debug.ShouldStop(8);
login.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)((login._main.getObject())),(Object)(RemoteObject.createImmutable("ShowHideMainUI")));
 }else {
 BA.debugLineNum = 70;BA.debugLine="ToastMessageShow(\"Wrong password!\",False)";
Debug.ShouldStop(32);
login.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Wrong password!")),(Object)(login.__c.getField(true,"False")));
 };
 }else {
 BA.debugLineNum = 73;BA.debugLine="ToastMessageShow(\"Wrong username!\",False)";
Debug.ShouldStop(256);
login.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Wrong username!")),(Object)(login.__c.getField(true,"False")));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 76;BA.debugLine="cursor.Close";
Debug.ShouldStop(2048);
_cursor.runVoidMethod ("Close");
 BA.debugLineNum = 77;BA.debugLine="Main.database.Close";
Debug.ShouldStop(4096);
login._main._database.runVoidMethod ("Close");
 BA.debugLineNum = 78;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}