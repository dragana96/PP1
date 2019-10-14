// generated with ast extension for cup
// version 0.8
// 19/7/2019 23:32:1


package rs.ac.bg.etf.pp1.ast;

public class ConditionFact extends CondFact {

    private Expr Expr;
    private RelopExprOptional RelopExprOptional;

    public ConditionFact (Expr Expr, RelopExprOptional RelopExprOptional) {
        this.Expr=Expr;
        if(Expr!=null) Expr.setParent(this);
        this.RelopExprOptional=RelopExprOptional;
        if(RelopExprOptional!=null) RelopExprOptional.setParent(this);
    }

    public Expr getExpr() {
        return Expr;
    }

    public void setExpr(Expr Expr) {
        this.Expr=Expr;
    }

    public RelopExprOptional getRelopExprOptional() {
        return RelopExprOptional;
    }

    public void setRelopExprOptional(RelopExprOptional RelopExprOptional) {
        this.RelopExprOptional=RelopExprOptional;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(Expr!=null) Expr.accept(visitor);
        if(RelopExprOptional!=null) RelopExprOptional.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Expr!=null) Expr.traverseTopDown(visitor);
        if(RelopExprOptional!=null) RelopExprOptional.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Expr!=null) Expr.traverseBottomUp(visitor);
        if(RelopExprOptional!=null) RelopExprOptional.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ConditionFact(\n");

        if(Expr!=null)
            buffer.append(Expr.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(RelopExprOptional!=null)
            buffer.append(RelopExprOptional.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ConditionFact]");
        return buffer.toString();
    }
}
