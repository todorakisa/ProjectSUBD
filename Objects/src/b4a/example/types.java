package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class types {
private static types mostCurrent = new types();
public static Object getObject() {
    throw new RuntimeException("Code module does not support this method.");
}
 
public static class _currentuser{
public boolean IsInitialized;
public String name;
public String password;
public double balance;
public String rank;
public void Initialize() {
IsInitialized = true;
name = "";
password = "";
balance = 0;
rank = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _user{
public boolean IsInitialized;
public String name;
public double money;
public String rank;
public void Initialize() {
IsInitialized = true;
name = "";
money = 0;
rank = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _masteradmin{
public boolean IsInitialized;
public String name;
public String password;
public double funds;
public String rank;
public void Initialize() {
IsInitialized = true;
name = "";
password = "";
funds = 0;
rank = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public b4a.example.main _main = null;
public b4a.example.helperfunctions _helperfunctions = null;
public b4a.example.starter _starter = null;
}