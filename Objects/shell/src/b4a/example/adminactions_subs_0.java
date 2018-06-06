package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class adminactions_subs_0 {


public static RemoteObject  _activebets_content(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ActiveBets_Content (adminactions) ","adminactions",3,__ref.getField(false, "ba"),__ref,117);
if (RapidSub.canDelegate("activebets_content")) return __ref.runUserSub(false, "adminactions","activebets_content", __ref);
 BA.debugLineNum = 117;BA.debugLine="Sub ActiveBets_Content";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 118;BA.debugLine="pnl_bets.Color = Colors.White";
Debug.ShouldStop(2097152);
__ref.getField(false,"_pnl_bets").runVoidMethod ("setColor",adminactions.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 119;BA.debugLine="contenthold.Color = Colors.LightGray";
Debug.ShouldStop(4194304);
__ref.getField(false,"_contenthold").runVoidMethod ("setColor",adminactions.__c.getField(false,"Colors").getField(true,"LightGray"));
 BA.debugLineNum = 121;BA.debugLine="betteamA.Color = Colors.RGB(0, 153, 0)";
Debug.ShouldStop(16777216);
__ref.getField(false,"_betteama").runVoidMethod ("setColor",adminactions.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 153)),(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 122;BA.debugLine="betteamA.Text = \"Bet\"";
Debug.ShouldStop(33554432);
__ref.getField(false,"_betteama").runMethod(true,"setText",BA.ObjectToCharSequence("Bet"));
 BA.debugLineNum = 123;BA.debugLine="betteamA.TextSize = 40";
Debug.ShouldStop(67108864);
__ref.getField(false,"_betteama").runMethod(true,"setTextSize",BA.numberCast(float.class, 40));
 BA.debugLineNum = 124;BA.debugLine="betteamA.Gravity = Gravity.CENTER";
Debug.ShouldStop(134217728);
__ref.getField(false,"_betteama").runMethod(true,"setGravity",adminactions.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 126;BA.debugLine="betteamB.Color = Colors.RGB(0, 153, 0)";
Debug.ShouldStop(536870912);
__ref.getField(false,"_betteamb").runVoidMethod ("setColor",adminactions.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 153)),(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 127;BA.debugLine="betteamB.Text = \"Bet\"";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_betteamb").runMethod(true,"setText",BA.ObjectToCharSequence("Bet"));
 BA.debugLineNum = 128;BA.debugLine="betteamB.TextSize = 40";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_betteamb").runMethod(true,"setTextSize",BA.numberCast(float.class, 40));
 BA.debugLineNum = 129;BA.debugLine="betteamB.Gravity = Gravity.CENTER";
Debug.ShouldStop(1);
__ref.getField(false,"_betteamb").runMethod(true,"setGravity",adminactions.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 131;BA.debugLine="teamAname.TextColor = Colors.Black";
Debug.ShouldStop(4);
__ref.getField(false,"_teamaname").runMethod(true,"setTextColor",adminactions.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 132;BA.debugLine="teamBname.TextColor = Colors.Black";
Debug.ShouldStop(8);
__ref.getField(false,"_teambname").runMethod(true,"setTextColor",adminactions.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 133;BA.debugLine="teamAname.TextSize = 30";
Debug.ShouldStop(16);
__ref.getField(false,"_teamaname").runMethod(true,"setTextSize",BA.numberCast(float.class, 30));
 BA.debugLineNum = 134;BA.debugLine="teamBname.TextSize = 30";
Debug.ShouldStop(32);
__ref.getField(false,"_teambname").runMethod(true,"setTextSize",BA.numberCast(float.class, 30));
 BA.debugLineNum = 135;BA.debugLine="teamAname.Gravity = Gravity.CENTER";
Debug.ShouldStop(64);
__ref.getField(false,"_teamaname").runMethod(true,"setGravity",adminactions.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 136;BA.debugLine="teamBname.Gravity = Gravity.CENTER";
Debug.ShouldStop(128);
__ref.getField(false,"_teambname").runMethod(true,"setGravity",adminactions.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 138;BA.debugLine="lblteamAcoef.TextColor = Colors.Black";
Debug.ShouldStop(512);
__ref.getField(false,"_lblteamacoef").runMethod(true,"setTextColor",adminactions.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 139;BA.debugLine="lblteamBcoef.TextColor = Colors.Black";
Debug.ShouldStop(1024);
__ref.getField(false,"_lblteambcoef").runMethod(true,"setTextColor",adminactions.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 140;BA.debugLine="lblteamAcoef.TextSize = 30";
Debug.ShouldStop(2048);
__ref.getField(false,"_lblteamacoef").runMethod(true,"setTextSize",BA.numberCast(float.class, 30));
 BA.debugLineNum = 141;BA.debugLine="lblteamBcoef.TextSize = 30";
Debug.ShouldStop(4096);
__ref.getField(false,"_lblteambcoef").runMethod(true,"setTextSize",BA.numberCast(float.class, 30));
 BA.debugLineNum = 142;BA.debugLine="lblteamAcoef.Gravity = Gravity.CENTER";
Debug.ShouldStop(8192);
__ref.getField(false,"_lblteamacoef").runMethod(true,"setGravity",adminactions.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 143;BA.debugLine="lblteamBcoef.Gravity = Gravity.CENTER";
Debug.ShouldStop(16384);
__ref.getField(false,"_lblteambcoef").runMethod(true,"setGravity",adminactions.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 144;BA.debugLine="lblmatchinfo.TextColor = Colors.Black";
Debug.ShouldStop(32768);
__ref.getField(false,"_lblmatchinfo").runMethod(true,"setTextColor",adminactions.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 145;BA.debugLine="lblmatchinfo.TextSize = 20";
Debug.ShouldStop(65536);
__ref.getField(false,"_lblmatchinfo").runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 146;BA.debugLine="betteamA.Tag = betbtntag";
Debug.ShouldStop(131072);
__ref.getField(false,"_betteama").runMethod(false,"setTag",(__ref.getField(true,"_betbtntag")));
 BA.debugLineNum = 147;BA.debugLine="betbtntag = betbtntag + 1";
Debug.ShouldStop(262144);
__ref.setField ("_betbtntag",RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_betbtntag"),RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 150;BA.debugLine="betteamB.Tag = betbtntag";
Debug.ShouldStop(2097152);
__ref.getField(false,"_betteamb").runMethod(false,"setTag",(__ref.getField(true,"_betbtntag")));
 BA.debugLineNum = 151;BA.debugLine="betbtntag = betbtntag + 1";
Debug.ShouldStop(4194304);
__ref.setField ("_betbtntag",RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_betbtntag"),RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 152;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
		Debug.PushSubsStack("ActiveBetsCreate (adminactions) ","adminactions",3,__ref.getField(false, "ba"),__ref,170);
if (RapidSub.canDelegate("activebetscreate")) return __ref.runUserSub(false, "adminactions","activebetscreate", __ref);
RemoteObject _cursor = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _t = 0;
 BA.debugLineNum = 170;BA.debugLine="Sub ActiveBetsCreate";
Debug.ShouldStop(512);
 BA.debugLineNum = 172;BA.debugLine="Main.database1.Initialize(File.DirDefaultExternal";
Debug.ShouldStop(2048);
adminactions._main._database1.runVoidMethod ("Initialize",(Object)(adminactions.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(BA.ObjectToString("bets_database.db")),(Object)(adminactions.__c.getField(true,"True")));
 BA.debugLineNum = 173;BA.debugLine="Dim cursor As Cursor";
Debug.ShouldStop(4096);
_cursor = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("cursor", _cursor);
 BA.debugLineNum = 174;BA.debugLine="cursor = Main.database1.ExecQuery(\"SELECT ID,Team";
Debug.ShouldStop(8192);
_cursor.setObject(adminactions._main._database1.runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT ID,TeamA,TeamAcoef, TeamB, TeamBcoef,MatchInfo FROM Bets"))));
 BA.debugLineNum = 176;BA.debugLine="For t = 0 To cursor.RowCount - 1";
Debug.ShouldStop(32768);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {_cursor.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_t = 0 ;
for (;(step4 > 0 && _t <= limit4) || (step4 < 0 && _t >= limit4) ;_t = ((int)(0 + _t + step4))  ) {
Debug.locals.put("t", _t);
 BA.debugLineNum = 177;BA.debugLine="cursor.Position = t";
Debug.ShouldStop(65536);
_cursor.runMethod(true,"setPosition",BA.numberCast(int.class, _t));
 BA.debugLineNum = 178;BA.debugLine="contenthold.Initialize(\"contents\")";
Debug.ShouldStop(131072);
__ref.getField(false,"_contenthold").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("contents")));
 BA.debugLineNum = 179;BA.debugLine="teamAname.Initialize(\"name1\")";
Debug.ShouldStop(262144);
__ref.getField(false,"_teamaname").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("name1")));
 BA.debugLineNum = 180;BA.debugLine="teamBname.Initialize(\"name2\")";
Debug.ShouldStop(524288);
__ref.getField(false,"_teambname").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("name2")));
 BA.debugLineNum = 181;BA.debugLine="lblteamAcoef.Initialize(\"coef1\")";
Debug.ShouldStop(1048576);
__ref.getField(false,"_lblteamacoef").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("coef1")));
 BA.debugLineNum = 182;BA.debugLine="lblteamBcoef.Initialize(\"coef2\")";
Debug.ShouldStop(2097152);
__ref.getField(false,"_lblteambcoef").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("coef2")));
 BA.debugLineNum = 183;BA.debugLine="lblmatchinfo.Initialize(\"info1\")";
Debug.ShouldStop(4194304);
__ref.getField(false,"_lblmatchinfo").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("info1")));
 BA.debugLineNum = 184;BA.debugLine="betteamA.Initialize(\"btn1\")";
Debug.ShouldStop(8388608);
__ref.getField(false,"_betteama").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("btn1")));
 BA.debugLineNum = 185;BA.debugLine="betteamB.Initialize(\"btn2\")";
Debug.ShouldStop(16777216);
__ref.getField(false,"_betteamb").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("btn2")));
 BA.debugLineNum = 188;BA.debugLine="teamAname.Text = cursor.GetString(\"TeamA\")";
Debug.ShouldStop(134217728);
__ref.getField(false,"_teamaname").runMethod(true,"setText",BA.ObjectToCharSequence(_cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("TeamA")))));
 BA.debugLineNum = 189;BA.debugLine="teamBname.Text = cursor.GetString(\"TeamB\")";
Debug.ShouldStop(268435456);
__ref.getField(false,"_teambname").runMethod(true,"setText",BA.ObjectToCharSequence(_cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("TeamB")))));
 BA.debugLineNum = 190;BA.debugLine="lblteamAcoef.Text = cursor.GetString(\"TeamAcoef\"";
