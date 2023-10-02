package com.jeff.cesaspringboot.model;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import org.springframework.format.annotation.DateTimeFormat;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "ALUNOS")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    @Size(min = 3, max = 255)
    @Column(nullable = false, unique = true)
    private String nome;
    @NotBlank
    @Size(min = 12, max = 12)
    @Column(nullable = false, length = 12)
    private String rg;
    @NotBlank
    @Size(min = 14, max = 14)
    @Column(nullable = false, length = 14)
    private String cpf;
    @NotBlank
    @Size(min = 3, max = 255)
    @Column(nullable = false, unique = true)
    private String email;
    @NotNull
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @Column(name = "nascimento", nullable = false, columnDefinition = "DATE")
    private LocalDate nascimento;
    @NotBlank
    @Size(min = 3, max = 255)
    @Column(nullable = false, unique = true)
    private String telefone1;
    @NotBlank
    @Size(min = 3, max = 255)
    @Column(nullable = false, unique = true)
    private String telefone2;
    @NotBlank
    @Size(min = 3, max = 20)
    @Column(nullable = false)
    private String sangue;
    @Valid
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "endereco_id_fk")
    private Endereco endereco;
}
