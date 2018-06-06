package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class admininterface_subs_0 {


public static RemoteObject  _accountmoney(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AccountMoney (admininterface) ","admininterface",10,__ref.getField(false, "ba"),__ref,87);
if (RapidSub.canDelegate("accountmoney")) return __ref.runUserSub(false, "admininterface","accountmoney", __ref);
 BA.debugLineNum = 87;BA.debugLine="Sub AccountMoney";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 88;BA.debugLine="accountbalance.Text = \"Earned funds:\" & CRLF & Ma";
Debug.ShouldStop(8388608);
__ref.getField(false,"_accountbalance").runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Earned funds:"),admininterface.__c.getField(true,"CRLF"),admininterface._main._admin.getField(true,"funds"))));
 BA.debugLineNum = 89;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _build_ui(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Build_UI (admininterface) ","admininterface",10,__ref.getField(false, "ba"),__ref,41);
if (RapidSub.canDelegate("build_ui")) return __ref.runUserSub(false, "admininterface","build_ui", __ref);
 BA.debugLineNum = 41;BA.debugLine="Sub Build_UI";
Debug.ShouldStop(256);
 BA.debugLineNum = 42;BA.debugLine="pnlmainscreen.Color = Colors.RGB(24, 96, 178)";
Debug.ShouldStop(512);
__ref.getField(false,"_pnlmainscreen").runVoidMethod ("setColor",admininterface.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 24)),(Object)(BA.numberCast(int.class, 96)),(Object)(BA.numberCast(int.class, 178))));
 BA.debugLineNum = 43;BA.debugLine="pnlmainscreen.AddView(pnlleftmenu,0,0,20%x,100%y)";
