package ir.puzzletak.uploader;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class utils_subs_0 {


public static RemoteObject  _background(RemoteObject _ba,RemoteObject _defaultcolor,RemoteObject _oldradius) throws Exception{
try {
		Debug.PushSubsStack("Background (utils) ","utils",2,_ba,utils.mostCurrent,97);
if (RapidSub.canDelegate("background")) { return ir.puzzletak.uploader.utils.remoteMe.runUserSub(false, "utils","background", _ba, _defaultcolor, _oldradius);}
RemoteObject _defaultcd = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
;
Debug.locals.put("DefaultColor", _defaultcolor);
Debug.locals.put("OldRadius", _oldradius);
 BA.debugLineNum = 97;BA.debugLine="Public Sub Background(DefaultColor As Int,OldRadiu";
Debug.ShouldStop(1);
 BA.debugLineNum = 98;BA.debugLine="Dim DefaultCD As ColorDrawable";
Debug.ShouldStop(2);
_defaultcd = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("DefaultCD", _defaultcd);
 BA.debugLineNum = 99;BA.debugLine="DefaultCD.Initialize(DefaultColor, OldRadius)";
Debug.ShouldStop(4);
_defaultcd.runVoidMethod ("Initialize",(Object)(_defaultcolor),(Object)(BA.numberCast(int.class, _oldradius)));
 BA.debugLineNum = 100;BA.debugLine="Return DefaultCD";
Debug.ShouldStop(8);
if (true) return _defaultcd;
 BA.debugLineNum = 101;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _backgroundgradint(RemoteObject _ba,RemoteObject _color,RemoteObject _oldradius) throws Exception{
try {
		Debug.PushSubsStack("BackgroundGradint (utils) ","utils",2,_ba,utils.mostCurrent,102);
if (RapidSub.canDelegate("backgroundgradint")) { return ir.puzzletak.uploader.utils.remoteMe.runUserSub(false, "utils","backgroundgradint", _ba, _color, _oldradius);}
RemoteObject _defaultcd = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.GradientDrawable");
;
Debug.locals.put("color", _color);
Debug.locals.put("OldRadius", _oldradius);
 BA.debugLineNum = 102;BA.debugLine="Public Sub BackgroundGradint(color() As Int,OldRad";
Debug.ShouldStop(32);
 BA.debugLineNum = 103;BA.debugLine="Dim DefaultCD As GradientDrawable";
Debug.ShouldStop(64);
_defaultcd = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.GradientDrawable");Debug.locals.put("DefaultCD", _defaultcd);
 BA.debugLineNum = 104;BA.debugLine="DefaultCD.Initialize(\"LEFT_RIGHT\",color)";
Debug.ShouldStop(128);
_defaultcd.runVoidMethod ("Initialize",(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.drawable.GradientDrawable.Orientation"),"LEFT_RIGHT")),(Object)(_color));
 BA.debugLineNum = 105;BA.debugLine="DefaultCD.CornerRadius = OldRadius";
Debug.ShouldStop(256);
_defaultcd.runVoidMethod ("setCornerRadius",_oldradius);
 BA.debugLineNum = 106;BA.debugLine="Return DefaultCD";
Debug.ShouldStop(512);
if (true) return _defaultcd;
 BA.debugLineNum = 107;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _drawable(RemoteObject _ba,RemoteObject _icon,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("Drawable (utils) ","utils",2,_ba,utils.mostCurrent,70);
if (RapidSub.canDelegate("drawable")) { return ir.puzzletak.uploader.utils.remoteMe.runUserSub(false, "utils","drawable", _ba, _icon, _color);}
RemoteObject _ac = RemoteObject.declareNull("de.amberhome.objects.appcompat.AppCompatBase");
RemoteObject _ax = RemoteObject.declareNull("anywheresoftware.b4a.object.XmlLayoutBuilder");
;
Debug.locals.put("icon", _icon);
Debug.locals.put("color", _color);
 BA.debugLineNum = 70;BA.debugLine="Public Sub Drawable(icon As String, color As Int)";
Debug.ShouldStop(32);
 BA.debugLineNum = 71;BA.debugLine="Dim ac As AppCompat";
Debug.ShouldStop(64);
_ac = RemoteObject.createNew ("de.amberhome.objects.appcompat.AppCompatBase");Debug.locals.put("ac", _ac);
 BA.debugLineNum = 72;BA.debugLine="Dim ax As XmlLayoutBuilder";
Debug.ShouldStop(128);
_ax = RemoteObject.createNew ("anywheresoftware.b4a.object.XmlLayoutBuilder");Debug.locals.put("ax", _ax);
 BA.debugLineNum = 73;BA.debugLine="ac.SetDrawableTint(ax.GetDrawable(icon),color)";
Debug.ShouldStop(256);
_ac.runVoidMethod ("SetDrawableTint",(Object)(_ax.runMethod(false,"GetDrawable",(Object)(_icon))),(Object)(_color));
 BA.debugLineNum = 74;BA.debugLine="Return ax.GetDrawable(icon)";
Debug.ShouldStop(512);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.ColorDrawable"), _ax.runMethod(false,"GetDrawable",(Object)(_icon)));
 BA.debugLineNum = 75;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getfileinfobyindex(RemoteObject _ba,RemoteObject _column,RemoteObject _uri) throws Exception{
try {
		Debug.PushSubsStack("GetFileInfoByIndex (utils) ","utils",2,_ba,utils.mostCurrent,113);
if (RapidSub.canDelegate("getfileinfobyindex")) { return ir.puzzletak.uploader.utils.remoteMe.runUserSub(false, "utils","getfileinfobyindex", _ba, _column, _uri);}
RemoteObject _results = RemoteObject.createImmutable("");
RemoteObject _cur = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _uri1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ContentResolverWrapper.UriWrapper");
RemoteObject _cr = RemoteObject.declareNull("anywheresoftware.b4a.objects.ContentResolverWrapper");
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _id = RemoteObject.createImmutable("");
;
Debug.locals.put("column", _column);
Debug.locals.put("uri", _uri);
 BA.debugLineNum = 113;BA.debugLine="public Sub GetFileInfoByIndex(column As String, ur";
Debug.ShouldStop(65536);
 BA.debugLineNum = 115;BA.debugLine="Dim results As String";
Debug.ShouldStop(262144);
_results = RemoteObject.createImmutable("");Debug.locals.put("results", _results);
 BA.debugLineNum = 116;BA.debugLine="Dim Cur As Cursor";
Debug.ShouldStop(524288);
_cur = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 117;BA.debugLine="Dim Uri1 As Uri";
Debug.ShouldStop(1048576);
_uri1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ContentResolverWrapper.UriWrapper");Debug.locals.put("Uri1", _uri1);
 BA.debugLineNum = 118;BA.debugLine="Dim cr As ContentResolver";
Debug.ShouldStop(2097152);
_cr = RemoteObject.createNew ("anywheresoftware.b4a.objects.ContentResolverWrapper");Debug.locals.put("cr", _cr);
 BA.debugLineNum = 119;BA.debugLine="cr.Initialize(\"\")";
Debug.ShouldStop(4194304);
_cr.runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 122;BA.debugLine="If uri.StartsWith(\"content://media/\") Then";
Debug.ShouldStop(33554432);
if (_uri.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("content://media/"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 123;BA.debugLine="Dim i As Int = uri.LastIndexOf(\"/\")";
Debug.ShouldStop(67108864);
_i = _uri.runMethod(true,"lastIndexOf",(Object)(RemoteObject.createImmutable("/")));Debug.locals.put("i", _i);Debug.locals.put("i", _i);
 BA.debugLineNum = 124;BA.debugLine="Dim id As String = uri.SubString(i + 1)";
Debug.ShouldStop(134217728);
_id = _uri.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "+",1, 1)));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 125;BA.debugLine="Uri1.Parse(uri)";
Debug.ShouldStop(268435456);
_uri1.runVoidMethod ("Parse",(Object)(_uri));
 BA.debugLineNum = 126;BA.debugLine="Cur = cr.Query(Uri1, Null, \"_id = ?\", Array As S";
Debug.ShouldStop(536870912);
_cur = _cr.runMethod(false,"Query",(Object)(_uri1),(Object)((utils.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.ObjectToString("_id = ?")),(Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {_id})),(Object)(BA.ObjectToString(utils.mostCurrent.__c.getField(false,"Null"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 127;BA.debugLine="Cur.Position = 0";
Debug.ShouldStop(1073741824);
_cur.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 128;BA.debugLine="If Cur.RowCount <> 0 Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("!",_cur.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 129;BA.debugLine="For i = 0 To Cur.ColumnCount - 1";
Debug.ShouldStop(1);
{
final int step13 = 1;
final int limit13 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step13 > 0 && _i.<Integer>get().intValue() <= limit13) || (step13 < 0 && _i.<Integer>get().intValue() >= limit13) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step13))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 130;BA.debugLine="If Cur.GetColumnName(i) <> Null Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("N",_cur.runMethod(true,"GetColumnName",(Object)(_i)))) { 
 BA.debugLineNum = 131;BA.debugLine="If Cur.GetColumnName(i) = column Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(_i)),_column)) { 
 BA.debugLineNum = 132;BA.debugLine="results = Cur.GetString2(i)";
Debug.ShouldStop(8);
_results = _cur.runMethod(true,"GetString2",(Object)(_i));Debug.locals.put("results", _results);
 BA.debugLineNum = 133;BA.debugLine="Exit";
Debug.ShouldStop(16);
if (true) break;
 };
 };
 }
}Debug.locals.put("i", _i);
;
 };
 }else {
 BA.debugLineNum = 139;BA.debugLine="Uri1.Parse(uri)";
Debug.ShouldStop(1024);
_uri1.runVoidMethod ("Parse",(Object)(_uri));
 BA.debugLineNum = 140;BA.debugLine="Cur = cr.Query(Uri1, Null, Null, Null, Null)";
Debug.ShouldStop(2048);
_cur = _cr.runMethod(false,"Query",(Object)(_uri1),(Object)((utils.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.ObjectToString(utils.mostCurrent.__c.getField(false,"Null"))),(Object)((utils.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.ObjectToString(utils.mostCurrent.__c.getField(false,"Null"))));Debug.locals.put("Cur", _cur);
 BA.debugLineNum = 141;BA.debugLine="Cur.Position = 0";
Debug.ShouldStop(4096);
_cur.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 142;BA.debugLine="If Cur.RowCount <> 0 Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("!",_cur.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 143;BA.debugLine="For i = 0 To Cur.ColumnCount - 1";
Debug.ShouldStop(16384);
{
final int step27 = 1;
final int limit27 = RemoteObject.solve(new RemoteObject[] {_cur.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step27 > 0 && _i.<Integer>get().intValue() <= limit27) || (step27 < 0 && _i.<Integer>get().intValue() >= limit27) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step27))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 144;BA.debugLine="If Cur.GetColumnName(i) <> Null Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("N",_cur.runMethod(true,"GetColumnName",(Object)(_i)))) { 
 BA.debugLineNum = 145;BA.debugLine="If Cur.GetColumnName(i) = column Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_cur.runMethod(true,"GetColumnName",(Object)(_i)),_column)) { 
 BA.debugLineNum = 146;BA.debugLine="results = Cur.GetString2(i)";
Debug.ShouldStop(131072);
_results = _cur.runMethod(true,"GetString2",(Object)(_i));Debug.locals.put("results", _results);
 BA.debugLineNum = 147;BA.debugLine="Exit";
Debug.ShouldStop(262144);
if (true) break;
 };
 };
 }
}Debug.locals.put("i", _i);
;
 };
 };
 BA.debugLineNum = 154;BA.debugLine="Cur.Close";
Debug.ShouldStop(33554432);
_cur.runVoidMethod ("Close");
 BA.debugLineNum = 156;BA.debugLine="Return results";
Debug.ShouldStop(134217728);
if (true) return _results;
 BA.debugLineNum = 158;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _imageicon(RemoteObject _ba,RemoteObject _icon,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("ImageIcon (utils) ","utils",2,_ba,utils.mostCurrent,77);
if (RapidSub.canDelegate("imageicon")) { return ir.puzzletak.uploader.utils.remoteMe.runUserSub(false, "utils","imageicon", _ba, _icon, _color);}
RemoteObject _ic = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
;
Debug.locals.put("icon", _icon);
Debug.locals.put("color", _color);
 BA.debugLineNum = 77;BA.debugLine="Public Sub ImageIcon(icon As String , color As Int";
Debug.ShouldStop(4096);
 BA.debugLineNum = 78;BA.debugLine="Dim ic As ImageView";
Debug.ShouldStop(8192);
_ic = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");Debug.locals.put("ic", _ic);
 BA.debugLineNum = 79;BA.debugLine="ic.Initialize(\"\")";
Debug.ShouldStop(16384);
_ic.runVoidMethod ("Initialize",_ba,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 80;BA.debugLine="ic.Background = Drawable(icon,color)";
Debug.ShouldStop(32768);
_ic.runMethod(false,"setBackground",(_drawable(_ba,_icon,_color).getObject()));
 BA.debugLineNum = 81;BA.debugLine="Return ic";
Debug.ShouldStop(65536);
if (true) return _ic;
 BA.debugLineNum = 82;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _parseuri(RemoteObject _ba,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("ParseUri (utils) ","utils",2,_ba,utils.mostCurrent,108);
if (RapidSub.canDelegate("parseuri")) { return ir.puzzletak.uploader.utils.remoteMe.runUserSub(false, "utils","parseuri", _ba, _filename);}
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
;
Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 108;BA.debugLine="Public Sub ParseUri(FileName As String) As Object";
Debug.ShouldStop(2048);
 BA.debugLineNum = 109;BA.debugLine="Dim r As Reflector";
Debug.ShouldStop(4096);
_r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("r", _r);
 BA.debugLineNum = 110;BA.debugLine="Return r.RunStaticMethod(\"android.net.Uri\", \"pars";
Debug.ShouldStop(8192);
if (true) return _r.runMethod(false,"RunStaticMethod",(Object)(BA.ObjectToString("android.net.Uri")),(Object)(BA.ObjectToString("parse")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_filename)})),(Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {RemoteObject.createImmutable("java.lang.String")})));
 BA.debugLineNum = 112;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _setripple(RemoteObject _ba,RemoteObject _viewholder,RemoteObject _defaultcolor,RemoteObject _ontouchcolor,RemoteObject _oldradius) throws Exception{
try {
		Debug.PushSubsStack("SetRipple (utils) ","utils",2,_ba,utils.mostCurrent,59);
if (RapidSub.canDelegate("setripple")) { return ir.puzzletak.uploader.utils.remoteMe.runUserSub(false, "utils","setripple", _ba, _viewholder, _defaultcolor, _ontouchcolor, _oldradius);}
RemoteObject _bripple = RemoteObject.declareNull("flm.b4a.rippledrawable.RippleDrawableWrapper");
RemoteObject _defaultcd = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
;
Debug.locals.put("ViewHolder", _viewholder);
Debug.locals.put("DefaultColor", _defaultcolor);
Debug.locals.put("OnTouchColor", _ontouchcolor);
Debug.locals.put("OldRadius", _oldradius);
 BA.debugLineNum = 59;BA.debugLine="Public Sub SetRipple (ViewHolder As View, DefaultC";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 61;BA.debugLine="Dim bRipple As RippleDrawable";
Debug.ShouldStop(268435456);
_bripple = RemoteObject.createNew ("flm.b4a.rippledrawable.RippleDrawableWrapper");Debug.locals.put("bRipple", _bripple);
 BA.debugLineNum = 62;BA.debugLine="Dim DefaultCD As ColorDrawable";
Debug.ShouldStop(536870912);
_defaultcd = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("DefaultCD", _defaultcd);
 BA.debugLineNum = 63;BA.debugLine="DefaultCD.Initialize(DefaultColor, OldRadius)";
Debug.ShouldStop(1073741824);
_defaultcd.runVoidMethod ("Initialize",(Object)(_defaultcolor),(Object)(BA.numberCast(int.class, _oldradius)));
 BA.debugLineNum = 64;BA.debugLine="bRipple.Initialize2(DefaultCD,OnTouchColor)";
Debug.ShouldStop(-2147483648);
_bripple.runVoidMethod ("Initialize2",(Object)((_defaultcd.getObject())),(Object)(_ontouchcolor));
 BA.debugLineNum = 65;BA.debugLine="ViewHolder.Background = bRipple.Drawable";
Debug.ShouldStop(1);
_viewholder.runMethod(false,"setBackground",(_bripple.runMethod(false,"getDrawable")));
 BA.debugLineNum = 67;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstatusbarcolor(RemoteObject _ba,RemoteObject _statuscolor,RemoteObject _navigatincolor) throws Exception{
try {
		Debug.PushSubsStack("SetStatusBarColor (utils) ","utils",2,_ba,utils.mostCurrent,9);
if (RapidSub.canDelegate("setstatusbarcolor")) { return ir.puzzletak.uploader.utils.remoteMe.runUserSub(false, "utils","setstatusbarcolor", _ba, _statuscolor, _navigatincolor);}
RemoteObject _pt1 = RemoteObject.declareNull("ir.puzzletak.stopcalllmusic.PuzzleTak_StopCallAndMusic");
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _window = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _view = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _navigationdarked = RemoteObject.createImmutable(false);
RemoteObject _statusdared = RemoteObject.createImmutable(false);
;
Debug.locals.put("StatusColor", _statuscolor);
Debug.locals.put("NavigatinColor", _navigatincolor);
 BA.debugLineNum = 9;BA.debugLine="Sub SetStatusBarColor(StatusColor As Int ,Navigati";
Debug.ShouldStop(256);
 BA.debugLineNum = 11;BA.debugLine="Dim pt1 As PuzzleTak_GetUrlSizeTime";
Debug.ShouldStop(1024);
_pt1 = RemoteObject.createNew ("ir.puzzletak.stopcalllmusic.PuzzleTak_StopCallAndMusic");Debug.locals.put("pt1", _pt1);
 BA.debugLineNum = 12;BA.debugLine="Dim jo As JavaObject";
Debug.ShouldStop(2048);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("jo", _jo);
 BA.debugLineNum = 13;BA.debugLine="jo.InitializeContext";
Debug.ShouldStop(4096);
_jo.runVoidMethod ("InitializeContext",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba));
 BA.debugLineNum = 14;BA.debugLine="Dim window As JavaObject = jo.RunMethodJO(\"getWi";
Debug.ShouldStop(8192);
_window = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_window = _jo.runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("getWindow")),(Object)((utils.mostCurrent.__c.getField(false,"Null"))));Debug.locals.put("window", _window);Debug.locals.put("window", _window);
 BA.debugLineNum = 15;BA.debugLine="window.RunMethod(\"addFlags\", Array (0x80000000))";
Debug.ShouldStop(16384);
_window.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("addFlags")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {RemoteObject.createImmutable((((int)0x80000000)))})));
 BA.debugLineNum = 16;BA.debugLine="window.RunMethod(\"clearFlags\", Array (0x04000000";
