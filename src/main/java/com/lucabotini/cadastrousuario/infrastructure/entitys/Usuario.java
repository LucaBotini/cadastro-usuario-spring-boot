package com.lucabotini.cadastrousuario.infrastructure.entitys;

import jakarta.persistence.*;
import lombok.*;

@Getter //utilizado para não precisar criar o get de cada classe.
@Setter //utilizado para não precisar criar o set de cada classe.
@AllArgsConstructor //utilizado para não precisar criar o construtor com argumentos de cada classe.
@NoArgsConstructor //utilizado para não precisar criar o construtor sem argumentos de cada classe.
@Builder //gera uma classe interna “builder” que ajuda a montar o objeto passo a passo.
@Table(name = "usuario") //indica qual tabela do banco de dados a classe representa.
@Entity //indica que a classe é uma entidade JPA.

public class Usuario {

    @Id //indica o campo que é a chave primária da tabela.
    @GeneratedValue(strategy = GenerationType.AUTO) //gera o id automaticamente
    private int id;

    @Column(name = "email", unique = true) //indica que o campo é uma coluna na tabela.
    private String email;

    @Column(name = "nome") //indica que o campo é uma coluna na tabela.
    private String nome;



}
