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
public class Rayon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String typeArticle;

    @OneToMany(mappedBy = "rayon")
    private List<Article> articles;

    @ManyToOne
    private Supermarche supermarche;
}
