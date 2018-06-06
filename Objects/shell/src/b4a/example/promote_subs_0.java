package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class promote_subs_0 {


public static RemoteObject  _background_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("background_Click (promote) ","promote",11,__ref.getField(false, "ba"),__ref,32);
if (RapidSub.canDelegate("background_click")) return __ref.runUserSub(false, "promote","background_click", __ref);
 BA.debugLineNum = 32;BA.debugLine="Sub background_Click As Boolean";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 33;BA.debugLine="Return True";
Debug.ShouldStop(1);
if (true) return promote.__c.getField(true,"True");
 BA.debugLineNum = 34;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
		Debug.PushSubsStack("btn1_Click (promote) ","promote",11,__ref.getField(false, "ba"),__ref,36);
if (RapidSub.canDelegate("btn1_click")) return __ref.runUserSub(false, "promote","btn1_click", __ref);
 BA.debugLineNum = 36;BA.debugLine="Sub btn1_Click";
Debug.ShouldStop(8);
 BA.debugLineNum = 37;BA.debugLine="If enterrank.Text = \"\" Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_enterrank").runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 38;BA.debugLine="ToastMessageShow(\"Nothing entered\",False)";
Debug.ShouldStop(32);
promote.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Nothing entered")),(Object)(promote.__c.getField(true,"False")));
 BA.debugLineNum = 39;BA.debugLine="CallSub(Main,\"ShowRankUpdate\")";
Debug.ShouldStop(64);
promote.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)((promote._main.getObject())),(Object)(RemoteObject.createImmutable("ShowRankUpdate")));
 }else {
 BA.debugLineNum = 42;BA.debugLine="Main.database.ExecNonQuery(\"UPDATE  Users SET Ra";
Debug.ShouldStop(512);
promote._main._database.runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE  Users SET Rank = '"),__ref.getField(false,"_enterrank").runMethod(true,"getText"),RemoteObject.createImmutable("' WHERE Username = '"),__ref.getField(false,"_enterusername").runMethod(true,"getText"),RemoteObject.createImmutable("'"))));
 BA.debugLineNum = 43;BA.debugLine="CallSub(Main,\"ShowRankUpdate\")";
Debug.ShouldStop(1024);
promote.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)((promote._main.getObject())),(Object)(RemoteObject.createImmutable("ShowRankUpdate")));
 };
 BA.debugLineNum = 45;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("BuildUI (promote) ","promote",11,__ref.getField(false, "ba"),__ref,19);
if (RapidSub.canDelegate("buildui")) return __ref.runUserSub(false, "promote","buildui", __ref);
 BA.debugLineNum = 19;BA.debugLine="Sub BuildUI";
Debug.ShouldStop(262144);
 BA.debugLineNum = 20;BA.debugLine="background.Color = Colors.ARGB(50,0,0,0)";
Debug.ShouldStop(524288);
__ref.getField(false,"_background").runVoidMethod ("setColor",promote.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 50)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 21;BA.debugLine="background.AddView(mainscreen,25%x,25%y,50%x,50%y";
Debug.ShouldStop(1048576);
__ref.getField(false,"_background").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_mainscreen").getObject())),(Object)(promote.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 25)),__ref.getField(false, "ba"))),(Object)(promote.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 25)),__ref.getField(false, "ba"))),(Object)(promote.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 50)),__ref.getField(false, "ba"))),(Object)(promote.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 50)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 22;BA.debugLine="mainscreen.Color = Colors.LightGray";
Debug.ShouldStop(2097152);
__ref.getField(false,"_mainscreen").runVoidMethod ("setColor",promote.__c.getField(false,"Colors").getField(true,"LightGray"));
 BA.debugLineNum = 23;BA.debugLine="mainscreen.AddView(enterrank,0%x,20%y,50%x,10%y)";
