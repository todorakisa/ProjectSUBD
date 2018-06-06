package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class appmaininterface_subs_0 {


public static RemoteObject  _asview(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AsView (appmaininterface) ","appmaininterface",1,__ref.getField(false, "ba"),__ref,33);
if (RapidSub.canDelegate("asview")) return __ref.runUserSub(false, "appmaininterface","asview", __ref);
 BA.debugLineNum = 33;BA.debugLine="Sub AsView As View";
Debug.ShouldStop(1);
 BA.debugLineNum = 34;BA.debugLine="Return pnlmainscreen";
Debug.ShouldStop(2);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_pnlmainscreen").getObject());
 BA.debugLineNum = 35;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
		Debug.PushSubsStack("Build_UI (appmaininterface) ","appmaininterface",1,__ref.getField(false, "ba"),__ref,36);
if (RapidSub.canDelegate("build_ui")) return __ref.runUserSub(false, "appmaininterface","build_ui", __ref);
 BA.debugLineNum = 36;BA.debugLine="Sub Build_UI";
Debug.ShouldStop(8);
 BA.debugLineNum = 37;BA.debugLine="pnlmainscreen.Color = Colors.RGB(24, 96, 178)";
Debug.ShouldStop(16);
__ref.getField(false,"_pnlmainscreen").runVoidMethod ("setColor",appmaininterface.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 24)),(Object)(BA.numberCast(int.class, 96)),(Object)(BA.numberCast(int.class, 178))));
 BA.debugLineNum = 40;BA.debugLine="pnlleftmenu.Color = Colors.ARGB(150,0,0,0)";
Debug.ShouldStop(128);
__ref.getField(false,"_pnlleftmenu").runVoidMethod ("setColor",appmaininterface.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 150)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 41;BA.debugLine="avataricon.SetBackgroundImage(avatarimg)";
Debug.ShouldStop(256);
__ref.getField(false,"_avataricon").runVoidMethod ("SetBackgroundImageNew",(Object)((__ref.getField(false,"_avatarimg").getObject())));
 BA.debugLineNum = 43;BA.debugLine="accountname.Text = Main.currentuser.name";
Debug.ShouldStop(1024);
__ref.getField(false,"_accountname").runMethod(true,"setText",BA.ObjectToCharSequence(appmaininterface._main._currentuser.getField(true,"name")));
 BA.debugLineNum = 44;BA.debugLine="accountname.TextSize = 30";
Debug.ShouldStop(2048);
__ref.getField(false,"_accountname").runMethod(true,"setTextSize",BA.numberCast(float.class, 30));
 BA.debugLineNum = 45;BA.debugLine="If accountname.Text.Length > 6 Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_accountname").runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 6))) { 
 BA.debugLineNum = 46;BA.debugLine="accountname.TextSize = 20";
Debug.ShouldStop(8192);
__ref.getField(false,"_accountname").runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 };
 BA.debugLineNum = 48;BA.debugLine="accountname.TextColor = Colors.White";
