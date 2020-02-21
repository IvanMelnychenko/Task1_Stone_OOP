package controller;

import static java.lang.String.valueOf;

import java.util.Scanner;
import model.Model;
import view.TextValue;
import view.View;

/**
 * Check and connect processes in programme
 *
 * @author Ivan
 * @version 1.0
 */
public class Controller {

  /**
   * Field view
   */
  private View view;
  /**
   * Field model
   */
  private Model model;

  /**
   * Constructor, using for creating new object this class
   *
   * @param view - view
   * @param model - model
   */
  public Controller(View view, Model model) {
    this.view = view;
    this.model = model;
  }

  /**
   * Connecting final method for user
   */
  public void getUser() {
    checkInput();
    getUnSortingListStone();
    getSortingListStone();
    getWeightOfNecklace();
    getPriceOfNecklace();
    getStoneAfterCheckDiap();
  }

  /**
   * Calling function createNecklace from model. In result this function: text create necklace and unsorted list stone
   */
  public void getUnSortingListStone() {
    view.printStringInput(TextValue.STONE_BEFORE_SORTING);
    model.getNecklace().setListStone(model.getStoneService().createNecklace());
    view.printList(model.getNecklace().getListStone());
    view.printMessage("");
  }

  /**
   * Calling function sortingArrayByPrice in model. In result this function: text Necklace sorted and sorted list stone
   */
  public void getSortingListStone() {
    view.printStringInput(TextValue.STONE_AFTER_SORTING);
    model.getStoneService().sortingArrayByPrice(model.getNecklace().getListStone());
    view.printList(model.getNecklace().getListStone());
    view.printMessage("");
  }

  /**
   * Calling function calculateValueOfNecklace from model. In result this function: text weight of necklace and weight
   */
  public void getWeightOfNecklace() {
    int weight = model.getStoneService().calculateValueOfNecklace(model.getNecklace().getListStone(), "weight");
    String textWeight = View.bundle.getString(TextValue.TOTAL_WEIGHT);
    view.printMessage(
        view.concatenationString(textWeight, " ", valueOf(weight), " ", View.bundle.getString(TextValue.CARATS)));
    view.printMessage("");
  }

  /**
   * Calling function calculateValueOfNecklace from model. In result this function: text price of necklace and price
   */

  public void getPriceOfNecklace() {
    int price = model.getStoneService().calculateValueOfNecklace(model.getNecklace().getListStone(), "price");
    String textPrice = View.bundle.getString(TextValue.TOTAL_PRICE);
    view.printMessage(
        view.concatenationString(textPrice, " ", valueOf(price), " ", View.bundle.getString(TextValue.DOLLARS)));
    view.printMessage("");
  }

  /**
   * Calling function checkDiaposone from model. In result this function: list of Stone where clarity is in [1,3]
   */
  public void getStoneAfterCheckDiap() {
    view.printStringInput(TextValue.STONE_CLARITY);
    view.printList(model.getStoneService().checkDiaposone(model.getNecklace().getListStone()));
  }

  /**
   * Check input value, which expected [en] or [ua] and calling function checkCoutry in view
   */
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
