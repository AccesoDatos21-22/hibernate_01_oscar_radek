import DAO.SeguroDAO;
import Models.Seguro;
import Models.Sexo;
import Models.TipoSeguro;

import java.sql.Timestamp;
import java.sql.Date;

public class Main {
    public static void main(String[] args) {
        SeguroDAO seguroDAO = new SeguroDAO();
        seguroDAO.insertarSeguro(new Seguro("pruebaFecha", "radek", "lekston", "nadolski", 20, Sexo.Hombre, Boolean.FALSE, 0, Timestamp.valueOf("2021-12-02 04:04:05"), TipoSeguro.COCHE,Date.valueOf("2001-12-19")));
//        System.out.println(seguroDAO.buscar(1).toString());
//        seguroDAO.actualizarPSeguro(new Seguro(8,"prueba 2", "3", "3", "Strozzi3", 3, 3, "3", 13, new Timestamp(new Date().getTime()), "Super"));
    }
}
