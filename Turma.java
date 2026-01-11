import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Turma {
    private List<Boletim> boletin;
    Scanner input = new Scanner(System.in);


    public Turma(){
        this.boletin = new ArrayList<>();
    }

    public void addAluno(Boletim b){
        boletin.add(b);
    }

    public void listarboletins(){
        for (Boletim b : boletin) {
            System.out.println(b.toString());
        }
    }

    public void posicaoPorNotas(){
        System.out.println("=== Melhores Notas ===\n");

        for(Boletim b : boletin){
            if(b.calcularMedia() >= 7){
                System.out.println(b.toString());
            }
        }
        System.out.println("=== Piores Notas ===\n");

        for(Boletim b : boletin){
            if(b.calcularMedia() < 7){
                System.out.println(b.toString());
            }
        }
    }

    public Boletim buscarPorMatricula(int matricula){
        for(Boletim b : boletin){
            if(b.getAluno().GetMatricula() == matricula){
                return b;
            }

        }
        
        return null;
    }

     public Boletim buscarPorNome(String nome){
        for(Boletim b : boletin){
            if(b.getAluno().getNome().equals(nome)){
                return b;
            }
        }
        return null;
    }


    public void RodarPrograma(){
         while (true) {
            try{

                System.out.print("deseja Procurar Aluno? [S/N]: ");
                String escolha = input.nextLine().trim().toUpperCase();

                if(escolha.equals("N")){
                    System.out.println("Encerrando o programa");
                    break;
                }

                System.out.print("deseja buscar o Aluno por nome ou matricula? ");
                String opcao = input.nextLine().trim().toLowerCase();

           

                if(opcao.equals("nome")){
                    System.out.println("digite o nome do aluno: ");
                    String nome = input.nextLine();

                    Tratamento.validarNome(nome);

                    Boletim b = buscarPorNome(nome);

                    if(b != null){
                        System.out.println("aluno encontrado.");
                        System.out.println(b);
                    }else{
                        System.out.println("aluno nao encontrado.");
                    }
                }


                if(opcao.equals("matricula")){
                    System.out.print("Digite o Número da Matrícula");
                    int number = Integer.parseInt(input.nextLine());

                    Tratamento.validarMatricula(number);
                    
                    Boletim n = buscarPorMatricula(number);

                    if(n != null){
                        System.out.println("aluno encontrado\n");
                        System.out.println(n);
                        
                    }else{
                        System.out.println("aluno nao encontrado.\n");
                    }
                }
            }catch(Exception e){
                System.out.println(e.getMessage());
                
            }

        }

        
    }
}

