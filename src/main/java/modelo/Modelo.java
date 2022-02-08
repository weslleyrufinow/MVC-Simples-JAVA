package modelo;

import java.lang.Exception;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.lang.Math;

public class Modelo {
    private double valor = 0;
    private double res = 0;

    public double getValor() {
        return valor;}
    public void setValor(double n) {
        this.valor = n;}
    public double getRes() {
        return res;}
    public void setRes(double n) {
        this.res = n;}    
    
    public double senoteste() throws Exception{
       double a = this.getValor();
        if(a < 0){
            throw new Exception("Numero igual a 1");
        }else{
            a = Math.sin(a);
        }
    return a;}
    
    public double cossenoteste() throws Exception{
        double a = this.getValor();
        if(a < 0){
            throw new Exception("Numero igual a 1");
        }else{
            a = Math.cos(a);
        }
    return a;}
    
    public double raizteste() throws Exception{
        double a = this.getValor();
        if(a < 0){
            throw new Exception("Numero igual a 1");
        }else{
            a = Math.sqrt(a);
        }
    return a;}

    public double tangenteteste() throws Exception{
        double a = this.getValor();
        if(a < 0){
            throw new Exception("Numero igual a 1");
        }else{
            a = Math.tan(a);
        }
    return a;}    
    
    public double incrementoteste() throws Exception{
        double a = this.getValor();
        if(a == 100){
            throw new Exception("Numero igual a 1");
        }else{
            
        }
    return ++a;}

    public double decrementoteste() throws Exception{
        double a = this.getValor();
        if(a == 10){
            throw new Exception("Numero igual a 1");
        }else{
            
        }
    return --a;}    
    
    public void seno(){
     res = Math.sin(valor);}
    public void cosseno(){
     res = Math.cos(valor);}
    public void raiz(){
     res = Math.sqrt(valor);}    
    public void tangente(){
     res = Math.tan(valor);}
    public void incrementar(){
     res = valor; ++res;}
    public void decrementar(){
     res = valor; --res;}         
    
    public void menu(){        
        System.out.println("0.sair");
        System.out.println("1.Seno");
        System.out.println("2.Cosseno");
        System.out.println("3.Raiz Quadrada");
        System.out.println("4.Tangente");
        System.out.println("5.Incrementar");
        System.out.println("6.Decrementar");
        System.out.println("7.Teste");
        System.out.println("Esperando comando:...");
    }          
    
}