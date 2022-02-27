package cigma.pfe.models;

    import lombok.Getter;
    import lombok.Setter;
    import lombok.ToString;
    import lombok.AllArgsConstructor;
    import lombok.Data;

    import javax.persistence.*;
    import java.util.List;

@Getter
@Setter
@Entity
@ToString
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;

    @OneToOne(cascade = {CascadeType.PERSIST},mappedBy = "client")
    private CarteFidelio carteFidelio;


    public Client(String name) {
        this.name = name;
    }
}