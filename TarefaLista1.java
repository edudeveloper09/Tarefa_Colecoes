import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TarefaLista1 {

    public static void main(String args[]) {

        listaNomesOrdenada();
    }

    public static void listaNomesOrdenada() {
        System.out.println("****** listaNomesOrdenada ******");
        List<String> nomes = new ArrayList();
        nomes.add("João");
        nomes.add("Eduardo");
        nomes.add("Alexandre");
        nomes.add("Douglas");
        Collections.sort(nomes);
        System.out.println(nomes);
        System.out.println("**********************************");
    }
}
