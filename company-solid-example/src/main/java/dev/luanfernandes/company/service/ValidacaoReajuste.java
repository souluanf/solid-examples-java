package dev.luanfernandes.company.service;

import dev.luanfernandes.company.model.Funcionario;

import java.math.BigDecimal;

public interface ValidacaoReajuste {
    void validar(Funcionario funcionario, BigDecimal aumento);
}
