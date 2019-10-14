// generated with ast extension for cup
// version 0.8
// 19/7/2019 23:32:1


package rs.ac.bg.etf.pp1.ast;

public class LVarDeclaration extends VarDeclaration {

    private String localVarName;

    public LVarDeclaration (String localVarName) {
        this.localVarName=localVarName;
    }

    public String getLocalVarName() {
        return localVarName;
    }

    public void setLocalVarName(String localVarName) {
        this.localVarName=localVarName;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("LVarDeclaration(\n");

        buffer.append(" "+tab+localVarName);
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [LVarDeclaration]");
        return buffer.toString();
    }
}
