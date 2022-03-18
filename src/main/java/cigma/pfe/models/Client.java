package cigma.pfe.models;

    import lombok.Data;

    import javax.persistence.*;

@Entity(name = "TCLIENT")
@Data
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
         private long id;
         private String name;
         

    public Client(String name) {
        this.name = name;
    }

    public Client() {
    }

}