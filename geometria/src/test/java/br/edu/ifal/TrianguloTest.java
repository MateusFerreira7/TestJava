package br.edu.ifal;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

/**
 * TrianguloTest
 */

public class TrianguloTest {

Triangulo T1;
Triangulo T2;
Triangulo T3;
Triangulo T4;
Triangulo T5;
Triangulo T6;
Triangulo T7;
Triangulo T8;
Triangulo T9;
Triangulo T10;
Triangulo T11;
Triangulo T12;
Triangulo T13;


@Before
public void inicializacao() {
	
	T1 = new Triangulo(0, 0, 0);
	T2 = new Triangulo(2, 3, 4);
	T3 = new Triangulo(4, 4, 6);
	T4 = new Triangulo(4, 4, 4);
	T5 = new Triangulo(4, 3, 8);
	T6 = new Triangulo(-1, 3, 5);
	T7 = new Triangulo(0, 3, 5);
	T8 = new Triangulo(5, 0, 5);
	T9 = new Triangulo(7, 3, 0);
	T10 = new Triangulo(4, 6, 6);
	T11 = new Triangulo(6, 4, 6);
	T12 = new Triangulo(6, -4, 3);
	T13 = new Triangulo(8, 4, -6);
	
}


@Test
public void deveRetornarIlegalParaLadosIguaisAZero() {
	String validadeRetornada = T1.getTipo(T1);
	String validadEsperada = "Ilegal";
	assertEquals(validadEsperada, validadeRetornada);
}
@Test
public void deveRetornarIlegalParaBordaAIguaisAZero() {
	String validadeRetornada = T7.getTipo(T7);
	String validadEsperada = "Ilegal";
	assertEquals(validadEsperada, validadeRetornada);
}
@Test
public void deveRetornarIlegalParaBordaBIguaisAZero() {
	String validadeRetornada = T8.getTipo(T8);
	String validadEsperada = "Ilegal";
	assertEquals(validadEsperada, validadeRetornada);
}
@Test
public void deveRetornarIlegalParaBordaCIguaisAZero() {
	String validadeRetornada = T9.getTipo(T9);
	String validadEsperada = "Ilegal";
	assertEquals(validadEsperada, validadeRetornada);
}
@Test
public void deveRetornarIlegalParaBordaAComValorNegativo() {
	String validadeRetornada = T6.getTipo(T6);
	String validadEsperada = "Ilegal";
	assertEquals(validadEsperada, validadeRetornada);
}
@Test
public void deveRetornarIlegalParaBordaBComValorNegativo() {
	String validadeRetornada = T12.getTipo(T12);
	String validadEsperada = "Ilegal";
	assertEquals(validadEsperada, validadeRetornada);
}
@Test
public void deveRetornarIlegalParaBordaCComValorNegativo() {
	String validadeRetornada = T13.getTipo(T13);
	String validadEsperada = "Ilegal";
	assertEquals(validadEsperada, validadeRetornada);
}
@Test
public void deveRetornarIlegalSempreQueUmLadoForMenorQueASubtracaoDosOutrosDois() {
	String validadeRetornada = T5.getTipo(T5);
	String validadEsperada = "Ilegal";
	assertEquals(validadEsperada, validadeRetornada);
}
@Test
public void deveRetornarEscalenoParaTodosOsladosDiferentes() {
	String validadeRetornada = T2.getTipo(T2);
	String validadEsperada = "Escaleno";
	assertEquals(validadEsperada, validadeRetornada);
}
@Test
public void deveRetornarIsoscelesParaLadoAeBIguais() {
	String validadeRetornada = T3.getTipo(T3);
	String validadEsperada = "Isosceles";
	assertEquals(validadEsperada, validadeRetornada);
}
@Test
public void deveRetornarIsoscelesParLadoBeCIguais() {
	String validadeRetornada = T10.getTipo(T10);
	String validadEsperada = "Isosceles";
	assertEquals(validadEsperada, validadeRetornada);
}
@Test
public void deveRetornarIsoscelesParLadoAeCIguais() {
	String validadeRetornada = T11.getTipo(T11);
	String validadEsperada = "Isosceles";
	assertEquals(validadEsperada, validadeRetornada);
}
@Test
public void deveRetornarEquilateroParaTodosOsladosIguais() {
	String validadeRetornada = T4.getTipo(T4);
	String validadEsperada = "Equilatero";
	assertEquals(validadEsperada, validadeRetornada);
}



  

}