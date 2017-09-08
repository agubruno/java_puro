package com.kaitzen;

public class Calculadora {
	
	public int suma (int numero1, int numero2){
		return numero1+numero2;
	}
	
	public int resta (int numero1, int numero2){
		return numero1-numero2;
	}
	
	public int multiplicacion(int numero1, int numero2){
		int resultado = 0;
		for (int i = 0; i<numero2; i++){
			resultado = resultado+numero1;
		}
		return resultado;
	}
	
	public int division(int numero1, int numero2){
		int resultado =0;
		int cantidadenteros=0;
		while (resultado<= numero1){
			resultado = resultado + numero2;
			cantidadenteros = cantidadenteros+1;
		}
		if (cantidadenteros!=0){
			if (resultado == numero1){
				return cantidadenteros;
			}
			else
			{
				cantidadenteros = cantidadenteros-1;
			}
		}
		
		return cantidadenteros;
	}
}
