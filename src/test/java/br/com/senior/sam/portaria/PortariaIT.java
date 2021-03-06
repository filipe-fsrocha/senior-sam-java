package br.com.senior.sam.portaria;

import java.time.temporal.ChronoUnit;
import java.util.Collections;
import java.util.Date;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import br.com.senior.core.base.Environment;
import br.com.senior.core.base.ServiceException;
import br.com.senior.sam.portaria.pojos.CardTechnology;
import br.com.senior.sam.portaria.pojos.CreatePersonProvisoryCredential;
import br.com.senior.sam.portaria.pojos.CreateVisitorProvisoryCredential;
import br.com.senior.sam.portaria.pojos.InformationCardCredentialRecord;
import br.com.senior.sam.portaria.pojos.ProvisoryCredentialRecord;
import br.com.senior.sam.portaria.pojos.Visitor;

/**
 * Exemplos de código do {@link PortariaClient PortariaClient}
 */
public class PortariaIT {

    private static PortariaClient client;

    @BeforeClass
    public static void beforeClass() {
        client = new PortariaClient(System.getenv("TOKEN"), Environment.PROD);
    }

    @Test
    public void testPersonProvisoryCredential() throws ServiceException {
        if (!System.getenv().containsKey("LOBBYID")) {
            throw new RuntimeException("Necessário informar variável de ambiente LOBBYID com o id do lobby para gerar a credencial");
        }
        Long lobbyId = Long.valueOf(System.getenv("LOBBYID"));

        if (!System.getenv().containsKey("PERSONID")) {
            throw new RuntimeException("Necessário informar variável de ambiente PERSONID com o id da pessoa para gerar a credencial");
        }
        Long personId = Long.valueOf(System.getenv("PERSONID"));

        CreatePersonProvisoryCredential input = new CreatePersonProvisoryCredential(false, Collections.singletonList(new InformationCardCredentialRecord(CardTechnology.BARCODE_CARD, 1L)), new Date().toInstant().plus(1, ChronoUnit.DAYS), personId, lobbyId);
        ProvisoryCredentialRecord output = client.createPersonProvisoryCredentialCard(input);
        Assert.assertNotNull(output);
    }

    @Test
    public void testVisitorProvisoryCredential() throws ServiceException {
        if (!System.getenv().containsKey("ROLEID")) {
            throw new RuntimeException("Necessário informar variável de ambiente ROLEID com o id do papel com as permissões que o visitante irá possuir");
        }
        Long roleId = Long.valueOf(System.getenv("ROLEID"));

        if (!System.getenv().containsKey("VISITORID")) {
            throw new RuntimeException("Necessário informar variável de ambiente VISITORID com o id do visitante para gerar a credencial");
        }
        Long visitorId = Long.valueOf(System.getenv("VISITORID"));

        Long schedullingId = null;
        if (!System.getenv().containsKey("SCHEDULLINGID")) {
            System.out.println("Não foi informado o agendamento, será considerado uma visita não agendada");
        } else {
            schedullingId = Long.valueOf(System.getenv("PERSONID"));
        }

        CreateVisitorProvisoryCredential input = new CreateVisitorProvisoryCredential(false, Collections.singletonList(new InformationCardCredentialRecord(CardTechnology.BARCODE_CARD, 1L)), new Date().toInstant().plus(1, ChronoUnit.DAYS), roleId, new Visitor( visitorId ), schedullingId);
        ProvisoryCredentialRecord output = client.createVisitorProvisoryCredentialCard(input);
        Assert.assertNotNull(output);
    }

}