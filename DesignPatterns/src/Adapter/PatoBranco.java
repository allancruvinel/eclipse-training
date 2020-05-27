package Adapter;

public class PatoBranco implements Pato{

    @Override
    public void nadar() {
        System.out.println("NADOU COMO PATO B");
    }

 

    @Override
    public void voar() {
        System.out.println("MAIS OU MENOS...");
    }

 

    @Override
    public void grasnar() {
        System.out.println("Branco: QUAACK");
    }

 

}
 