package Strategy;
//ConcreteStrategyB
public class Gold implements Status{

 

    @Override
    public double calcularAnuidade(double renda) {
        return 0.01*renda;
    }

 

}
 