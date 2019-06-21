package br.com.projeto.dao;
        
import br.com.projeto.ImagenBean;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ImagenDao {

	EntityManagerFactory emf;
	EntityManager en;

	public ImagenDao() {

		emf = Persistence.createEntityManagerFactory("cuiaba300");
		en = emf.createEntityManager();

	}
        
	public void salvar(ImagenBean img) {
		// Grava��o no banco Utilizando o merge posso Incluir e Editar pelo
		// mesmo metodo.
		en.getTransaction().begin();
		en.merge(img);
		en.getTransaction().commit();
		emf.close();
                
	}

	public void remover(ImagenBean img) {
		// Grava��o no banco
		en.getTransaction().begin();
		en.remove(img);
		en.getTransaction().commit();
		emf.close();
                
	}

	@SuppressWarnings("unchecked")
	public List <ImagenBean> listarTodos() {
		en.getTransaction().begin();
		Query consulta = en.createQuery("select tbl_imagen from ImagenBean tbl_imagen");
		List<ImagenBean> listaImg = consulta.getResultList();
		en.getTransaction().commit();
		emf.close();
		return listaImg;
	}
}