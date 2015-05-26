package encapsulamiento;

public class Usuario {
    //Primer regla de encapsulamiento poner los atributos privados
    private String nombre; //private modificador de acceso estos atributos solo pueden ser vistos dentro de esta clase y no otra
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
