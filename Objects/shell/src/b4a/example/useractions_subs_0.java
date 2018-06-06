package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class useractions_subs_0 {


public static RemoteObject  _activebets_content(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ActiveBets_Content (useractions) ","useractions",2,__ref.getField(false, "ba"),__ref,56);
if (RapidSub.canDelegate("activebets_content")) return __ref.runUserSub(false, "useractions","activebets_content", __ref);
 BA.debugLineNum = 56;BA.debugLine="Sub ActiveBets_Content";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 57;BA.debugLine="pnl_bets.Color = Colors.White";
Debug.ShouldStop(16777216);
__ref.getField(false,"_pnl_bets").runVoidMethod ("setColor",useractions.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 58;BA.debugLine="contenthold.Color = Colors.LightGray";
Debug.ShouldStop(33554432);
__ref.getField(false,"_contenthold").runVoidMethod ("setColor",useractions.__c.getField(false,"Colors").getField(true,"LightGray"));
 BA.debugLineNum = 60;BA.debugLine="betteamA.Color = Colors.RGB(0, 153, 0)";
Debug.ShouldStop(134217728);
__ref.getField(false,"_betteama").runVoidMethod ("setColor",useractions.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 153)),(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 61;BA.debugLine="betteamA.Text = \"Bet\"";
Debug.ShouldStop(268435456);
__ref.getField(false,"_betteama").runMethod(true,"setText",BA.ObjectToCharSequence("Bet"));
 BA.debugLineNum = 62;BA.debugLine="betteamA.TextSize = 40";
Debug.ShouldStop(536870912);
__ref.getField(false,"_betteama").runMethod(true,"setTextSize",BA.numberCast(float.class, 40));
 BA.debugLineNum = 63;BA.debugLine="betteamA.Gravity = Gravity.CENTER";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_betteama").runMethod(true,"setGravity",useractions.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 65;BA.debugLine="betteamB.Color = Colors.RGB(0, 153, 0)";
Debug.ShouldStop(1);
__ref.getField(false,"_betteamb").runVoidMethod ("setColor",useractions.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 153)),(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 66;BA.debugLine="betteamB.Text = \"Bet\"";
Debug.ShouldStop(2);
__ref.getField(false,"_betteamb").runMethod(true,"setText",BA.ObjectToCharSequence("Bet"));
 BA.debugLineNum = 67;BA.debugLine="betteamB.TextSize = 40";
Debug.ShouldStop(4);
__ref.getField(false,"_betteamb").runMethod(true,"setTextSize",BA.numberCast(float.class, 40));
 BA.debugLineNum = 68;BA.debugLine="betteamB.Gravity = Gravity.CENTER";
Debug.ShouldStop(8);
__ref.getField(false,"_betteamb").runMethod(true,"setGravity",useractions.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 70;BA.debugLine="teamAname.TextColor = Colors.Black";
Debug.ShouldStop(32);
__ref.getField(false,"_teamaname").runMethod(true,"setTextColor",useractions.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 71;BA.debugLine="teamBname.TextColor = Colors.Black";
Debug.ShouldStop(64);
__ref.getField(false,"_teambname").runMethod(true,"setTextColor",useractions.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 72;BA.debugLine="teamAname.TextSize = 30";
Debug.ShouldStop(128);
__ref.getField(false,"_teamaname").runMethod(true,"setTextSize",BA.numberCast(float.class, 30));
 BA.debugLineNum = 73;BA.debugLine="teamBname.TextSize = 30";
Debug.ShouldStop(256);
__ref.getField(false,"_teambname").runMethod(true,"setTextSize",BA.numberCast(float.class, 30));
 BA.debugLineNum = 74;BA.debugLine="teamAname.Gravity = Gravity.CENTER";
Debug.ShouldStop(512);
__ref.getField(false,"_teamaname").runMethod(true,"setGravity",useractions.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 75;BA.debugLine="teamBname.Gravity = Gravity.CENTER";
Debug.ShouldStop(1024);
__ref.getField(false,"_teambname").runMethod(true,"setGravity",useractions.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 77;BA.debugLine="lblteamAcoef.TextColor = Colors.Black";
Debug.ShouldStop(4096);
__ref.getField(false,"_lblteamacoef").runMethod(true,"setTextColor",useractions.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 78;BA.debugLine="lblteamBcoef.TextColor = Colors.Black";
Debug.ShouldStop(8192);
__ref.getField(false,"_lblteambcoef").runMethod(true,"setTextColor",useractions.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 79;BA.debugLine="lblteamAcoef.TextSize = 30";
Debug.ShouldStop(16384);
__ref.getField(false,"_lblteamacoef").runMethod(true,"setTextSize",BA.numberCast(float.class, 30));
 BA.debugLineNum = 80;BA.debugLine="lblteamBcoef.TextSize = 30";
Debug.ShouldStop(32768);
__ref.getField(false,"_lblteambcoef").runMethod(true,"setTextSize",BA.numberCast(float.class, 30));
 BA.debugLineNum = 81;BA.debugLine="lblteamAcoef.Gravity = Gravity.CENTER";
Debug.ShouldStop(65536);
__ref.getField(false,"_lblteamacoef").runMethod(true,"setGravity",useractions.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 82;BA.debugLine="lblteamBcoef.Gravity = Gravity.CENTER";
Debug.ShouldStop(131072);
__ref.getField(false,"_lblteambcoef").runMethod(true,"setGravity",useractions.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 83;BA.debugLine="lblmatchinfo.TextColor = Colors.Black";
Debug.ShouldStop(262144);
__ref.getField(false,"_lblmatchinfo").runMethod(true,"setTextColor",useractions.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 84;BA.debugLine="lblmatchinfo.TextSize = 20";
Debug.ShouldStop(524288);
__ref.getField(false,"_lblmatchinfo").runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 86;BA.debugLine="betteamA.Tag = betbtntagA";
Debug.ShouldStop(2097152);
__ref.getField(false,"_betteama").runMethod(false,"setTag",(__ref.getField(true,"_betbtntaga")));
 BA.debugLineNum = 87;BA.debugLine="teamAname.Tag = betteamA.Tag";
Debug.ShouldStop(4194304);
__ref.getField(false,"_teamaname").runMethod(false,"setTag",__ref.getField(false,"_betteama").runMethod(false,"getTag"));
 BA.debugLineNum = 88;BA.debugLine="betbtntagA = betbtntagA + 1";
Debug.ShouldStop(8388608);
__ref.setField ("_betbtntaga",RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_betbtntaga"),RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 89;BA.debugLine="btnlistA.Add(teamAname)";
Debug.ShouldStop(16777216);
__ref.getField(false,"_btnlista").runVoidMethod ("Add",(Object)((__ref.getField(false,"_teamaname").getObject())));
 BA.debugLineNum = 91;BA.debugLine="betteamB.Tag = betbtntagB";
Debug.ShouldStop(67108864);
__ref.getField(false,"_betteamb").runMethod(false,"setTag",(__ref.getField(true,"_betbtntagb")));
 BA.debugLineNum = 92;BA.debugLine="teamBname.Tag = betteamB.Tag";
Debug.ShouldStop(134217728);
__ref.getField(false,"_teambname").runMethod(false,"setTag",__ref.getField(false,"_betteamb").runMethod(false,"getTag"));
 BA.debugLineNum = 93;BA.debugLine="betbtntagB = betbtntagB + 1";
Debug.ShouldStop(268435456);
__ref.setField ("_betbtntagb",RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_betbtntagb"),RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 94;BA.debugLine="btnlistB.Add(teamBname)";
Debug.ShouldStop(536870912);
__ref.getField(false,"_btnlistb").runVoidMethod ("Add",(Object)((__ref.getField(false,"_teambname").getObject())));
 BA.debugLineNum = 95;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activebetscreate(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ActiveBetsCreate (useractions) ","useractions",2,__ref.getField(false, "ba"),__ref,97);
if (RapidSub.canDelegate("activebetscreate")) return __ref.runUserSub(false, "useractions","activebetscreate", __ref);
RemoteObject _cursor = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _t = 0;
 BA.debugLineNum = 97;BA.debugLine="Sub ActiveBetsCreate";
Debug.ShouldStop(1);
 BA.debugLineNum = 98;BA.debugLine="Main.database1.Initialize(File.DirDefaultExternal";
Debug.ShouldStop(2);
useractions._main._database1.runVoidMethod ("Initialize",(Object)(useractions.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(BA.ObjectToString("bets_database.db")),(Object)(useractions.__c.getField(true,"True")));
 BA.debugLineNum = 99;BA.debugLine="Dim cursor As Cursor";
Debug.ShouldStop(4);
_cursor = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("cursor", _cursor);
 BA.debugLineNum = 101;BA.debugLine="cursor = Main.database1.ExecQuery(\"SELECT ID,Team";
Debug.ShouldStop(16);
_cursor.setObject(useractions._main._database1.runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT ID,TeamA,TeamAcoef, TeamB, TeamBcoef,MatchInfo FROM Bets"))));
 BA.debugLineNum = 103;BA.debugLine="For t = 0 To cursor.RowCount - 1";
Debug.ShouldStop(64);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {_cursor.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_t = 0 ;
for (;(step4 > 0 && _t <= limit4) || (step4 < 0 && _t >= limit4) ;_t = ((int)(0 + _t + step4))  ) {
Debug.locals.put("t", _t);
 BA.debugLineNum = 104;BA.debugLine="cursor.Position = t";
Debug.ShouldStop(128);
_cursor.runMethod(true,"setPosition",BA.numberCast(int.class, _t));
 BA.debugLineNum = 105;BA.debugLine="contenthold.Initialize(\"contents\")";
Debug.ShouldStop(256);
__ref.getField(false,"_contenthold").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("contents")));
 BA.debugLineNum = 106;BA.debugLine="teamAname.Initialize(\"name1\")";
Debug.ShouldStop(512);
__ref.getField(false,"_teamaname").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("name1")));
 BA.debugLineNum = 107;BA.debugLine="teamBname.Initialize(\"name2\")";
Debug.ShouldStop(1024);
__ref.getField(false,"_teambname").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("name2")));
 BA.debugLineNum = 108;BA.debugLine="lblteamAcoef.Initialize(\"coef1\")";
Debug.ShouldStop(2048);
__ref.getField(false,"_lblteamacoef").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("coef1")));
 BA.debugLineNum = 109;BA.debugLine="lblteamBcoef.Initialize(\"coef2\")";
Debug.ShouldStop(4096);
__ref.getField(false,"_lblteambcoef").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("coef2")));
 BA.debugLineNum = 110;BA.debugLine="lblmatchinfo.Initialize(\"info1\")";
Debug.ShouldStop(8192);
__ref.getField(false,"_lblmatchinfo").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("info1")));
 BA.debugLineNum = 111;BA.debugLine="betteamA.Initialize(\"btnbetA\")";
Debug.ShouldStop(16384);
__ref.getField(false,"_betteama").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("btnbetA")));
 BA.debugLineNum = 112;BA.debugLine="betteamB.Initialize(\"btnbetB\")";
Debug.ShouldStop(32768);
__ref.getField(false,"_betteamb").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("btnbetB")));
 BA.debugLineNum = 114;BA.debugLine="teamAname.Text = cursor.GetString(\"TeamA\")";
Debug.ShouldStop(131072);
__ref.getField(false,"_teamaname").runMethod(true,"setText",BA.ObjectToCharSequence(_cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("TeamA")))));
 BA.debugLineNum = 115;BA.debugLine="teamBname.Text = cursor.GetString(\"TeamB\")";
Debug.ShouldStop(262144);
__ref.getField(false,"_teambname").runMethod(true,"setText",BA.ObjectToCharSequence(_cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("TeamB")))));
 BA.debugLineNum = 116;BA.debugLine="lblteamAcoef.Text = cursor.GetString(\"TeamAcoef\"";
