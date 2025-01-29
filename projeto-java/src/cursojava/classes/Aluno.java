package cursojava.classes;

public class Aluno {
	public String nome;
	public String matricula;
	public int age;
	public double notaPrimeiraUnidade;
	public double notaSegundaUnidade;
	public double notaTerceiraUnidade;
	
	public Aluno(String nome, String matricula, int age, double notaPrimeiraUnidade, 
			double notaSegundaUnidade, double notaTerceiraUnidade) {
		this.nome = nome;
		this.matricula = matricula;
		this.age = age;
		this.notaPrimeiraUnidade = notaPrimeiraUnidade;
		this.notaSegundaUnidade = notaSegundaUnidade;
		this.notaTerceiraUnidade = notaTerceiraUnidade;
	}
	
	public double calcularMedia() {
		double media = (notaPrimeiraUnidade + notaSegundaUnidade + notaTerceiraUnidade)/3;
		return media;
	}
}
