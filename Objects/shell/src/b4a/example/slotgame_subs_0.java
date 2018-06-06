package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class slotgame_subs_0 {


public static RemoteObject  _addingitemstomap1(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Addingitemstomap1 (slotgame) ","slotgame",12,__ref.getField(false, "ba"),__ref,119);
if (RapidSub.canDelegate("addingitemstomap1")) return __ref.runUserSub(false, "slotgame","addingitemstomap1", __ref);
 BA.debugLineNum = 119;BA.debugLine="Sub Addingitemstomap1";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 120;BA.debugLine="picmap.Put(\"1\",picture1)";
Debug.ShouldStop(8388608);
__ref.getField(false,"_picmap").runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("1"))),(Object)((__ref.getField(false,"_picture1").getObject())));
 BA.debugLineNum = 121;BA.debugLine="picmap.Put(\"2\",picture2)";
Debug.ShouldStop(16777216);
__ref.getField(false,"_picmap").runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("2"))),(Object)((__ref.getField(false,"_picture2").getObject())));
 BA.debugLineNum = 122;BA.debugLine="picmap.Put(\"3\",picture3)";
Debug.ShouldStop(33554432);
__ref.getField(false,"_picmap").runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("3"))),(Object)((__ref.getField(false,"_picture3").getObject())));
 BA.debugLineNum = 123;BA.debugLine="picmap.Put(\"4\",picture4)";
Debug.ShouldStop(67108864);
__ref.getField(false,"_picmap").runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("4"))),(Object)((__ref.getField(false,"_picture4").getObject())));
 BA.debugLineNum = 124;BA.debugLine="picmap.Put(\"5\",picture5)";
Debug.ShouldStop(134217728);
__ref.getField(false,"_picmap").runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("5"))),(Object)((__ref.getField(false,"_picture5").getObject())));
 BA.debugLineNum = 125;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _betbtn1_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("betbtn1_Click (slotgame) ","slotgame",12,__ref.getField(false, "ba"),__ref,275);
if (RapidSub.canDelegate("betbtn1_click")) return __ref.runUserSub(false, "slotgame","betbtn1_click", __ref);
 BA.debugLineNum = 275;BA.debugLine="Sub betbtn1_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 276;BA.debugLine="If bettedmoney < 20 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("<",__ref.getField(true,"_bettedmoney"),BA.numberCast(double.class, 20))) { 
 BA.debugLineNum = 277;BA.debugLine="bettedmoney = bettedmoney + 1";
Debug.ShouldStop(1048576);
__ref.setField ("_bettedmoney",RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_bettedmoney"),RemoteObject.createImmutable(1)}, "+",1, 1));
 }else {
 BA.debugLineNum = 279;BA.debugLine="ToastMessageShow(\"Max Bet Reached!\",False)";
Debug.ShouldStop(4194304);
slotgame.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Max Bet Reached!")),(Object)(slotgame.__c.getField(true,"False")));
 };
 BA.debugLineNum = 281;BA.debugLine="lblbetshow.Text = bettedmoney";
Debug.ShouldStop(16777216);
__ref.getField(false,"_lblbetshow").runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(true,"_bettedmoney")));
 BA.debugLineNum = 282;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _betbtn2_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("betbtn2_Click (slotgame) ","slotgame",12,__ref.getField(false, "ba"),__ref,283);
if (RapidSub.canDelegate("betbtn2_click")) return __ref.runUserSub(false, "slotgame","betbtn2_click", __ref);
 BA.debugLineNum = 283;BA.debugLine="Sub betbtn2_Click";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 284;BA.debugLine="bettedmoney = bettedmoney - 1";