Debug.ShouldStop(32768);
_window.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("clearFlags")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {RemoteObject.createImmutable((((int)0x04000000)))})));
 BA.debugLineNum = 17;BA.debugLine="window.RunMethod(\"setNavigationBarColor\", Array(";
Debug.ShouldStop(65536);
_window.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setNavigationBarColor")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_navigatincolor)})));
 BA.debugLineNum = 18;BA.debugLine="window.RunMethod(\"setStatusBarColor\", Array(Stat";
Debug.ShouldStop(131072);
_window.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setStatusBarColor")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_statuscolor)})));
 BA.debugLineNum = 19;BA.debugLine="Dim view As JavaObject = window.RunMethodJO(\"get";
Debug.ShouldStop(262144);
_view = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_view = _window.runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("getDecorView")),(Object)((utils.mostCurrent.__c.getField(false,"Null"))));Debug.locals.put("view", _view);Debug.locals.put("view", _view);
 BA.debugLineNum = 21;BA.debugLine="Dim NavigationDarked As Boolean = False";
Debug.ShouldStop(1048576);
_navigationdarked = utils.mostCurrent.__c.getField(true,"False");Debug.locals.put("NavigationDarked", _navigationdarked);Debug.locals.put("NavigationDarked", _navigationdarked);
 BA.debugLineNum = 22;BA.debugLine="Dim StatusDared As Boolean = False";
