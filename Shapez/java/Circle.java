class Circle implements Shape {

  public void Draw() {
    System.out.println("Circle");
  
  }
  
  public int compareTo(Shape a_shape) {
    CompareVisitor cv = new FromCircleVisitor();
    a_shape.Visit(cv);
  
    return cv.GetSortInt();
  }
  
  public void Visit(CompareVisitor a_visitor) {
    a_visitor.VisitCircle(this);
  }
}