/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smarttv;

/**
 *
 * @author ibiet
 */
public class SmartTv {

   private String marca;
   private String modelo;
   private int numserie;
   private int pulgadas;
   private Informacion informacion;
   
   public SmartTv (){
       
   }

    public SmartTv(String marca, String modelo, int numserie, int pulgadas, Informacion informacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.numserie = numserie;
        this.pulgadas = pulgadas;
        this.informacion = informacion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumserie() {
        return numserie;
    }

    public void setNumserie(int numserie) {
        this.numserie = numserie;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public Informacion getInformacion() {
        return informacion;
    }

    public void setInformacion(Informacion informacion) {
        this.informacion = informacion;
    }

    @Override
    public String toString() {
        return "SmartTv{" + "marca=" + marca + ", modelo=" + modelo + ", numserie=" + numserie + ", pulgadas=" + pulgadas + ", informacion=" + informacion + '}';
    }
   
   
    
    
}
