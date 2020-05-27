package Strategy;
//ConcreteStrategyA
public class Silver implements Status{

 

    @Override
    public double calcularAnuidade(double renda) {
        return 0.005*renda*(1+Math.random());
    }

 

}
 