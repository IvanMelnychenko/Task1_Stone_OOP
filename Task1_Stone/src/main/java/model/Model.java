package model;

import model.entity.Necklace;
import model.service.StoneServiceImpl;

public class Model {
private StoneServiceImpl stoneService = new StoneServiceImpl();
private Necklace necklace = new Necklace();

  public StoneServiceImpl getStoneService() {
    return stoneService;
  }

  public void setStoneService(StoneServiceImpl stoneService) {
    this.stoneService = stoneService;
  }

  public Necklace getNecklace() {
    return necklace;
  }

  public void setNecklace(Necklace necklace) {
    this.necklace = necklace;
  }
}
