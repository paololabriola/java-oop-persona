
public class Indirizzo {

	private String viaIndirizzo, cittaIndirizzo;
	private int numeroCivicoIndirizzo;
	
	public Indirizzo(String viaIndirizzo, String cittaIndirizzo, int numeroCivicoIndirizzo) {
		
		super();
		this.viaIndirizzo = viaIndirizzo;
		this.cittaIndirizzo = cittaIndirizzo;
		this.numeroCivicoIndirizzo = numeroCivicoIndirizzo;
		
	}

	public String getViaIndirizzo() {
		return viaIndirizzo;
	}

	public void setViaIndirizzo(String viaIndirizzo) {
		this.viaIndirizzo = viaIndirizzo;
	}

	public String getCittaIndirizzo() {
		return cittaIndirizzo;
	}

	public void setCittaIndirizzo(String cittaIndirizzo) {
		this.cittaIndirizzo = cittaIndirizzo;
	}

	public int getNumeroCivicoIndirizzo() {
		return numeroCivicoIndirizzo;
	}

	public void setNumeroCivicoIndirizzo(int numeroCivicoIndirizzo) {
		this.numeroCivicoIndirizzo = numeroCivicoIndirizzo;
	}
	
}
