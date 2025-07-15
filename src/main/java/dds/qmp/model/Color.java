package dds.qmp.model;

public class Color {
  Integer rojo;
  Integer verde;
  Integer azul;

  public Color(Integer rojo, Integer verde, Integer azul) {
    this.rojo = rojo;
    this.verde = verde;
    this.azul = azul;
  }

  public Integer getRojo() {
    return rojo;
  }

  public Integer getVerde() {
    return verde;
  }

  public Integer getAzul() {
    return azul;
  }
}
