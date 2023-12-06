package com.Ecommerce.Entity;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class DeviseTest {

    @Test
    public void testDeviseCreation() {
        Devise devise = new Devise();
        assertNotNull(devise);
        assertNull(devise.getIdDev()); // Vérifie si l'ID de la devise est null après création
    }

    @Test
    public void testDeviseAttributes() {
        Devise devise = new Devise();
        Long deviseId = 1L;
        String code = "USD";
        String symbole = "$";
        Double tauxChange = 1.0;

        devise.setIdDev(deviseId);
        devise.setCode(code);
        devise.setSymbole(symbole);
        devise.setTauxchange(tauxChange);

        assertEquals(deviseId, devise.getIdDev());
        assertEquals(code, devise.getCode());
        assertEquals(symbole, devise.getSymbole());
        assertEquals(tauxChange, devise.getTauxchange());
    }

    @Test
    public void testDeviseFactures() {
        Devise devise = new Devise();
        Set<Facture> factures = new HashSet<>();

        Facture facture1 = new Facture();
        Facture facture2 = new Facture();

        factures.add(facture1);
        factures.add(facture2);

        devise.setFactures(factures);

        assertEquals(2, devise.getFactures().size());
        assertTrue(devise.getFactures().contains(facture1));
        assertTrue(devise.getFactures().contains(facture2));
    }
}