Debug.ShouldStop(524288);
__ref.getField(false,"_lblteamacoef").runMethod(true,"setText",BA.ObjectToCharSequence(_cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("TeamAcoef")))));
 BA.debugLineNum = 117;BA.debugLine="lblteamBcoef.Text = cursor.GetString(\"TeamBcoef\"";
Debug.ShouldStop(1048576);
__ref.getField(false,"_lblteambcoef").runMethod(true,"setText",BA.ObjectToCharSequence(_cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("TeamBcoef")))));
 BA.debugLineNum = 118;BA.debugLine="lblmatchinfo.Text = cursor.GetString(\"MatchInfo\"";
Debug.ShouldStop(2097152);
__ref.getField(false,"_lblmatchinfo").runMethod(true,"setText",BA.ObjectToCharSequence(_cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("MatchInfo")))));
 BA.debugLineNum = 119;BA.debugLine="pnl_bets.Panel.AddView(contenthold,0,0+(20%y + 1";
Debug.ShouldStop(4194304);
__ref.getField(false,"_pnl_bets").runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_contenthold").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0),(RemoteObject.solve(new RemoteObject[] {useractions.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 20)),__ref.getField(false, "ba")),useractions.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))}, "+",1, 1)),__ref.getField(true,"_i")}, "+*",1, 1)),(Object)(useractions.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(useractions.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 20)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 120;BA.debugLine="i = i + 1";
Debug.ShouldStop(8388608);
__ref.setField ("_i",RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_i"),RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 121;BA.debugLine="contenthold.AddView(teamAname,0,0,20%x,10%y)";
Debug.ShouldStop(16777216);
__ref.getField(false,"_contenthold").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_teamaname").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(useractions.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 20)),__ref.getField(false, "ba"))),(Object)(useractions.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 122;BA.debugLine="contenthold.AddView(lblteamAcoef,0,10%y,20%x,10%";
Debug.ShouldStop(33554432);
__ref.getField(false,"_contenthold").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_lblteamacoef").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(useractions.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))),(Object)(useractions.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 20)),__ref.getField(false, "ba"))),(Object)(useractions.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 123;BA.debugLine="contenthold.AddView(teamBname,60%x,0,20%x,10%y)";
Debug.ShouldStop(67108864);
__ref.getField(false,"_contenthold").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_teambname").getObject())),(Object)(useractions.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 60)),__ref.getField(false, "ba"))),(Object)(BA.numberCast(int.class, 0)),(Object)(useractions.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 20)),__ref.getField(false, "ba"))),(Object)(useractions.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 124;BA.debugLine="contenthold.AddView(lblteamBcoef,60%x,10%y,20%x,";
Debug.ShouldStop(134217728);
__ref.getField(false,"_contenthold").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_lblteambcoef").getObject())),(Object)(useractions.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 60)),__ref.getField(false, "ba"))),(Object)(useractions.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))),(Object)(useractions.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 20)),__ref.getField(false, "ba"))),(Object)(useractions.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 125;BA.debugLine="contenthold.AddView(betteamA,20%x,0,10%x,20%y)";
Debug.ShouldStop(268435456);
__ref.getField(false,"_contenthold").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_betteama").getObject())),(Object)(useractions.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 20)),__ref.getField(false, "ba"))),(Object)(BA.numberCast(int.class, 0)),(Object)(useractions.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))),(Object)(useractions.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 20)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 126;BA.debugLine="contenthold.AddView(betteamB,50%x,0,10%x,20%y)";
Debug.ShouldStop(536870912);
__ref.getField(false,"_contenthold").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_betteamb").getObject())),(Object)(useractions.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 50)),__ref.getField(false, "ba"))),(Object)(BA.numberCast(int.class, 0)),(Object)(useractions.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))),(Object)(useractions.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 20)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 127;BA.debugLine="contenthold.AddView(lblmatchinfo,30%x,0,50%x,20%";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_contenthold").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_lblmatchinfo").getObject())),(Object)(useractions.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 30)),__ref.getField(false, "ba"))),(Object)(BA.numberCast(int.class, 0)),(Object)(useractions.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 50)),__ref.getField(false, "ba"))),(Object)(useractions.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 20)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 129;BA.debugLine="ActiveBets_Content";
Debug.ShouldStop(1);
__ref.runClassMethod (b4a.example.useractions.class, "_activebets_content");
 }
}Debug.locals.put("t", _t);
;
 BA.debugLineNum = 131;BA.debugLine="cursor.Close";
Debug.ShouldStop(4);
_cursor.runVoidMethod ("Close");
 BA.debugLineNum = 132;BA.debugLine="Main.database1.Close";
Debug.ShouldStop(8);
useractions._main._database1.runVoidMethod ("Close");
 BA.debugLineNum = 133;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnbeta_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnbetA_Click (useractions) ","useractions",2,__ref.getField(false, "ba"),__ref,135);
if (RapidSub.canDelegate("btnbeta_click")) return __ref.runUserSub(false, "useractions","btnbeta_click", __ref);
RemoteObject _btn = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
RemoteObject _templbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
 BA.debugLineNum = 135;BA.debugLine="Sub btnbetA_Click";
Debug.ShouldStop(64);
 BA.debugLineNum = 136;BA.debugLine="Dim btn As Button = Sender";
Debug.ShouldStop(128);
_btn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
_btn.setObject(useractions.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("btn", _btn);
 BA.debugLineNum = 137;BA.debugLine="Dim templbl As Label = btnlistA.Get(btn.Tag)";
Debug.ShouldStop(256);
_templbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_templbl.setObject(__ref.getField(false,"_btnlista").runMethod(false,"Get",(Object)(BA.numberCast(int.class, _btn.runMethod(false,"getTag")))));Debug.locals.put("templbl", _templbl);
 BA.debugLineNum = 138;BA.debugLine="ToastMessageShow( Main.currentuser.name & \" curre";
Debug.ShouldStop(512);
useractions.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(useractions._main._currentuser.getField(true,"name"),RemoteObject.createImmutable(" currently betting on "),_templbl.runMethod(true,"getText")))),(Object)(useractions.__c.getField(true,"False")));
 BA.debugLineNum = 139;BA.debugLine="CallSub(Main,\"BuildPopUpScreen\")";
