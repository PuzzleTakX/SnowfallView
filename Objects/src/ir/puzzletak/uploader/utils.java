package ir.puzzletak.uploader;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class utils {
private static utils mostCurrent = new utils();
public static Object getObject() {
    throw new RuntimeException("Code module does not support this method.");
}
 
public anywheresoftware.b4a.keywords.Common __c = null;
public ir.puzzletak.uploader.main _main = null;
public ir.puzzletak.uploader.starter _starter = null;
public static String  _setstatusbarcolor(anywheresoftware.b4a.BA _ba,int _statuscolor,int _navigatincolor) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "setstatusbarcolor", false))
	 {return ((String) Debug.delegate(null, "setstatusbarcolor", new Object[] {_ba,_statuscolor,_navigatincolor}));}
ir.puzzletak.stopcalllmusic.PuzzleTak_StopCallAndMusic _pt1 = null;
anywheresoftware.b4j.object.JavaObject _jo = null;
anywheresoftware.b4j.object.JavaObject _window = null;
anywheresoftware.b4j.object.JavaObject _view = null;
boolean _navigationdarked = false;
boolean _statusdared = false;
RDebugUtils.currentLine=1769472;
 //BA.debugLineNum = 1769472;BA.debugLine="Sub SetStatusBarColor(StatusColor As Int ,Navigati";
RDebugUtils.currentLine=1769474;
 //BA.debugLineNum = 1769474;BA.debugLine="Dim pt1 As PuzzleTak_GetUrlSizeTime";
_pt1 = new ir.puzzletak.stopcalllmusic.PuzzleTak_StopCallAndMusic();
RDebugUtils.currentLine=1769475;
 //BA.debugLineNum = 1769475;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=1769476;
 //BA.debugLineNum = 1769476;BA.debugLine="jo.InitializeContext";
_jo.InitializeContext((_ba.processBA == null ? _ba : _ba.processBA));
RDebugUtils.currentLine=1769477;
 //BA.debugLineNum = 1769477;BA.debugLine="Dim window As JavaObject = jo.RunMethodJO(\"getWi";
