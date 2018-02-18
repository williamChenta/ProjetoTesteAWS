package repository;

import java.util.List;
import javax.persistence.EntityManager;
import model.Carro;
import util.Conexao;

public class CarroDao {
    EntityManager em;

    public CarroDao() {
        em = Conexao.getEmf().createEntityManager();
    }
    
    public void salvar(Carro c) {
        em.getTransaction().begin();
        
        if(c.getId() != null) {
            em.merge(c);
        } else {
            em.persist(c);
        }
        
        em.getTransaction().commit();
    }
    
    public void excluir(Carro c) {
        em.getTransaction().begin();
        em.remove(em.merge(c));
        em.getTransaction().commit();
    }
    
    public List<Carro> listar() {
        return em.createQuery("select c from Carro c").getResultList();
    }
}
