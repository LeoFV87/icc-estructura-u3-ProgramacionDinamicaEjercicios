package Ejercicio;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * Implementa un método para devolver todos los subconjuntos de un arreglo de enteros
 * 
 * Se puede sin recursividad
 * Ejemplo:
 *  Input: [1,2,3]
 *
 *  Output:
 *    [
 *      [1,2,3],
 *      [1,2],
 *      [1,3],
 *      [2,3],
 *      [1],
 *      [2],
 *      [3],
 *      []
 *    ]
 * 
 * El  metodo me debe devolver una lista de listas de enteros. 
 * Se puede usar varios metodos 
 * 
 * Ecoja la mejor estructura de datos para que sea mas eficiente
 */
public class EjercicioUno {

     public List<List<Integer>> subsets(List<Integer> set) {

      Set<List<Integer>> result = new HashSet<>();

       result.add(new ArrayList<>()); 

        for (int numero : set) {
            Set<List<Integer>> newSubsets = new HashSet<>();

            for (List<Integer> subset : result) {
                List<Integer> newSubset = new ArrayList<>(subset); 
                newSubset.add(numero); 
                newSubsets.add(newSubset); 
            }

            result.addAll(newSubsets); 
        }

        return new ArrayList<>(result);
    }
}
