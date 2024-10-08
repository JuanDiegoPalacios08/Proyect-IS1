package com.example.Proyecto.Is1.Service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Proyecto.Is1.Model.PublicationsModel;
import com.example.Proyecto.Is1.Repository.IPublicationsRepository;

@Service
public class PublicationsServiceImp implements IPublicationsService{

    @Autowired
    IPublicationsRepository publicationsRespository;

    @Override
    public List<PublicationsModel> getAllPublications() {
        return publicationsRespository.findAll();
    }

    @Override
    public List<PublicationsModel> findAllByTitle(String title) {
        return publicationsRespository.findAllByTitle(title);
    }

    @Override
    public Optional<PublicationsModel> findPublicationsByid(String id) {
        return publicationsRespository.findById(id);
    }

    
    
    
}