_window = new anywheresoftware.b4j.object.JavaObject();
_window = _jo.RunMethodJO("getWindow",(Object[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=1769478;
 //BA.debugLineNum = 1769478;BA.debugLine="window.RunMethod(\"addFlags\", Array (0x80000000))";
_window.RunMethod("addFlags",new Object[]{(Object)(((int)0x80000000))});
RDebugUtils.currentLine=1769479;
 //BA.debugLineNum = 1769479;BA.debugLine="window.RunMethod(\"clearFlags\", Array (0x04000000";
_window.RunMethod("clearFlags",new Object[]{(Object)(((int)0x04000000))});
RDebugUtils.currentLine=1769480;
 //BA.debugLineNum = 1769480;BA.debugLine="window.RunMethod(\"setNavigationBarColor\", Array(";
_window.RunMethod("setNavigationBarColor",new Object[]{(Object)(_navigatincolor)});
RDebugUtils.currentLine=1769481;
 //BA.debugLineNum = 1769481;BA.debugLine="window.RunMethod(\"setStatusBarColor\", Array(Stat";
_window.RunMethod("setStatusBarColor",new Object[]{(Object)(_statuscolor)});
RDebugUtils.currentLine=1769482;
 //BA.debugLineNum = 1769482;BA.debugLine="Dim view As JavaObject = window.RunMethodJO(\"get";
_view = new anywheresoftware.b4j.object.JavaObject();
_view = _window.RunMethodJO("getDecorView",(Object[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=1769484;
 //BA.debugLineNum = 1769484;BA.debugLine="Dim NavigationDarked As Boolean = False";
_navigationdarked = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=1769485;
 //BA.debugLineNum = 1769485;BA.debugLine="Dim StatusDared As Boolean = False";
_statusdared = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=1769499;
 //BA.debugLineNum = 1769499;BA.debugLine="NavigationDarked =	Not(pt1.isColorDark(Navigatin";
_navigationdarked = anywheresoftware.b4a.keywords.Common.Not(_pt1.isColorDark(_navigatincolor));
RDebugUtils.currentLine=1769500;
 //BA.debugLineNum = 1769500;BA.debugLine="StatusDared =	Not(pt1.isColorDark(StatusColor))";
_statusdared = anywheresoftware.b4a.keywords.Common.Not(_pt1.isColorDark(_statuscolor));
RDebugUtils.currentLine=1769505;
 //BA.debugLineNum = 1769505;BA.debugLine="If ((StatusDared = True) And (NavigationDarked =";
if (((_statusdared==anywheresoftware.b4a.keywords.Common.True) && (_navigationdarked==anywheresoftware.b4a.keywords.Common.True))) { 
RDebugUtils.currentLine=1769506;
 //BA.debugLineNum = 1769506;BA.debugLine="view.RunMethod(\"setSystemUiVisibility\",Array(Bi";
_view.RunMethod("setSystemUiVisibility",new Object[]{(Object)(anywheresoftware.b4a.keywords.Common.Bit.Or(((int)0x00000010),anywheresoftware.b4a.keywords.Common.Bit.Or(((int)0x00000010),((int)0x00002000))))});
 }else 
{RDebugUtils.currentLine=1769507;
 //BA.debugLineNum = 1769507;BA.debugLine="else If ((StatusDared = True) And (NavigationDar";
if (((_statusdared==anywheresoftware.b4a.keywords.Common.True) && (_navigationdarked==anywheresoftware.b4a.keywords.Common.False))) { 
RDebugUtils.currentLine=1769508;
 //BA.debugLineNum = 1769508;BA.debugLine="view.RunMethod(\"setSystemUiVisibility\",Array(Bi";
_view.RunMethod("setSystemUiVisibility",new Object[]{(Object)(anywheresoftware.b4a.keywords.Common.Bit.Or((int) (0),((int)0x00002000)))});
 }else 
{RDebugUtils.currentLine=1769509;
 //BA.debugLineNum = 1769509;BA.debugLine="else If ((StatusDared = False) And (NavigationDa";
if (((_statusdared==anywheresoftware.b4a.keywords.Common.False) && (_navigationdarked==anywheresoftware.b4a.keywords.Common.True))) { 
RDebugUtils.currentLine=1769510;
 //BA.debugLineNum = 1769510;BA.debugLine="view.RunMethod(\"setSystemUiVisibility\",Array(Bi";
_view.RunMethod("setSystemUiVisibility",new Object[]{(Object)(anywheresoftware.b4a.keywords.Common.Bit.Or(((int)0x00000010),(int) (0)))});
 }else 
{RDebugUtils.currentLine=1769511;
 //BA.debugLineNum = 1769511;BA.debugLine="else If ((StatusDared = False) And (NavigationDa";
if (((_statusdared==anywheresoftware.b4a.keywords.Common.False) && (_navigationdarked==anywheresoftware.b4a.keywords.Common.False))) { 
RDebugUtils.currentLine=1769512;
 //BA.debugLineNum = 1769512;BA.debugLine="view.RunMethod(\"setSystemUiVisibility\",Array(Bi";
_view.RunMethod("setSystemUiVisibility",new Object[]{(Object)(anywheresoftware.b4a.keywords.Common.Bit.Or((int) (0),(int) (0)))});
 }}}}
;
RDebugUtils.currentLine=1769519;
 //BA.debugLineNum = 1769519;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.drawable.ColorDrawable  _background(anywheresoftware.b4a.BA _ba,int _defaultcolor,float _oldradius) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "background", false))
	 {return ((anywheresoftware.b4a.objects.drawable.ColorDrawable) Debug.delegate(null, "background", new Object[] {_ba,_defaultcolor,_oldradius}));}
anywheresoftware.b4a.objects.drawable.ColorDrawable _defaultcd = null;
RDebugUtils.currentLine=2097152;
 //BA.debugLineNum = 2097152;BA.debugLine="Public Sub Background(DefaultColor As Int,OldRadiu";
RDebugUtils.currentLine=2097153;
 //BA.debugLineNum = 2097153;BA.debugLine="Dim DefaultCD As ColorDrawable";
_defaultcd = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=2097154;
 //BA.debugLineNum = 2097154;BA.debugLine="DefaultCD.Initialize(DefaultColor, OldRadius)";
_defaultcd.Initialize(_defaultcolor,(int) (_oldradius));
RDebugUtils.currentLine=2097155;
 //BA.debugLineNum = 2097155;BA.debugLine="Return DefaultCD";
if (true) return _defaultcd;
RDebugUtils.currentLine=2097156;
 //BA.debugLineNum = 2097156;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.drawable.GradientDrawable  _backgroundgradint(anywheresoftware.b4a.BA _ba,int[] _color,float _oldradius) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "backgroundgradint", false))
	 {return ((anywheresoftware.b4a.objects.drawable.GradientDrawable) Debug.delegate(null, "backgroundgradint", new Object[] {_ba,_color,_oldradius}));}
anywheresoftware.b4a.objects.drawable.GradientDrawable _defaultcd = null;
RDebugUtils.currentLine=2162688;
 //BA.debugLineNum = 2162688;BA.debugLine="Public Sub BackgroundGradint(color() As Int,OldRad";
RDebugUtils.currentLine=2162689;
 //BA.debugLineNum = 2162689;BA.debugLine="Dim DefaultCD As GradientDrawable";
_defaultcd = new anywheresoftware.b4a.objects.drawable.GradientDrawable();
RDebugUtils.currentLine=2162690;
 //BA.debugLineNum = 2162690;BA.debugLine="DefaultCD.Initialize(\"LEFT_RIGHT\",color)";
_defaultcd.Initialize(BA.getEnumFromString(android.graphics.drawable.GradientDrawable.Orientation.class,"LEFT_RIGHT"),_color);
RDebugUtils.currentLine=2162691;
 //BA.debugLineNum = 2162691;BA.debugLine="DefaultCD.CornerRadius = OldRadius";
_defaultcd.setCornerRadius(_oldradius);
RDebugUtils.currentLine=2162692;
 //BA.debugLineNum = 2162692;BA.debugLine="Return DefaultCD";
if (true) return _defaultcd;
RDebugUtils.currentLine=2162693;
 //BA.debugLineNum = 2162693;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.drawable.ColorDrawable  _drawable(anywheresoftware.b4a.BA _ba,String _icon,int _color) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "drawable", false))
	 {return ((anywheresoftware.b4a.objects.drawable.ColorDrawable) Debug.delegate(null, "drawable", new Object[] {_ba,_icon,_color}));}
de.amberhome.objects.appcompat.AppCompatBase _ac = null;
anywheresoftware.b4a.object.XmlLayoutBuilder _ax = null;
RDebugUtils.currentLine=1900544;
 //BA.debugLineNum = 1900544;BA.debugLine="Public Sub Drawable(icon As String, color As Int)";
RDebugUtils.currentLine=1900545;
 //BA.debugLineNum = 1900545;BA.debugLine="Dim ac As AppCompat";
_ac = new de.amberhome.objects.appcompat.AppCompatBase();
RDebugUtils.currentLine=1900546;
 //BA.debugLineNum = 1900546;BA.debugLine="Dim ax As XmlLayoutBuilder";
_ax = new anywheresoftware.b4a.object.XmlLayoutBuilder();
RDebugUtils.currentLine=1900547;
 //BA.debugLineNum = 1900547;BA.debugLine="ac.SetDrawableTint(ax.GetDrawable(icon),color)";
_ac.SetDrawableTint(_ax.GetDrawable(_icon),_color);
RDebugUtils.currentLine=1900548;
 //BA.debugLineNum = 1900548;BA.debugLine="Return ax.GetDrawable(icon)";
if (true) return (anywheresoftware.b4a.objects.drawable.ColorDrawable) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.ColorDrawable(), (android.graphics.drawable.Drawable)(_ax.GetDrawable(_icon)));
RDebugUtils.currentLine=1900549;
 //BA.debugLineNum = 1900549;BA.debugLine="End Sub";
return null;
}
public static String  _getfileinfobyindex(anywheresoftware.b4a.BA _ba,String _column,String _uri) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "getfileinfobyindex", false))
	 {return ((String) Debug.delegate(null, "getfileinfobyindex", new Object[] {_ba,_column,_uri}));}
String _results = "";
anywheresoftware.b4a.sql.SQL.CursorWrapper _cur = null;
anywheresoftware.b4a.objects.ContentResolverWrapper.UriWrapper _uri1 = null;
anywheresoftware.b4a.objects.ContentResolverWrapper _cr = null;
int _i = 0;
String _id = "";
RDebugUtils.currentLine=2293760;
 //BA.debugLineNum = 2293760;BA.debugLine="public Sub GetFileInfoByIndex(column As String, ur";
RDebugUtils.currentLine=2293762;
 //BA.debugLineNum = 2293762;BA.debugLine="Dim results As String";
_results = "";
RDebugUtils.currentLine=2293763;
 //BA.debugLineNum = 2293763;BA.debugLine="Dim Cur As Cursor";
_cur = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=2293764;
 //BA.debugLineNum = 2293764;BA.debugLine="Dim Uri1 As Uri";
_uri1 = new anywheresoftware.b4a.objects.ContentResolverWrapper.UriWrapper();
RDebugUtils.currentLine=2293765;
 //BA.debugLineNum = 2293765;BA.debugLine="Dim cr As ContentResolver";
_cr = new anywheresoftware.b4a.objects.ContentResolverWrapper();
RDebugUtils.currentLine=2293766;
 //BA.debugLineNum = 2293766;BA.debugLine="cr.Initialize(\"\")";
_cr.Initialize("");
RDebugUtils.currentLine=2293769;
 //BA.debugLineNum = 2293769;BA.debugLine="If uri.StartsWith(\"content://media/\") Then";
if (_uri.startsWith("content://media/")) { 
RDebugUtils.currentLine=2293770;
 //BA.debugLineNum = 2293770;BA.debugLine="Dim i As Int = uri.LastIndexOf(\"/\")";
_i = _uri.lastIndexOf("/");
RDebugUtils.currentLine=2293771;
 //BA.debugLineNum = 2293771;BA.debugLine="Dim id As String = uri.SubString(i + 1)";
_id = _uri.substring((int) (_i+1));
RDebugUtils.currentLine=2293772;
 //BA.debugLineNum = 2293772;BA.debugLine="Uri1.Parse(uri)";
_uri1.Parse(_uri);
RDebugUtils.currentLine=2293773;
 //BA.debugLineNum = 2293773;BA.debugLine="Cur = cr.Query(Uri1, Null, \"_id = ?\", Array As S";
_cur = _cr.Query(_uri1,(String[])(anywheresoftware.b4a.keywords.Common.Null),"_id = ?",new String[]{_id},BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=2293774;
 //BA.debugLineNum = 2293774;BA.debugLine="Cur.Position = 0";
_cur.setPosition((int) (0));
RDebugUtils.currentLine=2293775;
 //BA.debugLineNum = 2293775;BA.debugLine="If Cur.RowCount <> 0 Then";
if (_cur.getRowCount()!=0) { 
RDebugUtils.currentLine=2293776;
 //BA.debugLineNum = 2293776;BA.debugLine="For i = 0 To Cur.ColumnCount - 1";
{
final int step13 = 1;
final int limit13 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit13 ;_i = _i + step13 ) {
RDebugUtils.currentLine=2293777;
 //BA.debugLineNum = 2293777;BA.debugLine="If Cur.GetColumnName(i) <> Null Then";
if (_cur.GetColumnName(_i)!= null) { 
RDebugUtils.currentLine=2293778;
 //BA.debugLineNum = 2293778;BA.debugLine="If Cur.GetColumnName(i) = column Then";
if ((_cur.GetColumnName(_i)).equals(_column)) { 
RDebugUtils.currentLine=2293779;
 //BA.debugLineNum = 2293779;BA.debugLine="results = Cur.GetString2(i)";
_results = _cur.GetString2(_i);
RDebugUtils.currentLine=2293780;
 //BA.debugLineNum = 2293780;BA.debugLine="Exit";
if (true) break;
 };
 };
 }
};
 };
 }else {
RDebugUtils.currentLine=2293786;
 //BA.debugLineNum = 2293786;BA.debugLine="Uri1.Parse(uri)";
_uri1.Parse(_uri);
RDebugUtils.currentLine=2293787;
 //BA.debugLineNum = 2293787;BA.debugLine="Cur = cr.Query(Uri1, Null, Null, Null, Null)";
_cur = _cr.Query(_uri1,(String[])(anywheresoftware.b4a.keywords.Common.Null),BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Null),(String[])(anywheresoftware.b4a.keywords.Common.Null),BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=2293788;
 //BA.debugLineNum = 2293788;BA.debugLine="Cur.Position = 0";
_cur.setPosition((int) (0));
RDebugUtils.currentLine=2293789;
 //BA.debugLineNum = 2293789;BA.debugLine="If Cur.RowCount <> 0 Then";
if (_cur.getRowCount()!=0) { 
RDebugUtils.currentLine=2293790;
 //BA.debugLineNum = 2293790;BA.debugLine="For i = 0 To Cur.ColumnCount - 1";
{
final int step27 = 1;
final int limit27 = (int) (_cur.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit27 ;_i = _i + step27 ) {
RDebugUtils.currentLine=2293791;
 //BA.debugLineNum = 2293791;BA.debugLine="If Cur.GetColumnName(i) <> Null Then";
if (_cur.GetColumnName(_i)!= null) { 
RDebugUtils.currentLine=2293792;
 //BA.debugLineNum = 2293792;BA.debugLine="If Cur.GetColumnName(i) = column Then";
if ((_cur.GetColumnName(_i)).equals(_column)) { 
RDebugUtils.currentLine=2293793;
 //BA.debugLineNum = 2293793;BA.debugLine="results = Cur.GetString2(i)";
_results = _cur.GetString2(_i);
RDebugUtils.currentLine=2293794;
 //BA.debugLineNum = 2293794;BA.debugLine="Exit";
if (true) break;
 };
 };
 }
};
 };
 };
RDebugUtils.currentLine=2293801;
 //BA.debugLineNum = 2293801;BA.debugLine="Cur.Close";
_cur.Close();
RDebugUtils.currentLine=2293803;
 //BA.debugLineNum = 2293803;BA.debugLine="Return results";
if (true) return _results;
RDebugUtils.currentLine=2293805;
 //BA.debugLineNum = 2293805;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.ImageViewWrapper  _imageicon(anywheresoftware.b4a.BA _ba,String _icon,int _color) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "imageicon", false))
	 {return ((anywheresoftware.b4a.objects.ImageViewWrapper) Debug.delegate(null, "imageicon", new Object[] {_ba,_icon,_color}));}
anywheresoftware.b4a.objects.ImageViewWrapper _ic = null;
RDebugUtils.currentLine=1966080;
 //BA.debugLineNum = 1966080;BA.debugLine="Public Sub ImageIcon(icon As String , color As Int";
RDebugUtils.currentLine=1966081;
 //BA.debugLineNum = 1966081;BA.debugLine="Dim ic As ImageView";
_ic = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="ic.Initialize(\"\")";
_ic.Initialize(_ba,"");
RDebugUtils.currentLine=1966083;
 //BA.debugLineNum = 1966083;BA.debugLine="ic.Background = Drawable(icon,color)";
_ic.setBackground((android.graphics.drawable.Drawable)(_drawable(_ba,_icon,_color).getObject()));
RDebugUtils.currentLine=1966084;
 //BA.debugLineNum = 1966084;BA.debugLine="Return ic";
if (true) return _ic;
RDebugUtils.currentLine=1966085;
 //BA.debugLineNum = 1966085;BA.debugLine="End Sub";
return null;
}
public static Object  _parseuri(anywheresoftware.b4a.BA _ba,String _filename) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "parseuri", false))
	 {return ((Object) Debug.delegate(null, "parseuri", new Object[] {_ba,_filename}));}
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
RDebugUtils.currentLine=2228224;
 //BA.debugLineNum = 2228224;BA.debugLine="Public Sub ParseUri(FileName As String) As Object";