Debug.ShouldStop(134217728);
__ref.setField ("_bettedmoney",RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_bettedmoney"),RemoteObject.createImmutable(1)}, "-",1, 1));
 BA.debugLineNum = 285;BA.debugLine="If bettedmoney < 1 Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("<",__ref.getField(true,"_bettedmoney"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 286;BA.debugLine="ToastMessageShow(\"Minimum Bet Reached\",False)";
Debug.ShouldStop(536870912);
slotgame.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Minimum Bet Reached")),(Object)(slotgame.__c.getField(true,"False")));
 BA.debugLineNum = 287;BA.debugLine="bettedmoney = 1";
Debug.ShouldStop(1073741824);
__ref.setField ("_bettedmoney",BA.numberCast(int.class, 1));
 };
 BA.debugLineNum = 289;BA.debugLine="lblbetshow.Text = bettedmoney";
Debug.ShouldStop(1);
__ref.getField(false,"_lblbetshow").runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(true,"_bettedmoney")));
 BA.debugLineNum = 290;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buildpnlhold1(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("BuildPNLHOLD1 (slotgame) ","slotgame",12,__ref.getField(false, "ba"),__ref,127);
if (RapidSub.canDelegate("buildpnlhold1")) return __ref.runUserSub(false, "slotgame","buildpnlhold1", __ref);
 BA.debugLineNum = 127;BA.debugLine="Sub BuildPNLHOLD1";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 128;BA.debugLine="pnlholder1.AddView(pnl1_lbl1,0,0,10%x,10%y)";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_pnlholder1").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_pnl1_lbl1").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(slotgame.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))),(Object)(slotgame.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 129;BA.debugLine="pnlholder1.AddView(pnl1_lbl2,0,10%y,10%x,10%y)";
Debug.ShouldStop(1);
__ref.getField(false,"_pnlholder1").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_pnl1_lbl2").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(slotgame.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))),(Object)(slotgame.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))),(Object)(slotgame.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 130;BA.debugLine="pnlholder1.AddView(pnl1_lbl3,0,20%y,10%x,10%y)";
Debug.ShouldStop(2);
__ref.getField(false,"_pnlholder1").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_pnl1_lbl3").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(slotgame.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 20)),__ref.getField(false, "ba"))),(Object)(slotgame.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))),(Object)(slotgame.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 131;BA.debugLine="pnlholder1.AddView(pnl1_lbl4,0,30%y,10%x,10%y)";
Debug.ShouldStop(4);
__ref.getField(false,"_pnlholder1").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_pnl1_lbl4").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(slotgame.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 30)),__ref.getField(false, "ba"))),(Object)(slotgame.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))),(Object)(slotgame.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 132;BA.debugLine="pnlholder1.AddView(pnl1_lbl5,0,40%y,10%x,10%y)";
Debug.ShouldStop(8);
__ref.getField(false,"_pnlholder1").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_pnl1_lbl5").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(slotgame.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 40)),__ref.getField(false, "ba"))),(Object)(slotgame.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))),(Object)(slotgame.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 134;BA.debugLine="pnl1_lbl1.SetBackgroundImage(picture1)";
Debug.ShouldStop(32);
__ref.getField(false,"_pnl1_lbl1").runVoidMethod ("SetBackgroundImageNew",(Object)((__ref.getField(false,"_picture1").getObject())));
 BA.debugLineNum = 135;BA.debugLine="pnl1_lbl2.SetBackgroundImage(picture2)";
Debug.ShouldStop(64);
__ref.getField(false,"_pnl1_lbl2").runVoidMethod ("SetBackgroundImageNew",(Object)((__ref.getField(false,"_picture2").getObject())));
 BA.debugLineNum = 136;BA.debugLine="pnl1_lbl3.SetBackgroundImage(picture3)";
Debug.ShouldStop(128);
__ref.getField(false,"_pnl1_lbl3").runVoidMethod ("SetBackgroundImageNew",(Object)((__ref.getField(false,"_picture3").getObject())));
 BA.debugLineNum = 137;BA.debugLine="pnl1_lbl4.SetBackgroundImage(picture4)";
Debug.ShouldStop(256);
__ref.getField(false,"_pnl1_lbl4").runVoidMethod ("SetBackgroundImageNew",(Object)((__ref.getField(false,"_picture4").getObject())));
 BA.debugLineNum = 138;BA.debugLine="pnl1_lbl5.SetBackgroundImage(picture5)";
Debug.ShouldStop(512);
__ref.getField(false,"_pnl1_lbl5").runVoidMethod ("SetBackgroundImageNew",(Object)((__ref.getField(false,"_picture5").getObject())));
 BA.debugLineNum = 140;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buildpnlhold2(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("BuildPNLHOLD2 (slotgame) ","slotgame",12,__ref.getField(false, "ba"),__ref,142);
if (RapidSub.canDelegate("buildpnlhold2")) return __ref.runUserSub(false, "slotgame","buildpnlhold2", __ref);
 BA.debugLineNum = 142;BA.debugLine="Sub BuildPNLHOLD2";
Debug.ShouldStop(8192);
 BA.debugLineNum = 143;BA.debugLine="pnlholder2.AddView(pnl2_lbl1,0,0,10%x,10%y)";
Debug.ShouldStop(16384);
__ref.getField(false,"_pnlholder2").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_pnl2_lbl1").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(slotgame.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))),(Object)(slotgame.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 144;BA.debugLine="pnlholder2.AddView(pnl2_lbl2,0,10%y,10%x,10%y)";
Debug.ShouldStop(32768);
__ref.getField(false,"_pnlholder2").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_pnl2_lbl2").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(slotgame.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))),(Object)(slotgame.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))),(Object)(slotgame.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 145;BA.debugLine="pnlholder2.AddView(pnl2_lbl3,0,20%y,10%x,10%y)";
Debug.ShouldStop(65536);
__ref.getField(false,"_pnlholder2").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_pnl2_lbl3").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(slotgame.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 20)),__ref.getField(false, "ba"))),(Object)(slotgame.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))),(Object)(slotgame.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 146;BA.debugLine="pnlholder2.AddView(pnl2_lbl4,0,30%y,10%x,10%y)";
Debug.ShouldStop(131072);
__ref.getField(false,"_pnlholder2").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_pnl2_lbl4").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(slotgame.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 30)),__ref.getField(false, "ba"))),(Object)(slotgame.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))),(Object)(slotgame.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 147;BA.debugLine="pnlholder2.AddView(pnl2_lbl5,0,40%y,10%x,10%y)";
Debug.ShouldStop(262144);
__ref.getField(false,"_pnlholder2").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_pnl2_lbl5").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(slotgame.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 40)),__ref.getField(false, "ba"))),(Object)(slotgame.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))),(Object)(slotgame.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 149;BA.debugLine="pnl2_lbl1.SetBackgroundImage(picture4)";
Debug.ShouldStop(1048576);
__ref.getField(false,"_pnl2_lbl1").runVoidMethod ("SetBackgroundImageNew",(Object)((__ref.getField(false,"_picture4").getObject())));
 BA.debugLineNum = 150;BA.debugLine="pnl2_lbl2.SetBackgroundImage(picture3)";
Debug.ShouldStop(2097152);
__ref.getField(false,"_pnl2_lbl2").runVoidMethod ("SetBackgroundImageNew",(Object)((__ref.getField(false,"_picture3").getObject())));
 BA.debugLineNum = 151;BA.debugLine="pnl2_lbl3.SetBackgroundImage(picture2)";
Debug.ShouldStop(4194304);
__ref.getField(false,"_pnl2_lbl3").runVoidMethod ("SetBackgroundImageNew",(Object)((__ref.getField(false,"_picture2").getObject())));
 BA.debugLineNum = 152;BA.debugLine="pnl2_lbl4.SetBackgroundImage(picture1)";
Debug.ShouldStop(8388608);
__ref.getField(false,"_pnl2_lbl4").runVoidMethod ("SetBackgroundImageNew",(Object)((__ref.getField(false,"_picture1").getObject())));
 BA.debugLineNum = 153;BA.debugLine="pnl2_lbl5.SetBackgroundImage(picture5)";
Debug.ShouldStop(16777216);
__ref.getField(false,"_pnl2_lbl5").runVoidMethod ("SetBackgroundImageNew",(Object)((__ref.getField(false,"_picture5").getObject())));
 BA.debugLineNum = 154;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buildpnlhold3(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("BuildPNLHOLD3 (slotgame) ","slotgame",12,__ref.getField(false, "ba"),__ref,156);
if (RapidSub.canDelegate("buildpnlhold3")) return __ref.runUserSub(false, "slotgame","buildpnlhold3", __ref);
 BA.debugLineNum = 156;BA.debugLine="Sub BuildPNLHOLD3";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 157;BA.debugLine="pnlholder3.AddView(pnl3_lbl1,0,0,10%x,10%y)";
Debug.ShouldStop(268435456);
__ref.getField(false,"_pnlholder3").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_pnl3_lbl1").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(slotgame.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))),(Object)(slotgame.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 158;BA.debugLine="pnlholder3.AddView(pnl3_lbl2,0,10%y,10%x,10%y)";
Debug.ShouldStop(536870912);
__ref.getField(false,"_pnlholder3").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_pnl3_lbl2").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(slotgame.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))),(Object)(slotgame.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))),(Object)(slotgame.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 159;BA.debugLine="pnlholder3.AddView(pnl3_lbl3,0,20%y,10%x,10%y)";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_pnlholder3").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_pnl3_lbl3").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(slotgame.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 20)),__ref.getField(false, "ba"))),(Object)(slotgame.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))),(Object)(slotgame.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 160;BA.debugLine="pnlholder3.AddView(pnl3_lbl4,0,30%y,10%x,10%y)";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_pnlholder3").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_pnl3_lbl4").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(slotgame.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 30)),__ref.getField(false, "ba"))),(Object)(slotgame.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))),(Object)(slotgame.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 161;BA.debugLine="pnlholder3.AddView(pnl3_lbl5,0,40%y,10%x,10%y)";
Debug.ShouldStop(1);
__ref.getField(false,"_pnlholder3").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_pnl3_lbl5").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(slotgame.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 40)),__ref.getField(false, "ba"))),(Object)(slotgame.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))),(Object)(slotgame.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 163;BA.debugLine="pnl3_lbl1.SetBackgroundImage(picture3)";
Debug.ShouldStop(4);
__ref.getField(false,"_pnl3_lbl1").runVoidMethod ("SetBackgroundImageNew",(Object)((__ref.getField(false,"_picture3").getObject())));
 BA.debugLineNum = 164;BA.debugLine="pnl3_lbl2.SetBackgroundImage(picture2)";
Debug.ShouldStop(8);
__ref.getField(false,"_pnl3_lbl2").runVoidMethod ("SetBackgroundImageNew",(Object)((__ref.getField(false,"_picture2").getObject())));
 BA.debugLineNum = 165;BA.debugLine="pnl3_lbl3.SetBackgroundImage(picture1)";
Debug.ShouldStop(16);
__ref.getField(false,"_pnl3_lbl3").runVoidMethod ("SetBackgroundImageNew",(Object)((__ref.getField(false,"_picture1").getObject())));
 BA.debugLineNum = 166;BA.debugLine="pnl3_lbl4.SetBackgroundImage(picture5)";
Debug.ShouldStop(32);
__ref.getField(false,"_pnl3_lbl4").runVoidMethod ("SetBackgroundImageNew",(Object)((__ref.getField(false,"_picture5").getObject())));
 BA.debugLineNum = 167;BA.debugLine="pnl3_lbl5.SetBackgroundImage(picture4)";
Debug.ShouldStop(64);
__ref.getField(false,"_pnl3_lbl5").runVoidMethod ("SetBackgroundImageNew",(Object)((__ref.getField(false,"_picture4").getObject())));
 BA.debugLineNum = 168;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buildui(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("BuildUI (slotgame) ","slotgame",12,__ref.getField(false, "ba"),__ref,87);
if (RapidSub.canDelegate("buildui")) return __ref.runUserSub(false, "slotgame","buildui", __ref);
 BA.debugLineNum = 87;BA.debugLine="Sub BuildUI";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 88;BA.debugLine="pnlmain.Color = Colors.RGB(77, 148, 255)";
Debug.ShouldStop(8388608);
__ref.getField(false,"_pnlmain").runVoidMethod ("setColor",slotgame.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 77)),(Object)(BA.numberCast(int.class, 148)),(Object)(BA.numberCast(int.class, 255))));
 BA.debugLineNum = 89;BA.debugLine="pnlmain.AddView(spinbtn,30%x,60%y,20%x,10%y)";
