package Decorator;

abstract public class Cafe {
    
    private double preco;

 

    public Cafe(double preco) {
        this.preco = preco;
    }
    
    public double getPreco() {
        return preco;
    }
    
}
