import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import view.View;

public class ViewTest {

  private View view;

  @Before
  public void init() {
    view = new View();
  }

  @Test
  public void concatenationString() {
    StringBuilder builder = new StringBuilder();
    String textname = "Vasyl";
    String textplay = "play";
    String textgame = "football yesterday";
    String actual = view.concatenationString(textname, textplay, textgame);
    String expected = builder.append(textname).append(textplay).append(textgame).toString();
    assertEquals(expected, actual);
  }
}