Debug.ShouldStop(536870912);
__ref.getField(false,"_lblteamacoef").runMethod(true,"setText",BA.ObjectToCharSequence(_cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("TeamAcoef")))));
 BA.debugLineNum = 191;BA.debugLine="lblteamBcoef.Text = cursor.GetString(\"TeamBcoef\"";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_lblteambcoef").runMethod(true,"setText",BA.ObjectToCharSequence(_cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("TeamBcoef")))));
 BA.debugLineNum = 192;BA.debugLine="lblmatchinfo.Text = cursor.GetString(\"MatchInfo\"";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_lblmatchinfo").runMethod(true,"setText",BA.ObjectToCharSequence(_cursor.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("MatchInfo")))));
 BA.debugLineNum = 193;BA.debugLine="pnl_bets.Panel.AddView(contenthold,0,0+(20%y + 1";
Debug.ShouldStop(1);
__ref.getField(false,"_pnl_bets").runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_contenthold").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0),(RemoteObject.solve(new RemoteObject[] {adminactions.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 20)),__ref.getField(false, "ba")),adminactions.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))}, "+",1, 1)),__ref.getField(true,"_i")}, "+*",1, 1)),(Object)(adminactions.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(adminactions.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 20)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 194;BA.debugLine="i = i + 1";
Debug.ShouldStop(2);
__ref.setField ("_i",RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_i"),RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 195;BA.debugLine="contenthold.AddView(teamAname,0,0,20%x,10%y)";
Debug.ShouldStop(4);
__ref.getField(false,"_contenthold").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_teamaname").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(adminactions.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 20)),__ref.getField(false, "ba"))),(Object)(adminactions.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 196;BA.debugLine="contenthold.AddView(lblteamAcoef,0,10%y,20%x,10%";
Debug.ShouldStop(8);
__ref.getField(false,"_contenthold").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_lblteamacoef").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(adminactions.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))),(Object)(adminactions.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 20)),__ref.getField(false, "ba"))),(Object)(adminactions.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 197;BA.debugLine="contenthold.AddView(teamBname,60%x,0,20%x,10%y)";
Debug.ShouldStop(16);
__ref.getField(false,"_contenthold").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_teambname").getObject())),(Object)(adminactions.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 60)),__ref.getField(false, "ba"))),(Object)(BA.numberCast(int.class, 0)),(Object)(adminactions.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 20)),__ref.getField(false, "ba"))),(Object)(adminactions.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 198;BA.debugLine="contenthold.AddView(lblteamBcoef,60%x,10%y,20%x,";
Debug.ShouldStop(32);
__ref.getField(false,"_contenthold").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_lblteambcoef").getObject())),(Object)(adminactions.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 60)),__ref.getField(false, "ba"))),(Object)(adminactions.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))),(Object)(adminactions.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 20)),__ref.getField(false, "ba"))),(Object)(adminactions.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 199;BA.debugLine="contenthold.AddView(betteamA,20%x,0,10%x,20%y)";
Debug.ShouldStop(64);
__ref.getField(false,"_contenthold").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_betteama").getObject())),(Object)(adminactions.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 20)),__ref.getField(false, "ba"))),(Object)(BA.numberCast(int.class, 0)),(Object)(adminactions.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))),(Object)(adminactions.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 20)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 200;BA.debugLine="contenthold.AddView(betteamB,50%x,0,10%x,20%y)";
Debug.ShouldStop(128);
__ref.getField(false,"_contenthold").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_betteamb").getObject())),(Object)(adminactions.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 50)),__ref.getField(false, "ba"))),(Object)(BA.numberCast(int.class, 0)),(Object)(adminactions.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))),(Object)(adminactions.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 20)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 201;BA.debugLine="contenthold.AddView(lblmatchinfo,30%x,0,50%x,20%";
Debug.ShouldStop(256);
__ref.getField(false,"_contenthold").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_lblmatchinfo").getObject())),(Object)(adminactions.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 30)),__ref.getField(false, "ba"))),(Object)(BA.numberCast(int.class, 0)),(Object)(adminactions.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 50)),__ref.getField(false, "ba"))),(Object)(adminactions.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 20)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 203;BA.debugLine="ActiveBets_Content";
Debug.ShouldStop(1024);
__ref.runClassMethod (b4a.example.adminactions.class, "_activebets_content");
 }
}Debug.locals.put("t", _t);
;
 BA.debugLineNum = 205;BA.debugLine="cursor.Close";
Debug.ShouldStop(4096);
_cursor.runVoidMethod ("Close");
 BA.debugLineNum = 206;BA.debugLine="Main.database1.Close";
Debug.ShouldStop(8192);
adminactions._main._database1.runVoidMethod ("Close");
 BA.debugLineNum = 207;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addbets_contents(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AddBets_Contents (adminactions) ","adminactions",3,__ref.getField(false, "ba"),__ref,97);
if (RapidSub.canDelegate("addbets_contents")) return __ref.runUserSub(false, "adminactions","addbets_contents", __ref);
 BA.debugLineNum = 97;BA.debugLine="Sub AddBets_Contents";
Debug.ShouldStop(1);
 BA.debugLineNum = 98;BA.debugLine="pnl_add_bets.Color = Colors.White";
Debug.ShouldStop(2);
__ref.getField(false,"_pnl_add_bets").runVoidMethod ("setColor",adminactions.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 99;BA.debugLine="pnl_add_bets.AddView(teamA,10%x,10%y,15%x,10%y)";
Debug.ShouldStop(4);
__ref.getField(false,"_pnl_add_bets").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_teama").getObject())),(Object)(adminactions.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))),(Object)(adminactions.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))),(Object)(adminactions.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),__ref.getField(false, "ba"))),(Object)(adminactions.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 100;BA.debugLine="pnl_add_bets.AddView(teamB,55%x,10%y,15%x,10%y)";
Debug.ShouldStop(8);
__ref.getField(false,"_pnl_add_bets").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_teamb").getObject())),(Object)(adminactions.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 55)),__ref.getField(false, "ba"))),(Object)(adminactions.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))),(Object)(adminactions.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),__ref.getField(false, "ba"))),(Object)(adminactions.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 101;BA.debugLine="teamA.Hint = \"TeamA\"";
Debug.ShouldStop(16);
__ref.getField(false,"_teama").runMethod(true,"setHint",BA.ObjectToString("TeamA"));
 BA.debugLineNum = 102;BA.debugLine="teamB.Hint = \"TeamB\"";
Debug.ShouldStop(32);
__ref.getField(false,"_teamb").runMethod(true,"setHint",BA.ObjectToString("TeamB"));
 BA.debugLineNum = 103;BA.debugLine="pnl_add_bets.AddView(teamAcoef,10%x,22%y,15%x,10%";
Debug.ShouldStop(64);
__ref.getField(false,"_pnl_add_bets").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_teamacoef").getObject())),(Object)(adminactions.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))),(Object)(adminactions.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 22)),__ref.getField(false, "ba"))),(Object)(adminactions.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),__ref.getField(false, "ba"))),(Object)(adminactions.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 104;BA.debugLine="pnl_add_bets.AddView(teamBcoef,55%x,22%y,15%x,10%";
Debug.ShouldStop(128);
__ref.getField(false,"_pnl_add_bets").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_teambcoef").getObject())),(Object)(adminactions.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 55)),__ref.getField(false, "ba"))),(Object)(adminactions.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 22)),__ref.getField(false, "ba"))),(Object)(adminactions.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),__ref.getField(false, "ba"))),(Object)(adminactions.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 105;BA.debugLine="teamAcoef.Hint = \"Coeficient\"";
Debug.ShouldStop(256);
__ref.getField(false,"_teamacoef").runMethod(true,"setHint",BA.ObjectToString("Coeficient"));
 BA.debugLineNum = 106;BA.debugLine="teamBcoef.Hint = \"Coeficient\"";
Debug.ShouldStop(512);
__ref.getField(false,"_teambcoef").runMethod(true,"setHint",BA.ObjectToString("Coeficient"));
 BA.debugLineNum = 107;BA.debugLine="teamAcoef.InputType = teamAcoef.INPUT_TYPE_DECIMA";
Debug.ShouldStop(1024);
__ref.getField(false,"_teamacoef").runMethod(true,"setInputType",__ref.getField(false,"_teamacoef").getField(true,"INPUT_TYPE_DECIMAL_NUMBERS"));
 BA.debugLineNum = 108;BA.debugLine="teamBcoef.InputType = teamBcoef.INPUT_TYPE_DECIMA";
Debug.ShouldStop(2048);
__ref.getField(false,"_teambcoef").runMethod(true,"setInputType",__ref.getField(false,"_teambcoef").getField(true,"INPUT_TYPE_DECIMAL_NUMBERS"));
 BA.debugLineNum = 109;BA.debugLine="pnl_add_bets.AddView(matchinfo,10%x,40%y,60%x,25%";
Debug.ShouldStop(4096);
__ref.getField(false,"_pnl_add_bets").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_matchinfo").getObject())),(Object)(adminactions.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))),(Object)(adminactions.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 40)),__ref.getField(false, "ba"))),(Object)(adminactions.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 60)),__ref.getField(false, "ba"))),(Object)(adminactions.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 25)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 110;BA.debugLine="matchinfo.Wrap = True";
Debug.ShouldStop(8192);
__ref.getField(false,"_matchinfo").runVoidMethod ("setWrap",adminactions.__c.getField(true,"True"));
 BA.debugLineNum = 111;BA.debugLine="pnl_add_bets.AddView(submit,30%x,70%y,10%x,10%y)";
Debug.ShouldStop(16384);
__ref.getField(false,"_pnl_add_bets").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_submit").getObject())),(Object)(adminactions.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 30)),__ref.getField(false, "ba"))),(Object)(adminactions.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 70)),__ref.getField(false, "ba"))),(Object)(adminactions.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))),(Object)(adminactions.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 112;BA.debugLine="submit.Text = \"Submit\"";
Debug.ShouldStop(32768);
__ref.getField(false,"_submit").runMethod(true,"setText",BA.ObjectToCharSequence("Submit"));
 BA.debugLineNum = 113;BA.debugLine="submit.Color = Colors.RGB(0, 153, 51)";
Debug.ShouldStop(65536);
__ref.getField(false,"_submit").runVoidMethod ("setColor",adminactions.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 153)),(Object)(BA.numberCast(int.class, 51))));
 BA.debugLineNum = 115;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
		Debug.PushSubsStack("Build_UI (adminactions) ","adminactions",3,__ref.getField(false, "ba"),__ref,62);
if (RapidSub.canDelegate("build_ui")) return __ref.runUserSub(false, "adminactions","build_ui", __ref);
 BA.debugLineNum = 62;BA.debugLine="Sub Build_UI";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 63;BA.debugLine="TabhostActions.AddTab2(\"Active bets\",pnl_bets)";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_tabhostactions").runVoidMethod ("AddTab2",(Object)(BA.ObjectToString("Active bets")),(Object)((__ref.getField(false,"_pnl_bets").getObject())));
 BA.debugLineNum = 64;BA.debugLine="TabhostActions.AddTab2(\"Add Bets\",pnl_add_bets)";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_tabhostactions").runVoidMethod ("AddTab2",(Object)(BA.ObjectToString("Add Bets")),(Object)((__ref.getField(false,"_pnl_add_bets").getObject())));
 BA.debugLineNum = 65;BA.debugLine="TabhostActions.AddTab2(\"Users\",pnl_currentUsers)";
Debug.ShouldStop(1);
__ref.getField(false,"_tabhostactions").runVoidMethod ("AddTab2",(Object)(BA.ObjectToString("Users")),(Object)((__ref.getField(false,"_pnl_currentusers").getObject())));
 BA.debugLineNum = 66;BA.debugLine="AddBets_Contents";
Debug.ShouldStop(2);
__ref.runClassMethod (b4a.example.adminactions.class, "_addbets_contents");
 BA.debugLineNum = 67;BA.debugLine="CurrentUsers";
Debug.ShouldStop(4);
__ref.runClassMethod (b4a.example.adminactions.class, "_currentusers");
 BA.debugLineNum = 69;BA.debugLine="ShowCurrentBets";
Debug.ShouldStop(16);
__ref.runClassMethod (b4a.example.adminactions.class, "_showcurrentbets");
 BA.debugLineNum = 71;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
adminactions._tabhostactions = RemoteObject.createNew ("anywheresoftware.b4a.objects.TabHostWrapper");__ref.setField("_tabhostactions",adminactions._tabhostactions);
 //BA.debugLineNum = 3;BA.debugLine="Dim pnl_bets As ScrollView";
adminactions._pnl_bets = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");__ref.setField("_pnl_bets",adminactions._pnl_bets);
 //BA.debugLineNum = 4;BA.debugLine="Dim pnl_add_bets As Panel";
adminactions._pnl_add_bets = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnl_add_bets",adminactions._pnl_add_bets);
 //BA.debugLineNum = 5;BA.debugLine="Dim pnl_currentUsers As Panel";
adminactions._pnl_currentusers = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnl_currentusers",adminactions._pnl_currentusers);
 //BA.debugLineNum = 7;BA.debugLine="Dim textfield As EditText";
adminactions._textfield = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_textfield",adminactions._textfield);
 //BA.debugLineNum = 8;BA.debugLine="Dim Deposit  As Button";
adminactions._deposit = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_deposit",adminactions._deposit);
 //BA.debugLineNum = 9;BA.debugLine="Dim Withdraw As Button";
adminactions._withdraw = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_withdraw",adminactions._withdraw);
 //BA.debugLineNum = 11;BA.debugLine="Dim booBuild As Boolean";
adminactions._boobuild = RemoteObject.createImmutable(false);__ref.setField("_boobuild",adminactions._boobuild);
 //BA.debugLineNum = 13;BA.debugLine="Dim lbl_showusers As Label";
adminactions._lbl_showusers = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lbl_showusers",adminactions._lbl_showusers);
 //BA.debugLineNum = 15;BA.debugLine="Dim teamA As EditText";
adminactions._teama = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_teama",adminactions._teama);
 //BA.debugLineNum = 16;BA.debugLine="Dim teamB As EditText";
adminactions._teamb = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_teamb",adminactions._teamb);
 //BA.debugLineNum = 17;BA.debugLine="Dim teamAcoef As EditText";
adminactions._teamacoef = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_teamacoef",adminactions._teamacoef);
 //BA.debugLineNum = 18;BA.debugLine="Dim teamBcoef As EditText";
adminactions._teambcoef = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_teambcoef",adminactions._teambcoef);
 //BA.debugLineNum = 19;BA.debugLine="Dim matchinfo As EditText";
adminactions._matchinfo = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_matchinfo",adminactions._matchinfo);
 //BA.debugLineNum = 20;BA.debugLine="Dim submit As Button";
adminactions._submit = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_submit",adminactions._submit);
 //BA.debugLineNum = 23;BA.debugLine="Dim contenthold As Panel";
adminactions._contenthold = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_contenthold",adminactions._contenthold);
 //BA.debugLineNum = 24;BA.debugLine="Dim teamAname As Label";
adminactions._teamaname = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_teamaname",adminactions._teamaname);
 //BA.debugLineNum = 25;BA.debugLine="Dim teamBname As Label";
adminactions._teambname = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_teambname",adminactions._teambname);
 //BA.debugLineNum = 26;BA.debugLine="Dim lblteamAcoef As Label";
adminactions._lblteamacoef = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblteamacoef",adminactions._lblteamacoef);
 //BA.debugLineNum = 27;BA.debugLine="Dim lblteamBcoef As Label";
adminactions._lblteambcoef = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblteambcoef",adminactions._lblteambcoef);
 //BA.debugLineNum = 28;BA.debugLine="Dim lblmatchinfo As Label";
adminactions._lblmatchinfo = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblmatchinfo",adminactions._lblmatchinfo);
 //BA.debugLineNum = 29;BA.debugLine="Dim betteamA As Button";
adminactions._betteama = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_betteama",adminactions._betteama);
 //BA.debugLineNum = 30;BA.debugLine="Dim betteamB As Button";
adminactions._betteamb = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_betteamb",adminactions._betteamb);
 //BA.debugLineNum = 31;BA.debugLine="Dim i As Int = 0";
adminactions._i = BA.numberCast(int.class, 0);__ref.setField("_i",adminactions._i);
 //BA.debugLineNum = 32;BA.debugLine="Dim betbtntag As Int = 0";
adminactions._betbtntag = BA.numberCast(int.class, 0);__ref.setField("_betbtntag",adminactions._betbtntag);
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _currentusers(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CurrentUsers (adminactions) ","adminactions",3,__ref.getField(false, "ba"),__ref,80);
if (RapidSub.canDelegate("currentusers")) return __ref.runUserSub(false, "adminactions","currentusers", __ref);
RemoteObject _cursor1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _k = 0;
 BA.debugLineNum = 80;BA.debugLine="Sub CurrentUsers";
Debug.ShouldStop(32768);
 BA.debugLineNum = 81;BA.debugLine="pnl_currentUsers.Color = Colors.White";
Debug.ShouldStop(65536);
__ref.getField(false,"_pnl_currentusers").runVoidMethod ("setColor",adminactions.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 82;BA.debugLine="pnl_currentUsers.AddView(lbl_showusers,0,0,100%x,";
Debug.ShouldStop(131072);
__ref.getField(false,"_pnl_currentusers").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_lbl_showusers").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(adminactions.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(adminactions.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 83;BA.debugLine="lbl_showusers.TextColor = Colors.Black";
Debug.ShouldStop(262144);
__ref.getField(false,"_lbl_showusers").runMethod(true,"setTextColor",adminactions.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 84;BA.debugLine="lbl_showusers.Text = \"USERNAME/PASSWORD/MONEY/RAN";
Debug.ShouldStop(524288);
__ref.getField(false,"_lbl_showusers").runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("USERNAME/PASSWORD/MONEY/RANK/"),adminactions.__c.getField(true,"CRLF"))));
 BA.debugLineNum = 85;BA.debugLine="Dim cursor1 As Cursor";
Debug.ShouldStop(1048576);
_cursor1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("cursor1", _cursor1);
 BA.debugLineNum = 86;BA.debugLine="Main.database.Initialize(File.DirDefaultExternal,";
Debug.ShouldStop(2097152);
adminactions._main._database.runVoidMethod ("Initialize",(Object)(adminactions.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(BA.ObjectToString("userdatabase.db")),(Object)(adminactions.__c.getField(true,"True")));
 BA.debugLineNum = 87;BA.debugLine="cursor1 = Main.database.ExecQuery(\"SELECT Usernam";
Debug.ShouldStop(4194304);
_cursor1.setObject(adminactions._main._database.runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT Username, Password, Money, Rank FROM Users"))));
 BA.debugLineNum = 88;BA.debugLine="For k = 0 To cursor1.RowCount - 1";
Debug.ShouldStop(8388608);
{
final int step8 = 1;
final int limit8 = RemoteObject.solve(new RemoteObject[] {_cursor1.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_k = 0 ;
for (;(step8 > 0 && _k <= limit8) || (step8 < 0 && _k >= limit8) ;_k = ((int)(0 + _k + step8))  ) {
Debug.locals.put("k", _k);
 BA.debugLineNum = 89;BA.debugLine="cursor1.Position = k";
Debug.ShouldStop(16777216);
_cursor1.runMethod(true,"setPosition",BA.numberCast(int.class, _k));
 BA.debugLineNum = 91;BA.debugLine="lbl_showusers.Text =lbl_showusers.Text & cursor1";
Debug.ShouldStop(67108864);
__ref.getField(false,"_lbl_showusers").runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(__ref.getField(false,"_lbl_showusers").runMethod(true,"getText"),_cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Username"))),RemoteObject.createImmutable("/"),_cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Password"))),RemoteObject.createImmutable("/"),_cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Money"))),RemoteObject.createImmutable("/"),_cursor1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Rank"))),adminactions.__c.getField(true,"CRLF"))));
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 93;BA.debugLine="cursor1.Close";
Debug.ShouldStop(268435456);
_cursor1.runVoidMethod ("Close");
 BA.debugLineNum = 94;BA.debugLine="Main.database.Close";
