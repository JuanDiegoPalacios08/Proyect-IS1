package com.example.Proyecto.Is1.Service;

import java.util.List;
import java.util.Optional;

import com.example.Proyecto.Is1.Model.PublicationsModel;

public interface IPublicationsService {
    List<PublicationsModel> getAllPublications ();
    List<PublicationsModel> findAllByTitle(String title);
    Optional <PublicationsModel> findPublicationsByid(String id);
}
