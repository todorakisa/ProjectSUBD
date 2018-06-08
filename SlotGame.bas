B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8
@EndOfDesignText@
Sub Class_Globals
	Dim pnlmain As Panel
	Dim spinbtn As Button
	Dim betbtnup As Button
	Dim betbtndown As Button
	Dim lblbetshow As Label
	Dim bettedmoney As Int = 1
	Dim Jackpot As Int
	
	Dim pnlholder1 As Panel
	Dim pnlholder2 As Panel
	Dim pnlholder3 As Panel
	
	Dim pnl1_lbl1 As Label
	Dim pnl1_lbl2 As Label
	Dim pnl1_lbl3 As Label
	Dim pnl1_lbl4 As Label
	Dim pnl1_lbl5 As Label
	
	Dim pnl2_lbl1 As Label
	Dim pnl2_lbl2 As Label
	Dim pnl2_lbl3 As Label
	Dim pnl2_lbl4 As Label
	Dim pnl2_lbl5 As Label
	
	Dim pnl3_lbl1 As Label
	Dim pnl3_lbl2 As Label
	Dim pnl3_lbl3 As Label
	Dim pnl3_lbl4 As Label
	Dim pnl3_lbl5 As Label
	
'	Dim asd() As Int
	
	Dim picture1 As Bitmap =  LoadBitmapSample(File.DirAssets,"cherry.png",32dip,32dip)
	Dim picture2 As Bitmap =  LoadBitmapSample(File.DirAssets,"Watermelon.png",32dip,32dip)
	Dim picture3 As Bitmap =  LoadBitmapSample(File.DirAssets,"bell.png",32dip,32dip)
	Dim picture4 As Bitmap =  LoadBitmapSample(File.DirAssets,"bar.png",32dip,32dip)
	Dim picture5 As Bitmap =  LoadBitmapSample(File.DirAssets,"casino_7.png",32dip,32dip)
	
	Dim SpinTimer As Timer
	Dim SpinTimerAnimationA As Timer
'	Dim SpinTimerAnimationB As Timer
'	Dim SpinTimerAnimationC As Timer
	Dim picmap As Map
	Dim lastPickedInt As Int
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	pnlmain.Initialize("mainpnl")
	spinbtn.Initialize("spinaction")
	
	pnlholder1.Initialize("pnl1")
	pnlholder2.Initialize("pnl2")
	pnlholder3.Initialize("pnl3")
	
	pnl1_lbl1.Initialize("lbl11")
	pnl1_lbl2.Initialize("lbl12")
	pnl1_lbl3.Initialize("lbl13")
	pnl1_lbl4.Initialize("lbl14")
	pnl1_lbl5.Initialize("lbl15")
	
	pnl2_lbl1.Initialize("lbl21")
	pnl2_lbl2.Initialize("lbl22")
	pnl2_lbl3.Initialize("lbl23")
	pnl2_lbl4.Initialize("lbl24")
	pnl2_lbl5.Initialize("lbl25")
	
	pnl3_lbl1.Initialize("lbl31")
	pnl3_lbl2.Initialize("lbl32")
	pnl3_lbl3.Initialize("lbl33")
	pnl3_lbl4.Initialize("lbl34")
	pnl3_lbl5.Initialize("lbl35")
	
	betbtnup.Initialize("betbtn1")
	betbtndown.Initialize("betbtn2")
	lblbetshow.Initialize("betshow")
	
	SpinTimer.Initialize("SpinT",2000)
	SpinTimer.Enabled = False
	SpinTimerAnimationA.Initialize("SpinA",20)
	SpinTimerAnimationA.Enabled = False
	picmap.Initialize
	BuildUI
End Sub

