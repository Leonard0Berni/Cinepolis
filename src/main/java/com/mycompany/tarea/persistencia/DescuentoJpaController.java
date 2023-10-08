
package com.mycompany.tarea.persistencia;

import com.mycompany.tarea.logica.Descuento;
import com.mycompany.tarea.persistencia.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class DescuentoJpaController implements Serializable {

    public DescuentoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    public DescuentoJpaController() {
        emf = Persistence.createEntityManagerFactory("TareaJPAPU");
    }
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Descuento descuento) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(descuento);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Descuento descuento) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            descuento = em.merge(descuento);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = descuento.getId();
                if (findDescuento(id) == null) {
                    throw new NonexistentEntityException("The descuento with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Descuento descuento;
            try {
                descuento = em.getReference(Descuento.class, id);
                descuento.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The descuento with id " + id + " no longer exists.", enfe);
            }
            em.remove(descuento);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Descuento> findDescuentoEntities() {
        return findDescuentoEntities(true, -1, -1);
    }

    public List<Descuento> findDescuentoEntities(int maxResults, int firstResult) {
        return findDescuentoEntities(false, maxResults, firstResult);
    }

    private List<Descuento> findDescuentoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Descuento.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Descuento findDescuento(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Descuento.class, id);
        } finally {
            em.close();
        }
    }

    public int getDescuentoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Descuento> rt = cq.from(Descuento.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
