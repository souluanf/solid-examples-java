package dev.luanfernandes.company.service;


import dev.luanfernandes.company.exceptions.ValidationException;
import dev.luanfernandes.company.model.Funcionario;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ValidacaoPeriodicidadeReajuste implements ValidacaoReajuste{
    @Override
    public void validar(Funcionario funcionario, BigDecimal aumento) {
        LocalDate dataUltimoREajuste = funcionario.getDataUltimoReajuste();
        LocalDate dataAtual = LocalDate.now();
        long mesesDesdeUltimoReajuste = ChronoUnit.MONTHS.between(dataUltimoREajuste,dataAtual);
        if (mesesDesdeUltimoReajuste < 6 ) {
            throw new ValidationException("Intervalo entre reajustes deve ser de no minimo 6 meses.");
        }
    }
}
