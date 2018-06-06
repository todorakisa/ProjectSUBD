
package b4a.example;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class main implements IRemote{
	public static main mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public main() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
	public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("main"), "b4a.example.main");
	}

public boolean isSingleton() {
		return true;
	}
     public static RemoteObject getObject() {
		return myClass;
	 }

	public RemoteObject activityBA;
	public RemoteObject _activity;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
		activityBA = (RemoteObject) args[2];
		_activity = (RemoteObject) args[3];
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[4];
        remoteMe = (RemoteObject) args[5];
		pcBA = new PCBA(this, main.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _database = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL");
public static RemoteObject _database1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL");
public static RemoteObject _currentuser = RemoteObject.declareNull("b4a.example.types._user");
public static RemoteObject _admin = RemoteObject.declareNull("b4a.example.types._masteradmin");
public static RemoteObject _registerscreen = RemoteObject.declareNull("b4a.example.register");
public static RemoteObject _gotologinscr = RemoteObject.declareNull("b4a.example.login");
public static RemoteObject _appmainscreen = RemoteObject.declareNull("b4a.example.appmaininterface");
public static RemoteObject _admininterface1 = RemoteObject.declareNull("b4a.example.admininterface");
public static RemoteObject _loginscr = RemoteObject.declareNull("b4a.example.login");
public static RemoteObject _bets_popup = RemoteObject.declareNull("b4a.example.betpopup");
public static RemoteObject _rankupdate = RemoteObject.declareNull("b4a.example.promote");
public static RemoteObject _slotgame1 = RemoteObject.declareNull("b4a.example.slotgame");
public static b4a.example.helperfunctions _helperfunctions = null;
public static b4a.example.types _types = null;
public static b4a.example.starter _starter = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",main.mostCurrent._activity,"admin",main._admin,"admininterface1",main.mostCurrent._admininterface1,"appmainscreen",main.mostCurrent._appmainscreen,"bets_popup",main.mostCurrent._bets_popup,"currentuser",main._currentuser,"database",main._database,"database1",main._database1,"gotologinscr",main.mostCurrent._gotologinscr,"HelperFunctions",Debug.moduleToString(b4a.example.helperfunctions.class),"loginscr",main.mostCurrent._loginscr,"rankupdate",main.mostCurrent._rankupdate,"registerscreen",main.mostCurrent._registerscreen,"slotgame1",main.mostCurrent._slotgame1,"Starter",Debug.moduleToString(b4a.example.starter.class),"types",Debug.moduleToString(b4a.example.types.class)};
}
}