package com.apirest.apiapp.service;

import com.apirest.apiapp.model.Biere;

import java.util.List;

public interface BiereService {

    public String creerBiere(Biere biere);
    public String modifierBiere(Biere biere);
    public String supprimerBiere(String  idbi);
    public Biere afficherBiere(String  idbi);
    public List<Biere> afficherToutesBiere();
}
