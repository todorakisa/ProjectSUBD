B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8
@EndOfDesignText@
Sub Class_Globals
	Dim pnlmainscreen As Panel
	Dim enterusername As EditText
	Dim enterpassword As EditText
	Dim btnlogin As Button
	Dim btnnoreg As Button

End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	pnlmainscreen.Initialize("loginscreen")
	enterusername.Initialize("username")
	enterpassword.Initialize("password")
	btnlogin.Initialize("login")
	btnnoreg.Initialize("goback")
	
	Build_UI
End Sub

Sub AsView As View
	Return pnlmainscreen
End Sub

Sub Build_UI
	enterusername.Hint = "Username"
	enterpassword.Hint = "Password"
	enterusername.SingleLine = True
	enterpassword.SingleLine = True
	HelperFunctions.Apply_ViewStyle(enterusername,Colors.Black,Colors.White,Colors.White,Colors.White,Colors.White,Colors.Gray,Colors.Gray,20)
	HelperFunctions.Apply_ViewStyle(enterpassword,Colors.Black,Colors.White,Colors.White,Colors.White,Colors.White,Colors.Gray,Colors.Gray,20)
		
	btnlogin.Text = "Login"
	HelperFunctions.Apply_ViewStyle(btnlogin,Colors.Black,Colors.White,Colors.White,Colors.White,Colors.White,Colors.Gray,Colors.Gray,20)
	
	btnnoreg.Text = "Register"
	HelperFunctions.Apply_ViewStyle(btnnoreg,Colors.Black,Colors.White,Colors.White,Colors.White,Colors.White,Colors.Gray,Colors.Gray,20)
	
	pnlmainscreen.SendToBack
	pnlmainscreen.Color = Colors.RGB(24, 96, 178)
	pnlmainscreen.AddView(enterusername,35%x,20%y,30%x,10%y)
	pnlmainscreen.AddView(enterpassword,35%x,enterusername.Top + 15%y,30%x,10%y)
	pnlmainscreen.AddView(btnlogin,35%x,50%y,30%x,15%y)
	pnlmainscreen.AddView(btnnoreg,85%x,5%y,14%x,15%y)
	
End Sub

Sub login_Click
	If enterusername.Text = ""  Or enterpassword.Text = "" Then
		ToastMessageShow("Nothing entered!",False)
	Else
		DB.ValidateUser(enterusername.Text,enterpassword.Text)
	End If
End Sub

Sub goback_Click
	CallSub(Main,"ShowHideLoginScreen")
End Sub