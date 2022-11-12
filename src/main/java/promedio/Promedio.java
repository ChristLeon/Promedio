package promedio;
import java.util.Scanner;
public class Promedio {
    public static void main(String[] args) {
    Scanner scn=new  Scanner(System.in);
    double suman=0;
    double promf=0;
    
    System.out.println("Ingrese la cantidad de las cuales desea hallar su promedio: ");
    int prom=scn.nextInt();
    
    double notas[]=new double [prom];
    
    for(int i = 0; i <notas.length; i++){
    System.out.println("Ingrese Nota:"+(i+1));
    notas[i]=scn.nextDouble();
    }
    for(int i = 0; i <notas.length; i++){
    suman=suman+notas[i];
    promf=suman/prom;
    }
        System.out.println("Promedio Final: "+promf);
    }
    
}
