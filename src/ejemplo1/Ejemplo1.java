/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo1;

/**
 *
 * @author byron.toledo
 */
public class Ejemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String cadenaDondeBuscar = "hola 1 @ como estas";
       StringBuffer cadenacompletar = new StringBuffer();
       String completa;
String loQueQuieroBuscar = "@ como estas";
String[] palabras = loQueQuieroBuscar.split("\\s+");
for (String palabra : palabras) {
    if (cadenaDondeBuscar.contains(palabra)) {
        System.out.println("Encontrado: "+ palabra);
        cadenacompletar.append(palabra+" ");
        //aquí tu lógica en caso que se haya encontrado...
    }
 }
    completa=cadenacompletar.toString();
    System.out.println(completa);
}
    
}
