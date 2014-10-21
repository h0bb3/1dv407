class ShapeDrawer {


  public void DrawShapes(Iterable<Shape> a_shapes) {
  
    for (Shape s : a_shapes) {
      s.Draw();
    }
  }
}