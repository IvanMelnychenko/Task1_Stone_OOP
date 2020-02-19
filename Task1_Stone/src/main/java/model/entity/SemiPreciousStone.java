package model.entity;

import java.awt.Color;

public class SemiPreciousStone extends Stone {

  private Color color;

  public SemiPreciousStone(String name, int price, int clarity, Color color) {
    super(name, price, clarity);
    this.color = color;
  }

  @Override
  public String toString() {
    return "SemiPreciousStone[" +
        "name = " + getName() + ", " + " price = " + getPrice() + ", " + " clarity = " + getClarity() +
        "]";
  }

  public int getWeight() {
    return 0;
  }
}
