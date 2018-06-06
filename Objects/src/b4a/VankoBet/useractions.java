package b4a.VankoBet;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class useractions extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.VankoBet.useractions");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.VankoBet.useractions.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
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
public b4a.VankoBet.main _main = null;
public b4a.VankoBet.types _types = null;
public b4a.VankoBet.starter _starter = null;
public b4a.VankoBet.helperfunctions _helperfunctions = null;
public b4a.VankoBet.db _db = null;
public String  _activebets_content() throws Exception{
 //BA.debugLineNum = 56;BA.debugLine="Sub ActiveBets_Content";
 //BA.debugLineNum = 57;BA.debugLine="pnl_bets.Color = Colors.White";
_pnl_bets.setColor(__c.Colors.White);
 //BA.debugLineNum = 58;BA.debugLine="contenthold.Color = Colors.LightGray";
_contenthold.setColor(__c.Colors.LightGray);
 //BA.debugLineNum = 60;BA.debugLine="betteamA.Color = Colors.RGB(0, 153, 0)";
_betteama.setColor(__c.Colors.RGB((int) (0),(int) (153),(int) (0)));
 //BA.debugLineNum = 61;BA.debugLine="betteamA.Text = \"Bet\"";
_betteama.setText(BA.ObjectToCharSequence("Bet"));
 //BA.debugLineNum = 62;BA.debugLine="betteamA.TextSize = 40";
_betteama.setTextSize((float) (40));
 //BA.debugLineNum = 63;BA.debugLine="betteamA.Gravity = Gravity.CENTER";
_betteama.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 65;BA.debugLine="betteamB.Color = Colors.RGB(0, 153, 0)";
_betteamb.setColor(__c.Colors.RGB((int) (0),(int) (153),(int) (0)));
 //BA.debugLineNum = 66;BA.debugLine="betteamB.Text = \"Bet\"";
_betteamb.setText(BA.ObjectToCharSequence("Bet"));
 //BA.debugLineNum = 67;BA.debugLine="betteamB.TextSize = 40";
_betteamb.setTextSize((float) (40));
 //BA.debugLineNum = 68;BA.debugLine="betteamB.Gravity = Gravity.CENTER";
_betteamb.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 70;BA.debugLine="teamAname.TextColor = Colors.Black";
_teamaname.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 71;BA.debugLine="teamBname.TextColor = Colors.Black";
_teambname.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 72;BA.debugLine="teamAname.TextSize = 30";
_teamaname.setTextSize((float) (30));
 //BA.debugLineNum = 73;BA.debugLine="teamBname.TextSize = 30";
_teambname.setTextSize((float) (30));
 //BA.debugLineNum = 74;BA.debugLine="teamAname.Gravity = Gravity.CENTER";
_teamaname.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 75;BA.debugLine="teamBname.Gravity = Gravity.CENTER";
_teambname.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 77;BA.debugLine="lblteamAcoef.TextColor = Colors.Black";
_lblteamacoef.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 78;BA.debugLine="lblteamBcoef.TextColor = Colors.Black";
_lblteambcoef.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 79;BA.debugLine="lblteamAcoef.TextSize = 30";
_lblteamacoef.setTextSize((float) (30));
 //BA.debugLineNum = 80;BA.debugLine="lblteamBcoef.TextSize = 30";
_lblteambcoef.setTextSize((float) (30));
 //BA.debugLineNum = 81;BA.debugLine="lblteamAcoef.Gravity = Gravity.CENTER";
_lblteamacoef.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 82;BA.debugLine="lblteamBcoef.Gravity = Gravity.CENTER";
_lblteambcoef.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 83;BA.debugLine="lblmatchinfo.TextColor = Colors.Black";
_lblmatchinfo.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 84;BA.debugLine="lblmatchinfo.TextSize = 20";
_lblmatchinfo.setTextSize((float) (20));
 //BA.debugLineNum = 86;BA.debugLine="betteamA.Tag = betbtntagA";
_betteama.setTag((Object)(_betbtntaga));
 //BA.debugLineNum = 87;BA.debugLine="teamAname.Tag = betteamA.Tag";
_teamaname.setTag(_betteama.getTag());
 //BA.debugLineNum = 88;BA.debugLine="betbtntagA = betbtntagA + 1";
_betbtntaga = (int) (_betbtntaga+1);
 //BA.debugLineNum = 89;BA.debugLine="btnlistA.Add(teamAname)";
_btnlista.Add((Object)(_teamaname.getObject()));
 //BA.debugLineNum = 91;BA.debugLine="betteamB.Tag = betbtntagB";
_betteamb.setTag((Object)(_betbtntagb));
 //BA.debugLineNum = 92;BA.debugLine="teamBname.Tag = betteamB.Tag";
_teambname.setTag(_betteamb.getTag());
 //BA.debugLineNum = 93;BA.debugLine="betbtntagB = betbtntagB + 1";
_betbtntagb = (int) (_betbtntagb+1);
 //BA.debugLineNum = 94;BA.debugLine="btnlistB.Add(teamBname)";
_btnlistb.Add((Object)(_teambname.getObject()));
 //BA.debugLineNum = 95;BA.debugLine="End Sub";
return "";
}
public String  _activebetscreate() throws Exception{
anywheresoftware.b4a.sql.SQL.CursorWrapper _cursor = null;
int _t = 0;
 //BA.debugLineNum = 97;BA.debugLine="Sub ActiveBetsCreate";
 //BA.debugLineNum = 98;BA.debugLine="DB.database.Initialize(File.DirDefaultExternal,\"U";
_db._database.Initialize(__c.File.getDirDefaultExternal(),"UserAndBetsDatabase.db",__c.True);
 //BA.debugLineNum = 99;BA.debugLine="Dim cursor As Cursor";
_cursor = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
 //BA.debugLineNum = 100;BA.debugLine="cursor = DB.database.ExecQuery(\"SELECT ID,TeamA,T";
_cursor.setObject((android.database.Cursor)(_db._database.ExecQuery("SELECT ID,TeamA,TeamAcoef, TeamB, TeamBcoef,MatchInfo FROM Bets")));
 //BA.debugLineNum = 101;BA.debugLine="For t = 0 To cursor.RowCount - 1";
{
final int step4 = 1;
final int limit4 = (int) (_cursor.getRowCount()-1);
_t = (int) (0) ;
for (;(step4 > 0 && _t <= limit4) || (step4 < 0 && _t >= limit4) ;_t = ((int)(0 + _t + step4))  ) {
 //BA.debugLineNum = 102;BA.debugLine="cursor.Position = t";
_cursor.setPosition(_t);
 //BA.debugLineNum = 103;BA.debugLine="contenthold.Initialize(\"contents\")";
_contenthold.Initialize(ba,"contents");
 //BA.debugLineNum = 104;BA.debugLine="teamAname.Initialize(\"name1\")";
_teamaname.Initialize(ba,"name1");
 //BA.debugLineNum = 105;BA.debugLine="teamBname.Initialize(\"name2\")";
_teambname.Initialize(ba,"name2");
 //BA.debugLineNum = 106;BA.debugLine="lblteamAcoef.Initialize(\"coef1\")";
_lblteamacoef.Initialize(ba,"coef1");
 //BA.debugLineNum = 107;BA.debugLine="lblteamBcoef.Initialize(\"coef2\")";
_lblteambcoef.Initialize(ba,"coef2");
 //BA.debugLineNum = 108;BA.debugLine="lblmatchinfo.Initialize(\"info1\")";
_lblmatchinfo.Initialize(ba,"info1");
 //BA.debugLineNum = 109;BA.debugLine="betteamA.Initialize(\"btnbetA\")";
_betteama.Initialize(ba,"btnbetA");
 //BA.debugLineNum = 110;BA.debugLine="betteamB.Initialize(\"btnbetB\")";
_betteamb.Initialize(ba,"btnbetB");
 //BA.debugLineNum = 112;BA.debugLine="teamAname.Text = cursor.GetString(\"TeamA\")";
_teamaname.setText(BA.ObjectToCharSequence(_cursor.GetString("TeamA")));
 //BA.debugLineNum = 113;BA.debugLine="teamBname.Text = cursor.GetString(\"TeamB\")";
_teambname.setText(BA.ObjectToCharSequence(_cursor.GetString("TeamB")));
 //BA.debugLineNum = 114;BA.debugLine="lblteamAcoef.Text = cursor.GetString(\"TeamAcoef\"";
_lblteamacoef.setText(BA.ObjectToCharSequence(_cursor.GetString("TeamAcoef")));
 //BA.debugLineNum = 115;BA.debugLine="lblteamBcoef.Text = cursor.GetString(\"TeamBcoef\"";
_lblteambcoef.setText(BA.ObjectToCharSequence(_cursor.GetString("TeamBcoef")));
 //BA.debugLineNum = 116;BA.debugLine="lblmatchinfo.Text = cursor.GetString(\"MatchInfo\"";
_lblmatchinfo.setText(BA.ObjectToCharSequence(_cursor.GetString("MatchInfo")));
 //BA.debugLineNum = 117;BA.debugLine="pnl_bets.Panel.AddView(contenthold,0,0+(20%y + 1";
_pnl_bets.getPanel().AddView((android.view.View)(_contenthold.getObject()),(int) (0),(int) (0+(__c.PerYToCurrent((float) (20),ba)+__c.DipToCurrent((int) (1)))*_i),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (20),ba));
 //BA.debugLineNum = 118;BA.debugLine="i = i + 1";
_i = (int) (_i+1);
 //BA.debugLineNum = 119;BA.debugLine="contenthold.AddView(teamAname,0,0,20%x,10%y)";
_contenthold.AddView((android.view.View)(_teamaname.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 120;BA.debugLine="contenthold.AddView(lblteamAcoef,0,10%y,20%x,10%";
_contenthold.AddView((android.view.View)(_lblteamacoef.getObject()),(int) (0),__c.PerYToCurrent((float) (10),ba),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 121;BA.debugLine="contenthold.AddView(teamBname,60%x,0,20%x,10%y)";
_contenthold.AddView((android.view.View)(_teambname.getObject()),__c.PerXToCurrent((float) (60),ba),(int) (0),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 122;BA.debugLine="contenthold.AddView(lblteamBcoef,60%x,10%y,20%x,";
_contenthold.AddView((android.view.View)(_lblteambcoef.getObject()),__c.PerXToCurrent((float) (60),ba),__c.PerYToCurrent((float) (10),ba),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 123;BA.debugLine="contenthold.AddView(betteamA,20%x,0,10%x,20%y)";
_contenthold.AddView((android.view.View)(_betteama.getObject()),__c.PerXToCurrent((float) (20),ba),(int) (0),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (20),ba));
 //BA.debugLineNum = 124;BA.debugLine="contenthold.AddView(betteamB,50%x,0,10%x,20%y)";
_contenthold.AddView((android.view.View)(_betteamb.getObject()),__c.PerXToCurrent((float) (50),ba),(int) (0),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (20),ba));
 //BA.debugLineNum = 125;BA.debugLine="contenthold.AddView(lblmatchinfo,30%x,0,50%x,20%";
_contenthold.AddView((android.view.View)(_lblmatchinfo.getObject()),__c.PerXToCurrent((float) (30),ba),(int) (0),__c.PerXToCurrent((float) (50),ba),__c.PerYToCurrent((float) (20),ba));
 //BA.debugLineNum = 127;BA.debugLine="ActiveBets_Content";
_activebets_content();
 }
};
 //BA.debugLineNum = 129;BA.debugLine="cursor.Close";
_cursor.Close();
 //BA.debugLineNum = 130;BA.debugLine="DB.database.Close";
_db._database.Close();
 //BA.debugLineNum = 131;BA.debugLine="End Sub";
return "";
}
public String  _btnbeta_click() throws Exception{
anywheresoftware.b4a.objects.ButtonWrapper _btn = null;
anywheresoftware.b4a.objects.LabelWrapper _templbl = null;
 //BA.debugLineNum = 133;BA.debugLine="Sub btnbetA_Click";
 //BA.debugLineNum = 134;BA.debugLine="Dim btn As Button = Sender";
_btn = new anywheresoftware.b4a.objects.ButtonWrapper();
_btn.setObject((android.widget.Button)(__c.Sender(ba)));
 //BA.debugLineNum = 135;BA.debugLine="Dim templbl As Label = btnlistA.Get(btn.Tag)";
_templbl = new anywheresoftware.b4a.objects.LabelWrapper();
_templbl.setObject((android.widget.TextView)(_btnlista.Get((int)(BA.ObjectToNumber(_btn.getTag())))));
 //BA.debugLineNum = 136;BA.debugLine="ToastMessageShow( Types.currentuser.name & \" curr";
__c.ToastMessageShow(BA.ObjectToCharSequence(_types._currentuser.name+" currently betting on "+_templbl.getText()),__c.False);
 //BA.debugLineNum = 137;BA.debugLine="CallSub(Main,\"BuildPopUpScreen\")";
__c.CallSubNew(ba,(Object)(_main.getObject()),"BuildPopUpScreen");
 //BA.debugLineNum = 138;BA.debugLine="CallSub(Main,\"ShowBetsPopUp\")";
__c.CallSubNew(ba,(Object)(_main.getObject()),"ShowBetsPopUp");
 //BA.debugLineNum = 139;BA.debugLine="End Sub";
return "";
}
public String  _btnbetb_click() throws Exception{
anywheresoftware.b4a.objects.ButtonWrapper _btn = null;
anywheresoftware.b4a.objects.LabelWrapper _templbl = null;
 //BA.debugLineNum = 140;BA.debugLine="Sub btnbetB_Click";
 //BA.debugLineNum = 141;BA.debugLine="Dim btn As Button = Sender";
_btn = new anywheresoftware.b4a.objects.ButtonWrapper();
_btn.setObject((android.widget.Button)(__c.Sender(ba)));
 //BA.debugLineNum = 142;BA.debugLine="Dim templbl As Label = btnlistB.Get(btn.Tag)";
_templbl = new anywheresoftware.b4a.objects.LabelWrapper();
_templbl.setObject((android.widget.TextView)(_btnlistb.Get((int)(BA.ObjectToNumber(_btn.getTag())))));
 //BA.debugLineNum = 143;BA.debugLine="ToastMessageShow( Types.currentuser.name & \" curr";
__c.ToastMessageShow(BA.ObjectToCharSequence(_types._currentuser.name+" currently betting on "+_templbl.getText()),__c.False);
 //BA.debugLineNum = 144;BA.debugLine="CallSub(Main,\"BuildPopUpScreen\")";
__c.CallSubNew(ba,(Object)(_main.getObject()),"BuildPopUpScreen");
 //BA.debugLineNum = 145;BA.debugLine="CallSub(Main,\"ShowBetsPopUp\")";
__c.CallSubNew(ba,(Object)(_main.getObject()),"ShowBetsPopUp");
 //BA.debugLineNum = 146;BA.debugLine="End Sub";
return "";
}
public String  _build_ui() throws Exception{
 //BA.debugLineNum = 40;BA.debugLine="Sub Build_UI";
 //BA.debugLineNum = 41;BA.debugLine="TabhostActions.AddTab2(\"Active bets\",pnl_bets)";
_tabhostactions.AddTab2("Active bets",(android.view.View)(_pnl_bets.getObject()));
 //BA.debugLineNum = 42;BA.debugLine="TabhostActions.AddTab2(\"Finances\",pnl_finances)";
_tabhostactions.AddTab2("Finances",(android.view.View)(_pnl_finances.getObject()));
 //BA.debugLineNum = 43;BA.debugLine="TabhostActions.AddTab2(\"History\",pnl_history)";
_tabhostactions.AddTab2("History",(android.view.View)(_pnl_history.getObject()));
 //BA.debugLineNum = 44;BA.debugLine="Moneymangmt_Contents";
_moneymangmt_contents();
 //BA.debugLineNum = 45;BA.debugLine="ShowCurrentBets";
_showcurrentbets();
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Public TabhostActions As TabHost";
_tabhostactions = new anywheresoftware.b4a.objects.TabHostWrapper();
 //BA.debugLineNum = 3;BA.debugLine="Dim pnl_bets As ScrollView";
_pnl_bets = new anywheresoftware.b4a.objects.ScrollViewWrapper();
 //BA.debugLineNum = 4;BA.debugLine="Dim pnl_finances,pnl_history As Panel";
_pnl_finances = new anywheresoftware.b4a.objects.PanelWrapper();
_pnl_history = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 6;BA.debugLine="Dim textfield As EditText";
_textfield = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 7;BA.debugLine="Dim Deposit,Withdraw  As Button";
_deposit = new anywheresoftware.b4a.objects.ButtonWrapper();
_withdraw = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 8;BA.debugLine="Dim booBuild As Boolean";
_boobuild = false;
 //BA.debugLineNum = 11;BA.debugLine="Dim contenthold As Panel";
_contenthold = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 12;BA.debugLine="Dim lblteamAcoef,lblteamBcoef,lblmatchinfo,teamBn";
_lblteamacoef = new anywheresoftware.b4a.objects.LabelWrapper();
_lblteambcoef = new anywheresoftware.b4a.objects.LabelWrapper();
_lblmatchinfo = new anywheresoftware.b4a.objects.LabelWrapper();
_teambname = new anywheresoftware.b4a.objects.LabelWrapper();
_teamaname = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 13;BA.debugLine="Dim betteamA,betteamB As Button";
_betteama = new anywheresoftware.b4a.objects.ButtonWrapper();
_betteamb = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 14;BA.debugLine="Dim betbtntagA , betbtntagB,i As Int = 0";
_betbtntaga = 0;
_betbtntagb = 0;
_i = (int) (0);
 //BA.debugLineNum = 15;BA.debugLine="Dim btnlistA,btnlistB As List";
_btnlista = new anywheresoftware.b4a.objects.collections.List();
_btnlistb = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return "";
}
public String  _deposit_click() throws Exception{
 //BA.debugLineNum = 162;BA.debugLine="Sub deposit_Click";
 //BA.debugLineNum = 163;BA.debugLine="If textfield.Text = \"\" Then";
if ((_textfield.getText()).equals("")) { 
 //BA.debugLineNum = 164;BA.debugLine="ToastMessageShow(\"Nothing entered\",False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("Nothing entered"),__c.False);
 }else {
 //BA.debugLineNum = 167;BA.debugLine="Types.currentuser.money = Types.currentuser.mone";
_types._currentuser.money = _types._currentuser.money+(double)(Double.parseDouble(_textfield.getText()));
 //BA.debugLineNum = 168;BA.debugLine="DB.UserSetMoney(Types.currentuser.money,Types.cu";
_db._usersetmoney(ba,_types._currentuser.money,_types._currentuser.name);
 //BA.debugLineNum = 169;BA.debugLine="CallSub2(Main,\"DepositWithdrawMoney\",Types.curre";
__c.CallSubNew2(ba,(Object)(_main.getObject()),"DepositWithdrawMoney",(Object)(_types._currentuser.money));
 };
 //BA.debugLineNum = 171;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 20;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 21;BA.debugLine="TabhostActions.Initialize(\"tabhost1\")";
_tabhostactions.Initialize(ba,"tabhost1");
 //BA.debugLineNum = 22;BA.debugLine="pnl_bets.Initialize(-1)";
_pnl_bets.Initialize(ba,(int) (-1));
 //BA.debugLineNum = 23;BA.debugLine="pnl_finances.Initialize(\"moneys\")";
_pnl_finances.Initialize(ba,"moneys");
 //BA.debugLineNum = 24;BA.debugLine="pnl_history.Initialize(\"history\")";
_pnl_history.Initialize(ba,"history");
 //BA.debugLineNum = 26;BA.debugLine="textfield.Initialize(\"sumfield\")";
_textfield.Initialize(ba,"sumfield");
 //BA.debugLineNum = 27;BA.debugLine="Deposit.Initialize(\"deposit\")";
_deposit.Initialize(ba,"deposit");
 //BA.debugLineNum = 28;BA.debugLine="Withdraw.Initialize(\"withdraw\")";
_withdraw.Initialize(ba,"withdraw");
 //BA.debugLineNum = 30;BA.debugLine="btnlistA.Initialize";
_btnlista.Initialize();
 //BA.debugLineNum = 31;BA.debugLine="btnlistB.Initialize";
_btnlistb.Initialize();
 //BA.debugLineNum = 33;BA.debugLine="If booBuild = False Then";
if (_boobuild==__c.False) { 
 //BA.debugLineNum = 34;BA.debugLine="Build_UI";
_build_ui();
 //BA.debugLineNum = 35;BA.debugLine="booBuild = True";
_boobuild = __c.True;
 };
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return "";
}
public String  _moneymangmt_contents() throws Exception{
 //BA.debugLineNum = 148;BA.debugLine="Sub Moneymangmt_Contents";
 //BA.debugLineNum = 149;BA.debugLine="pnl_finances.Color = Colors.ARGB(150,0,0,0)";
_pnl_finances.setColor(__c.Colors.ARGB((int) (150),(int) (0),(int) (0),(int) (0)));
 //BA.debugLineNum = 150;BA.debugLine="textfield.InputType = textfield.INPUT_TYPE_NUMBER";
_textfield.setInputType(_textfield.INPUT_TYPE_NUMBERS);
 //BA.debugLineNum = 151;BA.debugLine="Deposit.Text = \"Deposit\"";
_deposit.setText(BA.ObjectToCharSequence("Deposit"));
 //BA.debugLineNum = 152;BA.debugLine="Withdraw.Text = \"Withdraw\"";
_withdraw.setText(BA.ObjectToCharSequence("Withdraw"));
 //BA.debugLineNum = 153;BA.debugLine="HelperFunctions.Apply_ViewStyle(Withdraw,Colors.B";
_helperfunctions._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_withdraw.getObject())),__c.Colors.Black,__c.Colors.White,__c.Colors.White,__c.Colors.LightGray,__c.Colors.LightGray,__c.Colors.DarkGray,__c.Colors.DarkGray,(int) (20));
 //BA.debugLineNum = 154;BA.debugLine="HelperFunctions.Apply_ViewStyle(Deposit,Colors.Bl";