Debug.ShouldStop(1024);
__ref.getField(false,"_pnlmainscreen").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_pnlleftmenu").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(admininterface.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 20)),__ref.getField(false, "ba"))),(Object)(admininterface.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 45;BA.debugLine="pnlleftmenu.Color = Colors.RGB(255, 108, 0)";
Debug.ShouldStop(4096);
__ref.getField(false,"_pnlleftmenu").runVoidMethod ("setColor",admininterface.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 108)),(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 47;BA.debugLine="pnlleftmenu.AddView(avataricon,0,0,20%x,25%y)";
Debug.ShouldStop(16384);
__ref.getField(false,"_pnlleftmenu").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_avataricon").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(admininterface.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 20)),__ref.getField(false, "ba"))),(Object)(admininterface.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 25)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 48;BA.debugLine="avataricon.SetBackgroundImage(avatarimg)";
Debug.ShouldStop(32768);
__ref.getField(false,"_avataricon").runVoidMethod ("SetBackgroundImageNew",(Object)((__ref.getField(false,"_avatarimg").getObject())));
 BA.debugLineNum = 50;BA.debugLine="pnlleftmenu.AddView(accountname,2%x,25%y,20%x,10%";
Debug.ShouldStop(131072);
__ref.getField(false,"_pnlleftmenu").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_accountname").getObject())),(Object)(admininterface.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),__ref.getField(false, "ba"))),(Object)(admininterface.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 25)),__ref.getField(false, "ba"))),(Object)(admininterface.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 20)),__ref.getField(false, "ba"))),(Object)(admininterface.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 51;BA.debugLine="accountname.Text = Main.admin.name";
Debug.ShouldStop(262144);
__ref.getField(false,"_accountname").runMethod(true,"setText",BA.ObjectToCharSequence(admininterface._main._admin.getField(true,"name")));
 BA.debugLineNum = 52;BA.debugLine="accountname.TextSize = 40";
Debug.ShouldStop(524288);
__ref.getField(false,"_accountname").runMethod(true,"setTextSize",BA.numberCast(float.class, 40));
 BA.debugLineNum = 53;BA.debugLine="accountname.TextColor = Colors.Black";
Debug.ShouldStop(1048576);
__ref.getField(false,"_accountname").runMethod(true,"setTextColor",admininterface.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 55;BA.debugLine="pnlleftmenu.AddView(accountrank,2%x,35%y,20%x,10%";
Debug.ShouldStop(4194304);
__ref.getField(false,"_pnlleftmenu").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_accountrank").getObject())),(Object)(admininterface.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),__ref.getField(false, "ba"))),(Object)(admininterface.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 35)),__ref.getField(false, "ba"))),(Object)(admininterface.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 20)),__ref.getField(false, "ba"))),(Object)(admininterface.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 56;BA.debugLine="accountrank.Text = \"Rank:\" & \" \" & Main.admin.ran";
Debug.ShouldStop(8388608);
__ref.getField(false,"_accountrank").runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Rank:"),RemoteObject.createImmutable(" "),admininterface._main._admin.getField(true,"rank"))));
 BA.debugLineNum = 57;BA.debugLine="accountrank.TextSize = 25";
Debug.ShouldStop(16777216);
__ref.getField(false,"_accountrank").runMethod(true,"setTextSize",BA.numberCast(float.class, 25));
 BA.debugLineNum = 58;BA.debugLine="accountrank.TextColor = Colors.Black";
Debug.ShouldStop(33554432);
__ref.getField(false,"_accountrank").runMethod(true,"setTextColor",admininterface.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 60;BA.debugLine="pnlleftmenu.AddView(accountbalance,2%x,45%y,20%x,";
Debug.ShouldStop(134217728);
__ref.getField(false,"_pnlleftmenu").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_accountbalance").getObject())),(Object)(admininterface.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),__ref.getField(false, "ba"))),(Object)(admininterface.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 45)),__ref.getField(false, "ba"))),(Object)(admininterface.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 20)),__ref.getField(false, "ba"))),(Object)(admininterface.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 15)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 61;BA.debugLine="accountbalance.TextSize = 25";
Debug.ShouldStop(268435456);
__ref.getField(false,"_accountbalance").runMethod(true,"setTextSize",BA.numberCast(float.class, 25));
 BA.debugLineNum = 62;BA.debugLine="accountbalance.Text = \"Funds:\" & Main.admin.funds";
Debug.ShouldStop(536870912);
__ref.getField(false,"_accountbalance").runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Funds:"),admininterface._main._admin.getField(true,"funds"))));
 BA.debugLineNum = 63;BA.debugLine="accountbalance.TextColor = Colors.Black";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_accountbalance").runMethod(true,"setTextColor",admininterface.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 65;BA.debugLine="pnlleftmenu.AddView(btn_logout,1%x,55%y,18%x,10%y";
Debug.ShouldStop(1);
__ref.getField(false,"_pnlleftmenu").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_btn_logout").getObject())),(Object)(admininterface.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 1)),__ref.getField(false, "ba"))),(Object)(admininterface.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 55)),__ref.getField(false, "ba"))),(Object)(admininterface.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 18)),__ref.getField(false, "ba"))),(Object)(admininterface.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 66;BA.debugLine="btn_logout.Color = Colors.ARGB(100,0,0,0)";
Debug.ShouldStop(2);
__ref.getField(false,"_btn_logout").runVoidMethod ("setColor",admininterface.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 100)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 67;BA.debugLine="btn_logout.Text = \"Log out\"";
Debug.ShouldStop(4);
__ref.getField(false,"_btn_logout").runMethod(true,"setText",BA.ObjectToCharSequence("Log out"));
 BA.debugLineNum = 68;BA.debugLine="btn_logout.TextColor = Colors.White";
Debug.ShouldStop(8);
__ref.getField(false,"_btn_logout").runMethod(true,"setTextColor",admininterface.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 70;BA.debugLine="pnlleftmenu.AddView(promote,1%x,65%y,18%x,10%y)";
Debug.ShouldStop(32);
__ref.getField(false,"_pnlleftmenu").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_promote").getObject())),(Object)(admininterface.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 1)),__ref.getField(false, "ba"))),(Object)(admininterface.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 65)),__ref.getField(false, "ba"))),(Object)(admininterface.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 18)),__ref.getField(false, "ba"))),(Object)(admininterface.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 71;BA.debugLine="promote.Color = Colors.ARGB(100,0,0,0)";
Debug.ShouldStop(64);
__ref.getField(false,"_promote").runVoidMethod ("setColor",admininterface.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 100)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 72;BA.debugLine="promote.Text = \"Promote\"";
Debug.ShouldStop(128);
__ref.getField(false,"_promote").runMethod(true,"setText",BA.ObjectToCharSequence("Promote"));
 BA.debugLineNum = 74;BA.debugLine="pnlmainscreen.AddView(actionsforadmin.TabhostActi";
Debug.ShouldStop(512);
__ref.getField(false,"_pnlmainscreen").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_actionsforadmin").getField(false,"_tabhostactions").getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {admininterface.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 20)),__ref.getField(false, "ba")),admininterface.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))}, "-",1, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {admininterface.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 0)),__ref.getField(false, "ba")),admininterface.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))}, "-",1, 1)),(Object)(admininterface.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 82)),__ref.getField(false, "ba"))),(Object)(RemoteObject.solve(new RemoteObject[] {admininterface.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba")),admininterface.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))}, "+",1, 1)));
 BA.debugLineNum = 76;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
admininterface._pnlmainscreen = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnlmainscreen",admininterface._pnlmainscreen);
 //BA.debugLineNum = 3;BA.debugLine="Dim pnlleftmenu As Panel";
admininterface._pnlleftmenu = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnlleftmenu",admininterface._pnlleftmenu);
 //BA.debugLineNum = 4;BA.debugLine="Dim pnluppermenu As Panel";
admininterface._pnluppermenu = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnluppermenu",admininterface._pnluppermenu);
 //BA.debugLineNum = 6;BA.debugLine="Dim avataricon As Button";
admininterface._avataricon = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_avataricon",admininterface._avataricon);
 //BA.debugLineNum = 7;BA.debugLine="Dim avatarimg As Bitmap = LoadBitmapSample(File.D";
