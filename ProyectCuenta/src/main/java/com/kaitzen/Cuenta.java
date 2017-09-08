package com.kaitzen;

import java.util.Random;

public class Cuenta {
	//definis las variables
		private String nombre; 
		private Double monto;
		private int id;
		
		//Obtener y setear ID que es privado
		public Integer GetId()
		{
		return this.id;
			}
		public void setId(int id) {
			this.id = id;
			}
		
		//Obtener y setear el monto que es privado
		public Double getMonto() {
			return monto;
			}
		public void setMonto(Double monto) {
			this.monto = monto;
			}
		
		//Obtener y setear el nombre que es privado
		public String getNombre() {
			return nombre;
			}
		public void setNombre(String nombre) {
			this.nombre = nombre;
			}
		
		//Constructor 
		public Cuenta(){
		this.nombre = "";
		this.monto = 0.0;
		this.id = getRandomId();
			} 
		
		//Sobre carga de constructor agregando parametros
		public Cuenta(String nombre, Double monto){
			this.nombre = nombre;
			this.monto = monto;
			this.id = getRandomId();
			}
		
		//Sobre carga de contructo agregando cuenta
		public Cuenta(Cuenta cuentaBase){
			this.nombre = cuentaBase.nombre;
			this.monto = cuentaBase.monto;
			this.id = getRandomId();
			}
		
		//Creamos un random
		private static Random random = new Random();
		private static final int LOWER_ID = 1;
		private static final int HIGHER_ID = 1000;
		
		//Genera numero random
		private Integer getRandomId(){
			return random.nextInt(HIGHER_ID - LOWER_ID) + LOWER_ID;
			}
		
		//Sobrecargamos el metodo tostring
		public String toString(){
			return "Esta cuenta de " + this.nombre + " con ID " + this.id + " tiene el monto de $" + this.monto; 
			}
		
		//Metodo ingreso
		public void ingreso(double monto){
			this.monto = monto + this.monto;
			System.out.println(this);
			}
		
		//Metodo reintegro
		public void reintegro(double reintegro){
			this.monto = reintegro + this.monto;
			System.out.println(this);
			}
		
		//Metodo transferencia
		public void transferencia(double monto){
			if (monto <= this.monto){
				this.monto -= monto;
			}
			else
			{
				System.out.println("Error 404");
			}
			System.out.println(this);
		}

		public void error (String errorMessage){
			System.out.println(errorMessage);
		}
}
