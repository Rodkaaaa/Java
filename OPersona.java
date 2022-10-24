public class OPersona{
    private int id = 0;
    private String nombre = "";
    private String apellido = "";
    private String correo = "";
    
    public OPersona(){

    }
    public OPersona(int _id, String _nombre, String _apellido, String _correo){
        id = _id;
        nombre = _nombre;
        apellido = _apellido;
        correo = _correo;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
}