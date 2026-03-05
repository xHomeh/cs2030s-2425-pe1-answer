// @author
public class VisitorQueue extends Queue<Visitor> implements Comparable<VisitorQueue> {

  private final int id;


  public VisitorQueue(int id, int size) {
    super(size);
    this.id = id;
  }

  @Override
  public boolean enq(Visitor vis) {
    if (vis.getTicketType() == this.id) {
      return super.enq(vis);
    }
    return false;
  }
  
  @Override
  public int compareTo(VisitorQueue que) {
    if (this.isEmpty()) {
      return -1;
    }
    
    if (que.isEmpty()) {
      return 1;
    }

    if (this.id < que.id) {
      return -1;
    } 

    if (que.id < this.id) {
      return 1;
    } 

    if (this.length() < que.length()) {
      return -1;
    }

    if (que.length() > this.length()) {
      return 1;
    }

    return -1;
  }

  @Override
  public String toString() {
    String str = String.format("Q%d %s", this.id, super.toString());
    return str;
  }

}
// @author