RDebugUtils.currentLine=2228225;
 //BA.debugLineNum = 2228225;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=2228226;
 //BA.debugLineNum = 2228226;BA.debugLine="Return r.RunStaticMethod(\"android.net.Uri\", \"pars";
if (true) return _r.RunStaticMethod("android.net.Uri","parse",new Object[]{(Object)(_filename)},new String[]{"java.lang.String"});
RDebugUtils.currentLine=2228228;
 //BA.debugLineNum = 2228228;BA.debugLine="End Sub";
return null;
}
public static String  _setripple(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.ConcreteViewWrapper _viewholder,int _defaultcolor,int _ontouchcolor,float _oldradius) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "setripple", false))
	 {return ((String) Debug.delegate(null, "setripple", new Object[] {_ba,_viewholder,_defaultcolor,_ontouchcolor,_oldradius}));}
flm.b4a.rippledrawable.RippleDrawableWrapper _bripple = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _defaultcd = null;
RDebugUtils.currentLine=1835008;
 //BA.debugLineNum = 1835008;BA.debugLine="Public Sub SetRipple (ViewHolder As View, DefaultC";
RDebugUtils.currentLine=1835010;
 //BA.debugLineNum = 1835010;BA.debugLine="Dim bRipple As RippleDrawable";
_bripple = new flm.b4a.rippledrawable.RippleDrawableWrapper();
RDebugUtils.currentLine=1835011;
 //BA.debugLineNum = 1835011;BA.debugLine="Dim DefaultCD As ColorDrawable";
