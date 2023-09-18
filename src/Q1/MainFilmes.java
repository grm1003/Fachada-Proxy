package Q1;

public class MainFilmes {
    public static void main(String[] args) {
        FilmeFachada ritual = new FilmeFachada();

        try {
            ritual.fimdoFilme();
            System.out.println("tudo ok");
        }catch (Exception e){
            System.out.println("erro");
        }


    }
}
