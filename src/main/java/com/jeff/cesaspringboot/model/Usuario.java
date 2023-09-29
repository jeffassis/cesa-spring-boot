package com.jeff.cesaspringboot.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "USUARIOS")
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "Informe um nome.")
    @Size(min = 3, max = 255, message = "O nome do usuario deve ter entre {min} e {max} caracteres.")
    @Column(nullable = false, unique = true)
    private String nome;
    @NotBlank(message = "Informe um username.")
    @Size(min = 3, max = 60)
    @Column(nullable = false, unique = true)
    private String username;
    @NotBlank(message = "Senha não pode ser vazia")
    @Column(name="senha")
    private String senha;
    @Column(name = "tipo")
    private String tipo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


}