Sub BuildUI
	pnlmain.Color = Colors.RGB(77, 148, 255)
	pnlmain.AddView(spinbtn,30%x,60%y,20%x,10%y)
	pnlmain.AddView(pnlholder1,25%x - 1dip,5%y,10%x,50%y)
	pnlmain.AddView(pnlholder2,35%x,5%y,10%x,50%y)
	pnlmain.AddView(pnlholder3,45%x + 1dip,5%y,10%x,50%y)
	pnlmain.AddView(betbtnup,5%x,35%y,15%x,10%y)
	pnlmain.AddView(betbtndown,5%x,45%y + 2dip,15%x,10%y)
	pnlmain.AddView(lblbetshow,5%x,25%y - 2dip,15%x,10%y)
	pnlholder1.Color = Colors.RGB(166, 166, 166)
	pnlholder2.Color = Colors.RGB(166, 166, 166)
	pnlholder3.Color = Colors.RGB(166, 166, 166)
	spinbtn.Text = "Spin"
	spinbtn.TextSize = 20
	spinbtn.Color = Colors.RGB(255, 71, 26)
	betbtnup.Color = Colors.LightGray
	betbtndown.Color = Colors.LightGray
	betbtnup.Text = "+"
	betbtndown.Text = "-"
	betbtnup.TextSize = 30
	betbtndown.TextSize = 30
	lblbetshow.Color = Colors.White
	lblbetshow.Text = bettedmoney
	lblbetshow.TextSize = 30
	lblbetshow.TextColor = Colors.Black
	lblbetshow.Gravity = Gravity.CENTER
	Addingitemstomap1
	BuildPNLHOLD1
	BuildPNLHOLD2
	BuildPNLHOLD3
End Sub

Sub Addingitemstomap1
	picmap.Put("1",picture1)
	picmap.Put("2",picture2)
	picmap.Put("3",picture3)
	picmap.Put("4",picture4)
	picmap.Put("5",picture5)
End Sub

Sub BuildPNLHOLD1
	pnlholder1.AddView(pnl1_lbl1,0,0,10%x,10%y)
	pnlholder1.AddView(pnl1_lbl2,0,10%y,10%x,10%y)
	pnlholder1.AddView(pnl1_lbl3,0,20%y,10%x,10%y)
	pnlholder1.AddView(pnl1_lbl4,0,30%y,10%x,10%y)
	pnlholder1.AddView(pnl1_lbl5,0,40%y,10%x,10%y)
	
	pnl1_lbl1.SetBackgroundImage(picture1)
	pnl1_lbl2.SetBackgroundImage(picture2)
	pnl1_lbl3.SetBackgroundImage(picture3)
	pnl1_lbl4.SetBackgroundImage(picture4)
	pnl1_lbl5.SetBackgroundImage(picture5)
	
End Sub

Sub BuildPNLHOLD2
	pnlholder2.AddView(pnl2_lbl1,0,0,10%x,10%y)
	pnlholder2.AddView(pnl2_lbl2,0,10%y,10%x,10%y)
	pnlholder2.AddView(pnl2_lbl3,0,20%y,10%x,10%y)
	pnlholder2.AddView(pnl2_lbl4,0,30%y,10%x,10%y)
	pnlholder2.AddView(pnl2_lbl5,0,40%y,10%x,10%y)
	
	pnl2_lbl1.SetBackgroundImage(picture4)
	pnl2_lbl2.SetBackgroundImage(picture3)
	pnl2_lbl3.SetBackgroundImage(picture2)
	pnl2_lbl4.SetBackgroundImage(picture1)
	pnl2_lbl5.SetBackgroundImage(picture5)
End Sub

Sub BuildPNLHOLD3
	pnlholder3.AddView(pnl3_lbl1,0,0,10%x,10%y)
	pnlholder3.AddView(pnl3_lbl2,0,10%y,10%x,10%y)
	pnlholder3.AddView(pnl3_lbl3,0,20%y,10%x,10%y)
	pnlholder3.AddView(pnl3_lbl4,0,30%y,10%x,10%y)
	pnlholder3.AddView(pnl3_lbl5,0,40%y,10%x,10%y)

	pnl3_lbl1.SetBackgroundImage(picture3)
	pnl3_lbl2.SetBackgroundImage(picture2)
	pnl3_lbl3.SetBackgroundImage(picture1)
	pnl3_lbl4.SetBackgroundImage(picture5)
	pnl3_lbl5.SetBackgroundImage(picture4)