Debug.ShouldStop(4194304);
__ref.getField(false,"_mainscreen").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_enterrank").getObject())),(Object)(promote.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 0)),__ref.getField(false, "ba"))),(Object)(promote.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 20)),__ref.getField(false, "ba"))),(Object)(promote.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 50)),__ref.getField(false, "ba"))),(Object)(promote.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 24;BA.debugLine="mainscreen.AddView(enterusername,0%x,10%y,50%x,10";
Debug.ShouldStop(8388608);
__ref.getField(false,"_mainscreen").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_enterusername").getObject())),(Object)(promote.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 0)),__ref.getField(false, "ba"))),(Object)(promote.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))),(Object)(promote.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 50)),__ref.getField(false, "ba"))),(Object)(promote.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 25;BA.debugLine="mainscreen.AddView(submit,20%x,35%y,10%x,10%y)";
Debug.ShouldStop(16777216);
__ref.getField(false,"_mainscreen").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_submit").getObject())),(Object)(promote.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 20)),__ref.getField(false, "ba"))),(Object)(promote.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 35)),__ref.getField(false, "ba"))),(Object)(promote.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))),(Object)(promote.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 26;BA.debugLine="submit.Text = \"OK\"";
Debug.ShouldStop(33554432);
__ref.getField(false,"_submit").runMethod(true,"setText",BA.ObjectToCharSequence("OK"));
 BA.debugLineNum = 27;BA.debugLine="enterrank.Hint = \"Enter new rank\"";
Debug.ShouldStop(67108864);
__ref.getField(false,"_enterrank").runMethod(true,"setHint",BA.ObjectToString("Enter new rank"));
 BA.debugLineNum = 28;BA.debugLine="enterusername.Hint = \"Enter user\"";
Debug.ShouldStop(134217728);
__ref.getField(false,"_enterusername").runMethod(true,"setHint",BA.ObjectToString("Enter user"));
 BA.debugLineNum = 30;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
promote._background = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_background",promote._background);
 //BA.debugLineNum = 3;BA.debugLine="Dim mainscreen As Panel";
promote._mainscreen = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_mainscreen",promote._mainscreen);
 //BA.debugLineNum = 4;BA.debugLine="Dim enterusername As EditText";
promote._enterusername = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_enterusername",promote._enterusername);
 //BA.debugLineNum = 5;BA.debugLine="Dim enterrank As EditText";
promote._enterrank = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_enterrank",promote._enterrank);
 //BA.debugLineNum = 6;BA.debugLine="Dim submit As Button";
promote._submit = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_submit",promote._submit);
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (promote) ","promote",11,__ref.getField(false, "ba"),__ref,11);
if (RapidSub.canDelegate("initialize")) return __ref.runUserSub(false, "promote","initialize", __ref, _ba);
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 11;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(1024);
 BA.debugLineNum = 12;BA.debugLine="background.Initialize(\"background\")";
Debug.ShouldStop(2048);
__ref.getField(false,"_background").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("background")));
 BA.debugLineNum = 13;BA.debugLine="mainscreen.Initialize(\"mainscr\")";
Debug.ShouldStop(4096);
__ref.getField(false,"_mainscreen").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("mainscr")));
 BA.debugLineNum = 14;BA.debugLine="enterrank.Initialize(\"newrank\")";
Debug.ShouldStop(8192);
__ref.getField(false,"_enterrank").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("newrank")));
 BA.debugLineNum = 15;BA.debugLine="submit.Initialize(\"btn1\")";
Debug.ShouldStop(16384);
__ref.getField(false,"_submit").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("btn1")));
 BA.debugLineNum = 16;BA.debugLine="enterusername.Initialize(\"username\")";
Debug.ShouldStop(32768);
__ref.getField(false,"_enterusername").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("username")));
 BA.debugLineNum = 17;BA.debugLine="BuildUI";
Debug.ShouldStop(65536);
__ref.runClassMethod (b4a.example.promote.class, "_buildui");
 BA.debugLineNum = 18;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}