// generated with ast extension for cup
// version 0.8
// 19/7/2019 23:32:1


package rs.ac.bg.etf.pp1.ast;

public class ExprAddop extends Expresion {

    private Expresion Expresion;
    private Addop Addop;
    private Term Term;

    public ExprAddop (Expresion Expresion, Addop Addop, Term Term) {
        this.Expresion=Expresion;
        if(Expresion!=null) Expresion.setParent(this);
        this.Addop=Addop;
        if(Addop!=null) Addop.setParent(this);
        this.Term=Term;
        if(Term!=null) Term.setParent(this);
    }

    public Expresion getExpresion() {
        return Expresion;
    }

    public void setExpresion(Expresion Expresion) {
        this.Expresion=Expresion;
    }

    public Addop getAddop() {
        return Addop;
    }

    public void setAddop(Addop Addop) {
        this.Addop=Addop;
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
        if(Expresion!=null) Expresion.accept(visitor);
        if(Addop!=null) Addop.accept(visitor);
        if(Term!=null) Term.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Expresion!=null) Expresion.traverseTopDown(visitor);
        if(Addop!=null) Addop.traverseTopDown(visitor);
        if(Term!=null) Term.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Expresion!=null) Expresion.traverseBottomUp(visitor);
        if(Addop!=null) Addop.traverseBottomUp(visitor);
        if(Term!=null) Term.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ExprAddop(\n");

        if(Expresion!=null)
            buffer.append(Expresion.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(Addop!=null)
            buffer.append(Addop.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(Term!=null)
            buffer.append(Term.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ExprAddop]");
        return buffer.toString();
    }
}
