package superM.demo.entities;


import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Builder
public class Article {


    @Id
    private String codeBarre;

    @Column(name = "nom", columnDefinition = "VARCHAR(50)", nullable = false, unique = false)
    private String nom;

    @Column
    private String marque;

    @Column
    private String description;

    @Column
    private int prix;

    @ManyToOne
    private Rayon rayon;
}
