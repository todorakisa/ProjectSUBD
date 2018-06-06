
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

public class helperfunctions implements IRemote{
	public static helperfunctions mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public helperfunctions() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
     private static PCBA pcBA = new PCBA(null, helperfunctions.class);
    static {
		mostCurrent = new helperfunctions();
        remoteMe = RemoteObject.declareNull("b4a.example.helperfunctions");
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("helperfunctions"), "b4a.example.helperfunctions");
        RDebug.INSTANCE.eventTargets.put(new DeviceClass("b4a.example.helperfunctions"), new java.lang.ref.WeakReference<PCBA> (pcBA));
	}
   
	public static RemoteObject runMethod(boolean notUsed, String method, Object... args) throws Exception{
		return (RemoteObject) pcBA.raiseEvent(method.substring(1), args);
	}
    public static void runVoidMethod(String method, Object... args) throws Exception{
		runMethod(false, method, args);
	}
	public PCBA create(Object[] args) throws ClassNotFoundException{
        throw new RuntimeException("CREATE is not supported.");
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _shareprice = RemoteObject.createImmutable("");
public static b4a.example.main _main = null;
public static b4a.example.types _types = null;
public static b4a.example.starter _starter = null;
  public Object[] GetGlobals() {
		return new Object[] {"Main",Debug.moduleToString(b4a.example.main.class),"sharePrice",helperfunctions._shareprice,"Starter",Debug.moduleToString(b4a.example.starter.class),"types",Debug.moduleToString(b4a.example.types.class)};
}
}