Debug.ShouldStop(1024);
useractions.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)((useractions._main.getObject())),(Object)(RemoteObject.createImmutable("BuildPopUpScreen")));
 BA.debugLineNum = 140;BA.debugLine="CallSub(Main,\"ShowBetsPopUp\")";
Debug.ShouldStop(2048);
useractions.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)((useractions._main.getObject())),(Object)(RemoteObject.createImmutable("ShowBetsPopUp")));
 BA.debugLineNum = 141;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnbetb_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnbetB_Click (useractions) ","useractions",2,__ref.getField(false, "ba"),__ref,142);
if (RapidSub.canDelegate("btnbetb_click")) return __ref.runUserSub(false, "useractions","btnbetb_click", __ref);
RemoteObject _btn = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
RemoteObject _templbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
 BA.debugLineNum = 142;BA.debugLine="Sub btnbetB_Click";
Debug.ShouldStop(8192);
 BA.debugLineNum = 143;BA.debugLine="Dim btn As Button = Sender";
Debug.ShouldStop(16384);
_btn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
_btn.setObject(useractions.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("btn", _btn);
 BA.debugLineNum = 144;BA.debugLine="Dim templbl As Label = btnlistB.Get(btn.Tag)";
Debug.ShouldStop(32768);
_templbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_templbl.setObject(__ref.getField(false,"_btnlistb").runMethod(false,"Get",(Object)(BA.numberCast(int.class, _btn.runMethod(false,"getTag")))));Debug.locals.put("templbl", _templbl);
 BA.debugLineNum = 145;BA.debugLine="ToastMessageShow( Main.currentuser.name & \" curre";
Debug.ShouldStop(65536);
useractions.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(useractions._main._currentuser.getField(true,"name"),RemoteObject.createImmutable(" currently betting on "),_templbl.runMethod(true,"getText")))),(Object)(useractions.__c.getField(true,"False")));
 BA.debugLineNum = 146;BA.debugLine="CallSub(Main,\"BuildPopUpScreen\")";
