// @author
public class VisitorPickupEvent extends Event {

  private VisitorCentre vc;
  private Visitor vis;
  private TourGuide guide;

  public VisitorPickupEvent(double time, VisitorCentre vc, Visitor vis, TourGuide guide) {
    super(time);
    this.vc = vc;
    this.vis = vis;
    this.guide = guide;
  }

  @Override
  public String toString() {
    String str = super.toString();
    str += String.format(" %s picked up %s at %s", this.guide, this.vis, this.vc);
    return str;
  }

  @Override
  public Event[] simulate() {
    double timetaken = 0.2;
    if (vis.getTicketType() == 0) {
      timetaken = 0.4;
    }
    return new Event[] { new VisitorAdmissionEvent(super.getTime() + timetaken, this.vc, this.vis, this.guide) };
  }

}
// @author
