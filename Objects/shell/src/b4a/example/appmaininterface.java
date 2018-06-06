
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class appmaininterface {
    public static RemoteObject myClass;
	public appmaininterface() {
	}
    public static PCBA staticBA = new PCBA(null, appmaininterface.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _pnlmainscreen = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _pnlleftmenu = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _avataricon = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btn_logout = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _slotmachine = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _avatarimg = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
public static RemoteObject _accountname = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _accountbalance = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _accountrank = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _showbalance = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _showrank = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _actionsforuser = RemoteObject.declareNull("b4a.example.useractions");
public static RemoteObject _actionsforadmin = RemoteObject.declareNull("b4a.example.adminactions");
public static b4a.example.main _main = null;
public static b4a.example.helperfunctions _helperfunctions = null;
public static b4a.example.types _types = null;
public static b4a.example.starter _starter = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"accountbalance",_ref.getField(false, "_accountbalance"),"accountname",_ref.getField(false, "_accountname"),"accountrank",_ref.getField(false, "_accountrank"),"actionsforadmin",_ref.getField(false, "_actionsforadmin"),"actionsforuser",_ref.getField(false, "_actionsforuser"),"avataricon",_ref.getField(false, "_avataricon"),"avatarimg",_ref.getField(false, "_avatarimg"),"btn_logout",_ref.getField(false, "_btn_logout"),"pnlleftmenu",_ref.getField(false, "_pnlleftmenu"),"pnlmainscreen",_ref.getField(false, "_pnlmainscreen"),"showbalance",_ref.getField(false, "_showbalance"),"showrank",_ref.getField(false, "_showrank"),"slotmachine",_ref.getField(false, "_slotmachine")};
}
}