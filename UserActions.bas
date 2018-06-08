B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8
@EndOfDesignText@
Sub Class_Globals
	Public TabhostActions As TabHost
	Dim pnl_bets As ScrollView
	Dim pnl_finances,pnl_history As Panel

	Dim textfield As EditText
	Dim Deposit,Withdraw  As Button
	Dim booBuild As Boolean
	
	'	active bets content
	Dim contenthold As Panel
	Dim lblteamAcoef,lblteamBcoef,lblmatchinfo,teamBname,teamAname As Label
	Dim betteamA,betteamB As Button
	Dim betbtntagA , betbtntagB,i As Int = 0
	Dim btnlistA,btnlistB As List

End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	TabhostActions.Initialize("tabhost1")
	pnl_bets.Initialize(-1)
	pnl_finances.Initialize("moneys")
	pnl_history.Initialize("history")
	
	textfield.Initialize("sumfield")
	Deposit.Initialize("deposit")
	Withdraw.Initialize("withdraw")
	
	btnlistA.Initialize
	btnlistB.Initialize
	
	If booBuild = False Then
		Build_UI
		booBuild = True
	End If
	
End Sub

Sub Build_UI
	TabhostActions.AddTab2("Active bets",pnl_bets)
	TabhostActions.AddTab2("Finances",pnl_finances)
	TabhostActions.AddTab2("History",pnl_history)
	Moneymangmt_Contents
	ShowCurrentBets
	
End Sub

Sub ShowCurrentBets
	ActiveBetsCreate
	If contenthold.IsInitialized Then
		ActiveBets_Content
	End If
End Sub

Sub ActiveBets_Content
	pnl_bets.Color = Colors.White
	contenthold.Color = Colors.LightGray
	
	betteamA.Color = Colors.RGB(0, 153, 0)
	betteamA.Text = "Bet"
	betteamA.TextSize = 40
	betteamA.Gravity = Gravity.CENTER
	
	betteamB.Color = Colors.RGB(0, 153, 0)
	betteamB.Text = "Bet"
	betteamB.TextSize = 40
	betteamB.Gravity = Gravity.CENTER
	
	teamAname.TextColor = Colors.Black
	teamBname.TextColor = Colors.Black
	teamAname.TextSize = 30
	teamBname.TextSize = 30
	teamAname.Gravity = Gravity.CENTER
	teamBname.Gravity = Gravity.CENTER

	lblteamAcoef.TextColor = Colors.Black
	lblteamBcoef.TextColor = Colors.Black
	lblteamAcoef.TextSize = 30
	lblteamBcoef.TextSize = 30
	lblteamAcoef.Gravity = Gravity.CENTER
	lblteamBcoef.Gravity = Gravity.CENTER
	lblmatchinfo.TextColor = Colors.Black
	lblmatchinfo.TextSize = 20
	
	betteamA.Tag = betbtntagA
	teamAname.Tag = betteamA.Tag
	betbtntagA = betbtntagA + 1
	btnlistA.Add(teamAname)
		
	betteamB.Tag = betbtntagB
	teamBname.Tag = betteamB.Tag
	betbtntagB = betbtntagB + 1
	btnlistB.Add(teamBname)
End Sub

