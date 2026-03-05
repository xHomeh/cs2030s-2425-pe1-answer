// @author// @author
public class VisitorAdmissionEvent extends Event {

  private VisitorCentre vc;
  private Visitor vis;
  private TourGuide guide;

  public VisitorAdmissionEvent(double time, VisitorCentre vc, Visitor vis, TourGuide guide) {
    super(time);
    this.vc = vc;
    this.vis = vis;
    this.guide = guide;
  }

  @Override
  public String toString() {
    String str = super.toString();
    str += String.format(" %s admitted %s", this.vis, this.vc);
    return str;
  }

  @Override
  public Event[] simulate() {
    Visitor vis = null;
    try {
      vis = vc.admitToAttraction();
      if (vis != null) {
        return new Event[] { new
          VisitorPickupEvent(super.getTime() + 0.1, this.vc, vis, this.guide) };
      } 
    } catch (AttractionFullException e) {
      return new Event[] { new AttractionFullEvent(super.getTime(), e) };
    }
    return new Event[] {};
  }

}

