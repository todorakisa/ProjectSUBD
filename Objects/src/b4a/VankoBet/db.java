package b4a.VankoBet;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class db {
private static db mostCurrent = new db();
public static Object getObject() {
    throw new RuntimeException("Code module does not support this method.");
}
 public anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.sql.SQL _database = null;
public b4a.VankoBet.main _main = null;
public b4a.VankoBet.types _types = null;
public b4a.VankoBet.starter _starter = null;
public b4a.VankoBet.helperfunctions _helperfunctions = null;
public static String  _createadmin(anywheresoftware.b4a.BA _ba) throws Exception{
 //BA.debugLineNum = 25;BA.debugLine="Public Sub CreateAdmin";
 //BA.debugLineNum = 26;BA.debugLine="database.Initialize(File.DirDefaultExternal,\"AppD";
_database.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),"AppDB.db",anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 27;BA.debugLine="database.ExecNonQuery(\"INSERT INTO Users (Usernam";
_database.ExecNonQuery("INSERT INTO Users (Username,Password,Money,Rank) VALUES ('admin','admin','0.00','Admin')");
 //BA.debugLineNum = 28;BA.debugLine="database.Close";
_database.Close();
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return "";
}
public static String  _createbet(anywheresoftware.b4a.BA _ba,String _teama,String _teamacoef,String _teamb,String _teambcoef,String _matchinfo) throws Exception{
 //BA.debugLineNum = 62;BA.debugLine="Public Sub CreateBet(teamA As String,teamAcoef As";
 //BA.debugLineNum = 63;BA.debugLine="database.Initialize(File.DirDefaultExternal,\"AppD";
_database.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),"AppDB.db",anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 64;BA.debugLine="database.ExecNonQuery(\"INSERT INTO Bets (TeamA,Te";
_database.ExecNonQuery("INSERT INTO Bets (TeamA,TeamAcoef,TeamB,TeamBcoef,MatchInfo) VALUES ('"+_teama+"','"+_teamacoef+"','"+_teamb+"','"+_teambcoef+"','"+_matchinfo+"')");
 //BA.debugLineNum = 65;BA.debugLine="database.Close";
_database.Close();
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return "";
}
public static String  _databasecreateuser(anywheresoftware.b4a.BA _ba,String _username,String _password) throws Exception{
 //BA.debugLineNum = 19;BA.debugLine="Public Sub DataBaseCreateUser(username As String,p";
 //BA.debugLineNum = 20;BA.debugLine="database.Initialize(File.DirDefaultExternal,\"AppD";
_database.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),"AppDB.db",anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 21;BA.debugLine="database.ExecNonQuery(\"INSERT INTO Users (Usernam";
_database.ExecNonQuery("INSERT INTO Users (Username,Password,Money,Rank) VALUES ('"+_username+"','"+_password+"','0.00','user')");
 //BA.debugLineNum = 22;BA.debugLine="database.Close";
_database.Close();
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return "";
}
public static String  _databaseinit(anywheresoftware.b4a.BA _ba) throws Exception{
 //BA.debugLineNum = 10;BA.debugLine="Public Sub DATABASEinit";
 //BA.debugLineNum = 11;BA.debugLine="database.Initialize(File.DirDefaultExternal,\"AppD";
_database.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),"AppDB.db",anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 6;BA.debugLine="Public database As SQL";
_database = new anywheresoftware.b4a.sql.SQL();
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
public static String  _tablescreate(anywheresoftware.b4a.BA _ba) throws Exception{
 //BA.debugLineNum = 14;BA.debugLine="Public Sub TablesCreate";
 //BA.debugLineNum = 15;BA.debugLine="database.ExecNonQuery(\"CREATE TABLE Users (Userna";
_database.ExecNonQuery("CREATE TABLE Users (Username TEXT,Password TEXT,Money DOUBLE,Rank TEXT,TypeOfUser INTEGER)");
 //BA.debugLineNum = 16;BA.debugLine="database.ExecNonQuery(\"CREATE TABLE Bets (ID INTE";
_database.ExecNonQuery("CREATE TABLE Bets (ID INTEGER PRIMARY KEY AUTOINCREMENT,TeamA TEXT,TeamAcoef TEXT,TeamB TEXT,TeamBcoef TEXT,MatchInfo TEXT)");
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return "";
}
public static String  _usersetmoney(anywheresoftware.b4a.BA _ba,double _money,String _username) throws Exception{
 //BA.debugLineNum = 56;BA.debugLine="Public Sub UserSetMoney(money As Double,username A";
 //BA.debugLineNum = 57;BA.debugLine="database.Initialize(File.DirDefaultExternal,\"AppD";
_database.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),"AppDB.db",anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 58;BA.debugLine="database.ExecNonQuery(\"UPDATE  Users SET Money =";
_database.ExecNonQuery("UPDATE  Users SET Money = '"+BA.NumberToString(_money)+"' WHERE Username = '"+_username+"'");
 //BA.debugLineNum = 59;BA.debugLine="database.Close";
