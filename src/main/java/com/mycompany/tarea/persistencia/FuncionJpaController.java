
package com.mycompany.tarea.persistencia;

import com.mycompany.tarea.logica.Funcion;
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

public class FuncionJpaController implements Serializable {

    public FuncionJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    public FuncionJpaController() {
        emf = Persistence.createEntityManagerFactory("TareaJPAPU");
    }
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Funcion funcion) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(funcion);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Funcion funcion) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            funcion = em.merge(funcion);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = funcion.getId();
                if (findFuncion(id) == null) {
                    throw new NonexistentEntityException("The funcion with id " + id + " no longer exists.");
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
            Funcion funcion;
            try {
                funcion = em.getReference(Funcion.class, id);
                funcion.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The funcion with id " + id + " no longer exists.", enfe);
            }
            em.remove(funcion);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Funcion> findFuncionEntities() {
        return findFuncionEntities(true, -1, -1);
    }

    public List<Funcion> findFuncionEntities(int maxResults, int firstResult) {
        return findFuncionEntities(false, maxResults, firstResult);
    }

    private List<Funcion> findFuncionEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Funcion.class));
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

    public Funcion findFuncion(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Funcion.class, id);
        } finally {
            em.close();
        }
    }

    public int getFuncionCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Funcion> rt = cq.from(Funcion.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