Debug.ShouldStop(32768);
__ref.getField(false,"_accountname").runMethod(true,"setTextColor",appmaininterface.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 50;BA.debugLine="accountrank.Text = \"Rank:\"";
Debug.ShouldStop(131072);
__ref.getField(false,"_accountrank").runMethod(true,"setText",BA.ObjectToCharSequence("Rank:"));
 BA.debugLineNum = 51;BA.debugLine="showrank.Text =  Main.currentuser.rank";
Debug.ShouldStop(262144);
__ref.getField(false,"_showrank").runMethod(true,"setText",BA.ObjectToCharSequence(appmaininterface._main._currentuser.getField(true,"rank")));
 BA.debugLineNum = 52;BA.debugLine="accountrank.TextSize = 20";
Debug.ShouldStop(524288);
__ref.getField(false,"_accountrank").runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 53;BA.debugLine="showrank.TextSize = 20";
Debug.ShouldStop(1048576);
__ref.getField(false,"_showrank").runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 54;BA.debugLine="accountrank.TextColor = Colors.White";
Debug.ShouldStop(2097152);
__ref.getField(false,"_accountrank").runMethod(true,"setTextColor",appmaininterface.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 55;BA.debugLine="showrank.TextColor = Colors.White";
Debug.ShouldStop(4194304);
__ref.getField(false,"_showrank").runMethod(true,"setTextColor",appmaininterface.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 58;BA.debugLine="accountbalance.Text = Main.currentuser.money";
Debug.ShouldStop(33554432);
__ref.getField(false,"_accountbalance").runMethod(true,"setText",BA.ObjectToCharSequence(appmaininterface._main._currentuser.getField(true,"money")));
 BA.debugLineNum = 59;BA.debugLine="accountbalance.Textsize = 20";
Debug.ShouldStop(67108864);
__ref.getField(false,"_accountbalance").runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 60;BA.debugLine="accountbalance.TextColor = Colors.White";
Debug.ShouldStop(134217728);
__ref.getField(false,"_accountbalance").runMethod(true,"setTextColor",appmaininterface.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 63;BA.debugLine="btn_logout.Text = \"Log out\"";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_btn_logout").runMethod(true,"setText",BA.ObjectToCharSequence("Log out"));
 BA.debugLineNum = 64;BA.debugLine="HelperFunctions.Apply_ViewStyle(btn_logout,Colors";
Debug.ShouldStop(-2147483648);
appmaininterface._helperfunctions.runVoidMethod ("_apply_viewstyle",__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_btn_logout").getObject()),(Object)(appmaininterface.__c.getField(false,"Colors").getField(true,"Black")),(Object)(appmaininterface.__c.getField(false,"Colors").getField(true,"White")),(Object)(appmaininterface.__c.getField(false,"Colors").getField(true,"White")),(Object)(appmaininterface.__c.getField(false,"Colors").getField(true,"LightGray")),(Object)(appmaininterface.__c.getField(false,"Colors").getField(true,"LightGray")),(Object)(appmaininterface.__c.getField(false,"Colors").getField(true,"Gray")),(Object)(appmaininterface.__c.getField(false,"Colors").getField(true,"Gray")),(Object)(BA.numberCast(int.class, 20)));
 BA.debugLineNum = 66;BA.debugLine="slotmachine.Text = \"Slots\"";
Debug.ShouldStop(2);
__ref.getField(false,"_slotmachine").runMethod(true,"setText",BA.ObjectToCharSequence("Slots"));
 BA.debugLineNum = 67;BA.debugLine="HelperFunctions.Apply_ViewStyle(slotmachine,Color";
Debug.ShouldStop(4);
appmaininterface._helperfunctions.runVoidMethod ("_apply_viewstyle",__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_slotmachine").getObject()),(Object)(appmaininterface.__c.getField(false,"Colors").getField(true,"Black")),(Object)(appmaininterface.__c.getField(false,"Colors").getField(true,"White")),(Object)(appmaininterface.__c.getField(false,"Colors").getField(true,"White")),(Object)(appmaininterface.__c.getField(false,"Colors").getField(true,"LightGray")),(Object)(appmaininterface.__c.getField(false,"Colors").getField(true,"LightGray")),(Object)(appmaininterface.__c.getField(false,"Colors").getField(true,"Gray")),(Object)(appmaininterface.__c.getField(false,"Colors").getField(true,"Gray")),(Object)(BA.numberCast(int.class, 20)));
 BA.debugLineNum = 69;BA.debugLine="If Main.currentuser.rank = \"Admin\" Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",appmaininterface._main._currentuser.getField(true,"rank"),BA.ObjectToString("Admin"))) { 
 BA.debugLineNum = 70;BA.debugLine="pnlmainscreen.AddView(actionsforadmin.TabhostAct";
Debug.ShouldStop(32);
__ref.getField(false,"_pnlmainscreen").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_actionsforadmin").getField(false,"_tabhostactions").getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {appmaininterface.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 20)),__ref.getField(false, "ba")),appmaininterface.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))}, "-",1, 1)),(Object)(appmaininterface.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 0)),__ref.getField(false, "ba"))),(Object)(appmaininterface.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 82)),__ref.getField(false, "ba"))),(Object)(appmaininterface.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))));
 }else 
{ BA.debugLineNum = 71;BA.debugLine="Else if Main.currentuser.rank = \"user\" Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",appmaininterface._main._currentuser.getField(true,"rank"),BA.ObjectToString("user"))) { 
 BA.debugLineNum = 72;BA.debugLine="pnlmainscreen.AddView(actionsforuser.TabhostActi";
Debug.ShouldStop(128);
__ref.getField(false,"_pnlmainscreen").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_actionsforuser").getField(false,"_tabhostactions").getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {appmaininterface.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 20)),__ref.getField(false, "ba")),appmaininterface.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))}, "-",1, 1)),(Object)(appmaininterface.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 0)),__ref.getField(false, "ba"))),(Object)(appmaininterface.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 82)),__ref.getField(false, "ba"))),(Object)(appmaininterface.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))));
 }}
;
 BA.debugLineNum = 76;BA.debugLine="pnlmainscreen.AddView(pnlleftmenu,0,0,20%x,100%y)";
Debug.ShouldStop(2048);
__ref.getField(false,"_pnlmainscreen").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_pnlleftmenu").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(appmaininterface.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 20)),__ref.getField(false, "ba"))),(Object)(appmaininterface.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 77;BA.debugLine="pnlleftmenu.AddView(avataricon,0,0,20%x,25%y)";
Debug.ShouldStop(4096);
__ref.getField(false,"_pnlleftmenu").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_avataricon").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(appmaininterface.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 20)),__ref.getField(false, "ba"))),(Object)(appmaininterface.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 25)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 78;BA.debugLine="pnlleftmenu.AddView(accountname,pnlleftmenu.Left";
Debug.ShouldStop(8192);
__ref.getField(false,"_pnlleftmenu").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_accountname").getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_pnlleftmenu").runMethod(true,"getLeft"),appmaininterface.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 1)),__ref.getField(false, "ba"))}, "+",1, 1)),(Object)(appmaininterface.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 25)),__ref.getField(false, "ba"))),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_pnlleftmenu").runMethod(true,"getWidth"),appmaininterface.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),__ref.getField(false, "ba"))}, "-",1, 1)),(Object)(appmaininterface.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 79;BA.debugLine="pnlleftmenu.AddView(accountrank,pnlleftmenu.Left";
Debug.ShouldStop(16384);
__ref.getField(false,"_pnlleftmenu").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_accountrank").getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_pnlleftmenu").runMethod(true,"getLeft"),appmaininterface.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 1)),__ref.getField(false, "ba"))}, "+",1, 1)),(Object)(appmaininterface.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 35)),__ref.getField(false, "ba"))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_pnlleftmenu").runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(appmaininterface.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 80;BA.debugLine="pnlleftmenu.AddView(showrank,(accountrank.Left +";
Debug.ShouldStop(32768);
__ref.getField(false,"_pnlleftmenu").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_showrank").getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_accountrank").runMethod(true,"getLeft"),__ref.getField(false,"_accountrank").runMethod(true,"getWidth")}, "+",1, 1)),appmaininterface.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 1)),__ref.getField(false, "ba"))}, "+",1, 1)),(Object)(appmaininterface.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 35)),__ref.getField(false, "ba"))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_pnlleftmenu").runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(appmaininterface.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 81;BA.debugLine="pnlleftmenu.AddView(accountbalance,pnlleftmenu.Le";
Debug.ShouldStop(65536);
__ref.getField(false,"_pnlleftmenu").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_accountbalance").getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_pnlleftmenu").runMethod(true,"getLeft"),appmaininterface.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 1)),__ref.getField(false, "ba"))}, "+",1, 1)),(Object)(appmaininterface.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 45)),__ref.getField(false, "ba"))),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_pnlleftmenu").runMethod(true,"getWidth"),appmaininterface.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),__ref.getField(false, "ba"))}, "-",1, 1)),(Object)(appmaininterface.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 83;BA.debugLine="pnlleftmenu.AddView(slotmachine,pnlleftmenu.Left";
Debug.ShouldStop(262144);
__ref.getField(false,"_pnlleftmenu").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_slotmachine").getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_pnlleftmenu").runMethod(true,"getLeft"),appmaininterface.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 1)),__ref.getField(false, "ba"))}, "+",1, 1)),(Object)(appmaininterface.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 65)),__ref.getField(false, "ba"))),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_pnlleftmenu").runMethod(true,"getWidth"),appmaininterface.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),__ref.getField(false, "ba"))}, "-",1, 1)),(Object)(__ref.getField(false,"_accountname").runMethod(true,"getHeight")));
 BA.debugLineNum = 84;BA.debugLine="pnlleftmenu.AddView(btn_logout,pnlleftmenu.Left +";
