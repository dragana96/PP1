// generated with ast extension for cup
// version 0.8
// 19/7/2019 23:32:1


package rs.ac.bg.etf.pp1.ast;

public class NumConstListComma extends NumConstList {

    private NumConstList NumConstList;
    private EnumList EnumList;

    public NumConstListComma (NumConstList NumConstList, EnumList EnumList) {
        this.NumConstList=NumConstList;
        if(NumConstList!=null) NumConstList.setParent(this);
        this.EnumList=EnumList;
        if(EnumList!=null) EnumList.setParent(this);
    }

    public NumConstList getNumConstList() {
        return NumConstList;
    }

    public void setNumConstList(NumConstList NumConstList) {
        this.NumConstList=NumConstList;
    }

    public EnumList getEnumList() {
        return EnumList;
    }

    public void setEnumList(EnumList EnumList) {
        this.EnumList=EnumList;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(NumConstList!=null) NumConstList.accept(visitor);
        if(EnumList!=null) EnumList.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(NumConstList!=null) NumConstList.traverseTopDown(visitor);
        if(EnumList!=null) EnumList.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(NumConstList!=null) NumConstList.traverseBottomUp(visitor);
        if(EnumList!=null) EnumList.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("NumConstListComma(\n");

        if(NumConstList!=null)
            buffer.append(NumConstList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(EnumList!=null)
            buffer.append(EnumList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [NumConstListComma]");
        return buffer.toString();
    }
}
