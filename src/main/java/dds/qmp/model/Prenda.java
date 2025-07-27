package dds.qmp.model;

import dds.qmp.model.exceptions.PrendaInvalidaException;

public class Prenda {

  public TipoDePrenda tipo;
  public Material material;
  public Color colorPrimario;
  public Color colorSecundario;
  public Trama trama;

  public Prenda(TipoDePrenda tipo, Material material, Color colorPrimario,
                Color colorSecundario, Trama trama) {
    this.tipo = tipo;
    this.material = material;
    this.colorPrimario = colorPrimario;
    this.colorSecundario = colorSecundario;
    this.trama = trama;
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

  public Trama getTrama() {
    return trama;
  }
}
