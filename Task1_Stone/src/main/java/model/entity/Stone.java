package model.entity;

public abstract class Stone implements Comparable<Stone> {

  private String name;
  private int price;
  private int clarity;

  public Stone(String name, int price, int clarity) {
    this.name = name;
    this.price = price;
    this.clarity = clarity;
  }

  public int getClarity() {
    return clarity;
  }

  public void setClarity(int clarity) {
    this.clarity = clarity;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public abstract int getWeight();

  @Override
  public abstract String toString() ;

  public int compareTo(Stone otherStone) {
    return otherStone.getPrice() - this.getPrice();
  }
}
