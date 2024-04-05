package com.apirest.apiapp.implemen;
import com.apirest.apiapp.model.Biere;
import com.apirest.apiapp.repository.BiereRepository;
import com.apirest.apiapp.service.BiereService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BiereServiceImplements  implements BiereService {

    BiereRepository biereRepository;
    public BiereServiceImplements(BiereRepository biereRepository) {
        this.biereRepository = biereRepository;
    }
    @Override
    public String creerBiere(Biere biere) {
        biereRepository.save(biere);
        return "Bière crée avec succès";
    }
    @Override
    public String modifierBiere(Biere biere) {
        biereRepository.save(biere);
        return "Bière modifiée avec succès";
    }

    @Override
    public String supprimerBiere(String idbi) {
        biereRepository.deleteById(idbi);
        return "Bière supprimée avec succès";
    }

    @Override
    public Biere afficherBiere(String idbi) {
        return biereRepository.findById(idbi).get();
    }

    @Override
    public List<Biere> afficherToutesBiere() {
        return biereRepository.findAll();
    }
}
