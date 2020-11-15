package com.company;
import java.io.File;
import java.util.Scanner;
import java.util.TooManyListenersException;

public class Main {
/*
Programa para agregar n cantidad de vendedores y sus ventas dentro de un arreglo,una vez ingresado la cantidad
de datos establecida para el arreglo este nos mostrara los datos ingresados y al final nos dira quien es el
empleado del mes el cual es seleccionado segun sus ventas.Tambien calcula las ganancias de cada empleado estos
obtinen un 30% de las ventas mas una comision de 1500 lempiras por ventas mayores o iguales a 8000


 */
    public static void main(String[] args) {
                        Scanner a=new Scanner(System.in);
        char r='s';
while(r=='s'){
    System.out.println("=======================[Ventas HN]=======================");
    System.out.println("Cuantos empleados tiene la empresa" );
    int n=a.nextInt();
    int ventas[]=new int [n];
    String vendedores[]=new String [n];
    double total[]=new double[n];
    for(int x=0;x<n;x++){
        System.out.println("====================================================================");
        a.nextLine();
        System.out.printf("Ingrese el nombre del vendedor: ");
        vendedores[x]=a.nextLine();
        System.out.printf("Cual es el monto de las ventas de %s: ",vendedores[x]);
        ventas[x]=a.nextInt();
    }
       int mayor=0;
    int empleado=0;
    for (int b=0;b<n;b++){
        if (ventas[b]>mayor){
            mayor=ventas[b];
            empleado=b;
        }

    }
    int q=0;
    System.out.println("====================================================================");
    while(q<n){
        System.out.printf("Las ventas de %s fueron de %d lempiras \n",vendedores[q],ventas[q]);
        q++;
    }
    int w=1;
        while(w!=3){
        System.out.println("====================================================================");
        System.out.println("Seleccione una opcion");
        System.out.println("1.Empleado del mes");
        System.out.println("2.Sueldo de los empleados");
        System.out.println("3.Salir");
        w=a.nextInt();
            System.out.println("====================================================================");
     switch (w){
         case 1:

             System.out.printf("El empleado del mes es: %s con una venta de %d lempiras \n", vendedores[empleado],mayor);

             break;
         case 2:

             for(int x=0;x<n;x++){
                 double f=ventas[x]*0.30;
                 double c=ventas[x]-f;
                 if (ventas[x]>=8000){
                     total[x]=c+1500;
                 }
                 else {
                     total[x]=c;
                 }
             }
            for(int o=0;o<n;o++){
                 System.out.printf("El sueldo de %s es de %f lempiras \n",vendedores[o],total[o]);

             }
             break;
         default:
             w=3;

     }

    }

    System.out.println("Para finalizar presione n,para realizar nuevos calculos presione s");
    r=a.next().charAt(0);
}

}
}