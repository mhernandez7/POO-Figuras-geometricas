
package co.edu.uniminuto.clases;

import java.util.Scanner;


public class TrianguloEquilatero extends Figura{

    private  int validacion;
    
    public void solicitudDatos(){
    Scanner read = new Scanner(System.in);
    System.out.println("Ingrese el valor de uno de los lados del triangulo");
    this.lado = read.nextDouble();
     }
    
    @Override
    public double calculoArea() {
    double area  = ((Math.sqrt(3))/4)*(Math.pow(this.lado, 2));
    return area;
    }

    @Override
    public double calculoPerimetro() {
    double perimetro = this.lado*3;
    
    return perimetro;
    }

    @Override
    public double calculoVolumen() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
