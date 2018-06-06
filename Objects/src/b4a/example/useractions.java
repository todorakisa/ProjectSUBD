package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class useractions extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.useractions");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.useractions.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.PanelWrapper _pnl_finances = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnl_history = null;
public anywheresoftware.b4a.objects.EditTextWrapper _textfield = null;
public anywheresoftware.b4a.objects.ButtonWrapper _deposit = null;
public anywheresoftware.b4a.objects.ButtonWrapper _withdraw = null;
public boolean _boobuild = false;
public anywheresoftware.b4a.objects.PanelWrapper _contenthold = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblteamacoef = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblteambcoef = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblmatchinfo = null;
public anywheresoftware.b4a.objects.LabelWrapper _teambname = null;
public anywheresoftware.b4a.objects.LabelWrapper _teamaname = null;
public anywheresoftware.b4a.objects.ButtonWrapper _betteama = null;
public anywheresoftware.b4a.objects.ButtonWrapper _betteamb = null;
public int _betbtntaga = 0;
public int _betbtntagb = 0;
public int _i = 0;
public anywheresoftware.b4a.objects.collections.List _btnlista = null;
public anywheresoftware.b4a.objects.collections.List _btnlistb = null;
public b4a.example.main _main = null;
public b4a.example.helperfunctions _helperfunctions = null;
public b4a.example.types _types = null;
public b4a.example.starter _starter = null;
public String  _initialize(b4a.example.useractions __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="useractions";
if (Debug.shouldDelegate(ba, "initialize"))
	return (String) Debug.delegate(ba, "initialize", new Object[] {_ba});
RDebugUtils.currentLine=1835008;
 //BA.debugLineNum = 1835008;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=1835009;
 //BA.debugLineNum = 1835009;BA.debugLine="TabhostActions.Initialize(\"tabhost1\")";
__ref._tabhostactions.Initialize(ba,"tabhost1");
RDebugUtils.currentLine=1835010;
 //BA.debugLineNum = 1835010;BA.debugLine="pnl_bets.Initialize(-1)";
__ref._pnl_bets.Initialize(ba,(int) (-1));
RDebugUtils.currentLine=1835011;
 //BA.debugLineNum = 1835011;BA.debugLine="pnl_finances.Initialize(\"moneys\")";
__ref._pnl_finances.Initialize(ba,"moneys");
RDebugUtils.currentLine=1835012;
 //BA.debugLineNum = 1835012;BA.debugLine="pnl_history.Initialize(\"history\")";
__ref._pnl_history.Initialize(ba,"history");
RDebugUtils.currentLine=1835014;
 //BA.debugLineNum = 1835014;BA.debugLine="textfield.Initialize(\"sumfield\")";
__ref._textfield.Initialize(ba,"sumfield");
RDebugUtils.currentLine=1835015;
 //BA.debugLineNum = 1835015;BA.debugLine="Deposit.Initialize(\"deposit\")";
__ref._deposit.Initialize(ba,"deposit");
RDebugUtils.currentLine=1835016;
 //BA.debugLineNum = 1835016;BA.debugLine="Withdraw.Initialize(\"withdraw\")";
__ref._withdraw.Initialize(ba,"withdraw");
RDebugUtils.currentLine=1835018;
 //BA.debugLineNum = 1835018;BA.debugLine="btnlistA.Initialize";
__ref._btnlista.Initialize();
RDebugUtils.currentLine=1835019;
 //BA.debugLineNum = 1835019;BA.debugLine="btnlistB.Initialize";
__ref._btnlistb.Initialize();
RDebugUtils.currentLine=1835021;
 //BA.debugLineNum = 1835021;BA.debugLine="If booBuild = False Then";
if (__ref._boobuild==__c.False) { 
RDebugUtils.currentLine=1835022;
 //BA.debugLineNum = 1835022;BA.debugLine="Build_UI";
__ref._build_ui(null);
RDebugUtils.currentLine=1835023;
 //BA.debugLineNum = 1835023;BA.debugLine="booBuild = True";
__ref._boobuild = __c.True;
 };
RDebugUtils.currentLine=1835026;
 //BA.debugLineNum = 1835026;BA.debugLine="End Sub";
return "";
}
public String  _activebets_content(b4a.example.useractions __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="useractions";
if (Debug.shouldDelegate(ba, "activebets_content"))
	return (String) Debug.delegate(ba, "activebets_content", null);
RDebugUtils.currentLine=2031616;
 //BA.debugLineNum = 2031616;BA.debugLine="Sub ActiveBets_Content";
RDebugUtils.currentLine=2031617;
 //BA.debugLineNum = 2031617;BA.debugLine="pnl_bets.Color = Colors.White";
__ref._pnl_bets.setColor(__c.Colors.White);
RDebugUtils.currentLine=2031618;
 //BA.debugLineNum = 2031618;BA.debugLine="contenthold.Color = Colors.LightGray";
__ref._contenthold.setColor(__c.Colors.LightGray);
RDebugUtils.currentLine=2031620;
 //BA.debugLineNum = 2031620;BA.debugLine="betteamA.Color = Colors.RGB(0, 153, 0)";
__ref._betteama.setColor(__c.Colors.RGB((int) (0),(int) (153),(int) (0)));
RDebugUtils.currentLine=2031621;
 //BA.debugLineNum = 2031621;BA.debugLine="betteamA.Text = \"Bet\"";
__ref._betteama.setText(BA.ObjectToCharSequence("Bet"));
RDebugUtils.currentLine=2031622;
 //BA.debugLineNum = 2031622;BA.debugLine="betteamA.TextSize = 40";
__ref._betteama.setTextSize((float) (40));
RDebugUtils.currentLine=2031623;
 //BA.debugLineNum = 2031623;BA.debugLine="betteamA.Gravity = Gravity.CENTER";
__ref._betteama.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=2031625;
 //BA.debugLineNum = 2031625;BA.debugLine="betteamB.Color = Colors.RGB(0, 153, 0)";
__ref._betteamb.setColor(__c.Colors.RGB((int) (0),(int) (153),(int) (0)));
RDebugUtils.currentLine=2031626;
 //BA.debugLineNum = 2031626;BA.debugLine="betteamB.Text = \"Bet\"";
__ref._betteamb.setText(BA.ObjectToCharSequence("Bet"));
RDebugUtils.currentLine=2031627;
 //BA.debugLineNum = 2031627;BA.debugLine="betteamB.TextSize = 40";
__ref._betteamb.setTextSize((float) (40));
RDebugUtils.currentLine=2031628;
 //BA.debugLineNum = 2031628;BA.debugLine="betteamB.Gravity = Gravity.CENTER";
__ref._betteamb.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=2031630;
 //BA.debugLineNum = 2031630;BA.debugLine="teamAname.TextColor = Colors.Black";
__ref._teamaname.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=2031631;
 //BA.debugLineNum = 2031631;BA.debugLine="teamBname.TextColor = Colors.Black";
__ref._teambname.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=2031632;
 //BA.debugLineNum = 2031632;BA.debugLine="teamAname.TextSize = 30";
__ref._teamaname.setTextSize((float) (30));
RDebugUtils.currentLine=2031633;
 //BA.debugLineNum = 2031633;BA.debugLine="teamBname.TextSize = 30";
__ref._teambname.setTextSize((float) (30));
RDebugUtils.currentLine=2031634;
 //BA.debugLineNum = 2031634;BA.debugLine="teamAname.Gravity = Gravity.CENTER";
__ref._teamaname.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=2031635;
 //BA.debugLineNum = 2031635;BA.debugLine="teamBname.Gravity = Gravity.CENTER";
__ref._teambname.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=2031637;
 //BA.debugLineNum = 2031637;BA.debugLine="lblteamAcoef.TextColor = Colors.Black";
__ref._lblteamacoef.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=2031638;
 //BA.debugLineNum = 2031638;BA.debugLine="lblteamBcoef.TextColor = Colors.Black";
__ref._lblteambcoef.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=2031639;
 //BA.debugLineNum = 2031639;BA.debugLine="lblteamAcoef.TextSize = 30";
__ref._lblteamacoef.setTextSize((float) (30));
RDebugUtils.currentLine=2031640;
 //BA.debugLineNum = 2031640;BA.debugLine="lblteamBcoef.TextSize = 30";
__ref._lblteambcoef.setTextSize((float) (30));
RDebugUtils.currentLine=2031641;
 //BA.debugLineNum = 2031641;BA.debugLine="lblteamAcoef.Gravity = Gravity.CENTER";
__ref._lblteamacoef.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=2031642;
 //BA.debugLineNum = 2031642;BA.debugLine="lblteamBcoef.Gravity = Gravity.CENTER";
__ref._lblteambcoef.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=2031643;
 //BA.debugLineNum = 2031643;BA.debugLine="lblmatchinfo.TextColor = Colors.Black";
__ref._lblmatchinfo.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=2031644;
 //BA.debugLineNum = 2031644;BA.debugLine="lblmatchinfo.TextSize = 20";
__ref._lblmatchinfo.setTextSize((float) (20));
RDebugUtils.currentLine=2031646;
 //BA.debugLineNum = 2031646;BA.debugLine="betteamA.Tag = betbtntagA";
__ref._betteama.setTag((Object)(__ref._betbtntaga));
RDebugUtils.currentLine=2031647;
 //BA.debugLineNum = 2031647;BA.debugLine="teamAname.Tag = betteamA.Tag";
__ref._teamaname.setTag(__ref._betteama.getTag());
RDebugUtils.currentLine=2031648;
 //BA.debugLineNum = 2031648;BA.debugLine="betbtntagA = betbtntagA + 1";
__ref._betbtntaga = (int) (__ref._betbtntaga+1);
RDebugUtils.currentLine=2031649;
 //BA.debugLineNum = 2031649;BA.debugLine="btnlistA.Add(teamAname)";
__ref._btnlista.Add((Object)(__ref._teamaname.getObject()));
RDebugUtils.currentLine=2031651;
 //BA.debugLineNum = 2031651;BA.debugLine="betteamB.Tag = betbtntagB";
__ref._betteamb.setTag((Object)(__ref._betbtntagb));
RDebugUtils.currentLine=2031652;
 //BA.debugLineNum = 2031652;BA.debugLine="teamBname.Tag = betteamB.Tag";
__ref._teambname.setTag(__ref._betteamb.getTag());
RDebugUtils.currentLine=2031653;
 //BA.debugLineNum = 2031653;BA.debugLine="betbtntagB = betbtntagB + 1";
__ref._betbtntagb = (int) (__ref._betbtntagb+1);
RDebugUtils.currentLine=2031654;
 //BA.debugLineNum = 2031654;BA.debugLine="btnlistB.Add(teamBname)";
__ref._btnlistb.Add((Object)(__ref._teambname.getObject()));
RDebugUtils.currentLine=2031655;
 //BA.debugLineNum = 2031655;BA.debugLine="End Sub";
return "";
}
public String  _activebetscreate(b4a.example.useractions __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="useractions";
if (Debug.shouldDelegate(ba, "activebetscreate"))
	return (String) Debug.delegate(ba, "activebetscreate", null);
anywheresoftware.b4a.sql.SQL.CursorWrapper _cursor = null;
int _t = 0;
RDebugUtils.currentLine=2097152;
 //BA.debugLineNum = 2097152;BA.debugLine="Sub ActiveBetsCreate";
RDebugUtils.currentLine=2097153;
 //BA.debugLineNum = 2097153;BA.debugLine="Main.database1.Initialize(File.DirDefaultExternal";
_main._database1.Initialize(__c.File.getDirDefaultExternal(),"bets_database.db",__c.True);
RDebugUtils.currentLine=2097154;
 //BA.debugLineNum = 2097154;BA.debugLine="Dim cursor As Cursor";
_cursor = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=2097156;
 //BA.debugLineNum = 2097156;BA.debugLine="cursor = Main.database1.ExecQuery(\"SELECT ID,Team";
_cursor.setObject((android.database.Cursor)(_main._database1.ExecQuery("SELECT ID,TeamA,TeamAcoef, TeamB, TeamBcoef,MatchInfo FROM Bets")));
RDebugUtils.currentLine=2097158;
 //BA.debugLineNum = 2097158;BA.debugLine="For t = 0 To cursor.RowCount - 1";
{
final int step4 = 1;
final int limit4 = (int) (_cursor.getRowCount()-1);
_t = (int) (0) ;
for (;(step4 > 0 && _t <= limit4) || (step4 < 0 && _t >= limit4) ;_t = ((int)(0 + _t + step4))  ) {
RDebugUtils.currentLine=2097159;
 //BA.debugLineNum = 2097159;BA.debugLine="cursor.Position = t";
_cursor.setPosition(_t);
RDebugUtils.currentLine=2097160;
 //BA.debugLineNum = 2097160;BA.debugLine="contenthold.Initialize(\"contents\")";
__ref._contenthold.Initialize(ba,"contents");
RDebugUtils.currentLine=2097161;
 //BA.debugLineNum = 2097161;BA.debugLine="teamAname.Initialize(\"name1\")";
__ref._teamaname.Initialize(ba,"name1");
RDebugUtils.currentLine=2097162;
 //BA.debugLineNum = 2097162;BA.debugLine="teamBname.Initialize(\"name2\")";
__ref._teambname.Initialize(ba,"name2");
RDebugUtils.currentLine=2097163;
 //BA.debugLineNum = 2097163;BA.debugLine="lblteamAcoef.Initialize(\"coef1\")";
__ref._lblteamacoef.Initialize(ba,"coef1");
RDebugUtils.currentLine=2097164;
 //BA.debugLineNum = 2097164;BA.debugLine="lblteamBcoef.Initialize(\"coef2\")";
__ref._lblteambcoef.Initialize(ba,"coef2");
RDebugUtils.currentLine=2097165;
 //BA.debugLineNum = 2097165;BA.debugLine="lblmatchinfo.Initialize(\"info1\")";
__ref._lblmatchinfo.Initialize(ba,"info1");
RDebugUtils.currentLine=2097166;
 //BA.debugLineNum = 2097166;BA.debugLine="betteamA.Initialize(\"btnbetA\")";
__ref._betteama.Initialize(ba,"btnbetA");
RDebugUtils.currentLine=2097167;
 //BA.debugLineNum = 2097167;BA.debugLine="betteamB.Initialize(\"btnbetB\")";
__ref._betteamb.Initialize(ba,"btnbetB");
RDebugUtils.currentLine=2097169;
 //BA.debugLineNum = 2097169;BA.debugLine="teamAname.Text = cursor.GetString(\"TeamA\")";
__ref._teamaname.setText(BA.ObjectToCharSequence(_cursor.GetString("TeamA")));
RDebugUtils.currentLine=2097170;
 //BA.debugLineNum = 2097170;BA.debugLine="teamBname.Text = cursor.GetString(\"TeamB\")";
__ref._teambname.setText(BA.ObjectToCharSequence(_cursor.GetString("TeamB")));
RDebugUtils.currentLine=2097171;
 //BA.debugLineNum = 2097171;BA.debugLine="lblteamAcoef.Text = cursor.GetString(\"TeamAcoef\"";
__ref._lblteamacoef.setText(BA.ObjectToCharSequence(_cursor.GetString("TeamAcoef")));
RDebugUtils.currentLine=2097172;
 //BA.debugLineNum = 2097172;BA.debugLine="lblteamBcoef.Text = cursor.GetString(\"TeamBcoef\"";
__ref._lblteambcoef.setText(BA.ObjectToCharSequence(_cursor.GetString("TeamBcoef")));
RDebugUtils.currentLine=2097173;
 //BA.debugLineNum = 2097173;BA.debugLine="lblmatchinfo.Text = cursor.GetString(\"MatchInfo\"";
__ref._lblmatchinfo.setText(BA.ObjectToCharSequence(_cursor.GetString("MatchInfo")));
RDebugUtils.currentLine=2097174;
 //BA.debugLineNum = 2097174;BA.debugLine="pnl_bets.Panel.AddView(contenthold,0,0+(20%y + 1";
__ref._pnl_bets.getPanel().AddView((android.view.View)(__ref._contenthold.getObject()),(int) (0),(int) (0+(__c.PerYToCurrent((float) (20),ba)+__c.DipToCurrent((int) (1)))*__ref._i),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (20),ba));
RDebugUtils.currentLine=2097175;
 //BA.debugLineNum = 2097175;BA.debugLine="i = i + 1";
__ref._i = (int) (__ref._i+1);
RDebugUtils.currentLine=2097176;
 //BA.debugLineNum = 2097176;BA.debugLine="contenthold.AddView(teamAname,0,0,20%x,10%y)";
__ref._contenthold.AddView((android.view.View)(__ref._teamaname.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=2097177;
 //BA.debugLineNum = 2097177;BA.debugLine="contenthold.AddView(lblteamAcoef,0,10%y,20%x,10%";
__ref._contenthold.AddView((android.view.View)(__ref._lblteamacoef.getObject()),(int) (0),__c.PerYToCurrent((float) (10),ba),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=2097178;
 //BA.debugLineNum = 2097178;BA.debugLine="contenthold.AddView(teamBname,60%x,0,20%x,10%y)";
__ref._contenthold.AddView((android.view.View)(__ref._teambname.getObject()),__c.PerXToCurrent((float) (60),ba),(int) (0),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=2097179;
 //BA.debugLineNum = 2097179;BA.debugLine="contenthold.AddView(lblteamBcoef,60%x,10%y,20%x,";
__ref._contenthold.AddView((android.view.View)(__ref._lblteambcoef.getObject()),__c.PerXToCurrent((float) (60),ba),__c.PerYToCurrent((float) (10),ba),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=2097180;
 //BA.debugLineNum = 2097180;BA.debugLine="contenthold.AddView(betteamA,20%x,0,10%x,20%y)";
__ref._contenthold.AddView((android.view.View)(__ref._betteama.getObject()),__c.PerXToCurrent((float) (20),ba),(int) (0),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (20),ba));
RDebugUtils.currentLine=2097181;
 //BA.debugLineNum = 2097181;BA.debugLine="contenthold.AddView(betteamB,50%x,0,10%x,20%y)";
__ref._contenthold.AddView((android.view.View)(__ref._betteamb.getObject()),__c.PerXToCurrent((float) (50),ba),(int) (0),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (20),ba));
RDebugUtils.currentLine=2097182;
 //BA.debugLineNum = 2097182;BA.debugLine="contenthold.AddView(lblmatchinfo,30%x,0,50%x,20%";
__ref._contenthold.AddView((android.view.View)(__ref._lblmatchinfo.getObject()),__c.PerXToCurrent((float) (30),ba),(int) (0),__c.PerXToCurrent((float) (50),ba),__c.PerYToCurrent((float) (20),ba));
RDebugUtils.currentLine=2097184;
 //BA.debugLineNum = 2097184;BA.debugLine="ActiveBets_Content";
__ref._activebets_content(null);
 }
};
RDebugUtils.currentLine=2097186;
 //BA.debugLineNum = 2097186;BA.debugLine="cursor.Close";
_cursor.Close();
RDebugUtils.currentLine=2097187;
 //BA.debugLineNum = 2097187;BA.debugLine="Main.database1.Close";
_main._database1.Close();
RDebugUtils.currentLine=2097188;
 //BA.debugLineNum = 2097188;BA.debugLine="End Sub";
return "";
}
public String  _btnbeta_click(b4a.example.useractions __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="useractions";
if (Debug.shouldDelegate(ba, "btnbeta_click"))
	return (String) Debug.delegate(ba, "btnbeta_click", null);
anywheresoftware.b4a.objects.ButtonWrapper _btn = null;
anywheresoftware.b4a.objects.LabelWrapper _templbl = null;
RDebugUtils.currentLine=2162688;
 //BA.debugLineNum = 2162688;BA.debugLine="Sub btnbetA_Click";
RDebugUtils.currentLine=2162689;
 //BA.debugLineNum = 2162689;BA.debugLine="Dim btn As Button = Sender";
_btn = new anywheresoftware.b4a.objects.ButtonWrapper();
_btn.setObject((android.widget.Button)(__c.Sender(ba)));
RDebugUtils.currentLine=2162690;
 //BA.debugLineNum = 2162690;BA.debugLine="Dim templbl As Label = btnlistA.Get(btn.Tag)";
_templbl = new anywheresoftware.b4a.objects.LabelWrapper();
_templbl.setObject((android.widget.TextView)(__ref._btnlista.Get((int)(BA.ObjectToNumber(_btn.getTag())))));
RDebugUtils.currentLine=2162691;
 //BA.debugLineNum = 2162691;BA.debugLine="ToastMessageShow( Main.currentuser.name & \" curre";
__c.ToastMessageShow(BA.ObjectToCharSequence(_main._currentuser.name+" currently betting on "+_templbl.getText()),__c.False);
RDebugUtils.currentLine=2162692;
 //BA.debugLineNum = 2162692;BA.debugLine="CallSub(Main,\"BuildPopUpScreen\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"BuildPopUpScreen");
RDebugUtils.currentLine=2162693;
 //BA.debugLineNum = 2162693;BA.debugLine="CallSub(Main,\"ShowBetsPopUp\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"ShowBetsPopUp");
RDebugUtils.currentLine=2162694;
 //BA.debugLineNum = 2162694;BA.debugLine="End Sub";
return "";
}
public String  _btnbetb_click(b4a.example.useractions __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="useractions";
if (Debug.shouldDelegate(ba, "btnbetb_click"))
	return (String) Debug.delegate(ba, "btnbetb_click", null);
anywheresoftware.b4a.objects.ButtonWrapper _btn = null;
anywheresoftware.b4a.objects.LabelWrapper _templbl = null;
RDebugUtils.currentLine=2228224;
 //BA.debugLineNum = 2228224;BA.debugLine="Sub btnbetB_Click";
RDebugUtils.currentLine=2228225;
 //BA.debugLineNum = 2228225;BA.debugLine="Dim btn As Button = Sender";
_btn = new anywheresoftware.b4a.objects.ButtonWrapper();
_btn.setObject((android.widget.Button)(__c.Sender(ba)));
RDebugUtils.currentLine=2228226;
 //BA.debugLineNum = 2228226;BA.debugLine="Dim templbl As Label = btnlistB.Get(btn.Tag)";
_templbl = new anywheresoftware.b4a.objects.LabelWrapper();
_templbl.setObject((android.widget.TextView)(__ref._btnlistb.Get((int)(BA.ObjectToNumber(_btn.getTag())))));
RDebugUtils.currentLine=2228227;
 //BA.debugLineNum = 2228227;BA.debugLine="ToastMessageShow( Main.currentuser.name & \" curre";
__c.ToastMessageShow(BA.ObjectToCharSequence(_main._currentuser.name+" currently betting on "+_templbl.getText()),__c.False);
RDebugUtils.currentLine=2228228;
 //BA.debugLineNum = 2228228;BA.debugLine="CallSub(Main,\"BuildPopUpScreen\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"BuildPopUpScreen");
RDebugUtils.currentLine=2228229;
 //BA.debugLineNum = 2228229;BA.debugLine="CallSub(Main,\"ShowBetsPopUp\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"ShowBetsPopUp");
RDebugUtils.currentLine=2228230;
 //BA.debugLineNum = 2228230;BA.debugLine="End Sub";
return "";
}
public String  _build_ui(b4a.example.useractions __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="useractions";
if (Debug.shouldDelegate(ba, "build_ui"))
	return (String) Debug.delegate(ba, "build_ui", null);
RDebugUtils.currentLine=1900544;
 //BA.debugLineNum = 1900544;BA.debugLine="Sub Build_UI";
RDebugUtils.currentLine=1900545;
 //BA.debugLineNum = 1900545;BA.debugLine="TabhostActions.AddTab2(\"Active bets\",pnl_bets)";
__ref._tabhostactions.AddTab2("Active bets",(android.view.View)(__ref._pnl_bets.getObject()));
RDebugUtils.currentLine=1900546;
 //BA.debugLineNum = 1900546;BA.debugLine="TabhostActions.AddTab2(\"Finances\",pnl_finances)";
__ref._tabhostactions.AddTab2("Finances",(android.view.View)(__ref._pnl_finances.getObject()));
RDebugUtils.currentLine=1900547;
 //BA.debugLineNum = 1900547;BA.debugLine="TabhostActions.AddTab2(\"History\",pnl_history)";
__ref._tabhostactions.AddTab2("History",(android.view.View)(__ref._pnl_history.getObject()));
RDebugUtils.currentLine=1900548;
 //BA.debugLineNum = 1900548;BA.debugLine="Moneymangmt_Contents";
__ref._moneymangmt_contents(null);
RDebugUtils.currentLine=1900549;
 //BA.debugLineNum = 1900549;BA.debugLine="ShowCurrentBets";
__ref._showcurrentbets(null);
RDebugUtils.currentLine=1900551;
 //BA.debugLineNum = 1900551;BA.debugLine="End Sub";
return "";
}
public String  _moneymangmt_contents(b4a.example.useractions __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="useractions";
if (Debug.shouldDelegate(ba, "moneymangmt_contents"))
	return (String) Debug.delegate(ba, "moneymangmt_contents", null);
RDebugUtils.currentLine=2293760;
 //BA.debugLineNum = 2293760;BA.debugLine="Sub Moneymangmt_Contents";
RDebugUtils.currentLine=2293761;
 //BA.debugLineNum = 2293761;BA.debugLine="pnl_finances.Color = Colors.ARGB(150,0,0,0)";
__ref._pnl_finances.setColor(__c.Colors.ARGB((int) (150),(int) (0),(int) (0),(int) (0)));
RDebugUtils.currentLine=2293762;
 //BA.debugLineNum = 2293762;BA.debugLine="textfield.InputType = textfield.INPUT_TYPE_NUMBER";
__ref._textfield.setInputType(__ref._textfield.INPUT_TYPE_NUMBERS);
RDebugUtils.currentLine=2293763;
 //BA.debugLineNum = 2293763;BA.debugLine="Deposit.Text = \"Deposit\"";
__ref._deposit.setText(BA.ObjectToCharSequence("Deposit"));
RDebugUtils.currentLine=2293764;
 //BA.debugLineNum = 2293764;BA.debugLine="Withdraw.Text = \"Withdraw\"";
__ref._withdraw.setText(BA.ObjectToCharSequence("Withdraw"));
RDebugUtils.currentLine=2293765;
 //BA.debugLineNum = 2293765;BA.debugLine="HelperFunctions.Apply_ViewStyle(Withdraw,Colors.B";
_helperfunctions._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._withdraw.getObject())),__c.Colors.Black,__c.Colors.White,__c.Colors.White,__c.Colors.LightGray,__c.Colors.LightGray,__c.Colors.DarkGray,__c.Colors.DarkGray,(int) (20));
RDebugUtils.currentLine=2293766;
 //BA.debugLineNum = 2293766;BA.debugLine="HelperFunctions.Apply_ViewStyle(Deposit,Colors.Bl";
