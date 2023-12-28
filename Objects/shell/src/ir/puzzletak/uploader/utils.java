
package ir.puzzletak.uploader;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class utils implements IRemote{
	public static utils mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public utils() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
     private static PCBA pcBA = new PCBA(null, utils.class);
    static {
		mostCurrent = new utils();
        remoteMe = RemoteObject.declareNull("ir.puzzletak.uploader.utils");
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("utils"), "ir.puzzletak.uploader.utils");
        RDebug.INSTANCE.eventTargets.put(new DeviceClass("ir.puzzletak.uploader.utils"), new java.lang.ref.WeakReference<PCBA> (pcBA));
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
public static ir.puzzletak.uploader.main _main = null;
public static ir.puzzletak.uploader.starter _starter = null;
  public Object[] GetGlobals() {
		return new Object[] {"Main",Debug.moduleToString(ir.puzzletak.uploader.main.class),"Starter",Debug.moduleToString(ir.puzzletak.uploader.starter.class)};
}
}