package Decorator;

abstract public class CafeDecorator extends Cafe{
    
    private Cafe prox;
    
    public CafeDecorator(double preco) {
        super(preco);
    }

 

    protected void setProx(Cafe prox) {
        this.prox = prox;
    }

 

    protected Cafe getProx() {
        return prox;
    }
    
}