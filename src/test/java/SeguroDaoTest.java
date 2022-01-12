import DAO.SeguroDAO;
import Models.Seguro;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.sql.Timestamp;

public class SeguroDaoTest {
    private static SeguroDAO seguroDao;

    @BeforeAll
    public static void setup() {
        seguroDao = new SeguroDAO();
    }

    @Test
    @DisplayName("Introduir nuevo seguro")
    public void introducirSeguro() {
        Seguro seguroExistente = new Seguro("test01", "oscar", "gonzalez", "Strozzi",
                20, 0, "N", 0, Timestamp.valueOf("2021-05-02 04:04:05"), "Epic");


        Assertions.assertFalse(seguroDao.insertarSeguro(seguroExistente), "El seguro no existe, por lo que no salta falso.");

    }

    @Test
    @DisplayName("Buscar un seguro")
    public void buscarSeguro() {
        Seguro seguro = new Seguro(339, "test02", "Juan", "Pepe", "Aler",
                19, 1, "S", 2, Timestamp.valueOf("2021-07-02 04:04:05"), "No-epic");
        Assertions.assertEquals(seguro, seguroDao.buscar(339), "El seguro debe de existir antes de ejecutar el test");

    }

    @Test
    @DisplayName("Eliminar un seguro")
    public void eliminarSeguro() {
        Seguro seguro = new Seguro(338, "test02", "Juan", "Pepe", "Aler",
                19, 1, "S", 2, Timestamp.valueOf("2021-07-02 04:04:05"), "No-epic");
        seguroDao.insertarSeguro(seguro);
        seguroDao.eliminarSeguro(seguro);
        Seguro buscar = seguroDao.buscar(54);
        Assertions.assertNull(buscar, "El test no es nulo porque no se ha eliminado correctamente");

    }

    @Test
    @DisplayName("Actualizar un seguro")
    public void actualizarSeguro() {
        Seguro seguro = new Seguro(337, "test03", "Alberto", "Jeimenz", "Aler",
                19, 1, "S", 2, Timestamp.valueOf("2021-07-02 04:04:05"), "No-epic");

        seguroDao.actualizarSeguro(seguro);
        Seguro buscar = seguroDao.buscar(seguro.getIdSeguro());
        Assertions.assertEquals(buscar,seguro,"No coincide.");

    }
}
