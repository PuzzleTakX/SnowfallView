B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=11.8
@EndOfDesignText@
'Code module
'Subs in this code module will be accessible from all modules.
Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.

End Sub

Sub SetStatusBarColor(StatusColor As Int ,NavigatinColor As Int  )
	'  'log("darked :"&darked)
	Dim pt1 As PuzzleTak_GetUrlSizeTime
		Dim jo As JavaObject
		jo.InitializeContext
		Dim window As JavaObject = jo.RunMethodJO("getWindow", Null)
		window.RunMethod("addFlags", Array (0x80000000))
		window.RunMethod("clearFlags", Array (0x04000000))
		window.RunMethod("setNavigationBarColor", Array(NavigatinColor))
		window.RunMethod("setStatusBarColor", Array(StatusColor))
		Dim view As JavaObject = window.RunMethodJO("getDecorView",Null)
'		Dim Status As Int
		Dim NavigationDarked As Boolean = False
		Dim StatusDared As Boolean = False
'		Dim Navigation As Int
'		
'		If NavigationDarked Then
'			Navigation = Bit.Or(0x00000010,0x00000010)
'		Else
'			Navigation = Bit.Or(0x00002000,0x00002000)
'		End If
'		If StatusDared Then
'			Status = 0
'		Else
'			Status = Bit.Or(0x00000010,0x00002000)
'		End If

		NavigationDarked =	Not(pt1.isColorDark(NavigatinColor))
		StatusDared =	Not(pt1.isColorDark(StatusColor))
		

'		Log(StatusDared)
'		Log(StatusDared)
		If ((StatusDared = True) And (NavigationDarked = True)) Then
			view.RunMethod("setSystemUiVisibility",Array(Bit.Or(0x00000010,Bit.Or(0x00000010,0x00002000))))
		else If ((StatusDared = True) And (NavigationDarked = False)) Then
			view.RunMethod("setSystemUiVisibility",Array(Bit.Or(0,0x00002000)))
		else If ((StatusDared = False) And (NavigationDarked = True)) Then
			view.RunMethod("setSystemUiVisibility",Array(Bit.Or(0x00000010,0)))
		else If ((StatusDared = False) And (NavigationDarked = False)) Then
			view.RunMethod("setSystemUiVisibility",Array(Bit.Or(0,0)))
		End If
		
		
'			view.RunMethod("setSystemUiVisibility",Array(Bit1.Or(Navigation,Status))) 'Dark style with White icons and text
	

End Sub


Public Sub SetRipple (ViewHolder As View, DefaultColor As Int, OnTouchColor As Int, OldRadius As Float)

		Dim bRipple As RippleDrawable
		Dim DefaultCD As ColorDrawable
		DefaultCD.Initialize(DefaultColor, OldRadius)
		bRipple.Initialize2(DefaultCD,OnTouchColor)
		ViewHolder.Background = bRipple.Drawable
	
End Sub


Public Sub Drawable(icon As String, color As Int) As ColorDrawable
	Dim ac As AppCompat
	Dim ax As XmlLayoutBuilder
	ac.SetDrawableTint(ax.GetDrawable(icon),color)
	Return ax.GetDrawable(icon)
End Sub

Public Sub ImageIcon(icon As String , color As Int)  As ImageView
	Dim ic As ImageView
	ic.Initialize("")
	ic.Background = Drawable(icon,color)
	Return ic
End Sub

Public Sub TextView(text As String, color As Int,size As Int) As Label
	Dim lb As Label
	lb.Initialize("")
	lb.Typeface = Typeface.DEFAULT_BOLD
	lb.Gravity = Bit.Or(Gravity.CENTER_HORIZONTAL,Gravity.CENTER_VERTICAL)
	lb.SingleLine  = True
	lb.TextColor = color
	lb.TextSize = size
	lb.Text = text
	Return lb
	
End Sub

Public Sub Background(DefaultColor As Int,OldRadius As Float) As ColorDrawable
	Dim DefaultCD As ColorDrawable
	DefaultCD.Initialize(DefaultColor, OldRadius)
	Return DefaultCD
End Sub
Public Sub BackgroundGradint(color() As Int,OldRadius As Float) As GradientDrawable
	Dim DefaultCD As GradientDrawable
	DefaultCD.Initialize("LEFT_RIGHT",color)
	DefaultCD.CornerRadius = OldRadius
	Return DefaultCD
End Sub
Public Sub ParseUri(FileName As String) As Object
	Dim r As Reflector
	Return r.RunStaticMethod("android.net.Uri", "parse", Array As Object(FileName), Array As String("java.lang.String"))

End Sub
public Sub GetFileInfoByIndex(column As String, uri As String) As String
	
	Dim results As String
	Dim Cur As Cursor
	Dim Uri1 As Uri
	Dim cr As ContentResolver
	cr.Initialize("")

	'if viewing by gallery
	If uri.StartsWith("content://media/") Then
		Dim i As Int = uri.LastIndexOf("/")
		Dim id As String = uri.SubString(i + 1)
		Uri1.Parse(uri)
		Cur = cr.Query(Uri1, Null, "_id = ?", Array As String(id), Null)
		Cur.Position = 0
		If Cur.RowCount <> 0 Then
			For i = 0 To Cur.ColumnCount - 1
				If Cur.GetColumnName(i) <> Null Then
					If Cur.GetColumnName(i) = column Then
						results = Cur.GetString2(i)
						Exit
					End If
				End If
			Next
		End If
	Else
		Uri1.Parse(uri)
		Cur = cr.Query(Uri1, Null, Null, Null, Null)
		Cur.Position = 0
		If Cur.RowCount <> 0 Then
			For i = 0 To Cur.ColumnCount - 1
				If Cur.GetColumnName(i) <> Null Then
					If Cur.GetColumnName(i) = column Then
						results = Cur.GetString2(i)
						Exit
					End If
				End If
			Next
		End If
	End If
	
	Cur.Close
	
	Return results
	
End Sub