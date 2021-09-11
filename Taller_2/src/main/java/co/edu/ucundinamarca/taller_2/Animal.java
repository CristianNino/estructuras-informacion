/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucundinamarca.taller_2;

import java.util.Objects;

public class Animal {
    
    private String nombre;
    private int patas;
    private String especie;
    private int edad;
    private int identificacion;

    public Animal(String nombre, int patas, String especie, int edad, int identificacion) {
        this.nombre = nombre;
        this.patas = patas;
        this.especie = especie;
        this.edad = edad;
        this.identificacion = identificacion;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.nombre);
        hash = 97 * hash + this.patas;
        hash = 97 * hash + Objects.hashCode(this.especie);
        hash = 97 * hash + this.edad;
        hash = 97 * hash + this.identificacion;
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
        final Animal other = (Animal) obj;
        if (this.patas != other.patas) {
            return false;
        }
        if (this.edad != other.edad) {
            return false;
        }
        if (this.identificacion != other.identificacion) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.especie, other.especie)) {
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

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    
}
