package com.Ecommerce.Entity;
import java.io.Serializable;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.*;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class client implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idClient;
	private String codecl;
	private String nom;
	private String prenom;
	private String adresse;
	private Boolean actif;
	private Integer tel;
	private String email;

	@OneToMany(mappedBy = "client")
	@JsonIgnore
	private Set<Facture> factures = new HashSet<>();

}
