package controller;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import javax.inject.Named;
import modelo.Modelo;

@Named("Controller")
@SessionScoped

public class Controller implements Serializable{
     private Modelo modelo = new Modelo();
     private double x;
     
    public Modelo getModelo(){
    return modelo;}
    
    public void submeteseno(){
        x = 0;
        try {   
            x = modelo.senoteste();
        } catch (Exception e){
            FacesContext.getCurrentInstance().addMessage
        ("messages", new FacesMessage(FacesMessage.SEVERITY_INFO,"Valor menor que 0", "Valor menor que 0"));
        }    
    }
    public void submetecosseno(){
        x = 0;
        try {   
            x = modelo.cossenoteste();
        } catch (Exception e){
            FacesContext.getCurrentInstance().addMessage
        ("messages", new FacesMessage(FacesMessage.SEVERITY_INFO,"Valor menor que 0", "Valor menor que 0"));
        }    
    }
    
    public void submeteraiz(){
        x = 0;
        try {   
            x = modelo.raizteste();
        } catch (Exception e){
            FacesContext.getCurrentInstance().addMessage
        ("messages", new FacesMessage(FacesMessage.SEVERITY_INFO,"Nao existe raiz de numero negativo", "Nao existe raiz de numero negativo"));
        }    
    }      
    
    public void submetetangente(){
        x = 0;
        try {   
            x = modelo.tangenteteste();
        } catch (Exception e){
            FacesContext.getCurrentInstance().addMessage
        ("messages", new FacesMessage(FacesMessage.SEVERITY_INFO,"Valor menor que 0", "Valor menor que 0"));
        }    
    }      
    
    public void submeteincrementar(){
        x = 0;
        try {   
            x = modelo.incrementoteste();
        } catch (Exception e){
            FacesContext.getCurrentInstance().addMessage
        ("messages", new FacesMessage(FacesMessage.SEVERITY_INFO,"Nao vai rolar", "Nao vai rolar"));
        }    
    }     
    
    public void submetedecrementar(){
        x = 0;
        try {   
            x = modelo.decrementoteste();
        } catch (Exception e){
            FacesContext.getCurrentInstance().addMessage
        ("messages", new FacesMessage(FacesMessage.SEVERITY_INFO,"Nao vai rolar...", "Nao vai rolar..."));
        }    
    }         
    
    public double getX(){
       return x;
    }        
}