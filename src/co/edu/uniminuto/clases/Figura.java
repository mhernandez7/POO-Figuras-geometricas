
package co.edu.uniminuto.clases;

import co.edu.uniminuto.interfaces.IFigura;
import static figurasgeometricas.FigurasGeometricas.Circulo;
import static figurasgeometricas.FigurasGeometricas.Cuadrado;
import static figurasgeometricas.FigurasGeometricas.Rectangulo;
import static figurasgeometricas.FigurasGeometricas.TrianguloEquilatero;
import java.util.Scanner;


public abstract class Figura implements IFigura {
    
    protected String nombreFigura;
    protected double lado;

    
    public String getNombreFigura() {
        return nombreFigura;
    }

    public void setNombreFigura(String nombreFigura) {
        this.nombreFigura = nombreFigura;
    }
    public void printing(){
    System.out.println(""+this.nombreFigura);
    }
 
    public void validacion(){
        Scanner read = new Scanner(System.in);
        int validar = 0;
        System.out.println("¿Desea realizar los calculos con otra figura geometrica ?");
        System.out.println("Ingrese 1) para si y 2) para salir: ");
        validar = read.nextInt();
        
        if (validar == 1){
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
        }else{
            System.out.println("Salio correctamente");
        }
        
    
    }
    
}
