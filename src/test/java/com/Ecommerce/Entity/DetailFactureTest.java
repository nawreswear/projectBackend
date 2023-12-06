package com.Ecommerce.Entity;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DetailFactureTest {

    @Test
    public void testDetailFactureCreation() {
        DetailFacture detailFacture = new DetailFacture();
        assertNotNull(detailFacture);
        assertNull(detailFacture.getIfDF());
    }

    @Test
    public void testDetailFactureAttributes() {
        DetailFacture detailFacture = new DetailFacture();
        Long detailFactureId = 1L;
        Long qte = 5L;
        Double prixunitaire = 10.5;

        detailFacture.setIfDF(detailFactureId);
        detailFacture.setQte(qte);
        detailFacture.setPrixunitaire(prixunitaire);

        assertEquals(detailFactureId, detailFacture.getIfDF());
        assertEquals(qte, detailFacture.getQte());
        assertEquals(prixunitaire, detailFacture.getPrixunitaire());
    }
}