_database.Close();
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return "";
}
public static String  _usersetrank(anywheresoftware.b4a.BA _ba,String _rank,String _username) throws Exception{
 //BA.debugLineNum = 68;BA.debugLine="Public Sub UserSetRank(rank As String,username As";
 //BA.debugLineNum = 69;BA.debugLine="database.Initialize(File.DirDefaultExternal,\"AppD";
_database.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),"AppDB.db",anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 70;BA.debugLine="database.ExecNonQuery(\"UPDATE  Users SET Rank = '";
_database.ExecNonQuery("UPDATE  Users SET Rank = '"+_rank+"' WHERE Username = '"+_username+"'");
 //BA.debugLineNum = 71;BA.debugLine="database.Close";
_database.Close();
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return "";
}
public static String  _validateuser(anywheresoftware.b4a.BA _ba,String _username,String _password) throws Exception{
anywheresoftware.b4a.sql.SQL.CursorWrapper _cursor = null;
int _i = 0;
 //BA.debugLineNum = 31;BA.debugLine="Public Sub ValidateUser(username As String,passwor";
 //BA.debugLineNum = 32;BA.debugLine="database.Initialize(File.DirDefaultExternal,\"AppD";
_database.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),"AppDB.db",anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 33;BA.debugLine="Dim cursor As Cursor";
_cursor = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
 //BA.debugLineNum = 34;BA.debugLine="cursor = database.ExecQuery(\"SELECT Username, Pas";
_cursor.setObject((android.database.Cursor)(_database.ExecQuery("SELECT Username, Password, Money, Rank FROM Users")));
 //BA.debugLineNum = 35;BA.debugLine="For i = 0 To cursor.RowCount - 1";
{
final int step4 = 1;
final int limit4 = (int) (_cursor.getRowCount()-1);
_i = (int) (0) ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
 //BA.debugLineNum = 36;BA.debugLine="cursor.Position = i";
_cursor.setPosition(_i);
 //BA.debugLineNum = 37;BA.debugLine="If cursor.GetString(\"Username\") = username Then";
if ((_cursor.GetString("Username")).equals(_username)) { 
 //BA.debugLineNum = 38;BA.debugLine="If cursor.GetString(\"Password\") = password Then";
if ((_cursor.GetString("Password")).equals(_password)) { 
 //BA.debugLineNum = 39;BA.debugLine="Types.currentuser.name = username";
mostCurrent._types._currentuser.name = _username;
 //BA.debugLineNum = 40;BA.debugLine="Types.currentuser.money = cursor.GetDouble(\"Mo";
mostCurrent._types._currentuser.money = _cursor.GetDouble("Money");
 //BA.debugLineNum = 41;BA.debugLine="Types.currentuser.rank = cursor.GetString(\"Ran";
mostCurrent._types._currentuser.rank = _cursor.GetString("Rank");
 //BA.debugLineNum = 42;BA.debugLine="ToastMessageShow(\"Login Successful!\",False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Login Successful!"),anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 43;BA.debugLine="CallSub(Main,\"BuildInterface\")";
anywheresoftware.b4a.keywords.Common.CallSubNew((_ba.processBA == null ? _ba : _ba.processBA),(Object)(mostCurrent._main.getObject()),"BuildInterface");
 //BA.debugLineNum = 44;BA.debugLine="CallSub(Main,\"ShowHideMainUI\")";
anywheresoftware.b4a.keywords.Common.CallSubNew((_ba.processBA == null ? _ba : _ba.processBA),(Object)(mostCurrent._main.getObject()),"ShowHideMainUI");
 }else {
 //BA.debugLineNum = 46;BA.debugLine="ToastMessageShow(\"Wrong password!\",False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Wrong password!"),anywheresoftware.b4a.keywords.Common.False);
 };
 }else {
 //BA.debugLineNum = 49;BA.debugLine="ToastMessageShow(\"Wrong username!\",False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Wrong username!"),anywheresoftware.b4a.keywords.Common.False);
 };
 }
};
 //BA.debugLineNum = 52;BA.debugLine="cursor.Close";
_cursor.Close();
 //BA.debugLineNum = 53;BA.debugLine="database.Close";
_database.Close();
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return "";
}
}