Debug.ShouldStop(16777216);
__ref.getField(false,"_pnlmain").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_spinbtn").getObject())),(Object)(slotgame.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 30)),__ref.getField(false, "ba"))),(Object)(slotgame.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 60)),__ref.getField(false, "ba"))),(Object)(slotgame.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 20)),__ref.getField(false, "ba"))),(Object)(slotgame.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 90;BA.debugLine="pnlmain.AddView(pnlholder1,25%x - 1dip,5%y,10%x,5";
Debug.ShouldStop(33554432);
__ref.getField(false,"_pnlmain").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_pnlholder1").getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {slotgame.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 25)),__ref.getField(false, "ba")),slotgame.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))}, "-",1, 1)),(Object)(slotgame.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))),(Object)(slotgame.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))),(Object)(slotgame.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 50)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 91;BA.debugLine="pnlmain.AddView(pnlholder2,35%x,5%y,10%x,50%y)";
Debug.ShouldStop(67108864);
__ref.getField(false,"_pnlmain").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_pnlholder2").getObject())),(Object)(slotgame.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 35)),__ref.getField(false, "ba"))),(Object)(slotgame.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))),(Object)(slotgame.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))),(Object)(slotgame.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 50)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 92;BA.debugLine="pnlmain.AddView(pnlholder3,45%x + 1dip,5%y,10%x,5";
Debug.ShouldStop(134217728);
__ref.getField(false,"_pnlmain").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_pnlholder3").getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {slotgame.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 45)),__ref.getField(false, "ba")),slotgame.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))}, "+",1, 1)),(Object)(slotgame.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))),(Object)(slotgame.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))),(Object)(slotgame.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 50)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 93;BA.debugLine="pnlmain.AddView(betbtnup,5%x,35%y,15%x,10%y)";
Debug.ShouldStop(268435456);
__ref.getField(false,"_pnlmain").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_betbtnup").getObject())),(Object)(slotgame.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))),(Object)(slotgame.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 35)),__ref.getField(false, "ba"))),(Object)(slotgame.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),__ref.getField(false, "ba"))),(Object)(slotgame.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 94;BA.debugLine="pnlmain.AddView(betbtndown,5%x,45%y + 2dip,15%x,1";
Debug.ShouldStop(536870912);
__ref.getField(false,"_pnlmain").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_betbtndown").getObject())),(Object)(slotgame.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))),(Object)(RemoteObject.solve(new RemoteObject[] {slotgame.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 45)),__ref.getField(false, "ba")),slotgame.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))}, "+",1, 1)),(Object)(slotgame.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),__ref.getField(false, "ba"))),(Object)(slotgame.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 95;BA.debugLine="pnlmain.AddView(lblbetshow,5%x,25%y - 2dip,15%x,1";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_pnlmain").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_lblbetshow").getObject())),(Object)(slotgame.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))),(Object)(RemoteObject.solve(new RemoteObject[] {slotgame.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 25)),__ref.getField(false, "ba")),slotgame.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))}, "-",1, 1)),(Object)(slotgame.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),__ref.getField(false, "ba"))),(Object)(slotgame.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 96;BA.debugLine="pnlholder1.Color = Colors.RGB(166, 166, 166)";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_pnlholder1").runVoidMethod ("setColor",slotgame.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 166)),(Object)(BA.numberCast(int.class, 166)),(Object)(BA.numberCast(int.class, 166))));
 BA.debugLineNum = 97;BA.debugLine="pnlholder2.Color = Colors.RGB(166, 166, 166)";
Debug.ShouldStop(1);
__ref.getField(false,"_pnlholder2").runVoidMethod ("setColor",slotgame.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 166)),(Object)(BA.numberCast(int.class, 166)),(Object)(BA.numberCast(int.class, 166))));
 BA.debugLineNum = 98;BA.debugLine="pnlholder3.Color = Colors.RGB(166, 166, 166)";
Debug.ShouldStop(2);
__ref.getField(false,"_pnlholder3").runVoidMethod ("setColor",slotgame.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 166)),(Object)(BA.numberCast(int.class, 166)),(Object)(BA.numberCast(int.class, 166))));
 BA.debugLineNum = 99;BA.debugLine="spinbtn.Text = \"Spin\"";
Debug.ShouldStop(4);
__ref.getField(false,"_spinbtn").runMethod(true,"setText",BA.ObjectToCharSequence("Spin"));
 BA.debugLineNum = 100;BA.debugLine="spinbtn.TextSize = 20";
Debug.ShouldStop(8);
__ref.getField(false,"_spinbtn").runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 101;BA.debugLine="spinbtn.Color = Colors.RGB(255, 71, 26)";
Debug.ShouldStop(16);
__ref.getField(false,"_spinbtn").runVoidMethod ("setColor",slotgame.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 71)),(Object)(BA.numberCast(int.class, 26))));
 BA.debugLineNum = 102;BA.debugLine="betbtnup.Color = Colors.LightGray";
Debug.ShouldStop(32);
__ref.getField(false,"_betbtnup").runVoidMethod ("setColor",slotgame.__c.getField(false,"Colors").getField(true,"LightGray"));
 BA.debugLineNum = 103;BA.debugLine="betbtndown.Color = Colors.LightGray";
Debug.ShouldStop(64);
__ref.getField(false,"_betbtndown").runVoidMethod ("setColor",slotgame.__c.getField(false,"Colors").getField(true,"LightGray"));
 BA.debugLineNum = 104;BA.debugLine="betbtnup.Text = \"+\"";
