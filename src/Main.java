import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String nome, cognome, via, citta;
		int civico;
		Scanner scan = new Scanner(System.in);
		
		Persona[] persona = new Persona[2];
		Indirizzo[] indirizzo = new Indirizzo[2];
		
		for(int i = 0; i < 2; i++) {
			
			System.out.print("Inserisci il nome della " + (i+1) + "° persona: ");
			nome = scan.nextLine();
			
			System.out.print("Inserisci il cognome della " + (i+1) + "° persona: ");
			cognome = scan.nextLine();
			
			System.out.print("Inserisci la città della " + (i+1) + "° persona: ");
			citta = scan.nextLine();
			
			System.out.print("Inserisci la via della " + (i+1) + "° persona: ");
			via = scan.nextLine();
			
			System.out.print("Inserisci il numero civico della " + (i+1) + "° persona: ");
			civico = scan.nextInt();
			
			scan.nextLine();
			
			indirizzo[i] = new Indirizzo(via, citta, civico);
			persona[i] = new Persona(nome, cognome, indirizzo[i]);
			
		}
		
		for(int i = 0; i < 2; i++) {
			
			persona[i].stampaPersona();
			
		}
		
		scan.close();
		
	}

}
