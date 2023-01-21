
/*Iván López Izquierdo 1ºDAM
 
 En este archivo se está creando la clase DeckCards, donde se
 utiliza la clase creada en el otro archivo (Card).
 Este archivo es ejecutable.
 */

package ejercicio2;

//Importa la libreria java.util y la clase Arraylist.
import java.util.ArrayList;

public class DeckCards {

	public static void main(String[] args) {
		
		//Creamos diferentes arrays para almacenar los palos y los valores de las cartas que vamos a crear.
		
		//Array de strings para almacenar los palos.
		
		String[] suits = { "Spades", "Diamonds", "Club", "Heart" };
		
		//Array de strings para almacenar los valores.
		
		String[] values = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
		
		//Crea un arraylist para objetos Card llamado deck.
		
		ArrayList<Card> deck = new ArrayList<Card>();
		
		//En este bucle vamos a crear las diferentes cartas, combinando
		//los diferentes palos y valores numéricos hasta completar la baraja,
		//que se almacenará en el arraylist deck.
		
		for (int i = 0; i < suits.length; i++) {
			
			for (int j = 0; j < values.length; j++) {
				
				//Construyendo objetos Card con los parámetros de palo y número.
				
				Card card = new Card(suits[i], values[j]);
				
				//Se añade cada carta creada al deck.
				
				deck.add(card);
			}
		}
		//En este bucle se aleatoriza el orden de las cartas en
		//la baraja.
		
		for (int i = 0; i < deck.size(); i++) {
			
			//Genera un número aleatorio al multiplicar i por un decimal y
			//truncándolo posteriormente
			
			int j = (int) Math.floor(Math.random() * i);
			
			//Llama y guarda en una variable las cartas según el índice del contador del for.
			
			Card tmp = deck.get(i);
			
			//Reemplaza la carta con el índice i por la del índice j.
			
			deck.set(i, deck.get(j));
			deck.set(j, tmp);
		}
		
		//En este bucle se imprimen 5 cartas del deck ya aleatorio.
		
		for (int i = 0; i < 5; i++) {
			System.out.println(deck.get(i));
		}

	}

}