Debug.ShouldStop(128);
__ref.getField(false,"_betbtnup").runMethod(true,"setText",BA.ObjectToCharSequence("+"));
 BA.debugLineNum = 105;BA.debugLine="betbtndown.Text = \"-\"";
Debug.ShouldStop(256);
__ref.getField(false,"_betbtndown").runMethod(true,"setText",BA.ObjectToCharSequence("-"));
 BA.debugLineNum = 106;BA.debugLine="betbtnup.TextSize = 30";
Debug.ShouldStop(512);
__ref.getField(false,"_betbtnup").runMethod(true,"setTextSize",BA.numberCast(float.class, 30));
 BA.debugLineNum = 107;BA.debugLine="betbtndown.TextSize = 30";
Debug.ShouldStop(1024);
__ref.getField(false,"_betbtndown").runMethod(true,"setTextSize",BA.numberCast(float.class, 30));
 BA.debugLineNum = 108;BA.debugLine="lblbetshow.Color = Colors.White";
Debug.ShouldStop(2048);
__ref.getField(false,"_lblbetshow").runVoidMethod ("setColor",slotgame.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 109;BA.debugLine="lblbetshow.Text = bettedmoney";
Debug.ShouldStop(4096);
__ref.getField(false,"_lblbetshow").runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(true,"_bettedmoney")));
 BA.debugLineNum = 110;BA.debugLine="lblbetshow.TextSize = 30";
Debug.ShouldStop(8192);
__ref.getField(false,"_lblbetshow").runMethod(true,"setTextSize",BA.numberCast(float.class, 30));
 BA.debugLineNum = 111;BA.debugLine="lblbetshow.TextColor = Colors.Black";
Debug.ShouldStop(16384);
__ref.getField(false,"_lblbetshow").runMethod(true,"setTextColor",slotgame.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 112;BA.debugLine="lblbetshow.Gravity = Gravity.CENTER";
Debug.ShouldStop(32768);
__ref.getField(false,"_lblbetshow").runMethod(true,"setGravity",slotgame.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 113;BA.debugLine="Addingitemstomap1";
Debug.ShouldStop(65536);
__ref.runClassMethod (b4a.example.slotgame.class, "_addingitemstomap1");
 BA.debugLineNum = 114;BA.debugLine="BuildPNLHOLD1";
Debug.ShouldStop(131072);
__ref.runClassMethod (b4a.example.slotgame.class, "_buildpnlhold1");
 BA.debugLineNum = 115;BA.debugLine="BuildPNLHOLD2";
Debug.ShouldStop(262144);
__ref.runClassMethod (b4a.example.slotgame.class, "_buildpnlhold2");
 BA.debugLineNum = 116;BA.debugLine="BuildPNLHOLD3";
Debug.ShouldStop(524288);
__ref.runClassMethod (b4a.example.slotgame.class, "_buildpnlhold3");
 BA.debugLineNum = 117;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _checkrow(RemoteObject __ref,RemoteObject _numrow) throws Exception{
try {
		Debug.PushSubsStack("CheckRow (slotgame) ","slotgame",12,__ref.getField(false, "ba"),__ref,200);
if (RapidSub.canDelegate("checkrow")) return __ref.runUserSub(false, "slotgame","checkrow", __ref, _numrow);
RemoteObject _lb1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _lb2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _lb3 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
Debug.locals.put("numRow", _numrow);
 BA.debugLineNum = 200;BA.debugLine="Sub CheckRow (numRow As Int)";
Debug.ShouldStop(128);
 BA.debugLineNum = 201;BA.debugLine="Dim lb1, lb2, lb3 As Label";
Debug.ShouldStop(256);
_lb1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lb1", _lb1);
_lb2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lb2", _lb2);
_lb3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lb3", _lb3);
 BA.debugLineNum = 202;BA.debugLine="lb1 = pnlholder1.GetView(numRow)";
Debug.ShouldStop(512);
_lb1.setObject(__ref.getField(false,"_pnlholder1").runMethod(false,"GetView",(Object)(_numrow)).getObject());
 BA.debugLineNum = 203;BA.debugLine="lb2 = pnlholder2.GetView(numRow)";
Debug.ShouldStop(1024);
_lb2.setObject(__ref.getField(false,"_pnlholder2").runMethod(false,"GetView",(Object)(_numrow)).getObject());
 BA.debugLineNum = 204;BA.debugLine="lb3 = pnlholder3.GetView(numRow)";
Debug.ShouldStop(2048);
_lb3.setObject(__ref.getField(false,"_pnlholder3").runMethod(false,"GetView",(Object)(_numrow)).getObject());
 BA.debugLineNum = 206;BA.debugLine="Log(\"Pan1 LaB: tag \" & lb1.Tag)";
Debug.ShouldStop(8192);
slotgame.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Pan1 LaB: tag "),_lb1.runMethod(false,"getTag"))));
 BA.debugLineNum = 207;BA.debugLine="Log(\"Pan2 LaB: tag \" & lb2.Tag)";
Debug.ShouldStop(16384);
slotgame.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Pan2 LaB: tag "),_lb2.runMethod(false,"getTag"))));
 BA.debugLineNum = 208;BA.debugLine="Log(\"Pan3 LaB: tag \" & lb3.Tag)";
Debug.ShouldStop(32768);
slotgame.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Pan3 LaB: tag "),_lb3.runMethod(false,"getTag"))));
 BA.debugLineNum = 210;BA.debugLine="If (lb1.Tag = lb2.Tag And lb2.Tag = lb3.Tag) Then";
Debug.ShouldStop(131072);
if ((RemoteObject.solveBoolean("=",_lb1.runMethod(false,"getTag"),_lb2.runMethod(false,"getTag")) && RemoteObject.solveBoolean("=",_lb2.runMethod(false,"getTag"),_lb3.runMethod(false,"getTag")))) { 
 BA.debugLineNum = 211;BA.debugLine="ToastMessageShow(\"JACKPOT!!!\",False)";
Debug.ShouldStop(262144);
slotgame.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("JACKPOT!!!")),(Object)(slotgame.__c.getField(true,"False")));
 BA.debugLineNum = 212;BA.debugLine="If bettedmoney <= 5 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("k",__ref.getField(true,"_bettedmoney"),BA.numberCast(double.class, 5))) { 
 BA.debugLineNum = 213;BA.debugLine="Jackpot = bettedmoney*70";
Debug.ShouldStop(1048576);
__ref.setField ("_jackpot",RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_bettedmoney"),RemoteObject.createImmutable(70)}, "*",0, 1));
 };
 BA.debugLineNum = 216;BA.debugLine="If bettedmoney > 5 And bettedmoney <= 10 Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_bettedmoney"),BA.numberCast(double.class, 5)) && RemoteObject.solveBoolean("k",__ref.getField(true,"_bettedmoney"),BA.numberCast(double.class, 10))) { 
 BA.debugLineNum = 217;BA.debugLine="Jackpot = (bettedmoney*0.5)*Rnd(1,2) + 100*bett";
Debug.ShouldStop(16777216);
__ref.setField ("_jackpot",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_bettedmoney"),RemoteObject.createImmutable(0.5)}, "*",0, 0)),slotgame.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 2))),RemoteObject.createImmutable(100),__ref.getField(true,"_bettedmoney")}, "*+*",1, 0)));
 };
 BA.debugLineNum = 220;BA.debugLine="If bettedmoney > 10 And bettedmoney <= 15 Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_bettedmoney"),BA.numberCast(double.class, 10)) && RemoteObject.solveBoolean("k",__ref.getField(true,"_bettedmoney"),BA.numberCast(double.class, 15))) { 
 BA.debugLineNum = 221;BA.debugLine="Jackpot = (bettedmoney*Rnd(1,4))*100";
Debug.ShouldStop(268435456);
__ref.setField ("_jackpot",RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_bettedmoney"),slotgame.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 4)))}, "*",0, 1)),RemoteObject.createImmutable(100)}, "*",0, 1));
 };
 BA.debugLineNum = 224;BA.debugLine="If bettedmoney > 15 Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_bettedmoney"),BA.numberCast(double.class, 15))) { 
 BA.debugLineNum = 225;BA.debugLine="Jackpot = Rnd(1,3)*1000*bettedmoney";
Debug.ShouldStop(1);
__ref.setField ("_jackpot",RemoteObject.solve(new RemoteObject[] {slotgame.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3))),RemoteObject.createImmutable(1000),__ref.getField(true,"_bettedmoney")}, "**",0, 1));
 };
 BA.debugLineNum = 229;BA.debugLine="Main.currentuser.money = Main.currentuser.money";
