package objects;

public class Usuario {

    int idUsuario;
    String nombre;
    String alias;
    String telefono;

   public Usuario(int idUsuario, String nombre, String alias, String telefono) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.alias = alias;
        this.telefono = telefono;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAlias() {
        return alias;
    }

    public String getTelefono() {
        return telefono;
    }
}