Sub ActiveBetsCreate
	DB.database.Initialize(File.DirDefaultExternal,"UserAndBetsDatabase.db",True)
	Dim cursor As Cursor
	cursor = DB.database.ExecQuery("SELECT ID,TeamA,TeamAcoef, TeamB, TeamBcoef,MatchInfo FROM Bets")
	For t = 0 To cursor.RowCount - 1
		cursor.Position = t
		contenthold.Initialize("contents")
		teamAname.Initialize("name1")
		teamBname.Initialize("name2")
		lblteamAcoef.Initialize("coef1")
		lblteamBcoef.Initialize("coef2")
		lblmatchinfo.Initialize("info1")
		betteamA.Initialize("btnbetA")
		betteamB.Initialize("btnbetB")
				
		teamAname.Text = cursor.GetString("TeamA")
		teamBname.Text = cursor.GetString("TeamB")
		lblteamAcoef.Text = cursor.GetString("TeamAcoef")
		lblteamBcoef.Text = cursor.GetString("TeamBcoef")
		lblmatchinfo.Text = cursor.GetString("MatchInfo")
		pnl_bets.Panel.AddView(contenthold,0,0+(20%y + 1dip)*i,100%x,20%y)
		i = i + 1
		contenthold.AddView(teamAname,0,0,20%x,10%y)
		contenthold.AddView(lblteamAcoef,0,10%y,20%x,10%y)
		contenthold.AddView(teamBname,60%x,0,20%x,10%y)
		contenthold.AddView(lblteamBcoef,60%x,10%y,20%x,10%y)
		contenthold.AddView(betteamA,20%x,0,10%x,20%y)
		contenthold.AddView(betteamB,50%x,0,10%x,20%y)
		contenthold.AddView(lblmatchinfo,30%x,0,50%x,20%y)
		
		ActiveBets_Content
	Next
	cursor.Close
	DB.database.Close
End Sub

Sub btnbetA_Click
	Dim btn As Button = Sender
	Dim templbl As Label = btnlistA.Get(btn.Tag)
	ToastMessageShow( Types.currentuser.name & " currently betting on " & templbl.Text  ,False)
	CallSub(Main,"BuildPopUpScreen")
	CallSub(Main,"ShowBetsPopUp")
End Sub

Sub btnbetB_Click
	Dim btn As Button = Sender
	Dim templbl As Label = btnlistB.Get(btn.Tag)
	ToastMessageShow( Types.currentuser.name & " currently betting on " & templbl.Text  ,False)
	CallSub(Main,"BuildPopUpScreen")
	CallSub(Main,"ShowBetsPopUp")
End Sub

Sub Moneymangmt_Contents
	pnl_finances.Color = Colors.ARGB(150,0,0,0)
	textfield.InputType = textfield.INPUT_TYPE_NUMBERS
	Deposit.Text = "Deposit"
	Withdraw.Text = "Withdraw"
	HelperFunctions.Apply_ViewStyle(Withdraw,Colors.Black,Colors.White,Colors.White,Colors.LightGray,Colors.LightGray,Colors.DarkGray,Colors.DarkGray,20)
	HelperFunctions.Apply_ViewStyle(Deposit,Colors.Black,Colors.White,Colors.White,Colors.LightGray,Colors.LightGray,Colors.DarkGray,Colors.DarkGray,20)
	HelperFunctions.Apply_ViewStyle(textfield,Colors.Black,Colors.White,Colors.White,Colors.LightGray,Colors.LightGray,Colors.DarkGray,Colors.DarkGray,20)
	
	pnl_finances.AddView(textfield,10%x,20%y,60%x,15%y)
	pnl_finances.AddView(Deposit,10%x,40%y,30%x - 2dip,15%y)
	pnl_finances.AddView(Withdraw,40%x + 2dip,40%y,30%x,15%y)
End Sub

Sub deposit_Click
	If textfield.Text = "" Then
		ToastMessageShow("Nothing entered",False)
	Else
'		Public tmp As login = CallSub(Main,"Get_loginscrn")
		Types.currentuser.money = Types.currentuser.money + textfield.Text
		DB.UserSetMoney(Types.currentuser.money,Types.currentuser.name)
		CallSub2(Main,"DepositWithdrawMoney",Types.currentuser.money)
	End If
End Sub

Sub withdraw_Click
	If textfield.Text = "" Then
		ToastMessageShow("Nothing entered",False)
	Else
		Types.currentuser.money = Types.currentuser.money - textfield.Text
		If Types.currentuser.money < 0 Then
			Types.currentuser.money = 0
		End If
		DB.UserSetMoney(Types.currentuser.money,Types.currentuser.name)
		CallSub2(Main,"DepositWithdrawMoney",Types.currentuser.money)
	End If
End Sub
