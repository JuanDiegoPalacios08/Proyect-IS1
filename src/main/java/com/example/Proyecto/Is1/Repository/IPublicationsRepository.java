package com.example.Proyecto.Is1.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;
import com.example.Proyecto.Is1.Model.PublicationsModel;

@Repository
public interface IPublicationsRepository extends MongoRepository<PublicationsModel,String>{
    // Buscar documentos por title
    @Query("{ 'title': { $regex: ?0, $options: 'i' } }")
    List<PublicationsModel> findAllByTitle(String title);

    
}
