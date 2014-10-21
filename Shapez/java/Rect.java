class Rect implements Shape {

  public void Draw() {
    System.out.println("Rect");
  
  }
  
  public int compareTo(Shape a_shape) {
    CompareVisitor cv = new FromRectVisitor();
    a_shape.Visit(cv);
  
    return cv.GetSortInt();
  }
  
  public void Visit(CompareVisitor a_visitor) {
    a_visitor.VisitRect(this);
  }
}