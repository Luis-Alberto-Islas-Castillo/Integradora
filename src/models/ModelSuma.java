/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;


public class ModelSuma {

double numero1=50;
double numero2=10.0;
double resultado=15.0;

    public double getNumero1(){
        return numero1;
    }
    public double getNumero2(){
        return numero2;
    }
    public double getResultado(){
        return resultado;
    }
    public void setNumero1(double numero1){
        this.numero1=numero1;
    }
    public void setNumero2(double numero2){
        this.numero2=numero2;
    }
    public void setResultado(double resultado){
        this.resultado=resultado;
    }
    public void suma(){
        resultado=numero1+numero2;
    }
    public void resta(){
        resultado=numero1-numero2;
    }
    public void multiplicacion(){
        resultado=numero1*numero2;
    }
    public void divicion(){
        resultado=numero1/numero2;
    }
}