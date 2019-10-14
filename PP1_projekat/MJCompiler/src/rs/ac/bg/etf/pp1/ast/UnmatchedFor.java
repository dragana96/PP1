// generated with ast extension for cup
// version 0.8
// 19/7/2019 23:32:1


package rs.ac.bg.etf.pp1.ast;

public class UnmatchedFor extends Unmatched {

    private DesignatorStatementOrNot DesignatorStatementOrNot;
    private ConditionOrNot ConditionOrNot;
    private DesignatorStatementOrNot DesignatorStatementOrNot1;
    private Unmatched Unmatched;

    public UnmatchedFor (DesignatorStatementOrNot DesignatorStatementOrNot, ConditionOrNot ConditionOrNot, DesignatorStatementOrNot DesignatorStatementOrNot1, Unmatched Unmatched) {
        this.DesignatorStatementOrNot=DesignatorStatementOrNot;
        if(DesignatorStatementOrNot!=null) DesignatorStatementOrNot.setParent(this);
        this.ConditionOrNot=ConditionOrNot;
        if(ConditionOrNot!=null) ConditionOrNot.setParent(this);
        this.DesignatorStatementOrNot1=DesignatorStatementOrNot1;
        if(DesignatorStatementOrNot1!=null) DesignatorStatementOrNot1.setParent(this);
        this.Unmatched=Unmatched;
        if(Unmatched!=null) Unmatched.setParent(this);
    }

    public DesignatorStatementOrNot getDesignatorStatementOrNot() {
        return DesignatorStatementOrNot;
    }

    public void setDesignatorStatementOrNot(DesignatorStatementOrNot DesignatorStatementOrNot) {
        this.DesignatorStatementOrNot=DesignatorStatementOrNot;
    }

    public ConditionOrNot getConditionOrNot() {
        return ConditionOrNot;
    }

    public void setConditionOrNot(ConditionOrNot ConditionOrNot) {
        this.ConditionOrNot=ConditionOrNot;
    }

    public DesignatorStatementOrNot getDesignatorStatementOrNot1() {
        return DesignatorStatementOrNot1;
    }

    public void setDesignatorStatementOrNot1(DesignatorStatementOrNot DesignatorStatementOrNot1) {
        this.DesignatorStatementOrNot1=DesignatorStatementOrNot1;
    }

    public Unmatched getUnmatched() {
        return Unmatched;
    }

    public void setUnmatched(Unmatched Unmatched) {
        this.Unmatched=Unmatched;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(DesignatorStatementOrNot!=null) DesignatorStatementOrNot.accept(visitor);
        if(ConditionOrNot!=null) ConditionOrNot.accept(visitor);
        if(DesignatorStatementOrNot1!=null) DesignatorStatementOrNot1.accept(visitor);
        if(Unmatched!=null) Unmatched.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(DesignatorStatementOrNot!=null) DesignatorStatementOrNot.traverseTopDown(visitor);
        if(ConditionOrNot!=null) ConditionOrNot.traverseTopDown(visitor);
        if(DesignatorStatementOrNot1!=null) DesignatorStatementOrNot1.traverseTopDown(visitor);
        if(Unmatched!=null) Unmatched.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(DesignatorStatementOrNot!=null) DesignatorStatementOrNot.traverseBottomUp(visitor);
        if(ConditionOrNot!=null) ConditionOrNot.traverseBottomUp(visitor);
        if(DesignatorStatementOrNot1!=null) DesignatorStatementOrNot1.traverseBottomUp(visitor);
        if(Unmatched!=null) Unmatched.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("UnmatchedFor(\n");

        if(DesignatorStatementOrNot!=null)
            buffer.append(DesignatorStatementOrNot.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(ConditionOrNot!=null)
            buffer.append(ConditionOrNot.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(DesignatorStatementOrNot1!=null)
            buffer.append(DesignatorStatementOrNot1.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(Unmatched!=null)
            buffer.append(Unmatched.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [UnmatchedFor]");
        return buffer.toString();
    }
}
