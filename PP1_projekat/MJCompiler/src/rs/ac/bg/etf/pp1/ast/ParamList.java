// generated with ast extension for cup
// version 0.8
// 19/7/2019 23:32:1


package rs.ac.bg.etf.pp1.ast;

public class ParamList extends CallParamList {

    private CallParams CallParams;

    public ParamList (CallParams CallParams) {
        this.CallParams=CallParams;
        if(CallParams!=null) CallParams.setParent(this);
    }

    public CallParams getCallParams() {
        return CallParams;
    }

    public void setCallParams(CallParams CallParams) {
        this.CallParams=CallParams;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(CallParams!=null) CallParams.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(CallParams!=null) CallParams.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(CallParams!=null) CallParams.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ParamList(\n");

        if(CallParams!=null)
            buffer.append(CallParams.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ParamList]");
        return buffer.toString();
    }
}