admininterface._avatarimg = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
admininterface._avatarimg = admininterface.__c.runMethod(false,"LoadBitmapSample",(Object)(admininterface.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("avatar2.png")),(Object)(admininterface.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 215)))),(Object)(admininterface.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 215)))));__ref.setField("_avatarimg",admininterface._avatarimg);
 //BA.debugLineNum = 8;BA.debugLine="Dim accountname As Label";
admininterface._accountname = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_accountname",admininterface._accountname);
 //BA.debugLineNum = 9;BA.debugLine="Dim accountrank As Label";
admininterface._accountrank = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_accountrank",admininterface._accountrank);
 //BA.debugLineNum = 10;BA.debugLine="Dim accountbalance As Label";
admininterface._accountbalance = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_accountbalance",admininterface._accountbalance);
 //BA.debugLineNum = 12;BA.debugLine="Dim actionsforadmin As AdminActions";
admininterface._actionsforadmin = RemoteObject.createNew ("b4a.example.adminactions");__ref.setField("_actionsforadmin",admininterface._actionsforadmin);
 //BA.debugLineNum = 14;BA.debugLine="Dim btn_logout As Button";
admininterface._btn_logout = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_btn_logout",admininterface._btn_logout);
 //BA.debugLineNum = 16;BA.debugLine="Dim promote As Button";
admininterface._promote = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_promote",admininterface._promote);
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (admininterface) ","admininterface",10,__ref.getField(false, "ba"),__ref,21);
if (RapidSub.canDelegate("initialize")) return __ref.runUserSub(false, "admininterface","initialize", __ref, _ba);
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 21;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 23;BA.debugLine="pnlmainscreen.Initialize(\"mainscreen\")";
Debug.ShouldStop(4194304);
__ref.getField(false,"_pnlmainscreen").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("mainscreen")));
 BA.debugLineNum = 24;BA.debugLine="pnlleftmenu.Initialize(\"leftmenu\")";
Debug.ShouldStop(8388608);
__ref.getField(false,"_pnlleftmenu").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("leftmenu")));
 BA.debugLineNum = 27;BA.debugLine="avataricon.Initialize(\"avatar\")";
Debug.ShouldStop(67108864);
__ref.getField(false,"_avataricon").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("avatar")));
 BA.debugLineNum = 28;BA.debugLine="accountname.Initialize(\"username\")";
Debug.ShouldStop(134217728);
__ref.getField(false,"_accountname").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("username")));
 BA.debugLineNum = 29;BA.debugLine="accountrank.Initialize(\"rank\")";
Debug.ShouldStop(268435456);
__ref.getField(false,"_accountrank").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("rank")));
 BA.debugLineNum = 30;BA.debugLine="accountbalance.Initialize(\"money\")";
Debug.ShouldStop(536870912);
__ref.getField(false,"_accountbalance").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("money")));
 BA.debugLineNum = 32;BA.debugLine="actionsforadmin.Initialize";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_actionsforadmin").runClassMethod (b4a.example.adminactions.class, "_initialize",__ref.getField(false, "ba"));
 BA.debugLineNum = 34;BA.debugLine="btn_logout.Initialize(\"logout\")";
Debug.ShouldStop(2);
__ref.getField(false,"_btn_logout").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("logout")));
 BA.debugLineNum = 36;BA.debugLine="promote.Initialize(\"promote1\")";
Debug.ShouldStop(8);
__ref.getField(false,"_promote").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("promote1")));
 BA.debugLineNum = 37;BA.debugLine="Build_UI";
Debug.ShouldStop(16);
__ref.runClassMethod (b4a.example.admininterface.class, "_build_ui");
 BA.debugLineNum = 39;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _logout_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("logout_Click (admininterface) ","admininterface",10,__ref.getField(false, "ba"),__ref,83);
if (RapidSub.canDelegate("logout_click")) return __ref.runUserSub(false, "admininterface","logout_click", __ref);
 BA.debugLineNum = 83;BA.debugLine="Sub logout_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 84;BA.debugLine="CallSub(Main,\"LogOUTadminUI\")";
Debug.ShouldStop(524288);
admininterface.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)((admininterface._main.getObject())),(Object)(RemoteObject.createImmutable("LogOUTadminUI")));
 BA.debugLineNum = 85;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _promote1_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("promote1_Click (admininterface) ","admininterface",10,__ref.getField(false, "ba"),__ref,78);
if (RapidSub.canDelegate("promote1_click")) return __ref.runUserSub(false, "admininterface","promote1_click", __ref);
 BA.debugLineNum = 78;BA.debugLine="Sub promote1_Click";
Debug.ShouldStop(8192);
 BA.debugLineNum = 79;BA.debugLine="CallSub(Main,\"BuildPromoteBar\")";
Debug.ShouldStop(16384);
admininterface.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)((admininterface._main.getObject())),(Object)(RemoteObject.createImmutable("BuildPromoteBar")));
 BA.debugLineNum = 80;BA.debugLine="CallSub(Main,\"ShowRankUpdate\")";
Debug.ShouldStop(32768);
admininterface.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)((admininterface._main.getObject())),(Object)(RemoteObject.createImmutable("ShowRankUpdate")));
 BA.debugLineNum = 81;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}