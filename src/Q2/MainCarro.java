package Q2;

public class MainCarro {
    public static void main(String[] args) {
        FachadaCarro drive = new FachadaCarro();
        try{
            drive.dirigir();
            drive.desligar();
            System.out.println("Chegamos no destino");
        }catch(Exception e){
            System.out.println("Probelmas do carro");
        }

    }

}
