import Ejercicio.*;
import java.util.List;
import java.util.ArrayList;

public class App {

    public static void main(String[] args) throws Exception {

        EjercicioUno ejerUno = new EjercicioUno();
        List<Integer> set = new ArrayList<>();
         set.add(1);
        set.add(2);
         set.add(3);
         List<List<Integer>> result = ejerUno.subsets(set);
         System.out.println("Resolución del Ejercicio Uno:");
        System.out.println(result);



         EjercicioDos ejerDos = new EjercicioDos();
         int n = 1;
         List<String> resultado = ejerDos.generateParenthesis(n);
         System.out.println("Resolución del Ejercicio Dos con 1 de entrada:");
         System.out.println(resultado);
         int numerito = 3;
         List<String> resulta= ejerDos.generateParenthesis(numerito);
         System.out.println("Resolución del Ejercicio Dos con 3 de entrada:");
         System.out.println(resulta);

    }
}
