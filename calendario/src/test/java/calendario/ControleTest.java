package calendario;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ControleTest {

	private Controle controle;

	@Before
	public void inicializacao() {
		this.controle = new Controle();
	}

	@Test
	public void verificarProximoDiaDepoisDoDia30() {
		Data proximoDiaRetornado;
		proximoDiaRetornado = controle.proximoDia(new Data(30, 1, 2020));
		Data proximoDiaEsperado = new Data(1, 2, 2020);
		assertEquals(proximoDiaEsperado, proximoDiaRetornado);
	}

	@Test
	public void verificarProximoDiaDepoisDoDia29() {
		Data proximoMesRetornado;
		proximoMesRetornado = controle.proximoDia(new Data(29, 1, 2020));
		Data proximoMesEsperado = new Data(30, 1, 2020);
		assertEquals(proximoMesEsperado, proximoMesRetornado);
	}

	@Test
	public void verificarProximoDiaDepoisDoDia31() {
		Data proximoMesRetornado;
		proximoMesRetornado = controle.proximoDia(new Data(31, 1, 2020));
		Data proximoMesEsperado = new Data(1, 2, 2020);
		assertEquals(proximoMesEsperado, proximoMesRetornado);
	}

	@Test
	public void verificarDia30AteDia31() {
		Data proximoMesRetornado;
		proximoMesRetornado = controle.proximoDia(new Data(30, 4, 2020));
		Data proximoMesEsperado = new Data(31, 4, 2020);
		assertEquals(proximoMesEsperado, proximoMesRetornado);
	}

	@Test
	public void verificarMesFevereiroBissextoDia28Ate29() {
		Data proximoMesRetornado;
		proximoMesRetornado = controle.proximoDia(new Data(28, 2, 1991));
		Data proximoMesEsperado = new Data(29, 2, 1991);
		assertEquals(proximoMesEsperado, proximoMesRetornado);
	}

	@Test
	public void verificarMesFevereiroDia29AteDia01() {
		Data proximoMesRetornado;
		proximoMesRetornado = controle.proximoDia(new Data(29, 2, 2020));
		Data proximoMesEsperado = new Data(01, 3, 2020);
		assertEquals(proximoMesEsperado, proximoMesRetornado);
	}

	@Test
	public void verificarMesFereveiroDia28AteDia01() {
		Data proximoMesRetornado;
		proximoMesRetornado = controle.proximoDia(new Data(28, 2, 2019));
		Data proximoMesEsperado = new Data(01, 3, 2019);
		assertEquals(proximoMesEsperado, proximoMesRetornado);
	}

	@Test
	public void verificarViradaDoAno() {
		Data proximoDiaRetornado;
		proximoDiaRetornado = controle.proximoDia(new Data(31, 12, 2020));
		Data proximoDiaEsperado = new Data(1, 1, 2021);
		assertEquals(proximoDiaEsperado, proximoDiaRetornado);
	}

}
