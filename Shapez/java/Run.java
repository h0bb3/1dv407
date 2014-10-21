import java.util.*;

public class Run {

  public static void main(String a_args[]) {
  
    ShapeDrawer d = new SortedShapeDrawer();
    LinkedList<Shape> l = new LinkedList<Shape>();
    l.add(new Rect());
    l.add(new Circle());
    l.add(new Tri());
    l.add(new Rect());
    l.add(new Circle());
    l.add(new Tri());
    l.add(new Rect());
    l.add(new Circle());
    l.add(new Tri());
    
    d.DrawShapes(l);
  
  }
}