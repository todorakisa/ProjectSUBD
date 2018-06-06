
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class useractions {
    public static RemoteObject myClass;
	public useractions() {
	}
    public static PCBA staticBA = new PCBA(null, useractions.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _tabhostactions = RemoteObject.declareNull("anywheresoftware.b4a.objects.TabHostWrapper");
public static RemoteObject _pnl_bets = RemoteObject.declareNull("anywheresoftware.b4a.objects.ScrollViewWrapper");
public static RemoteObject _pnl_finances = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _pnl_history = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _textfield = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _deposit = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _withdraw = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _boobuild = RemoteObject.createImmutable(false);
public static RemoteObject _contenthold = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _lblteamacoef = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblteambcoef = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblmatchinfo = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _teambname = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _teamaname = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _betteama = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _betteamb = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _betbtntaga = RemoteObject.createImmutable(0);
public static RemoteObject _betbtntagb = RemoteObject.createImmutable(0);
public static RemoteObject _i = RemoteObject.createImmutable(0);
public static RemoteObject _btnlista = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _btnlistb = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static b4a.example.main _main = null;
public static b4a.example.helperfunctions _helperfunctions = null;
public static b4a.example.types _types = null;
public static b4a.example.starter _starter = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"betbtntagA",_ref.getField(false, "_betbtntaga"),"betbtntagB",_ref.getField(false, "_betbtntagb"),"betteamA",_ref.getField(false, "_betteama"),"betteamB",_ref.getField(false, "_betteamb"),"booBuild",_ref.getField(false, "_boobuild"),"btnlistA",_ref.getField(false, "_btnlista"),"btnlistB",_ref.getField(false, "_btnlistb"),"contenthold",_ref.getField(false, "_contenthold"),"Deposit",_ref.getField(false, "_deposit"),"i",_ref.getField(false, "_i"),"lblmatchinfo",_ref.getField(false, "_lblmatchinfo"),"lblteamAcoef",_ref.getField(false, "_lblteamacoef"),"lblteamBcoef",_ref.getField(false, "_lblteambcoef"),"pnl_bets",_ref.getField(false, "_pnl_bets"),"pnl_finances",_ref.getField(false, "_pnl_finances"),"pnl_history",_ref.getField(false, "_pnl_history"),"TabhostActions",_ref.getField(false, "_tabhostactions"),"teamAname",_ref.getField(false, "_teamaname"),"teamBname",_ref.getField(false, "_teambname"),"textfield",_ref.getField(false, "_textfield"),"Withdraw",_ref.getField(false, "_withdraw")};
}
}