Debug.ShouldStop(131072);
useractions.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)((useractions._main.getObject())),(Object)(RemoteObject.createImmutable("BuildPopUpScreen")));
 BA.debugLineNum = 147;BA.debugLine="CallSub(Main,\"ShowBetsPopUp\")";
Debug.ShouldStop(262144);
useractions.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)((useractions._main.getObject())),(Object)(RemoteObject.createImmutable("ShowBetsPopUp")));
 BA.debugLineNum = 148;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
		Debug.PushSubsStack("Build_UI (useractions) ","useractions",2,__ref.getField(false, "ba"),__ref,40);
if (RapidSub.canDelegate("build_ui")) return __ref.runUserSub(false, "useractions","build_ui", __ref);
 BA.debugLineNum = 40;BA.debugLine="Sub Build_UI";
Debug.ShouldStop(128);
 BA.debugLineNum = 41;BA.debugLine="TabhostActions.AddTab2(\"Active bets\",pnl_bets)";
Debug.ShouldStop(256);
__ref.getField(false,"_tabhostactions").runVoidMethod ("AddTab2",(Object)(BA.ObjectToString("Active bets")),(Object)((__ref.getField(false,"_pnl_bets").getObject())));
 BA.debugLineNum = 42;BA.debugLine="TabhostActions.AddTab2(\"Finances\",pnl_finances)";
