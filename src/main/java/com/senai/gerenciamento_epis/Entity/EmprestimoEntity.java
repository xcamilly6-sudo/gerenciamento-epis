package com.senai.gerenciamento_epis.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "emprestimo_epi")
public class EmprestimoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeFuncionario;
    private String nomeEpi;

    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;

    public EmprestimoEntity() {}

    public EmprestimoEntity(String nomeFuncionario, String nomeEpi, LocalDate dataEmprestimo, LocalDate dataDevolucao) {
        this.nomeFuncionario = nomeFuncionario;
        this.nomeEpi = nomeEpi;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    // Getters e Setters
}

