// generated with ast extension for cup
// version 0.8
// 19/7/2019 23:32:1


package rs.ac.bg.etf.pp1.ast;

public class ErrorIfMatched extends Matched {

    private ErrorIf ErrorIf;
    private Matched Matched;
    private Matched Matched1;

    public ErrorIfMatched (ErrorIf ErrorIf, Matched Matched, Matched Matched1) {
        this.ErrorIf=ErrorIf;
        if(ErrorIf!=null) ErrorIf.setParent(this);
        this.Matched=Matched;
        if(Matched!=null) Matched.setParent(this);
        this.Matched1=Matched1;
        if(Matched1!=null) Matched1.setParent(this);
    }

    public ErrorIf getErrorIf() {
        return ErrorIf;
    }

    public void setErrorIf(ErrorIf ErrorIf) {
        this.ErrorIf=ErrorIf;
    }

    public Matched getMatched() {
        return Matched;
    }

    public void setMatched(Matched Matched) {
        this.Matched=Matched;
    }

    public Matched getMatched1() {
        return Matched1;
    }

    public void setMatched1(Matched Matched1) {
        this.Matched1=Matched1;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(ErrorIf!=null) ErrorIf.accept(visitor);
        if(Matched!=null) Matched.accept(visitor);
        if(Matched1!=null) Matched1.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ErrorIf!=null) ErrorIf.traverseTopDown(visitor);
        if(Matched!=null) Matched.traverseTopDown(visitor);
        if(Matched1!=null) Matched1.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ErrorIf!=null) ErrorIf.traverseBottomUp(visitor);
        if(Matched!=null) Matched.traverseBottomUp(visitor);
        if(Matched1!=null) Matched1.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ErrorIfMatched(\n");

        if(ErrorIf!=null)
            buffer.append(ErrorIf.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(Matched!=null)
            buffer.append(Matched.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(Matched1!=null)
            buffer.append(Matched1.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ErrorIfMatched]");
        return buffer.toString();
    }
}
