import static model.DBStone.AMETHYST;
import static model.DBStone.AQUAMARINE;
import static model.DBStone.BRILLIANT;
import static model.DBStone.EMERALD;
import static model.DBStone.GARNET;
import static model.DBStone.LAZURITE;
import static model.DBStone.RUBY;
import static model.DBStone.SAPPFIRE;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import model.entity.PreciousStone;
import model.entity.SemiPreciousStone;
import model.entity.Stone;
import model.service.StoneServiceImpl;
import org.junit.Assert;
import org.junit.Before;

public class StoneServiceImplTest {

  private StoneServiceImpl stoneService;
  private List<Stone> listStone;
  private Stone brilliant;
  private Stone sappfire;
  private Stone ruby;
  private Stone emerald;
  private Stone garnet;
  private Stone amethyst;
  private Stone aquamarine;
  private Stone lazurite;

  @Before
  public void init() {
    stoneService = new StoneServiceImpl();
    listStone = new ArrayList();
    brilliant = new PreciousStone(BRILLIANT.name(), BRILLIANT.price(), BRILLIANT.clarity(), BRILLIANT.weight(),
        BRILLIANT.cut());
    sappfire = new PreciousStone(SAPPFIRE.name(), SAPPFIRE.price(), SAPPFIRE.clarity(), SAPPFIRE.weight(),
        SAPPFIRE.cut());
    ruby = new PreciousStone(RUBY.name(), RUBY.price(), RUBY.clarity(), RUBY.weight(), RUBY.cut());
    emerald = new PreciousStone(EMERALD.name(), EMERALD.price(), EMERALD.clarity(), EMERALD.weight(), EMERALD.cut());
    garnet = new SemiPreciousStone(GARNET.name(), GARNET.price(), GARNET.clarity(), GARNET.color());
    amethyst = new SemiPreciousStone(AMETHYST.name(), AMETHYST.price(), AMETHYST.clarity(), AMETHYST.color());
    aquamarine = new SemiPreciousStone(AQUAMARINE.name(), AQUAMARINE.price(), AQUAMARINE.clarity(), AQUAMARINE.color());
    lazurite = new SemiPreciousStone(LAZURITE.name(), LAZURITE.price(), LAZURITE.clarity(), LAZURITE.color());
    listStone.add(brilliant);
    listStone.add(sappfire);
    listStone.add(ruby);
    listStone.add(emerald);
    listStone.add(garnet);
    listStone.add(amethyst);
    listStone.add(aquamarine);
    listStone.add(lazurite);
  }

  @org.junit.Test
  public void testCalculateWeightOfNecklace() {
    int actual = stoneService.calculateValueOfNecklace(listStone, "weight");
    int expected = 11;
    assertEquals(expected, actual);
  }

  @org.junit.Test
  public void testCalculatePriceOfNecklace() {
    int actual = stoneService.calculateValueOfNecklace(listStone, "price");
    int expected = 9084;
    assertEquals(expected, actual);
  }

  @org.junit.Test
  public void testcheckListsTrue() {
    List<Stone> listActual = new ArrayList<Stone>(stoneService.checkDiaposone(listStone));
    List<Stone> listExpected = new ArrayList<Stone>();
    listExpected.add(brilliant);
    listExpected.add(sappfire);
    listExpected.add(ruby);
    listExpected.add(emerald);
    listExpected.add(garnet);
    assertEquals(listExpected, listActual);
  }

  @org.junit.Test
  public void testcheckListsFalse() {
    List<Stone> listActual = new ArrayList<Stone>(stoneService.checkDiaposone(listStone));
    List<Stone> listExpected = new ArrayList<Stone>();
    listExpected.add(brilliant);
    listExpected.add(sappfire);
    listExpected.add(ruby);
    listExpected.add(emerald);
    listExpected.add(garnet);
    listExpected.add(lazurite);
    Assert.assertNotEquals(listExpected, listActual);
  }
}