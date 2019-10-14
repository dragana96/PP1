// generated with ast extension for cup
// version 0.8
// 19/7/2019 23:32:1


package rs.ac.bg.etf.pp1.ast;

public class GVarDecl extends GlobalVarDecl {

    private Type Type;
    private GlobalVarDeclList GlobalVarDeclList;

    public GVarDecl (Type Type, GlobalVarDeclList GlobalVarDeclList) {
        this.Type=Type;
        if(Type!=null) Type.setParent(this);
        this.GlobalVarDeclList=GlobalVarDeclList;
        if(GlobalVarDeclList!=null) GlobalVarDeclList.setParent(this);
    }

    public Type getType() {
        return Type;
    }

    public void setType(Type Type) {
        this.Type=Type;
    }

    public GlobalVarDeclList getGlobalVarDeclList() {
        return GlobalVarDeclList;
    }

    public void setGlobalVarDeclList(GlobalVarDeclList GlobalVarDeclList) {
        this.GlobalVarDeclList=GlobalVarDeclList;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(Type!=null) Type.accept(visitor);
        if(GlobalVarDeclList!=null) GlobalVarDeclList.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Type!=null) Type.traverseTopDown(visitor);
        if(GlobalVarDeclList!=null) GlobalVarDeclList.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Type!=null) Type.traverseBottomUp(visitor);
        if(GlobalVarDeclList!=null) GlobalVarDeclList.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("GVarDecl(\n");

        if(Type!=null)
            buffer.append(Type.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(GlobalVarDeclList!=null)
            buffer.append(GlobalVarDeclList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [GVarDecl]");
        return buffer.toString();
    }
}
