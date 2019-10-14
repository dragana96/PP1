// generated with ast extension for cup
// version 0.8
// 19/7/2019 23:32:1


package rs.ac.bg.etf.pp1.ast;

public class GSingleVarDeclaration extends GlobalVarDeclList {

    private GlobalVarDeclaration GlobalVarDeclaration;

    public GSingleVarDeclaration (GlobalVarDeclaration GlobalVarDeclaration) {
        this.GlobalVarDeclaration=GlobalVarDeclaration;
        if(GlobalVarDeclaration!=null) GlobalVarDeclaration.setParent(this);
    }

    public GlobalVarDeclaration getGlobalVarDeclaration() {
        return GlobalVarDeclaration;
    }

    public void setGlobalVarDeclaration(GlobalVarDeclaration GlobalVarDeclaration) {
        this.GlobalVarDeclaration=GlobalVarDeclaration;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(GlobalVarDeclaration!=null) GlobalVarDeclaration.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(GlobalVarDeclaration!=null) GlobalVarDeclaration.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(GlobalVarDeclaration!=null) GlobalVarDeclaration.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("GSingleVarDeclaration(\n");

        if(GlobalVarDeclaration!=null)
            buffer.append(GlobalVarDeclaration.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [GSingleVarDeclaration]");
        return buffer.toString();
    }
}
