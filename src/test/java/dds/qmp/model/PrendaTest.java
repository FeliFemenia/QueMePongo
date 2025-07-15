package dds.qmp.model;

import dds.qmp.model.exceptions.PrendaInvalidaException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class PrendaTest {

  @Test
  @DisplayName("Se puede crear una prenda valida")
  public void CreoPrendaValida() {
    Assertions.assertDoesNotThrow(() -> new Prenda(TipoDePrenda.CAMISA, Material.ALGODON, new Color(255,0,0), null));
  }

  @Test
  @DisplayName("Arroja excepcion cuando la prenda es invalida")
  public void CreoPrendaInvalida() {
    Assertions.assertThrows(PrendaInvalidaException.class, () -> new Prenda(TipoDePrenda.CAMISA, Material.ALGODON, null, null));
  }

  @Test
  @DisplayName("Prenda de tipo Camisa es de categoria Parte Superior")
  public void CamisaConCategoriaParteSuperior() {
    Prenda prenda = new Prenda(TipoDePrenda.CAMISA, Material.ALGODON, new Color(255,0,0), null);

    Assertions.assertEquals(Categoria.PARTE_SUPERIOR, prenda.getCategoria());
  }
}
