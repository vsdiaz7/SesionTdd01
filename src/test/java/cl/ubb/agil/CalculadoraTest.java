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
}
