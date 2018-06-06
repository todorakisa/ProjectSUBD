
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class betpopup {
    public static RemoteObject myClass;
	public betpopup() {
	}
    public static PCBA staticBA = new PCBA(null, betpopup.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _background = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _mainscreen = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _entersum = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _submit = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static b4a.example.main _main = null;
public static b4a.example.helperfunctions _helperfunctions = null;
public static b4a.example.types _types = null;
public static b4a.example.starter _starter = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"background",_ref.getField(false, "_background"),"entersum",_ref.getField(false, "_entersum"),"mainscreen",_ref.getField(false, "_mainscreen"),"submit",_ref.getField(false, "_submit")};
}
}