_defaultcd = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=1835012;
 //BA.debugLineNum = 1835012;BA.debugLine="DefaultCD.Initialize(DefaultColor, OldRadius)";
_defaultcd.Initialize(_defaultcolor,(int) (_oldradius));
RDebugUtils.currentLine=1835013;
 //BA.debugLineNum = 1835013;BA.debugLine="bRipple.Initialize2(DefaultCD,OnTouchColor)";
_bripple.Initialize2((android.graphics.drawable.Drawable)(_defaultcd.getObject()),_ontouchcolor);
RDebugUtils.currentLine=1835014;
 //BA.debugLineNum = 1835014;BA.debugLine="ViewHolder.Background = bRipple.Drawable";
_viewholder.setBackground((android.graphics.drawable.Drawable)(_bripple.getDrawable()));
RDebugUtils.currentLine=1835016;
 //BA.debugLineNum = 1835016;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.LabelWrapper  _textview(anywheresoftware.b4a.BA _ba,String _text,int _color,int _size) throws Exception{
RDebugUtils.currentModule="utils";
if (Debug.shouldDelegate(null, "textview", false))
	 {return ((anywheresoftware.b4a.objects.LabelWrapper) Debug.delegate(null, "textview", new Object[] {_ba,_text,_color,_size}));}