_helperfunctions._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_deposit.getObject())),__c.Colors.Black,__c.Colors.White,__c.Colors.White,__c.Colors.LightGray,__c.Colors.LightGray,__c.Colors.DarkGray,__c.Colors.DarkGray,(int) (20));
 //BA.debugLineNum = 155;BA.debugLine="HelperFunctions.Apply_ViewStyle(textfield,Colors.";
_helperfunctions._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_textfield.getObject())),__c.Colors.Black,__c.Colors.White,__c.Colors.White,__c.Colors.LightGray,__c.Colors.LightGray,__c.Colors.DarkGray,__c.Colors.DarkGray,(int) (20));
 //BA.debugLineNum = 157;BA.debugLine="pnl_finances.AddView(textfield,10%x,20%y,60%x,15%";
_pnl_finances.AddView((android.view.View)(_textfield.getObject()),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (20),ba),__c.PerXToCurrent((float) (60),ba),__c.PerYToCurrent((float) (15),ba));
 //BA.debugLineNum = 158;BA.debugLine="pnl_finances.AddView(Deposit,10%x,40%y,30%x - 2di";
_pnl_finances.AddView((android.view.View)(_deposit.getObject()),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (40),ba),(int) (__c.PerXToCurrent((float) (30),ba)-__c.DipToCurrent((int) (2))),__c.PerYToCurrent((float) (15),ba));
 //BA.debugLineNum = 159;BA.debugLine="pnl_finances.AddView(Withdraw,40%x + 2dip,40%y,30";