Debug.ShouldStop(512);
__ref.getField(false,"_tabhostactions").runVoidMethod ("AddTab2",(Object)(BA.ObjectToString("Finances")),(Object)((__ref.getField(false,"_pnl_finances").getObject())));
 BA.debugLineNum = 43;BA.debugLine="TabhostActions.AddTab2(\"History\",pnl_history)";
Debug.ShouldStop(1024);
__ref.getField(false,"_tabhostactions").runVoidMethod ("AddTab2",(Object)(BA.ObjectToString("History")),(Object)((__ref.getField(false,"_pnl_history").getObject())));
 BA.debugLineNum = 44;BA.debugLine="Moneymangmt_Contents";
Debug.ShouldStop(2048);
__ref.runClassMethod (b4a.example.useractions.class, "_moneymangmt_contents");
 BA.debugLineNum = 45;BA.debugLine="ShowCurrentBets";
Debug.ShouldStop(4096);
__ref.runClassMethod (b4a.example.useractions.class, "_showcurrentbets");
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Public TabhostActions As TabHost";
useractions._tabhostactions = RemoteObject.createNew ("anywheresoftware.b4a.objects.TabHostWrapper");__ref.setField("_tabhostactions",useractions._tabhostactions);
 //BA.debugLineNum = 3;BA.debugLine="Dim pnl_bets As ScrollView";
useractions._pnl_bets = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");__ref.setField("_pnl_bets",useractions._pnl_bets);
 //BA.debugLineNum = 4;BA.debugLine="Dim pnl_finances,pnl_history As Panel";
useractions._pnl_finances = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnl_finances",useractions._pnl_finances);
useractions._pnl_history = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnl_history",useractions._pnl_history);
 //BA.debugLineNum = 6;BA.debugLine="Dim textfield As EditText";
useractions._textfield = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_textfield",useractions._textfield);
 //BA.debugLineNum = 7;BA.debugLine="Dim Deposit,Withdraw  As Button";
useractions._deposit = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_deposit",useractions._deposit);
useractions._withdraw = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_withdraw",useractions._withdraw);
 //BA.debugLineNum = 8;BA.debugLine="Dim booBuild As Boolean";
useractions._boobuild = RemoteObject.createImmutable(false);__ref.setField("_boobuild",useractions._boobuild);
 //BA.debugLineNum = 11;BA.debugLine="Dim contenthold As Panel";
useractions._contenthold = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_contenthold",useractions._contenthold);
 //BA.debugLineNum = 12;BA.debugLine="Dim lblteamAcoef,lblteamBcoef,lblmatchinfo,teamBn";
