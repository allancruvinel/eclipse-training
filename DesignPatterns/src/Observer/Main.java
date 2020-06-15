package Observer;

public class Main {

	 

    public static void main(String[] args) {

        Celular c = new Celular();
        ConcreteSubject  cs = new ConcreteSubject();
        cs.anexar(c);
        cs.setEstado(new Estado(5.8,12));
        cs.setEstado(new Estado(5.84,13));
        //O abstract na classe Subject impede:
        //Subject ss = new Subject();
        //ss.anexar(s);
        //ss.notificar();

 

    }

 

}
