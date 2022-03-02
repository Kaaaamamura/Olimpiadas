package modelo;

import java.util.*;

public class LevantamientoPesas extends Deportista {

    private int peso;
    private ArrayList<Deportista> levantaPesas = new ArrayList<>();

    public LevantamientoPesas(int peso, String nombre, int edad, String pais) {
        super(nombre, edad, pais);
        this.peso = peso;
    }

    public LevantamientoPesas() {
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void addDeportista(LevantamientoPesas Pesas) {
        levantaPesas.add(Pesas);
    }
    @Override
    public void tablaPosiciones(){
        for (int i = 0; i < levantaPesas.size(); i++) {
  
        }
    }
}
