package dev.luanfernandes.company.service;


import dev.luanfernandes.company.model.Funcionario;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ReajusteService {
    private final List<ValidacaoReajuste> validations;

    public ReajusteService(List<ValidacaoReajuste> validations) {
        this.validations = validations;
    }

    public void reajustarSalarioFuncionario(Funcionario funcionario, BigDecimal aumento) {
        this.validations.forEach(v -> v.validar(funcionario, aumento));
        BigDecimal salarioReajustado = funcionario.getSalario().add(aumento);
        funcionario.atualizarSalario(salarioReajustado);
    }

}
