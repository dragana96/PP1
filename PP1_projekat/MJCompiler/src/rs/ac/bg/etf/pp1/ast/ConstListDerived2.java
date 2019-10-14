// generated with ast extension for cup
// version 0.8
// 19/7/2019 23:32:1


package rs.ac.bg.etf.pp1.ast;

public class ConstListDerived2 extends ConstList {

    private ConstList ConstList;
    private ConstDeclarationSingle ConstDeclarationSingle;

    public ConstListDerived2 (ConstList ConstList, ConstDeclarationSingle ConstDeclarationSingle) {
        this.ConstList=ConstList;
        if(ConstList!=null) ConstList.setParent(this);
        this.ConstDeclarationSingle=ConstDeclarationSingle;
        if(ConstDeclarationSingle!=null) ConstDeclarationSingle.setParent(this);
    }

    public ConstList getConstList() {
        return ConstList;
    }

    public void setConstList(ConstList ConstList) {
        this.ConstList=ConstList;
    }

    public ConstDeclarationSingle getConstDeclarationSingle() {
        return ConstDeclarationSingle;
    }

    public void setConstDeclarationSingle(ConstDeclarationSingle ConstDeclarationSingle) {
        this.ConstDeclarationSingle=ConstDeclarationSingle;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(ConstList!=null) ConstList.accept(visitor);
        if(ConstDeclarationSingle!=null) ConstDeclarationSingle.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ConstList!=null) ConstList.traverseTopDown(visitor);
        if(ConstDeclarationSingle!=null) ConstDeclarationSingle.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ConstList!=null) ConstList.traverseBottomUp(visitor);
        if(ConstDeclarationSingle!=null) ConstDeclarationSingle.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ConstListDerived2(\n");

        if(ConstList!=null)
            buffer.append(ConstList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(ConstDeclarationSingle!=null)
            buffer.append(ConstDeclarationSingle.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ConstListDerived2]");
        return buffer.toString();
    }
}