Debug.ShouldStop(16);
slotgame._main._currentuser.setField ("money",RemoteObject.solve(new RemoteObject[] {slotgame._main._currentuser.getField(true,"money"),__ref.getField(true,"_jackpot")}, "+",1, 0));
 BA.debugLineNum = 230;BA.debugLine="Main.database.ExecNonQuery(\"UPDATE  Users SET Mo";
Debug.ShouldStop(32);
slotgame._main._database.runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE  Users SET Money = '"),slotgame._main._currentuser.getField(true,"money"),RemoteObject.createImmutable("' WHERE Username = '"),slotgame._main._currentuser.getField(true,"name"),RemoteObject.createImmutable("'"))));
 BA.debugLineNum = 231;BA.debugLine="CallSub(Main,\"AccMoney\")";
Debug.ShouldStop(64);
slotgame.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)((slotgame._main.getObject())),(Object)(RemoteObject.createImmutable("AccMoney")));
 };
 BA.debugLineNum = 235;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Dim pnlmain As Panel";
slotgame._pnlmain = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnlmain",slotgame._pnlmain);
 //BA.debugLineNum = 3;BA.debugLine="Dim spinbtn As Button";
slotgame._spinbtn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_spinbtn",slotgame._spinbtn);
 //BA.debugLineNum = 4;BA.debugLine="Dim betbtnup As Button";
slotgame._betbtnup = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_betbtnup",slotgame._betbtnup);
 //BA.debugLineNum = 5;BA.debugLine="Dim betbtndown As Button";
slotgame._betbtndown = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_betbtndown",slotgame._betbtndown);
 //BA.debugLineNum = 6;BA.debugLine="Dim lblbetshow As Label";
slotgame._lblbetshow = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblbetshow",slotgame._lblbetshow);
 //BA.debugLineNum = 7;BA.debugLine="Dim bettedmoney As Int = 1";
slotgame._bettedmoney = BA.numberCast(int.class, 1);__ref.setField("_bettedmoney",slotgame._bettedmoney);
 //BA.debugLineNum = 8;BA.debugLine="Dim Jackpot As Int";
slotgame._jackpot = RemoteObject.createImmutable(0);__ref.setField("_jackpot",slotgame._jackpot);
 //BA.debugLineNum = 10;BA.debugLine="Dim pnlholder1 As Panel";
slotgame._pnlholder1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnlholder1",slotgame._pnlholder1);
 //BA.debugLineNum = 11;BA.debugLine="Dim pnlholder2 As Panel";
slotgame._pnlholder2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnlholder2",slotgame._pnlholder2);
 //BA.debugLineNum = 12;BA.debugLine="Dim pnlholder3 As Panel";
slotgame._pnlholder3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnlholder3",slotgame._pnlholder3);
 //BA.debugLineNum = 14;BA.debugLine="Dim pnl1_lbl1 As Label";
slotgame._pnl1_lbl1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_pnl1_lbl1",slotgame._pnl1_lbl1);
 //BA.debugLineNum = 15;BA.debugLine="Dim pnl1_lbl2 As Label";
slotgame._pnl1_lbl2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_pnl1_lbl2",slotgame._pnl1_lbl2);
 //BA.debugLineNum = 16;BA.debugLine="Dim pnl1_lbl3 As Label";
slotgame._pnl1_lbl3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_pnl1_lbl3",slotgame._pnl1_lbl3);
 //BA.debugLineNum = 17;BA.debugLine="Dim pnl1_lbl4 As Label";
slotgame._pnl1_lbl4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_pnl1_lbl4",slotgame._pnl1_lbl4);
 //BA.debugLineNum = 18;BA.debugLine="Dim pnl1_lbl5 As Label";
slotgame._pnl1_lbl5 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_pnl1_lbl5",slotgame._pnl1_lbl5);
 //BA.debugLineNum = 20;BA.debugLine="Dim pnl2_lbl1 As Label";
slotgame._pnl2_lbl1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_pnl2_lbl1",slotgame._pnl2_lbl1);
 //BA.debugLineNum = 21;BA.debugLine="Dim pnl2_lbl2 As Label";
slotgame._pnl2_lbl2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_pnl2_lbl2",slotgame._pnl2_lbl2);
 //BA.debugLineNum = 22;BA.debugLine="Dim pnl2_lbl3 As Label";
slotgame._pnl2_lbl3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_pnl2_lbl3",slotgame._pnl2_lbl3);
 //BA.debugLineNum = 23;BA.debugLine="Dim pnl2_lbl4 As Label";
slotgame._pnl2_lbl4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_pnl2_lbl4",slotgame._pnl2_lbl4);
 //BA.debugLineNum = 24;BA.debugLine="Dim pnl2_lbl5 As Label";
slotgame._pnl2_lbl5 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_pnl2_lbl5",slotgame._pnl2_lbl5);
 //BA.debugLineNum = 26;BA.debugLine="Dim pnl3_lbl1 As Label";
slotgame._pnl3_lbl1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_pnl3_lbl1",slotgame._pnl3_lbl1);
 //BA.debugLineNum = 27;BA.debugLine="Dim pnl3_lbl2 As Label";
slotgame._pnl3_lbl2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_pnl3_lbl2",slotgame._pnl3_lbl2);
 //BA.debugLineNum = 28;BA.debugLine="Dim pnl3_lbl3 As Label";
slotgame._pnl3_lbl3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_pnl3_lbl3",slotgame._pnl3_lbl3);
 //BA.debugLineNum = 29;BA.debugLine="Dim pnl3_lbl4 As Label";
slotgame._pnl3_lbl4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_pnl3_lbl4",slotgame._pnl3_lbl4);
 //BA.debugLineNum = 30;BA.debugLine="Dim pnl3_lbl5 As Label";
slotgame._pnl3_lbl5 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_pnl3_lbl5",slotgame._pnl3_lbl5);
 //BA.debugLineNum = 32;BA.debugLine="Dim asd() As Int";
