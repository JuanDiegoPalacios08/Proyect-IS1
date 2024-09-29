package com.example.Proyecto.Is1.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Proyecto.Is1.Model.PublicationsModel;
import com.example.Proyecto.Is1.Service.IPublicationsService;

@RestController
@RequestMapping("/api/publications")
public class PublicationsController {
    @Autowired
    IPublicationsService publicationsService;

    @GetMapping("/")
    public ResponseEntity<List<PublicationsModel>> getAllPublications(){
        return new ResponseEntity<List<PublicationsModel>>(publicationsService.getAllPublications(),HttpStatus.OK);
    }

    // Buscar publicaciones por Title
    @GetMapping("/title/{title}")
    public ResponseEntity<List<PublicationsModel>> getPublicationsByTitle(@PathVariable String title) {
        List<PublicationsModel> publications = publicationsService.findAllByTitle(title);
        if (publications.isEmpty()) {
            return ResponseEntity.noContent().build();  // 204 No Content si no hay resultados
        }
        return ResponseEntity.ok(publications);
    }
    
    // Buscar publicacion por Id
    @GetMapping("{id}")
    public ResponseEntity<Optional<PublicationsModel>> findById (@PathVariable String id){
        return new ResponseEntity<Optional<PublicationsModel>>(publicationsService.findPublicationsByid(id),HttpStatus.OK);
    }
}
