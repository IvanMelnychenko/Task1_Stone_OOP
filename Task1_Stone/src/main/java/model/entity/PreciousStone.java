package model.entity;

public class PreciousStone extends Stone {

  private int weight;
  private String cut;

  public PreciousStone(String name, int price, int clarity, int weight, String cut) {
    super(name, price, clarity);
    this.weight = weight;
    this.cut = cut;
  }

  public int getWeight() {
    return weight;
  }

  @Override
  public String toString() {
    return "PreciousStone[" +
        "name = " + getName() + ", " + "price = " + getPrice() + ", " + "clarity = " + getClarity() + ", "
        + " weight = " + weight
        + ", " + " cut = " + cut +
        "]";
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }

  public String getCut() {
    return cut;
  }

  public void setCut(String cut) {
    this.cut = cut;
  }
}