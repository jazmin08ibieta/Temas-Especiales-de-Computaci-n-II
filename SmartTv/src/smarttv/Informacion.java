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
public class Informacion {
    private String pais;
    private int altura;
    private int ancho;
    private int peso;
    private int anio;
    
    public Informacion(){
        
    }

    public Informacion(String pais, int altura, int ancho, int peso, int anio) {
        this.pais = pais;
        this.altura = altura;
        this.ancho = ancho;
        this.peso = peso;
        this.anio = anio;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Informacion{" + "pais=" + pais + ", altura=" + altura + ", ancho=" + ancho + ", peso=" + peso + ", anio=" + anio + '}';
    }
    
    
}
