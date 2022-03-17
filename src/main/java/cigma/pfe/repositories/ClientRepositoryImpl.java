package cigma.pfe.repositories;

import cigma.pfe.models.Client;

import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class ClientRepositoryImpl implements ClientRepository {

        @PersistenceContext
        private EntityManager entitymanager;
        @Override
        public void save(Client p) {
            entitymanager.persist(p);
        }

    @Override
    public Client update(Client c) {
        return null;
    }

    @Override
    public void deleteById(long idClient) {

    }

    @Override
    public Client findById(long idClient) {
        return null;
    }

    public ClientRepositoryImpl() {
            System.out.println("creation bean dao");
        }
}