_helperfunctions._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._deposit.getObject())),__c.Colors.Black,__c.Colors.White,__c.Colors.White,__c.Colors.LightGray,__c.Colors.LightGray,__c.Colors.DarkGray,__c.Colors.DarkGray,(int) (20));
RDebugUtils.currentLine=2293767;
 //BA.debugLineNum = 2293767;BA.debugLine="HelperFunctions.Apply_ViewStyle(textfield,Colors.";
_helperfunctions._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._textfield.getObject())),__c.Colors.Black,__c.Colors.White,__c.Colors.White,__c.Colors.LightGray,__c.Colors.LightGray,__c.Colors.DarkGray,__c.Colors.DarkGray,(int) (20));
RDebugUtils.currentLine=2293769;
 //BA.debugLineNum = 2293769;BA.debugLine="pnl_finances.AddView(textfield,10%x,20%y,60%x,15%";
__ref._pnl_finances.AddView((android.view.View)(__ref._textfield.getObject()),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (20),ba),__c.PerXToCurrent((float) (60),ba),__c.PerYToCurrent((float) (15),ba));
RDebugUtils.currentLine=2293770;
 //BA.debugLineNum = 2293770;BA.debugLine="pnl_finances.AddView(Deposit,10%x,40%y,30%x - 2di";
