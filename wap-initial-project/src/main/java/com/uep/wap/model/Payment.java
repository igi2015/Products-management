import javax.persistence.*;

@Entity
@Table(name="payments")
public class Payment {
    @Id
    @Column(name ="id")
    private long id;
  
  
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToOne(mappedBy = "person", cascade = CascadeType.ALL)
    private Address address;

    // Getters and setters
}
