package br.com.alura.rh.services;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Funcionario;

public class ReajustePeriodicidadeAumento implements ValidacoesReajustes {

    @Override
    public void validar(Funcionario funcionario, BigDecimal aumento) {
        LocalDate dataUltimoReajuste = funcionario.getDataUltimoReajuste();
        LocalDate dataAtual = LocalDate.now();
        long periodoEmMeses = ChronoUnit.MONTHS.between(dataUltimoReajuste, dataAtual);

        if (periodoEmMeses < 6) {
			throw new ValidacaoException("O período para reajuste deve ser no mínino seis meses do último reajuste!");
		}
        
    }
    
}
