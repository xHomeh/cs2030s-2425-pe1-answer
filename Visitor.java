// @author
public class Visitor {

  private final int id;
  private static int counter = 1000;
  private int type;

  public Visitor(int type) {
    this.id = counter;
    counter++;
    this.type = type;
  }

  public int getTicketType() {
    return this.type;
  }

  @Override
  public String toString() {
    String str = String.format("V%d", this.id);
    return str;
  }


}

