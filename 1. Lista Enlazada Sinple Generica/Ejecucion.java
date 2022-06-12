import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import com.panayotis.gnuplot.JavaPlot;

public class Ejecucion  {
    public static void main(String[] args) throws IOException {
    
        //Definimos tamaño
		int tamano;        
		Scanner teclado = new Scanner( System.in );
		System.out.print( "Introduzca el tamaño máximo del último arreglo: " );
		tamano = teclado.nextInt();
        
        //Declaramos una lista enlazada de arrays de enteros
		Lista<int[]> casos = new Lista<int[]>();        
		String archivoInsercion = "insercion.txt";
		PrintWriter oS = new PrintWriter(archivoInsercion);
        
        //En cada array de la lista de enlazada generamos peores casos
		for(int n=1; n<=tamano; n++) {
			casos.agregar(generarPeorCaso(n));
		}

        //Obtenemos el tiempo de ordenamiento de cada array de la lista enlazada
		for (int i = 0; i < casos.getLongitud(); i++) {
			oS.println( String.valueOf( insertionSort(casos.obtener(i)) ) );
		}
		oS.close();             
		JavaPlot p = new JavaPlot();
		p.addPlot("\"insercion.txt\" with lines");
		p.plot();

    }

    public static int[] generarPeorCaso(int t) {
		int[] lista= new int[t];
		for (int i=0; i<t; i++) {
			lista[i] = t-i;		
		}
		return lista;		
	}

    public static long insertionSort(int[] A) {
		int key;
		int i;
		long nano_startTime = System.nanoTime(); 
		for(int j=1; j<A.length; j=j+1) {
			key = A[j];
			i = j-1;
			while(i>-1 && A[i]>key) {
				A[i+1] = A[i];
				i = i-1;
			}
			A[i+1] = key;
		}
		long nano_endTime = System.nanoTime();		
		return nano_endTime - nano_startTime;		
	}
    
}
