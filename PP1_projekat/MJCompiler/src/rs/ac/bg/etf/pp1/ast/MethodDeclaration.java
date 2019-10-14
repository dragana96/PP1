// generated with ast extension for cup
// version 0.8
// 19/7/2019 23:32:1


package rs.ac.bg.etf.pp1.ast;

public class MethodDeclaration extends MethodDecl {

    private MethodType MethodType;
    private MethodName MethodName;
    private FormParsOptional FormParsOptional;
    private LocalVarDeclarationList LocalVarDeclarationList;
    private StartMethodSt StartMethodSt;
    private StatementList StatementList;

    public MethodDeclaration (MethodType MethodType, MethodName MethodName, FormParsOptional FormParsOptional, LocalVarDeclarationList LocalVarDeclarationList, StartMethodSt StartMethodSt, StatementList StatementList) {
        this.MethodType=MethodType;
        if(MethodType!=null) MethodType.setParent(this);
        this.MethodName=MethodName;
        if(MethodName!=null) MethodName.setParent(this);
        this.FormParsOptional=FormParsOptional;
        if(FormParsOptional!=null) FormParsOptional.setParent(this);
        this.LocalVarDeclarationList=LocalVarDeclarationList;
        if(LocalVarDeclarationList!=null) LocalVarDeclarationList.setParent(this);
        this.StartMethodSt=StartMethodSt;
        if(StartMethodSt!=null) StartMethodSt.setParent(this);
        this.StatementList=StatementList;
        if(StatementList!=null) StatementList.setParent(this);
    }

    public MethodType getMethodType() {
        return MethodType;
    }

    public void setMethodType(MethodType MethodType) {
        this.MethodType=MethodType;
    }

    public MethodName getMethodName() {
        return MethodName;
    }

    public void setMethodName(MethodName MethodName) {
        this.MethodName=MethodName;
    }

    public FormParsOptional getFormParsOptional() {
        return FormParsOptional;
    }

    public void setFormParsOptional(FormParsOptional FormParsOptional) {
        this.FormParsOptional=FormParsOptional;
    }

    public LocalVarDeclarationList getLocalVarDeclarationList() {
        return LocalVarDeclarationList;
    }

    public void setLocalVarDeclarationList(LocalVarDeclarationList LocalVarDeclarationList) {
        this.LocalVarDeclarationList=LocalVarDeclarationList;
    }

    public StartMethodSt getStartMethodSt() {
        return StartMethodSt;
    }

    public void setStartMethodSt(StartMethodSt StartMethodSt) {
        this.StartMethodSt=StartMethodSt;
    }

    public StatementList getStatementList() {
        return StatementList;
    }

    public void setStatementList(StatementList StatementList) {
        this.StatementList=StatementList;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(MethodType!=null) MethodType.accept(visitor);
        if(MethodName!=null) MethodName.accept(visitor);
        if(FormParsOptional!=null) FormParsOptional.accept(visitor);
        if(LocalVarDeclarationList!=null) LocalVarDeclarationList.accept(visitor);
        if(StartMethodSt!=null) StartMethodSt.accept(visitor);
        if(StatementList!=null) StatementList.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(MethodType!=null) MethodType.traverseTopDown(visitor);
        if(MethodName!=null) MethodName.traverseTopDown(visitor);
        if(FormParsOptional!=null) FormParsOptional.traverseTopDown(visitor);
        if(LocalVarDeclarationList!=null) LocalVarDeclarationList.traverseTopDown(visitor);
        if(StartMethodSt!=null) StartMethodSt.traverseTopDown(visitor);
        if(StatementList!=null) StatementList.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(MethodType!=null) MethodType.traverseBottomUp(visitor);
        if(MethodName!=null) MethodName.traverseBottomUp(visitor);
        if(FormParsOptional!=null) FormParsOptional.traverseBottomUp(visitor);
        if(LocalVarDeclarationList!=null) LocalVarDeclarationList.traverseBottomUp(visitor);
        if(StartMethodSt!=null) StartMethodSt.traverseBottomUp(visitor);
        if(StatementList!=null) StatementList.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("MethodDeclaration(\n");

        if(MethodType!=null)
            buffer.append(MethodType.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(MethodName!=null)
            buffer.append(MethodName.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(FormParsOptional!=null)
            buffer.append(FormParsOptional.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(LocalVarDeclarationList!=null)
            buffer.append(LocalVarDeclarationList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(StartMethodSt!=null)
            buffer.append(StartMethodSt.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(StatementList!=null)
            buffer.append(StatementList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [MethodDeclaration]");
        return buffer.toString();
    }
}
