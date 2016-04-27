package cl.ubb.agil;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

public class CalculadoraTest {
	@Test
	public void dosMasTresEsCinco(){
		Calculadora calculadora = new Calculadora();
		int result = calculadora.suma(2,3);
		assertThat(result, is(5));
	}
	@Test
	public void menosUnoMasSieteEsSeis(){
		Calculadora calculadora = new Calculadora();
		int result = calculadora.suma(-1,7);
		assertThat(result, is(6));
	}
	@Test
	public void DoscientoMenos73Esigual127(){
		Calculadora calculadora = new Calculadora();
		int result = calculadora.resta(200,73);
		assertThat(result, is(127));
	}
	@Test
	public void Menos10menos5esMenosQuince(){
		Calculadora calculadora = new Calculadora();
		int result = calculadora.resta(-10,5);
		assertThat(result, is(-15));
	}
}
