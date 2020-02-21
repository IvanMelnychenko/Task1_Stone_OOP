package model.service;

import java.util.List;
import model.entity.Stone;

public interface Service {

  List<Stone> createNecklace();

  List<Stone> sortingArrayByPrice(List<Stone> list);

  int calculateValueOfNecklace(List<Stone> list,String text);

  List<Stone> checkDiaposone(List<Stone> list);

}