Debug.ShouldStop(524288);
__ref.getField(false,"_pnlleftmenu").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_btn_logout").getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_pnlleftmenu").runMethod(true,"getLeft"),appmaininterface.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 1)),__ref.getField(false, "ba"))}, "+",1, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_slotmachine").runMethod(true,"getTop"),__ref.getField(false,"_slotmachine").runMethod(true,"getHeight")}, "+",1, 1)),appmaininterface.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))}, "+",1, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_pnlleftmenu").runMethod(true,"getWidth"),appmaininterface.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),__ref.getField(false, "ba"))}, "-",1, 1)),(Object)(__ref.getField(false,"_slotmachine").runMethod(true,"getHeight")));
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Dim pnlmainscreen,pnlleftmenu As Panel";
appmaininterface._pnlmainscreen = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnlmainscreen",appmaininterface._pnlmainscreen);
appmaininterface._pnlleftmenu = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnlleftmenu",appmaininterface._pnlleftmenu);
 //BA.debugLineNum = 3;BA.debugLine="Dim avataricon,btn_logout,slotmachine As Button";
appmaininterface._avataricon = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_avataricon",appmaininterface._avataricon);
appmaininterface._btn_logout = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_btn_logout",appmaininterface._btn_logout);
appmaininterface._slotmachine = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_slotmachine",appmaininterface._slotmachine);
 //BA.debugLineNum = 4;BA.debugLine="Dim avatarimg As Bitmap = LoadBitmapSample(File.D";
