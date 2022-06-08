
package Gestor;

public class Persona {

     private String dnom;
     private String dtele;
     private String ddirec;
     private String dloca;
     private String dentre;
     private String dcoment;

    public Persona(String dnom, String dtele, String ddirec, String dloca, String dentre, String dcoment) {
        this.dnom = dnom;
        this.dtele = dtele;
        this.ddirec = ddirec;
        this.dloca = dloca;
        this.dentre = dentre;
        this.dcoment = dcoment;
    }

    public String getDnom() {
        return dnom;
    }

    public String getDtele() {
        return dtele;
    }

    public String getDdirec() {
        return ddirec;
    }

    public String getDloca() {
        return dloca;
    }

    public String getDentre() {
        return dentre;
    }

    public String getDcoment() {
        return dcoment;
    }
 
    
      
    
    public void setDnom(String dnom) {
        this.dnom = dnom;
    }

    public void setDtele(String dtele) {
        this.dtele = dtele;
    }

    public void setDdirec(String ddirec) {
        this.ddirec = ddirec;
    }

    public void setDloca(String dloca) {
        this.dloca = dloca;
    }

    public void setDentre(String dentre) {
        this.dentre = dentre;
    }

    public void setDcoment(String dcoment) {
        this.dcoment = dcoment;
    }
 
    
    
    
    
    
    
    
    
    
}
