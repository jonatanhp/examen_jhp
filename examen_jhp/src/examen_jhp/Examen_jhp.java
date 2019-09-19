/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_jhp;

/**
 *
 * @author Laboratorio 7
 */
import java.util.*;
import javax.swing.*;
public class Examen_jhp {
static Scanner leer=new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void ejercicio1_jhp(){
    int numdias=Integer.parseInt(JOptionPane.showInputDialog("introduzca el número de días:"));
    int costhotel=Integer.parseInt(JOptionPane.showInputDialog("ingrese el costo del hotel:"));
    int costcomida=Integer.parseInt(JOptionPane.showInputDialog("ingrese el costo de la comida"));
    
    /*for(int i=0; i<numdias;i++){
        int total=numdias*(costcomida+costhotel+100);*/
   int total=numdias*(costcomida+costhotel+100);
    JOptionPane.showMessageDialog(null, "el total del chque para "+numdias+" días es igual a: "+total);
    }
    public static void ejercicio2_jhp(){
        int tiempo=Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de años que lleva en la empresa:"));
        int sueldo=Integer.parseInt(JOptionPane.showInputDialog("ingrese su sueldo:"));
        double bono=0;
        if(tiempo>4 || sueldo<2000 ){
            bono=0.25*sueldo;
        }else{
        bono=0.2*sueldo;
        }
        JOptionPane.showMessageDialog(null, "la cantidad que le corresponde de bono navideño es de: "+bono);
    }
    public static void ejercicio3_jhp(){
        int num1=Integer.parseInt(JOptionPane.showInputDialog("introduzca el primer número"));
        int num2=Integer.parseInt(JOptionPane.showInputDialog("introduzca el segundo número"));
        int num3=Integer.parseInt(JOptionPane.showInputDialog("introduzca el tercer número"));
        int may;
        int med;
        int men;
     
    }
    
    
    public static void ejercicio31_jhp(){
    int men;
    int med;
    int may;
System.out.println("introduzca el primer número");
int num1=leer.nextInt();
System.out.println("introduzca el segundo número");
int num2=leer.nextInt();
System.out.println("introduzca el tercer número");
int num3=leer.nextInt();
if(num1>num2 && num1>num3){
    may=num1;
    if(num2>num3){
        med=num2;
        men=num3;
    }else{
        med=num2;
        men=num3;
    }
    System.out.println("el numero mayor es: "+may+" el numero medio es: "+med+" el numero menor es "+men);
}
if(num2>num1 && num2>num3){
    may=num2;
    if(num1>num3){
        med=num1;
        men=num3;
    }else{
        med=num3;
        men=num1;
    }
    System.out.print("el numero mayor es: "+may+" el numero medio es:"+med+" el numero menor es: "+men);
}
if(num3>1 && num3>num2){
    may=num3;
    if(num2>num1){
        med=num2;
        men=num1;
    }else{
        med=num1;
        men=num2;
    }
    System.out.println("el numero mayor es: "+may+" el numero medio es: "+med+" el numero menor es:"+men);
}
 
    }
    
    public static void ejercicio4_jhp(){
        String num1=JOptionPane.showInputDialog("introduzca el primer número");
        String num2=JOptionPane.showInputDialog("introduzca el segundo número");
        double num1d=Double.parseDouble(num1);
        double num2d=Double.parseDouble(num2);
        String signo=JOptionPane.showInputDialog("introduzca el signo de la operación que quiere realizar");
        double resultado=0;
        if (signo.equals("+")){
            resultado=num1d+num2d;}
        else if(signo.equals("-")){
            resultado=num1d-num2d;
        
        }
        else if(signo.equals("*")){
            resultado=num1d*num2d;}
        else{
        resultado=num1d/num2d;
        }
        JOptionPane.showMessageDialog(null, "el resultado de la operación es: "+resultado);
    }
    
    public static void ejercicio5_jhp(){
        String salario=JOptionPane.showInputDialog("introduzca el salario ");
        double salariod=Double.parseDouble(salario);
        int años=Integer.parseInt(JOptionPane.showInputDialog("introduzca la cantidad de años"));
        double acum=1;
        
        for (int i=2;i<años;i++){
            salariod=salariod+(salariod*0.1);
            acum=salariod+(salariod*0.1);
            
        }
        JOptionPane.showMessageDialog(null, "la cantidad de sueldo que ha recibido en "+años+" años es "+acum);
    }
    
     public static void main(String[] args) {
        // TODO code application logic here
        int ejercicio=Integer.parseInt(JOptionPane.showInputDialog("introduzca el número de ejercicio que desea probar"));
        
        switch (ejercicio){
            case 1:{ejercicio1_jhp();}break;
            case 2:{ejercicio2_jhp();}break;
            case 3:{ejercicio31_jhp();}break;
            case 4:{ejercicio4_jhp();}break;
            case 5:{ejercicio5_jhp();}break;
        }
        
    }
    }

   
    
