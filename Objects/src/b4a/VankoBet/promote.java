package b4a.VankoBet;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class promote extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.VankoBet.promote");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.VankoBet.promote.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.PanelWrapper _background = null;
public anywheresoftware.b4a.objects.PanelWrapper _mainscreen = null;
public anywheresoftware.b4a.objects.EditTextWrapper _enterusername = null;
public anywheresoftware.b4a.objects.EditTextWrapper _enterrank = null;
public anywheresoftware.b4a.objects.ButtonWrapper _submit = null;
public b4a.VankoBet.main _main = null;
public b4a.VankoBet.db _db = null;
public b4a.VankoBet.types _types = null;
public b4a.VankoBet.starter _starter = null;
public b4a.VankoBet.helperfunctions _helperfunctions = null;
public boolean  _background_click() throws Exception{
 //BA.debugLineNum = 32;BA.debugLine="Sub background_Click As Boolean";
 //BA.debugLineNum = 33;BA.debugLine="Return True";
if (true) return __c.True;
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return false;
}
public String  _btn1_click() throws Exception{
 //BA.debugLineNum = 36;BA.debugLine="Sub btn1_Click";
 //BA.debugLineNum = 37;BA.debugLine="If enterrank.Text = \"\" Then";
if ((_enterrank.getText()).equals("")) { 
 //BA.debugLineNum = 38;BA.debugLine="ToastMessageShow(\"Nothing entered\",False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("Nothing entered"),__c.False);
 //BA.debugLineNum = 39;BA.debugLine="CallSub(Main,\"ShowRankUpdate\")";
__c.CallSubNew(ba,(Object)(_main.getObject()),"ShowRankUpdate");
 }else {
 //BA.debugLineNum = 41;BA.debugLine="DB.UserSetRank( enterrank.Text ,enterusername.te";
_db._usersetrank(ba,_enterrank.getText(),_enterusername.getText());
 //BA.debugLineNum = 42;BA.debugLine="CallSub(Main,\"ShowRankUpdate\")";
__c.CallSubNew(ba,(Object)(_main.getObject()),"ShowRankUpdate");
 };
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return "";
}
public String  _buildui() throws Exception{
 //BA.debugLineNum = 19;BA.debugLine="Sub BuildUI";
 //BA.debugLineNum = 20;BA.debugLine="background.Color = Colors.ARGB(50,0,0,0)";
_background.setColor(__c.Colors.ARGB((int) (50),(int) (0),(int) (0),(int) (0)));
 //BA.debugLineNum = 21;BA.debugLine="background.AddView(mainscreen,25%x,25%y,50%x,50%y";
_background.AddView((android.view.View)(_mainscreen.getObject()),__c.PerXToCurrent((float) (25),ba),__c.PerYToCurrent((float) (25),ba),__c.PerXToCurrent((float) (50),ba),__c.PerYToCurrent((float) (50),ba));
 //BA.debugLineNum = 22;BA.debugLine="mainscreen.Color = Colors.LightGray";
_mainscreen.setColor(__c.Colors.LightGray);
 //BA.debugLineNum = 23;BA.debugLine="mainscreen.AddView(enterrank,0%x,20%y,50%x,10%y)";
_mainscreen.AddView((android.view.View)(_enterrank.getObject()),__c.PerXToCurrent((float) (0),ba),__c.PerYToCurrent((float) (20),ba),__c.PerXToCurrent((float) (50),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 24;BA.debugLine="mainscreen.AddView(enterusername,0%x,10%y,50%x,10";
_mainscreen.AddView((android.view.View)(_enterusername.getObject()),__c.PerXToCurrent((float) (0),ba),__c.PerYToCurrent((float) (10),ba),__c.PerXToCurrent((float) (50),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 25;BA.debugLine="mainscreen.AddView(submit,20%x,35%y,10%x,10%y)";
_mainscreen.AddView((android.view.View)(_submit.getObject()),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (35),ba),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 26;BA.debugLine="submit.Text = \"OK\"";
_submit.setText(BA.ObjectToCharSequence("OK"));
 //BA.debugLineNum = 27;BA.debugLine="enterrank.Hint = \"Enter new rank\"";
_enterrank.setHint("Enter new rank");
 //BA.debugLineNum = 28;BA.debugLine="enterusername.Hint = \"Enter user\"";
_enterusername.setHint("Enter user");
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Dim background As Panel";
_background = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 3;BA.debugLine="Dim mainscreen As Panel";
_mainscreen = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 4;BA.debugLine="Dim enterusername As EditText";
_enterusername = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 5;BA.debugLine="Dim enterrank As EditText";
_enterrank = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 6;BA.debugLine="Dim submit As Button";
_submit = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 11;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 12;BA.debugLine="background.Initialize(\"background\")";
_background.Initialize(ba,"background");
 //BA.debugLineNum = 13;BA.debugLine="mainscreen.Initialize(\"mainscr\")";
_mainscreen.Initialize(ba,"mainscr");
 //BA.debugLineNum = 14;BA.debugLine="enterrank.Initialize(\"newrank\")";
_enterrank.Initialize(ba,"newrank");
 //BA.debugLineNum = 15;BA.debugLine="submit.Initialize(\"btn1\")";
_submit.Initialize(ba,"btn1");
 //BA.debugLineNum = 16;BA.debugLine="enterusername.Initialize(\"username\")";
_enterusername.Initialize(ba,"username");
 //BA.debugLineNum = 17;BA.debugLine="BuildUI";
_buildui();
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
