interface Shape extends Comparable<Shape> {

  public void Draw();
  public void Visit(CompareVisitor a_visitor);
}