public class  Tratamento{

    public static void validarNome(String nome){
        if (nome == null || nome.isBlank()) {
         throw new IllegalArgumentException ("entrada inválida: Apenas nomes do Aluno");
        }

        if(!nome.matches("^[A-Za-zÀ-ỹ]+$")){
            throw new IllegalArgumentException("entrada inválida: digite o nome do Aluno");
        }
    }

    public static void validarMatricula(int matricula){
        String valor = String.valueOf(matricula);

        if(String.valueOf(matricula).length() != 4){
            throw new ArithmeticException("valor de entrada inválida: digite apenas quatro números inteiros");
        }
        if (!valor.matches("^\\d+$")) {
            throw new IllegalArgumentException("entrada inválida: apenas números são permitidos.");
        }
       
    }
}
