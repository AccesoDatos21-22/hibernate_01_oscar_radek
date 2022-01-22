import DAO.SeguroDAO;
import Models.Seguro;
import Models.Sexo;
import Models.TipoSeguro;

import java.sql.Time;
import java.sql.Timestamp;
import java.sql.Date;

public class Main {
    public static void main(String[] args) {
        SeguroDAO seguroDAO = new SeguroDAO();
        seguroDAO.insertarSeguro(new Seguro("pruebaComentario", "Comentarista", "de", "Futbol", 55
                , Sexo.Hombre, Boolean.FALSE, 0, Timestamp.valueOf("2021-12-02 04:04:05")
                , TipoSeguro.COCHE,Date.valueOf("1001-07-12"), Time.valueOf("12:05:30"), new char[]{'a','b','c'}, "Ejemplo Comentario 1"));
//        System.out.println(seguroDAO.buscar(1).toString());
//        seguroDAO.actualizarPSeguro(new Seguro(8,"prueba 2", "3", "3", "Strozzi3", 3, 3, "3", 13, new Timestamp(new Date().getTime()), "Super"));
    }
}
