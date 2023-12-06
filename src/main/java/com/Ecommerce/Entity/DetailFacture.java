package com.Ecommerce.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DetailFacture implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ifDF;
    private  Long qte;
    private  Double prixunitaire;

    @ManyToOne
    @JoinColumn(name = "idFact")
    private Facture facture;

    @ManyToOne
    @JoinColumn(name = "idProd")
    private Produit produit;
}
