package interpreter;

import java.util.*;

public class CodeTable extends Object {
    static HashMap<String, String> bytecode;
    
    public static void init() {
	bytecode = new HashMap<String, String>();
	bytecode.put("HALT","HaltCode");
	bytecode.put("POP", "PopCode");
	bytecode.put("FALSEBRANCH","FalseBranchCode");
	bytecode.put("GOTO","GoToCode");
	bytecode.put("STORE","StoreCode");
	bytecode.put("LOAD","LoadCode");
	bytecode.put("LIT","LitCode");
	bytecode.put("ARGS","ArgsCode");
	bytecode.put("CALL","CallCode");
	bytecode.put("RETURN","ReturnCode");
	bytecode.put("BOP","BopCode");
	bytecode.put("READ","ReadCode");
	bytecode.put("WRITE","WriteCode");
	bytecode.put("LABEL","LabelCode");
    }
    
    public static String get(String code) {
	return bytecode.get(code);
    }
}
 
