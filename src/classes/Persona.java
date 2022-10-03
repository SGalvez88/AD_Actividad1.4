
package classes;

public class Persona {
    private DatosPersonales datosPersonales;
    private DatosPublicos datosPublicos;

    public Persona(DatosPersonales datosPersonales, DatosPublicos datosPublicos) {
        this.datosPersonales = datosPersonales;
        this.datosPublicos = datosPublicos;
    }

    public DatosPersonales getDatosPersonales() {
        return datosPersonales;
    }

    public void setDatosPersonales(DatosPersonales datosPersonales) {
        this.datosPersonales = datosPersonales;
    }

    public DatosPublicos getDatosPublicos() {
        return datosPublicos;
    }

    public void setDatosPublicos(DatosPublicos datosPublicos) {
        this.datosPublicos = datosPublicos;
    }
    
}
