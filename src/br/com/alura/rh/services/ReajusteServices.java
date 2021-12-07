package br.com.alura.rh.services;

import java.math.BigDecimal;
import java.util.List;

import br.com.alura.rh.model.Funcionario;

public class ReajusteServices {

    private List<ValidacoesReajustes> validacoes;

    public ReajusteServices(List<ValidacoesReajustes> validacoes) {
        this.validacoes = validacoes;
    }

    public void reajustarSalarioFuncionario(Funcionario funcionario, BigDecimal aumento) {

        this.validacoes.forEach(v -> v.validar(funcionario, aumento));
        
        BigDecimal salarioReajustado = funcionario.getSalario().add(aumento);
        funcionario.atualizarSalario(salarioReajustado);
		
    }
}
