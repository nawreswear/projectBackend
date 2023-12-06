package com.Ecommerce.Entity;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Produit implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idProd;
	private String codep;
	private Long qtestock;
	private double prix;
	private String designation;
	private String imagerod;
	private double margebinificitaire;
	private String dateAchat;

	@OneToMany(mappedBy = "produit")
	@JsonIgnore
	private Set<DetailFacture> detailFactures = new HashSet<>();

}
