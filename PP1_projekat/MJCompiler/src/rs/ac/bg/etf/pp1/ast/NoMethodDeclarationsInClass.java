// generated with ast extension for cup
// version 0.8
// 19/7/2019 23:32:1


package rs.ac.bg.etf.pp1.ast;

public class NoMethodDeclarationsInClass extends MethodDeclOptional {

    public NoMethodDeclarationsInClass () {
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("NoMethodDeclarationsInClass(\n");

        buffer.append(tab);
        buffer.append(") [NoMethodDeclarationsInClass]");
        return buffer.toString();
    }
}
