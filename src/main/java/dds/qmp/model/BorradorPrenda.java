package dds.qmp.model;

import dds.qmp.model.exceptions.PrendaInvalidaException;

public class BorradorPrenda implements BuilderPrenda {
  private TipoDePrenda tipo;
  private Material material;
  private Color colorPrimario;
  private Color colorSecundario;
  private Trama trama = Trama.LISA;

  public BorradorPrenda(TipoDePrenda tipo) {
    if (tipo == null) {
      throw new PrendaInvalidaException("No puede existir una prenda sin tipo");
    }
    this.tipo = tipo;
  }

  @Override
  public void setMaterial(Material material) {
    if (material == null) {
      throw new PrendaInvalidaException("No puede existir una prenda sin material");
    }
    this.material = material;
  }

  @Override
  public void setColorPrimario(Color colorPrimario) {
    if (colorPrimario == null) {
      throw new PrendaInvalidaException("No puede existir una prenda sin colorPrimario");
    }
    this.colorPrimario = colorPrimario;
  }

  @Override
  public void setColorSecundario(Color colorSecundario) {
    this.colorSecundario = colorSecundario;
  }

  @Override
  public void setTrama(Trama trama) {
    if (trama == null) {
      this.trama = Trama.LISA;
    }
    this.trama = trama;
  }

  public void validarPrenda() {
    if (material == null) {
      throw new PrendaInvalidaException("No puede existir una prenda sin material");
    }
    if (colorPrimario == null) {
      throw new PrendaInvalidaException("No puede existir una prenda sin colorPrimario");
    }
  }

  public Prenda crearPrenda() {
    this.validarPrenda();
    return new Prenda(
        this.tipo,
        this.material,
        this.colorPrimario,
        this.colorSecundario,
        this.trama
    );
  }
}
