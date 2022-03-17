package cigma.pfe;

    import cigma.pfe.models.*;
    import cigma.pfe.controllers.ClientController;
    import org.springframework.context.ApplicationContext;
    import org.springframework.context.support.ClassPathXmlApplicationContext;



public class MonApplication {

    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
        ClientController ctr= (ClientController) ctx.getBean("ctrl1");


        ctr.save(new Client ("Jamil"));
        ctr.save(new ClientVip("Adil","tvv"));
        ctr.save(new ClientNormal ("Imad",5));
    }
}