__ref._pnl_finances.AddView((android.view.View)(__ref._deposit.getObject()),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (40),ba),(int) (__c.PerXToCurrent((float) (30),ba)-__c.DipToCurrent((int) (2))),__c.PerYToCurrent((float) (15),ba));
RDebugUtils.currentLine=2293771;
 //BA.debugLineNum = 2293771;BA.debugLine="pnl_finances.AddView(Withdraw,40%x + 2dip,40%y,30";
__ref._pnl_finances.AddView((android.view.View)(__ref._withdraw.getObject()),(int) (__c.PerXToCurrent((float) (40),ba)+__c.DipToCurrent((int) (2))),__c.PerYToCurrent((float) (40),ba),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (15),ba));
RDebugUtils.currentLine=2293772;
 //BA.debugLineNum = 2293772;BA.debugLine="End Sub";
return "";
}
public String  _showcurrentbets(b4a.example.useractions __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="useractions";
if (Debug.shouldDelegate(ba, "showcurrentbets"))
	return (String) Debug.delegate(ba, "showcurrentbets", null);
RDebugUtils.currentLine=1966080;
 //BA.debugLineNum = 1966080;BA.debugLine="Sub ShowCurrentBets";
RDebugUtils.currentLine=1966081;
 //BA.debugLineNum = 1966081;BA.debugLine="ActiveBetsCreate";
__ref._activebetscreate(null);
RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="If contenthold.IsInitialized Then";
if (__ref._contenthold.IsInitialized()) { 
RDebugUtils.currentLine=1966083;
 //BA.debugLineNum = 1966083;BA.debugLine="ActiveBets_Content";
__ref._activebets_content(null);
 };
RDebugUtils.currentLine=1966085;
 //BA.debugLineNum = 1966085;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.useractions __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="useractions";
RDebugUtils.currentLine=1769472;
 //BA.debugLineNum = 1769472;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=1769473;
 //BA.debugLineNum = 1769473;BA.debugLine="Public TabhostActions As TabHost";
_tabhostactions = new anywheresoftware.b4a.objects.TabHostWrapper();
RDebugUtils.currentLine=1769474;
 //BA.debugLineNum = 1769474;BA.debugLine="Dim pnl_bets As ScrollView";
_pnl_bets = new anywheresoftware.b4a.objects.ScrollViewWrapper();
RDebugUtils.currentLine=1769475;
 //BA.debugLineNum = 1769475;BA.debugLine="Dim pnl_finances,pnl_history As Panel";
_pnl_finances = new anywheresoftware.b4a.objects.PanelWrapper();
_pnl_history = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=1769477;
 //BA.debugLineNum = 1769477;BA.debugLine="Dim textfield As EditText";
_textfield = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=1769478;
 //BA.debugLineNum = 1769478;BA.debugLine="Dim Deposit,Withdraw  As Button";
_deposit = new anywheresoftware.b4a.objects.ButtonWrapper();
_withdraw = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=1769479;
 //BA.debugLineNum = 1769479;BA.debugLine="Dim booBuild As Boolean";
_boobuild = false;
RDebugUtils.currentLine=1769482;
 //BA.debugLineNum = 1769482;BA.debugLine="Dim contenthold As Panel";
_contenthold = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=1769483;
 //BA.debugLineNum = 1769483;BA.debugLine="Dim lblteamAcoef,lblteamBcoef,lblmatchinfo,teamBn";
_lblteamacoef = new anywheresoftware.b4a.objects.LabelWrapper();
_lblteambcoef = new anywheresoftware.b4a.objects.LabelWrapper();
_lblmatchinfo = new anywheresoftware.b4a.objects.LabelWrapper();
_teambname = new anywheresoftware.b4a.objects.LabelWrapper();
_teamaname = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=1769484;
 //BA.debugLineNum = 1769484;BA.debugLine="Dim betteamA,betteamB As Button";
_betteama = new anywheresoftware.b4a.objects.ButtonWrapper();
_betteamb = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=1769485;
 //BA.debugLineNum = 1769485;BA.debugLine="Dim betbtntagA , betbtntagB,i As Int = 0";
_betbtntaga = 0;
_betbtntagb = 0;
_i = (int) (0);
RDebugUtils.currentLine=1769486;
 //BA.debugLineNum = 1769486;BA.debugLine="Dim btnlistA,btnlistB As List";
_btnlista = new anywheresoftware.b4a.objects.collections.List();
_btnlistb = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=1769488;
 //BA.debugLineNum = 1769488;BA.debugLine="End Sub";
return "";
}
public String  _deposit_click(b4a.example.useractions __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="useractions";
if (Debug.shouldDelegate(ba, "deposit_click"))
	return (String) Debug.delegate(ba, "deposit_click", null);
RDebugUtils.currentLine=2359296;
 //BA.debugLineNum = 2359296;BA.debugLine="Sub deposit_Click";
RDebugUtils.currentLine=2359297;
 //BA.debugLineNum = 2359297;BA.debugLine="If textfield.Text = \"\" Then";
if ((__ref._textfield.getText()).equals("")) { 
RDebugUtils.currentLine=2359298;
 //BA.debugLineNum = 2359298;BA.debugLine="ToastMessageShow(\"Nothing entered\",False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("Nothing entered"),__c.False);
 }else {
RDebugUtils.currentLine=2359301;
 //BA.debugLineNum = 2359301;BA.debugLine="Main.currentuser.money = Main.currentuser.money";
_main._currentuser.money = _main._currentuser.money+(double)(Double.parseDouble(__ref._textfield.getText()));
RDebugUtils.currentLine=2359302;
 //BA.debugLineNum = 2359302;BA.debugLine="Main.database.ExecNonQuery(\"UPDATE  Users SET Mo";
_main._database.ExecNonQuery("UPDATE  Users SET Money = '"+BA.NumberToString(_main._currentuser.money)+"' WHERE Username = '"+_main._currentuser.name+"'");
RDebugUtils.currentLine=2359303;
 //BA.debugLineNum = 2359303;BA.debugLine="CallSub2(Main,\"DepositWithdrawMoney\",Main.curren";
__c.CallSubDebug2(ba,(Object)(_main.getObject()),"DepositWithdrawMoney",(Object)(_main._currentuser.money));
 };
RDebugUtils.currentLine=2359306;
 //BA.debugLineNum = 2359306;BA.debugLine="End Sub";
return "";
}
public String  _withdraw_click(b4a.example.useractions __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="useractions";
if (Debug.shouldDelegate(ba, "withdraw_click"))
	return (String) Debug.delegate(ba, "withdraw_click", null);
RDebugUtils.currentLine=2424832;
 //BA.debugLineNum = 2424832;BA.debugLine="Sub withdraw_Click";
RDebugUtils.currentLine=2424833;
 //BA.debugLineNum = 2424833;BA.debugLine="If textfield.Text = \"\" Then";
if ((__ref._textfield.getText()).equals("")) { 
RDebugUtils.currentLine=2424834;
 //BA.debugLineNum = 2424834;BA.debugLine="ToastMessageShow(\"Nothing entered\",False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("Nothing entered"),__c.False);
 }else {
RDebugUtils.currentLine=2424836;
 //BA.debugLineNum = 2424836;BA.debugLine="Main.currentuser.money = Main.currentuser.money";
_main._currentuser.money = _main._currentuser.money-(double)(Double.parseDouble(__ref._textfield.getText()));
RDebugUtils.currentLine=2424837;
 //BA.debugLineNum = 2424837;BA.debugLine="If Main.currentuser.money < 0 Then";
if (_main._currentuser.money<0) { 
RDebugUtils.currentLine=2424838;
 //BA.debugLineNum = 2424838;BA.debugLine="Main.currentuser.money = 0";
_main._currentuser.money = 0;
 };
RDebugUtils.currentLine=2424840;
 //BA.debugLineNum = 2424840;BA.debugLine="Main.database.ExecNonQuery(\"UPDATE  Users SET Mo";
_main._database.ExecNonQuery("UPDATE  Users SET Money = '"+BA.NumberToString(_main._currentuser.money)+"' WHERE Username = '"+_main._currentuser.name+"'");
RDebugUtils.currentLine=2424841;
 //BA.debugLineNum = 2424841;BA.debugLine="CallSub2(Main,\"DepositWithdrawMoney\",Main.curren";
__c.CallSubDebug2(ba,(Object)(_main.getObject()),"DepositWithdrawMoney",(Object)(_main._currentuser.money));
 };
RDebugUtils.currentLine=2424843;
 //BA.debugLineNum = 2424843;BA.debugLine="End Sub";
return "";
}
}