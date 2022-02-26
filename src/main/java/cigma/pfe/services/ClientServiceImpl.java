package cigma.pfe.services;
    import cigma.pfe.repositories.ClientRepository;
    import cigma.pfe.models.Client;
    import lombok.AllArgsConstructor;

public class ClientServiceImpl implements ClientService {
    private ClientRepository dao;
    public void setDao(ClientRepository dao) {
        this.dao = dao;
    }
    @Override
    public Client save(Client c) {
        return dao.save(c);
    }
    @Override
    public Client modify(Client c) {
        return dao.update(c);
    }
    @Override
    public void removeById(long id) {
        dao.deleteById(id);
    }
    @Override
    public Client getById(long id) {
        return dao.findById(id);
    }
}
