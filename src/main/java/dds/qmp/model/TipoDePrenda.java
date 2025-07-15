package dds.qmp.model;

public enum TipoDePrenda {
  CAMISA(Categoria.PARTE_SUPERIOR),
  PANTALON(Categoria.PARTE_INFERIOR),
  REMERA(Categoria.PARTE_SUPERIOR),
  ZAPATO(Categoria.CALZADO);

  public final Categoria categoria;

  TipoDePrenda(Categoria categoria) {
    this.categoria = categoria;
  }

  public Categoria getCategoria() {
    return this.categoria;
  }
}
