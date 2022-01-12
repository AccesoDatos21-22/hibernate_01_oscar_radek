import DAO.SeguroDAO;
import Models.Seguro;
import org.junit.jupiter.api.*;

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
        Assertions.assertEquals(seguro,seguroDao.buscar(339), "El seguro debe de existir antes de ejecutar el test");

    }
}