End Sub

Sub spinaction_Click
	If Types.currentuser.money < bettedmoney Then
		ToastMessageShow("Not enought money!",False)
	Else
		Types.currentuser.money = Types.currentuser.money - bettedmoney
		DB.UserSetMoney(Types.currentuser.money,Types.currentuser.name)
		SpinTimer.Enabled = True
		SpinTimerAnimationA.Enabled = True
	End If
End Sub

Sub SpinA_Tick
	SpinPanel(pnlholder1)
	SpinPanel(pnlholder2)
	SpinPanel(pnlholder3)
End Sub

Sub SpinPanel (p As Panel)
	For Each v As Label In p.GetAllViewsRecursive
		SetImageandPosition (v)
	Next
End Sub

Sub CheckRow (numRow As Int)
	Dim lb1, lb2, lb3 As Label
	lb1 = pnlholder1.GetView(numRow)
	lb2 = pnlholder2.GetView(numRow)
	lb3 = pnlholder3.GetView(numRow)
	
	Log("Pan1 LaB: tag " & lb1.Tag)
	Log("Pan2 LaB: tag " & lb2.Tag)
	Log("Pan3 LaB: tag " & lb3.Tag)
	
	If (lb1.Tag = lb2.Tag And lb2.Tag = lb3.Tag) Then
		ToastMessageShow("JACKPOT!!!",False)
		If bettedmoney <= 5 Then
			Jackpot = bettedmoney*70
		End If
		
		If bettedmoney > 5 And bettedmoney <= 10 Then
			Jackpot = (bettedmoney*0.5)*Rnd(1,2) + 100*bettedmoney
		End If
		
		If bettedmoney > 10 And bettedmoney <= 15 Then
			Jackpot = (bettedmoney*Rnd(1,4))*100
		End If
		
		If bettedmoney > 15 Then
			Jackpot = Rnd(1,3)*1000*bettedmoney
		End If
		
	
		Types.currentuser.money = Types.currentuser.money + Jackpot
		DB.UserSetMoney(Types.currentuser.money,Types.currentuser.name)
'		CallSub(Main,"AccMoney")
'	
	End If
	
End Sub

Sub SetImageandPosition (l As Label)
	l.SetBackgroundImage(PickRandomImage)
	l.Tag = lastPickedInt
	'	Log(l)
End Sub

Sub PickRandomImage As Bitmap
	lastPickedInt = Rnd(1,5)
	Return picmap.GetValueAt(lastPickedInt)
End Sub

Sub SpinT_Tick
	SpinTimer.Enabled = False
	SpinTimerAnimationA.Enabled = False
	If bettedmoney <= 5 Then
		CheckRow(0)
		CheckRow(1)
		CheckRow(2)
		CheckRow(3)
		CheckRow(4)
	End If
	
	If bettedmoney > 5 And bettedmoney <= 10 Then
		CheckRow(0)
		CheckRow(1)
		CheckRow(2)
		CheckRow(3)
	End If
	If bettedmoney > 10 And bettedmoney <= 15 Then
		CheckRow(0)
		CheckRow(1)
		CheckRow(2)
	End If
	If bettedmoney > 15 Then
		CheckRow(2)
	End If
End Sub

Sub betbtn1_Click
	If bettedmoney < 20 Then
		bettedmoney = bettedmoney + 1
	Else
		ToastMessageShow("Max Bet Reached!",False)
	End If
	lblbetshow.Text = bettedmoney
End Sub
Sub betbtn2_Click
	bettedmoney = bettedmoney - 1
	If bettedmoney < 1 Then
		ToastMessageShow("Minimum Bet Reached",False)
		bettedmoney = 1
	End If
	lblbetshow.Text = bettedmoney
End Sub