Debug.ShouldStop(2097152);
_statusdared = utils.mostCurrent.__c.getField(true,"False");Debug.locals.put("StatusDared", _statusdared);Debug.locals.put("StatusDared", _statusdared);
 BA.debugLineNum = 36;BA.debugLine="NavigationDarked =	Not(pt1.isColorDark(Navigatin";
Debug.ShouldStop(8);
_navigationdarked = utils.mostCurrent.__c.runMethod(true,"Not",(Object)(_pt1.runMethod(true,"isColorDark",(Object)(_navigatincolor))));Debug.locals.put("NavigationDarked", _navigationdarked);
 BA.debugLineNum = 37;BA.debugLine="StatusDared =	Not(pt1.isColorDark(StatusColor))";
Debug.ShouldStop(16);
_statusdared = utils.mostCurrent.__c.runMethod(true,"Not",(Object)(_pt1.runMethod(true,"isColorDark",(Object)(_statuscolor))));Debug.locals.put("StatusDared", _statusdared);
 BA.debugLineNum = 42;BA.debugLine="If ((StatusDared = True) And (NavigationDarked =";
Debug.ShouldStop(512);
if ((RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_statusdared,utils.mostCurrent.__c.getField(true,"True"))))) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_navigationdarked,utils.mostCurrent.__c.getField(true,"True"))))))) { 
 BA.debugLineNum = 43;BA.debugLine="view.RunMethod(\"setSystemUiVisibility\",Array(Bi";
Debug.ShouldStop(1024);
_view.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setSystemUiVisibility")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(utils.mostCurrent.__c.getField(false,"Bit").runMethod(true,"Or",(Object)(BA.numberCast(int.class, ((int)0x00000010))),(Object)(utils.mostCurrent.__c.getField(false,"Bit").runMethod(true,"Or",(Object)(BA.numberCast(int.class, ((int)0x00000010))),(Object)(BA.numberCast(int.class, ((int)0x00002000)))))))})));
 }else 
{ BA.debugLineNum = 44;BA.debugLine="else If ((StatusDared = True) And (NavigationDar";
Debug.ShouldStop(2048);
if ((RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_statusdared,utils.mostCurrent.__c.getField(true,"True"))))) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_navigationdarked,utils.mostCurrent.__c.getField(true,"False"))))))) { 
 BA.debugLineNum = 45;BA.debugLine="view.RunMethod(\"setSystemUiVisibility\",Array(Bi";
Debug.ShouldStop(4096);
_view.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setSystemUiVisibility")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(utils.mostCurrent.__c.getField(false,"Bit").runMethod(true,"Or",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, ((int)0x00002000)))))})));
 }else 
{ BA.debugLineNum = 46;BA.debugLine="else If ((StatusDared = False) And (NavigationDa";
Debug.ShouldStop(8192);
if ((RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_statusdared,utils.mostCurrent.__c.getField(true,"False"))))) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_navigationdarked,utils.mostCurrent.__c.getField(true,"True"))))))) { 
 BA.debugLineNum = 47;BA.debugLine="view.RunMethod(\"setSystemUiVisibility\",Array(Bi";
Debug.ShouldStop(16384);
_view.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setSystemUiVisibility")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(utils.mostCurrent.__c.getField(false,"Bit").runMethod(true,"Or",(Object)(BA.numberCast(int.class, ((int)0x00000010))),(Object)(BA.numberCast(int.class, 0))))})));
 }else 
{ BA.debugLineNum = 48;BA.debugLine="else If ((StatusDared = False) And (NavigationDa";
Debug.ShouldStop(32768);
if ((RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_statusdared,utils.mostCurrent.__c.getField(true,"False"))))) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_navigationdarked,utils.mostCurrent.__c.getField(true,"False"))))))) { 
 BA.debugLineNum = 49;BA.debugLine="view.RunMethod(\"setSystemUiVisibility\",Array(Bi";
Debug.ShouldStop(65536);
_view.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setSystemUiVisibility")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(utils.mostCurrent.__c.getField(false,"Bit").runMethod(true,"Or",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0))))})));
 }}}}