Debug.ShouldStop(536870912);
adminactions._main._database.runVoidMethod ("Close");
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
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (adminactions) ","adminactions",3,__ref.getField(false, "ba"),__ref,37);
if (RapidSub.canDelegate("initialize")) return __ref.runUserSub(false, "adminactions","initialize", __ref, _ba);
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 37;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(16);
 BA.debugLineNum = 38;BA.debugLine="TabhostActions.Initialize(\"tabhost1\")";
Debug.ShouldStop(32);
__ref.getField(false,"_tabhostactions").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("tabhost1")));
 BA.debugLineNum = 39;BA.debugLine="pnl_bets.Initialize(-1)";
Debug.ShouldStop(64);
__ref.getField(false,"_pnl_bets").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, -(double) (0 + 1))));
 BA.debugLineNum = 40;BA.debugLine="pnl_add_bets.Initialize(\"moneys\")";
Debug.ShouldStop(128);
__ref.getField(false,"_pnl_add_bets").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("moneys")));
 BA.debugLineNum = 41;BA.debugLine="pnl_currentUsers.Initialize(\"users\")";
Debug.ShouldStop(256);
__ref.getField(false,"_pnl_currentusers").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("users")));
 BA.debugLineNum = 43;BA.debugLine="lbl_showusers.Initialize(\"showusers\")";
