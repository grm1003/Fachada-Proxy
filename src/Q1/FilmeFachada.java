package Q1;

public class FilmeFachada {
    private Amplificador amp = new Amplificador();
    private Luzes luz = new Luzes();
    private MaquinaPipoca pipoca = new MaquinaPipoca();

    private PlayerStreaming player = new PlayerStreaming();
    private Projetor projetor = new Projetor();
     private Telao telao = new Telao();


      public  void fimdoFilme(){
          amp.desliga();
          luz.desliga();
          projetor.desliga();
          player.desliga();
          telao.abaixa();

      }


}
