B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8
@EndOfDesignText@
Sub Class_Globals
	Dim pnlscreen As Panel
	Dim enterusername As EditText
	Dim enterpassword As EditText
	Dim btnregister As Button
	Dim btnalreadyreg As Button
	
'	Dim loginscreen As login
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	pnlscreen.Initialize("mainscreen")
	enterpassword.Initialize("pass")
	enterusername.Initialize("username")
	btnalreadyreg.Initialize("alrdyreg")
	btnregister.Initialize("register")
	BuildUI
End Sub

Sub AsView As View
	Return pnlscreen
End Sub

Sub BuildUI
	
	pnlscreen.Color = Colors.RGB(24, 96, 178)
	
	enterusername.Color = Colors.White
	enterpassword.Color = Colors.White
	enterusername.TextColor = Colors.Black
	enterpassword.TextColor = Colors.Black
	enterusername.Hint = "Username"
	enterpassword.Hint = "Password"
	enterpassword.SingleLine = True
	enterusername.SingleLine = True
	HelperFunctions.Apply_ViewStyle(enterusername,Colors.Black,Colors.White,Colors.White,Colors.White,Colors.White,Colors.Gray,Colors.Gray,20)
	HelperFunctions.Apply_ViewStyle(enterpassword,Colors.Black,Colors.White,Colors.White,Colors.White,Colors.White,Colors.Gray,Colors.Gray,20)
	
	btnregister.Color = Colors.White
	btnregister.Text = "Submit"
	btnregister.TextColor = Colors.Black
	HelperFunctions.Apply_ViewStyle(btnregister,Colors.Black,Colors.White,Colors.White,Colors.White,Colors.White,Colors.Gray,Colors.Gray,20)
	
	btnalreadyreg.Color = Colors.White
	btnalreadyreg.Text = "Already have and account? Click here!"
	btnalreadyreg.TextColor = Colors.Black
	HelperFunctions.Apply_ViewStyle(btnalreadyreg,Colors.Black,Colors.White,Colors.White,Colors.White,Colors.White,Colors.Gray,Colors.Gray,20)
	
	
	
	pnlscreen.AddView(enterusername,35%x,20%y,30%x,10%y)
	pnlscreen.AddView(enterpassword,35%x,enterusername.Top + 15%y,30%x,10%y)
	pnlscreen.AddView(btnregister,35%x,50%y,30%x,15%y)
	pnlscreen.AddView(btnalreadyreg,35%x,70%y,30%x,15%y)

End Sub


Sub register_Click
	If enterusername.Text = ""  Or enterpassword.Text = "" Then
		ToastMessageShow("Nothing entered",False)
	Else
			DB.DataBaseCreateUser(enterusername.Text,enterpassword.Text)
			ToastMessageShow("SUCCESSFULY REGISTERED!",False)
			CallSub(Main,"ShowHideLoginScreen")
	End If
End Sub

Sub alrdyreg_Click
	CallSub(Main,"ShowHideLoginScreen")
End Sub