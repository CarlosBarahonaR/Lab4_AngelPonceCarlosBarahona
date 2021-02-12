/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_angelponcecarlosbarahona;

/**
 *
 * @author Admin
 */
public class Tiradores extends Jugadores{
    
    private int tirodetres, tirodedos, manejodebalon; //todas del 1-100 VALIDAR

    public Tiradores(int tirodetres, int tirodedos, int manejodebalon, 
            String nombre, String apodo, String numcamiseta, String equipofutfav, String equipobalfav, 
            String jugfav, String mayorEdad, String nacimiento, int NumeroEstrellas) {
        super(nombre, apodo, numcamiseta, equipofutfav, equipobalfav, jugfav, mayorEdad, nacimiento, 
                NumeroEstrellas);
        this.tirodetres = tirodetres;
        this.tirodedos = tirodedos;
        this.manejodebalon = manejodebalon;
    }
    
    

    public int getTirodetres() {
        return tirodetres;
    }

    public void setTirodetres(int tirodetres) {
        this.tirodetres = tirodetres;
    }

    public int getTirodedos() {
        return tirodedos;
    }

    public void setTirodedos(int tirodedos) {
        this.tirodedos = tirodedos;
    }

    public int getManejodebalon() {
        return manejodebalon;
    }

    public void setManejodebalon(int manejodebalon) {
        this.manejodebalon = manejodebalon;
    }

    @Override
    public String toString() {
        return "Tiradores{" + "tirodetres=" + tirodetres + ", tirodedos=" + tirodedos + ", manejodebalon=" + manejodebalon + '}';
    }
    
    
    
    
}