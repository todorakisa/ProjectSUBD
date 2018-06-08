B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8
@EndOfDesignText@
Sub Class_Globals
	Dim pnlmainscreen,pnlleftmenu As Panel
	Dim avataricon,btn_logout,slotmachine As Button
	Dim avatarimg As Bitmap = LoadBitmapSample(File.DirAssets,"avatar.png",215dip,215dip)
	Dim accountname,accountbalance,accountrank,showbalance,showrank As Label
	Dim actionsforuser As UserActions
	Dim actionsforadmin As AdminActions
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	actionsforuser.Initialize
	actionsforadmin.Initialize
	
	pnlmainscreen.Initialize("mainscreen")
	pnlleftmenu.Initialize("leftmenu")
	'pnluppermenu.Initialize("uppermenu")
 
	avataricon.Initialize("")
	accountname.Initialize("")
	accountrank.Initialize("")
	accountbalance.Initialize("")
	showbalance.Initialize("")
	showrank.Initialize("")
	btn_logout.Initialize("logout")
	slotmachine.Initialize("slotz")
	
End Sub
Sub AsView As View
	Return pnlmainscreen
End Sub
Sub Build_UI
	pnlmainscreen.Color = Colors.RGB(24, 96, 178)
	
	
	pnlleftmenu.Color = Colors.ARGB(150,0,0,0)
	avataricon.SetBackgroundImage(avatarimg)

	accountname.Text = Types.currentuser.name
	accountname.TextSize = 30
	If accountname.Text.Length > 6 Then
		accountname.TextSize = 20
	End If
	accountname.TextColor = Colors.White

	accountrank.Text = "Rank:"
	showrank.Text =  Types.currentuser.rank
	accountrank.TextSize = 20
	showrank.TextSize = 20
	accountrank.TextColor = Colors.White
	showrank.TextColor = Colors.White
	
	accountbalance.Text = Types.currentuser.money
	accountbalance.Textsize = 20
	accountbalance.TextColor = Colors.White

	btn_logout.Text = "Log out"
	HelperFunctions.Apply_ViewStyle(btn_logout,Colors.Black,Colors.White,Colors.White,Colors.LightGray,Colors.LightGray,Colors.Gray,Colors.Gray,20)

	slotmachine.Text = "Slots"
	HelperFunctions.Apply_ViewStyle(slotmachine,Colors.Black,Colors.White,Colors.White,Colors.LightGray,Colors.LightGray,Colors.Gray,Colors.Gray,20)

	If Types.IsAdmin = True Then
		pnlmainscreen.AddView(actionsforadmin.TabhostActions,20%x - 5dip,0%y,82%x,100%y)
	Else 
		pnlmainscreen.AddView(actionsforuser.TabhostActions,20%x - 5dip,0%y,82%x,100%y)
	End If

	pnlmainscreen.AddView(pnlleftmenu,0,0,20%x,100%y)
	pnlleftmenu.AddView(avataricon,0,0,20%x,25%y)
	pnlleftmenu.AddView(accountname,pnlleftmenu.Left + 1%x,25%y,pnlleftmenu.Width - 2%x,10%y)
	pnlleftmenu.AddView(accountrank,pnlleftmenu.Left + 1%x,35%y,pnlleftmenu.Width/2,10%y)
	pnlleftmenu.AddView(showrank,(accountrank.Left + accountrank.Width) + 1%x,35%y,pnlleftmenu.Width/2,10%y)
	pnlleftmenu.AddView(accountbalance,pnlleftmenu.Left + 1%x,45%y,pnlleftmenu.Width - 2%x,10%y)
	pnlleftmenu.AddView(slotmachine,pnlleftmenu.Left + 1%x,65%y,pnlleftmenu.Width - 2%x,accountname.Height)
	pnlleftmenu.AddView(btn_logout,pnlleftmenu.Left + 1%x,(slotmachine.Top+slotmachine.Height) + 5%y,pnlleftmenu.Width - 2%x,slotmachine.Height)
End Sub
Sub slotz_Click
	CallSub(Main,"ShowHideSlotGame")
End Sub

Sub logout_Click
	CallSub(Main,"ShowHideMainUI")
End Sub