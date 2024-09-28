package com.example.Proyecto.Is1.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "Categories")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategorieModel {

    @Id
    private String id;
    private String name;
    private String subCategory;
}
