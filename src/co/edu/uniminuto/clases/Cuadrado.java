
package co.edu.uniminuto.clases;

import java.util.Scanner;


public class Cuadrado extends Figura{


    public void solicitudDatos(){
    Scanner read = new Scanner(System.in);
    System.out.println("Ingrese el valor de uno de los lados del cuadrado");
    this.lado = read.nextDouble();
    
    }
    @Override
    public double calculoVolumen() {
    double volumen = Math.pow(this.lado, 3);
    return volumen;
    }

    @Override
    public double calculoArea() {
        double area = this.lado* this.lado;
        return area;
    }

    @Override
    public double calculoPerimetro() {
   
        double perimetro = this.lado*4;
        return perimetro;    
    }

  
    
    
}