useractions._lblteamacoef = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblteamacoef",useractions._lblteamacoef);
useractions._lblteambcoef = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblteambcoef",useractions._lblteambcoef);
useractions._lblmatchinfo = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblmatchinfo",useractions._lblmatchinfo);
useractions._teambname = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_teambname",useractions._teambname);
useractions._teamaname = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_teamaname",useractions._teamaname);
 //BA.debugLineNum = 13;BA.debugLine="Dim betteamA,betteamB As Button";
useractions._betteama = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_betteama",useractions._betteama);
useractions._betteamb = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_betteamb",useractions._betteamb);
 //BA.debugLineNum = 14;BA.debugLine="Dim betbtntagA , betbtntagB,i As Int = 0";
useractions._betbtntaga = RemoteObject.createImmutable(0);__ref.setField("_betbtntaga",useractions._betbtntaga);
useractions._betbtntagb = RemoteObject.createImmutable(0);__ref.setField("_betbtntagb",useractions._betbtntagb);
useractions._i = BA.numberCast(int.class, 0);__ref.setField("_i",useractions._i);
 //BA.debugLineNum = 15;BA.debugLine="Dim btnlistA,btnlistB As List";
useractions._btnlista = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_btnlista",useractions._btnlista);
useractions._btnlistb = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_btnlistb",useractions._btnlistb);
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _deposit_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("deposit_Click (useractions) ","useractions",2,__ref.getField(false, "ba"),__ref,164);
if (RapidSub.canDelegate("deposit_click")) return __ref.runUserSub(false, "useractions","deposit_click", __ref);
 BA.debugLineNum = 164;BA.debugLine="Sub deposit_Click";
Debug.ShouldStop(8);
 BA.debugLineNum = 165;BA.debugLine="If textfield.Text = \"\" Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_textfield").runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 166;BA.debugLine="ToastMessageShow(\"Nothing entered\",False)";
Debug.ShouldStop(32);
useractions.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Nothing entered")),(Object)(useractions.__c.getField(true,"False")));
 }else {
 BA.debugLineNum = 169;BA.debugLine="Main.currentuser.money = Main.currentuser.money";
Debug.ShouldStop(256);
useractions._main._currentuser.setField ("money",RemoteObject.solve(new RemoteObject[] {useractions._main._currentuser.getField(true,"money"),BA.numberCast(double.class, __ref.getField(false,"_textfield").runMethod(true,"getText"))}, "+",1, 0));
 BA.debugLineNum = 170;BA.debugLine="Main.database.ExecNonQuery(\"UPDATE  Users SET Mo";
Debug.ShouldStop(512);
useractions._main._database.runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE  Users SET Money = '"),useractions._main._currentuser.getField(true,"money"),RemoteObject.createImmutable("' WHERE Username = '"),useractions._main._currentuser.getField(true,"name"),RemoteObject.createImmutable("'"))));
 BA.debugLineNum = 171;BA.debugLine="CallSub2(Main,\"DepositWithdrawMoney\",Main.curren";
Debug.ShouldStop(1024);
useractions.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)((useractions._main.getObject())),(Object)(BA.ObjectToString("DepositWithdrawMoney")),(Object)((useractions._main._currentuser.getField(true,"money"))));
 };
 BA.debugLineNum = 174;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("Initialize (useractions) ","useractions",2,__ref.getField(false, "ba"),__ref,20);
if (RapidSub.canDelegate("initialize")) return __ref.runUserSub(false, "useractions","initialize", __ref, _ba);
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 20;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(524288);
 BA.debugLineNum = 21;BA.debugLine="TabhostActions.Initialize(\"tabhost1\")";
Debug.ShouldStop(1048576);
__ref.getField(false,"_tabhostactions").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("tabhost1")));
 BA.debugLineNum = 22;BA.debugLine="pnl_bets.Initialize(-1)";
Debug.ShouldStop(2097152);
__ref.getField(false,"_pnl_bets").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, -(double) (0 + 1))));
 BA.debugLineNum = 23;BA.debugLine="pnl_finances.Initialize(\"moneys\")";
Debug.ShouldStop(4194304);
__ref.getField(false,"_pnl_finances").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("moneys")));
 BA.debugLineNum = 24;BA.debugLine="pnl_history.Initialize(\"history\")";
Debug.ShouldStop(8388608);
__ref.getField(false,"_pnl_history").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("history")));
 BA.debugLineNum = 26;BA.debugLine="textfield.Initialize(\"sumfield\")";
Debug.ShouldStop(33554432);
__ref.getField(false,"_textfield").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("sumfield")));
 BA.debugLineNum = 27;BA.debugLine="Deposit.Initialize(\"deposit\")";
Debug.ShouldStop(67108864);
__ref.getField(false,"_deposit").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("deposit")));
 BA.debugLineNum = 28;BA.debugLine="Withdraw.Initialize(\"withdraw\")";
Debug.ShouldStop(134217728);
__ref.getField(false,"_withdraw").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("withdraw")));
 BA.debugLineNum = 30;BA.debugLine="btnlistA.Initialize";
