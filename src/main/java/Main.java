import DAO.SeguroDAO;
import Models.Seguro;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        SeguroDAO seguroDAO = new SeguroDAO();
//        seguroDAO.insertarSeguro(new Seguro("prueba", "oscar", "Gonzalez", "Strozzi", 10, 0, "N", 0, new Timestamp(new Date().getTime()), "Epico"));
        System.out.println(seguroDAO.buscar(8).toString());
//        seguroDAO.actualizarPSeguro(new Seguro(8,"prueba 2", "3", "3", "Strozzi3", 3, 3, "3", 13, new Timestamp(new Date().getTime()), "Super"));
    }
}
