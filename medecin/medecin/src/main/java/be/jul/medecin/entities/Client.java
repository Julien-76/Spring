package be.jul.medecin.entities;


import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String nom;

    @Column
    private String prenom;

    @Column
    private String tel;

    @Column
    private String email;

    @ManyToMany(mappedBy = "medecins")
    private List<Medecin> rendezvous;
}
