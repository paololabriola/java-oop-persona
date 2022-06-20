
public class Persona {

	private String nomePersona, cognomePersona;
	private Indirizzo indirizzoPersona;
	
	public Persona(String nomePersona, String cognomePersona, Indirizzo indirizzoPersona) {
		
		super();
		this.nomePersona = nomePersona;
		this.cognomePersona = cognomePersona;
		this.indirizzoPersona = new Indirizzo(indirizzoPersona.getViaIndirizzo(), indirizzoPersona.getCittaIndirizzo(), indirizzoPersona.getNumeroCivicoIndirizzo()); 
		
	}
	
}
