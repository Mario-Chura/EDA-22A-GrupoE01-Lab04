import com.panayotis.gnuplot.JavaPlot;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class Prueba{
    public static void main(String [] args) throws IOException{
        int tamano;
        Scanner teclado = new Scanner( System.in );
        System.out.print( "Introduzca el tamaño del arreglo: " );
        tamano = teclado.nextInt();

        ArrayList<ListaDobleEnlazada<Integer>> casos = new ArrayList<>();
        String archivoInsercion = "insercion.txt";
        PrintWriter oS = new PrintWriter(archivoInsercion);

        for(int n=1; n<=tamano; n++)
            casos.add(peorCaso(n));
        Iterator<ListaDobleEnlazada<Integer>> puntero = casos.iterator();
        while(puntero.hasNext())
            oS.println(String.valueOf(puntero.next().insertionSort()));
        oS.close();

        JavaPlot p = new JavaPlot();
        p.addPlot("\"insercion.txt\" with lines");
        p.plot();
    }
    public static ListaDobleEnlazada <Integer> peorCaso(int n){
        ListaDobleEnlazada <Integer> lista = new ListaDobleEnlazada <Integer>();
        for(int i = n; i > 0; i--){
            lista.add(i);
        }
        return lista;
    }
}