appmaininterface._avatarimg = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
appmaininterface._avatarimg = appmaininterface.__c.runMethod(false,"LoadBitmapSample",(Object)(appmaininterface.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("avatar.png")),(Object)(appmaininterface.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 215)))),(Object)(appmaininterface.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 215)))));__ref.setField("_avatarimg",appmaininterface._avatarimg);
 //BA.debugLineNum = 5;BA.debugLine="Dim accountname,accountbalance,accountrank,showba";
appmaininterface._accountname = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_accountname",appmaininterface._accountname);
appmaininterface._accountbalance = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_accountbalance",appmaininterface._accountbalance);
appmaininterface._accountrank = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_accountrank",appmaininterface._accountrank);
appmaininterface._showbalance = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_showbalance",appmaininterface._showbalance);
appmaininterface._showrank = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_showrank",appmaininterface._showrank);
 //BA.debugLineNum = 6;BA.debugLine="Dim actionsforuser As UserActions";
appmaininterface._actionsforuser = RemoteObject.createNew ("b4a.example.useractions");__ref.setField("_actionsforuser",appmaininterface._actionsforuser);
 //BA.debugLineNum = 7;BA.debugLine="Dim actionsforadmin As AdminActions";
appmaininterface._actionsforadmin = RemoteObject.createNew ("b4a.example.adminactions");__ref.setField("_actionsforadmin",appmaininterface._actionsforadmin);
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (appmaininterface) ","appmaininterface",1,__ref.getField(false, "ba"),__ref,11);
if (RapidSub.canDelegate("initialize")) return __ref.runUserSub(false, "appmaininterface","initialize", __ref, _ba);
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 11;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(1024);
 BA.debugLineNum = 13;BA.debugLine="pnlmainscreen.Initialize(\"mainscreen\")";
