package com.example.Proyecto.Is1.Repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.Proyecto.Is1.Model.PublicationsModel;
import com.example.Proyecto.Is1.Model.UsersModel;

@Repository
public interface IPublicationsRepository extends MongoRepository<PublicationsModel,String>{

    @Query("{ 'title': { $regex: ?0, $options: 'i' } }")
    List<PublicationsModel> findAllByTitle(String title);

    @Query("{'Autor': { $regex: ?0, $options: 'i' }}")
    List<UsersModel> findUserByName(String Autor);



}
