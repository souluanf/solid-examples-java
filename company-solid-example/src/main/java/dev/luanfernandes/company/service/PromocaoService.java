package dev.luanfernandes.company.service;


import dev.luanfernandes.company.enumeration.CargoEnum;
import dev.luanfernandes.company.exceptions.ValidationException;
import dev.luanfernandes.company.model.Funcionario;
import org.springframework.stereotype.Service;

@Service
public class PromocaoService {

    public void promover(Funcionario funcionario, boolean metaBatida){
        CargoEnum cargoEnumAtual = funcionario.getCargoEnum();
        if (CargoEnum.GERENTE == cargoEnumAtual){
            throw new ValidationException("Gerentes não podem ser promovidos");
        }
        if (metaBatida){
           CargoEnum novoCargoEnum = cargoEnumAtual.getProximoCargo();
           funcionario.promover(novoCargoEnum);
        }else {
            throw new ValidationException("Funcionário não bateu a meta");
        }
    }
}
