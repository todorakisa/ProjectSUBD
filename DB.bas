﻿B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8
@EndOfDesignText@
'Code module
'Subs in this code module will be accessible from all modules.
Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
	Public database As SQL

End Sub

Public Sub DATABASEinit
	database.Initialize(File.DirDefaultExternal,"AppDB.db",True)
End Sub

Public Sub TablesCreate
	database.ExecNonQuery("CREATE TABLE Users (Username TEXT,Password TEXT,Money DOUBLE,Rank TEXT,TypeOfUser INTEGER)")
	database.ExecNonQuery("CREATE TABLE Bets (ID INTEGER PRIMARY KEY AUTOINCREMENT,TeamA TEXT,TeamAcoef TEXT,TeamB TEXT,TeamBcoef TEXT,MatchInfo TEXT)")
End Sub

Public Sub DataBaseCreateUser(username As String,password As String)
	database.Initialize(File.DirDefaultExternal,"AppDB.db",True)
	database.ExecNonQuery("INSERT INTO Users (Username,Password,Money,Rank) VALUES ('"& username &"','"& password &"','0.00','user')")
	database.Close
End Sub

Public Sub CreateAdmin
	database.Initialize(File.DirDefaultExternal,"AppDB.db",True)
	database.ExecNonQuery("INSERT INTO Users (Username,Password,Money,Rank) VALUES ('admin','admin','0.00','Admin')")
	database.Close
End Sub

Public Sub ValidateUser(username As String,password As String)
	database.Initialize(File.DirDefaultExternal,"AppDB.db",True)
	Dim cursor As Cursor
	cursor = database.ExecQuery("SELECT Username, Password, Money, Rank FROM Users")
	For i = 0 To cursor.RowCount - 1
		cursor.Position = i
		If cursor.GetString("Username") = username Then
			If cursor.GetString("Password") = password Then
				Types.currentuser.name = username
				Types.currentuser.money = cursor.GetDouble("Money")
				Types.currentuser.rank = cursor.GetString("Rank")
				ToastMessageShow("Login Successful!",False)
				CallSub(Main,"BuildInterface")
				CallSub(Main,"ShowHideMainUI")
			Else
				ToastMessageShow("Wrong password!",False)
			End If
		Else
			ToastMessageShow("Wrong username!",False)
		End If
	Next
	cursor.Close
	database.Close
End Sub

Public Sub UserSetMoney(money As Double,username As String)
	database.Initialize(File.DirDefaultExternal,"AppDB.db",True)
	database.ExecNonQuery("UPDATE  Users SET Money = '" & money &"' WHERE Username = '"& username &"'")
	database.Close
End Sub

Public Sub CreateBet(teamA As String,teamAcoef As String,teamB As String,teamBcoef As String,matchinfo As String)
	database.Initialize(File.DirDefaultExternal,"AppDB.db",True)
	database.ExecNonQuery("INSERT INTO Bets (TeamA,TeamAcoef,TeamB,TeamBcoef,MatchInfo) VALUES ('"&teamA&"','"&teamAcoef&"','"&teamB&"','"&teamBcoef&"','"&matchinfo&"')")
	database.Close
End Sub

Public Sub UserSetRank(rank As String,username As String)
	database.Initialize(File.DirDefaultExternal,"AppDB.db",True)
	database.ExecNonQuery("UPDATE  Users SET Rank = '" & rank &"' WHERE Username = '"& username &"'")
	database.Close
End Sub
