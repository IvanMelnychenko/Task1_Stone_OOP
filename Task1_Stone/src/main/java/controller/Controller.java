package controller;

import static java.lang.String.valueOf;

import java.util.Scanner;
import model.Model;
import view.TextValue;
import view.View;

public class Controller {

  private View view;
  private Model model;

  public Controller(View view, Model model) {
    this.view = view;
    this.model = model;
  }

  public void getUser() {
    checkInput();
    view.printStringInput(TextValue.STONE_BEFORE_SORTING);
    model.getNecklace().setListStone(model.getStoneService().createNecklace(model.getNecklace().getListStone()));
    view.printList(model.getNecklace().getListStone());
    model.getStoneService().sortingArrayByPrice(model.getNecklace().getListStone());
    view.printStringInput(TextValue.STONE_AFTER_SORTING);
    view.printList(model.getNecklace().getListStone());
    view.printMessage("");
    int weight = model.getStoneService().calculateValueOfNecklace(model.getNecklace().getListStone(), "weight");
    String textWeight = View.bundle.getString(TextValue.TOTAL_WEIGHT);
    view.printMessage(view.concatenationString(textWeight, " ",valueOf(weight)," ",View.bundle.getString(TextValue.CARATS)));
    view.printMessage("");
    int price = model.getStoneService().calculateValueOfNecklace(model.getNecklace().getListStone(), "price");
    String textPrice = View.bundle.getString(TextValue.TOTAL_PRICE);
    view.printMessage(view.concatenationString(textPrice,  " ",valueOf(price)," ",View.bundle.getString(TextValue.DOLLARS)));
    view.printMessage("");
    view.printStringInput(TextValue.STONE_CLARITY);
    view.printList(model.getStoneService().checkDiaposone(model.getNecklace().getListStone()));
  }

  public void checkInput() {
    Scanner sc = new Scanner(System.in);
    view.printMessage(TextValue.INPUT_ORDER_COUNTRY);
    String input;
    while (!(input = sc.nextLine()).matches(RegexConstant.INPUT_REGEX)) {
      view.printMessage(TextValue.INPUT_ORDER_COUNTRY);
    }
    view.checkCoutry(input);
  }
}
