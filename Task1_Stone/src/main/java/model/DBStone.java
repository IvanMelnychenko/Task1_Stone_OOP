package model;

import java.awt.Color;

public enum DBStone {
  BRILLIANT(2310, 1, 3, "Caboshe"),
  SAPPFIRE(1000, 3, 2, "Circle"),
  RUBY(512, 2, 1, "Ellipse"),
  EMERALD(4030, 1, 5, "Octagon"),
  GARNET(310, 3, Color.WHITE),
  AMETHYST(220, 7, Color.PINK),
  AQUAMARINE(280, 8, Color.YELLOW),
  LAZURITE(422, 5, Color.CYAN);
  private int price; // in dollars
  private int clarity; // in standart units
  private int weight; // in carats
  private String cut; // shape of preciousStone
  private Color color;

  DBStone(int price, int clarity, Color color) {
    this.price = price;
    this.clarity = clarity;
    this.color = color;
  }

  DBStone(int price, int clarity, int weight, String cut) {
    this.price = price;
    this.clarity = clarity;
    this.weight = weight;
    this.cut = cut;
  }

  public int price() {
    return price;
  }

  public int clarity() {
    return clarity;
  }

  public int weight() {
    return weight;
  }

  public String cut() {
    return cut;
  }

  public Color color() {
    return color;
  }
}