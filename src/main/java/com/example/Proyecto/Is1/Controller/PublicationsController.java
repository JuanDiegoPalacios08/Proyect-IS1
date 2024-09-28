package com.example.Proyecto.Is1.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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
}
