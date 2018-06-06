
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class register {
    public static RemoteObject myClass;
	public register() {
	}
    public static PCBA staticBA = new PCBA(null, register.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _pnlscreen = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _enterusername = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _enterpassword = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _btnregister = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnalreadyreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static b4a.example.main _main = null;
public static b4a.example.helperfunctions _helperfunctions = null;
public static b4a.example.types _types = null;
public static b4a.example.starter _starter = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"btnalreadyreg",_ref.getField(false, "_btnalreadyreg"),"btnregister",_ref.getField(false, "_btnregister"),"enterpassword",_ref.getField(false, "_enterpassword"),"enterusername",_ref.getField(false, "_enterusername"),"pnlscreen",_ref.getField(false, "_pnlscreen")};
}
}