
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class adminactions {
    public static RemoteObject myClass;
	public adminactions() {
	}
    public static PCBA staticBA = new PCBA(null, adminactions.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _tabhostactions = RemoteObject.declareNull("anywheresoftware.b4a.objects.TabHostWrapper");
public static RemoteObject _pnl_bets = RemoteObject.declareNull("anywheresoftware.b4a.objects.ScrollViewWrapper");
public static RemoteObject _pnl_add_bets = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _pnl_currentusers = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _textfield = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _deposit = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _withdraw = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _boobuild = RemoteObject.createImmutable(false);
public static RemoteObject _lbl_showusers = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _teama = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _teamb = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _teamacoef = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _teambcoef = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _matchinfo = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _submit = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _contenthold = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _teamaname = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _teambname = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblteamacoef = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblteambcoef = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblmatchinfo = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _betteama = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _betteamb = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _i = RemoteObject.createImmutable(0);
public static RemoteObject _betbtntag = RemoteObject.createImmutable(0);
public static b4a.example.main _main = null;
public static b4a.example.helperfunctions _helperfunctions = null;
public static b4a.example.types _types = null;
public static b4a.example.starter _starter = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"betbtntag",_ref.getField(false, "_betbtntag"),"betteamA",_ref.getField(false, "_betteama"),"betteamB",_ref.getField(false, "_betteamb"),"booBuild",_ref.getField(false, "_boobuild"),"contenthold",_ref.getField(false, "_contenthold"),"Deposit",_ref.getField(false, "_deposit"),"i",_ref.getField(false, "_i"),"lbl_showusers",_ref.getField(false, "_lbl_showusers"),"lblmatchinfo",_ref.getField(false, "_lblmatchinfo"),"lblteamAcoef",_ref.getField(false, "_lblteamacoef"),"lblteamBcoef",_ref.getField(false, "_lblteambcoef"),"matchinfo",_ref.getField(false, "_matchinfo"),"pnl_add_bets",_ref.getField(false, "_pnl_add_bets"),"pnl_bets",_ref.getField(false, "_pnl_bets"),"pnl_currentUsers",_ref.getField(false, "_pnl_currentusers"),"submit",_ref.getField(false, "_submit"),"TabhostActions",_ref.getField(false, "_tabhostactions"),"teamA",_ref.getField(false, "_teama"),"teamAcoef",_ref.getField(false, "_teamacoef"),"teamAname",_ref.getField(false, "_teamaname"),"teamB",_ref.getField(false, "_teamb"),"teamBcoef",_ref.getField(false, "_teambcoef"),"teamBname",_ref.getField(false, "_teambname"),"textfield",_ref.getField(false, "_textfield"),"Withdraw",_ref.getField(false, "_withdraw")};
}
}