Debug.ShouldStop(4096);
__ref.getField(false,"_pnlmainscreen").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("mainscreen")));
 BA.debugLineNum = 14;BA.debugLine="pnlleftmenu.Initialize(\"leftmenu\")";
Debug.ShouldStop(8192);
__ref.getField(false,"_pnlleftmenu").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("leftmenu")));
 BA.debugLineNum = 17;BA.debugLine="avataricon.Initialize(\"\")";
Debug.ShouldStop(65536);
__ref.getField(false,"_avataricon").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 18;BA.debugLine="accountname.Initialize(\"\")";
Debug.ShouldStop(131072);
__ref.getField(false,"_accountname").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 19;BA.debugLine="accountrank.Initialize(\"\")";
Debug.ShouldStop(262144);
__ref.getField(false,"_accountrank").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 20;BA.debugLine="accountbalance.Initialize(\"\")";
Debug.ShouldStop(524288);
__ref.getField(false,"_accountbalance").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 21;BA.debugLine="showbalance.Initialize(\"\")";
Debug.ShouldStop(1048576);
__ref.getField(false,"_showbalance").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 22;BA.debugLine="showrank.Initialize(\"\")";
Debug.ShouldStop(2097152);
__ref.getField(false,"_showrank").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 24;BA.debugLine="actionsforuser.Initialize";
Debug.ShouldStop(8388608);
__ref.getField(false,"_actionsforuser").runClassMethod (b4a.example.useractions.class, "_initialize",__ref.getField(false, "ba"));
 BA.debugLineNum = 25;BA.debugLine="actionsforadmin.Initialize";
Debug.ShouldStop(16777216);
__ref.getField(false,"_actionsforadmin").runClassMethod (b4a.example.adminactions.class, "_initialize",__ref.getField(false, "ba"));
 BA.debugLineNum = 27;BA.debugLine="btn_logout.Initialize(\"logout\")";
Debug.ShouldStop(67108864);
__ref.getField(false,"_btn_logout").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("logout")));
 BA.debugLineNum = 28;BA.debugLine="slotmachine.Initialize(\"slotz\")";
Debug.ShouldStop(134217728);
__ref.getField(false,"_slotmachine").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("slotz")));
 BA.debugLineNum = 30;BA.debugLine="Build_UI";
Debug.ShouldStop(536870912);
__ref.runClassMethod (b4a.example.appmaininterface.class, "_build_ui");
 BA.debugLineNum = 32;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("logout_Click (appmaininterface) ","appmaininterface",1,__ref.getField(false, "ba"),__ref,90);
if (RapidSub.canDelegate("logout_click")) return __ref.runUserSub(false, "appmaininterface","logout_click", __ref);
 BA.debugLineNum = 90;BA.debugLine="Sub logout_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 91;BA.debugLine="CallSub(Main,\"ShowHideMainUI\")";
Debug.ShouldStop(67108864);
appmaininterface.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)((appmaininterface._main.getObject())),(Object)(RemoteObject.createImmutable("ShowHideMainUI")));
 BA.debugLineNum = 92;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _slotz_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("slotz_Click (appmaininterface) ","appmaininterface",1,__ref.getField(false, "ba"),__ref,86);
if (RapidSub.canDelegate("slotz_click")) return __ref.runUserSub(false, "appmaininterface","slotz_click", __ref);
 BA.debugLineNum = 86;BA.debugLine="Sub slotz_Click";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 87;BA.debugLine="CallSub(Main,\"ShowHideSlotGame\")";
Debug.ShouldStop(4194304);
appmaininterface.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)((appmaininterface._main.getObject())),(Object)(RemoteObject.createImmutable("ShowHideSlotGame")));
 BA.debugLineNum = 88;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}