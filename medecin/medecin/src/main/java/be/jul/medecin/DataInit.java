package be.jul.medecin;

import be.jul.medecin.entities.Cabinet;
import be.jul.medecin.entities.Client;
import be.jul.medecin.entities.Competence;
import be.jul.medecin.entities.Medecin;
import be.jul.medecin.repository.CabinetRepository;
import be.jul.medecin.repository.ClientRepository;
import be.jul.medecin.repository.CompetenceRepository;
import be.jul.medecin.repository.MedecinRepository;
import org.springframework.beans.factory.InitializingBean;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DataInit implements InitializingBean {

    private CabinetRepository cabinetRepository;
    private ClientRepository clientRepository;
    private CompetenceRepository competenceRepository;
    private MedecinRepository medecinRepository;

    public DataInit(CabinetRepository cabinetRepository, ClientRepository clientRepository, CompetenceRepository competenceRepository, MedecinRepository medecinRepository) {
        this.cabinetRepository = cabinetRepository;
        this.clientRepository = clientRepository;
        this.competenceRepository = competenceRepository;
        this.medecinRepository = medecinRepository;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        initCabinet();
    }

    private void initCabinet() {
        List<Cabinet> toSave = new ArrayList<>();

        Cabinet cabinet = Cabinet.builder()
                        .nom("Cabinet 1")
                        .adress("Chemin Rue")
                        .build();

        toSave.add(cabinet);

        cabinet = Cabinet.builder()
                .nom("Cabinet 2")
                .adress("Place de Rome")
                .build();

        toSave.add(cabinet);

        cabinet = Cabinet.builder()
                .nom("Cabinet 3")
                .adress("Place Ablert")
                .build();

        toSave.add(cabinet);

        cabinet = Cabinet.builder()
                .nom("Cabinet 4")
                .adress("Place du Parc")
                .build();

        toSave.add(cabinet);


        cabinetRepository.saveAll(toSave);
    }

    private void initClient() {

        List<Client> toSave = new ArrayList<>();
        Client client = Client.builder()
                .nom("Pothen")
                .prenom("Julien")
                .email("jul@jul.be")
                .tel("0494949494")
                .rendezvous(medecinRepository.findAll())
                .build();

        toSave.add(client);

        client = Client.builder()
                .nom("Delvaux")
                .prenom("Sarah")
                .email("Sar@Sar.be")
                .tel("0495959595")
                .rendezvous(medecinRepository.findAll())
                .build();

        toSave.add(client);

        client = Client.builder()
                .nom("Alorchi")
                .prenom("Mehdi")
                .email("med@med.be")
                .tel("0496969696")
                .rendezvous(medecinRepository.findAll())
                .build();

        toSave.add(client);

        client = Client.builder()
                .nom("Hostert")
                .prenom("Stephan")
                .email("stouf@stouf.be")
                .tel("0497979797")
                .rendezvous(medecinRepository.findAll())
                .build();

        toSave.add(client);

        clientRepository.saveAll(toSave);
    }

    private void initCompetence() {
        List<Competence> toSave = new ArrayList<>();

        Competence competence = Competence.builder()
                .nom("Vacciner")
                .descritpion("Vacciner les gens contre différentes maladies")
                .medecins(medecinRepository.findAll())
                .build();
        toSave.add(competence);

        competence = Competence.builder()
                .nom("Amputer")
                .descritpion("Amputer un membre quand le client a trop mal")
                .medecins(medecinRepository.findAll())
                .build();

        competence = Competence.builder()
                .nom("Prise de sang")
                .descritpion("Faire une prise de sang complete aux clients")
                .medecins(medecinRepository.findAll())
                .build();
        toSave.add(competence);

        competence = Competence.builder()
                .nom("Prescrire")
                .descritpion("Prescrire ce qu'il faut en fonction de la maladie des gens")
                .medecins(medecinRepository.findAll())
                .build();
        toSave.add(competence);

        competenceRepository.saveAll(toSave);
    }

    private void initMedecin() {

        List<Medecin> toSave = new ArrayList<>();

        Medecin medecin = Medecin.builder()
                .nom("Dengis")
                .prenom("Bernard")
                .debutCarriere(LocalDate.of(1970, 10, 10))
                .cabinet(cabinetRepository.getOne(1))
                .clients(clientRepository.findAll())
                .competences(competenceRepository.findAll())
                .build();

        toSave.add(medecin);

        medecin = Medecin.builder()
                .nom("Royaux")
                .prenom("Phillipe")
                .debutCarriere(LocalDate.of(1972, 8, 12))
                .cabinet(cabinetRepository.getOne(2))
                .clients(clientRepository.findAll())
                .competences(competenceRepository.findAll())
                .build();

        toSave.add(medecin);

        medecin = Medecin.builder()
                .nom("Defrise")
                .prenom("Jean-Paul")
                .debutCarriere(LocalDate.of(1965, 02, 26))
                .cabinet(cabinetRepository.getOne(3))
                .clients(clientRepository.findAll())
                .competences(competenceRepository.findAll())
                .build();

        toSave.add(medecin);

        medecin = Medecin.builder()
                .nom("Yabadou")
                .prenom("Laure")
                .debutCarriere(LocalDate.of(2009, 11, 02))
                .cabinet(cabinetRepository.getOne(4))
                .clients(clientRepository.findAll())
                .competences(competenceRepository.findAll())
                .build();

        toSave.add(medecin);

        medecinRepository.saveAll(toSave);
    }
}
