package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class adminactions extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.adminactions");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.adminactions.class).invoke(this, new Object[] {null});
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
public b4a.example.main _main = null;
public b4a.example.helperfunctions _helperfunctions = null;
public b4a.example.types _types = null;
public b4a.example.starter _starter = null;
public String  _initialize(b4a.example.adminactions __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="adminactions";
if (Debug.shouldDelegate(ba, "initialize"))
	return (String) Debug.delegate(ba, "initialize", new Object[] {_ba});
RDebugUtils.currentLine=2555904;
 //BA.debugLineNum = 2555904;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=2555905;
 //BA.debugLineNum = 2555905;BA.debugLine="TabhostActions.Initialize(\"tabhost1\")";
__ref._tabhostactions.Initialize(ba,"tabhost1");
RDebugUtils.currentLine=2555906;
 //BA.debugLineNum = 2555906;BA.debugLine="pnl_bets.Initialize(-1)";
__ref._pnl_bets.Initialize(ba,(int) (-1));
RDebugUtils.currentLine=2555907;
 //BA.debugLineNum = 2555907;BA.debugLine="pnl_add_bets.Initialize(\"moneys\")";
__ref._pnl_add_bets.Initialize(ba,"moneys");
RDebugUtils.currentLine=2555908;
 //BA.debugLineNum = 2555908;BA.debugLine="pnl_currentUsers.Initialize(\"users\")";
__ref._pnl_currentusers.Initialize(ba,"users");
RDebugUtils.currentLine=2555910;
 //BA.debugLineNum = 2555910;BA.debugLine="lbl_showusers.Initialize(\"showusers\")";
__ref._lbl_showusers.Initialize(ba,"showusers");
RDebugUtils.currentLine=2555912;
 //BA.debugLineNum = 2555912;BA.debugLine="textfield.Initialize(\"sumfield\")";
__ref._textfield.Initialize(ba,"sumfield");
RDebugUtils.currentLine=2555913;
 //BA.debugLineNum = 2555913;BA.debugLine="Deposit.Initialize(\"deposit\")";
__ref._deposit.Initialize(ba,"deposit");
RDebugUtils.currentLine=2555914;
 //BA.debugLineNum = 2555914;BA.debugLine="Withdraw.Initialize(\"withdraw\")";
__ref._withdraw.Initialize(ba,"withdraw");
RDebugUtils.currentLine=2555916;
 //BA.debugLineNum = 2555916;BA.debugLine="teamA.Initialize(\"team1\")";
__ref._teama.Initialize(ba,"team1");
RDebugUtils.currentLine=2555917;
 //BA.debugLineNum = 2555917;BA.debugLine="teamB.Initialize(\"team2\")";
__ref._teamb.Initialize(ba,"team2");
RDebugUtils.currentLine=2555918;
 //BA.debugLineNum = 2555918;BA.debugLine="teamAcoef.Initialize(\"team1c\")";
__ref._teamacoef.Initialize(ba,"team1c");
RDebugUtils.currentLine=2555919;
 //BA.debugLineNum = 2555919;BA.debugLine="teamBcoef.Initialize(\"team2c\")";
__ref._teambcoef.Initialize(ba,"team2c");
RDebugUtils.currentLine=2555920;
 //BA.debugLineNum = 2555920;BA.debugLine="matchinfo.Initialize(\"matchinfo\")";
__ref._matchinfo.Initialize(ba,"matchinfo");
RDebugUtils.currentLine=2555921;
 //BA.debugLineNum = 2555921;BA.debugLine="submit.Initialize(\"submit\")";
__ref._submit.Initialize(ba,"submit");
RDebugUtils.currentLine=2555922;
 //BA.debugLineNum = 2555922;BA.debugLine="If booBuild = False Then";
if (__ref._boobuild==__c.False) { 
RDebugUtils.currentLine=2555923;
 //BA.debugLineNum = 2555923;BA.debugLine="Build_UI";
__ref._build_ui(null);
RDebugUtils.currentLine=2555924;
 //BA.debugLineNum = 2555924;BA.debugLine="booBuild = True";
__ref._boobuild = __c.True;
 };
RDebugUtils.currentLine=2555927;
 //BA.debugLineNum = 2555927;BA.debugLine="End Sub";
return "";
}
public String  _activebets_content(b4a.example.adminactions __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="adminactions";
if (Debug.shouldDelegate(ba, "activebets_content"))
	return (String) Debug.delegate(ba, "activebets_content", null);
RDebugUtils.currentLine=2883584;
 //BA.debugLineNum = 2883584;BA.debugLine="Sub ActiveBets_Content";
RDebugUtils.currentLine=2883585;
 //BA.debugLineNum = 2883585;BA.debugLine="pnl_bets.Color = Colors.White";
__ref._pnl_bets.setColor(__c.Colors.White);
RDebugUtils.currentLine=2883586;
 //BA.debugLineNum = 2883586;BA.debugLine="contenthold.Color = Colors.LightGray";
__ref._contenthold.setColor(__c.Colors.LightGray);
RDebugUtils.currentLine=2883588;
 //BA.debugLineNum = 2883588;BA.debugLine="betteamA.Color = Colors.RGB(0, 153, 0)";
__ref._betteama.setColor(__c.Colors.RGB((int) (0),(int) (153),(int) (0)));
RDebugUtils.currentLine=2883589;
 //BA.debugLineNum = 2883589;BA.debugLine="betteamA.Text = \"Bet\"";
__ref._betteama.setText(BA.ObjectToCharSequence("Bet"));
RDebugUtils.currentLine=2883590;
 //BA.debugLineNum = 2883590;BA.debugLine="betteamA.TextSize = 40";
__ref._betteama.setTextSize((float) (40));
RDebugUtils.currentLine=2883591;
 //BA.debugLineNum = 2883591;BA.debugLine="betteamA.Gravity = Gravity.CENTER";
__ref._betteama.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=2883593;
 //BA.debugLineNum = 2883593;BA.debugLine="betteamB.Color = Colors.RGB(0, 153, 0)";
__ref._betteamb.setColor(__c.Colors.RGB((int) (0),(int) (153),(int) (0)));
RDebugUtils.currentLine=2883594;
 //BA.debugLineNum = 2883594;BA.debugLine="betteamB.Text = \"Bet\"";
__ref._betteamb.setText(BA.ObjectToCharSequence("Bet"));
RDebugUtils.currentLine=2883595;
 //BA.debugLineNum = 2883595;BA.debugLine="betteamB.TextSize = 40";
__ref._betteamb.setTextSize((float) (40));
RDebugUtils.currentLine=2883596;
 //BA.debugLineNum = 2883596;BA.debugLine="betteamB.Gravity = Gravity.CENTER";
__ref._betteamb.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=2883598;
 //BA.debugLineNum = 2883598;BA.debugLine="teamAname.TextColor = Colors.Black";
__ref._teamaname.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=2883599;
 //BA.debugLineNum = 2883599;BA.debugLine="teamBname.TextColor = Colors.Black";
__ref._teambname.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=2883600;
 //BA.debugLineNum = 2883600;BA.debugLine="teamAname.TextSize = 30";
__ref._teamaname.setTextSize((float) (30));
RDebugUtils.currentLine=2883601;
 //BA.debugLineNum = 2883601;BA.debugLine="teamBname.TextSize = 30";
__ref._teambname.setTextSize((float) (30));
RDebugUtils.currentLine=2883602;
 //BA.debugLineNum = 2883602;BA.debugLine="teamAname.Gravity = Gravity.CENTER";
__ref._teamaname.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=2883603;
 //BA.debugLineNum = 2883603;BA.debugLine="teamBname.Gravity = Gravity.CENTER";
__ref._teambname.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=2883605;
 //BA.debugLineNum = 2883605;BA.debugLine="lblteamAcoef.TextColor = Colors.Black";
__ref._lblteamacoef.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=2883606;
 //BA.debugLineNum = 2883606;BA.debugLine="lblteamBcoef.TextColor = Colors.Black";
__ref._lblteambcoef.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=2883607;
 //BA.debugLineNum = 2883607;BA.debugLine="lblteamAcoef.TextSize = 30";
__ref._lblteamacoef.setTextSize((float) (30));
RDebugUtils.currentLine=2883608;
 //BA.debugLineNum = 2883608;BA.debugLine="lblteamBcoef.TextSize = 30";
__ref._lblteambcoef.setTextSize((float) (30));
RDebugUtils.currentLine=2883609;
 //BA.debugLineNum = 2883609;BA.debugLine="lblteamAcoef.Gravity = Gravity.CENTER";
__ref._lblteamacoef.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=2883610;
 //BA.debugLineNum = 2883610;BA.debugLine="lblteamBcoef.Gravity = Gravity.CENTER";
__ref._lblteambcoef.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=2883611;
 //BA.debugLineNum = 2883611;BA.debugLine="lblmatchinfo.TextColor = Colors.Black";
__ref._lblmatchinfo.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=2883612;
 //BA.debugLineNum = 2883612;BA.debugLine="lblmatchinfo.TextSize = 20";
__ref._lblmatchinfo.setTextSize((float) (20));
RDebugUtils.currentLine=2883613;
 //BA.debugLineNum = 2883613;BA.debugLine="betteamA.Tag = betbtntag";
__ref._betteama.setTag((Object)(__ref._betbtntag));
RDebugUtils.currentLine=2883614;
 //BA.debugLineNum = 2883614;BA.debugLine="betbtntag = betbtntag + 1";
__ref._betbtntag = (int) (__ref._betbtntag+1);
RDebugUtils.currentLine=2883617;
 //BA.debugLineNum = 2883617;BA.debugLine="betteamB.Tag = betbtntag";
__ref._betteamb.setTag((Object)(__ref._betbtntag));
RDebugUtils.currentLine=2883618;
 //BA.debugLineNum = 2883618;BA.debugLine="betbtntag = betbtntag + 1";
__ref._betbtntag = (int) (__ref._betbtntag+1);
RDebugUtils.currentLine=2883619;
 //BA.debugLineNum = 2883619;BA.debugLine="End Sub";
return "";
}
public String  _activebetscreate(b4a.example.adminactions __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="adminactions";
if (Debug.shouldDelegate(ba, "activebetscreate"))
	return (String) Debug.delegate(ba, "activebetscreate", null);
anywheresoftware.b4a.sql.SQL.CursorWrapper _cursor = null;
int _t = 0;
RDebugUtils.currentLine=3014656;
 //BA.debugLineNum = 3014656;BA.debugLine="Sub ActiveBetsCreate";
RDebugUtils.currentLine=3014658;
 //BA.debugLineNum = 3014658;BA.debugLine="Main.database1.Initialize(File.DirDefaultExternal";
_main._database1.Initialize(__c.File.getDirDefaultExternal(),"bets_database.db",__c.True);
RDebugUtils.currentLine=3014659;
 //BA.debugLineNum = 3014659;BA.debugLine="Dim cursor As Cursor";
_cursor = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=3014660;
 //BA.debugLineNum = 3014660;BA.debugLine="cursor = Main.database1.ExecQuery(\"SELECT ID,Team";
_cursor.setObject((android.database.Cursor)(_main._database1.ExecQuery("SELECT ID,TeamA,TeamAcoef, TeamB, TeamBcoef,MatchInfo FROM Bets")));
RDebugUtils.currentLine=3014662;
 //BA.debugLineNum = 3014662;BA.debugLine="For t = 0 To cursor.RowCount - 1";
{
final int step4 = 1;
final int limit4 = (int) (_cursor.getRowCount()-1);
_t = (int) (0) ;
for (;(step4 > 0 && _t <= limit4) || (step4 < 0 && _t >= limit4) ;_t = ((int)(0 + _t + step4))  ) {
RDebugUtils.currentLine=3014663;
 //BA.debugLineNum = 3014663;BA.debugLine="cursor.Position = t";
_cursor.setPosition(_t);
RDebugUtils.currentLine=3014664;
 //BA.debugLineNum = 3014664;BA.debugLine="contenthold.Initialize(\"contents\")";
__ref._contenthold.Initialize(ba,"contents");
RDebugUtils.currentLine=3014665;
 //BA.debugLineNum = 3014665;BA.debugLine="teamAname.Initialize(\"name1\")";
__ref._teamaname.Initialize(ba,"name1");
RDebugUtils.currentLine=3014666;
 //BA.debugLineNum = 3014666;BA.debugLine="teamBname.Initialize(\"name2\")";
__ref._teambname.Initialize(ba,"name2");
RDebugUtils.currentLine=3014667;
 //BA.debugLineNum = 3014667;BA.debugLine="lblteamAcoef.Initialize(\"coef1\")";
__ref._lblteamacoef.Initialize(ba,"coef1");
RDebugUtils.currentLine=3014668;
 //BA.debugLineNum = 3014668;BA.debugLine="lblteamBcoef.Initialize(\"coef2\")";
__ref._lblteambcoef.Initialize(ba,"coef2");
RDebugUtils.currentLine=3014669;
 //BA.debugLineNum = 3014669;BA.debugLine="lblmatchinfo.Initialize(\"info1\")";
__ref._lblmatchinfo.Initialize(ba,"info1");
RDebugUtils.currentLine=3014670;
 //BA.debugLineNum = 3014670;BA.debugLine="betteamA.Initialize(\"btn1\")";
__ref._betteama.Initialize(ba,"btn1");
RDebugUtils.currentLine=3014671;
 //BA.debugLineNum = 3014671;BA.debugLine="betteamB.Initialize(\"btn2\")";
__ref._betteamb.Initialize(ba,"btn2");
RDebugUtils.currentLine=3014674;
 //BA.debugLineNum = 3014674;BA.debugLine="teamAname.Text = cursor.GetString(\"TeamA\")";
__ref._teamaname.setText(BA.ObjectToCharSequence(_cursor.GetString("TeamA")));
RDebugUtils.currentLine=3014675;
 //BA.debugLineNum = 3014675;BA.debugLine="teamBname.Text = cursor.GetString(\"TeamB\")";
__ref._teambname.setText(BA.ObjectToCharSequence(_cursor.GetString("TeamB")));
RDebugUtils.currentLine=3014676;
 //BA.debugLineNum = 3014676;BA.debugLine="lblteamAcoef.Text = cursor.GetString(\"TeamAcoef\"";
__ref._lblteamacoef.setText(BA.ObjectToCharSequence(_cursor.GetString("TeamAcoef")));
RDebugUtils.currentLine=3014677;
 //BA.debugLineNum = 3014677;BA.debugLine="lblteamBcoef.Text = cursor.GetString(\"TeamBcoef\"";
__ref._lblteambcoef.setText(BA.ObjectToCharSequence(_cursor.GetString("TeamBcoef")));
RDebugUtils.currentLine=3014678;
 //BA.debugLineNum = 3014678;BA.debugLine="lblmatchinfo.Text = cursor.GetString(\"MatchInfo\"";
__ref._lblmatchinfo.setText(BA.ObjectToCharSequence(_cursor.GetString("MatchInfo")));
RDebugUtils.currentLine=3014679;
 //BA.debugLineNum = 3014679;BA.debugLine="pnl_bets.Panel.AddView(contenthold,0,0+(20%y + 1";
__ref._pnl_bets.getPanel().AddView((android.view.View)(__ref._contenthold.getObject()),(int) (0),(int) (0+(__c.PerYToCurrent((float) (20),ba)+__c.DipToCurrent((int) (1)))*__ref._i),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (20),ba));
RDebugUtils.currentLine=3014680;
 //BA.debugLineNum = 3014680;BA.debugLine="i = i + 1";
__ref._i = (int) (__ref._i+1);
RDebugUtils.currentLine=3014681;
 //BA.debugLineNum = 3014681;BA.debugLine="contenthold.AddView(teamAname,0,0,20%x,10%y)";
__ref._contenthold.AddView((android.view.View)(__ref._teamaname.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=3014682;
 //BA.debugLineNum = 3014682;BA.debugLine="contenthold.AddView(lblteamAcoef,0,10%y,20%x,10%";
__ref._contenthold.AddView((android.view.View)(__ref._lblteamacoef.getObject()),(int) (0),__c.PerYToCurrent((float) (10),ba),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=3014683;
 //BA.debugLineNum = 3014683;BA.debugLine="contenthold.AddView(teamBname,60%x,0,20%x,10%y)";
__ref._contenthold.AddView((android.view.View)(__ref._teambname.getObject()),__c.PerXToCurrent((float) (60),ba),(int) (0),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=3014684;
 //BA.debugLineNum = 3014684;BA.debugLine="contenthold.AddView(lblteamBcoef,60%x,10%y,20%x,";
__ref._contenthold.AddView((android.view.View)(__ref._lblteambcoef.getObject()),__c.PerXToCurrent((float) (60),ba),__c.PerYToCurrent((float) (10),ba),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=3014685;
 //BA.debugLineNum = 3014685;BA.debugLine="contenthold.AddView(betteamA,20%x,0,10%x,20%y)";
__ref._contenthold.AddView((android.view.View)(__ref._betteama.getObject()),__c.PerXToCurrent((float) (20),ba),(int) (0),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (20),ba));
RDebugUtils.currentLine=3014686;
 //BA.debugLineNum = 3014686;BA.debugLine="contenthold.AddView(betteamB,50%x,0,10%x,20%y)";
__ref._contenthold.AddView((android.view.View)(__ref._betteamb.getObject()),__c.PerXToCurrent((float) (50),ba),(int) (0),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (20),ba));
RDebugUtils.currentLine=3014687;
 //BA.debugLineNum = 3014687;BA.debugLine="contenthold.AddView(lblmatchinfo,30%x,0,50%x,20%";
__ref._contenthold.AddView((android.view.View)(__ref._lblmatchinfo.getObject()),__c.PerXToCurrent((float) (30),ba),(int) (0),__c.PerXToCurrent((float) (50),ba),__c.PerYToCurrent((float) (20),ba));
RDebugUtils.currentLine=3014689;
 //BA.debugLineNum = 3014689;BA.debugLine="ActiveBets_Content";
__ref._activebets_content(null);
 }
};
RDebugUtils.currentLine=3014691;
 //BA.debugLineNum = 3014691;BA.debugLine="cursor.Close";
_cursor.Close();
RDebugUtils.currentLine=3014692;
 //BA.debugLineNum = 3014692;BA.debugLine="Main.database1.Close";
_main._database1.Close();
RDebugUtils.currentLine=3014693;
 //BA.debugLineNum = 3014693;BA.debugLine="End Sub";
return "";
}
public String  _addbets_contents(b4a.example.adminactions __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="adminactions";
if (Debug.shouldDelegate(ba, "addbets_contents"))
	return (String) Debug.delegate(ba, "addbets_contents", null);
RDebugUtils.currentLine=2818048;
 //BA.debugLineNum = 2818048;BA.debugLine="Sub AddBets_Contents";
RDebugUtils.currentLine=2818049;
 //BA.debugLineNum = 2818049;BA.debugLine="pnl_add_bets.Color = Colors.White";
__ref._pnl_add_bets.setColor(__c.Colors.White);
RDebugUtils.currentLine=2818050;
 //BA.debugLineNum = 2818050;BA.debugLine="pnl_add_bets.AddView(teamA,10%x,10%y,15%x,10%y)";
__ref._pnl_add_bets.AddView((android.view.View)(__ref._teama.getObject()),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (10),ba),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=2818051;
 //BA.debugLineNum = 2818051;BA.debugLine="pnl_add_bets.AddView(teamB,55%x,10%y,15%x,10%y)";
__ref._pnl_add_bets.AddView((android.view.View)(__ref._teamb.getObject()),__c.PerXToCurrent((float) (55),ba),__c.PerYToCurrent((float) (10),ba),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=2818052;
 //BA.debugLineNum = 2818052;BA.debugLine="teamA.Hint = \"TeamA\"";
__ref._teama.setHint("TeamA");
RDebugUtils.currentLine=2818053;
 //BA.debugLineNum = 2818053;BA.debugLine="teamB.Hint = \"TeamB\"";
__ref._teamb.setHint("TeamB");
RDebugUtils.currentLine=2818054;
 //BA.debugLineNum = 2818054;BA.debugLine="pnl_add_bets.AddView(teamAcoef,10%x,22%y,15%x,10%";
__ref._pnl_add_bets.AddView((android.view.View)(__ref._teamacoef.getObject()),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (22),ba),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=2818055;
 //BA.debugLineNum = 2818055;BA.debugLine="pnl_add_bets.AddView(teamBcoef,55%x,22%y,15%x,10%";
__ref._pnl_add_bets.AddView((android.view.View)(__ref._teambcoef.getObject()),__c.PerXToCurrent((float) (55),ba),__c.PerYToCurrent((float) (22),ba),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=2818056;
 //BA.debugLineNum = 2818056;BA.debugLine="teamAcoef.Hint = \"Coeficient\"";
__ref._teamacoef.setHint("Coeficient");
RDebugUtils.currentLine=2818057;
 //BA.debugLineNum = 2818057;BA.debugLine="teamBcoef.Hint = \"Coeficient\"";
__ref._teambcoef.setHint("Coeficient");
RDebugUtils.currentLine=2818058;
 //BA.debugLineNum = 2818058;BA.debugLine="teamAcoef.InputType = teamAcoef.INPUT_TYPE_DECIMA";
__ref._teamacoef.setInputType(__ref._teamacoef.INPUT_TYPE_DECIMAL_NUMBERS);
RDebugUtils.currentLine=2818059;
 //BA.debugLineNum = 2818059;BA.debugLine="teamBcoef.InputType = teamBcoef.INPUT_TYPE_DECIMA";
__ref._teambcoef.setInputType(__ref._teambcoef.INPUT_TYPE_DECIMAL_NUMBERS);
RDebugUtils.currentLine=2818060;
 //BA.debugLineNum = 2818060;BA.debugLine="pnl_add_bets.AddView(matchinfo,10%x,40%y,60%x,25%";
__ref._pnl_add_bets.AddView((android.view.View)(__ref._matchinfo.getObject()),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (40),ba),__c.PerXToCurrent((float) (60),ba),__c.PerYToCurrent((float) (25),ba));
RDebugUtils.currentLine=2818061;
 //BA.debugLineNum = 2818061;BA.debugLine="matchinfo.Wrap = True";
__ref._matchinfo.setWrap(__c.True);
RDebugUtils.currentLine=2818062;
 //BA.debugLineNum = 2818062;BA.debugLine="pnl_add_bets.AddView(submit,30%x,70%y,10%x,10%y)";
__ref._pnl_add_bets.AddView((android.view.View)(__ref._submit.getObject()),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (70),ba),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=2818063;
 //BA.debugLineNum = 2818063;BA.debugLine="submit.Text = \"Submit\"";
__ref._submit.setText(BA.ObjectToCharSequence("Submit"));
RDebugUtils.currentLine=2818064;
 //BA.debugLineNum = 2818064;BA.debugLine="submit.Color = Colors.RGB(0, 153, 51)";
__ref._submit.setColor(__c.Colors.RGB((int) (0),(int) (153),(int) (51)));
RDebugUtils.currentLine=2818066;
 //BA.debugLineNum = 2818066;BA.debugLine="End Sub";
return "";
}
public String  _build_ui(b4a.example.adminactions __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="adminactions";
if (Debug.shouldDelegate(ba, "build_ui"))
	return (String) Debug.delegate(ba, "build_ui", null);
RDebugUtils.currentLine=2621440;
 //BA.debugLineNum = 2621440;BA.debugLine="Sub Build_UI";
RDebugUtils.currentLine=2621441;
 //BA.debugLineNum = 2621441;BA.debugLine="TabhostActions.AddTab2(\"Active bets\",pnl_bets)";
__ref._tabhostactions.AddTab2("Active bets",(android.view.View)(__ref._pnl_bets.getObject()));
RDebugUtils.currentLine=2621442;
 //BA.debugLineNum = 2621442;BA.debugLine="TabhostActions.AddTab2(\"Add Bets\",pnl_add_bets)";
__ref._tabhostactions.AddTab2("Add Bets",(android.view.View)(__ref._pnl_add_bets.getObject()));
RDebugUtils.currentLine=2621443;
 //BA.debugLineNum = 2621443;BA.debugLine="TabhostActions.AddTab2(\"Users\",pnl_currentUsers)";
__ref._tabhostactions.AddTab2("Users",(android.view.View)(__ref._pnl_currentusers.getObject()));
RDebugUtils.currentLine=2621444;
 //BA.debugLineNum = 2621444;BA.debugLine="AddBets_Contents";
__ref._addbets_contents(null);
RDebugUtils.currentLine=2621445;
 //BA.debugLineNum = 2621445;BA.debugLine="CurrentUsers";
__ref._currentusers(null);
RDebugUtils.currentLine=2621447;
 //BA.debugLineNum = 2621447;BA.debugLine="ShowCurrentBets";
__ref._showcurrentbets(null);
RDebugUtils.currentLine=2621449;
 //BA.debugLineNum = 2621449;BA.debugLine="End Sub";
return "";
}
public String  _currentusers(b4a.example.adminactions __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="adminactions";
if (Debug.shouldDelegate(ba, "currentusers"))
	return (String) Debug.delegate(ba, "currentusers", null);
anywheresoftware.b4a.sql.SQL.CursorWrapper _cursor1 = null;
int _k = 0;
RDebugUtils.currentLine=2752512;
 //BA.debugLineNum = 2752512;BA.debugLine="Sub CurrentUsers";
RDebugUtils.currentLine=2752513;
 //BA.debugLineNum = 2752513;BA.debugLine="pnl_currentUsers.Color = Colors.White";
__ref._pnl_currentusers.setColor(__c.Colors.White);
RDebugUtils.currentLine=2752514;
 //BA.debugLineNum = 2752514;BA.debugLine="pnl_currentUsers.AddView(lbl_showusers,0,0,100%x,";
__ref._pnl_currentusers.AddView((android.view.View)(__ref._lbl_showusers.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
RDebugUtils.currentLine=2752515;
 //BA.debugLineNum = 2752515;BA.debugLine="lbl_showusers.TextColor = Colors.Black";
__ref._lbl_showusers.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=2752516;
 //BA.debugLineNum = 2752516;BA.debugLine="lbl_showusers.Text = \"USERNAME/PASSWORD/MONEY/RAN";
__ref._lbl_showusers.setText(BA.ObjectToCharSequence("USERNAME/PASSWORD/MONEY/RANK/"+__c.CRLF));
RDebugUtils.currentLine=2752517;
 //BA.debugLineNum = 2752517;BA.debugLine="Dim cursor1 As Cursor";
_cursor1 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=2752518;
 //BA.debugLineNum = 2752518;BA.debugLine="Main.database.Initialize(File.DirDefaultExternal,";
_main._database.Initialize(__c.File.getDirDefaultExternal(),"userdatabase.db",__c.True);
RDebugUtils.currentLine=2752519;
 //BA.debugLineNum = 2752519;BA.debugLine="cursor1 = Main.database.ExecQuery(\"SELECT Usernam";
_cursor1.setObject((android.database.Cursor)(_main._database.ExecQuery("SELECT Username, Password, Money, Rank FROM Users")));
RDebugUtils.currentLine=2752520;
 //BA.debugLineNum = 2752520;BA.debugLine="For k = 0 To cursor1.RowCount - 1";
{
final int step8 = 1;
final int limit8 = (int) (_cursor1.getRowCount()-1);
_k = (int) (0) ;
for (;(step8 > 0 && _k <= limit8) || (step8 < 0 && _k >= limit8) ;_k = ((int)(0 + _k + step8))  ) {
RDebugUtils.currentLine=2752521;
 //BA.debugLineNum = 2752521;BA.debugLine="cursor1.Position = k";
_cursor1.setPosition(_k);
RDebugUtils.currentLine=2752523;
 //BA.debugLineNum = 2752523;BA.debugLine="lbl_showusers.Text =lbl_showusers.Text & cursor1";
__ref._lbl_showusers.setText(BA.ObjectToCharSequence(__ref._lbl_showusers.getText()+_cursor1.GetString("Username")+"/"+_cursor1.GetString("Password")+"/"+_cursor1.GetString("Money")+"/"+_cursor1.GetString("Rank")+__c.CRLF));
 }
};
RDebugUtils.currentLine=2752525;
 //BA.debugLineNum = 2752525;BA.debugLine="cursor1.Close";
_cursor1.Close();
RDebugUtils.currentLine=2752526;
 //BA.debugLineNum = 2752526;BA.debugLine="Main.database.Close";
_main._database.Close();
RDebugUtils.currentLine=2752527;
 //BA.debugLineNum = 2752527;BA.debugLine="End Sub";
return "";
}
public String  _showcurrentbets(b4a.example.adminactions __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="adminactions";
if (Debug.shouldDelegate(ba, "showcurrentbets"))
	return (String) Debug.delegate(ba, "showcurrentbets", null);
RDebugUtils.currentLine=2686976;
 //BA.debugLineNum = 2686976;BA.debugLine="Sub ShowCurrentBets";
RDebugUtils.currentLine=2686977;
 //BA.debugLineNum = 2686977;BA.debugLine="ActiveBetsCreate";
__ref._activebetscreate(null);
RDebugUtils.currentLine=2686978;
 //BA.debugLineNum = 2686978;BA.debugLine="If contenthold.IsInitialized Then";
if (__ref._contenthold.IsInitialized()) { 
RDebugUtils.currentLine=2686979;
 //BA.debugLineNum = 2686979;BA.debugLine="ActiveBets_Content";
__ref._activebets_content(null);
 };
RDebugUtils.currentLine=2686981;
 //BA.debugLineNum = 2686981;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.adminactions __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="adminactions";
RDebugUtils.currentLine=2490368;
 //BA.debugLineNum = 2490368;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=2490369;
 //BA.debugLineNum = 2490369;BA.debugLine="Public TabhostActions As TabHost";
_tabhostactions = new anywheresoftware.b4a.objects.TabHostWrapper();
RDebugUtils.currentLine=2490370;
 //BA.debugLineNum = 2490370;BA.debugLine="Dim pnl_bets As ScrollView";
_pnl_bets = new anywheresoftware.b4a.objects.ScrollViewWrapper();
RDebugUtils.currentLine=2490371;
 //BA.debugLineNum = 2490371;BA.debugLine="Dim pnl_add_bets As Panel";
_pnl_add_bets = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=2490372;
 //BA.debugLineNum = 2490372;BA.debugLine="Dim pnl_currentUsers As Panel";
_pnl_currentusers = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=2490374;
 //BA.debugLineNum = 2490374;BA.debugLine="Dim textfield As EditText";
_textfield = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=2490375;
 //BA.debugLineNum = 2490375;BA.debugLine="Dim Deposit  As Button";
_deposit = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=2490376;
 //BA.debugLineNum = 2490376;BA.debugLine="Dim Withdraw As Button";
_withdraw = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=2490378;
 //BA.debugLineNum = 2490378;BA.debugLine="Dim booBuild As Boolean";
_boobuild = false;
RDebugUtils.currentLine=2490380;
 //BA.debugLineNum = 2490380;BA.debugLine="Dim lbl_showusers As Label";
_lbl_showusers = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=2490382;
 //BA.debugLineNum = 2490382;BA.debugLine="Dim teamA As EditText";
_teama = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=2490383;
 //BA.debugLineNum = 2490383;BA.debugLine="Dim teamB As EditText";
_teamb = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=2490384;
 //BA.debugLineNum = 2490384;BA.debugLine="Dim teamAcoef As EditText";
_teamacoef = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=2490385;
 //BA.debugLineNum = 2490385;BA.debugLine="Dim teamBcoef As EditText";
_teambcoef = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=2490386;
 //BA.debugLineNum = 2490386;BA.debugLine="Dim matchinfo As EditText";
_matchinfo = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=2490387;
 //BA.debugLineNum = 2490387;BA.debugLine="Dim submit As Button";
_submit = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=2490390;
 //BA.debugLineNum = 2490390;BA.debugLine="Dim contenthold As Panel";
_contenthold = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=2490391;
 //BA.debugLineNum = 2490391;BA.debugLine="Dim teamAname As Label";
_teamaname = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=2490392;
 //BA.debugLineNum = 2490392;BA.debugLine="Dim teamBname As Label";
_teambname = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=2490393;
 //BA.debugLineNum = 2490393;BA.debugLine="Dim lblteamAcoef As Label";
_lblteamacoef = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=2490394;
 //BA.debugLineNum = 2490394;BA.debugLine="Dim lblteamBcoef As Label";
_lblteambcoef = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=2490395;
 //BA.debugLineNum = 2490395;BA.debugLine="Dim lblmatchinfo As Label";
_lblmatchinfo = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=2490396;
 //BA.debugLineNum = 2490396;BA.debugLine="Dim betteamA As Button";
_betteama = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=2490397;
 //BA.debugLineNum = 2490397;BA.debugLine="Dim betteamB As Button";
_betteamb = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=2490398;
 //BA.debugLineNum = 2490398;BA.debugLine="Dim i As Int = 0";
_i = (int) (0);
RDebugUtils.currentLine=2490399;
 //BA.debugLineNum = 2490399;BA.debugLine="Dim betbtntag As Int = 0";
_betbtntag = (int) (0);
RDebugUtils.currentLine=2490401;
 //BA.debugLineNum = 2490401;BA.debugLine="End Sub";
return "";
}
public String  _submit_click(b4a.example.adminactions __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="adminactions";
if (Debug.shouldDelegate(ba, "submit_click"))
	return (String) Debug.delegate(ba, "submit_click", null);
RDebugUtils.currentLine=2949120;
 //BA.debugLineNum = 2949120;BA.debugLine="Sub submit_Click";
RDebugUtils.currentLine=2949122;
 //BA.debugLineNum = 2949122;BA.debugLine="If teamA.Text = \"\" Or teamB.Text = \"\" Then";
if ((__ref._teama.getText()).equals("") || (__ref._teamb.getText()).equals("")) { 
RDebugUtils.currentLine=2949123;
 //BA.debugLineNum = 2949123;BA.debugLine="ToastMessageShow(\"Missing information\",False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("Missing information"),__c.False);
 }else {
RDebugUtils.currentLine=2949125;
 //BA.debugLineNum = 2949125;BA.debugLine="If teamAcoef.Text = \"\" Or teamBcoef.Text = \"\" Th";
if ((__ref._teamacoef.getText()).equals("") || (__ref._teambcoef.getText()).equals("")) { 
RDebugUtils.currentLine=2949126;
 //BA.debugLineNum = 2949126;BA.debugLine="ToastMessageShow(\"Missing information\",False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("Missing information"),__c.False);
 }else {
RDebugUtils.currentLine=2949128;
 //BA.debugLineNum = 2949128;BA.debugLine="Main.database1.Initialize(File.DirDefaultExtern";
_main._database1.Initialize(__c.File.getDirDefaultExternal(),"bets_database.db",__c.True);
RDebugUtils.currentLine=2949129;
 //BA.debugLineNum = 2949129;BA.debugLine="Main.database1.ExecNonQuery(\"INSERT INTO Bets (";
_main._database1.ExecNonQuery("INSERT INTO Bets (TeamA,TeamAcoef,TeamB,TeamBcoef,MatchInfo) VALUES ('"+__ref._teama.getText()+"','"+__ref._teamacoef.getText()+"','"+__ref._teamb.getText()+"','"+__ref._teambcoef.getText()+"','"+__ref._matchinfo.getText()+"')");
RDebugUtils.currentLine=2949130;
 //BA.debugLineNum = 2949130;BA.debugLine="ActiveBetsCreate";
__ref._activebetscreate(null);
RDebugUtils.currentLine=2949131;
 //BA.debugLineNum = 2949131;BA.debugLine="Main.database1.Close";
_main._database1.Close();
 };
 };
RDebugUtils.currentLine=2949134;
 //BA.debugLineNum = 2949134;BA.debugLine="End Sub";
return "";
}
}