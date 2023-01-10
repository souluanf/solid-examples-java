package dev.luanfernandes.company.model;

import dev.luanfernandes.company.enumeration.CargoEnum;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Funcionario implements Serializable {

    @Serial
    private static final long serialVersionUID = -4129210413415273339L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String cpf;
    @Enumerated(EnumType.ORDINAL)
    private CargoEnum cargoEnum;
    private BigDecimal salario;
    private LocalDate dataUltimoReajuste;
    public void atualizarSalario(BigDecimal novoSalario) {
        this.salario = novoSalario;
        this.dataUltimoReajuste = LocalDate.now();
    }
    public void promover(CargoEnum novoCargoEnum) {
        this.cargoEnum = novoCargoEnum;
    }
}
