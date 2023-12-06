package com.Ecommerce.Controlleur;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import com.Ecommerce.Entity.Facture;
import com.Ecommerce.Entity.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.Ecommerce.Entity.client;
import com.Ecommerce.Service.ClientServiceImpl;


@RestController
@CrossOrigin(origins="http://localhost:4200")
public class clientControlleur {
	@GetMapping(value="/test/{name}")
	public String test(@PathVariable String name){
		return "bonjour!!!"+name;
	}
	@Autowired
	ClientServiceImpl clientserv;
	
	@PostMapping(value="/addclient")
	public client addclient(@RequestBody client cl) {
		return clientserv.addclient(cl);
	}
	@PostMapping(value="/addlistclient")
	public List<client> addlistclient(@RequestBody List<client> clientlist) {
		return clientserv.addListclient(clientlist);
	}
	@PutMapping(value="/Updateclient/{idClient}")
	public client Updateclient(@RequestBody client cl,@PathVariable Long idClient) 
	{
		return clientserv.Updateclient(cl,idClient);
	}
	@DeleteMapping(value="/deletecliente/{idClient}")
	public String deletecliente(@PathVariable Long idClient)
	{
		return clientserv.deleteclient(idClient);
	}
	@GetMapping(value="/getallclients")
	public List<client> getallclients() {
		return clientserv.getallclients();
	}
	@GetMapping(value="/findByNom/{nom}")
	public client findByNom(@PathVariable String nom) 
	{
		return clientserv.findByNom(nom);
	}
	@GetMapping(value="/getclientById/{idClient}")
	public client getclientById(@PathVariable Long idClient)
	{
		return clientserv.getclientById(idClient);
	}

	@GetMapping(value="/facturesReglees/{idClient}")
	public List<Facture> getFacturesRegleesPourClient(@PathVariable Long idClient) {
		return clientserv.getFacturesRegleesPourClient(idClient);
	}

	@GetMapping(value="/facturesNonReglees/{idClient}")
	public List<Facture> getFacturesNonRegleesPourClient(@PathVariable Long idClient) {
		return clientserv.getFacturesNonRegleesPourClient(idClient);
	}
	@GetMapping("/{clientId}/chiffre-affaires")
	public ResponseEntity<Double> getChiffreAffairesGlobal(@PathVariable Long clientId) {
		Double chiffreAffaires = clientserv.calculerChiffreAffairesGlobal(clientId);
		return ResponseEntity.ok(chiffreAffaires);
	}

	@GetMapping("/{clientId}/chiffre-affaires/{annee}")
	public ResponseEntity<Double> getChiffreAffairesAnnee(@PathVariable Long clientId, @PathVariable int annee) {
		Double chiffreAffaires = clientserv.calculerChiffreAffairesParAn(clientId, annee);
		return ResponseEntity.ok(chiffreAffaires);
	}
}
