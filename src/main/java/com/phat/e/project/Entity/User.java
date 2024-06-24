package com.phat.e.project.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "users")
public class User extends BaseEntity {

    private String username;
    private String password;
    private String email;
    private String phoneNumber;
    private String address;
    private String role;


}