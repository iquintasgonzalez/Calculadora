/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora2;

/**
 *
 * @author rzarzafernandez
 */
import javax.swing.JOptionPane;

public class Calculadora2 {
    
    public static void main(String[] args) {
        Modelo mod = new Modelo();
        Vista vis = new Vista();
        Logica log = new Logica();
        vis.introducir(mod);
        log.realizaOperacion(mod);
        vis.imprimir(mod);
        
    }
    
}