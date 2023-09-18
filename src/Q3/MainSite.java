package Q3;

public class MainSite {

    public static void main(String[] args) {
        User aluno = new User(12);
        User professor = new User(32);
        InternetProxy teste_aluno = new InternetProxy(aluno);
        InternetProxy teste_prof = new InternetProxy(professor);
        teste_prof.conectar("www.google.com");
        teste_aluno.conectar("www.google.com");


    }
}
