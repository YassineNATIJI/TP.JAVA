package cigma.pfe.services;

    import cigma.pfe.models.Client;
    import org.springframework.transaction.annotation.Transactional;

    import java.util.List;

public interface ClientService {
    Client save(Client c);
    Client modify(Client c);
    void removeById(long id);
    Client getById(long id);

    @Transactional
    void remove(long idClt);

    Client getOne(long idClt);

    List<Client> getAll();

}
