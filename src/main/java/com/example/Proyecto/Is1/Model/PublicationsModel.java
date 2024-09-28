package com.example.Proyecto.Is1.Model;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "Publications")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PublicationsModel {
    @Id
    private String id;
    private String title;
    private String description;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date publicationDate;
    private String urlFiles;
    private String visibility;

    private List<Author> authors;
    private List<Category> categories;
    private List<Rating> ratings;
    private List<DocsFilesInfo> docsFilesInfo;

    @Data
    public static class Author{
        private String idUser;
        private String userRoleAuthors;
    }

    @Data
    public static class Category{
        private String _idCategoria;
    }

    @Data
    public static class Rating {
        private String idUser;
        private String date;
        private int score;
        private String comments;
    }

    @Data
    public static class DocsFilesInfo{
        private int totalDownloads;
        private double avgRaiting;
        private int totalComments;
        private int totalViews;
    }
}