Debug.ShouldStop(1024);
__ref.getField(false,"_lbl_showusers").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("showusers")));
 BA.debugLineNum = 45;BA.debugLine="textfield.Initialize(\"sumfield\")";
Debug.ShouldStop(4096);
__ref.getField(false,"_textfield").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("sumfield")));
 BA.debugLineNum = 46;BA.debugLine="Deposit.Initialize(\"deposit\")";
Debug.ShouldStop(8192);
__ref.getField(false,"_deposit").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("deposit")));
 BA.debugLineNum = 47;BA.debugLine="Withdraw.Initialize(\"withdraw\")";
Debug.ShouldStop(16384);
__ref.getField(false,"_withdraw").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("withdraw")));
 BA.debugLineNum = 49;BA.debugLine="teamA.Initialize(\"team1\")";
Debug.ShouldStop(65536);
__ref.getField(false,"_teama").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("team1")));
 BA.debugLineNum = 50;BA.debugLine="teamB.Initialize(\"team2\")";
Debug.ShouldStop(131072);
__ref.getField(false,"_teamb").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("team2")));
 BA.debugLineNum = 51;BA.debugLine="teamAcoef.Initialize(\"team1c\")";
Debug.ShouldStop(262144);
__ref.getField(false,"_teamacoef").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("team1c")));
 BA.debugLineNum = 52;BA.debugLine="teamBcoef.Initialize(\"team2c\")";
