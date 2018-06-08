package b4a.VankoBet;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class slotgame extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.VankoBet.slotgame");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.VankoBet.slotgame.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlmain = null;
public anywheresoftware.b4a.objects.ButtonWrapper _spinbtn = null;
public anywheresoftware.b4a.objects.ButtonWrapper _betbtnup = null;
public anywheresoftware.b4a.objects.ButtonWrapper _betbtndown = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblbetshow = null;
public int _bettedmoney = 0;
public int _jackpot = 0;
public anywheresoftware.b4a.objects.PanelWrapper _pnlholder1 = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlholder2 = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlholder3 = null;
public anywheresoftware.b4a.objects.LabelWrapper _pnl1_lbl1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _pnl1_lbl2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _pnl1_lbl3 = null;
public anywheresoftware.b4a.objects.LabelWrapper _pnl1_lbl4 = null;
public anywheresoftware.b4a.objects.LabelWrapper _pnl1_lbl5 = null;
public anywheresoftware.b4a.objects.LabelWrapper _pnl2_lbl1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _pnl2_lbl2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _pnl2_lbl3 = null;
public anywheresoftware.b4a.objects.LabelWrapper _pnl2_lbl4 = null;
public anywheresoftware.b4a.objects.LabelWrapper _pnl2_lbl5 = null;
public anywheresoftware.b4a.objects.LabelWrapper _pnl3_lbl1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _pnl3_lbl2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _pnl3_lbl3 = null;
public anywheresoftware.b4a.objects.LabelWrapper _pnl3_lbl4 = null;
public anywheresoftware.b4a.objects.LabelWrapper _pnl3_lbl5 = null;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _picture1 = null;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _picture2 = null;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _picture3 = null;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _picture4 = null;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _picture5 = null;
public anywheresoftware.b4a.objects.Timer _spintimer = null;
public anywheresoftware.b4a.objects.Timer _spintimeranimationa = null;
public anywheresoftware.b4a.objects.collections.Map _picmap = null;
public int _lastpickedint = 0;
public b4a.VankoBet.main _main = null;
public b4a.VankoBet.db _db = null;
public b4a.VankoBet.types _types = null;
public b4a.VankoBet.starter _starter = null;
public b4a.VankoBet.helperfunctions _helperfunctions = null;
public String  _addingitemstomap1() throws Exception{
 //BA.debugLineNum = 119;BA.debugLine="Sub Addingitemstomap1";
 //BA.debugLineNum = 120;BA.debugLine="picmap.Put(\"1\",picture1)";
_picmap.Put((Object)("1"),(Object)(_picture1.getObject()));
 //BA.debugLineNum = 121;BA.debugLine="picmap.Put(\"2\",picture2)";
_picmap.Put((Object)("2"),(Object)(_picture2.getObject()));
 //BA.debugLineNum = 122;BA.debugLine="picmap.Put(\"3\",picture3)";
_picmap.Put((Object)("3"),(Object)(_picture3.getObject()));
 //BA.debugLineNum = 123;BA.debugLine="picmap.Put(\"4\",picture4)";
_picmap.Put((Object)("4"),(Object)(_picture4.getObject()));
 //BA.debugLineNum = 124;BA.debugLine="picmap.Put(\"5\",picture5)";
_picmap.Put((Object)("5"),(Object)(_picture5.getObject()));
 //BA.debugLineNum = 125;BA.debugLine="End Sub";
return "";
}
public String  _betbtn1_click() throws Exception{
 //BA.debugLineNum = 268;BA.debugLine="Sub betbtn1_Click";
 //BA.debugLineNum = 269;BA.debugLine="If bettedmoney < 20 Then";
if (_bettedmoney<20) { 
 //BA.debugLineNum = 270;BA.debugLine="bettedmoney = bettedmoney + 1";
_bettedmoney = (int) (_bettedmoney+1);
 }else {
 //BA.debugLineNum = 272;BA.debugLine="ToastMessageShow(\"Max Bet Reached!\",False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("Max Bet Reached!"),__c.False);
 };
 //BA.debugLineNum = 274;BA.debugLine="lblbetshow.Text = bettedmoney";
_lblbetshow.setText(BA.ObjectToCharSequence(_bettedmoney));
 //BA.debugLineNum = 275;BA.debugLine="End Sub";
return "";
}
public String  _betbtn2_click() throws Exception{
 //BA.debugLineNum = 276;BA.debugLine="Sub betbtn2_Click";
 //BA.debugLineNum = 277;BA.debugLine="bettedmoney = bettedmoney - 1";
_bettedmoney = (int) (_bettedmoney-1);
 //BA.debugLineNum = 278;BA.debugLine="If bettedmoney < 1 Then";
if (_bettedmoney<1) { 
 //BA.debugLineNum = 279;BA.debugLine="ToastMessageShow(\"Minimum Bet Reached\",False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("Minimum Bet Reached"),__c.False);
 //BA.debugLineNum = 280;BA.debugLine="bettedmoney = 1";
_bettedmoney = (int) (1);
 };
 //BA.debugLineNum = 282;BA.debugLine="lblbetshow.Text = bettedmoney";
_lblbetshow.setText(BA.ObjectToCharSequence(_bettedmoney));
 //BA.debugLineNum = 283;BA.debugLine="End Sub";
return "";
}
public String  _buildpnlhold1() throws Exception{
 //BA.debugLineNum = 127;BA.debugLine="Sub BuildPNLHOLD1";
 //BA.debugLineNum = 128;BA.debugLine="pnlholder1.AddView(pnl1_lbl1,0,0,10%x,10%y)";
_pnlholder1.AddView((android.view.View)(_pnl1_lbl1.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 129;BA.debugLine="pnlholder1.AddView(pnl1_lbl2,0,10%y,10%x,10%y)";
_pnlholder1.AddView((android.view.View)(_pnl1_lbl2.getObject()),(int) (0),__c.PerYToCurrent((float) (10),ba),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 130;BA.debugLine="pnlholder1.AddView(pnl1_lbl3,0,20%y,10%x,10%y)";
_pnlholder1.AddView((android.view.View)(_pnl1_lbl3.getObject()),(int) (0),__c.PerYToCurrent((float) (20),ba),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 131;BA.debugLine="pnlholder1.AddView(pnl1_lbl4,0,30%y,10%x,10%y)";
_pnlholder1.AddView((android.view.View)(_pnl1_lbl4.getObject()),(int) (0),__c.PerYToCurrent((float) (30),ba),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 132;BA.debugLine="pnlholder1.AddView(pnl1_lbl5,0,40%y,10%x,10%y)";
_pnlholder1.AddView((android.view.View)(_pnl1_lbl5.getObject()),(int) (0),__c.PerYToCurrent((float) (40),ba),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 134;BA.debugLine="pnl1_lbl1.SetBackgroundImage(picture1)";
_pnl1_lbl1.SetBackgroundImageNew((android.graphics.Bitmap)(_picture1.getObject()));
 //BA.debugLineNum = 135;BA.debugLine="pnl1_lbl2.SetBackgroundImage(picture2)";
_pnl1_lbl2.SetBackgroundImageNew((android.graphics.Bitmap)(_picture2.getObject()));
 //BA.debugLineNum = 136;BA.debugLine="pnl1_lbl3.SetBackgroundImage(picture3)";
_pnl1_lbl3.SetBackgroundImageNew((android.graphics.Bitmap)(_picture3.getObject()));
 //BA.debugLineNum = 137;BA.debugLine="pnl1_lbl4.SetBackgroundImage(picture4)";
_pnl1_lbl4.SetBackgroundImageNew((android.graphics.Bitmap)(_picture4.getObject()));
 //BA.debugLineNum = 138;BA.debugLine="pnl1_lbl5.SetBackgroundImage(picture5)";
_pnl1_lbl5.SetBackgroundImageNew((android.graphics.Bitmap)(_picture5.getObject()));
 //BA.debugLineNum = 140;BA.debugLine="End Sub";
return "";
}
public String  _buildpnlhold2() throws Exception{
 //BA.debugLineNum = 142;BA.debugLine="Sub BuildPNLHOLD2";
 //BA.debugLineNum = 143;BA.debugLine="pnlholder2.AddView(pnl2_lbl1,0,0,10%x,10%y)";
_pnlholder2.AddView((android.view.View)(_pnl2_lbl1.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 144;BA.debugLine="pnlholder2.AddView(pnl2_lbl2,0,10%y,10%x,10%y)";
_pnlholder2.AddView((android.view.View)(_pnl2_lbl2.getObject()),(int) (0),__c.PerYToCurrent((float) (10),ba),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 145;BA.debugLine="pnlholder2.AddView(pnl2_lbl3,0,20%y,10%x,10%y)";
_pnlholder2.AddView((android.view.View)(_pnl2_lbl3.getObject()),(int) (0),__c.PerYToCurrent((float) (20),ba),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 146;BA.debugLine="pnlholder2.AddView(pnl2_lbl4,0,30%y,10%x,10%y)";
_pnlholder2.AddView((android.view.View)(_pnl2_lbl4.getObject()),(int) (0),__c.PerYToCurrent((float) (30),ba),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 147;BA.debugLine="pnlholder2.AddView(pnl2_lbl5,0,40%y,10%x,10%y)";
_pnlholder2.AddView((android.view.View)(_pnl2_lbl5.getObject()),(int) (0),__c.PerYToCurrent((float) (40),ba),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 149;BA.debugLine="pnl2_lbl1.SetBackgroundImage(picture4)";
_pnl2_lbl1.SetBackgroundImageNew((android.graphics.Bitmap)(_picture4.getObject()));
 //BA.debugLineNum = 150;BA.debugLine="pnl2_lbl2.SetBackgroundImage(picture3)";
_pnl2_lbl2.SetBackgroundImageNew((android.graphics.Bitmap)(_picture3.getObject()));
 //BA.debugLineNum = 151;BA.debugLine="pnl2_lbl3.SetBackgroundImage(picture2)";
_pnl2_lbl3.SetBackgroundImageNew((android.graphics.Bitmap)(_picture2.getObject()));
 //BA.debugLineNum = 152;BA.debugLine="pnl2_lbl4.SetBackgroundImage(picture1)";
_pnl2_lbl4.SetBackgroundImageNew((android.graphics.Bitmap)(_picture1.getObject()));
 //BA.debugLineNum = 153;BA.debugLine="pnl2_lbl5.SetBackgroundImage(picture5)";
_pnl2_lbl5.SetBackgroundImageNew((android.graphics.Bitmap)(_picture5.getObject()));
 //BA.debugLineNum = 154;BA.debugLine="End Sub";
return "";
}
public String  _buildpnlhold3() throws Exception{
 //BA.debugLineNum = 156;BA.debugLine="Sub BuildPNLHOLD3";
 //BA.debugLineNum = 157;BA.debugLine="pnlholder3.AddView(pnl3_lbl1,0,0,10%x,10%y)";
_pnlholder3.AddView((android.view.View)(_pnl3_lbl1.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 158;BA.debugLine="pnlholder3.AddView(pnl3_lbl2,0,10%y,10%x,10%y)";
_pnlholder3.AddView((android.view.View)(_pnl3_lbl2.getObject()),(int) (0),__c.PerYToCurrent((float) (10),ba),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 159;BA.debugLine="pnlholder3.AddView(pnl3_lbl3,0,20%y,10%x,10%y)";
_pnlholder3.AddView((android.view.View)(_pnl3_lbl3.getObject()),(int) (0),__c.PerYToCurrent((float) (20),ba),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 160;BA.debugLine="pnlholder3.AddView(pnl3_lbl4,0,30%y,10%x,10%y)";
_pnlholder3.AddView((android.view.View)(_pnl3_lbl4.getObject()),(int) (0),__c.PerYToCurrent((float) (30),ba),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 161;BA.debugLine="pnlholder3.AddView(pnl3_lbl5,0,40%y,10%x,10%y)";
_pnlholder3.AddView((android.view.View)(_pnl3_lbl5.getObject()),(int) (0),__c.PerYToCurrent((float) (40),ba),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 163;BA.debugLine="pnl3_lbl1.SetBackgroundImage(picture3)";
_pnl3_lbl1.SetBackgroundImageNew((android.graphics.Bitmap)(_picture3.getObject()));
 //BA.debugLineNum = 164;BA.debugLine="pnl3_lbl2.SetBackgroundImage(picture2)";
_pnl3_lbl2.SetBackgroundImageNew((android.graphics.Bitmap)(_picture2.getObject()));
 //BA.debugLineNum = 165;BA.debugLine="pnl3_lbl3.SetBackgroundImage(picture1)";
_pnl3_lbl3.SetBackgroundImageNew((android.graphics.Bitmap)(_picture1.getObject()));
 //BA.debugLineNum = 166;BA.debugLine="pnl3_lbl4.SetBackgroundImage(picture5)";
_pnl3_lbl4.SetBackgroundImageNew((android.graphics.Bitmap)(_picture5.getObject()));
 //BA.debugLineNum = 167;BA.debugLine="pnl3_lbl5.SetBackgroundImage(picture4)";
_pnl3_lbl5.SetBackgroundImageNew((android.graphics.Bitmap)(_picture4.getObject()));
 //BA.debugLineNum = 168;BA.debugLine="End Sub";
return "";
}
public String  _buildui() throws Exception{
 //BA.debugLineNum = 87;BA.debugLine="Sub BuildUI";
 //BA.debugLineNum = 88;BA.debugLine="pnlmain.Color = Colors.RGB(77, 148, 255)";
_pnlmain.setColor(__c.Colors.RGB((int) (77),(int) (148),(int) (255)));
 //BA.debugLineNum = 89;BA.debugLine="pnlmain.AddView(spinbtn,30%x,60%y,20%x,10%y)";
_pnlmain.AddView((android.view.View)(_spinbtn.getObject()),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (60),ba),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 90;BA.debugLine="pnlmain.AddView(pnlholder1,25%x - 1dip,5%y,10%x,5";
_pnlmain.AddView((android.view.View)(_pnlholder1.getObject()),(int) (__c.PerXToCurrent((float) (25),ba)-__c.DipToCurrent((int) (1))),__c.PerYToCurrent((float) (5),ba),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (50),ba));
 //BA.debugLineNum = 91;BA.debugLine="pnlmain.AddView(pnlholder2,35%x,5%y,10%x,50%y)";
_pnlmain.AddView((android.view.View)(_pnlholder2.getObject()),__c.PerXToCurrent((float) (35),ba),__c.PerYToCurrent((float) (5),ba),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (50),ba));
 //BA.debugLineNum = 92;BA.debugLine="pnlmain.AddView(pnlholder3,45%x + 1dip,5%y,10%x,5";
_pnlmain.AddView((android.view.View)(_pnlholder3.getObject()),(int) (__c.PerXToCurrent((float) (45),ba)+__c.DipToCurrent((int) (1))),__c.PerYToCurrent((float) (5),ba),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (50),ba));
 //BA.debugLineNum = 93;BA.debugLine="pnlmain.AddView(betbtnup,5%x,35%y,15%x,10%y)";
_pnlmain.AddView((android.view.View)(_betbtnup.getObject()),__c.PerXToCurrent((float) (5),ba),__c.PerYToCurrent((float) (35),ba),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 94;BA.debugLine="pnlmain.AddView(betbtndown,5%x,45%y + 2dip,15%x,1";
_pnlmain.AddView((android.view.View)(_betbtndown.getObject()),__c.PerXToCurrent((float) (5),ba),(int) (__c.PerYToCurrent((float) (45),ba)+__c.DipToCurrent((int) (2))),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 95;BA.debugLine="pnlmain.AddView(lblbetshow,5%x,25%y - 2dip,15%x,1";
_pnlmain.AddView((android.view.View)(_lblbetshow.getObject()),__c.PerXToCurrent((float) (5),ba),(int) (__c.PerYToCurrent((float) (25),ba)-__c.DipToCurrent((int) (2))),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 96;BA.debugLine="pnlholder1.Color = Colors.RGB(166, 166, 166)";
_pnlholder1.setColor(__c.Colors.RGB((int) (166),(int) (166),(int) (166)));
 //BA.debugLineNum = 97;BA.debugLine="pnlholder2.Color = Colors.RGB(166, 166, 166)";
_pnlholder2.setColor(__c.Colors.RGB((int) (166),(int) (166),(int) (166)));
 //BA.debugLineNum = 98;BA.debugLine="pnlholder3.Color = Colors.RGB(166, 166, 166)";
_pnlholder3.setColor(__c.Colors.RGB((int) (166),(int) (166),(int) (166)));
 //BA.debugLineNum = 99;BA.debugLine="spinbtn.Text = \"Spin\"";
_spinbtn.setText(BA.ObjectToCharSequence("Spin"));
 //BA.debugLineNum = 100;BA.debugLine="spinbtn.TextSize = 20";
_spinbtn.setTextSize((float) (20));
 //BA.debugLineNum = 101;BA.debugLine="spinbtn.Color = Colors.RGB(255, 71, 26)";
_spinbtn.setColor(__c.Colors.RGB((int) (255),(int) (71),(int) (26)));
 //BA.debugLineNum = 102;BA.debugLine="betbtnup.Color = Colors.LightGray";
_betbtnup.setColor(__c.Colors.LightGray);
 //BA.debugLineNum = 103;BA.debugLine="betbtndown.Color = Colors.LightGray";
_betbtndown.setColor(__c.Colors.LightGray);
 //BA.debugLineNum = 104;BA.debugLine="betbtnup.Text = \"+\"";
_betbtnup.setText(BA.ObjectToCharSequence("+"));
 //BA.debugLineNum = 105;BA.debugLine="betbtndown.Text = \"-\"";
_betbtndown.setText(BA.ObjectToCharSequence("-"));
 //BA.debugLineNum = 106;BA.debugLine="betbtnup.TextSize = 30";
_betbtnup.setTextSize((float) (30));
 //BA.debugLineNum = 107;BA.debugLine="betbtndown.TextSize = 30";
_betbtndown.setTextSize((float) (30));
 //BA.debugLineNum = 108;BA.debugLine="lblbetshow.Color = Colors.White";
_lblbetshow.setColor(__c.Colors.White);
 //BA.debugLineNum = 109;BA.debugLine="lblbetshow.Text = bettedmoney";
_lblbetshow.setText(BA.ObjectToCharSequence(_bettedmoney));
 //BA.debugLineNum = 110;BA.debugLine="lblbetshow.TextSize = 30";
_lblbetshow.setTextSize((float) (30));
 //BA.debugLineNum = 111;BA.debugLine="lblbetshow.TextColor = Colors.Black";
_lblbetshow.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 112;BA.debugLine="lblbetshow.Gravity = Gravity.CENTER";
_lblbetshow.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 113;BA.debugLine="Addingitemstomap1";
_addingitemstomap1();
 //BA.debugLineNum = 114;BA.debugLine="BuildPNLHOLD1";
_buildpnlhold1();
 //BA.debugLineNum = 115;BA.debugLine="BuildPNLHOLD2";
_buildpnlhold2();
 //BA.debugLineNum = 116;BA.debugLine="BuildPNLHOLD3";
_buildpnlhold3();
 //BA.debugLineNum = 117;BA.debugLine="End Sub";
return "";
}
public String  _checkrow(int _numrow) throws Exception{
anywheresoftware.b4a.objects.LabelWrapper _lb1 = null;
anywheresoftware.b4a.objects.LabelWrapper _lb2 = null;
anywheresoftware.b4a.objects.LabelWrapper _lb3 = null;
 //BA.debugLineNum = 193;BA.debugLine="Sub CheckRow (numRow As Int)";
 //BA.debugLineNum = 194;BA.debugLine="Dim lb1, lb2, lb3 As Label";
_lb1 = new anywheresoftware.b4a.objects.LabelWrapper();
_lb2 = new anywheresoftware.b4a.objects.LabelWrapper();
_lb3 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 195;BA.debugLine="lb1 = pnlholder1.GetView(numRow)";
_lb1.setObject((android.widget.TextView)(_pnlholder1.GetView(_numrow).getObject()));
 //BA.debugLineNum = 196;BA.debugLine="lb2 = pnlholder2.GetView(numRow)";
_lb2.setObject((android.widget.TextView)(_pnlholder2.GetView(_numrow).getObject()));
 //BA.debugLineNum = 197;BA.debugLine="lb3 = pnlholder3.GetView(numRow)";
_lb3.setObject((android.widget.TextView)(_pnlholder3.GetView(_numrow).getObject()));
 //BA.debugLineNum = 199;BA.debugLine="Log(\"Pan1 LaB: tag \" & lb1.Tag)";
__c.Log("Pan1 LaB: tag "+BA.ObjectToString(_lb1.getTag()));
 //BA.debugLineNum = 200;BA.debugLine="Log(\"Pan2 LaB: tag \" & lb2.Tag)";
__c.Log("Pan2 LaB: tag "+BA.ObjectToString(_lb2.getTag()));
 //BA.debugLineNum = 201;BA.debugLine="Log(\"Pan3 LaB: tag \" & lb3.Tag)";
__c.Log("Pan3 LaB: tag "+BA.ObjectToString(_lb3.getTag()));
 //BA.debugLineNum = 203;BA.debugLine="If (lb1.Tag = lb2.Tag And lb2.Tag = lb3.Tag) Then";
if (((_lb1.getTag()).equals(_lb2.getTag()) && (_lb2.getTag()).equals(_lb3.getTag()))) { 
 //BA.debugLineNum = 204;BA.debugLine="ToastMessageShow(\"JACKPOT!!!\",False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("JACKPOT!!!"),__c.False);
 //BA.debugLineNum = 205;BA.debugLine="If bettedmoney <= 5 Then";
if (_bettedmoney<=5) { 
 //BA.debugLineNum = 206;BA.debugLine="Jackpot = bettedmoney*70";
_jackpot = (int) (_bettedmoney*70);
 };
 //BA.debugLineNum = 209;BA.debugLine="If bettedmoney > 5 And bettedmoney <= 10 Then";
if (_bettedmoney>5 && _bettedmoney<=10) { 
 //BA.debugLineNum = 210;BA.debugLine="Jackpot = (bettedmoney*0.5)*Rnd(1,2) + 100*bett";
_jackpot = (int) ((_bettedmoney*0.5)*__c.Rnd((int) (1),(int) (2))+100*_bettedmoney);
 };
 //BA.debugLineNum = 213;BA.debugLine="If bettedmoney > 10 And bettedmoney <= 15 Then";
if (_bettedmoney>10 && _bettedmoney<=15) { 
 //BA.debugLineNum = 214;BA.debugLine="Jackpot = (bettedmoney*Rnd(1,4))*100";
_jackpot = (int) ((_bettedmoney*__c.Rnd((int) (1),(int) (4)))*100);
 };
 //BA.debugLineNum = 217;BA.debugLine="If bettedmoney > 15 Then";
if (_bettedmoney>15) { 
 //BA.debugLineNum = 218;BA.debugLine="Jackpot = Rnd(1,3)*1000*bettedmoney";
_jackpot = (int) (__c.Rnd((int) (1),(int) (3))*1000*_bettedmoney);
 };
 //BA.debugLineNum = 222;BA.debugLine="Types.currentuser.money = Types.currentuser.mone";
_types._currentuser.money = _types._currentuser.money+_jackpot;
 //BA.debugLineNum = 223;BA.debugLine="DB.UserSetMoney(Types.currentuser.money,Types.cu";
_db._usersetmoney(ba,_types._currentuser.money,_types._currentuser.name);
 };
 //BA.debugLineNum = 228;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Dim pnlmain As Panel";
_pnlmain = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 3;BA.debugLine="Dim spinbtn As Button";
_spinbtn = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 4;BA.debugLine="Dim betbtnup As Button";
_betbtnup = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 5;BA.debugLine="Dim betbtndown As Button";
_betbtndown = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 6;BA.debugLine="Dim lblbetshow As Label";
_lblbetshow = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 7;BA.debugLine="Dim bettedmoney As Int = 1";
_bettedmoney = (int) (1);
 //BA.debugLineNum = 8;BA.debugLine="Dim Jackpot As Int";
_jackpot = 0;
 //BA.debugLineNum = 10;BA.debugLine="Dim pnlholder1 As Panel";
_pnlholder1 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 11;BA.debugLine="Dim pnlholder2 As Panel";
_pnlholder2 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 12;BA.debugLine="Dim pnlholder3 As Panel";
_pnlholder3 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 14;BA.debugLine="Dim pnl1_lbl1 As Label";
_pnl1_lbl1 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 15;BA.debugLine="Dim pnl1_lbl2 As Label";
_pnl1_lbl2 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 16;BA.debugLine="Dim pnl1_lbl3 As Label";
_pnl1_lbl3 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 17;BA.debugLine="Dim pnl1_lbl4 As Label";
_pnl1_lbl4 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Dim pnl1_lbl5 As Label";
_pnl1_lbl5 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 20;BA.debugLine="Dim pnl2_lbl1 As Label";
_pnl2_lbl1 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 21;BA.debugLine="Dim pnl2_lbl2 As Label";
_pnl2_lbl2 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 22;BA.debugLine="Dim pnl2_lbl3 As Label";
_pnl2_lbl3 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 23;BA.debugLine="Dim pnl2_lbl4 As Label";
_pnl2_lbl4 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 24;BA.debugLine="Dim pnl2_lbl5 As Label";
_pnl2_lbl5 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 26;BA.debugLine="Dim pnl3_lbl1 As Label";
_pnl3_lbl1 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 27;BA.debugLine="Dim pnl3_lbl2 As Label";
_pnl3_lbl2 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 28;BA.debugLine="Dim pnl3_lbl3 As Label";
_pnl3_lbl3 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 29;BA.debugLine="Dim pnl3_lbl4 As Label";
_pnl3_lbl4 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 30;BA.debugLine="Dim pnl3_lbl5 As Label";
_pnl3_lbl5 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 34;BA.debugLine="Dim picture1 As Bitmap =  LoadBitmapSample(File.D";
_picture1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
_picture1 = __c.LoadBitmapSample(__c.File.getDirAssets(),"cherry.png",__c.DipToCurrent((int) (32)),__c.DipToCurrent((int) (32)));
 //BA.debugLineNum = 35;BA.debugLine="Dim picture2 As Bitmap =  LoadBitmapSample(File.D";
_picture2 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
_picture2 = __c.LoadBitmapSample(__c.File.getDirAssets(),"Watermelon.png",__c.DipToCurrent((int) (32)),__c.DipToCurrent((int) (32)));
 //BA.debugLineNum = 36;BA.debugLine="Dim picture3 As Bitmap =  LoadBitmapSample(File.D";
_picture3 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
_picture3 = __c.LoadBitmapSample(__c.File.getDirAssets(),"bell.png",__c.DipToCurrent((int) (32)),__c.DipToCurrent((int) (32)));
 //BA.debugLineNum = 37;BA.debugLine="Dim picture4 As Bitmap =  LoadBitmapSample(File.D";
_picture4 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
_picture4 = __c.LoadBitmapSample(__c.File.getDirAssets(),"bar.png",__c.DipToCurrent((int) (32)),__c.DipToCurrent((int) (32)));
 //BA.debugLineNum = 38;BA.debugLine="Dim picture5 As Bitmap =  LoadBitmapSample(File.D";
_picture5 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
_picture5 = __c.LoadBitmapSample(__c.File.getDirAssets(),"casino_7.png",__c.DipToCurrent((int) (32)),__c.DipToCurrent((int) (32)));
 //BA.debugLineNum = 40;BA.debugLine="Dim SpinTimer As Timer";
_spintimer = new anywheresoftware.b4a.objects.Timer();
 //BA.debugLineNum = 41;BA.debugLine="Dim SpinTimerAnimationA As Timer";
_spintimeranimationa = new anywheresoftware.b4a.objects.Timer();
 //BA.debugLineNum = 44;BA.debugLine="Dim picmap As Map";
_picmap = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 45;BA.debugLine="Dim lastPickedInt As Int";
_lastpickedint = 0;
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 49;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 50;BA.debugLine="pnlmain.Initialize(\"mainpnl\")";
_pnlmain.Initialize(ba,"mainpnl");
 //BA.debugLineNum = 51;BA.debugLine="spinbtn.Initialize(\"spinaction\")";
_spinbtn.Initialize(ba,"spinaction");
 //BA.debugLineNum = 53;BA.debugLine="pnlholder1.Initialize(\"pnl1\")";
_pnlholder1.Initialize(ba,"pnl1");
 //BA.debugLineNum = 54;BA.debugLine="pnlholder2.Initialize(\"pnl2\")";
_pnlholder2.Initialize(ba,"pnl2");
 //BA.debugLineNum = 55;BA.debugLine="pnlholder3.Initialize(\"pnl3\")";
_pnlholder3.Initialize(ba,"pnl3");
 //BA.debugLineNum = 57;BA.debugLine="pnl1_lbl1.Initialize(\"lbl11\")";
_pnl1_lbl1.Initialize(ba,"lbl11");
 //BA.debugLineNum = 58;BA.debugLine="pnl1_lbl2.Initialize(\"lbl12\")";
_pnl1_lbl2.Initialize(ba,"lbl12");
 //BA.debugLineNum = 59;BA.debugLine="pnl1_lbl3.Initialize(\"lbl13\")";
_pnl1_lbl3.Initialize(ba,"lbl13");
 //BA.debugLineNum = 60;BA.debugLine="pnl1_lbl4.Initialize(\"lbl14\")";
_pnl1_lbl4.Initialize(ba,"lbl14");
 //BA.debugLineNum = 61;BA.debugLine="pnl1_lbl5.Initialize(\"lbl15\")";
_pnl1_lbl5.Initialize(ba,"lbl15");
 //BA.debugLineNum = 63;BA.debugLine="pnl2_lbl1.Initialize(\"lbl21\")";
_pnl2_lbl1.Initialize(ba,"lbl21");
 //BA.debugLineNum = 64;BA.debugLine="pnl2_lbl2.Initialize(\"lbl22\")";
_pnl2_lbl2.Initialize(ba,"lbl22");
 //BA.debugLineNum = 65;BA.debugLine="pnl2_lbl3.Initialize(\"lbl23\")";
_pnl2_lbl3.Initialize(ba,"lbl23");
 //BA.debugLineNum = 66;BA.debugLine="pnl2_lbl4.Initialize(\"lbl24\")";
_pnl2_lbl4.Initialize(ba,"lbl24");
 //BA.debugLineNum = 67;BA.debugLine="pnl2_lbl5.Initialize(\"lbl25\")";
_pnl2_lbl5.Initialize(ba,"lbl25");
 //BA.debugLineNum = 69;BA.debugLine="pnl3_lbl1.Initialize(\"lbl31\")";
_pnl3_lbl1.Initialize(ba,"lbl31");
 //BA.debugLineNum = 70;BA.debugLine="pnl3_lbl2.Initialize(\"lbl32\")";
_pnl3_lbl2.Initialize(ba,"lbl32");
 //BA.debugLineNum = 71;BA.debugLine="pnl3_lbl3.Initialize(\"lbl33\")";
_pnl3_lbl3.Initialize(ba,"lbl33");
 //BA.debugLineNum = 72;BA.debugLine="pnl3_lbl4.Initialize(\"lbl34\")";
_pnl3_lbl4.Initialize(ba,"lbl34");
 //BA.debugLineNum = 73;BA.debugLine="pnl3_lbl5.Initialize(\"lbl35\")";
_pnl3_lbl5.Initialize(ba,"lbl35");
 //BA.debugLineNum = 75;BA.debugLine="betbtnup.Initialize(\"betbtn1\")";
_betbtnup.Initialize(ba,"betbtn1");
 //BA.debugLineNum = 76;BA.debugLine="betbtndown.Initialize(\"betbtn2\")";
_betbtndown.Initialize(ba,"betbtn2");
 //BA.debugLineNum = 77;BA.debugLine="lblbetshow.Initialize(\"betshow\")";
_lblbetshow.Initialize(ba,"betshow");
 //BA.debugLineNum = 79;BA.debugLine="SpinTimer.Initialize(\"SpinT\",2000)";
_spintimer.Initialize(ba,"SpinT",(long) (2000));
 //BA.debugLineNum = 80;BA.debugLine="SpinTimer.Enabled = False";
_spintimer.setEnabled(__c.False);
 //BA.debugLineNum = 81;BA.debugLine="SpinTimerAnimationA.Initialize(\"SpinA\",20)";
_spintimeranimationa.Initialize(ba,"SpinA",(long) (20));
 //BA.debugLineNum = 82;BA.debugLine="SpinTimerAnimationA.Enabled = False";
_spintimeranimationa.setEnabled(__c.False);
 //BA.debugLineNum = 83;BA.debugLine="picmap.Initialize";
_picmap.Initialize();
 //BA.debugLineNum = 84;BA.debugLine="BuildUI";
_buildui();
 //BA.debugLineNum = 85;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper  _pickrandomimage() throws Exception{
 //BA.debugLineNum = 236;BA.debugLine="Sub PickRandomImage As Bitmap";
 //BA.debugLineNum = 237;BA.debugLine="lastPickedInt = Rnd(1,5)";
_lastpickedint = __c.Rnd((int) (1),(int) (5));
 //BA.debugLineNum = 238;BA.debugLine="Return picmap.GetValueAt(lastPickedInt)";
if (true) return (anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(_picmap.GetValueAt(_lastpickedint)));
 //BA.debugLineNum = 239;BA.debugLine="End Sub";
return null;
}
public String  _setimageandposition(anywheresoftware.b4a.objects.LabelWrapper _l) throws Exception{
 //BA.debugLineNum = 230;BA.debugLine="Sub SetImageandPosition (l As Label)";
 //BA.debugLineNum = 231;BA.debugLine="l.SetBackgroundImage(PickRandomImage)";
_l.SetBackgroundImageNew((android.graphics.Bitmap)(_pickrandomimage().getObject()));
 //BA.debugLineNum = 232;BA.debugLine="l.Tag = lastPickedInt";
_l.setTag((Object)(_lastpickedint));
 //BA.debugLineNum = 234;BA.debugLine="End Sub";
return "";
}
public String  _spina_tick() throws Exception{
 //BA.debugLineNum = 181;BA.debugLine="Sub SpinA_Tick";
 //BA.debugLineNum = 182;BA.debugLine="SpinPanel(pnlholder1)";
_spinpanel(_pnlholder1);
 //BA.debugLineNum = 183;BA.debugLine="SpinPanel(pnlholder2)";
_spinpanel(_pnlholder2);
 //BA.debugLineNum = 184;BA.debugLine="SpinPanel(pnlholder3)";
_spinpanel(_pnlholder3);
 //BA.debugLineNum = 185;BA.debugLine="End Sub";
return "";
}
public String  _spinaction_click() throws Exception{
 //BA.debugLineNum = 170;BA.debugLine="Sub spinaction_Click";
 //BA.debugLineNum = 171;BA.debugLine="If Types.currentuser.money < bettedmoney Then";
if (_types._currentuser.money<_bettedmoney) { 
 //BA.debugLineNum = 172;BA.debugLine="ToastMessageShow(\"Not enought money!\",False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("Not enought money!"),__c.False);
 }else {
 //BA.debugLineNum = 174;BA.debugLine="Types.currentuser.money = Types.currentuser.mone";
_types._currentuser.money = _types._currentuser.money-_bettedmoney;
 //BA.debugLineNum = 175;BA.debugLine="DB.UserSetMoney(Types.currentuser.money,Types.cu";
_db._usersetmoney(ba,_types._currentuser.money,_types._currentuser.name);
 //BA.debugLineNum = 176;BA.debugLine="SpinTimer.Enabled = True";
_spintimer.setEnabled(__c.True);
 //BA.debugLineNum = 177;BA.debugLine="SpinTimerAnimationA.Enabled = True";
_spintimeranimationa.setEnabled(__c.True);
 };
 //BA.debugLineNum = 179;BA.debugLine="End Sub";
return "";
}
public String  _spinpanel(anywheresoftware.b4a.objects.PanelWrapper _p) throws Exception{
anywheresoftware.b4a.objects.LabelWrapper _v = null;
 //BA.debugLineNum = 187;BA.debugLine="Sub SpinPanel (p As Panel)";
 //BA.debugLineNum = 188;BA.debugLine="For Each v As Label In p.GetAllViewsRecursive";
_v = new anywheresoftware.b4a.objects.LabelWrapper();
{
final anywheresoftware.b4a.BA.IterableList group1 = _p.GetAllViewsRecursive();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_v.setObject((android.widget.TextView)(group1.Get(index1)));
 //BA.debugLineNum = 189;BA.debugLine="SetImageandPosition (v)";
_setimageandposition(_v);
 }
};
 //BA.debugLineNum = 191;BA.debugLine="End Sub";
return "";
}
public String  _spint_tick() throws Exception{
 //BA.debugLineNum = 241;BA.debugLine="Sub SpinT_Tick";
 //BA.debugLineNum = 242;BA.debugLine="SpinTimer.Enabled = False";
_spintimer.setEnabled(__c.False);
 //BA.debugLineNum = 243;BA.debugLine="SpinTimerAnimationA.Enabled = False";
_spintimeranimationa.setEnabled(__c.False);
 //BA.debugLineNum = 244;BA.debugLine="If bettedmoney <= 5 Then";
if (_bettedmoney<=5) { 
 //BA.debugLineNum = 245;BA.debugLine="CheckRow(0)";
_checkrow((int) (0));
 //BA.debugLineNum = 246;BA.debugLine="CheckRow(1)";
_checkrow((int) (1));
 //BA.debugLineNum = 247;BA.debugLine="CheckRow(2)";
_checkrow((int) (2));
 //BA.debugLineNum = 248;BA.debugLine="CheckRow(3)";
_checkrow((int) (3));
 //BA.debugLineNum = 249;BA.debugLine="CheckRow(4)";
_checkrow((int) (4));
 };
 //BA.debugLineNum = 252;BA.debugLine="If bettedmoney > 5 And bettedmoney <= 10 Then";
if (_bettedmoney>5 && _bettedmoney<=10) { 
 //BA.debugLineNum = 253;BA.debugLine="CheckRow(0)";
_checkrow((int) (0));
 //BA.debugLineNum = 254;BA.debugLine="CheckRow(1)";
_checkrow((int) (1));
 //BA.debugLineNum = 255;BA.debugLine="CheckRow(2)";
_checkrow((int) (2));
 //BA.debugLineNum = 256;BA.debugLine="CheckRow(3)";
_checkrow((int) (3));
 };
 //BA.debugLineNum = 258;BA.debugLine="If bettedmoney > 10 And bettedmoney <= 15 Then";
if (_bettedmoney>10 && _bettedmoney<=15) { 
 //BA.debugLineNum = 259;BA.debugLine="CheckRow(0)";
_checkrow((int) (0));
 //BA.debugLineNum = 260;BA.debugLine="CheckRow(1)";
_checkrow((int) (1));
 //BA.debugLineNum = 261;BA.debugLine="CheckRow(2)";
_checkrow((int) (2));
 };
 //BA.debugLineNum = 263;BA.debugLine="If bettedmoney > 15 Then";
if (_bettedmoney>15) { 
 //BA.debugLineNum = 264;BA.debugLine="CheckRow(2)";
_checkrow((int) (2));
 };
 //BA.debugLineNum = 266;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
