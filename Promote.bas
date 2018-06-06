B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8
@EndOfDesignText@
Sub Class_Globals
	Dim background As Panel
	Dim mainscreen As Panel
	Dim enterusername As EditText
	Dim enterrank As EditText
	Dim submit As Button
	
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	background.Initialize("background")
	mainscreen.Initialize("mainscr")
	enterrank.Initialize("newrank")
	submit.Initialize("btn1")
	enterusername.Initialize("username")
	BuildUI
End Sub
Sub BuildUI
	background.Color = Colors.ARGB(50,0,0,0)
	background.AddView(mainscreen,25%x,25%y,50%x,50%y)
	mainscreen.Color = Colors.LightGray
	mainscreen.AddView(enterrank,0%x,20%y,50%x,10%y)
	mainscreen.AddView(enterusername,0%x,10%y,50%x,10%y)
	mainscreen.AddView(submit,20%x,35%y,10%x,10%y)
	submit.Text = "OK"
	enterrank.Hint = "Enter new rank"
	enterusername.Hint = "Enter user"

End Sub

Sub background_Click As Boolean
	Return True
End Sub

Sub btn1_Click
	If enterrank.Text = "" Then
		ToastMessageShow("Nothing entered",False)
		CallSub(Main,"ShowRankUpdate")
	Else
'		db func here
		CallSub(Main,"ShowRankUpdate")
	End If
End Sub