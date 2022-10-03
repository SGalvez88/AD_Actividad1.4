
package actividad1.pkg4;

import classes.DatosPersonales;
import classes.DatosPublicos;
import classes.Persona;

public class Actividad14 {

    public static void main(String[] args) {
        Persona persona = creacionPersona();
        
        
        
    }
    
    public static Persona creacionPersona(){
        DatosPersonales datosPersonales = new DatosPersonales(1, "Galvez");
        DatosPublicos datosPublicos = new DatosPublicos("INF", 3500);
        
        Persona persona = new Persona(datosPersonales, datosPublicos);
        return persona;
    }
    
}
