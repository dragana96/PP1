// generated with ast extension for cup
// version 0.8
// 19/7/2019 23:32:1


package rs.ac.bg.etf.pp1.ast;

public class ErrAssignment extends DesignatorStatement {

    private Designator Designator;
    private ErrorAssign ErrorAssign;

    public ErrAssignment (Designator Designator, ErrorAssign ErrorAssign) {
        this.Designator=Designator;
        if(Designator!=null) Designator.setParent(this);
        this.ErrorAssign=ErrorAssign;
        if(ErrorAssign!=null) ErrorAssign.setParent(this);
    }

    public Designator getDesignator() {
        return Designator;
    }

    public void setDesignator(Designator Designator) {
        this.Designator=Designator;
    }

    public ErrorAssign getErrorAssign() {
        return ErrorAssign;
    }

    public void setErrorAssign(ErrorAssign ErrorAssign) {
        this.ErrorAssign=ErrorAssign;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(Designator!=null) Designator.accept(visitor);
        if(ErrorAssign!=null) ErrorAssign.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Designator!=null) Designator.traverseTopDown(visitor);
        if(ErrorAssign!=null) ErrorAssign.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Designator!=null) Designator.traverseBottomUp(visitor);
        if(ErrorAssign!=null) ErrorAssign.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ErrAssignment(\n");

        if(Designator!=null)
            buffer.append(Designator.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(ErrorAssign!=null)
            buffer.append(ErrorAssign.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ErrAssignment]");
        return buffer.toString();
    }
}
