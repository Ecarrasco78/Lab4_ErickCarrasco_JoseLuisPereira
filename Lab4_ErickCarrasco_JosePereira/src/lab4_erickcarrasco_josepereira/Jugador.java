
package lab4_erickcarrasco_josepereira;

// cada jugador posee un nombre, nombre de usuario, puntos
//actuales (al inicio será 0), Lugar de nacimiento, edad, sexo.
public class Jugador {
    private String nombre;
    private String usuario;
    private int puntos;
    private String nacimiento;
    private int edad;
    private String sexo;

    public Jugador(String nombre, String usuario, int puntos, String nacimiento, int edad, String sexo) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.puntos = 0;
        this.nacimiento = nacimiento;
        this.edad = edad;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", usuario=" + usuario + ", puntos=" + puntos + ", nacimiento=" + nacimiento + ", edad=" + edad + ", sexo=" + sexo + '}';
    }
    
    
    
}