anywheresoftware.b4a.objects.LabelWrapper _lb = null;
RDebugUtils.currentLine=2031616;
 //BA.debugLineNum = 2031616;BA.debugLine="Public Sub TextView(text As String, color As Int,s";
RDebugUtils.currentLine=2031617;
 //BA.debugLineNum = 2031617;BA.debugLine="Dim lb As Label";
_lb = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=2031618;
 //BA.debugLineNum = 2031618;BA.debugLine="lb.Initialize(\"\")";
_lb.Initialize(_ba,"");
RDebugUtils.currentLine=2031619;
 //BA.debugLineNum = 2031619;BA.debugLine="lb.Typeface = Typeface.DEFAULT_BOLD";
_lb.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=2031620;
 //BA.debugLineNum = 2031620;BA.debugLine="lb.Gravity = Bit.Or(Gravity.CENTER_HORIZONTAL,Gra";
_lb.setGravity(anywheresoftware.b4a.keywords.Common.Bit.Or(anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL,anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=2031621;
 //BA.debugLineNum = 2031621;BA.debugLine="lb.SingleLine  = True";
_lb.setSingleLine(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2031622;
 //BA.debugLineNum = 2031622;BA.debugLine="lb.TextColor = color";
_lb.setTextColor(_color);
RDebugUtils.currentLine=2031623;
 //BA.debugLineNum = 2031623;BA.debugLine="lb.TextSize = size";
_lb.setTextSize((float) (_size));
RDebugUtils.currentLine=2031624;
 //BA.debugLineNum = 2031624;BA.debugLine="lb.Text = text";
_lb.setText(BA.ObjectToCharSequence(_text));
RDebugUtils.currentLine=2031625;
 //BA.debugLineNum = 2031625;BA.debugLine="Return lb";
if (true) return _lb;
RDebugUtils.currentLine=2031627;
 //BA.debugLineNum = 2031627;BA.debugLine="End Sub";
return null;
}
}