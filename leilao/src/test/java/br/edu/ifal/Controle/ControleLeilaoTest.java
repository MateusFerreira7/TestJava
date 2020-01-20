package br.edu.ifal.Controle;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.edu.ifal.Controler.ControleLeilao;
import br.edu.ifal.modelo.Cliente;
import br.edu.ifal.modelo.Lance;
import br.edu.ifal.modelo.Leilao;
import br.edu.ifal.modelo.Produto;

public class ControleLeilaoTest {

    @Test
    public void deveRetornaVerdadeiroParaUmLanceMaiorQueValorMinimoDoProduto() {
        Produto produto = new Produto("PS4");
        double valorMinimo = 2500;
        Leilao leilao = new Leilao(produto, valorMinimo);
        Cliente cliente = new Cliente(1, "Ana");
        Lance novoLance = new Lance(cliente, 2500);
        ControleLeilao controle = new ControleLeilao();
        boolean validadeRetornado = controle.validarLance(novoLance, leilao);
        boolean validadeEsperado = true;
        assertEquals(validadeEsperado, validadeRetornado);
    }

    @Test
    public void deveRetornaFalsoParaUmLanceMenorQueValorMinimoDoProduto() {
        Produto produto = new Produto("PS4");
        double valorMinimo = 2500;
        Leilao leilao = new Leilao(produto, valorMinimo);
        Cliente cliente = new Cliente(1, "Ana");
        Lance novoLance = new Lance(cliente, 2000);
        ControleLeilao controle = new ControleLeilao();
        boolean validadeRetornado = controle.validarLance(novoLance, leilao);
        boolean validadeEsperado = false;
        assertEquals(validadeEsperado, validadeRetornado);
    }

  @Test
    public void deveRetornaVerdadeiroParaUmLanceIgualAoValorMinimoDoProduto() {
        Produto produto = new Produto("PS4");
        double valorMinimo = 2500;
        Leilao leilao = new Leilao(produto, valorMinimo);
        Cliente cliente = new Cliente(1, "Ana");
        Lance novoLance = new Lance(cliente, 2500);
        ControleLeilao controle = new ControleLeilao();
        boolean validadeRetornado = controle.validarLance(novoLance, leilao);
        boolean validadeEsperado = true;
        assertEquals(validadeEsperado, validadeRetornado);
    }

}