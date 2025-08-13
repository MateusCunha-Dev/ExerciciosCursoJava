package metodos_java;

public class MetodosImportantes {
    public static void main(String[] args) {
        String nome = " Mateus Marques Cunha      ";
        System.out.println("String original: '" + nome + "'");
        System.out.println("----------------------------------------");

        // 1. Métodos de manipulação de caixa (maiusculas/minusculas)
        String s1 = nome.toLowerCase();
        String s2 = nome.toUpperCase();
        System.out.println("toLowerCase(): '" + s1 + "'"); // Converte todos os caracteres para minúsculas
        System.out.println("toUpperCase(): '" + s2 + "'"); // Converte todos os caracteres para maiúsculas
        System.out.println("----------------------------------------");

        // 2. Métodos de limpeza e substituição
        String s3 = nome.trim();
        String s6 = nome.replace('a', 'x');
        String s7 = nome.replace("a", "xy");
        System.out.println("       trim(): '" + s3 + "'"); // Remove espaços em branco do início e do fim
        System.out.println("    replace(): '" + s6 + "'"); // Substitui todos os caracteres 'a' por 'x'
        System.out.println("    replace(): '" + s7 + "'"); // Substitui todas as substrings "a" por "xy"
        System.out.println("----------------------------------------");

        // 3. Métodos de extração de substrings e caracteres
        String s4 = nome.substring(5);
        String s5 = nome.substring(1, 7);
        char s11 = nome.charAt(5);
        System.out.println("  substring(5): '" + s4 + "'"); // Extrai a substring a partir do índice 5
        System.out.println("substring(1, 7): '" + s5 + "'"); // Extrai a substring do índice 1 (inclusive) até 7 (exclusivo)
        System.out.println("     charAt(5): '" + s11 + "'"); // Retorna o caractere no índice 5
        System.out.println("----------------------------------------");

        // 4. Métodos de busca e verificação de strings
        int i = nome.indexOf('a');
        int j = nome.lastIndexOf('a');
        boolean containsAB = nome.contains("ab");
        boolean equalsLowerCase = nome.equals(nome.toLowerCase());
        boolean equalsIgnoreCase = nome.equalsIgnoreCase(nome.toLowerCase());
        boolean isEmpty = nome.isEmpty();
        boolean endsWithSpace = nome.endsWith("   ");
        System.out.println("    indexOf('a'): " + i); // Retorna a primeira ocorrência do caractere 'a'
        System.out.println("lastIndexOf('a'): " + j); // Retorna a última ocorrência do caractere 'a'
        System.out.println("    contains(\"ab\"): " + containsAB); // Verifica se a string contém a substring "ab"
        System.out.println("equals(toLowerCase()): " + equalsLowerCase); // Compara se a string é igual à sua versão minúscula (sensível a maiúsculas/minúsculas)
        System.out.println("equalsIgnoreCase(toLowerCase()): " + equalsIgnoreCase); // Compara se a string é igual à sua versão minúscula (ignorando maiúsculas/minúsculas)
        System.out.println("    isEmpty(): " + isEmpty); // Verifica se a string está vazia
        System.out.println("    endsWith(\"   \"): " + endsWithSpace); // Verifica se a string termina com "   "
        System.out.println("----------------------------------------");

        // 5. Métodos de divisão e junção de strings
        String[] vetNomes = nome.split(" ");
        System.out.println("      split(): "); // Divide a string por espaços e retorna um array
        for (String parte : vetNomes) {
            System.out.println("      - '" + parte + "'");
        }
        System.out.println("String.join(\"-\", ...): " + String.join("-", "198", "155", "0", "0")); // Junta strings com um delimitador

        // Demonstração dos primeiros elementos do array vetNomes (problema de espaços)
        String s8 = vetNomes[0];
        String s9 = vetNomes[1];
        String s10 = vetNomes[2];
        System.out.println("\nProblema com split (espaços no início):");
        System.out.println("s8 (vetNomes[0]): '" + s8 + "'");
        System.out.println("s9 (vetNomes[1]): '" + s9 + "'");
        System.out.println("s10 (vetNomes[2]): '" + s10 + "'");
    }
}
