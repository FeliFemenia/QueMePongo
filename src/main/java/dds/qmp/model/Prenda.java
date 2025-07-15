package dds.qmp.model;

import dds.qmp.model.exceptions.PrendaInvalidaException;

public class Prenda {

  public TipoDePrenda tipo;
  public Material material;
  public Color colorPrimario;
  public Color colorSecundario;

  public Prenda(TipoDePrenda tipo, Material material, Color colorPrimario, Color colorSecundario) {
    this.validarPrenda(tipo, material, colorPrimario);
    this.tipo = tipo;
    this.material = material;
    this.colorPrimario = colorPrimario;
    this.colorSecundario = colorSecundario;
  }

  public void validarPrenda(TipoDePrenda tipo, Material material, Color colorPrimario) {
    if (tipo == null) {
      throw new PrendaInvalidaException("Prenda sin tipo");
    }

    if (material == null) {
      throw new PrendaInvalidaException("Prenda sin material");
    }

    if (colorPrimario == null) {
      throw new PrendaInvalidaException("Prenda sin color primario");
    }
  }

  public Categoria getCategoria() {
    return tipo.getCategoria();
  }

  public Material getMaterial() {
    return material;
  }

  public Color getColorPrimario() {
    return colorPrimario;
  }

  public Color getColorSecundario() {
    return colorSecundario;
  }
}
