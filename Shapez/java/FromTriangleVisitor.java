class FromTriangleVisitor implements CompareVisitor {
  private int m_sort;

  public int GetSortInt() {
    return m_sort;
  }
  
  public void VisitTri(Tri a_tri) {
    m_sort = 0;
  }
  
  public void VisitCircle(Circle a_tri) {
    m_sort = 1;
  }
  
  public void VisitRect(Rect a_tri) {
    m_sort = 1;
  }

}