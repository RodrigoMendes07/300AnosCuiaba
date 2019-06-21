/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.dao;

import br.com.projeto.ImagenBean;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Ti - Mobile
 */
public class NewClass {
    
    
    private static NewClass instance;
    protected EntityManager entityManager;

    public static NewClass getInstance() {
        if (instance == null) {
            instance = new NewClass();
        }

        return instance;
    }

    private NewClass() {
        entityManager = getEntityManager();
    }

    private EntityManager getEntityManager() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("Cuiaba300");
        if (entityManager == null) {
            entityManager = factory.createEntityManager();
        }

        return entityManager;
    }

    public ImagenBean getById(final int id) {
        return entityManager.find(ImagenBean.class, id);
    }

    @SuppressWarnings("unchecked")
    public List <ImagenBean> findAll() {
        return entityManager.createQuery("FROM " + ImagenBean.class.getName()).getResultList();
    }

    public void persist(ImagenBean obraD) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(obraD);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }

    public boolean merge (ImagenBean obraD) {
            boolean ok = false;
        try {
            entityManager.getTransaction().begin();
            entityManager.merge(obraD);
            entityManager.getTransaction().commit();
            ok = true;
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
       return ok;
    }

    public void remove (ImagenBean obraD) {
        try {
            entityManager.getTransaction().begin();
            obraD = entityManager.find(ImagenBean.class, obraD.getIdImagen());
            entityManager.remove(obraD);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }

    public void removeById(final int id) {
        try {
           ImagenBean obraD = getById(id);
            remove(obraD);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}