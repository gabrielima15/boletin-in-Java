import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        Turma turma = new Turma();
        Aluno p1 = new Aluno("João",2315);
        Aluno p2 = new Aluno("Maria",4518);
        Aluno p3 = new Aluno("Carlos",8890);
        Aluno p4 = new Aluno("Miguel",4713);

        turma.addAluno(new Boletim(p1, 3.5, 9));
        turma.addAluno(new Boletim(p2, 7.8, 8));
        turma.addAluno(new Boletim(p3, 5.6, 10));
        turma.addAluno(new Boletim(p4, 8.8, 10));

        System.out.println("-=-=".repeat(20));

        turma.listarboletins();

        System.out.println("-=-=".repeat(20));

        turma.posicaoPorNotas();

        Boletim BoletimDoAluno = turma.buscarPorMatricula(2315);
        Boletim Boleto = turma.buscarPorNome("Carlos");

        while (true) {
            System.out.println("deseja Procurar Aluno? [S/N]: ");
            String escolha = imput.nextLine();

            System.out.println("deseja buscar o Aluno por nome ou matricula?");
            String opcao = imput.nextLine();

            if(escolha.equals("N")){
                break;
            }

            if(opcao.equals("nome")){
                // opcao = Boleto;
            }
        }

        if(BoletimDoAluno != null){
            System.out.println("aluno encontrado\n");

        }else if(Boleto != null){
            System.out.println("aluno encontrado\n");
        }else{
            System.out.println("aluno nao encontrado.\n");
        }
    }
}
