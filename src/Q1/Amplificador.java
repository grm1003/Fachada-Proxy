package Q1;

public class Amplificador implements AparelhoEletronico{
    int volume;
    @Override
    public void liga() {

    }

    @Override
    public void desliga() {

    }

    public void ajustaVolume(int valor){ this.volume += valor;}

}
