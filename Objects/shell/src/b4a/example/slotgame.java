
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class slotgame {
    public static RemoteObject myClass;
	public slotgame() {
	}
    public static PCBA staticBA = new PCBA(null, slotgame.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _pnlmain = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _spinbtn = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _betbtnup = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _betbtndown = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _lblbetshow = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _bettedmoney = RemoteObject.createImmutable(0);
public static RemoteObject _jackpot = RemoteObject.createImmutable(0);
public static RemoteObject _pnlholder1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _pnlholder2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _pnlholder3 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _pnl1_lbl1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _pnl1_lbl2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _pnl1_lbl3 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _pnl1_lbl4 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _pnl1_lbl5 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _pnl2_lbl1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _pnl2_lbl2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _pnl2_lbl3 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _pnl2_lbl4 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _pnl2_lbl5 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _pnl3_lbl1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _pnl3_lbl2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _pnl3_lbl3 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _pnl3_lbl4 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _pnl3_lbl5 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _asd = null;
public static RemoteObject _picture1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
public static RemoteObject _picture2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
public static RemoteObject _picture3 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
public static RemoteObject _picture4 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
public static RemoteObject _picture5 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
public static RemoteObject _spintimer = RemoteObject.declareNull("anywheresoftware.b4a.objects.Timer");
public static RemoteObject _spintimeranimationa = RemoteObject.declareNull("anywheresoftware.b4a.objects.Timer");
public static RemoteObject _spintimeranimationb = RemoteObject.declareNull("anywheresoftware.b4a.objects.Timer");
public static RemoteObject _spintimeranimationc = RemoteObject.declareNull("anywheresoftware.b4a.objects.Timer");
public static RemoteObject _picmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _lastpickedint = RemoteObject.createImmutable(0);
public static b4a.example.main _main = null;
public static b4a.example.helperfunctions _helperfunctions = null;
public static b4a.example.types _types = null;
public static b4a.example.starter _starter = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"asd",_ref.getField(false, "_asd"),"betbtndown",_ref.getField(false, "_betbtndown"),"betbtnup",_ref.getField(false, "_betbtnup"),"bettedmoney",_ref.getField(false, "_bettedmoney"),"Jackpot",_ref.getField(false, "_jackpot"),"lastPickedInt",_ref.getField(false, "_lastpickedint"),"lblbetshow",_ref.getField(false, "_lblbetshow"),"picmap",_ref.getField(false, "_picmap"),"picture1",_ref.getField(false, "_picture1"),"picture2",_ref.getField(false, "_picture2"),"picture3",_ref.getField(false, "_picture3"),"picture4",_ref.getField(false, "_picture4"),"picture5",_ref.getField(false, "_picture5"),"pnl1_lbl1",_ref.getField(false, "_pnl1_lbl1"),"pnl1_lbl2",_ref.getField(false, "_pnl1_lbl2"),"pnl1_lbl3",_ref.getField(false, "_pnl1_lbl3"),"pnl1_lbl4",_ref.getField(false, "_pnl1_lbl4"),"pnl1_lbl5",_ref.getField(false, "_pnl1_lbl5"),"pnl2_lbl1",_ref.getField(false, "_pnl2_lbl1"),"pnl2_lbl2",_ref.getField(false, "_pnl2_lbl2"),"pnl2_lbl3",_ref.getField(false, "_pnl2_lbl3"),"pnl2_lbl4",_ref.getField(false, "_pnl2_lbl4"),"pnl2_lbl5",_ref.getField(false, "_pnl2_lbl5"),"pnl3_lbl1",_ref.getField(false, "_pnl3_lbl1"),"pnl3_lbl2",_ref.getField(false, "_pnl3_lbl2"),"pnl3_lbl3",_ref.getField(false, "_pnl3_lbl3"),"pnl3_lbl4",_ref.getField(false, "_pnl3_lbl4"),"pnl3_lbl5",_ref.getField(false, "_pnl3_lbl5"),"pnlholder1",_ref.getField(false, "_pnlholder1"),"pnlholder2",_ref.getField(false, "_pnlholder2"),"pnlholder3",_ref.getField(false, "_pnlholder3"),"pnlmain",_ref.getField(false, "_pnlmain"),"spinbtn",_ref.getField(false, "_spinbtn"),"SpinTimer",_ref.getField(false, "_spintimer"),"SpinTimerAnimationA",_ref.getField(false, "_spintimeranimationa"),"SpinTimerAnimationB",_ref.getField(false, "_spintimeranimationb"),"SpinTimerAnimationC",_ref.getField(false, "_spintimeranimationc")};
}
}