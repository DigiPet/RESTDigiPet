package com.digipet.prototype.orm;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ROL", schema = "digipet")
public class RolEntity {
    private int idRol;
    private String nombre;

    @Id
    @Column(name = "Id_rol", nullable = false)
    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    @Basic
    @Column(name = "Nombre", nullable = false, length = 20)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RolEntity rolEntity = (RolEntity) o;
        return idRol == rolEntity.idRol &&
                Objects.equals(nombre, rolEntity.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idRol, nombre);
    }
}
