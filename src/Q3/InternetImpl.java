package Q3;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class InternetImpl implements Internet{
    private int idade_minima = 16;

    public void setIdade_minima(int idade_minima) {
        this.idade_minima = idade_minima;
    }

    @Override
    public void conectar(String url_site, int idade) throws Exception {
        if(idade >= this.idade_minima) {
            URI link = new URI(url_site);
            Desktop.getDesktop().browse(link);
        }else{
            throw new Exception("Sem permissão para acessar");
        }
    }
}
