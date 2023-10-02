package com.jeff.cesaspringboot.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "ENDERECOS")
@Getter
@Setter
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    @Size(min = 3, max = 255)
    @Column(nullable = false)
    private String logradouro;
    @NotBlank
    @Size(min = 3, max = 255)
    @Column(nullable = false)
    private String bairro;
    @NotBlank
    @Size(min = 3, max = 255)
    @Column(nullable = false)
    private String cidade;
    @NotNull
    @Size(min = 2, max = 2)
    @Column(nullable = false, length = 2)
    private String uf;
    @NotBlank
    @Size(min = 9, max = 9)
    @Column(nullable = false, length = 9)
    private String cep;
    @NotNull
    @Digits(integer = 5, fraction = 0)
    @Column(nullable = false, length = 5)
    private String numero;
    @Size(max = 255)
    private String complemento;
}
