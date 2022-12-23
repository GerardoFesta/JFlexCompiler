package nodes;

import visitors.Visitor;

public abstract class Expr extends Object {
    public Expr(String tipo) {
        this.tipo=tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public abstract Object accept(Visitor v);

    String tipo;
}
