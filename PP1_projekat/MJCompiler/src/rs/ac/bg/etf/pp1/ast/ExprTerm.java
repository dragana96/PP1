// generated with ast extension for cup
// version 0.8
// 19/7/2019 23:32:1


package rs.ac.bg.etf.pp1.ast;

public class ExprTerm extends Expresion {

    private ExprMinus ExprMinus;
    private Term Term;

    public ExprTerm (ExprMinus ExprMinus, Term Term) {
        this.ExprMinus=ExprMinus;
        if(ExprMinus!=null) ExprMinus.setParent(this);
        this.Term=Term;
        if(Term!=null) Term.setParent(this);
    }

    public ExprMinus getExprMinus() {
        return ExprMinus;
    }

    public void setExprMinus(ExprMinus ExprMinus) {
        this.ExprMinus=ExprMinus;
    }

    public Term getTerm() {
        return Term;
    }

    public void setTerm(Term Term) {
        this.Term=Term;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(ExprMinus!=null) ExprMinus.accept(visitor);
        if(Term!=null) Term.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ExprMinus!=null) ExprMinus.traverseTopDown(visitor);
        if(Term!=null) Term.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ExprMinus!=null) ExprMinus.traverseBottomUp(visitor);
        if(Term!=null) Term.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ExprTerm(\n");

        if(ExprMinus!=null)
            buffer.append(ExprMinus.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(Term!=null)
            buffer.append(Term.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ExprTerm]");
        return buffer.toString();
    }
}
