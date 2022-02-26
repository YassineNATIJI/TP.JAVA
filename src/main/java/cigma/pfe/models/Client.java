package cigma.pfe.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Data
@AllArgsConstructor
@Entity(name="TClients")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    public Client(String name) {
        this.name = name;
    }

    public Client() {}

    @Column
    private String name;

    @Override
    public String toString() {
        return "Client {" +
                "id=" + id +
                ", name : '" + name + '\'' +
                        '}' ;
    }

}
