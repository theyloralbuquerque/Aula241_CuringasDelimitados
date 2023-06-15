package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
        List<Double> myDoubles = Arrays.asList(3.14, 6.28);
        List<Object> myObjs = new ArrayList<Object>();
        copy(myInts, myObjs);    // Chamada do m�todo copy, passando as listas myInts e myObjs como argumentos.
        printList(myObjs); 		 // Chamada do m�todo printList, passando a lista myObjs como argumento.
        copy(myDoubles, myObjs); // Chamada do m�todo copy, passando as listas myDoubles e myObjs como argumentos.
        printList(myObjs);
    }

    // O m�todo copy recebe como argumento uma Lista que seja qualquer subtipo de Number.
    // O m�todo copy recebe como argumento uma Lista de qualquer tipo que possa ser um supertipo de Number.
    public static void copy(List<? extends Number> origem, List<? super Number> destino) { // Os par�metros aqui recebidos s�o curingas delimitados.
        for (Number number : origem) { // Usando a covari�ncia.
            destino.add(number);       // Usando a contravari�ncia.
        }
    }

    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }
}
