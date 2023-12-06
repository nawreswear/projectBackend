package com.Ecommerce.Entity;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CategorieTest {

    @Test
    public void testCategorieCreation() {
        categorie categorie = new categorie();
        assertNotNull(categorie);
        assertNull(categorie.getIdcat());
    }

    @Test
    public void testCategorieAttributes() {
        categorie categorie = new categorie();
        Long categorieId = 1L;
        String codecat = "ABC123";
        String libelle = "Example Libelle";

        categorie.setIdcat(categorieId);
        categorie.setCodecat(codecat);
        categorie.setLibelle(libelle);

        assertEquals(categorieId, categorie.getIdcat());
        assertEquals(codecat, categorie.getCodecat());
        assertEquals(libelle, categorie.getLibelle());
    }
}
