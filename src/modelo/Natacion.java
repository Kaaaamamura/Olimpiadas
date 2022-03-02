/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.*;

/**
 *
 * @author Ingenieria
 */
public class Natacion extends Deportista {

    private double tiempo;
    private String genero;
    private ArrayList<Natacion> nadador = new ArrayList<>();

    public Natacion(double tiempo, String genero, String nombre, int edad, String pais) {
        super(nombre, edad, pais);
        this.tiempo = tiempo;
        this.genero = genero;
    }

    public Natacion() {
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void addDeportista(Natacion nadador) {
        nadador.addDeportista(nadador);
    }

    @Override
    public void tablaPosiciones() {
        for (int i = 0; i < nadador.size(); i++) {
          
            if (nadador.get(i).getTiempo()>nadador.get(i).getTiempo()) {
                
            }
        }
    }

}
