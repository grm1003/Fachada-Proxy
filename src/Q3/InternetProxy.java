package Q3;

import java.io.IOException;
import java.net.URISyntaxException;

public class InternetProxy {
    InternetImpl internet = new InternetImpl();
    User user;

    public InternetProxy(User user) {
        this.user = user;
    }

    //Limitar que pessoas menores de idade não tem acesso a internet nos computadores dentro da escola

    public void conectar(String url_site) {
        try {
            internet.setIdade_minima(18);
            internet.conectar(url_site,user.getIdade());
        } catch (Exception e) {
        System.out.println("Você não permissão para acessar o site");
        }
    }
}
