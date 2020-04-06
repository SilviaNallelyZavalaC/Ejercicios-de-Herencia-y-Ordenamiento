
 /*Zavala Concha Silvia Nallely TESOEM 2S11 Turno Matutino */
package OrdenArry;

import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        double y[], mayor, menor, promedio, suma=0;
        int n, i; 
        do{
            System.out.println(" numero de elementos :");
            n= teclado.nextInt();
        } while(n<=0);
        y = new double[n];
          for(i=0;i<n;i++)
          {
              System.out.println("y["+i+"]=");
              y[i]= teclado.nextDouble();
          } 
          System.out.println("Elemento del arreglo:");
          for(i=0;i<n;i++)
          {
              System.out.println("y["+i+"]="+y[i]);  
          } 
        mayor= menor= y[0];
        for(i=0;i<n;i++)
            if(y[i]>mayor)
                mayor= y[i];
        else
                if(y[i]<menor)
                menor=y[i];
        for(i=0;i<n;i++)
        {
            suma=suma +y[i];
        }
        promedio= suma/n;
        System.out.println("El mayor es:" +mayor);
      System.out.println("El menor es:" +menor);
      System.out.println("El promedio es:" +promedio);

    }
    
}
