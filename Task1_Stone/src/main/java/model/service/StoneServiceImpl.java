package model.service;

import static model.DBStone.AMETHYST;
import static model.DBStone.AQUAMARINE;
import static model.DBStone.BRILLIANT;
import static model.DBStone.EMERALD;
import static model.DBStone.GARNET;
import static model.DBStone.LAZURITE;
import static model.DBStone.RUBY;
import static model.DBStone.SAPPFIRE;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import model.entity.PreciousStone;
import model.entity.SemiPreciousStone;
import model.entity.Stone;

public class StoneServiceImpl implements Service {

  private int diapLower = 1;
  private int diapHigher = 3;

  public List<Stone> createNecklace(List<Stone> list) {
    list = new ArrayList();
    list.add(new PreciousStone(BRILLIANT.name(), BRILLIANT.price(), BRILLIANT.clarity(), BRILLIANT.weight(),
        BRILLIANT.cut()));
    list.add(
        new PreciousStone(SAPPFIRE.name(), SAPPFIRE.price(), SAPPFIRE.clarity(), SAPPFIRE.weight(), SAPPFIRE.cut()));
    list.add(
        new PreciousStone(RUBY.name(), RUBY.price(), RUBY.clarity(), RUBY.weight(), RUBY.cut()));
    list.add(new PreciousStone(EMERALD.name(), EMERALD.price(), EMERALD.clarity(), EMERALD.weight(), EMERALD.cut()));
    list.add(new SemiPreciousStone(GARNET.name(), GARNET.price(), GARNET.clarity(), GARNET.color()));
    list.add(new SemiPreciousStone(AMETHYST.name(), AMETHYST.price(), AMETHYST.clarity(), AMETHYST.color()));
    list.add(new SemiPreciousStone(AQUAMARINE.name(), AQUAMARINE.price(), AQUAMARINE.clarity(), AQUAMARINE.color()));
    list.add(new SemiPreciousStone(LAZURITE.name(), LAZURITE.price(), LAZURITE.clarity(), LAZURITE.color()));
    return list;
  }

  public List<Stone> sortingArrayByPrice(List<Stone> list) {
    Collections.sort(list);
    return list;
  }

  public int calculateValueOfNecklace(List<Stone> list, String text) {
    int total = 0;
    for (Stone stone : list) {
      if (text.equals("weight")) {
        total += stone.getWeight();
      } else if (text.equals("price")) {
        total += stone.getPrice();
      } else {
        total = -1;
      }
    }
    return total;
  }

  public List<Stone> checkDiaposone(List<Stone> list) {
    List<Stone> listCheckedStone = new ArrayList<Stone>();
    for (Stone stone : list) {
      if (stone.getClarity() >= diapLower && stone.getClarity() <= diapHigher) {
        listCheckedStone.add(stone);
      }
    }
    return listCheckedStone;
  }

  public int getDiapLower() {
    return diapLower;
  }

  public void setDiapLower(int diapLower) {
    this.diapLower = diapLower;
  }

  public int getDiapHigher() {
    return diapHigher;
  }

  public void setDiapHigher(int diapHigher) {
    this.diapHigher = diapHigher;
  }
}
