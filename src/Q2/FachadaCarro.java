package Q2;

public class FachadaCarro {
    //padrão radio favorita
    private  int cod_radiofavorita = 1032;

    private Motor motor = new Motor();
    private Farois farois = new Farois();
    private Cinto cinto = new Cinto();
    private Radio radio = new Radio();
    private Portas portas = new Portas();

    void setRadiofavorita(int cod){
        this.cod_radiofavorita = cod;
    }

    void dirigir(){
        cinto.travar();
        motor.liga();
        farois.liga();
        portas.trancar();
        radio.liga();
        radio.mudarEstacao(cod_radiofavorita);
    }

    void desligar(){
        radio.desliga();
        farois.desliga();
        motor.desliga();
        cinto.destravar();
        portas.destrancar();
    }


}
