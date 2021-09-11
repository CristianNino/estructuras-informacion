
package co.edu.ucundinamarca.taller_2;

import java.util.Objects;


public class persona {
    
    private String nombre;
    private int edad;
    private int altura;
    private int identificacion;

    public persona(String nombre, int edad, int altura, int identificacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.identificacion = identificacion;
    }

    
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.nombre);
        hash = 71 * hash + this.edad;
        hash = 71 * hash + this.altura;
        hash = 71 * hash + this.identificacion;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final persona other = (persona) obj;
        if (this.edad != other.edad) {
            return false;
        }
        if (this.altura != other.altura) {
            return false;
        }
        if (this.identificacion != other.identificacion) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

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

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }
    
    
    
}
