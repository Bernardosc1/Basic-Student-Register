package cursojava.executavel;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import cursojava.classes.Aluno;

public class PrimeiraClasseJava {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		while (true) {

			System.out.println("Escolha uma opção: \n"
					+ "1-Registrar Aluno \n"
					+ "2-Consultar um aluno \n"
					+ "3-Ver resultados dos alunos \n"
					+ "4-Sair");

			int escolha = teclado.nextInt();
			teclado.nextLine(); 

			switch (escolha) {
				case 1: {
					System.out.println("Digite o nome do Aluno: ");
					String nomeAluno = teclado.nextLine();

					System.out.println("Digite a matrícula do Aluno: ");
					String matriculaAluno = teclado.nextLine();

					System.out.println("Digite a idade do Aluno: ");
					int ageAluno = teclado.nextInt();

					System.out.println("Digite a primeira nota do Aluno: ");
					double primeiraNota = teclado.nextDouble();

					System.out.println("Digite a segunda nota do Aluno: ");
					double segundaNota = teclado.nextDouble();

					System.out.println("Digite a terceira nota do Aluno: ");
					double terceiraNota = teclado.nextDouble();

					teclado.nextLine();

					
					alunos.add(new Aluno(nomeAluno, matriculaAluno, ageAluno, primeiraNota, segundaNota, terceiraNota));
					System.out.println("Aluno " + nomeAluno + " registrado com sucesso!");
					break;
				}

				case 2: {
					System.out.println("Digite a matrícula do aluno que você quer consultar: ");
					String alunoConsultado = teclado.nextLine();

					boolean found = false;
					for (Aluno aluno : alunos) {
						if (aluno.matricula.equals(alunoConsultado)) {
							System.out.println("Nome: " + aluno.nome +
									"\nMatrícula: " + aluno.matricula +
									"\nIdade: " + aluno.age +
									"\nPrimeira nota: " + aluno.notaPrimeiraUnidade +
									"\nSegunda nota: " + aluno.notaSegundaUnidade +
									"\nTerceira nota: " + aluno.notaTerceiraUnidade +
									"\nMédia Final: " + aluno.calcularMedia());
							found = true;
							break;
						}
					}
					if (!found) {
						System.out.println("Aluno não encontrado.");
					}
					break;
				}

				case 3: {
					if (alunos.isEmpty()) {
						System.out.println("Nenhum aluno registrado.");
					} else {
						for (Aluno aluno : alunos) {
							System.out.println("Nome: " + aluno.nome + 
									" - Média Final: " + aluno.calcularMedia() +
									" - Status: " + (aluno.calcularMedia() >= 7 ? "Aprovado" : "Reprovado"));
						}
					}
					break;
				}

				case 4:
					System.out.println("Saindo do programa...");
					teclado.close();
					return;

				default:
					System.out.println("Opção inválida, tente novamente.");
			}
		}
	}
}
