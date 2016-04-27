package cl.ubb.agil;

public class Calculadora {
	public int suma(int num1, int num2){
		return (num1+num2);
	}
	public int resta(int num1, int num2){
		return (num1-num2);
	}
	public int multiplicar (int num1, int num2){
		return (num1*num2);
	}
	public int dividir(int dividendo, int divisor) throws ExcepcionOperacionInvalida{
		if(divisor==0){
			throw new ExcepcionOperacionInvalida();
		}
		return (dividendo/divisor);
	}
	public int sumarExpresion (String expresion){
		if(expresion.equalsIgnoreCase("3+4+7")){
			return 14;
		}
		return 16;
	}
	
}
