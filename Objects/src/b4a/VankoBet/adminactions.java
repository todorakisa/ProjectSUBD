package b4a.VankoBet;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class adminactions extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.VankoBet.adminactions");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.VankoBet.adminactions.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.TabHostWrapper _tabhostactions = null;
public anywheresoftware.b4a.objects.ScrollViewWrapper _pnl_bets = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnl_add_bets = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnl_currentusers = null;
public anywheresoftware.b4a.objects.EditTextWrapper _textfield = null;
public anywheresoftware.b4a.objects.ButtonWrapper _deposit = null;
public anywheresoftware.b4a.objects.ButtonWrapper _withdraw = null;
public boolean _boobuild = false;
public anywheresoftware.b4a.objects.LabelWrapper _lbl_showusers = null;
public anywheresoftware.b4a.objects.EditTextWrapper _teama = null;
public anywheresoftware.b4a.objects.EditTextWrapper _teamb = null;
public anywheresoftware.b4a.objects.EditTextWrapper _teamacoef = null;
public anywheresoftware.b4a.objects.EditTextWrapper _teambcoef = null;
public anywheresoftware.b4a.objects.EditTextWrapper _matchinfo = null;
public anywheresoftware.b4a.objects.ButtonWrapper _submit = null;
public anywheresoftware.b4a.objects.PanelWrapper _contenthold = null;
public anywheresoftware.b4a.objects.LabelWrapper _teamaname = null;
public anywheresoftware.b4a.objects.LabelWrapper _teambname = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblteamacoef = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblteambcoef = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblmatchinfo = null;
public anywheresoftware.b4a.objects.ButtonWrapper _betteama = null;
public anywheresoftware.b4a.objects.ButtonWrapper _betteamb = null;
public int _i = 0;
public int _betbtntag = 0;
public b4a.VankoBet.main _main = null;
public b4a.VankoBet.types _types = null;
public b4a.VankoBet.starter _starter = null;
public b4a.VankoBet.helperfunctions _helperfunctions = null;
public b4a.VankoBet.db _db = null;
public String  _activebets_content() throws Exception{
 //BA.debugLineNum = 116;BA.debugLine="Sub ActiveBets_Content";
 //BA.debugLineNum = 117;BA.debugLine="pnl_bets.Color = Colors.White";
_pnl_bets.setColor(__c.Colors.White);
 //BA.debugLineNum = 118;BA.debugLine="contenthold.Color = Colors.LightGray";
_contenthold.setColor(__c.Colors.LightGray);
 //BA.debugLineNum = 120;BA.debugLine="betteamA.Color = Colors.RGB(0, 153, 0)";
_betteama.setColor(__c.Colors.RGB((int) (0),(int) (153),(int) (0)));
 //BA.debugLineNum = 121;BA.debugLine="betteamA.Text = \"Bet\"";
_betteama.setText(BA.ObjectToCharSequence("Bet"));
 //BA.debugLineNum = 122;BA.debugLine="betteamA.TextSize = 40";
_betteama.setTextSize((float) (40));
 //BA.debugLineNum = 123;BA.debugLine="betteamA.Gravity = Gravity.CENTER";
_betteama.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 125;BA.debugLine="betteamB.Color = Colors.RGB(0, 153, 0)";
_betteamb.setColor(__c.Colors.RGB((int) (0),(int) (153),(int) (0)));
 //BA.debugLineNum = 126;BA.debugLine="betteamB.Text = \"Bet\"";
_betteamb.setText(BA.ObjectToCharSequence("Bet"));
 //BA.debugLineNum = 127;BA.debugLine="betteamB.TextSize = 40";
_betteamb.setTextSize((float) (40));
 //BA.debugLineNum = 128;BA.debugLine="betteamB.Gravity = Gravity.CENTER";
_betteamb.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 130;BA.debugLine="teamAname.TextColor = Colors.Black";
_teamaname.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 131;BA.debugLine="teamBname.TextColor = Colors.Black";
_teambname.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 132;BA.debugLine="teamAname.TextSize = 30";
_teamaname.setTextSize((float) (30));
 //BA.debugLineNum = 133;BA.debugLine="teamBname.TextSize = 30";
_teambname.setTextSize((float) (30));
 //BA.debugLineNum = 134;BA.debugLine="teamAname.Gravity = Gravity.CENTER";
_teamaname.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 135;BA.debugLine="teamBname.Gravity = Gravity.CENTER";
_teambname.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 137;BA.debugLine="lblteamAcoef.TextColor = Colors.Black";
_lblteamacoef.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 138;BA.debugLine="lblteamBcoef.TextColor = Colors.Black";
_lblteambcoef.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 139;BA.debugLine="lblteamAcoef.TextSize = 30";
_lblteamacoef.setTextSize((float) (30));
 //BA.debugLineNum = 140;BA.debugLine="lblteamBcoef.TextSize = 30";
_lblteambcoef.setTextSize((float) (30));
 //BA.debugLineNum = 141;BA.debugLine="lblteamAcoef.Gravity = Gravity.CENTER";
_lblteamacoef.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 142;BA.debugLine="lblteamBcoef.Gravity = Gravity.CENTER";
_lblteambcoef.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 143;BA.debugLine="lblmatchinfo.TextColor = Colors.Black";
_lblmatchinfo.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 144;BA.debugLine="lblmatchinfo.TextSize = 20";
_lblmatchinfo.setTextSize((float) (20));
 //BA.debugLineNum = 145;BA.debugLine="betteamA.Tag = betbtntag";
_betteama.setTag((Object)(_betbtntag));
 //BA.debugLineNum = 146;BA.debugLine="betbtntag = betbtntag + 1";
_betbtntag = (int) (_betbtntag+1);
 //BA.debugLineNum = 149;BA.debugLine="betteamB.Tag = betbtntag";
_betteamb.setTag((Object)(_betbtntag));
 //BA.debugLineNum = 150;BA.debugLine="betbtntag = betbtntag + 1";
_betbtntag = (int) (_betbtntag+1);
 //BA.debugLineNum = 151;BA.debugLine="End Sub";
return "";
}
public String  _activebetscreate() throws Exception{
anywheresoftware.b4a.sql.SQL.CursorWrapper _cursor = null;
int _t = 0;
 //BA.debugLineNum = 167;BA.debugLine="Sub ActiveBetsCreate";
 //BA.debugLineNum = 169;BA.debugLine="DB.database.Initialize(File.DirDefaultExternal,\"U";
_db._database.Initialize(__c.File.getDirDefaultExternal(),"UserAndBetsDatabase.db",__c.True);
 //BA.debugLineNum = 170;BA.debugLine="Dim cursor As Cursor";
_cursor = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
 //BA.debugLineNum = 171;BA.debugLine="cursor = DB.database.ExecQuery(\"SELECT ID,TeamA,T";
_cursor.setObject((android.database.Cursor)(_db._database.ExecQuery("SELECT ID,TeamA,TeamAcoef, TeamB, TeamBcoef,MatchInfo FROM Bets")));
 //BA.debugLineNum = 173;BA.debugLine="For t = 0 To cursor.RowCount - 1";
{
final int step4 = 1;
final int limit4 = (int) (_cursor.getRowCount()-1);
_t = (int) (0) ;
for (;(step4 > 0 && _t <= limit4) || (step4 < 0 && _t >= limit4) ;_t = ((int)(0 + _t + step4))  ) {
 //BA.debugLineNum = 174;BA.debugLine="cursor.Position = t";
_cursor.setPosition(_t);
 //BA.debugLineNum = 175;BA.debugLine="contenthold.Initialize(\"contents\")";
_contenthold.Initialize(ba,"contents");
 //BA.debugLineNum = 176;BA.debugLine="teamAname.Initialize(\"name1\")";
_teamaname.Initialize(ba,"name1");
 //BA.debugLineNum = 177;BA.debugLine="teamBname.Initialize(\"name2\")";
_teambname.Initialize(ba,"name2");
 //BA.debugLineNum = 178;BA.debugLine="lblteamAcoef.Initialize(\"coef1\")";
_lblteamacoef.Initialize(ba,"coef1");
 //BA.debugLineNum = 179;BA.debugLine="lblteamBcoef.Initialize(\"coef2\")";
_lblteambcoef.Initialize(ba,"coef2");
 //BA.debugLineNum = 180;BA.debugLine="lblmatchinfo.Initialize(\"info1\")";
_lblmatchinfo.Initialize(ba,"info1");
 //BA.debugLineNum = 181;BA.debugLine="betteamA.Initialize(\"btn1\")";
_betteama.Initialize(ba,"btn1");
 //BA.debugLineNum = 182;BA.debugLine="betteamB.Initialize(\"btn2\")";
_betteamb.Initialize(ba,"btn2");
 //BA.debugLineNum = 185;BA.debugLine="teamAname.Text = cursor.GetString(\"TeamA\")";
_teamaname.setText(BA.ObjectToCharSequence(_cursor.GetString("TeamA")));
 //BA.debugLineNum = 186;BA.debugLine="teamBname.Text = cursor.GetString(\"TeamB\")";
_teambname.setText(BA.ObjectToCharSequence(_cursor.GetString("TeamB")));
 //BA.debugLineNum = 187;BA.debugLine="lblteamAcoef.Text = cursor.GetString(\"TeamAcoef\"";
_lblteamacoef.setText(BA.ObjectToCharSequence(_cursor.GetString("TeamAcoef")));
 //BA.debugLineNum = 188;BA.debugLine="lblteamBcoef.Text = cursor.GetString(\"TeamBcoef\"";
_lblteambcoef.setText(BA.ObjectToCharSequence(_cursor.GetString("TeamBcoef")));
 //BA.debugLineNum = 189;BA.debugLine="lblmatchinfo.Text = cursor.GetString(\"MatchInfo\"";
_lblmatchinfo.setText(BA.ObjectToCharSequence(_cursor.GetString("MatchInfo")));
 //BA.debugLineNum = 190;BA.debugLine="pnl_bets.Panel.AddView(contenthold,0,0+(20%y + 1";
_pnl_bets.getPanel().AddView((android.view.View)(_contenthold.getObject()),(int) (0),(int) (0+(__c.PerYToCurrent((float) (20),ba)+__c.DipToCurrent((int) (1)))*_i),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (20),ba));
 //BA.debugLineNum = 191;BA.debugLine="i = i + 1";
_i = (int) (_i+1);
 //BA.debugLineNum = 192;BA.debugLine="contenthold.AddView(teamAname,0,0,20%x,10%y)";
_contenthold.AddView((android.view.View)(_teamaname.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 193;BA.debugLine="contenthold.AddView(lblteamAcoef,0,10%y,20%x,10%";
_contenthold.AddView((android.view.View)(_lblteamacoef.getObject()),(int) (0),__c.PerYToCurrent((float) (10),ba),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 194;BA.debugLine="contenthold.AddView(teamBname,60%x,0,20%x,10%y)";
_contenthold.AddView((android.view.View)(_teambname.getObject()),__c.PerXToCurrent((float) (60),ba),(int) (0),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 195;BA.debugLine="contenthold.AddView(lblteamBcoef,60%x,10%y,20%x,";
_contenthold.AddView((android.view.View)(_lblteambcoef.getObject()),__c.PerXToCurrent((float) (60),ba),__c.PerYToCurrent((float) (10),ba),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 196;BA.debugLine="contenthold.AddView(betteamA,20%x,0,10%x,20%y)";
_contenthold.AddView((android.view.View)(_betteama.getObject()),__c.PerXToCurrent((float) (20),ba),(int) (0),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (20),ba));
 //BA.debugLineNum = 197;BA.debugLine="contenthold.AddView(betteamB,50%x,0,10%x,20%y)";
_contenthold.AddView((android.view.View)(_betteamb.getObject()),__c.PerXToCurrent((float) (50),ba),(int) (0),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (20),ba));
 //BA.debugLineNum = 198;BA.debugLine="contenthold.AddView(lblmatchinfo,30%x,0,50%x,20%";
_contenthold.AddView((android.view.View)(_lblmatchinfo.getObject()),__c.PerXToCurrent((float) (30),ba),(int) (0),__c.PerXToCurrent((float) (50),ba),__c.PerYToCurrent((float) (20),ba));
 //BA.debugLineNum = 200;BA.debugLine="ActiveBets_Content";
_activebets_content();
 }
};
 //BA.debugLineNum = 202;BA.debugLine="cursor.Close";
_cursor.Close();
 //BA.debugLineNum = 203;BA.debugLine="DB.database.Close";
_db._database.Close();
 //BA.debugLineNum = 204;BA.debugLine="End Sub";
return "";
}
public String  _addbets_contents() throws Exception{
 //BA.debugLineNum = 96;BA.debugLine="Sub AddBets_Contents";
 //BA.debugLineNum = 97;BA.debugLine="pnl_add_bets.Color = Colors.White";
_pnl_add_bets.setColor(__c.Colors.White);
 //BA.debugLineNum = 98;BA.debugLine="pnl_add_bets.AddView(teamA,10%x,10%y,15%x,10%y)";
_pnl_add_bets.AddView((android.view.View)(_teama.getObject()),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (10),ba),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 99;BA.debugLine="pnl_add_bets.AddView(teamB,55%x,10%y,15%x,10%y)";
_pnl_add_bets.AddView((android.view.View)(_teamb.getObject()),__c.PerXToCurrent((float) (55),ba),__c.PerYToCurrent((float) (10),ba),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 100;BA.debugLine="teamA.Hint = \"TeamA\"";
_teama.setHint("TeamA");
 //BA.debugLineNum = 101;BA.debugLine="teamB.Hint = \"TeamB\"";
_teamb.setHint("TeamB");
 //BA.debugLineNum = 102;BA.debugLine="pnl_add_bets.AddView(teamAcoef,10%x,22%y,15%x,10%";
_pnl_add_bets.AddView((android.view.View)(_teamacoef.getObject()),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (22),ba),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 103;BA.debugLine="pnl_add_bets.AddView(teamBcoef,55%x,22%y,15%x,10%";
_pnl_add_bets.AddView((android.view.View)(_teambcoef.getObject()),__c.PerXToCurrent((float) (55),ba),__c.PerYToCurrent((float) (22),ba),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 104;BA.debugLine="teamAcoef.Hint = \"Coeficient\"";
_teamacoef.setHint("Coeficient");
 //BA.debugLineNum = 105;BA.debugLine="teamBcoef.Hint = \"Coeficient\"";
_teambcoef.setHint("Coeficient");
 //BA.debugLineNum = 106;BA.debugLine="teamAcoef.InputType = teamAcoef.INPUT_TYPE_DECIMA";
_teamacoef.setInputType(_teamacoef.INPUT_TYPE_DECIMAL_NUMBERS);
 //BA.debugLineNum = 107;BA.debugLine="teamBcoef.InputType = teamBcoef.INPUT_TYPE_DECIMA";
_teambcoef.setInputType(_teambcoef.INPUT_TYPE_DECIMAL_NUMBERS);
 //BA.debugLineNum = 108;BA.debugLine="pnl_add_bets.AddView(matchinfo,10%x,40%y,60%x,25%";
_pnl_add_bets.AddView((android.view.View)(_matchinfo.getObject()),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (40),ba),__c.PerXToCurrent((float) (60),ba),__c.PerYToCurrent((float) (25),ba));
 //BA.debugLineNum = 109;BA.debugLine="matchinfo.Wrap = True";
_matchinfo.setWrap(__c.True);
 //BA.debugLineNum = 110;BA.debugLine="pnl_add_bets.AddView(submit,30%x,70%y,10%x,10%y)";
_pnl_add_bets.AddView((android.view.View)(_submit.getObject()),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (70),ba),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 111;BA.debugLine="submit.Text = \"Submit\"";
_submit.setText(BA.ObjectToCharSequence("Submit"));
 //BA.debugLineNum = 112;BA.debugLine="submit.Color = Colors.RGB(0, 153, 51)";
_submit.setColor(__c.Colors.RGB((int) (0),(int) (153),(int) (51)));
 //BA.debugLineNum = 114;BA.debugLine="End Sub";
return "";
}
public String  _build_ui() throws Exception{
 //BA.debugLineNum = 62;BA.debugLine="Sub Build_UI";
 //BA.debugLineNum = 63;BA.debugLine="TabhostActions.AddTab2(\"Active bets\",pnl_bets)";
_tabhostactions.AddTab2("Active bets",(android.view.View)(_pnl_bets.getObject()));
 //BA.debugLineNum = 64;BA.debugLine="TabhostActions.AddTab2(\"Add Bets\",pnl_add_bets)";
_tabhostactions.AddTab2("Add Bets",(android.view.View)(_pnl_add_bets.getObject()));
 //BA.debugLineNum = 65;BA.debugLine="TabhostActions.AddTab2(\"Users\",pnl_currentUsers)";
_tabhostactions.AddTab2("Users",(android.view.View)(_pnl_currentusers.getObject()));
 //BA.debugLineNum = 66;BA.debugLine="AddBets_Contents";
_addbets_contents();
 //BA.debugLineNum = 67;BA.debugLine="CurrentUsers";
_currentusers();
 //BA.debugLineNum = 69;BA.debugLine="ShowCurrentBets";
_showcurrentbets();
 //BA.debugLineNum = 71;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Public TabhostActions As TabHost";
_tabhostactions = new anywheresoftware.b4a.objects.TabHostWrapper();
 //BA.debugLineNum = 3;BA.debugLine="Dim pnl_bets As ScrollView";
_pnl_bets = new anywheresoftware.b4a.objects.ScrollViewWrapper();
 //BA.debugLineNum = 4;BA.debugLine="Dim pnl_add_bets As Panel";
_pnl_add_bets = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 5;BA.debugLine="Dim pnl_currentUsers As Panel";
_pnl_currentusers = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 7;BA.debugLine="Dim textfield As EditText";
_textfield = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 8;BA.debugLine="Dim Deposit  As Button";
_deposit = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 9;BA.debugLine="Dim Withdraw As Button";
_withdraw = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 11;BA.debugLine="Dim booBuild As Boolean";
_boobuild = false;
 //BA.debugLineNum = 13;BA.debugLine="Dim lbl_showusers As Label";
_lbl_showusers = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 15;BA.debugLine="Dim teamA As EditText";
_teama = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 16;BA.debugLine="Dim teamB As EditText";
_teamb = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 17;BA.debugLine="Dim teamAcoef As EditText";
_teamacoef = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Dim teamBcoef As EditText";
_teambcoef = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 19;BA.debugLine="Dim matchinfo As EditText";
_matchinfo = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 20;BA.debugLine="Dim submit As Button";
_submit = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 23;BA.debugLine="Dim contenthold As Panel";
_contenthold = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 24;BA.debugLine="Dim teamAname As Label";
_teamaname = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 25;BA.debugLine="Dim teamBname As Label";
_teambname = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 26;BA.debugLine="Dim lblteamAcoef As Label";
_lblteamacoef = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 27;BA.debugLine="Dim lblteamBcoef As Label";
_lblteambcoef = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 28;BA.debugLine="Dim lblmatchinfo As Label";
_lblmatchinfo = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 29;BA.debugLine="Dim betteamA As Button";
_betteama = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 30;BA.debugLine="Dim betteamB As Button";
_betteamb = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 31;BA.debugLine="Dim i As Int = 0";
_i = (int) (0);
 //BA.debugLineNum = 32;BA.debugLine="Dim betbtntag As Int = 0";
_betbtntag = (int) (0);
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return "";
}
public String  _currentusers() throws Exception{
anywheresoftware.b4a.sql.SQL.CursorWrapper _cursor1 = null;
int _k = 0;
 //BA.debugLineNum = 80;BA.debugLine="Sub CurrentUsers";
 //BA.debugLineNum = 81;BA.debugLine="pnl_currentUsers.Color = Colors.White";
_pnl_currentusers.setColor(__c.Colors.White);
 //BA.debugLineNum = 82;BA.debugLine="pnl_currentUsers.AddView(lbl_showusers,0,0,100%x,";
_pnl_currentusers.AddView((android.view.View)(_lbl_showusers.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
 //BA.debugLineNum = 83;BA.debugLine="lbl_showusers.TextColor = Colors.Black";
_lbl_showusers.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 84;BA.debugLine="lbl_showusers.Text = \"USERNAME/PASSWORD/MONEY/RAN";
_lbl_showusers.setText(BA.ObjectToCharSequence("USERNAME/PASSWORD/MONEY/RANK/"+__c.CRLF));
 //BA.debugLineNum = 85;BA.debugLine="Dim cursor1 As Cursor";
_cursor1 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
 //BA.debugLineNum = 86;BA.debugLine="DB.database.Initialize(File.DirDefaultExternal,\"U";
_db._database.Initialize(__c.File.getDirDefaultExternal(),"UserAndBetsDatabase.db",__c.True);
 //BA.debugLineNum = 87;BA.debugLine="cursor1 = DB.database.ExecQuery(\"SELECT Username,";
_cursor1.setObject((android.database.Cursor)(_db._database.ExecQuery("SELECT Username, Password, Money, Rank FROM Users")));
 //BA.debugLineNum = 88;BA.debugLine="For k = 0 To cursor1.RowCount - 1";
{
final int step8 = 1;
final int limit8 = (int) (_cursor1.getRowCount()-1);
_k = (int) (0) ;
for (;(step8 > 0 && _k <= limit8) || (step8 < 0 && _k >= limit8) ;_k = ((int)(0 + _k + step8))  ) {
 //BA.debugLineNum = 89;BA.debugLine="cursor1.Position = k";
_cursor1.setPosition(_k);
 //BA.debugLineNum = 90;BA.debugLine="lbl_showusers.Text =lbl_showusers.Text & cursor1";
_lbl_showusers.setText(BA.ObjectToCharSequence(_lbl_showusers.getText()+_cursor1.GetString("Username")+"/"+_cursor1.GetString("Password")+"/"+_cursor1.GetString("Money")+"/"+_cursor1.GetString("Rank")+__c.CRLF));
 }
};
 //BA.debugLineNum = 92;BA.debugLine="cursor1.Close";
_cursor1.Close();
 //BA.debugLineNum = 93;BA.debugLine="DB.database.Close";
_db._database.Close();
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 37;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 38;BA.debugLine="TabhostActions.Initialize(\"tabhost1\")";
_tabhostactions.Initialize(ba,"tabhost1");
 //BA.debugLineNum = 39;BA.debugLine="pnl_bets.Initialize(-1)";
_pnl_bets.Initialize(ba,(int) (-1));
 //BA.debugLineNum = 40;BA.debugLine="pnl_add_bets.Initialize(\"moneys\")";
_pnl_add_bets.Initialize(ba,"moneys");
 //BA.debugLineNum = 41;BA.debugLine="pnl_currentUsers.Initialize(\"users\")";
_pnl_currentusers.Initialize(ba,"users");
 //BA.debugLineNum = 43;BA.debugLine="lbl_showusers.Initialize(\"showusers\")";
_lbl_showusers.Initialize(ba,"showusers");
 //BA.debugLineNum = 45;BA.debugLine="textfield.Initialize(\"sumfield\")";
_textfield.Initialize(ba,"sumfield");
 //BA.debugLineNum = 46;BA.debugLine="Deposit.Initialize(\"deposit\")";
_deposit.Initialize(ba,"deposit");
 //BA.debugLineNum = 47;BA.debugLine="Withdraw.Initialize(\"withdraw\")";
_withdraw.Initialize(ba,"withdraw");
 //BA.debugLineNum = 49;BA.debugLine="teamA.Initialize(\"team1\")";
_teama.Initialize(ba,"team1");
 //BA.debugLineNum = 50;BA.debugLine="teamB.Initialize(\"team2\")";
_teamb.Initialize(ba,"team2");
 //BA.debugLineNum = 51;BA.debugLine="teamAcoef.Initialize(\"team1c\")";
_teamacoef.Initialize(ba,"team1c");
 //BA.debugLineNum = 52;BA.debugLine="teamBcoef.Initialize(\"team2c\")";
_teambcoef.Initialize(ba,"team2c");
 //BA.debugLineNum = 53;BA.debugLine="matchinfo.Initialize(\"matchinfo\")";
_matchinfo.Initialize(ba,"matchinfo");
 //BA.debugLineNum = 54;BA.debugLine="submit.Initialize(\"submit\")";
_submit.Initialize(ba,"submit");
 //BA.debugLineNum = 55;BA.debugLine="If booBuild = False Then";
if (_boobuild==__c.False) { 
 //BA.debugLineNum = 56;BA.debugLine="Build_UI";
_build_ui();
 //BA.debugLineNum = 57;BA.debugLine="booBuild = True";
_boobuild = __c.True;
 };
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return "";
}
public String  _showcurrentbets() throws Exception{
 //BA.debugLineNum = 73;BA.debugLine="Sub ShowCurrentBets";
 //BA.debugLineNum = 74;BA.debugLine="ActiveBetsCreate";
_activebetscreate();
 //BA.debugLineNum = 75;BA.debugLine="If contenthold.IsInitialized Then";
if (_contenthold.IsInitialized()) { 
 //BA.debugLineNum = 76;BA.debugLine="ActiveBets_Content";
_activebets_content();
 };
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return "";
}
public String  _submit_click() throws Exception{
 //BA.debugLineNum = 153;BA.debugLine="Sub submit_Click";
 //BA.debugLineNum = 155;BA.debugLine="If teamA.Text = \"\" Or teamB.Text = \"\" Then";
if ((_teama.getText()).equals("") || (_teamb.getText()).equals("")) { 
 //BA.debugLineNum = 156;BA.debugLine="ToastMessageShow(\"Missing information\",False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("Missing information"),__c.False);
 }else {
 //BA.debugLineNum = 158;BA.debugLine="If teamAcoef.Text = \"\" Or teamBcoef.Text = \"\" Th";
if ((_teamacoef.getText()).equals("") || (_teambcoef.getText()).equals("")) { 
 //BA.debugLineNum = 159;BA.debugLine="ToastMessageShow(\"Missing information\",False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("Missing information"),__c.False);
 }else {
 //BA.debugLineNum = 161;BA.debugLine="DB.CreateBet(teamA.Text,teamAcoef.Text,teamB.Te";
_db._createbet(ba,_teama.getText(),_teamacoef.getText(),_teamb.getText(),_teambcoef.getText(),_matchinfo.getText());
 //BA.debugLineNum = 162;BA.debugLine="ActiveBetsCreate";
_activebetscreate();
 };
 };
 //BA.debugLineNum = 165;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
