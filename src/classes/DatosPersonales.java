
package classes;

public class DatosPersonales {
    
    private int id;
    private String apellido;           

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public DatosPersonales(int id, String apellido) {
        this.id = id;
        this.apellido = apellido;
    }
    
}
