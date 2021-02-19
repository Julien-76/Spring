package be.techni.demoSpringBoot.model.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GameDTO {

    private int id;

    private String name;
    private int nbJoueurs;
}