;
 BA.debugLineNum = 56;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _textview(RemoteObject _ba,RemoteObject _text,RemoteObject _color,RemoteObject _size) throws Exception{
try {
		Debug.PushSubsStack("TextView (utils) ","utils",2,_ba,utils.mostCurrent,84);
if (RapidSub.canDelegate("textview")) { return ir.puzzletak.uploader.utils.remoteMe.runUserSub(false, "utils","textview", _ba, _text, _color, _size);}
RemoteObject _lb = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
;
Debug.locals.put("text", _text);
Debug.locals.put("color", _color);
Debug.locals.put("size", _size);
 BA.debugLineNum = 84;BA.debugLine="Public Sub TextView(text As String, color As Int,s";
Debug.ShouldStop(524288);
 BA.debugLineNum = 85;BA.debugLine="Dim lb As Label";
Debug.ShouldStop(1048576);
_lb = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lb", _lb);
 BA.debugLineNum = 86;BA.debugLine="lb.Initialize(\"\")";
Debug.ShouldStop(2097152);
_lb.runVoidMethod ("Initialize",_ba,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 87;BA.debugLine="lb.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(4194304);
_lb.runMethod(false,"setTypeface",utils.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 88;BA.debugLine="lb.Gravity = Bit.Or(Gravity.CENTER_HORIZONTAL,Gra";
Debug.ShouldStop(8388608);
_lb.runMethod(true,"setGravity",utils.mostCurrent.__c.getField(false,"Bit").runMethod(true,"Or",(Object)(utils.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL")),(Object)(utils.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL"))));
 BA.debugLineNum = 89;BA.debugLine="lb.SingleLine  = True";
Debug.ShouldStop(16777216);
_lb.runVoidMethod ("setSingleLine",utils.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 90;BA.debugLine="lb.TextColor = color";
Debug.ShouldStop(33554432);
_lb.runMethod(true,"setTextColor",_color);
 BA.debugLineNum = 91;BA.debugLine="lb.TextSize = size";
Debug.ShouldStop(67108864);
_lb.runMethod(true,"setTextSize",BA.numberCast(float.class, _size));
 BA.debugLineNum = 92;BA.debugLine="lb.Text = text";
Debug.ShouldStop(134217728);
_lb.runMethod(true,"setText",BA.ObjectToCharSequence(_text));
 BA.debugLineNum = 93;BA.debugLine="Return lb";
Debug.ShouldStop(268435456);
if (true) return _lb;
 BA.debugLineNum = 95;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}