// @author
public class VisitorArrivalEvent extends Event {

  private VisitorCentre vc;
  private Visitor vis;

  public VisitorArrivalEvent(double time, VisitorCentre vc, Visitor vis) {
    super(time);
    this.vc = vc;
    this.vis = vis;
  }


  @Override
  public String toString() {
    String str = super.toString();
    str += String.format(" %s arrived at %s", this.vis, this.vc);
    return str;
  }
  
  @Override
  public Event[] simulate() {
    VisitorCentre temp = this.vc.welcome(this.vis);
    return new Event[] {};
  }

}
// @author
