package cigma.pfe;

    import cigma.pfe.models.*;
    import cigma.pfe.controllers.ClientController;
    import org.springframework.context.ApplicationContext;
    import org.springframework.context.support.ClassPathXmlApplicationContext;



public class MonApplication {

    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
        ClientController ctr= (ClientController) ctx.getBean("ctrl1");

        Client client1 = new Client("Omar");
        Client client2 = new Client("Said");
        Client client3 = new Client("Ahmed");
        ctr.save(client1);
        ctr.save(client2);
        ctr.save(client3);




    }
}