Debug.ShouldStop(536870912);
__ref.getField(false,"_btnlista").runVoidMethod ("Initialize");
 BA.debugLineNum = 31;BA.debugLine="btnlistB.Initialize";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_btnlistb").runVoidMethod ("Initialize");
 BA.debugLineNum = 33;BA.debugLine="If booBuild = False Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_boobuild"),useractions.__c.getField(true,"False"))) { 
 BA.debugLineNum = 34;BA.debugLine="Build_UI";
Debug.ShouldStop(2);
__ref.runClassMethod (b4a.example.useractions.class, "_build_ui");
 BA.debugLineNum = 35;BA.debugLine="booBuild = True";
Debug.ShouldStop(4);
__ref.setField ("_boobuild",useractions.__c.getField(true,"True"));
 };
 BA.debugLineNum = 38;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _moneymangmt_contents(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Moneymangmt_Contents (useractions) ","useractions",2,__ref.getField(false, "ba"),__ref,150);
if (RapidSub.canDelegate("moneymangmt_contents")) return __ref.runUserSub(false, "useractions","moneymangmt_contents", __ref);
 BA.debugLineNum = 150;BA.debugLine="Sub Moneymangmt_Contents";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 151;BA.debugLine="pnl_finances.Color = Colors.ARGB(150,0,0,0)";
Debug.ShouldStop(4194304);
__ref.getField(false,"_pnl_finances").runVoidMethod ("setColor",useractions.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 150)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 152;BA.debugLine="textfield.InputType = textfield.INPUT_TYPE_NUMBER";
Debug.ShouldStop(8388608);
__ref.getField(false,"_textfield").runMethod(true,"setInputType",__ref.getField(false,"_textfield").getField(true,"INPUT_TYPE_NUMBERS"));
 BA.debugLineNum = 153;BA.debugLine="Deposit.Text = \"Deposit\"";
Debug.ShouldStop(16777216);
__ref.getField(false,"_deposit").runMethod(true,"setText",BA.ObjectToCharSequence("Deposit"));
 BA.debugLineNum = 154;BA.debugLine="Withdraw.Text = \"Withdraw\"";
Debug.ShouldStop(33554432);
__ref.getField(false,"_withdraw").runMethod(true,"setText",BA.ObjectToCharSequence("Withdraw"));
 BA.debugLineNum = 155;BA.debugLine="HelperFunctions.Apply_ViewStyle(Withdraw,Colors.B";
Debug.ShouldStop(67108864);
useractions._helperfunctions.runVoidMethod ("_apply_viewstyle",__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_withdraw").getObject()),(Object)(useractions.__c.getField(false,"Colors").getField(true,"Black")),(Object)(useractions.__c.getField(false,"Colors").getField(true,"White")),(Object)(useractions.__c.getField(false,"Colors").getField(true,"White")),(Object)(useractions.__c.getField(false,"Colors").getField(true,"LightGray")),(Object)(useractions.__c.getField(false,"Colors").getField(true,"LightGray")),(Object)(useractions.__c.getField(false,"Colors").getField(true,"DarkGray")),(Object)(useractions.__c.getField(false,"Colors").getField(true,"DarkGray")),(Object)(BA.numberCast(int.class, 20)));
 BA.debugLineNum = 156;BA.debugLine="HelperFunctions.Apply_ViewStyle(Deposit,Colors.Bl";
Debug.ShouldStop(134217728);
useractions._helperfunctions.runVoidMethod ("_apply_viewstyle",__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_deposit").getObject()),(Object)(useractions.__c.getField(false,"Colors").getField(true,"Black")),(Object)(useractions.__c.getField(false,"Colors").getField(true,"White")),(Object)(useractions.__c.getField(false,"Colors").getField(true,"White")),(Object)(useractions.__c.getField(false,"Colors").getField(true,"LightGray")),(Object)(useractions.__c.getField(false,"Colors").getField(true,"LightGray")),(Object)(useractions.__c.getField(false,"Colors").getField(true,"DarkGray")),(Object)(useractions.__c.getField(false,"Colors").getField(true,"DarkGray")),(Object)(BA.numberCast(int.class, 20)));
 BA.debugLineNum = 157;BA.debugLine="HelperFunctions.Apply_ViewStyle(textfield,Colors.";
Debug.ShouldStop(268435456);
useractions._helperfunctions.runVoidMethod ("_apply_viewstyle",__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_textfield").getObject()),(Object)(useractions.__c.getField(false,"Colors").getField(true,"Black")),(Object)(useractions.__c.getField(false,"Colors").getField(true,"White")),(Object)(useractions.__c.getField(false,"Colors").getField(true,"White")),(Object)(useractions.__c.getField(false,"Colors").getField(true,"LightGray")),(Object)(useractions.__c.getField(false,"Colors").getField(true,"LightGray")),(Object)(useractions.__c.getField(false,"Colors").getField(true,"DarkGray")),(Object)(useractions.__c.getField(false,"Colors").getField(true,"DarkGray")),(Object)(BA.numberCast(int.class, 20)));
 BA.debugLineNum = 159;BA.debugLine="pnl_finances.AddView(textfield,10%x,20%y,60%x,15%";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_pnl_finances").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_textfield").getObject())),(Object)(useractions.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))),(Object)(useractions.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 20)),__ref.getField(false, "ba"))),(Object)(useractions.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 60)),__ref.getField(false, "ba"))),(Object)(useractions.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 15)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 160;BA.debugLine="pnl_finances.AddView(Deposit,10%x,40%y,30%x - 2di";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_pnl_finances").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_deposit").getObject())),(Object)(useractions.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))),(Object)(useractions.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 40)),__ref.getField(false, "ba"))),(Object)(RemoteObject.solve(new RemoteObject[] {useractions.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 30)),__ref.getField(false, "ba")),useractions.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))}, "-",1, 1)),(Object)(useractions.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 15)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 161;BA.debugLine="pnl_finances.AddView(Withdraw,40%x + 2dip,40%y,30";