slotgame._asd = RemoteObject.createNewArray ("int", new int[] {0}, new Object[]{});__ref.setField("_asd",slotgame._asd);
 //BA.debugLineNum = 34;BA.debugLine="Dim picture1 As Bitmap =  LoadBitmapSample(File.D";
slotgame._picture1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
slotgame._picture1 = slotgame.__c.runMethod(false,"LoadBitmapSample",(Object)(slotgame.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("cherry.png")),(Object)(slotgame.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 32)))),(Object)(slotgame.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 32)))));__ref.setField("_picture1",slotgame._picture1);
 //BA.debugLineNum = 35;BA.debugLine="Dim picture2 As Bitmap =  LoadBitmapSample(File.D";
slotgame._picture2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
slotgame._picture2 = slotgame.__c.runMethod(false,"LoadBitmapSample",(Object)(slotgame.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("Watermelon.png")),(Object)(slotgame.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 32)))),(Object)(slotgame.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 32)))));__ref.setField("_picture2",slotgame._picture2);
 //BA.debugLineNum = 36;BA.debugLine="Dim picture3 As Bitmap =  LoadBitmapSample(File.D";
slotgame._picture3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
slotgame._picture3 = slotgame.__c.runMethod(false,"LoadBitmapSample",(Object)(slotgame.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("bell.png")),(Object)(slotgame.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 32)))),(Object)(slotgame.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 32)))));__ref.setField("_picture3",slotgame._picture3);
 //BA.debugLineNum = 37;BA.debugLine="Dim picture4 As Bitmap =  LoadBitmapSample(File.D";
slotgame._picture4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
slotgame._picture4 = slotgame.__c.runMethod(false,"LoadBitmapSample",(Object)(slotgame.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("bar.png")),(Object)(slotgame.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 32)))),(Object)(slotgame.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 32)))));__ref.setField("_picture4",slotgame._picture4);
 //BA.debugLineNum = 38;BA.debugLine="Dim picture5 As Bitmap =  LoadBitmapSample(File.D";
slotgame._picture5 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
slotgame._picture5 = slotgame.__c.runMethod(false,"LoadBitmapSample",(Object)(slotgame.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("casino_7.png")),(Object)(slotgame.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 32)))),(Object)(slotgame.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 32)))));__ref.setField("_picture5",slotgame._picture5);
 //BA.debugLineNum = 40;BA.debugLine="Dim SpinTimer As Timer";
slotgame._spintimer = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");__ref.setField("_spintimer",slotgame._spintimer);
 //BA.debugLineNum = 41;BA.debugLine="Dim SpinTimerAnimationA As Timer";
slotgame._spintimeranimationa = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");__ref.setField("_spintimeranimationa",slotgame._spintimeranimationa);
 //BA.debugLineNum = 42;BA.debugLine="Dim SpinTimerAnimationB As Timer";
slotgame._spintimeranimationb = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");__ref.setField("_spintimeranimationb",slotgame._spintimeranimationb);
 //BA.debugLineNum = 43;BA.debugLine="Dim SpinTimerAnimationC As Timer";
slotgame._spintimeranimationc = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");__ref.setField("_spintimeranimationc",slotgame._spintimeranimationc);
 //BA.debugLineNum = 44;BA.debugLine="Dim picmap As Map";
slotgame._picmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_picmap",slotgame._picmap);
 //BA.debugLineNum = 45;BA.debugLine="Dim lastPickedInt As Int";
slotgame._lastpickedint = RemoteObject.createImmutable(0);__ref.setField("_lastpickedint",slotgame._lastpickedint);
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (slotgame) ","slotgame",12,__ref.getField(false, "ba"),__ref,49);
if (RapidSub.canDelegate("initialize")) return __ref.runUserSub(false, "slotgame","initialize", __ref, _ba);
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 49;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(65536);
 BA.debugLineNum = 50;BA.debugLine="pnlmain.Initialize(\"mainpnl\")";
Debug.ShouldStop(131072);
__ref.getField(false,"_pnlmain").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("mainpnl")));
 BA.debugLineNum = 51;BA.debugLine="spinbtn.Initialize(\"spinaction\")";
Debug.ShouldStop(262144);
__ref.getField(false,"_spinbtn").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("spinaction")));
 BA.debugLineNum = 53;BA.debugLine="pnlholder1.Initialize(\"pnl1\")";
Debug.ShouldStop(1048576);
__ref.getField(false,"_pnlholder1").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("pnl1")));
 BA.debugLineNum = 54;BA.debugLine="pnlholder2.Initialize(\"pnl2\")";
Debug.ShouldStop(2097152);
__ref.getField(false,"_pnlholder2").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("pnl2")));
 BA.debugLineNum = 55;BA.debugLine="pnlholder3.Initialize(\"pnl3\")";
Debug.ShouldStop(4194304);
__ref.getField(false,"_pnlholder3").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("pnl3")));
 BA.debugLineNum = 57;BA.debugLine="pnl1_lbl1.Initialize(\"lbl11\")";
Debug.ShouldStop(16777216);
__ref.getField(false,"_pnl1_lbl1").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("lbl11")));
 BA.debugLineNum = 58;BA.debugLine="pnl1_lbl2.Initialize(\"lbl12\")";
Debug.ShouldStop(33554432);
__ref.getField(false,"_pnl1_lbl2").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("lbl12")));
 BA.debugLineNum = 59;BA.debugLine="pnl1_lbl3.Initialize(\"lbl13\")";
Debug.ShouldStop(67108864);
__ref.getField(false,"_pnl1_lbl3").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("lbl13")));
 BA.debugLineNum = 60;BA.debugLine="pnl1_lbl4.Initialize(\"lbl14\")";
Debug.ShouldStop(134217728);
__ref.getField(false,"_pnl1_lbl4").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("lbl14")));
 BA.debugLineNum = 61;BA.debugLine="pnl1_lbl5.Initialize(\"lbl15\")";
Debug.ShouldStop(268435456);
__ref.getField(false,"_pnl1_lbl5").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("lbl15")));
 BA.debugLineNum = 63;BA.debugLine="pnl2_lbl1.Initialize(\"lbl21\")";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_pnl2_lbl1").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("lbl21")));
 BA.debugLineNum = 64;BA.debugLine="pnl2_lbl2.Initialize(\"lbl22\")";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_pnl2_lbl2").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("lbl22")));
 BA.debugLineNum = 65;BA.debugLine="pnl2_lbl3.Initialize(\"lbl23\")";
Debug.ShouldStop(1);
__ref.getField(false,"_pnl2_lbl3").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("lbl23")));
 BA.debugLineNum = 66;BA.debugLine="pnl2_lbl4.Initialize(\"lbl24\")";
Debug.ShouldStop(2);
__ref.getField(false,"_pnl2_lbl4").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("lbl24")));
 BA.debugLineNum = 67;BA.debugLine="pnl2_lbl5.Initialize(\"lbl25\")";
Debug.ShouldStop(4);
__ref.getField(false,"_pnl2_lbl5").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("lbl25")));
 BA.debugLineNum = 69;BA.debugLine="pnl3_lbl1.Initialize(\"lbl31\")";
Debug.ShouldStop(16);
__ref.getField(false,"_pnl3_lbl1").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("lbl31")));
 BA.debugLineNum = 70;BA.debugLine="pnl3_lbl2.Initialize(\"lbl32\")";
