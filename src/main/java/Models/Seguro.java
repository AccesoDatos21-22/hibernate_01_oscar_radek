package Models;

import java.io.Serializable;
import java.sql.Time;
import java.sql.Timestamp;
import java.sql.Date;
import java.util.Arrays;
import java.util.Objects;


public class Seguro implements Serializable {
    private int idSeguro;
    private String nif;
    private String nombre;
    private String ape1;
    private String ape2;
    private Integer edad;
    private Sexo sexo;
    private Boolean casado;
    private Integer numHijos;
    private Timestamp fechaCreacion;
    private TipoSeguro tipoSeguro;
    private Boolean mayorEdad;
    private Date fechaNacimineto;
    private Time horaContacto;
    private char[] claves;
    private String comentarios;

    public Seguro(int idSeguro, String nif, String nombre, String ape1, String ape2, Integer edad, Sexo sexo, Boolean casado, Integer numHijos, Timestamp fechaCreacion, TipoSeguro tipoSeguro, Date fechaNacimineto, Time horaContacto, char[] claves, String comentarios) {
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
        this.mayorEdad = edad >= 18;
        this.fechaNacimineto=fechaNacimineto;
        this.horaContacto = horaContacto;
        this.claves = claves;
        this.comentarios = comentarios;
    }

    public Seguro(String nif, String nombre, String ape1, String ape2, Integer edad, Sexo sexo, Boolean casado, Integer numHijos, Timestamp fechaCreacion, TipoSeguro tipoSeguro, Date fechaNacimiento, Time horaContacto, char[] claves, String comentarios) {

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
        this.mayorEdad = edad >= 18;
        this.fechaNacimineto=fechaNacimiento;
        this.horaContacto = horaContacto;
        this.claves = claves;
        this.comentarios = comentarios;
    }

    public Seguro() {

    }

    public Boolean isMayorEdad() {
        return mayorEdad;
    }

    public void setMayorEdad(Boolean mayorEdad) {
        this.mayorEdad=edad >= 18;
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

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Boolean getCasado() {
        return casado;
    }

    public void setCasado(Boolean casado) {
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

    public TipoSeguro getTipoSeguro() {
        return tipoSeguro;
    }

    public void setTipoSeguro(TipoSeguro tipoSeguro) {
        this.tipoSeguro = tipoSeguro;
    }

    public Boolean getMayorEdad() {
        return mayorEdad;
    }

    public Date getFechaNacimineto() {
        return fechaNacimineto;
    }

    public void setFechaNacimineto(Date fechaNacimineto) {
        this.fechaNacimineto = fechaNacimineto;
    }

    public Time getHoraContacto() {
        return horaContacto;
    }

    public void setHoraContacto(Time horaContacto) {
        this.horaContacto = horaContacto;
    }

    public char[] getClaves() {
        return claves;
    }

    public void setClaves(char[] claves) {
        this.claves = claves;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
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
                ", casado=" + casado +
                ", numHijos=" + numHijos +
                ", fechaCreacion=" + fechaCreacion +
                ", tipoSeguro=" + tipoSeguro +
                ", mayorEdad=" + mayorEdad +
                ", fechaNacimineto=" + fechaNacimineto +
                ", horaContacto=" + horaContacto +
                ", claves=" + Arrays.toString(claves) +
                ", comentarios='" + comentarios + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Seguro seguro = (Seguro) o;
        return idSeguro == seguro.idSeguro && Objects.equals(nif, seguro.nif) && Objects.equals(nombre, seguro.nombre) && Objects.equals(ape1, seguro.ape1) && Objects.equals(ape2, seguro.ape2) && Objects.equals(edad, seguro.edad) && sexo == seguro.sexo && Objects.equals(casado, seguro.casado) && Objects.equals(numHijos, seguro.numHijos) && Objects.equals(fechaCreacion, seguro.fechaCreacion) && tipoSeguro == seguro.tipoSeguro && Objects.equals(mayorEdad, seguro.mayorEdad) && Objects.equals(fechaNacimineto, seguro.fechaNacimineto) && Objects.equals(horaContacto, seguro.horaContacto) && Arrays.equals(claves, seguro.claves) && Objects.equals(comentarios, seguro.comentarios);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(idSeguro, nif, nombre, ape1, ape2, edad, sexo, casado, numHijos, fechaCreacion, tipoSeguro, mayorEdad, fechaNacimineto, horaContacto, comentarios);
        result = 31 * result + Arrays.hashCode(claves);
        return result;
    }
}
