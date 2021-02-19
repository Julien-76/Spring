package be.jul.medecin.entities;


import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Competence {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String nom;

    @Column
    private String descritpion;

    @ManyToMany(mappedBy = "competences")
    List<Medecin> medecins;
}
