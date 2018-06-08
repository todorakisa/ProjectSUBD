package b4a.VankoBet;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class betpopup extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.VankoBet.betpopup");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.VankoBet.betpopup.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.PanelWrapper _background = null;
public anywheresoftware.b4a.objects.PanelWrapper _mainscreen = null;
public anywheresoftware.b4a.objects.EditTextWrapper _entersum = null;
public anywheresoftware.b4a.objects.ButtonWrapper _submit = null;
public b4a.VankoBet.main _main = null;
public b4a.VankoBet.db _db = null;
public b4a.VankoBet.types _types = null;
public b4a.VankoBet.starter _starter = null;
public b4a.VankoBet.helperfunctions _helperfunctions = null;
public boolean  _background_click() throws Exception{
 //BA.debugLineNum = 29;BA.debugLine="Sub background_Click As Boolean";
 //BA.debugLineNum = 30;BA.debugLine="Return True";
if (true) return __c.True;
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return false;
}
public String  _btn1_click() throws Exception{
double _adminfunds = 0;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cursortmp = null;
int _i = 0;
 //BA.debugLineNum = 33;BA.debugLine="Sub btn1_Click";
 //BA.debugLineNum = 34;BA.debugLine="If entersum.Text = \"\" Then";
if ((_entersum.getText()).equals("")) { 
 //BA.debugLineNum = 35;BA.debugLine="ToastMessageShow(\"No sum entered\",False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("No sum entered"),__c.False);
 //BA.debugLineNum = 36;BA.debugLine="CallSub(Main,\"ShowBetsPopUp\")";
__c.CallSubNew(ba,(Object)(_main.getObject()),"ShowBetsPopUp");
 }else {
 //BA.debugLineNum = 38;BA.debugLine="DB.database.Initialize(File.DirDefaultExternal,\"";
_db._database.Initialize(__c.File.getDirDefaultExternal(),"AppDB.db",__c.True);
 //BA.debugLineNum = 39;BA.debugLine="Types.currentuser.money = Types.currentuser.mone";
_types._currentuser.money = _types._currentuser.money-(double)(Double.parseDouble(_entersum.getText()));
 //BA.debugLineNum = 40;BA.debugLine="Dim adminfunds As Double = (5/100)*entersum.Text";
_adminfunds = (5/(double)100)*(double)(Double.parseDouble(_entersum.getText()));
 //BA.debugLineNum = 41;BA.debugLine="Dim cursortmp As Cursor";
_cursortmp = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
 //BA.debugLineNum = 42;BA.debugLine="cursortmp = DB.database.ExecQuery(\"SELECT  Money";
_cursortmp.setObject((android.database.Cursor)(_db._database.ExecQuery("SELECT  Money FROM Users WHERE Username = 'admin'")));
 //BA.debugLineNum = 43;BA.debugLine="For i = 0 To cursortmp.RowCount - 1";
{
final int step10 = 1;
final int limit10 = (int) (_cursortmp.getRowCount()-1);
_i = (int) (0) ;
for (;(step10 > 0 && _i <= limit10) || (step10 < 0 && _i >= limit10) ;_i = ((int)(0 + _i + step10))  ) {
 //BA.debugLineNum = 44;BA.debugLine="cursortmp.Position = i";
_cursortmp.setPosition(_i);
 //BA.debugLineNum = 45;BA.debugLine="adminfunds = cursortmp.GetDouble(\"Money\") + adm";
_adminfunds = _cursortmp.GetDouble("Money")+_adminfunds;
 }
};
 //BA.debugLineNum = 47;BA.debugLine="cursortmp.Close";
_cursortmp.Close();
 //BA.debugLineNum = 48;BA.debugLine="DB.UserSetMoney(Types.currentuser.money,Types.cu";
_db._usersetmoney(ba,_types._currentuser.money,_types._currentuser.name);
 //BA.debugLineNum = 49;BA.debugLine="DB.UserSetMoney(adminfunds,\"admin\")";
_db._usersetmoney(ba,_adminfunds,"admin");
 //BA.debugLineNum = 50;BA.debugLine="DB.database.Close";
_db._database.Close();
 //BA.debugLineNum = 52;BA.debugLine="CallSub(Main,\"ShowBetsPopUp\")";
__c.CallSubNew(ba,(Object)(_main.getObject()),"ShowBetsPopUp");
 };
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return "";
}
public String  _buildui() throws Exception{
 //BA.debugLineNum = 17;BA.debugLine="Sub BuildUI";
 //BA.debugLineNum = 18;BA.debugLine="background.Color = Colors.ARGB(50,0,0,0)";
_background.setColor(__c.Colors.ARGB((int) (50),(int) (0),(int) (0),(int) (0)));
 //BA.debugLineNum = 19;BA.debugLine="background.AddView(mainscreen,25%x,25%y,50%x,50%y";
_background.AddView((android.view.View)(_mainscreen.getObject()),__c.PerXToCurrent((float) (25),ba),__c.PerYToCurrent((float) (25),ba),__c.PerXToCurrent((float) (50),ba),__c.PerYToCurrent((float) (50),ba));
 //BA.debugLineNum = 20;BA.debugLine="mainscreen.Color = Colors.LightGray";
_mainscreen.setColor(__c.Colors.LightGray);
 //BA.debugLineNum = 21;BA.debugLine="mainscreen.AddView(entersum,0%x,10%y,50%x,10%y)";
_mainscreen.AddView((android.view.View)(_entersum.getObject()),__c.PerXToCurrent((float) (0),ba),__c.PerYToCurrent((float) (10),ba),__c.PerXToCurrent((float) (50),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 22;BA.debugLine="mainscreen.AddView(submit,20%x,25%y,10%x,10%y)";
_mainscreen.AddView((android.view.View)(_submit.getObject()),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (25),ba),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 23;BA.debugLine="submit.Text = \"OK\"";
_submit.setText(BA.ObjectToCharSequence("OK"));
 //BA.debugLineNum = 24;BA.debugLine="entersum.Hint = \"Enter sum\"";
_entersum.setHint("Enter sum");
 //BA.debugLineNum = 25;BA.debugLine="entersum.InputType = entersum.INPUT_TYPE_DECIMAL_";
_entersum.setInputType(_entersum.INPUT_TYPE_DECIMAL_NUMBERS);
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Dim background As Panel";
_background = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 3;BA.debugLine="Dim mainscreen As Panel";
_mainscreen = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 4;BA.debugLine="Dim entersum As EditText";
_entersum = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 5;BA.debugLine="Dim submit As Button";
_submit = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 11;BA.debugLine="background.Initialize(\"background\")";
_background.Initialize(ba,"background");
 //BA.debugLineNum = 12;BA.debugLine="mainscreen.Initialize(\"mainscr\")";
_mainscreen.Initialize(ba,"mainscr");
 //BA.debugLineNum = 13;BA.debugLine="entersum.Initialize(\"sumfld\")";
_entersum.Initialize(ba,"sumfld");
 //BA.debugLineNum = 14;BA.debugLine="submit.Initialize(\"btn1\")";
_submit.Initialize(ba,"btn1");
 //BA.debugLineNum = 15;BA.debugLine="BuildUI";
_buildui();
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
