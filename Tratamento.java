public class  Tratamento extends Exception{

    public Tratamento(String smg){
        super(smg);
    }
    public static void validarNome(String nome){
        if (nome == null || nome.isBlank()) {
         throw new IllegalArgumentException ("entrada inválida: Apenas nomes do Aluno\n");
        }

        if(!nome.matches("^[A-Za-zÀ-ỹ]+$")){
            throw new IllegalArgumentException("entrada inválida: digite o nome do Aluno\n");
        }
    }

    public static int validarMatricula(int matricula){
        String valor = String.valueOf(matricula);
        int matri;
        if(String.valueOf(matricula).length() != 4){
            throw new ArithmeticException("valor de entrada inválida: digite apenas quatro números inteiros\n");
        }
        else if (!valor.matches("^\\d+$")) {
            throw new IllegalArgumentException("entrada inválida: apenas números são permitidos\n.");
        }
        else{
            matri = Integer.parseInt(valor);
        }
        return matri;
    }

    public  static void perguntar(String pergunta){
        if (!pergunta.equals("N") && !pergunta.equals("S")) {
            throw new IllegalArgumentException("descrição inválida: digite apenas S ou N.");
        }

    }

    public static String validarOpcao(String opcao){
        if(!opcao.equals("nome") && !opcao.equals("matricula")){
            throw new IllegalArgumentException("opção inválida: apenas nome e matricula");
        }
        return opcao;
    }
    public static String capitalizar(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        // Pega a primeira letra e converte para maiúscula
        String primeiraLetra = str.substring(0, 1).toUpperCase();
        // Pega o resto da string e converte para minúscula (opcional)
        String restante = str.substring(1).toLowerCase();

        String novoNome = primeiraLetra + restante;

        return novoNome;
    }

}
