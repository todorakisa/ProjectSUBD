B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8
@EndOfDesignText@
Sub Class_Globals
	Dim background As Panel
	Dim mainscreen As Panel
	Dim entersum As EditText
	Dim submit As Button
	
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	background.Initialize("background")
	mainscreen.Initialize("mainscr")
	entersum.Initialize("sumfld")
	submit.Initialize("btn1")
	BuildUI
End Sub
Sub BuildUI
	background.Color = Colors.ARGB(50,0,0,0)
	background.AddView(mainscreen,25%x,25%y,50%x,50%y)
	mainscreen.Color = Colors.LightGray
	mainscreen.AddView(entersum,0%x,10%y,50%x,10%y)
	mainscreen.AddView(submit,20%x,25%y,10%x,10%y)
	submit.Text = "OK"
	entersum.Hint = "Enter sum"
	entersum.InputType = entersum.INPUT_TYPE_DECIMAL_NUMBERS
	
End Sub

Sub background_Click As Boolean
	Return True
End Sub

Sub btn1_Click
'	func here
End Sub