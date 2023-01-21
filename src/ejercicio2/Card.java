
/*Iván López Izquierdo 1ºDAM
 
 En este archivo se está creando la clase Card, que se utilizará
 en el otro archivo.
 Este archivo no es ejecutable.
 */

package ejercicio2;

public class Card {
	
	//ATRIBUTOS
	
	//Atributo correspondiente al palo de la carta.
	
	public String suit;
	
	//Atributo correspondiente al valor de la carta.
	
	public String value;
	
	//CONSTRUCTOR
	
	//A cada objeto carta le pasamos un palo y un valor para que 
	//se pueda crear.
	
	public Card (String suit, String value) {
		
		//Cambiamos los atributos de la carta por los parámetros
		//que le hemos pasado.
		
		this.suit = suit;
		this.value = value;
	}
	
	//MÉTODOS
	
	//Método toString para devolver la información de cada carta,
	//es decir, su palo y valor.
	
	public String toString () {
		return (this.suit+"-"+this.value);
	}
}
