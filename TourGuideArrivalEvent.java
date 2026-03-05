// @author
public class TourGuideArrivalEvent extends Event {

  private VisitorCentre vc;
  private TourGuide guide;

  public TourGuideArrivalEvent(double time, VisitorCentre vc, TourGuide guide) {
    super(time);
    this.vc = vc;
    this.guide = guide;
  }


  @Override
  public String toString() {
    String str = super.getTime() + "00";
    str += String.format(" %s arrived at %s", this.guide, this.vc);
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
// @author
