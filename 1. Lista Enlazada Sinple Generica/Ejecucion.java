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

    }
    
}
