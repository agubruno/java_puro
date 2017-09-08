package com.kaitzen;

public class App 
{
    public static void main( String[] args )
    {
    	Cuenta cuenta = new Cuenta(); 
		System.out.println(cuenta.toString());
		Cuenta cuenta2 = new Cuenta("Yo", 1000.0);
		System.out.println(cuenta2.toString());
		Cuenta cuenta3 = new Cuenta(cuenta2);
		System.out.println(cuenta3);
		cuenta2.ingreso(250.5);
		cuenta2.reintegro(34.0);
		cuenta2.transferencia(2000.0);
    }
}
