// generated with ast extension for cup
// version 0.8
// 19/7/2019 23:32:1


package rs.ac.bg.etf.pp1.ast;

public class ErrorIfUnmatched extends Unmatched {

    private ErrorIf ErrorIf;
    private Statement Statement;

    public ErrorIfUnmatched (ErrorIf ErrorIf, Statement Statement) {
        this.ErrorIf=ErrorIf;
        if(ErrorIf!=null) ErrorIf.setParent(this);
        this.Statement=Statement;
        if(Statement!=null) Statement.setParent(this);
    }

    public ErrorIf getErrorIf() {
        return ErrorIf;
    }

    public void setErrorIf(ErrorIf ErrorIf) {
        this.ErrorIf=ErrorIf;
    }

    public Statement getStatement() {
        return Statement;
    }

    public void setStatement(Statement Statement) {
        this.Statement=Statement;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(ErrorIf!=null) ErrorIf.accept(visitor);
        if(Statement!=null) Statement.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ErrorIf!=null) ErrorIf.traverseTopDown(visitor);
        if(Statement!=null) Statement.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ErrorIf!=null) ErrorIf.traverseBottomUp(visitor);
        if(Statement!=null) Statement.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ErrorIfUnmatched(\n");

        if(ErrorIf!=null)
            buffer.append(ErrorIf.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(Statement!=null)
            buffer.append(Statement.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ErrorIfUnmatched]");
        return buffer.toString();
    }
}
