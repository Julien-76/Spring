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
public class Employe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NonNull
    @Column(name = "name", columnDefinition = "VARCHAR(100)", nullable = false)
    private String nom;

    @Column(columnDefinition = "VARCHAR(50)")
    private String email;

    @NonNull
    @Column(nullable = false)
    private String telephone;

    @ManyToMany
    List<Supermarche> supermarche;
}