Debug.ShouldStop(32);
__ref.getField(false,"_pnl3_lbl2").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("lbl32")));
 BA.debugLineNum = 71;BA.debugLine="pnl3_lbl3.Initialize(\"lbl33\")";
Debug.ShouldStop(64);
__ref.getField(false,"_pnl3_lbl3").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("lbl33")));
 BA.debugLineNum = 72;BA.debugLine="pnl3_lbl4.Initialize(\"lbl34\")";
Debug.ShouldStop(128);
__ref.getField(false,"_pnl3_lbl4").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("lbl34")));
 BA.debugLineNum = 73;BA.debugLine="pnl3_lbl5.Initialize(\"lbl35\")";
Debug.ShouldStop(256);
__ref.getField(false,"_pnl3_lbl5").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("lbl35")));
 BA.debugLineNum = 75;BA.debugLine="betbtnup.Initialize(\"betbtn1\")";
Debug.ShouldStop(1024);
__ref.getField(false,"_betbtnup").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("betbtn1")));
 BA.debugLineNum = 76;BA.debugLine="betbtndown.Initialize(\"betbtn2\")";
Debug.ShouldStop(2048);
__ref.getField(false,"_betbtndown").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("betbtn2")));
 BA.debugLineNum = 77;BA.debugLine="lblbetshow.Initialize(\"betshow\")";
Debug.ShouldStop(4096);
__ref.getField(false,"_lblbetshow").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("betshow")));
 BA.debugLineNum = 79;BA.debugLine="SpinTimer.Initialize(\"SpinT\",2000)";
Debug.ShouldStop(16384);
__ref.getField(false,"_spintimer").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("SpinT")),(Object)(BA.numberCast(long.class, 2000)));
 BA.debugLineNum = 80;BA.debugLine="SpinTimer.Enabled = False";
Debug.ShouldStop(32768);
__ref.getField(false,"_spintimer").runMethod(true,"setEnabled",slotgame.__c.getField(true,"False"));
 BA.debugLineNum = 81;BA.debugLine="SpinTimerAnimationA.Initialize(\"SpinA\",20)";
Debug.ShouldStop(65536);
__ref.getField(false,"_spintimeranimationa").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("SpinA")),(Object)(BA.numberCast(long.class, 20)));
 BA.debugLineNum = 82;BA.debugLine="SpinTimerAnimationA.Enabled = False";
Debug.ShouldStop(131072);
__ref.getField(false,"_spintimeranimationa").runMethod(true,"setEnabled",slotgame.__c.getField(true,"False"));
 BA.debugLineNum = 83;BA.debugLine="picmap.Initialize";
Debug.ShouldStop(262144);
__ref.getField(false,"_picmap").runVoidMethod ("Initialize");
 BA.debugLineNum = 84;BA.debugLine="BuildUI";
Debug.ShouldStop(524288);
__ref.runClassMethod (b4a.example.slotgame.class, "_buildui");
 BA.debugLineNum = 85;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pickrandomimage(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("PickRandomImage (slotgame) ","slotgame",12,__ref.getField(false, "ba"),__ref,243);
if (RapidSub.canDelegate("pickrandomimage")) return __ref.runUserSub(false, "slotgame","pickrandomimage", __ref);
 BA.debugLineNum = 243;BA.debugLine="Sub PickRandomImage As Bitmap";
Debug.ShouldStop(262144);
 BA.debugLineNum = 244;BA.debugLine="lastPickedInt = Rnd(1,5)";
Debug.ShouldStop(524288);
__ref.setField ("_lastpickedint",slotgame.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 5))));
 BA.debugLineNum = 245;BA.debugLine="Return picmap.GetValueAt(lastPickedInt)";
