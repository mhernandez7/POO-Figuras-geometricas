
package figurasgeometricas;

import co.edu.uniminuto.clases.Circulo;
import co.edu.uniminuto.clases.Cuadrado;
import co.edu.uniminuto.clases.Rectangulo;
import co.edu.uniminuto.clases.TrianguloEquilatero;
import java.util.Scanner;

public class FigurasGeometricas {
    
   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);
        int ingreso =0;
        System.out.println("Seleccione la figura geometrica a la que le desa calcular los parametros ");
        System.out.println("Para calcular valores de un Circulo presione    1. ");
        System.out.println("Para calcular valores de un Cuadrado presione   2. ");
        System.out.println("Para calcular valores de un Rectangulo presione 3. ");
        System.out.println("Para calcular valores de un triangulo presione  4. ");
        ingreso = read.nextInt();
        
        switch (ingreso){
            case 1:{
            Circulo();
            break;
            }
            case 2:{
            Cuadrado();
            break;
            }
            case 3:{
            Rectangulo();
            break;
            }
            case 4:{
            TrianguloEquilatero();
            break;
            }
            case 5:{
            System.out.println("No ha ingresado una opcion valida");
            break;
            }
        }
        
    }
    
    public static void Circulo(){
        Circulo circulo = new Circulo();
        circulo.solicitudDatos();
        
        System.out.println("El area del Circulo es:"+circulo.calculoArea());
        System.out.println("Su perimetro es: "+circulo.calculoPerimetro());
        System.out.println("El volumen es: "+circulo.calculoVolumen());
        circulo.validacion();
    }
    public static void Cuadrado(){
        Cuadrado cuadrado = new Cuadrado();
        cuadrado.solicitudDatos();
        
        System.out.println("El area del Cuadrado es:"+cuadrado.calculoArea());
        System.out.println("Su perimetro es: "+cuadrado.calculoPerimetro());
        System.out.println("El volumen es: "+cuadrado.calculoVolumen());
        cuadrado.validacion();
    }
    public static void Rectangulo(){
        Rectangulo rectangulo = new Rectangulo();
        rectangulo.solicitudDatos();
        System.out.println("El area del Rectangulo es:"+rectangulo.calculoArea());
        System.out.println("Su perimetro es: "+rectangulo.calculoPerimetro());
        System.out.println(rectangulo.solicitudVolumen());
        System.out.println("El volumen es: "+rectangulo.calculoVolumen());
        rectangulo.validacion();
    }
    public static void TrianguloEquilatero(){
        TrianguloEquilatero triangulo = new TrianguloEquilatero();
        triangulo.solicitudDatos();
        System.out.println("El area del Triangulo es:"+triangulo.calculoArea());
        System.out.println("Su perimetro es: "+triangulo.calculoPerimetro());
        triangulo.validacion();
    
    }
    
}
