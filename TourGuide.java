// @author
public class TourGuide {

  private final int id;

  public TourGuide(int id) {
    this.id = id;
  }

  @Override
  public String toString() {
    String str = String.format("TG%d", this.id);
    return str;
  }
}
