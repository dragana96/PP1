// generated with ast extension for cup
// version 0.8
// 19/7/2019 23:32:1


package rs.ac.bg.etf.pp1.ast;

public class GVarDeclarationList extends GlobalVarDeclList {

    private GlobalVarDeclList GlobalVarDeclList;
    private GlobalVarDeclaration GlobalVarDeclaration;

    public GVarDeclarationList (GlobalVarDeclList GlobalVarDeclList, GlobalVarDeclaration GlobalVarDeclaration) {
        this.GlobalVarDeclList=GlobalVarDeclList;
        if(GlobalVarDeclList!=null) GlobalVarDeclList.setParent(this);
        this.GlobalVarDeclaration=GlobalVarDeclaration;
        if(GlobalVarDeclaration!=null) GlobalVarDeclaration.setParent(this);
    }

    public GlobalVarDeclList getGlobalVarDeclList() {
        return GlobalVarDeclList;
    }

    public void setGlobalVarDeclList(GlobalVarDeclList GlobalVarDeclList) {
        this.GlobalVarDeclList=GlobalVarDeclList;
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
        if(GlobalVarDeclList!=null) GlobalVarDeclList.accept(visitor);
        if(GlobalVarDeclaration!=null) GlobalVarDeclaration.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(GlobalVarDeclList!=null) GlobalVarDeclList.traverseTopDown(visitor);
        if(GlobalVarDeclaration!=null) GlobalVarDeclaration.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(GlobalVarDeclList!=null) GlobalVarDeclList.traverseBottomUp(visitor);
        if(GlobalVarDeclaration!=null) GlobalVarDeclaration.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("GVarDeclarationList(\n");

        if(GlobalVarDeclList!=null)
            buffer.append(GlobalVarDeclList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(GlobalVarDeclaration!=null)
            buffer.append(GlobalVarDeclaration.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [GVarDeclarationList]");
        return buffer.toString();
    }
}
