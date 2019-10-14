// generated with ast extension for cup
// version 0.8
// 19/7/2019 23:32:1


package rs.ac.bg.etf.pp1.ast;

public class ClassDecl implements SyntaxNode {

    private SyntaxNode parent;
    private int line;
    private String className;
    private ExtendingOptional ExtendingOptional;
    private ImplementingOptional ImplementingOptional;
    private LocalVarDeclarationList LocalVarDeclarationList;
    private MethodDeclOptional MethodDeclOptional;

    public ClassDecl (String className, ExtendingOptional ExtendingOptional, ImplementingOptional ImplementingOptional, LocalVarDeclarationList LocalVarDeclarationList, MethodDeclOptional MethodDeclOptional) {
        this.className=className;
        this.ExtendingOptional=ExtendingOptional;
        if(ExtendingOptional!=null) ExtendingOptional.setParent(this);
        this.ImplementingOptional=ImplementingOptional;
        if(ImplementingOptional!=null) ImplementingOptional.setParent(this);
        this.LocalVarDeclarationList=LocalVarDeclarationList;
        if(LocalVarDeclarationList!=null) LocalVarDeclarationList.setParent(this);
        this.MethodDeclOptional=MethodDeclOptional;
        if(MethodDeclOptional!=null) MethodDeclOptional.setParent(this);
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className=className;
    }

    public ExtendingOptional getExtendingOptional() {
        return ExtendingOptional;
    }

    public void setExtendingOptional(ExtendingOptional ExtendingOptional) {
        this.ExtendingOptional=ExtendingOptional;
    }

    public ImplementingOptional getImplementingOptional() {
        return ImplementingOptional;
    }

    public void setImplementingOptional(ImplementingOptional ImplementingOptional) {
        this.ImplementingOptional=ImplementingOptional;
    }

    public LocalVarDeclarationList getLocalVarDeclarationList() {
        return LocalVarDeclarationList;
    }

    public void setLocalVarDeclarationList(LocalVarDeclarationList LocalVarDeclarationList) {
        this.LocalVarDeclarationList=LocalVarDeclarationList;
    }

    public MethodDeclOptional getMethodDeclOptional() {
        return MethodDeclOptional;
    }

    public void setMethodDeclOptional(MethodDeclOptional MethodDeclOptional) {
        this.MethodDeclOptional=MethodDeclOptional;
    }

    public SyntaxNode getParent() {
        return parent;
    }

    public void setParent(SyntaxNode parent) {
        this.parent=parent;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line=line;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(ExtendingOptional!=null) ExtendingOptional.accept(visitor);
        if(ImplementingOptional!=null) ImplementingOptional.accept(visitor);
        if(LocalVarDeclarationList!=null) LocalVarDeclarationList.accept(visitor);
        if(MethodDeclOptional!=null) MethodDeclOptional.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ExtendingOptional!=null) ExtendingOptional.traverseTopDown(visitor);
        if(ImplementingOptional!=null) ImplementingOptional.traverseTopDown(visitor);
        if(LocalVarDeclarationList!=null) LocalVarDeclarationList.traverseTopDown(visitor);
        if(MethodDeclOptional!=null) MethodDeclOptional.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ExtendingOptional!=null) ExtendingOptional.traverseBottomUp(visitor);
        if(ImplementingOptional!=null) ImplementingOptional.traverseBottomUp(visitor);
        if(LocalVarDeclarationList!=null) LocalVarDeclarationList.traverseBottomUp(visitor);
        if(MethodDeclOptional!=null) MethodDeclOptional.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ClassDecl(\n");

        buffer.append(" "+tab+className);
        buffer.append("\n");

        if(ExtendingOptional!=null)
            buffer.append(ExtendingOptional.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(ImplementingOptional!=null)
            buffer.append(ImplementingOptional.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(LocalVarDeclarationList!=null)
            buffer.append(LocalVarDeclarationList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(MethodDeclOptional!=null)
            buffer.append(MethodDeclOptional.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ClassDecl]");
        return buffer.toString();
    }
}
