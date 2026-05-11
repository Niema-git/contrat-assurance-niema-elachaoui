package org.sid.contratassurance;

import org.sid.contratassurance.entities.*;
import org.sid.contratassurance.enums.*;
import org.sid.contratassurance.repositories.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.stream.Stream;

@SpringBootApplication
public class ContratAssuranceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ContratAssuranceApplication.class, args);
    }

    @Bean
    CommandLineRunner initData(
            ClientRepository clientRepository,
            ContratRepository contratRepository,
            PaimentRepository paimentRepository
    ) {
        return args -> {


            Stream.of("Hassan","Yassine", "Aicha").forEach(name -> {
                Client client = new Client();
                client.setName(name);
                client.setEmail(name+"@gmail.com");
                clientRepository.save(client);
            });
            List<Client> clients = clientRepository.findAll();
            Client c1 = clients.get(0);

            ContratAutomobile ca = new ContratAutomobile();
            ca.setId(UUID.randomUUID().toString());
            ca.setDateSouscription(new Date());
            ca.setStatus(ContratStatus.PROGRESS);
            ca.setMontant(3500.0);
            ca.setDuree(12);
            ca.setTauxCouverture(80.0);
            ca.setMatricule("12345-A-1");
            ca.setMarque("Toyota");
            ca.setModele("Supra");
            ca.setClient(c1);
            contratRepository.save(ca);

            // Contrat Habitation pour c1
            ContratHabitation ch = new ContratHabitation();
            ch.setId(UUID.randomUUID().toString());
            ch.setDateSouscription(new Date());
            ch.setStatus(ContratStatus.VALIDATED);
            ch.setMontant(1500.0);
            ch.setDuree(24);
            ch.setTauxCouverture(90.0);
            ch.setTypeLogement(LogementType.APARTMENT);
            ch.setAdresse("12 Rue Hassan II, Casablanca");
            ch.setSuperficie(String.valueOf(85.0));
            ch.setClient(c1);
            contratRepository.save(ch);



            Paiment paiment = new Paiment();
            paiment.setDate(new Date());
            paiment.setMontant(String.valueOf(300.0));
            paiment.setType(PaymentType.MONTHLY);
            paiment.setContrat(ca);
            paimentRepository.save(paiment);

            Paiment p2 = new Paiment();
            p2.setDate(new Date());
            p2.setMontant(String.valueOf(1500.0));
            p2.setType(PaymentType.ANNUAL);
            p2.setContrat(ch);
            paimentRepository.save(p2);


        };
    }
}