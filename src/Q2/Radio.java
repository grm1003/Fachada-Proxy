package Q2;

public class Radio implements StarStop {
    int cod_estacao;
    @Override
    public void liga() {

    }

    @Override
    public void desliga() {

    }

    public void mudarEstacao(int cod_estacao) {
            this.cod_estacao = cod_estacao;
    }
}
