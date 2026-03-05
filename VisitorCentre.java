// @author

public class VisitorCentre {

  private Seq<VisitorQueue> seq;
  private int maxVis;
  private int size;
  private int currVis = 0;

  public static final int EXPRESS = 2;
  public static final int REGULAR = 1;
  public static final int WALKIN = 0;


  public VisitorCentre(int size, int maxVis) {
    Seq<VisitorQueue> temp = new Seq<VisitorQueue>(3);
    this.size = size;
    this.maxVis = maxVis;
    
    for (int i = 0; i < 3; i++) {
      VisitorQueue que = new VisitorQueue(i, size);
      temp.set(i, que);
    }

    this.seq = temp;
  }

  public VisitorCentre welcome(Visitor vis) {
    int ticketType = vis.getTicketType();
    VisitorQueue que = seq.get(ticketType);
    que.enq(vis);
    return this;
  }

  public Visitor admitToAttraction() throws AttractionFullException {
    if (this.currVis >= maxVis) {
      throw new AttractionFullException(this.maxVis);
    }

    for (int i = 2; i >= 0; i--) {
      VisitorQueue que = this.seq.get(i);
      if (que.isEmpty()) {
        continue;
      }
      this.currVis++;
      return que.deq();
    }
    return null;
  }


  @Override
  public String toString() {
    String str = String.format("VC: %s", this.seq);
    return str;
  }



}
// @author
