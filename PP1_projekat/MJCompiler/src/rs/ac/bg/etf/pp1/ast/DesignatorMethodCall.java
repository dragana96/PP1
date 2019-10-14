// generated with ast extension for cup
// version 0.8
// 19/7/2019 23:32:1


package rs.ac.bg.etf.pp1.ast;

public class DesignatorMethodCall extends DesignatorStatement {

    private Designator Designator;
    private CallParamList CallParamList;

    public DesignatorMethodCall (Designator Designator, CallParamList CallParamList) {
        this.Designator=Designator;
        if(Designator!=null) Designator.setParent(this);
        this.CallParamList=CallParamList;
        if(CallParamList!=null) CallParamList.setParent(this);
    }

    public Designator getDesignator() {
        return Designator;
    }

    public void setDesignator(Designator Designator) {
        this.Designator=Designator;
    }

    public CallParamList getCallParamList() {
        return CallParamList;
    }

    public void setCallParamList(CallParamList CallParamList) {
        this.CallParamList=CallParamList;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(Designator!=null) Designator.accept(visitor);
        if(CallParamList!=null) CallParamList.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Designator!=null) Designator.traverseTopDown(visitor);
        if(CallParamList!=null) CallParamList.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Designator!=null) Designator.traverseBottomUp(visitor);
        if(CallParamList!=null) CallParamList.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("DesignatorMethodCall(\n");

        if(Designator!=null)
            buffer.append(Designator.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(CallParamList!=null)
            buffer.append(CallParamList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [DesignatorMethodCall]");
        return buffer.toString();
    }
}
