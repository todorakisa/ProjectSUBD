package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,42);
if (RapidSub.canDelegate("activity_create")) return b4a.example.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);
RemoteObject _cursor = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 42;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(512);
 BA.debugLineNum = 44;BA.debugLine="registerscreen.Initialize";
Debug.ShouldStop(2048);
main.mostCurrent._registerscreen.runClassMethod (b4a.example.register.class, "_initialize",main.mostCurrent.activityBA);
 BA.debugLineNum = 45;BA.debugLine="gotologinscr.Initialize";
Debug.ShouldStop(4096);
main.mostCurrent._gotologinscr.runClassMethod (b4a.example.login.class, "_initialize",main.mostCurrent.activityBA);
 BA.debugLineNum = 46;BA.debugLine="admin.Initialize";
Debug.ShouldStop(8192);
main._admin.runVoidMethod ("Initialize");
 BA.debugLineNum = 47;BA.debugLine="currentuser.Initialize";
Debug.ShouldStop(16384);
main._currentuser.runVoidMethod ("Initialize");
 BA.debugLineNum = 48;BA.debugLine="appmainscreen.Initialize";
Debug.ShouldStop(32768);
main.mostCurrent._appmainscreen.runClassMethod (b4a.example.appmaininterface.class, "_initialize",main.mostCurrent.activityBA);
 BA.debugLineNum = 50;BA.debugLine="DATABASEinit";
Debug.ShouldStop(131072);
_databaseinit();
 BA.debugLineNum = 51;BA.debugLine="If File.Exists(File.DirDefaultExternal,\"userdatab";
Debug.ShouldStop(262144);
if (main.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(RemoteObject.createImmutable("userdatabase.db"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 52;BA.debugLine="Try";
Debug.ShouldStop(524288);
try { BA.debugLineNum = 53;BA.debugLine="Dim cursor As Cursor";
Debug.ShouldStop(1048576);
_cursor = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("cursor", _cursor);
 BA.debugLineNum = 54;BA.debugLine="cursor = database.ExecQuery(\"SELECT Username FR";
Debug.ShouldStop(2097152);
_cursor.setObject(main._database.runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT Username FROM Users"))));
 BA.debugLineNum = 55;BA.debugLine="If cursor.RowCount > 0 Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean(">",_cursor.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 56;BA.debugLine="Log(\"Super\")";
Debug.ShouldStop(8388608);
main.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("Super")));
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e15) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.processBA, e15.toString()); BA.debugLineNum = 59;BA.debugLine="TablesCreate";
Debug.ShouldStop(67108864);
_tablescreate();
 BA.debugLineNum = 60;BA.debugLine="CreateAdmin";
Debug.ShouldStop(134217728);
_createadmin();
 BA.debugLineNum = 61;BA.debugLine="Log(LastException)";
Debug.ShouldStop(268435456);
main.mostCurrent.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(main.mostCurrent.__c.runMethod(false,"LastException",main.mostCurrent.activityBA))));
 };
 };
 BA.debugLineNum = 64;BA.debugLine="cursor.Close";
Debug.ShouldStop(-2147483648);
_cursor.runVoidMethod ("Close");
 BA.debugLineNum = 65;BA.debugLine="Activity.AddView(registerscreen.AsView,0,0,100%x,";
