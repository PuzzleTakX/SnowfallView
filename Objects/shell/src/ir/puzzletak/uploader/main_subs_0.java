package ir.puzzletak.uploader;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,25);
if (RapidSub.canDelegate("activity_create")) { return ir.puzzletak.uploader.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);}
RemoteObject _pta = RemoteObject.declareNull("ir.puzzletak.snowfall.SnowfallWrapper");
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 25;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 26;BA.debugLine="Utils.SetStatusBarColor(Colors.White,Colors.White";
Debug.ShouldStop(33554432);
main.mostCurrent._utils.runVoidMethod ("_setstatusbarcolor" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(main.mostCurrent.__c.getField(false,"Colors").getField(true,"White")),(Object)(main.mostCurrent.__c.getField(false,"Colors").getField(true,"White")));
 BA.debugLineNum = 27;BA.debugLine="Activity.Color = Colors.Gray";
Debug.ShouldStop(67108864);
main.mostCurrent._activity.runVoidMethod ("setColor",main.mostCurrent.__c.getField(false,"Colors").getField(true,"Gray"));
 BA.debugLineNum = 29;BA.debugLine="Dim pta As PTX_SnowfallView";
Debug.ShouldStop(268435456);
_pta = RemoteObject.createNew ("ir.puzzletak.snowfall.SnowfallWrapper");Debug.locals.put("pta", _pta);
 BA.debugLineNum = 30;BA.debugLine="pta.Initialize(\"\")";
Debug.ShouldStop(536870912);
_pta.runVoidMethod ("Initialize",main.processBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 31;BA.debugLine="Activity.AddView(pta,0%x,0%x,100%x,100%y)";
Debug.ShouldStop(1073741824);
main.mostCurrent._activity.runVoidMethod ("AddView",(Object)((_pta.getObject())),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 0)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 0)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 32;BA.debugLine="pta.Color = Colors.Black";
Debug.ShouldStop(-2147483648);
_pta.runVoidMethod ("setColor",main.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 34;BA.debugLine="pta.EnableAlphaFade = True";
Debug.ShouldStop(2);
_pta.runVoidMethod ("setEnableAlphaFade",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 35;BA.debugLine="pta.EnableRandomCurving = True";
Debug.ShouldStop(4);
_pta.runVoidMethod ("setEnableRandomCurving",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 37;BA.debugLine="pta.AnimateDuration = 10000";
Debug.ShouldStop(16);
_pta.runVoidMethod ("setAnimateDuration",BA.numberCast(int.class, 10000));
 BA.debugLineNum = 38;BA.debugLine="pta.GenerateSnowTiming = 45";
Debug.ShouldStop(32);
_pta.runVoidMethod ("setGenerateSnowTiming",BA.numberCast(int.class, 45));
 BA.debugLineNum = 39;BA.debugLine="pta.ImageBitmap = LoadBitmap(File.DirAssets,\"snow";
Debug.ShouldStop(64);
_pta.runVoidMethod ("setImageBitmap",(main.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("snow.png"))).getObject()));
 BA.debugLineNum = 40;BA.debugLine="pta.setRandomSnowSizeRange(25,1)";
Debug.ShouldStop(128);
_pta.runVoidMethod ("setRandomSnowSizeRange",(Object)(BA.numberCast(int.class, 25)),(Object)(BA.numberCast(int.class, 1)));
 BA.debugLineNum = 41;BA.debugLine="pta.setCurvingRandom(180,90)";
Debug.ShouldStop(256);
_pta.runVoidMethod ("setCurvingRandom",(Object)(BA.numberCast(int.class, 180)),(Object)(BA.numberCast(int.class, 90)));
 BA.debugLineNum = 42;BA.debugLine="pta.init";
Debug.ShouldStop(512);
_pta.runVoidMethod ("init");
 BA.debugLineNum = 43;BA.debugLine="pta.startSnowing";
Debug.ShouldStop(1024);
_pta.runVoidMethod ("startSnowing");
 BA.debugLineNum = 46;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,52);
if (RapidSub.canDelegate("activity_pause")) { return ir.puzzletak.uploader.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 52;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 54;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,48);
if (RapidSub.canDelegate("activity_resume")) { return ir.puzzletak.uploader.main.remoteMe.runUserSub(false, "main","activity_resume");}
 BA.debugLineNum = 48;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(32768);
 BA.debugLineNum = 50;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 20;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
starter_subs_0._process_globals();
utils_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("ir.puzzletak.uploader.main");
starter.myClass = BA.getDeviceClass ("ir.puzzletak.uploader.starter");
utils.myClass = BA.getDeviceClass ("ir.puzzletak.uploader.utils");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 17;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}