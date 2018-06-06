B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8
@EndOfDesignText@
Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
	Type user(name As String,password As String,money As Double,rank As String)
	Public CurrentUser As user
End Sub

Public Sub IsAdmin As Boolean
	If CurrentUser.rank = "Admin" Then
		Return True
	Else
		Return False
	End If
End Sub