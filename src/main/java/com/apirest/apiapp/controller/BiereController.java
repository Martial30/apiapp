package com.apirest.apiapp.controller;

import com.apirest.apiapp.model.Biere;
import com.apirest.apiapp.service.BiereService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/visionbiere")
public class BiereController {
    BiereService biereService;
    public BiereController(BiereService biereService) {
        this.biereService = biereService;
    }
    //Biere biere;
    //Afficher une bière
    @GetMapping("{idbi}")
    public Biere afficherUneBiere ( @PathVariable("idbi") Integer idbi){
        return  biereService.afficherBiere(String.valueOf(idbi));
    }
    //Afficher toute les bières 5200
    @GetMapping()
    public List<Biere> afficherTouteLesBieres (){
        return  biereService.afficherToutesBiere();
    }

    //Créer une bière
    @PostMapping
    public String creerUneBiere(@RequestBody Biere biere){
        biereService.creerBiere(biere);
        return  "Bière créée avec succès";
    }
    //Modifier une bière
@PutMapping
public  String modifierUneBiere(@RequestBody Biere biere){
        biereService.modifierBiere(biere);
        return "Bière modifiée avec  succès";
    }
    @DeleteMapping("{idbi}")
    public String supprimerUneBiere(@PathVariable("idbi") Integer idbi){
       biereService.supprimerBiere(String.valueOf(idbi));
        return "Biere supprimée avec succès !";
    }



}
