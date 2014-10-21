import java.util.*;

class SortedShapeDrawer extends ShapeDrawer {

  public void DrawShapes(Iterable<Shape> a_shapes) {
  
    LinkedList<Shape> sorted = new LinkedList<Shape>();
    
    for(Shape s : a_shapes) {
      sorted.add(s);
    }
    
    Collections.sort(sorted);
    
    super.DrawShapes(sorted);
  }

}