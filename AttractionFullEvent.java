// @author
public class AttractionFullEvent extends Event {
 
  AttractionFullException e;

  public AttractionFullEvent(double time, AttractionFullException e) {
    super(time + 0.1);
    this.e = e;
  }

  @Override
  public String toString() {
    String str = super.toString();
    str += String.format(" %s", e.getMessage());
    return str;
  }

  @Override
  public Event[] simulate() {
    return new Event[] {};
  }
}
// @author
