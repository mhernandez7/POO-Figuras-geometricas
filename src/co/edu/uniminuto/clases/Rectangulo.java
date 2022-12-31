
package co.edu.uniminuto.clases;

import java.util.Scanner;

public class Rectangulo extends Figura{
    
    private double base;
    private double altura;
    private int validacion;
    
    public void solicitudDatos(){
    Scanner read = new Scanner(System.in);
    System.out.println("Ingrese la base del rectangulo");
    this.base = read.nextDouble();
    System.out.println("Ingrese la altura del rectangulo");
    this.altura = read.nextDouble();
    }
    
    @Override
    public double calculoArea() {
    double area = this.base * this.altura;
      
    return area;
    }

    @Override
    public double calculoPerimetro() {
    
    double perimetro = (this.altura+this.base)*2;
    
    return perimetro;
    }

    public double solicitudVolumen(){
    Scanner read = new Scanner(System.in);
        int ingreso = 1;
        System.out.println("Para calcular el volumen de un prisma rectangular"
                + "se requiere saber las medidas de su altura, profundidad y base");
        System.out.println("Desea calcular el volumen de la figura?");
        System.out.println("ingrese 1 para si o culaquier otro numero para continuar");
        this.validacion = read.nextInt();
        return this.validacion ;
    }
    
    @Override
    public double calculoVolumen() {
        Scanner read = new Scanner(System.in);
        double volumen =0;
        double profundidad=0;
           
        if (this.validacion  == -1){
            
            System.out.println("Ya se tienen la base y la altura de la figura");
            System.out.println("Ingrese la profundidad ");
            profundidad = read.nextDouble();
            volumen = (this.base*this.base)*profundidad;
        }else {
            System.out.println("Se continua sin calcular el volumen");
        }
     return volumen;
    }
    
}
