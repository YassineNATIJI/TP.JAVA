package cigma.pfe.controllers;

    import cigma.pfe.models.Client;
    import cigma.pfe.services.ClientService;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Controller;



@Controller("ctrl1")
public class ClientController {

    @Autowired
    private ClientService service;
    public void save(Client person) {
        service.save(person);
    }
    public ClientController() {
        System.out.println("creation bean controller");
    }
}



