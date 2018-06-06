package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class betpopup extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.betpopup");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.betpopup.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.PanelWrapper _background = null;
public anywheresoftware.b4a.objects.PanelWrapper _mainscreen = null;
public anywheresoftware.b4a.objects.EditTextWrapper _entersum = null;
public anywheresoftware.b4a.objects.ButtonWrapper _submit = null;
public b4a.example.main _main = null;
public b4a.example.helperfunctions _helperfunctions = null;
public b4a.example.types _types = null;
public b4a.example.starter _starter = null;
public String  _initialize(b4a.example.betpopup __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="betpopup";
if (Debug.shouldDelegate(ba, "initialize"))
	return (String) Debug.delegate(ba, "initialize", new Object[] {_ba});
RDebugUtils.currentLine=3604480;
 //BA.debugLineNum = 3604480;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=3604481;
 //BA.debugLineNum = 3604481;BA.debugLine="background.Initialize(\"background\")";
__ref._background.Initialize(ba,"background");
RDebugUtils.currentLine=3604482;
 //BA.debugLineNum = 3604482;BA.debugLine="mainscreen.Initialize(\"mainscr\")";
__ref._mainscreen.Initialize(ba,"mainscr");
RDebugUtils.currentLine=3604483;
 //BA.debugLineNum = 3604483;BA.debugLine="entersum.Initialize(\"sumfld\")";
__ref._entersum.Initialize(ba,"sumfld");
RDebugUtils.currentLine=3604484;
 //BA.debugLineNum = 3604484;BA.debugLine="submit.Initialize(\"btn1\")";
__ref._submit.Initialize(ba,"btn1");
RDebugUtils.currentLine=3604485;
 //BA.debugLineNum = 3604485;BA.debugLine="BuildUI";
__ref._buildui(null);
RDebugUtils.currentLine=3604486;
 //BA.debugLineNum = 3604486;BA.debugLine="End Sub";
return "";
}
public boolean  _background_click(b4a.example.betpopup __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="betpopup";
if (Debug.shouldDelegate(ba, "background_click"))
	return (Boolean) Debug.delegate(ba, "background_click", null);
RDebugUtils.currentLine=3735552;
 //BA.debugLineNum = 3735552;BA.debugLine="Sub background_Click As Boolean";
RDebugUtils.currentLine=3735553;
 //BA.debugLineNum = 3735553;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=3735554;
 //BA.debugLineNum = 3735554;BA.debugLine="End Sub";
return false;
}
public String  _btn1_click(b4a.example.betpopup __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="betpopup";
if (Debug.shouldDelegate(ba, "btn1_click"))
	return (String) Debug.delegate(ba, "btn1_click", null);
RDebugUtils.currentLine=3801088;
 //BA.debugLineNum = 3801088;BA.debugLine="Sub btn1_Click";
RDebugUtils.currentLine=3801089;
 //BA.debugLineNum = 3801089;BA.debugLine="If entersum.Text = \"\" Then";
if ((__ref._entersum.getText()).equals("")) { 
RDebugUtils.currentLine=3801090;
 //BA.debugLineNum = 3801090;BA.debugLine="ToastMessageShow(\"No sum entered\",False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("No sum entered"),__c.False);
RDebugUtils.currentLine=3801091;
 //BA.debugLineNum = 3801091;BA.debugLine="CallSub(Main,\"ShowBetsPopUp\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"ShowBetsPopUp");
 }else {
RDebugUtils.currentLine=3801093;
 //BA.debugLineNum = 3801093;BA.debugLine="Main.currentuser.money = Main.currentuser.money -";
_main._currentuser.money = _main._currentuser.money-(double)(Double.parseDouble(__ref._entersum.getText()));
RDebugUtils.currentLine=3801094;
 //BA.debugLineNum = 3801094;BA.debugLine="Main.admin.funds = Main.admin.funds + (5/100)*ent";
_main._admin.funds = _main._admin.funds+(5/(double)100)*(double)(Double.parseDouble(__ref._entersum.getText()));
RDebugUtils.currentLine=3801096;
 //BA.debugLineNum = 3801096;BA.debugLine="Main.database.ExecNonQuery(\"UPDATE  Users SET Mon";
_main._database.ExecNonQuery("UPDATE  Users SET Money = '"+BA.NumberToString(_main._currentuser.money)+"' WHERE Username = '"+_main._currentuser.name+"'");
RDebugUtils.currentLine=3801097;
 //BA.debugLineNum = 3801097;BA.debugLine="Main.database.ExecNonQuery(\"UPDATE  Users SET Mon";
_main._database.ExecNonQuery("UPDATE  Users SET Money = '"+BA.NumberToString(_main._admin.funds)+"' WHERE Username = 'Admin'");
RDebugUtils.currentLine=3801099;
 //BA.debugLineNum = 3801099;BA.debugLine="CallSub(Main,\"AccMoney\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"AccMoney");
RDebugUtils.currentLine=3801100;
 //BA.debugLineNum = 3801100;BA.debugLine="CallSub(Main,\"ShowBetsPopUp\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"ShowBetsPopUp");
 };
RDebugUtils.currentLine=3801102;
 //BA.debugLineNum = 3801102;BA.debugLine="End Sub";
return "";
}
public String  _buildui(b4a.example.betpopup __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="betpopup";
if (Debug.shouldDelegate(ba, "buildui"))
	return (String) Debug.delegate(ba, "buildui", null);
RDebugUtils.currentLine=3670016;
 //BA.debugLineNum = 3670016;BA.debugLine="Sub BuildUI";
RDebugUtils.currentLine=3670017;
 //BA.debugLineNum = 3670017;BA.debugLine="background.Color = Colors.ARGB(50,0,0,0)";
__ref._background.setColor(__c.Colors.ARGB((int) (50),(int) (0),(int) (0),(int) (0)));
RDebugUtils.currentLine=3670018;
 //BA.debugLineNum = 3670018;BA.debugLine="background.AddView(mainscreen,25%x,25%y,50%x,50%y";
__ref._background.AddView((android.view.View)(__ref._mainscreen.getObject()),__c.PerXToCurrent((float) (25),ba),__c.PerYToCurrent((float) (25),ba),__c.PerXToCurrent((float) (50),ba),__c.PerYToCurrent((float) (50),ba));
RDebugUtils.currentLine=3670019;
 //BA.debugLineNum = 3670019;BA.debugLine="mainscreen.Color = Colors.LightGray";
__ref._mainscreen.setColor(__c.Colors.LightGray);
RDebugUtils.currentLine=3670020;
 //BA.debugLineNum = 3670020;BA.debugLine="mainscreen.AddView(entersum,0%x,10%y,50%x,10%y)";
__ref._mainscreen.AddView((android.view.View)(__ref._entersum.getObject()),__c.PerXToCurrent((float) (0),ba),__c.PerYToCurrent((float) (10),ba),__c.PerXToCurrent((float) (50),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=3670021;
 //BA.debugLineNum = 3670021;BA.debugLine="mainscreen.AddView(submit,20%x,25%y,10%x,10%y)";
__ref._mainscreen.AddView((android.view.View)(__ref._submit.getObject()),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (25),ba),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=3670022;
 //BA.debugLineNum = 3670022;BA.debugLine="submit.Text = \"OK\"";
__ref._submit.setText(BA.ObjectToCharSequence("OK"));
RDebugUtils.currentLine=3670023;
 //BA.debugLineNum = 3670023;BA.debugLine="entersum.Hint = \"Enter sum\"";
__ref._entersum.setHint("Enter sum");
RDebugUtils.currentLine=3670024;
 //BA.debugLineNum = 3670024;BA.debugLine="entersum.InputType = entersum.INPUT_TYPE_DECIMAL_";
__ref._entersum.setInputType(__ref._entersum.INPUT_TYPE_DECIMAL_NUMBERS);
RDebugUtils.currentLine=3670026;
 //BA.debugLineNum = 3670026;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.betpopup __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="betpopup";
RDebugUtils.currentLine=3538944;
 //BA.debugLineNum = 3538944;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=3538945;
 //BA.debugLineNum = 3538945;BA.debugLine="Dim background As Panel";
_background = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=3538946;
 //BA.debugLineNum = 3538946;BA.debugLine="Dim mainscreen As Panel";
_mainscreen = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=3538947;
 //BA.debugLineNum = 3538947;BA.debugLine="Dim entersum As EditText";
_entersum = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=3538948;
 //BA.debugLineNum = 3538948;BA.debugLine="Dim submit As Button";
_submit = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=3538950;
 //BA.debugLineNum = 3538950;BA.debugLine="End Sub";
return "";
}
}