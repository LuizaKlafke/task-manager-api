package br.com.luizaklafke.todolist.user;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

// lib lombok creates the getters e setter automatically
@Data
@Entity(name="tb_users") // cria tabela
public class UserModel {

    @Id // identify primary key
    @GeneratedValue(generator = "UUID")
    private UUID id;

    // possível colocar em atributso específico:
    // @Getter / @Setter
    @Column(unique = true)
    private String username;
    private String name;
    private String password;

    @CreationTimestamp
    private LocalDateTime createdAt;
    
}
