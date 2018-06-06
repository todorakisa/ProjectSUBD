B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8
@EndOfDesignText@
Sub Class_Globals
	Public TabhostActions As TabHost
	Dim pnl_bets As ScrollView
	Dim pnl_add_bets As Panel
	Dim pnl_currentUsers As Panel
	
	Dim textfield As EditText
	Dim Deposit  As Button
	Dim Withdraw As Button
	
	Dim booBuild As Boolean
'	adding current users contents
	Dim lbl_showusers As Label
'	adding bets contents
	Dim teamA As EditText
	Dim teamB As EditText
	Dim teamAcoef As EditText
	Dim teamBcoef As EditText
	Dim matchinfo As EditText
	Dim submit As Button
	
'	active bets content
	Dim contenthold As Panel
	Dim teamAname As Label
	Dim teamBname As Label
	Dim lblteamAcoef As Label
	Dim lblteamBcoef As Label
	Dim lblmatchinfo As Label
	Dim betteamA As Button
	Dim betteamB As Button
	Dim i As Int = 0
	Dim betbtntag As Int = 0
	
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	TabhostActions.Initialize("tabhost1")
	pnl_bets.Initialize(-1)
	pnl_add_bets.Initialize("moneys")
	pnl_currentUsers.Initialize("users")
	
	lbl_showusers.Initialize("showusers")
	
	textfield.Initialize("sumfield")
	Deposit.Initialize("deposit")
	Withdraw.Initialize("withdraw")
'	adding bets inits
	teamA.Initialize("team1")
	teamB.Initialize("team2")
	teamAcoef.Initialize("team1c")
	teamBcoef.Initialize("team2c")
	matchinfo.Initialize("matchinfo")
	submit.Initialize("submit")
	If booBuild = False Then
		Build_UI
		booBuild = True
	End If
	
End Sub

Sub Build_UI
	TabhostActions.AddTab2("Active bets",pnl_bets)
	TabhostActions.AddTab2("Add Bets",pnl_add_bets)
	TabhostActions.AddTab2("Users",pnl_currentUsers)
	AddBets_Contents
	CurrentUsers
	
	ShowCurrentBets
	
End Sub

Sub ShowCurrentBets
	ActiveBetsCreate
	If contenthold.IsInitialized Then
		ActiveBets_Content
	End If
End Sub

Sub CurrentUsers
	pnl_currentUsers.Color = Colors.White
	pnl_currentUsers.AddView(lbl_showusers,0,0,100%x,100%y)
	lbl_showusers.TextColor = Colors.Black
	lbl_showusers.Text = "USERNAME/PASSWORD/MONEY/RANK/" & CRLF
	Dim cursor1 As Cursor
	DB.database.Initialize(File.DirDefaultExternal,"UserAndBetsDatabase.db",True)
	cursor1 = DB.database.ExecQuery("SELECT Username, Password, Money, Rank FROM Users")
	For k = 0 To cursor1.RowCount - 1
		cursor1.Position = k
		lbl_showusers.Text =lbl_showusers.Text & cursor1.GetString("Username") & "/" & cursor1.GetString("Password") & "/" & cursor1.GetString("Money") & "/" & cursor1.GetString("Rank") & CRLF
	Next
	cursor1.Close
	DB.database.Close
End Sub

Sub AddBets_Contents
	pnl_add_bets.Color = Colors.White
	pnl_add_bets.AddView(teamA,10%x,10%y,15%x,10%y)
	pnl_add_bets.AddView(teamB,55%x,10%y,15%x,10%y)
	teamA.Hint = "TeamA"
	teamB.Hint = "TeamB"
	pnl_add_bets.AddView(teamAcoef,10%x,22%y,15%x,10%y)
	pnl_add_bets.AddView(teamBcoef,55%x,22%y,15%x,10%y)
	teamAcoef.Hint = "Coeficient"
	teamBcoef.Hint = "Coeficient"
	teamAcoef.InputType = teamAcoef.INPUT_TYPE_DECIMAL_NUMBERS
	teamBcoef.InputType = teamBcoef.INPUT_TYPE_DECIMAL_NUMBERS
	pnl_add_bets.AddView(matchinfo,10%x,40%y,60%x,25%y)
	matchinfo.Wrap = True
	pnl_add_bets.AddView(submit,30%x,70%y,10%x,10%y)
	submit.Text = "Submit"
	submit.Color = Colors.RGB(0, 153, 51)
	
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
	betteamA.Tag = betbtntag
	betbtntag = betbtntag + 1
	
		
	betteamB.Tag = betbtntag
	betbtntag = betbtntag + 1
End Sub

Sub submit_Click
	
	If teamA.Text = "" Or teamB.Text = "" Then
		ToastMessageShow("Missing information",False)
	Else
		If teamAcoef.Text = "" Or teamBcoef.Text = "" Then
			ToastMessageShow("Missing information",False)
		Else
			
			ActiveBetsCreate
		End If
	End If
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
		betteamA.Initialize("btn1")
		betteamB.Initialize("btn2")
				
	
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