Debug.ShouldStop(1048576);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), __ref.getField(false,"_picmap").runMethod(false,"GetValueAt",(Object)(__ref.getField(true,"_lastpickedint"))));
 BA.debugLineNum = 246;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setimageandposition(RemoteObject __ref,RemoteObject _l) throws Exception{
try {
		Debug.PushSubsStack("SetImageandPosition (slotgame) ","slotgame",12,__ref.getField(false, "ba"),__ref,237);
if (RapidSub.canDelegate("setimageandposition")) return __ref.runUserSub(false, "slotgame","setimageandposition", __ref, _l);
Debug.locals.put("l", _l);
 BA.debugLineNum = 237;BA.debugLine="Sub SetImageandPosition (l As Label)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 238;BA.debugLine="l.SetBackgroundImage(PickRandomImage)";
Debug.ShouldStop(8192);
_l.runVoidMethod ("SetBackgroundImageNew",(Object)((__ref.runClassMethod (b4a.example.slotgame.class, "_pickrandomimage").getObject())));
 BA.debugLineNum = 239;BA.debugLine="l.Tag = lastPickedInt";
Debug.ShouldStop(16384);
_l.runMethod(false,"setTag",(__ref.getField(true,"_lastpickedint")));
 BA.debugLineNum = 241;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _spina_tick(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SpinA_Tick (slotgame) ","slotgame",12,__ref.getField(false, "ba"),__ref,188);
if (RapidSub.canDelegate("spina_tick")) return __ref.runUserSub(false, "slotgame","spina_tick", __ref);
 BA.debugLineNum = 188;BA.debugLine="Sub SpinA_Tick";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 189;BA.debugLine="SpinPanel(pnlholder1)";
Debug.ShouldStop(268435456);
__ref.runClassMethod (b4a.example.slotgame.class, "_spinpanel",(Object)(__ref.getField(false,"_pnlholder1")));
 BA.debugLineNum = 190;BA.debugLine="SpinPanel(pnlholder2)";
Debug.ShouldStop(536870912);
__ref.runClassMethod (b4a.example.slotgame.class, "_spinpanel",(Object)(__ref.getField(false,"_pnlholder2")));
 BA.debugLineNum = 191;BA.debugLine="SpinPanel(pnlholder3)";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (b4a.example.slotgame.class, "_spinpanel",(Object)(__ref.getField(false,"_pnlholder3")));
 BA.debugLineNum = 192;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _spinaction_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("spinaction_Click (slotgame) ","slotgame",12,__ref.getField(false, "ba"),__ref,170);
if (RapidSub.canDelegate("spinaction_click")) return __ref.runUserSub(false, "slotgame","spinaction_click", __ref);
 BA.debugLineNum = 170;BA.debugLine="Sub spinaction_Click";
Debug.ShouldStop(512);
 BA.debugLineNum = 171;BA.debugLine="If Main.currentuser.money < bettedmoney Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("<",slotgame._main._currentuser.getField(true,"money"),BA.numberCast(double.class, __ref.getField(true,"_bettedmoney")))) { 
 BA.debugLineNum = 172;BA.debugLine="ToastMessageShow(\"Not enought money!\",False)";
Debug.ShouldStop(2048);
slotgame.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Not enought money!")),(Object)(slotgame.__c.getField(true,"False")));
 }else {
 BA.debugLineNum = 176;BA.debugLine="Main.currentuser.money = Main.currentuser.money";
Debug.ShouldStop(32768);
slotgame._main._currentuser.setField ("money",RemoteObject.solve(new RemoteObject[] {slotgame._main._currentuser.getField(true,"money"),__ref.getField(true,"_bettedmoney")}, "-",1, 0));
 BA.debugLineNum = 177;BA.debugLine="Main.database.ExecNonQuery(\"UPDATE  Users SET Mo";
Debug.ShouldStop(65536);
slotgame._main._database.runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE  Users SET Money = '"),slotgame._main._currentuser.getField(true,"money"),RemoteObject.createImmutable("' WHERE Username = '"),slotgame._main._currentuser.getField(true,"name"),RemoteObject.createImmutable("'"))));
 BA.debugLineNum = 178;BA.debugLine="CallSub(Main,\"AccMoney\")";
Debug.ShouldStop(131072);
slotgame.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)((slotgame._main.getObject())),(Object)(RemoteObject.createImmutable("AccMoney")));
 BA.debugLineNum = 183;BA.debugLine="SpinTimer.Enabled = True";
Debug.ShouldStop(4194304);
__ref.getField(false,"_spintimer").runMethod(true,"setEnabled",slotgame.__c.getField(true,"True"));
 BA.debugLineNum = 184;BA.debugLine="SpinTimerAnimationA.Enabled = True";
Debug.ShouldStop(8388608);
__ref.getField(false,"_spintimeranimationa").runMethod(true,"setEnabled",slotgame.__c.getField(true,"True"));
 };
 BA.debugLineNum = 186;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _spinpanel(RemoteObject __ref,RemoteObject _p) throws Exception{
try {
		Debug.PushSubsStack("SpinPanel (slotgame) ","slotgame",12,__ref.getField(false, "ba"),__ref,194);
if (RapidSub.canDelegate("spinpanel")) return __ref.runUserSub(false, "slotgame","spinpanel", __ref, _p);
RemoteObject _v = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
Debug.locals.put("p", _p);
 BA.debugLineNum = 194;BA.debugLine="Sub SpinPanel (p As Panel)";
Debug.ShouldStop(2);
 BA.debugLineNum = 195;BA.debugLine="For Each v As Label In p.GetAllViewsRecursive";
Debug.ShouldStop(4);
_v = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
{
final RemoteObject group1 = _p.runMethod(false,"GetAllViewsRecursive");
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_v.setObject(group1.runMethod(false,"Get",index1));
Debug.locals.put("v", _v);
 BA.debugLineNum = 196;BA.debugLine="SetImageandPosition (v)";
Debug.ShouldStop(8);
__ref.runClassMethod (b4a.example.slotgame.class, "_setimageandposition",(Object)(_v));
 }
}Debug.locals.put("v", _v);
;
 BA.debugLineNum = 198;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _spint_tick(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SpinT_Tick (slotgame) ","slotgame",12,__ref.getField(false, "ba"),__ref,248);
if (RapidSub.canDelegate("spint_tick")) return __ref.runUserSub(false, "slotgame","spint_tick", __ref);
 BA.debugLineNum = 248;BA.debugLine="Sub SpinT_Tick";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 249;BA.debugLine="SpinTimer.Enabled = False";
Debug.ShouldStop(16777216);
__ref.getField(false,"_spintimer").runMethod(true,"setEnabled",slotgame.__c.getField(true,"False"));
 BA.debugLineNum = 250;BA.debugLine="SpinTimerAnimationA.Enabled = False";
Debug.ShouldStop(33554432);
__ref.getField(false,"_spintimeranimationa").runMethod(true,"setEnabled",slotgame.__c.getField(true,"False"));
 BA.debugLineNum = 251;BA.debugLine="If bettedmoney <= 5 Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("k",__ref.getField(true,"_bettedmoney"),BA.numberCast(double.class, 5))) { 
 BA.debugLineNum = 252;BA.debugLine="CheckRow(0)";
Debug.ShouldStop(134217728);
__ref.runClassMethod (b4a.example.slotgame.class, "_checkrow",(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 253;BA.debugLine="CheckRow(1)";
Debug.ShouldStop(268435456);
__ref.runClassMethod (b4a.example.slotgame.class, "_checkrow",(Object)(BA.numberCast(int.class, 1)));
 BA.debugLineNum = 254;BA.debugLine="CheckRow(2)";
Debug.ShouldStop(536870912);
__ref.runClassMethod (b4a.example.slotgame.class, "_checkrow",(Object)(BA.numberCast(int.class, 2)));
 BA.debugLineNum = 255;BA.debugLine="CheckRow(3)";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (b4a.example.slotgame.class, "_checkrow",(Object)(BA.numberCast(int.class, 3)));
 BA.debugLineNum = 256;BA.debugLine="CheckRow(4)";
Debug.ShouldStop(-2147483648);
__ref.runClassMethod (b4a.example.slotgame.class, "_checkrow",(Object)(BA.numberCast(int.class, 4)));
 };
 BA.debugLineNum = 259;BA.debugLine="If bettedmoney > 5 And bettedmoney <= 10 Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_bettedmoney"),BA.numberCast(double.class, 5)) && RemoteObject.solveBoolean("k",__ref.getField(true,"_bettedmoney"),BA.numberCast(double.class, 10))) { 
 BA.debugLineNum = 260;BA.debugLine="CheckRow(0)";
Debug.ShouldStop(8);
__ref.runClassMethod (b4a.example.slotgame.class, "_checkrow",(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 261;BA.debugLine="CheckRow(1)";
Debug.ShouldStop(16);
__ref.runClassMethod (b4a.example.slotgame.class, "_checkrow",(Object)(BA.numberCast(int.class, 1)));
 BA.debugLineNum = 262;BA.debugLine="CheckRow(2)";
Debug.ShouldStop(32);
__ref.runClassMethod (b4a.example.slotgame.class, "_checkrow",(Object)(BA.numberCast(int.class, 2)));
 BA.debugLineNum = 263;BA.debugLine="CheckRow(3)";
Debug.ShouldStop(64);
__ref.runClassMethod (b4a.example.slotgame.class, "_checkrow",(Object)(BA.numberCast(int.class, 3)));
 };
 BA.debugLineNum = 265;BA.debugLine="If bettedmoney > 10 And bettedmoney <= 15 Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_bettedmoney"),BA.numberCast(double.class, 10)) && RemoteObject.solveBoolean("k",__ref.getField(true,"_bettedmoney"),BA.numberCast(double.class, 15))) { 
 BA.debugLineNum = 266;BA.debugLine="CheckRow(0)";
Debug.ShouldStop(512);
__ref.runClassMethod (b4a.example.slotgame.class, "_checkrow",(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 267;BA.debugLine="CheckRow(1)";
Debug.ShouldStop(1024);
__ref.runClassMethod (b4a.example.slotgame.class, "_checkrow",(Object)(BA.numberCast(int.class, 1)));
 BA.debugLineNum = 268;BA.debugLine="CheckRow(2)";
Debug.ShouldStop(2048);
__ref.runClassMethod (b4a.example.slotgame.class, "_checkrow",(Object)(BA.numberCast(int.class, 2)));
 };
 BA.debugLineNum = 270;BA.debugLine="If bettedmoney > 15 Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_bettedmoney"),BA.numberCast(double.class, 15))) { 
 BA.debugLineNum = 271;BA.debugLine="CheckRow(2)";
Debug.ShouldStop(16384);
__ref.runClassMethod (b4a.example.slotgame.class, "_checkrow",(Object)(BA.numberCast(int.class, 2)));
 };
 BA.debugLineNum = 273;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}