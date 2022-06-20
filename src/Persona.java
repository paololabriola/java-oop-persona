
public class Persona {

	private String nomePersona, cognomePersona;
	private Indirizzo indirizzoPersona;
	
	public Persona(String nomePersona, String cognomePersona, Indirizzo indirizzoPersona) {
		
		super();
		this.nomePersona = nomePersona;
		this.cognomePersona = cognomePersona;
		this.indirizzoPersona = new Indirizzo(indirizzoPersona.getViaIndirizzo(), indirizzoPersona.getCittaIndirizzo(), indirizzoPersona.getNumeroCivicoIndirizzo()); 
		
	}

	public String getNomePersona() {
		return nomePersona;
	}

	public void setNomePersona(String nomePersona) {
		this.nomePersona = nomePersona;
	}

	public String getCognomePersona() {
		return cognomePersona;
	}

	public void setCognomePersona(String cognomePersona) {
		this.cognomePersona = cognomePersona;
	}
	
	public String nomeCognome() {
		
		return nomePersona + " " + cognomePersona;
		
	}
	
	public void stampaPersona() {
		
		System.out.println("La persona di nome " + nomeCognome() + " abita in " + indirizzoPersona.stampaIndirizzo() + "."); 
		
	}
	
}
