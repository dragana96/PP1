// generated with ast extension for cup
// version 0.8
// 19/7/2019 23:32:1


package rs.ac.bg.etf.pp1.ast;

public class ListOfTypesImplementing extends TypeList {

    private Type Type;
    private TypeList TypeList;

    public ListOfTypesImplementing (Type Type, TypeList TypeList) {
        this.Type=Type;
        if(Type!=null) Type.setParent(this);
        this.TypeList=TypeList;
        if(TypeList!=null) TypeList.setParent(this);
    }

    public Type getType() {
        return Type;
    }

    public void setType(Type Type) {
        this.Type=Type;
    }

    public TypeList getTypeList() {
        return TypeList;
    }

    public void setTypeList(TypeList TypeList) {
        this.TypeList=TypeList;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(Type!=null) Type.accept(visitor);
        if(TypeList!=null) TypeList.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Type!=null) Type.traverseTopDown(visitor);
        if(TypeList!=null) TypeList.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Type!=null) Type.traverseBottomUp(visitor);
        if(TypeList!=null) TypeList.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ListOfTypesImplementing(\n");

        if(Type!=null)
            buffer.append(Type.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(TypeList!=null)
            buffer.append(TypeList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ListOfTypesImplementing]");
        return buffer.toString();
    }
}