Debug.ShouldStop(524288);
__ref.getField(false,"_teambcoef").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("team2c")));
 BA.debugLineNum = 53;BA.debugLine="matchinfo.Initialize(\"matchinfo\")";
Debug.ShouldStop(1048576);
__ref.getField(false,"_matchinfo").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("matchinfo")));
 BA.debugLineNum = 54;BA.debugLine="submit.Initialize(\"submit\")";
Debug.ShouldStop(2097152);
__ref.getField(false,"_submit").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("submit")));
 BA.debugLineNum = 55;BA.debugLine="If booBuild = False Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_boobuild"),adminactions.__c.getField(true,"False"))) { 
 BA.debugLineNum = 56;BA.debugLine="Build_UI";
Debug.ShouldStop(8388608);
__ref.runClassMethod (b4a.example.adminactions.class, "_build_ui");
 BA.debugLineNum = 57;BA.debugLine="booBuild = True";
Debug.ShouldStop(16777216);
__ref.setField ("_boobuild",adminactions.__c.getField(true,"True"));
 };
 BA.debugLineNum = 60;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
		Debug.PushSubsStack("ShowCurrentBets (adminactions) ","adminactions",3,__ref.getField(false, "ba"),__ref,73);
if (RapidSub.canDelegate("showcurrentbets")) return __ref.runUserSub(false, "adminactions","showcurrentbets", __ref);
 BA.debugLineNum = 73;BA.debugLine="Sub ShowCurrentBets";
