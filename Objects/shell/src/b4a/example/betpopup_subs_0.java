package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class betpopup_subs_0 {


public static RemoteObject  _background_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("background_Click (betpopup) ","betpopup",5,__ref.getField(false, "ba"),__ref,29);
if (RapidSub.canDelegate("background_click")) return __ref.runUserSub(false, "betpopup","background_click", __ref);
 BA.debugLineNum = 29;BA.debugLine="Sub background_Click As Boolean";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 30;BA.debugLine="Return True";
Debug.ShouldStop(536870912);
if (true) return betpopup.__c.getField(true,"True");
 BA.debugLineNum = 31;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btn1_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btn1_Click (betpopup) ","betpopup",5,__ref.getField(false, "ba"),__ref,33);
if (RapidSub.canDelegate("btn1_click")) return __ref.runUserSub(false, "betpopup","btn1_click", __ref);
 BA.debugLineNum = 33;BA.debugLine="Sub btn1_Click";
Debug.ShouldStop(1);
 BA.debugLineNum = 34;BA.debugLine="If entersum.Text = \"\" Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_entersum").runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 35;BA.debugLine="ToastMessageShow(\"No sum entered\",False)";
Debug.ShouldStop(4);
betpopup.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("No sum entered")),(Object)(betpopup.__c.getField(true,"False")));
 BA.debugLineNum = 36;BA.debugLine="CallSub(Main,\"ShowBetsPopUp\")";
Debug.ShouldStop(8);
betpopup.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)((betpopup._main.getObject())),(Object)(RemoteObject.createImmutable("ShowBetsPopUp")));
 }else {
 BA.debugLineNum = 38;BA.debugLine="Main.currentuser.money = Main.currentuser.money -";
Debug.ShouldStop(32);
betpopup._main._currentuser.setField ("money",RemoteObject.solve(new RemoteObject[] {betpopup._main._currentuser.getField(true,"money"),BA.numberCast(double.class, __ref.getField(false,"_entersum").runMethod(true,"getText"))}, "-",1, 0));
 BA.debugLineNum = 39;BA.debugLine="Main.admin.funds = Main.admin.funds + (5/100)*ent";
Debug.ShouldStop(64);
betpopup._main._admin.setField ("funds",RemoteObject.solve(new RemoteObject[] {betpopup._main._admin.getField(true,"funds"),(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(5),RemoteObject.createImmutable(100)}, "/",0, 0)),BA.numberCast(double.class, __ref.getField(false,"_entersum").runMethod(true,"getText"))}, "+*",1, 0));
 BA.debugLineNum = 41;BA.debugLine="Main.database.ExecNonQuery(\"UPDATE  Users SET Mon";
Debug.ShouldStop(256);
betpopup._main._database.runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE  Users SET Money = '"),betpopup._main._currentuser.getField(true,"money"),RemoteObject.createImmutable("' WHERE Username = '"),betpopup._main._currentuser.getField(true,"name"),RemoteObject.createImmutable("'"))));
 BA.debugLineNum = 42;BA.debugLine="Main.database.ExecNonQuery(\"UPDATE  Users SET Mon";
Debug.ShouldStop(512);
betpopup._main._database.runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE  Users SET Money = '"),betpopup._main._admin.getField(true,"funds"),RemoteObject.createImmutable("' WHERE Username = 'Admin'"))));
 BA.debugLineNum = 44;BA.debugLine="CallSub(Main,\"AccMoney\")";
Debug.ShouldStop(2048);
betpopup.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)((betpopup._main.getObject())),(Object)(RemoteObject.createImmutable("AccMoney")));
 BA.debugLineNum = 45;BA.debugLine="CallSub(Main,\"ShowBetsPopUp\")";
