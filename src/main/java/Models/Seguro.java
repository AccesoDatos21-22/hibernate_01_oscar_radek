package Models;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

public class Seguro implements Serializable {
    private int idSeguro;
    private String nif;
    private String nombre;
    private String ape1;
    private String ape2;
    private Integer edad;
    private Integer sexo;
    private String casado;
    private Integer numHijos;
    private Timestamp fechaCreacion;
    private String tipoSeguro;

    public Seguro(int idSeguro, String nif, String nombre, String ape1, String ape2, Integer edad, Integer sexo, String casado, Integer numHijos, Timestamp fechaCreacion, String tipoSeguro) {
        this.idSeguro = idSeguro;
        this.nif = nif;
        this.nombre = nombre;
        this.ape1 = ape1;
        this.ape2 = ape2;
        this.edad = edad;
        this.sexo = sexo;
        this.casado = casado;
        this.numHijos = numHijos;
        this.fechaCreacion = fechaCreacion;
        this.tipoSeguro = tipoSeguro;
    }

    public Seguro(String nif, String nombre, String ape1, String ape2, Integer edad, Integer sexo, String casado, Integer numHijos, Timestamp fechaCreacion, String tipoSeguro) {
        this.nif = nif;
        this.nombre = nombre;
        this.ape1 = ape1;
        this.ape2 = ape2;
        this.edad = edad;
        this.sexo = sexo;
        this.casado = casado;
        this.numHijos = numHijos;
        this.fechaCreacion = fechaCreacion;
        this.tipoSeguro = tipoSeguro;
    }

    public Seguro() {

    }

    public int getIdSeguro() {
        return idSeguro;
    }

    public void setIdSeguro(int idSeguro) {
        this.idSeguro = idSeguro;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApe1() {
        return ape1;
    }

    public void setApe1(String ape1) {
        this.ape1 = ape1;
    }

    public String getApe2() {
        return ape2;
    }

    public void setApe2(String ape2) {
        this.ape2 = ape2;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getSexo() {
        return sexo;
    }

    public void setSexo(Integer sexo) {
        this.sexo = sexo;
    }

    public String getCasado() {
        return casado;
    }

    public void setCasado(String casado) {
        this.casado = casado;
    }

    public Integer getNumHijos() {
        return numHijos;
    }

    public void setNumHijos(Integer numHijos) {
        this.numHijos = numHijos;
    }

    public Timestamp getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Timestamp fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getTipoSeguro() {
        return tipoSeguro;
    }

    public void setTipoSeguro(String tipoSeguro) {
        this.tipoSeguro = tipoSeguro;
    }

    @Override
    public String toString() {
        return "Seguro{" +
                "idSeguro=" + idSeguro +
                ", nif='" + nif + '\'' +
                ", nombre='" + nombre + '\'' +
                ", ape1='" + ape1 + '\'' +
                ", ape2='" + ape2 + '\'' +
                ", edad=" + edad +
                ", sexo=" + sexo +
                ", casado='" + casado + '\'' +
                ", numHijos=" + numHijos +
                ", fechaCreacion=" + fechaCreacion +
                ", tipoSeguro='" + tipoSeguro + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Seguro seguro = (Seguro) o;
        return idSeguro == seguro.idSeguro && Objects.equals(nif, seguro.nif) && Objects.equals(nombre, seguro.nombre) && Objects.equals(ape1, seguro.ape1) && Objects.equals(ape2, seguro.ape2) && Objects.equals(edad, seguro.edad) && Objects.equals(sexo, seguro.sexo) && Objects.equals(casado, seguro.casado) && Objects.equals(numHijos, seguro.numHijos) && Objects.equals(fechaCreacion, seguro.fechaCreacion) && Objects.equals(tipoSeguro, seguro.tipoSeguro);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idSeguro, nif, nombre, ape1, ape2, edad, sexo, casado, numHijos, fechaCreacion, tipoSeguro);
    }
}
