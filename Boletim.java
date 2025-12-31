public class Boletim {
    private Aluno aluno;
    private double nota1,nota2;

    public Boletim(Aluno aluno,double nota1,double nota2){
        this.aluno = aluno;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public Aluno getAluno(){
        return aluno;
    }
    
    public double GetNota1() {
        return nota1;
    }
    
    public double GetNota2() {
        return nota2;
    }

    public double calcularMedia(){
        return (nota1+nota2) / 2;
    }

    @Override
    public String toString(){
        return String.format("Aluno: %s| Matricula: %d | nota1: %.2f | nota2: %.2f | Média: %.2f",
        getAluno().getNome(),getAluno().GetMatricula(),GetNota1(),GetNota2(),calcularMedia());
    }
    
}