_pnl_finances.AddView((android.view.View)(_withdraw.getObject()),(int) (__c.PerXToCurrent((float) (40),ba)+__c.DipToCurrent((int) (2))),__c.PerYToCurrent((float) (40),ba),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (15),ba));
 //BA.debugLineNum = 160;BA.debugLine="End Sub";
return "";
}
public String  _showcurrentbets() throws Exception{
 //BA.debugLineNum = 49;BA.debugLine="Sub ShowCurrentBets";
 //BA.debugLineNum = 50;BA.debugLine="ActiveBetsCreate";
_activebetscreate();
 //BA.debugLineNum = 51;BA.debugLine="If contenthold.IsInitialized Then";
if (_contenthold.IsInitialized()) { 
 //BA.debugLineNum = 52;BA.debugLine="ActiveBets_Content";
_activebets_content();
 };
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return "";
}
public String  _withdraw_click() throws Exception{
 //BA.debugLineNum = 173;BA.debugLine="Sub withdraw_Click";
 //BA.debugLineNum = 174;BA.debugLine="If textfield.Text = \"\" Then";
if ((_textfield.getText()).equals("")) { 
 //BA.debugLineNum = 175;BA.debugLine="ToastMessageShow(\"Nothing entered\",False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("Nothing entered"),__c.False);
 }else {
 //BA.debugLineNum = 177;BA.debugLine="Types.currentuser.money = Types.currentuser.mone";
_types._currentuser.money = _types._currentuser.money-(double)(Double.parseDouble(_textfield.getText()));
 //BA.debugLineNum = 178;BA.debugLine="If Types.currentuser.money < 0 Then";
if (_types._currentuser.money<0) { 
 //BA.debugLineNum = 179;BA.debugLine="Types.currentuser.money = 0";
_types._currentuser.money = 0;
 };
 //BA.debugLineNum = 181;BA.debugLine="DB.UserSetMoney(Types.currentuser.money,Types.cu";
_db._usersetmoney(ba,_types._currentuser.money,_types._currentuser.name);
 //BA.debugLineNum = 182;BA.debugLine="CallSub2(Main,\"DepositWithdrawMoney\",Types.curre";
__c.CallSubNew2(ba,(Object)(_main.getObject()),"DepositWithdrawMoney",(Object)(_types._currentuser.money));
 };
 //BA.debugLineNum = 184;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
