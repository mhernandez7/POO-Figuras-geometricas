
package co.edu.uniminuto.clases;

import java.util.Scanner;


public class Circulo extends Figura {

    private double radio;
    
    
    public void solicitudDatos(){
    Scanner read = new Scanner(System.in);
    System.out.println("Ingrese el valor del radio del circulo: ");
    this.radio = read.nextDouble();
    
     }
   
    @Override
    public double calculoArea() {
    double area =0;
        if (this.radio >0){
         area = NP_PI * (this.radio * this.radio);
        }
        
        return area;
    }

    @Override
    public double calculoPerimetro() {
    double resultPerimetro = NP_PI *(2*this.radio);
    return resultPerimetro;
    }

    @Override
    public double calculoVolumen() {
        
   
      double  volumen = ((4*Math.pow(this.radio,3))*NP_PI)/3;
      
   
   return volumen;
    }

  
    
}
