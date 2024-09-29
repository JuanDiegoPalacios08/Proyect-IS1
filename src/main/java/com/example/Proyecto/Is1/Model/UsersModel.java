package com.example.Proyecto.Is1.Model;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.example.Proyecto.Is1.Model.ENUM.status;
import com.example.Proyecto.Is1.Model.ENUM.userRole;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Users")

public class UsersModel {
    
    @Id
    private String id;
    private String username;
    private String email;
    private userRole userRole;
    private LocalDate registrationDate;
    private String profilePicture;
    
    private Credentials credentials; // Subdocument para almacenar las credenciales.
    
    private SecurityQuestion securityQuestion; 
    
    private List<DownloadedDocs> downloadedDocs; // List para almacenar docs descargados.
    private List<DocHistory> docHistory; 

    @Data
    @AllArgsConstructor
    @NoArgsConstructor

    public static class Credentials {
        private String password;
        private status status;
    }
    
    @Data
    @AllArgsConstructor
    @NoArgsConstructor

    public static class SecurityQuestion {
        private String question;
        private String answer;
    }
    
    @Data
    @AllArgsConstructor
    @NoArgsConstructor

    public static class DownloadedDocs {
        private String idDocument;
        private String title;
        private LocalDate date;
    }
    
    @Data
    @AllArgsConstructor
    @NoArgsConstructor

    public static class DocHistory {
        private String idDocument;
        private String title;
        private LocalDate date;
    }
}