Debug.ShouldStop(256);
 BA.debugLineNum = 74;BA.debugLine="ActiveBetsCreate";
Debug.ShouldStop(512);
__ref.runClassMethod (b4a.example.adminactions.class, "_activebetscreate");
 BA.debugLineNum = 75;BA.debugLine="If contenthold.IsInitialized Then";
Debug.ShouldStop(1024);
if (__ref.getField(false,"_contenthold").runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 76;BA.debugLine="ActiveBets_Content";
Debug.ShouldStop(2048);
__ref.runClassMethod (b4a.example.adminactions.class, "_activebets_content");
 };
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
public static RemoteObject  _submit_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("submit_Click (adminactions) ","adminactions",3,__ref.getField(false, "ba"),__ref,154);
if (RapidSub.canDelegate("submit_click")) return __ref.runUserSub(false, "adminactions","submit_click", __ref);
 BA.debugLineNum = 154;BA.debugLine="Sub submit_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 156;BA.debugLine="If teamA.Text = \"\" Or teamB.Text = \"\" Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_teama").runMethod(true,"getText"),BA.ObjectToString("")) || RemoteObject.solveBoolean("=",__ref.getField(false,"_teamb").runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 157;BA.debugLine="ToastMessageShow(\"Missing information\",False)";
Debug.ShouldStop(268435456);
adminactions.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Missing information")),(Object)(adminactions.__c.getField(true,"False")));
 }else {
 BA.debugLineNum = 159;BA.debugLine="If teamAcoef.Text = \"\" Or teamBcoef.Text = \"\" Th";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_teamacoef").runMethod(true,"getText"),BA.ObjectToString("")) || RemoteObject.solveBoolean("=",__ref.getField(false,"_teambcoef").runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 160;BA.debugLine="ToastMessageShow(\"Missing information\",False)";
Debug.ShouldStop(-2147483648);
adminactions.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Missing information")),(Object)(adminactions.__c.getField(true,"False")));
 }else {
 BA.debugLineNum = 162;BA.debugLine="Main.database1.Initialize(File.DirDefaultExtern";
Debug.ShouldStop(2);
adminactions._main._database1.runVoidMethod ("Initialize",(Object)(adminactions.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(BA.ObjectToString("bets_database.db")),(Object)(adminactions.__c.getField(true,"True")));
 BA.debugLineNum = 163;BA.debugLine="Main.database1.ExecNonQuery(\"INSERT INTO Bets (";
Debug.ShouldStop(4);
adminactions._main._database1.runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("INSERT INTO Bets (TeamA,TeamAcoef,TeamB,TeamBcoef,MatchInfo) VALUES ('"),__ref.getField(false,"_teama").runMethod(true,"getText"),RemoteObject.createImmutable("','"),__ref.getField(false,"_teamacoef").runMethod(true,"getText"),RemoteObject.createImmutable("','"),__ref.getField(false,"_teamb").runMethod(true,"getText"),RemoteObject.createImmutable("','"),__ref.getField(false,"_teambcoef").runMethod(true,"getText"),RemoteObject.createImmutable("','"),__ref.getField(false,"_matchinfo").runMethod(true,"getText"),RemoteObject.createImmutable("')"))));
 BA.debugLineNum = 164;BA.debugLine="ActiveBetsCreate";
Debug.ShouldStop(8);
__ref.runClassMethod (b4a.example.adminactions.class, "_activebetscreate");
 BA.debugLineNum = 165;BA.debugLine="Main.database1.Close";
Debug.ShouldStop(16);
adminactions._main._database1.runVoidMethod ("Close");
 };
 };
 BA.debugLineNum = 168;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}