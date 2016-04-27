package cl.ubb.agil;
import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Before;

import static org.hamcrest.CoreMatchers.is;

public class CalculadoraTest {
	private Calculadora calculadora;
	@Before
	public void setup(){
		calculadora = new Calculadora();
	}
	@Test
	public void dosMasTresEsCinco(){
		int result = calculadora.suma(2,3);
		assertThat(result, is(5));
	}
	@Test
	public void menosUnoMasSieteEsSeis(){
		int result = calculadora.suma(-1,7);
		assertThat(result, is(6));
	}
	@Test
	public void DoscientoMenos73Esigual127(){
		int result = calculadora.resta(200,73);
		assertThat(result, is(127));
	}
	@Test
	public void Menos10menos5esMenosQuince(){
		int result = calculadora.resta(-10,5);
		assertThat(result, is(-15));
	}
	@Test
	public void Multiplicacion6y3es18(){
		int result = calculadora.multiplicar(6,3);
		assertThat(result, is(18));
	}
	@Test
	public void Multiplicacion12y4es48(){
		int result = calculadora.multiplicar(12,4);
		assertThat(result, is(48));
	}
	@Test
	public void Dividir12y3es4() throws ExcepcionOperacionInvalida{
		int result = calculadora.dividir(12,3);
		assertThat(result, is(4));
	}
	@Test
	public void Dividir36y6es6() throws ExcepcionOperacionInvalida{
		int result = calculadora.dividir(36,6);
		assertThat(result, is(6));
	}
	@Test(expected=ExcepcionOperacionInvalida.class)
	public void Dividir12y0esExcepcion() throws ExcepcionOperacionInvalida{
		int result = calculadora.dividir(12, 0);
	}
	@Test
	public void Expresion3mas4mas7es14(){
		int result = calculadora.sumarExpresion("3+4+7");
		assertThat(result, is(14));
	}
}
