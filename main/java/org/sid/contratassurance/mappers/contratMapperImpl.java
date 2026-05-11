package org.sid.contratassurance.mappers;

import org.sid.contratassurance.dtos.*;
import org.sid.contratassurance.entities.*;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class ContratMapperImpl {

    public ClientDTO fromClient(Client client) {
        ClientDTO dto = new ClientDTO();
        BeanUtils.copyProperties(client, dto);
        return dto;
    }

    public Client fromClientDTO(ClientDTO dto) {
        Client client = new Client();
        BeanUtils.copyProperties(dto, client);
        return client;
    }

    public ContratAutomobileDTO fromContratAutomobile(ContratAutomobile contratAutomobile) {
        ContratAutomobileDTO dto = new ContratAutomobileDTO();
        BeanUtils.copyProperties(contratAutomobile, dto);
        dto.setClientDTO(fromClient(contratAutomobile.getClient()));
        dto.setType("CA");
        return dto;
    }

    public ContratHabitationDTO fromContratHabitation(ContratHabitation c) {
        ContratHabitationDTO dto = new ContratHabitationDTO();
        BeanUtils.copyProperties(c, dto);
        dto.setClientDTO(fromClient(c.getClient()));
        dto.setType("HA");
        return dto;
    }

    public ContratSanteDTO fromContratSante(ContratSante c) {
        ContratSanteDTO dto = new ContratSanteDTO();
        BeanUtils.copyProperties(c, dto);
        dto.setClientDTO(fromClient(c.getClient()));
        dto.setType("SA");
        return dto;
    }

    public PaimentDTO fromPaiment(Paiment p) {
        PaimentDTO dto = new PaimentDTO();
        BeanUtils.copyProperties(p, dto);
        dto.setContratId(p.getContrat().getId());
        return dto;
    }
}