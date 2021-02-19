package be.jul.medecin.entities;


import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Medecin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String nom;

    @Column
    private String prenom;

    @Column
    private LocalDate debutCarriere;

    @ManyToMany
    private List<Competence> competences;

    @ManyToMany
    private List<Client> clients;

    @OneToMany(mappedBy = "bosseurs")
    private Cabinet cabinet;
}
