import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TarefaLista2 {

    public static void main(String args[]) {

        listaGeneroOrdenada();
    }

    public static void listaGeneroOrdenada() {
        System.out.println("******* ListaGeneroOrdenada *******");

        List<String> nomes = new ArrayList<String>();
        nomes.add("Ana - F");
        nomes.add("João - M");
        nomes.add("Dayane - F");
        nomes.add("Pedro - M");
        nomes.add("Luciana - F");
        nomes.add("Eduardo - M");
        Collections.sort(nomes);

        System.out.println("Pessoas do sexo masculino");
        for (String nome : nomes) {
            String[] partes = nome.split(" - ");
            if (partes[1].equals("M")) {
                System.out.println(partes[0]);
            }
        }

        System.out.println("\nPessoas do sexo feminino");
        for (String nome : nomes) {
            String[] partes = nome.split(" - ");
            if (partes[1].equals("F")) {
                System.out.println(partes[0]);
            }
        }
    }
}
