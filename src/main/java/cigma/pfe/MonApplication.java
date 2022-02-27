package cigma.pfe;

    import cigma.pfe.models.CarteFidelio;
    import cigma.pfe.models.Client;
    import cigma.pfe.models.Facture;
    import cigma.pfe.controllers.ClientController;
    import cigma.pfe.models.Promotion;
    import org.springframework.context.ApplicationContext;
    import org.springframework.context.support.ClassPathXmlApplicationContext;

    import java.util.Arrays;
    import java.util.List;


public class MonApplication {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
        ClientController ctr= (ClientController) ctx.getBean("controller");
        Client client = new Client("OMAR");
        CarteFidelio carteFidelio = new CarteFidelio("A29930489");
        carteFidelio.setClient(client);
        client.setCarteFidelio(carteFidelio);
        ctr.save(client);
    }
}