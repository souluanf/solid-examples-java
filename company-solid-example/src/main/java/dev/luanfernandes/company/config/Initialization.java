package dev.luanfernandes.company.config;


import dev.luanfernandes.company.enumeration.CargoEnum;
import dev.luanfernandes.company.model.Funcionario;
import dev.luanfernandes.company.repositories.FuncionarioRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Slf4j
@Configuration
@AllArgsConstructor
public class Initialization implements CommandLineRunner {
    private final FuncionarioRepository repository;

    @Override
    public void run(String... args) throws Exception {
        log.info("Populando database...");
        Funcionario f1 = new Funcionario(1L, "Maria", "32165498721", CargoEnum.ESPECIALISTA, new BigDecimal("1000"), LocalDate.now());
        Funcionario f2 = new Funcionario(2L, "João", "15975363321", CargoEnum.ANALISTA, new BigDecimal("1380"), LocalDate.now());
        Funcionario f3 = new Funcionario(3L, "Pedro", "96325874112", CargoEnum.ASSISTENTE, new BigDecimal("2000"), LocalDate.now());
        Funcionario f4 = new Funcionario(5L, "Matheus", "14785236987", CargoEnum.GERENTE, new BigDecimal("6000"), LocalDate.now());

        repository.saveAll(List.of(f1,f2,f3,f4));
        log.info("Database populada...");
    }
}
