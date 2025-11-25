package com.senai.gerenciamento_epis.DTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EmprestimoDto {

    private Long id;
    private String nomeFuncionario;
    private String nomeEpi;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;

    // Getters e Setters
}
