// generated with ast extension for cup
// version 0.8
// 19/7/2019 23:32:1


package rs.ac.bg.etf.pp1.ast;

public class GVarDeclaration extends GlobalVarDeclaration {

    private String globalVarName;

    public GVarDeclaration (String globalVarName) {
        this.globalVarName=globalVarName;
    }

    public String getGlobalVarName() {
        return globalVarName;
    }

    public void setGlobalVarName(String globalVarName) {
        this.globalVarName=globalVarName;
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
        buffer.append("GVarDeclaration(\n");

        buffer.append(" "+tab+globalVarName);
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [GVarDeclaration]");
        return buffer.toString();
    }
}
