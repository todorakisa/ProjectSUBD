package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class promote extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.promote");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.promote.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.EditTextWrapper _enterusername = null;
public anywheresoftware.b4a.objects.EditTextWrapper _enterrank = null;
public anywheresoftware.b4a.objects.ButtonWrapper _submit = null;
public b4a.example.main _main = null;
public b4a.example.helperfunctions _helperfunctions = null;
public b4a.example.types _types = null;
public b4a.example.starter _starter = null;
public String  _initialize(b4a.example.promote __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="promote";
if (Debug.shouldDelegate(ba, "initialize"))
	return (String) Debug.delegate(ba, "initialize", new Object[] {_ba});
RDebugUtils.currentLine=5439488;
 //BA.debugLineNum = 5439488;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=5439489;
 //BA.debugLineNum = 5439489;BA.debugLine="background.Initialize(\"background\")";
__ref._background.Initialize(ba,"background");
RDebugUtils.currentLine=5439490;
 //BA.debugLineNum = 5439490;BA.debugLine="mainscreen.Initialize(\"mainscr\")";
__ref._mainscreen.Initialize(ba,"mainscr");
RDebugUtils.currentLine=5439491;
 //BA.debugLineNum = 5439491;BA.debugLine="enterrank.Initialize(\"newrank\")";
__ref._enterrank.Initialize(ba,"newrank");
RDebugUtils.currentLine=5439492;
 //BA.debugLineNum = 5439492;BA.debugLine="submit.Initialize(\"btn1\")";
__ref._submit.Initialize(ba,"btn1");
RDebugUtils.currentLine=5439493;
 //BA.debugLineNum = 5439493;BA.debugLine="enterusername.Initialize(\"username\")";
__ref._enterusername.Initialize(ba,"username");
RDebugUtils.currentLine=5439494;
 //BA.debugLineNum = 5439494;BA.debugLine="BuildUI";
__ref._buildui(null);
RDebugUtils.currentLine=5439495;
 //BA.debugLineNum = 5439495;BA.debugLine="End Sub";
return "";
}
public boolean  _background_click(b4a.example.promote __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="promote";
if (Debug.shouldDelegate(ba, "background_click"))
	return (Boolean) Debug.delegate(ba, "background_click", null);
RDebugUtils.currentLine=5570560;
 //BA.debugLineNum = 5570560;BA.debugLine="Sub background_Click As Boolean";
RDebugUtils.currentLine=5570561;
 //BA.debugLineNum = 5570561;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=5570562;
 //BA.debugLineNum = 5570562;BA.debugLine="End Sub";
return false;
}
public String  _btn1_click(b4a.example.promote __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="promote";
if (Debug.shouldDelegate(ba, "btn1_click"))
	return (String) Debug.delegate(ba, "btn1_click", null);
RDebugUtils.currentLine=5636096;
 //BA.debugLineNum = 5636096;BA.debugLine="Sub btn1_Click";
RDebugUtils.currentLine=5636097;
 //BA.debugLineNum = 5636097;BA.debugLine="If enterrank.Text = \"\" Then";
if ((__ref._enterrank.getText()).equals("")) { 
RDebugUtils.currentLine=5636098;
 //BA.debugLineNum = 5636098;BA.debugLine="ToastMessageShow(\"Nothing entered\",False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("Nothing entered"),__c.False);
RDebugUtils.currentLine=5636099;
 //BA.debugLineNum = 5636099;BA.debugLine="CallSub(Main,\"ShowRankUpdate\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"ShowRankUpdate");
 }else {
RDebugUtils.currentLine=5636102;
 //BA.debugLineNum = 5636102;BA.debugLine="Main.database.ExecNonQuery(\"UPDATE  Users SET Ra";
_main._database.ExecNonQuery("UPDATE  Users SET Rank = '"+__ref._enterrank.getText()+"' WHERE Username = '"+__ref._enterusername.getText()+"'");
RDebugUtils.currentLine=5636103;
 //BA.debugLineNum = 5636103;BA.debugLine="CallSub(Main,\"ShowRankUpdate\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"ShowRankUpdate");
 };
RDebugUtils.currentLine=5636105;
 //BA.debugLineNum = 5636105;BA.debugLine="End Sub";
return "";
}
public String  _buildui(b4a.example.promote __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="promote";
if (Debug.shouldDelegate(ba, "buildui"))
	return (String) Debug.delegate(ba, "buildui", null);
RDebugUtils.currentLine=5505024;
 //BA.debugLineNum = 5505024;BA.debugLine="Sub BuildUI";
RDebugUtils.currentLine=5505025;
 //BA.debugLineNum = 5505025;BA.debugLine="background.Color = Colors.ARGB(50,0,0,0)";
__ref._background.setColor(__c.Colors.ARGB((int) (50),(int) (0),(int) (0),(int) (0)));
RDebugUtils.currentLine=5505026;
 //BA.debugLineNum = 5505026;BA.debugLine="background.AddView(mainscreen,25%x,25%y,50%x,50%y";
__ref._background.AddView((android.view.View)(__ref._mainscreen.getObject()),__c.PerXToCurrent((float) (25),ba),__c.PerYToCurrent((float) (25),ba),__c.PerXToCurrent((float) (50),ba),__c.PerYToCurrent((float) (50),ba));
RDebugUtils.currentLine=5505027;
 //BA.debugLineNum = 5505027;BA.debugLine="mainscreen.Color = Colors.LightGray";
__ref._mainscreen.setColor(__c.Colors.LightGray);
RDebugUtils.currentLine=5505028;
 //BA.debugLineNum = 5505028;BA.debugLine="mainscreen.AddView(enterrank,0%x,20%y,50%x,10%y)";
__ref._mainscreen.AddView((android.view.View)(__ref._enterrank.getObject()),__c.PerXToCurrent((float) (0),ba),__c.PerYToCurrent((float) (20),ba),__c.PerXToCurrent((float) (50),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=5505029;
 //BA.debugLineNum = 5505029;BA.debugLine="mainscreen.AddView(enterusername,0%x,10%y,50%x,10";
__ref._mainscreen.AddView((android.view.View)(__ref._enterusername.getObject()),__c.PerXToCurrent((float) (0),ba),__c.PerYToCurrent((float) (10),ba),__c.PerXToCurrent((float) (50),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=5505030;
 //BA.debugLineNum = 5505030;BA.debugLine="mainscreen.AddView(submit,20%x,35%y,10%x,10%y)";
__ref._mainscreen.AddView((android.view.View)(__ref._submit.getObject()),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (35),ba),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=5505031;
 //BA.debugLineNum = 5505031;BA.debugLine="submit.Text = \"OK\"";
__ref._submit.setText(BA.ObjectToCharSequence("OK"));
RDebugUtils.currentLine=5505032;
 //BA.debugLineNum = 5505032;BA.debugLine="enterrank.Hint = \"Enter new rank\"";
__ref._enterrank.setHint("Enter new rank");
RDebugUtils.currentLine=5505033;
 //BA.debugLineNum = 5505033;BA.debugLine="enterusername.Hint = \"Enter user\"";
__ref._enterusername.setHint("Enter user");
RDebugUtils.currentLine=5505035;
 //BA.debugLineNum = 5505035;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.promote __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="promote";
RDebugUtils.currentLine=5373952;
 //BA.debugLineNum = 5373952;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=5373953;
 //BA.debugLineNum = 5373953;BA.debugLine="Dim background As Panel";
_background = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=5373954;
 //BA.debugLineNum = 5373954;BA.debugLine="Dim mainscreen As Panel";
_mainscreen = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=5373955;
 //BA.debugLineNum = 5373955;BA.debugLine="Dim enterusername As EditText";
_enterusername = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=5373956;
 //BA.debugLineNum = 5373956;BA.debugLine="Dim enterrank As EditText";
_enterrank = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=5373957;
 //BA.debugLineNum = 5373957;BA.debugLine="Dim submit As Button";
_submit = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=5373959;
 //BA.debugLineNum = 5373959;BA.debugLine="End Sub";
return "";
}
}