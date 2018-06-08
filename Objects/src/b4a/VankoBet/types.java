package b4a.VankoBet;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class types {
private static types mostCurrent = new types();
public static Object getObject() {
    throw new RuntimeException("Code module does not support this method.");
}
 public anywheresoftware.b4a.keywords.Common __c = null;
public static b4a.VankoBet.types._user _currentuser = null;
public b4a.VankoBet.main _main = null;
public b4a.VankoBet.db _db = null;
public b4a.VankoBet.starter _starter = null;
public b4a.VankoBet.helperfunctions _helperfunctions = null;
public static class _user{
public boolean IsInitialized;
public String name;
public String password;
public double money;
public String rank;
public void Initialize() {
IsInitialized = true;
name = "";
password = "";
money = 0;
rank = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static boolean  _isadmin(anywheresoftware.b4a.BA _ba) throws Exception{
 //BA.debugLineNum = 8;BA.debugLine="Public Sub IsAdmin As Boolean";
 //BA.debugLineNum = 9;BA.debugLine="If CurrentUser.rank = \"Admin\" Then";
if ((_currentuser.rank).equals("Admin")) { 
 //BA.debugLineNum = 10;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 }else {
 //BA.debugLineNum = 12;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 };
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return false;
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Type user(name As String,password As String,money";
;
 //BA.debugLineNum = 5;BA.debugLine="Public CurrentUser As user";
_currentuser = new b4a.VankoBet.types._user();
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
}
