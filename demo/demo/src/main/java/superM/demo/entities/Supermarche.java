package superM.demo.entities;


import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Builder
public class Supermarche {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NonNull
    @Column(name = "nom", columnDefinition = "VARCHAR(50)", nullable = false, unique = true)
    private String nom;

    @NonNull
    @Column(nullable = false)
    private String adresse;

    @Column
    private String heureOuverture;

    @Column
    private String heureFermeture;

    @OneToMany(mappedBy = "supermarche")
    private List<Rayon> rayons;
}
