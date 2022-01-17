import DAO.SeguroDAO;
import Models.Seguro;
import Models.TipoSeguro;
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
                20, EnumSexo.Sexo.Hombre, Boolean.FALSE, 0, Timestamp.valueOf("2021-05-02 04:04:05"), TipoSeguro.Coche);


        Assertions.assertFalse(seguroDao.insertarSeguro(seguroExistente), "El seguro no existe, por lo que no salta falso.");

    }

    @Test
    @DisplayName("Buscar un seguro")
    public void buscarSeguro() {
        Seguro seguro = new Seguro(339, "test02", "Juan", "Pepe", "Aler",
                19, EnumSexo.Sexo.Mujer, true, 2, Timestamp.valueOf("2021-07-02 04:04:05"), TipoSeguro.Moto);
        Assertions.assertEquals(seguro, seguroDao.buscar(339), "El seguro debe de existir antes de ejecutar el test");

    }

    @Test
    @DisplayName("Eliminar un seguro")
    public void eliminarSeguro() {
        Seguro seguro = new Seguro(338, "test02", "Juan", "Pepe", "Aler",
                19, EnumSexo.Sexo.Mujer, true, 2, Timestamp.valueOf("2021-07-02 04:04:05"), TipoSeguro.Moto);
        seguroDao.insertarSeguro(seguro);
        seguroDao.eliminarSeguro(seguro);
        Seguro buscar = seguroDao.buscar(54);
        Assertions.assertNull(buscar, "El test no es nulo porque no se ha eliminado correctamente");

    }

    @Test
    @DisplayName("Actualizar un seguro")
    public void actualizarSeguro() {
        Seguro seguro = new Seguro(337, "test03", "Alberto", "Jeimenz", "Aler",
                19, EnumSexo.Sexo.Mujer, true, 2, Timestamp.valueOf("2021-07-02 04:04:05"), TipoSeguro.Moto);

        seguroDao.actualizarSeguro(seguro);
        Seguro buscar = seguroDao.buscar(seguro.getIdSeguro());
        Assertions.assertEquals(buscar,seguro,"No coincide.");

    }

    @Test
    @DisplayName("Comprobar si es mayor de edad")
    public void testMayorEdad () {
        Seguro buscar1 = seguroDao.buscar(777);
        Seguro buscar2 = seguroDao.buscar(778);
        Assertions.assertTrue(buscar1.isMayorEdad(),"Debe devolver true, ya que es mayor de edad");
        Assertions.assertFalse(buscar2.isMayorEdad(),"Debe devolver false, ya que es menor de edad");

    }
}
