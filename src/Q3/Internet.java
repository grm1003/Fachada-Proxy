package Q3;

import java.io.IOException;
import java.net.URISyntaxException;

public interface Internet {

    //valida se usuário tem permissão para entrar no site
    void conectar (String url_site, int idade) throws Exception;

}
