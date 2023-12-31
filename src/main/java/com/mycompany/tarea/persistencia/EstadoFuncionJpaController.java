
package com.mycompany.tarea.persistencia;

import com.mycompany.tarea.logica.EstadoFuncion;
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


public class EstadoFuncionJpaController implements Serializable {

    public EstadoFuncionJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    public EstadoFuncionJpaController() {
        emf = Persistence.createEntityManagerFactory("TareaJPAPU");
    }
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(EstadoFuncion estadoFuncion) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(estadoFuncion);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(EstadoFuncion estadoFuncion) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            estadoFuncion = em.merge(estadoFuncion);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = estadoFuncion.getId();
                if (findEstadoFuncion(id) == null) {
                    throw new NonexistentEntityException("The estadoFuncion with id " + id + " no longer exists.");
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
            EstadoFuncion estadoFuncion;
            try {
                estadoFuncion = em.getReference(EstadoFuncion.class, id);
                estadoFuncion.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The estadoFuncion with id " + id + " no longer exists.", enfe);
            }
            em.remove(estadoFuncion);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<EstadoFuncion> findEstadoFuncionEntities() {
        return findEstadoFuncionEntities(true, -1, -1);
    }

    public List<EstadoFuncion> findEstadoFuncionEntities(int maxResults, int firstResult) {
        return findEstadoFuncionEntities(false, maxResults, firstResult);
    }

    private List<EstadoFuncion> findEstadoFuncionEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(EstadoFuncion.class));
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

    public EstadoFuncion findEstadoFuncion(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(EstadoFuncion.class, id);
        } finally {
            em.close();
        }
    }

    public int getEstadoFuncionCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<EstadoFuncion> rt = cq.from(EstadoFuncion.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
