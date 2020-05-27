package Adapter;

public class PatoVerde implements Pato{

 

    @Override
    public void nadar() {
        System.out.println("NADOU COMO PATO VERDE");
    }

 

    @Override
    public void voar() {
        System.out.println("ESSE VOA LEGAL.");
    }

 

    @Override
    public void grasnar() {
        System.out.println("Verde: QUAAAAAACK");
    }

 

    
}