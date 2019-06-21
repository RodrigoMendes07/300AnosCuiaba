package br.com.projeto.teste;

import br.com.projeto.ImagenBean;
import br.com.projeto.dao.ImagenDao;
import java.util.Calendar;
import java.util.Date;

public class Teste {

    public static void main(String[] args) {

        ImagenDao dao = new ImagenDao();

        ImagenBean img = new ImagenBean();

        img.setTitulo("titulo");
        String hoje = "18/06/2019";
        Calendar calendar = Calendar.getInstance();
            
        Date date = new Date();
        
        calendar.setTime(date);
        
        calendar.set(Calendar.YEAR, 2019);
        calendar.set(Calendar.MONTH, 6);
        calendar.set(Calendar.DAY_OF_MONTH, 19);

        img.setData(calendar);
        img.setDimensao("12X6");
        img.setAutor("autor");
        img.setInstituicao("instituicao");
        img.setProcedimento("procedimento");
        img.setImagem("imagem");

        dao.salvar(img);
        
    }
}