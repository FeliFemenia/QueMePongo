package dds.qmp.model;

import dds.qmp.model.exceptions.PrendaInvalidaException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class PrendaTest {

  @Test
  @DisplayName("Se puede crear una prenda valida")
  public void CreoPrendaValida() {
    BorradorPrenda prenda = new BorradorPrenda(TipoDePrenda.CAMISA);
    prenda.setMaterial(Material.ALGODON);
    prenda.setColorPrimario(new Color(255,0,0));
    Assertions.assertDoesNotThrow(prenda::crearPrenda);
  }

  @Test
  @DisplayName("Arroja excepcion cuando la prenda es invalida")
  public void CreoPrendaInvalida() {
    BorradorPrenda prenda = new BorradorPrenda(TipoDePrenda.CAMISA);
    Assertions.assertThrows(PrendaInvalidaException.class, prenda::crearPrenda);
  }

  @Test
  @DisplayName("Prenda de tipo Camisa es de categoria Parte Superior")
  public void CamisaConCategoriaParteSuperior() {
    BorradorPrenda borradorPrenda = new BorradorPrenda(TipoDePrenda.CAMISA);
    borradorPrenda.setMaterial(Material.ALGODON);
    borradorPrenda.setColorPrimario(new Color(255,0,0));

    Prenda prenda = borradorPrenda.crearPrenda();
    Assertions.assertEquals(Categoria.PARTE_SUPERIOR, prenda.getCategoria());
  }
}
