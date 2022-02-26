package cigma.pfe;
    import cigma.pfe.models.Client;
    import cigma.pfe.services.ClientService;
    import cigma.pfe.controllers.ClientController;
    import cigma.pfe.repositories.ClientRepository;
    import org.springframework.context.ApplicationContext;
    import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MonApplication {
        public static void main(String[] args) {
            ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
            ClientController ctrl = (ClientController) context.getBean("controller");
            /*
            ClientRepository ctrl0 = (ClientRepository) context.getBean("repository");
            ClientService ctrl1 = (ClientService) context.getBean("service");
            */
            Client cli = new Client("Yassine");
            ctrl.save(cli);

        }
}
