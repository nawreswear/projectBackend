package com.Ecommerce.Entity;

import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ClientTest {
    @Test
public void testClientCreation() {
    client client = new client();
    assertNotNull(client);
    assertNull(client.getIdClient());
}

    @Test
    public void testClientAttributes() {
        client client = new client();
        Long clientId = 1L;
        String codecl = "ABC123";
        String nom = "Doe";
        String prenom = "John";
        String adresse = "123 Main St";
        Boolean actif = true;
        Integer tel = 123456789;
        String email = "john.doe@example.com";

        client.setIdClient(clientId);
        client.setCodecl(codecl);
        client.setNom(nom);
        client.setPrenom(prenom);
        client.setAdresse(adresse);
        client.setActif(actif);
        client.setTel(tel);
        client.setEmail(email);

        assertEquals(clientId, client.getIdClient());
        assertEquals(codecl, client.getCodecl());
        assertEquals(nom, client.getNom());
        assertEquals(prenom, client.getPrenom());
        assertEquals(adresse, client.getAdresse());
        assertEquals(tel, client.getTel());
        assertEquals(email, client.getEmail());
    }

    @Test
    public void testClientFactures() {
        client client = new client();
        Set<Facture> factures = new HashSet<>();
        Facture facture1 = new Facture();
        Facture facture2 = new Facture();

        factures.add(facture1);
        factures.add(facture2);

        client.setFactures(factures);

        assertEquals(2, client.getFactures().size());
        assertTrue(client.getFactures().contains(facture1));
        assertTrue(client.getFactures().contains(facture2));
    }
}