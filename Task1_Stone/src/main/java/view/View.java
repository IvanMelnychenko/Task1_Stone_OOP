package view;

import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import model.entity.Stone;

public class View {

  static String MESSAGES_BUNDLE_NAME = "messages";
  public static ResourceBundle bundle;

  public void printMessage(String message) {
    System.out.println(message);
  }

  public void checkCoutry(String text) {
    if (text.equals("ua")) {
      bundle = ResourceBundle.getBundle(
          MESSAGES_BUNDLE_NAME,
          new Locale("ua", "UA"));
    } else {
      bundle = ResourceBundle.getBundle(
          MESSAGES_BUNDLE_NAME,
          new Locale("en", "US"));
    }
  }

  public void printList(List<Stone> list) {
    for (Stone stone : list) {
      System.out.println(stone);
    }
  }

  public String concatenationString(String... message) {
    StringBuilder concatString = new StringBuilder();
    for (String v : message) {
      concatString = concatString.append(v);
    }
    return new String(concatString);
  }

  public void printStringInput(String message) {
    System.out.println(bundle.getString(message));
  }
}


