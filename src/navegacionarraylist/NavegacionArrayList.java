/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package navegacionarraylist;

import java.util.ArrayList;

/**
 * Navegación a traves de ArrayList
Requisitos de finalización
Parte 1: Ventana de navegación a través de un ArrayList
Desarrolla una aplicación en Java Swing que permita navegar por los elementos 
* almacenados en un ArrayList.

Requisitos:
Crea una clase llamada Persona con los siguientes atributos:
nombre (String)
edad (int)
email (String)
En la ventana principal (JFrame) deberán aparecer los siguientes componentes:

Campos de texto:
txtNombre
txtEdad
txtEmail
* 
Botones de navegación:
Primero
Anterior
Siguiente
Último
* 
Crea un ArrayList<Persona> con al menos 5 personas cargadas inicialmente.
Implementa la funcionalidad de los botones:
Primero: Muestra el primer elemento del ArrayList.
Anterior: Muestra el elemento anterior.
Siguiente: Muestra el elemento siguiente.
Último: Muestra el último elemento del ArrayList.
* 
Controla que:
No se pueda avanzar más allá del último elemento.
No se pueda retroceder antes del primero.
Al iniciar la aplicación, se muestre el primer elemento.
* 
* 
Parte 2: Añadir, editar y borrar elementos
Amplía la aplicación anterior para permitir gestionar el contenido del ArrayList.

Nuevos botones:
Añade los siguientes botones a la ventana:

Nuevo
Guardar
Editar
Borrar
* 
Funcionalidades a implementar:
Nuevo
    Limpia los campos de texto.
    Permite introducir los datos de una nueva persona.
    Prepara la aplicación para añadir un nuevo registro.
Guardar
    Añade la nueva persona al ArrayList.
    Muestra el nuevo elemento añadido.
    Actualiza la posición actual.
Editar
    Permite modificar los datos de la persona mostrada.
    Guarda los cambios en el ArrayList.
Borrar
    Elimina la persona actual del ArrayList.
    Tras borrar:
        Si quedan elementos, muestra el siguiente.
        Si se borra el último, muestra el anterior.
        Si no quedan elementos, limpia los campos.
Requisitos adicionales:
    Usa una variable int posicionActual para controlar la posición dentro del ArrayList.
    Implementa control de errores para:
    Campos vacíos.
    Edad no numérica (NumberFormatException).
    Intentar borrar cuando no hay elementos.
    Muestra mensajes informativos mediante JOptionPane cuando sea necesario.
    Mantén separada la clase Persona de la clase de la interfaz gráfica.
Última modificación: lunes, 23 de marzo de 2026, 10:00
Ir a...
 * @author e.fresco
 */
public class NavegacionArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList <Persona> personas = new ArrayList <> ();
        
        Persona p1 = new Persona ("Ana", 11, "ana11@a.com");
        personas.add(p1);
        Persona p2 = new Persona ("Bea", 22, "bea22@b.com");
        personas.add(p2);
        Persona p3 = new Persona ("Cea", 33, "cea33@c.com");
        personas.add(p3);
        Persona p4 = new Persona ("Dan", 44, "dan44@d.com");
        personas.add(p4);
        Persona p5 = new Persona ("Eric", 55, "eric55@e.com");
        personas.add(p5);
        
        Ventana v = new Ventana (personas);
        v.setVisible(true);
        
//        int contador = 0;
//        for (Persona p: personas){
//            System.out.println((contador + 1) + " de " + personas.size() + ". " + p);
//            contador ++;
//        }
        
    }
    
}
