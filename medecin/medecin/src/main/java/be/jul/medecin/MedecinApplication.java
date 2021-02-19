package be.jul.medecin;

import be.jul.medecin.entities.Competence;
import be.jul.medecin.repository.CabinetRepository;
import be.jul.medecin.repository.ClientRepository;
import be.jul.medecin.repository.CompetenceRepository;
import be.jul.medecin.repository.MedecinRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MedecinApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(MedecinApplication.class, args);

		CabinetRepository cabinetRepository = context.getBean(CabinetRepository.class);
		ClientRepository clientRepository = context.getBean(ClientRepository.class);
		CompetenceRepository competenceRepository = context.getBean(CompetenceRepository.class);
		MedecinRepository medecinRepository = context.getBean(MedecinRepository.class);
	}



}
