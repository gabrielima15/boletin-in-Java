import java.util.ArrayList;
import java.util.List;

public class Turma {
    private List<Boletim> boletin;

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
}