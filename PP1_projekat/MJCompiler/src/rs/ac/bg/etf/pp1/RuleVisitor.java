
package rs.ac.bg.etf.pp1;

import org.apache.log4j.Logger;
import rs.ac.bg.etf.pp1.ast.*;

public class RuleVisitor extends VisitorAdaptor{

	int printCallCount = 0;
	int varDeclCount = 0;
	int globalDeclCount = 0;
	int enumCount = 0;
	
	Logger log = Logger.getLogger(getClass());

	public void visit(LVarDecl vardecl){
		varDeclCount++;
	}
	
    public void visit(PrintStatementWithoutNumConst print) {
		printCallCount++;
	}
    
    public void visit(GlobalVarDeclaration1 global) {
    	globalDeclCount++;
  	}
    public void visit(EnumDecl enumCnt) {
    	enumCount++;
  	}
}
