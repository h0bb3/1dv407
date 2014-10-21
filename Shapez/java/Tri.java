class Tri implements Shape {

  public void Draw() {
    System.out.println("Tri");
  
  }
  
  public int compareTo(Shape a_shape) {
    CompareVisitor cv = new FromTriangleVisitor();
    a_shape.Visit(cv);
  
    return cv.GetSortInt();
  }
  
  public void Visit(CompareVisitor a_visitor) {
    a_visitor.VisitTri(this);
  }
}