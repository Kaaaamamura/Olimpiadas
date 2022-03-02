/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import javax.swing.JOptionPane;
import modelo.*;

/**
 *
 * @author Ingenieria
 */
public class Vista {

    Natacion nadador = new Natacion();
    LevantamientoPesas pesas = new LevantamientoPesas();

    public void logo() {
        JOptionPane.showMessageDialog(null, """
                                            ****************************************
                                            **       Olimpiadas                               **
                                            **       Hecho por:                                 **
                                            **       Juan Pablo Sanchez               **
                                            **       Giancarlo Guevara                  **
                                            **       Kevin Vargas                          **
                                            ***************************************""");
    }

    public int menu() {
        int a = 0;
        a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una opcion"
                + "\n1. ingresar deportistas de natacion"
                + "\n2. Ingresar deportistas de levantamiento de pesas"
                + "\n3. mostrar tabla de posiciones en natacion"
                + "\n4. mostrar tabla de posiciones en levantamiento de pesas"
                + "\n5. Salir"));
        return a;
    }

    public void ingresarDeportistaNatacion() {

        Natacion auxN = new Natacion();
        auxN.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del deportista"));
        auxN.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad")));
        auxN.setPais(JOptionPane.showInputDialog("Ingrese el pais"));
        auxN.setGenero(JOptionPane.showInputDialog("Ingrese el genero del deportista"));
        auxN.setTiempo(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el tiempo")));
        nadador.addDeportista(auxN);

    }

    public void ingresarDeportistaPesas() {
        LevantamientoPesas auxP = new LevantamientoPesas();
        auxP.setNombre(JOptionPane.showInputDialog("Ingrese el nombre"));
        auxP.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad")));
        auxP.setPais(JOptionPane.showInputDialog("Ingrese el pais"));
        auxP.setPeso(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el peso")));
        pesas.addDeportista(auxP);
    }

    public void mostrarTablaPosiciones() {
        
    }

    public void terminar() {
        JOptionPane.showMessageDialog(null, "Gracias por usar el programa");
    }
}
