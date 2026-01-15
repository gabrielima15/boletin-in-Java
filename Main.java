
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Turma turma = new Turma();
        Aluno p1 = new Aluno("João",2315);
        Aluno p2 = new Aluno("Maria",4518);
        Aluno p3 = new Aluno("Carlos",8890);
        Aluno p4 = new Aluno("Miguel",4713);

        turma.addAluno(new Boletim(p1, 3.5, 9));
        turma.addAluno(new Boletim(p2, 7.8, 8));
        turma.addAluno(new Boletim(p3, 5.6, 10));
        turma.addAluno(new Boletim(p4, 8.8, 10));

        // System.out.println("-=-=".repeat(20));

        // turma.listarboletins();

        // System.out.println("-=-=".repeat(20));

        // turma.posicaoPorNotas();

       
        
       

        while (true) {
            try{

                System.out.print("deseja Procurar Aluno? [S/N]: ");
                String escolha = input.nextLine().trim().toUpperCase();

                Tratamento.perguntar(escolha);
                // if(!escolha.equals("N") && !escolha.equals("S")){
                //    throw new IllegalArgumentException("valores inválido: digite apenas S ou N.");
                // }

                if(escolha.equals("N")){
                    System.out.println("Encerrando o programa.");
                    break;
                }

                System.out.print("deseja buscar o Aluno por nome ou matricula? ");
                String opcao = input.nextLine().trim().toLowerCase();

                Tratamento.validarOpcao(opcao);
                // if(!opcao.equals("nome") && !opcao.equals("matricula")){

                // }
           

                if(opcao.equals("nome")){
                    System.out.println("digite o nome do aluno: ");
                    String nome = input.nextLine();
                    Tratamento.capitalizar(nome);

                    Tratamento.validarNome(nome);

                    Boletim b = turma.buscarPorNome(nome);

                    if(b != null){
                        System.out.println("aluno encontrado.");
                        System.out.println(b);
                    }else{
                        System.out.println("aluno nao encontrado.");
                    }
                }


                if(opcao.equals("matricula")){
                    System.out.print("Digite o Número da Matrícula");
                    int number = input.nextInt();

                    Tratamento.validarMatricula(number);
                    
                    Boletim n = turma.buscarPorMatricula(number);

                    if(n != null){
                        System.out.println("aluno encontrado\n");
                        System.out.println(n);
                        
                    }else{
                        System.out.println("aluno nao encontrado.\n");
                    }
                }
            }catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
                
            }
        }

        
    }
}
