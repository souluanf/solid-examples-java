package dev.luanfernandes.company.model;


import dev.luanfernandes.company.enumeration.CargoEnum;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
public class DadosPessoais {
    private String nome;
    private String cpf;
    @Enumerated(EnumType.ORDINAL)
    private CargoEnum cargoEnum;
    private BigDecimal salario;
    private LocalDate dataUltimoReajuste;
}