Debug.ShouldStop(4096);
betpopup.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)((betpopup._main.getObject())),(Object)(RemoteObject.createImmutable("ShowBetsPopUp")));
 };
 BA.debugLineNum = 47;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buildui(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("BuildUI (betpopup) ","betpopup",5,__ref.getField(false, "ba"),__ref,17);
if (RapidSub.canDelegate("buildui")) return __ref.runUserSub(false, "betpopup","buildui", __ref);
 BA.debugLineNum = 17;BA.debugLine="Sub BuildUI";
Debug.ShouldStop(65536);
 BA.debugLineNum = 18;BA.debugLine="background.Color = Colors.ARGB(50,0,0,0)";
Debug.ShouldStop(131072);
__ref.getField(false,"_background").runVoidMethod ("setColor",betpopup.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 50)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 19;BA.debugLine="background.AddView(mainscreen,25%x,25%y,50%x,50%y";
Debug.ShouldStop(262144);
__ref.getField(false,"_background").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_mainscreen").getObject())),(Object)(betpopup.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 25)),__ref.getField(false, "ba"))),(Object)(betpopup.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 25)),__ref.getField(false, "ba"))),(Object)(betpopup.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 50)),__ref.getField(false, "ba"))),(Object)(betpopup.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 50)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 20;BA.debugLine="mainscreen.Color = Colors.LightGray";
Debug.ShouldStop(524288);
__ref.getField(false,"_mainscreen").runVoidMethod ("setColor",betpopup.__c.getField(false,"Colors").getField(true,"LightGray"));
 BA.debugLineNum = 21;BA.debugLine="mainscreen.AddView(entersum,0%x,10%y,50%x,10%y)";
Debug.ShouldStop(1048576);
__ref.getField(false,"_mainscreen").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_entersum").getObject())),(Object)(betpopup.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 0)),__ref.getField(false, "ba"))),(Object)(betpopup.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))),(Object)(betpopup.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 50)),__ref.getField(false, "ba"))),(Object)(betpopup.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 22;BA.debugLine="mainscreen.AddView(submit,20%x,25%y,10%x,10%y)";
Debug.ShouldStop(2097152);
__ref.getField(false,"_mainscreen").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_submit").getObject())),(Object)(betpopup.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 20)),__ref.getField(false, "ba"))),(Object)(betpopup.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 25)),__ref.getField(false, "ba"))),(Object)(betpopup.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))),(Object)(betpopup.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 23;BA.debugLine="submit.Text = \"OK\"";
Debug.ShouldStop(4194304);
__ref.getField(false,"_submit").runMethod(true,"setText",BA.ObjectToCharSequence("OK"));
 BA.debugLineNum = 24;BA.debugLine="entersum.Hint = \"Enter sum\"";
Debug.ShouldStop(8388608);
__ref.getField(false,"_entersum").runMethod(true,"setHint",BA.ObjectToString("Enter sum"));
 BA.debugLineNum = 25;BA.debugLine="entersum.InputType = entersum.INPUT_TYPE_DECIMAL_";
Debug.ShouldStop(16777216);
__ref.getField(false,"_entersum").runMethod(true,"setInputType",__ref.getField(false,"_entersum").getField(true,"INPUT_TYPE_DECIMAL_NUMBERS"));
 BA.debugLineNum = 27;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
 //BA.debugLineNum = 2;BA.debugLine="Dim background As Panel";
betpopup._background = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_background",betpopup._background);
 //BA.debugLineNum = 3;BA.debugLine="Dim mainscreen As Panel";
betpopup._mainscreen = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_mainscreen",betpopup._mainscreen);
 //BA.debugLineNum = 4;BA.debugLine="Dim entersum As EditText";
betpopup._entersum = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_entersum",betpopup._entersum);
 //BA.debugLineNum = 5;BA.debugLine="Dim submit As Button";
betpopup._submit = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_submit",betpopup._submit);
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (betpopup) ","betpopup",5,__ref.getField(false, "ba"),__ref,10);
if (RapidSub.canDelegate("initialize")) return __ref.runUserSub(false, "betpopup","initialize", __ref, _ba);
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(512);
 BA.debugLineNum = 11;BA.debugLine="background.Initialize(\"background\")";
Debug.ShouldStop(1024);
__ref.getField(false,"_background").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("background")));
 BA.debugLineNum = 12;BA.debugLine="mainscreen.Initialize(\"mainscr\")";
Debug.ShouldStop(2048);
__ref.getField(false,"_mainscreen").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("mainscr")));
 BA.debugLineNum = 13;BA.debugLine="entersum.Initialize(\"sumfld\")";
Debug.ShouldStop(4096);
__ref.getField(false,"_entersum").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("sumfld")));
 BA.debugLineNum = 14;BA.debugLine="submit.Initialize(\"btn1\")";
Debug.ShouldStop(8192);
__ref.getField(false,"_submit").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("btn1")));
 BA.debugLineNum = 15;BA.debugLine="BuildUI";
Debug.ShouldStop(16384);
__ref.runClassMethod (b4a.example.betpopup.class, "_buildui");
 BA.debugLineNum = 16;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}