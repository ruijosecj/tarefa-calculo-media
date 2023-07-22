/**
 * 
 * @author ruijose
 *
 */

public class CalculoMedia {

	private double nota1, nota2, nota3, nota4;
	private double media = 0;
	
	public CalculoMedia(int nota1, int nota2, int nota3, int nota4) {
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
		this.nota4 = nota4;
	}
	
	public double calcularMedia() {
		media = (nota1 + nota2 + nota3 + nota4)/4;
		return media;
	}
	
}