Debug.ShouldStop(1);
__ref.getField(false,"_pnl_finances").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_withdraw").getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {useractions.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 40)),__ref.getField(false, "ba")),useractions.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))}, "+",1, 1)),(Object)(useractions.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 40)),__ref.getField(false, "ba"))),(Object)(useractions.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 30)),__ref.getField(false, "ba"))),(Object)(useractions.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 15)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 162;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _showcurrentbets(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ShowCurrentBets (useractions) ","useractions",2,__ref.getField(false, "ba"),__ref,49);
if (RapidSub.canDelegate("showcurrentbets")) return __ref.runUserSub(false, "useractions","showcurrentbets", __ref);
 BA.debugLineNum = 49;BA.debugLine="Sub ShowCurrentBets";
Debug.ShouldStop(65536);
 BA.debugLineNum = 50;BA.debugLine="ActiveBetsCreate";
Debug.ShouldStop(131072);
__ref.runClassMethod (b4a.example.useractions.class, "_activebetscreate");
 BA.debugLineNum = 51;BA.debugLine="If contenthold.IsInitialized Then";
Debug.ShouldStop(262144);
if (__ref.getField(false,"_contenthold").runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 52;BA.debugLine="ActiveBets_Content";
Debug.ShouldStop(524288);
__ref.runClassMethod (b4a.example.useractions.class, "_activebets_content");
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
public static RemoteObject  _withdraw_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("withdraw_Click (useractions) ","useractions",2,__ref.getField(false, "ba"),__ref,176);
if (RapidSub.canDelegate("withdraw_click")) return __ref.runUserSub(false, "useractions","withdraw_click", __ref);
 BA.debugLineNum = 176;BA.debugLine="Sub withdraw_Click";
Debug.ShouldStop(32768);
 BA.debugLineNum = 177;BA.debugLine="If textfield.Text = \"\" Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_textfield").runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 178;BA.debugLine="ToastMessageShow(\"Nothing entered\",False)";
Debug.ShouldStop(131072);
useractions.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Nothing entered")),(Object)(useractions.__c.getField(true,"False")));
 }else {
 BA.debugLineNum = 180;BA.debugLine="Main.currentuser.money = Main.currentuser.money";
Debug.ShouldStop(524288);
useractions._main._currentuser.setField ("money",RemoteObject.solve(new RemoteObject[] {useractions._main._currentuser.getField(true,"money"),BA.numberCast(double.class, __ref.getField(false,"_textfield").runMethod(true,"getText"))}, "-",1, 0));
 BA.debugLineNum = 181;BA.debugLine="If Main.currentuser.money < 0 Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("<",useractions._main._currentuser.getField(true,"money"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 182;BA.debugLine="Main.currentuser.money = 0";
Debug.ShouldStop(2097152);
useractions._main._currentuser.setField ("money",BA.numberCast(double.class, 0));
 };
 BA.debugLineNum = 184;BA.debugLine="Main.database.ExecNonQuery(\"UPDATE  Users SET Mo";
Debug.ShouldStop(8388608);
useractions._main._database.runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE  Users SET Money = '"),useractions._main._currentuser.getField(true,"money"),RemoteObject.createImmutable("' WHERE Username = '"),useractions._main._currentuser.getField(true,"name"),RemoteObject.createImmutable("'"))));
 BA.debugLineNum = 185;BA.debugLine="CallSub2(Main,\"DepositWithdrawMoney\",Main.curren";
Debug.ShouldStop(16777216);
useractions.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)((useractions._main.getObject())),(Object)(BA.ObjectToString("DepositWithdrawMoney")),(Object)((useractions._main._currentuser.getField(true,"money"))));
 };
 BA.debugLineNum = 187;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}