Debug.ShouldStop(1);
main.mostCurrent._activity.runVoidMethod ("AddView",(Object)((main.mostCurrent._registerscreen.runClassMethod (b4a.example.register.class, "_asview").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 66;BA.debugLine="Activity.AddView(gotologinscr.AsView,0,0,100%x,10";
Debug.ShouldStop(2);
main.mostCurrent._activity.runVoidMethod ("AddView",(Object)((main.mostCurrent._gotologinscr.runClassMethod (b4a.example.login.class, "_asview").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 67;BA.debugLine="Activity.AddView(appmainscreen.AsView,0,0,100%x,1";
Debug.ShouldStop(4);
main.mostCurrent._activity.runVoidMethod ("AddView",(Object)((main.mostCurrent._appmainscreen.runClassMethod (b4a.example.appmaininterface.class, "_asview").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 68;BA.debugLine="gotologinscr.AsView.Visible = False";
Debug.ShouldStop(8);
main.mostCurrent._gotologinscr.runClassMethod (b4a.example.login.class, "_asview").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 69;BA.debugLine="appmainscreen.AsView.Visible = False";
Debug.ShouldStop(16);
main.mostCurrent._appmainscreen.runClassMethod (b4a.example.appmaininterface.class, "_asview").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 71;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,106);
if (RapidSub.canDelegate("activity_pause")) return b4a.example.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 106;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(512);
 BA.debugLineNum = 108;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,102);
if (RapidSub.canDelegate("activity_resume")) return b4a.example.main.remoteMe.runUserSub(false, "main","activity_resume");
 BA.debugLineNum = 102;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(32);
 BA.debugLineNum = 104;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buildadmininterface() throws Exception{
try {
		Debug.PushSubsStack("BuildAdminInterface (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,129);
if (RapidSub.canDelegate("buildadmininterface")) return b4a.example.main.remoteMe.runUserSub(false, "main","buildadmininterface");
 BA.debugLineNum = 129;BA.debugLine="Public Sub BuildAdminInterface";
Debug.ShouldStop(1);
 BA.debugLineNum = 130;BA.debugLine="admininterface1.Initialize";
Debug.ShouldStop(2);
main.mostCurrent._admininterface1.runClassMethod (b4a.example.admininterface.class, "_initialize",main.mostCurrent.activityBA);
 BA.debugLineNum = 131;BA.debugLine="Activity.AddView(admininterface1.pnlmainscreen,0,";
Debug.ShouldStop(4);
main.mostCurrent._activity.runVoidMethod ("AddView",(Object)((main.mostCurrent._admininterface1.getField(false,"_pnlmainscreen").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 132;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buildpopupscreen() throws Exception{
try {
		Debug.PushSubsStack("BuildPopUpScreen (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,169);
if (RapidSub.canDelegate("buildpopupscreen")) return b4a.example.main.remoteMe.runUserSub(false, "main","buildpopupscreen");
 BA.debugLineNum = 169;BA.debugLine="Public Sub BuildPopUpScreen";
Debug.ShouldStop(256);
 BA.debugLineNum = 170;BA.debugLine="If bets_popup.IsInitialized = False Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",main.mostCurrent._bets_popup.runMethod(true,"IsInitialized"),main.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 171;BA.debugLine="bets_popup.Initialize";
Debug.ShouldStop(1024);
main.mostCurrent._bets_popup.runClassMethod (b4a.example.betpopup.class, "_initialize",main.mostCurrent.activityBA);
 BA.debugLineNum = 172;BA.debugLine="Activity.AddView(bets_popup.background,0,0,100%x,";
Debug.ShouldStop(2048);
main.mostCurrent._activity.runVoidMethod ("AddView",(Object)((main.mostCurrent._bets_popup.getField(false,"_background").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 173;BA.debugLine="bets_popup.background.Visible = False";
Debug.ShouldStop(4096);
main.mostCurrent._bets_popup.getField(false,"_background").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 175;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buildpromotebar() throws Exception{
try {
		Debug.PushSubsStack("BuildPromoteBar (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,161);
if (RapidSub.canDelegate("buildpromotebar")) return b4a.example.main.remoteMe.runUserSub(false, "main","buildpromotebar");
 BA.debugLineNum = 161;BA.debugLine="Public Sub BuildPromoteBar";
Debug.ShouldStop(1);
 BA.debugLineNum = 162;BA.debugLine="If rankupdate.IsInitialized = False Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",main.mostCurrent._rankupdate.runMethod(true,"IsInitialized"),main.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 163;BA.debugLine="rankupdate.Initialize";
Debug.ShouldStop(4);
main.mostCurrent._rankupdate.runClassMethod (b4a.example.promote.class, "_initialize",main.mostCurrent.activityBA);
 BA.debugLineNum = 164;BA.debugLine="Activity.AddView(rankupdate.background,0,0,100%x";
Debug.ShouldStop(8);
main.mostCurrent._activity.runVoidMethod ("AddView",(Object)((main.mostCurrent._rankupdate.getField(false,"_background").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 165;BA.debugLine="rankupdate.background.Visible = False";
Debug.ShouldStop(16);
main.mostCurrent._rankupdate.getField(false,"_background").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 167;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createadmin() throws Exception{
try {
		Debug.PushSubsStack("CreateAdmin (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,83);
if (RapidSub.canDelegate("createadmin")) return b4a.example.main.remoteMe.runUserSub(false, "main","createadmin");
 BA.debugLineNum = 83;BA.debugLine="Sub CreateAdmin";
Debug.ShouldStop(262144);
 BA.debugLineNum = 84;BA.debugLine="database.ExecNonQuery(\"INSERT INTO Users (Usernam";
Debug.ShouldStop(524288);
main._database.runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("INSERT INTO Users (Username,Password,Money,Rank) VALUES ('admin','admin','0.00','Admin')")));
 BA.debugLineNum = 85;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _databaseaddinfo(RemoteObject _username,RemoteObject _password) throws Exception{
try {
		Debug.PushSubsStack("DataBaseAddInfo (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,97);
if (RapidSub.canDelegate("databaseaddinfo")) return b4a.example.main.remoteMe.runUserSub(false, "main","databaseaddinfo", _username, _password);
Debug.locals.put("username", _username);
Debug.locals.put("password", _password);
 BA.debugLineNum = 97;BA.debugLine="Sub DataBaseAddInfo(username As String,password As";
Debug.ShouldStop(1);
 BA.debugLineNum = 98;BA.debugLine="database.ExecNonQuery(\"INSERT INTO Users (Usernam";
Debug.ShouldStop(2);
main._database.runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("INSERT INTO Users (Username,Password,Money,Rank) VALUES ('"),_username,RemoteObject.createImmutable("','"),_password,RemoteObject.createImmutable("','0.00','user')"))));
 BA.debugLineNum = 99;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _databaseinit() throws Exception{
try {
		Debug.PushSubsStack("DATABASEinit (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,87);
if (RapidSub.canDelegate("databaseinit")) return b4a.example.main.remoteMe.runUserSub(false, "main","databaseinit");
 BA.debugLineNum = 87;BA.debugLine="Sub DATABASEinit";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 88;BA.debugLine="database.Initialize(File.DirDefaultExternal,\"user";
Debug.ShouldStop(8388608);
main._database.runVoidMethod ("Initialize",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(BA.ObjectToString("userdatabase.db")),(Object)(main.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 89;BA.debugLine="database1.Initialize(File.DirDefaultExternal,\"bet";
Debug.ShouldStop(16777216);
main._database1.runVoidMethod ("Initialize",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(BA.ObjectToString("bets_database.db")),(Object)(main.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 90;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _depositwithdrawmoney(RemoteObject _money) throws Exception{
try {
		Debug.PushSubsStack("DepositWithdrawMoney (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,141);
if (RapidSub.canDelegate("depositwithdrawmoney")) return b4a.example.main.remoteMe.runUserSub(false, "main","depositwithdrawmoney", _money);
Debug.locals.put("money", _money);
 BA.debugLineNum = 141;BA.debugLine="Public Sub DepositWithdrawMoney(money As Double)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 142;BA.debugLine="appmainscreen.accountbalance.Text = money";
Debug.ShouldStop(8192);
main.mostCurrent._appmainscreen.getField(false,"_accountbalance").runMethod(true,"setText",BA.ObjectToCharSequence(_money));
 BA.debugLineNum = 143;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _get_loginscrn() throws Exception{
try {
		Debug.PushSubsStack("Get_loginscrn (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,134);
if (RapidSub.canDelegate("get_loginscrn")) return b4a.example.main.remoteMe.runUserSub(false, "main","get_loginscrn");
 BA.debugLineNum = 134;BA.debugLine="Public Sub Get_loginscrn As login";
Debug.ShouldStop(32);
 BA.debugLineNum = 135;BA.debugLine="Return loginscr";
Debug.ShouldStop(64);
if (true) return main.mostCurrent._loginscr;
 BA.debugLineNum = 136;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 24;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 28;BA.debugLine="Dim registerscreen As Register";
main.mostCurrent._registerscreen = RemoteObject.createNew ("b4a.example.register");
 //BA.debugLineNum = 29;BA.debugLine="Dim gotologinscr As login";
main.mostCurrent._gotologinscr = RemoteObject.createNew ("b4a.example.login");
 //BA.debugLineNum = 31;BA.debugLine="Dim appmainscreen As appmaininterface";
main.mostCurrent._appmainscreen = RemoteObject.createNew ("b4a.example.appmaininterface");
 //BA.debugLineNum = 32;BA.debugLine="Dim admininterface1 As admininterface";
main.mostCurrent._admininterface1 = RemoteObject.createNew ("b4a.example.admininterface");
 //BA.debugLineNum = 33;BA.debugLine="Public loginscr As login";
main.mostCurrent._loginscr = RemoteObject.createNew ("b4a.example.login");
 //BA.debugLineNum = 34;BA.debugLine="Dim bets_popup As betpopup";
main.mostCurrent._bets_popup = RemoteObject.createNew ("b4a.example.betpopup");
 //BA.debugLineNum = 35;BA.debugLine="Dim rankupdate As Promote";
main.mostCurrent._rankupdate = RemoteObject.createNew ("b4a.example.promote");
 //BA.debugLineNum = 36;BA.debugLine="Dim slotgame1 As slotgame";
main.mostCurrent._slotgame1 = RemoteObject.createNew ("b4a.example.slotgame");
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _logintoadminapp() throws Exception{
try {
		Debug.PushSubsStack("LoginToAdminApp (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,124);
if (RapidSub.canDelegate("logintoadminapp")) return b4a.example.main.remoteMe.runUserSub(false, "main","logintoadminapp");
 BA.debugLineNum = 124;BA.debugLine="Public Sub LoginToAdminApp";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 125;BA.debugLine="gotologinscr.pnlmainscreen.Visible = False";
Debug.ShouldStop(268435456);
main.mostCurrent._gotologinscr.getField(false,"_pnlmainscreen").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 126;BA.debugLine="admininterface1.pnlmainscreen.Visible = True";
Debug.ShouldStop(536870912);
main.mostCurrent._admininterface1.getField(false,"_pnlmainscreen").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 127;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _logoutadminui() throws Exception{
try {
		Debug.PushSubsStack("LogOUTadminUI (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,110);
if (RapidSub.canDelegate("logoutadminui")) return b4a.example.main.remoteMe.runUserSub(false, "main","logoutadminui");
 BA.debugLineNum = 110;BA.debugLine="Sub LogOUTadminUI";
Debug.ShouldStop(8192);
 BA.debugLineNum = 111;BA.debugLine="admininterface1.pnlmainscreen.Visible = False";
Debug.ShouldStop(16384);
main.mostCurrent._admininterface1.getField(false,"_pnlmainscreen").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 112;BA.debugLine="gotologinscr.pnlmainscreen.Visible = True";
Debug.ShouldStop(32768);
main.mostCurrent._gotologinscr.getField(false,"_pnlmainscreen").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 113;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
helperfunctions_subs_0._process_globals();
types_subs_0._process_globals();
starter_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4a.example.main");
appmaininterface.myClass = BA.getDeviceClass ("b4a.example.appmaininterface");
useractions.myClass = BA.getDeviceClass ("b4a.example.useractions");
adminactions.myClass = BA.getDeviceClass ("b4a.example.adminactions");
login.myClass = BA.getDeviceClass ("b4a.example.login");
betpopup.myClass = BA.getDeviceClass ("b4a.example.betpopup");
helperfunctions.myClass = BA.getDeviceClass ("b4a.example.helperfunctions");
register.myClass = BA.getDeviceClass ("b4a.example.register");
types.myClass = BA.getDeviceClass ("b4a.example.types");
starter.myClass = BA.getDeviceClass ("b4a.example.starter");
admininterface.myClass = BA.getDeviceClass ("b4a.example.admininterface");
promote.myClass = BA.getDeviceClass ("b4a.example.promote");
slotgame.myClass = BA.getDeviceClass ("b4a.example.slotgame");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 18;BA.debugLine="Public database As SQL";
main._database = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL");
 //BA.debugLineNum = 19;BA.debugLine="Public database1 As SQL";
main._database1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL");
 //BA.debugLineNum = 20;BA.debugLine="Public currentuser As user";
main._currentuser = RemoteObject.createNew ("b4a.example.types._user");
 //BA.debugLineNum = 21;BA.debugLine="Public admin As masteradmin";
main._admin = RemoteObject.createNew ("b4a.example.types._masteradmin");
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _showbetspopup() throws Exception{
try {
		Debug.PushSubsStack("ShowBetsPopUp (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,145);
if (RapidSub.canDelegate("showbetspopup")) return b4a.example.main.remoteMe.runUserSub(false, "main","showbetspopup");
 BA.debugLineNum = 145;BA.debugLine="Public Sub ShowBetsPopUp";
Debug.ShouldStop(65536);
 BA.debugLineNum = 146;BA.debugLine="If bets_popup.background.Visible = False Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",main.mostCurrent._bets_popup.getField(false,"_background").runMethod(true,"getVisible"),main.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 147;BA.debugLine="bets_popup.background.Visible = True";
Debug.ShouldStop(262144);
main.mostCurrent._bets_popup.getField(false,"_background").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 149;BA.debugLine="bets_popup.background.Visible = False";
Debug.ShouldStop(1048576);
main.mostCurrent._bets_popup.getField(false,"_background").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 151;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _showhideloginscreen() throws Exception{
try {
		Debug.PushSubsStack("ShowHideLoginScreen (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,73);
if (RapidSub.canDelegate("showhideloginscreen")) return b4a.example.main.remoteMe.runUserSub(false, "main","showhideloginscreen");
 BA.debugLineNum = 73;BA.debugLine="Sub ShowHideLoginScreen";
Debug.ShouldStop(256);
 BA.debugLineNum = 74;BA.debugLine="If 	gotologinscr.AsView.Visible = False Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",main.mostCurrent._gotologinscr.runClassMethod (b4a.example.login.class, "_asview").runMethod(true,"getVisible"),main.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 75;BA.debugLine="gotologinscr.AsView.Visible = True";
Debug.ShouldStop(1024);
main.mostCurrent._gotologinscr.runClassMethod (b4a.example.login.class, "_asview").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 79;BA.debugLine="gotologinscr.AsView.Visible = False";
Debug.ShouldStop(16384);
main.mostCurrent._gotologinscr.runClassMethod (b4a.example.login.class, "_asview").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 81;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _showhidemainui() throws Exception{
try {
		Debug.PushSubsStack("ShowHideMainUI (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,116);
if (RapidSub.canDelegate("showhidemainui")) return b4a.example.main.remoteMe.runUserSub(false, "main","showhidemainui");
 BA.debugLineNum = 116;BA.debugLine="Sub ShowHideMainUI";
Debug.ShouldStop(524288);
 BA.debugLineNum = 117;BA.debugLine="If appmainscreen.AsView.Visible = False Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",main.mostCurrent._appmainscreen.runClassMethod (b4a.example.appmaininterface.class, "_asview").runMethod(true,"getVisible"),main.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 118;BA.debugLine="appmainscreen.AsView.Visible = True";
Debug.ShouldStop(2097152);
main.mostCurrent._appmainscreen.runClassMethod (b4a.example.appmaininterface.class, "_asview").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 120;BA.debugLine="appmainscreen.AsView.Visible = False";
Debug.ShouldStop(8388608);
main.mostCurrent._appmainscreen.runClassMethod (b4a.example.appmaininterface.class, "_asview").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 122;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _showhideslotgame() throws Exception{
try {
		Debug.PushSubsStack("ShowHideSlotGame (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,177);
if (RapidSub.canDelegate("showhideslotgame")) return b4a.example.main.remoteMe.runUserSub(false, "main","showhideslotgame");
 BA.debugLineNum = 177;BA.debugLine="Public Sub ShowHideSlotGame";
Debug.ShouldStop(65536);
 BA.debugLineNum = 178;BA.debugLine="If slotgame1.IsInitialized = False Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",main.mostCurrent._slotgame1.runMethod(true,"IsInitialized"),main.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 179;BA.debugLine="slotgame1.Initialize";
Debug.ShouldStop(262144);
main.mostCurrent._slotgame1.runClassMethod (b4a.example.slotgame.class, "_initialize",main.mostCurrent.activityBA);
 BA.debugLineNum = 180;BA.debugLine="Activity.AddView(slotgame1.pnlmain,20%x - 5dip,0%";
Debug.ShouldStop(524288);
main.mostCurrent._activity.runVoidMethod ("AddView",(Object)((main.mostCurrent._slotgame1.getField(false,"_pnlmain").getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 20)),main.mostCurrent.activityBA),main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))}, "-",1, 1)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 0)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 82)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 181;BA.debugLine="slotgame1.pnlmain.Visible = False";
Debug.ShouldStop(1048576);
main.mostCurrent._slotgame1.getField(false,"_pnlmain").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 184;BA.debugLine="If slotgame1.pnlmain.Visible = False Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",main.mostCurrent._slotgame1.getField(false,"_pnlmain").runMethod(true,"getVisible"),main.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 185;BA.debugLine="slotgame1.pnlmain.Visible = True";
Debug.ShouldStop(16777216);
main.mostCurrent._slotgame1.getField(false,"_pnlmain").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 187;BA.debugLine="slotgame1.pnlmain.Visible = False";
Debug.ShouldStop(67108864);
main.mostCurrent._slotgame1.getField(false,"_pnlmain").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 190;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _showrankupdate() throws Exception{
try {
		Debug.PushSubsStack("ShowRankUpdate (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,153);
if (RapidSub.canDelegate("showrankupdate")) return b4a.example.main.remoteMe.runUserSub(false, "main","showrankupdate");
 BA.debugLineNum = 153;BA.debugLine="Public Sub ShowRankUpdate";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 154;BA.debugLine="If rankupdate.background.Visible = False Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",main.mostCurrent._rankupdate.getField(false,"_background").runMethod(true,"getVisible"),main.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 155;BA.debugLine="rankupdate.background.Visible = True";
Debug.ShouldStop(67108864);
main.mostCurrent._rankupdate.getField(false,"_background").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 157;BA.debugLine="rankupdate.background.Visible = False";
Debug.ShouldStop(268435456);
main.mostCurrent._rankupdate.getField(false,"_background").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 159;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tablescreate() throws Exception{
try {
		Debug.PushSubsStack("TablesCreate (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,92);
if (RapidSub.canDelegate("tablescreate")) return b4a.example.main.remoteMe.runUserSub(false, "main","tablescreate");
 BA.debugLineNum = 92;BA.debugLine="Sub TablesCreate";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 93;BA.debugLine="database.ExecNonQuery(\"CREATE TABLE Users (Userna";
Debug.ShouldStop(268435456);
main._database.runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("CREATE TABLE Users (Username TEXT,Password TEXT,Money DOUBLE,Rank TEXT,TypeOfUser INTEGER)")));
 BA.debugLineNum = 94;BA.debugLine="database1.ExecNonQuery(\"CREATE TABLE Bets (ID INT";
Debug.ShouldStop(536870912);
main._database1.runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("CREATE TABLE Bets (ID INTEGER PRIMARY KEY AUTOINCREMENT,TeamA TEXT,TeamAcoef TEXT,TeamB TEXT,TeamBcoef TEXT,MatchInfo TEXT)")));
 BA.debugLineNum = 95;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}