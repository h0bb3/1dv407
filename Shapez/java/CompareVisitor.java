interface CompareVisitor {

  public int GetSortInt();
  
  public void VisitTri(Tri a_tri);
  public void VisitCircle(Circle a_tri);
  public void VisitRect(Rect a_tri);

}