package br.com.microservice.api.domain;

import jakarta.persistence.*;
import lombok.*;
// A notação Data já gera o Getter, Setter, EqualsAndHashCode, ToString
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @Column(unique = true)
    private String email;
    private String password;

}
