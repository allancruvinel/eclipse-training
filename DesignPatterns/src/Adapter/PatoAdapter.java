package Adapter;

public class PatoAdapter implements Pato{
    
    private Peru peru;
    
    public PatoAdapter(Peru peru) {
        this.peru = peru;
    }

 

    @Override
    public void nadar() {
        peru.andar();
    }

 

    @Override
    public void voar() {
        peru.pular();
    }

 

    @Override
    public void grasnar() {
        peru.wobble();
    }
    
}
