package com.Ecommerce.Entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Facture  implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idFact;
	private String dateFact;
	private int num;
	@ManyToOne
	@JoinColumn(name = "idClient")
	private client client;

	@ManyToOne
	@JoinColumn(name = "IdDev")
	private Devise devise;

	@OneToMany(mappedBy = "facture")
	@JsonIgnore
	private Set<DetailFacture> detailFactures = new HashSet<>();

	@OneToMany(mappedBy = "facturesr")
	@JsonIgnore
	private Set<ReglementFacture> reglementFactures = new HashSet<>();
}
