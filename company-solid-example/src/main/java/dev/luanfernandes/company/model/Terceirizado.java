package dev.luanfernandes.company.model;


import dev.luanfernandes.company.enumeration.CargoEnum;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;
import java.math.BigDecimal;
import java.time.LocalDate;

@EqualsAndHashCode(callSuper = true)
@Data
public class Terceirizado extends Funcionario {

    @Serial
    private static final long serialVersionUID = 8552824505381427477L;

    private String empresa;
    public Terceirizado(Long id, String nome, String cpf, CargoEnum cargoEnum, BigDecimal salario, LocalDate dataUltimoReajuste) {
        super(id, nome, cpf, cargoEnum, salario, dataUltimoReajuste);
    }
}
