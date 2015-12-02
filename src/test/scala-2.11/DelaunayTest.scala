import org.scalatest.FlatSpec

/**
  * Created by cory on 12/2/15.
  */
class DelaunayTest extends FlatSpec {

  "An empty Set" should "have size 0" in {
    assert(Set.empty.size == 0)
  }

  "A delaunay triangulation of a set of points" should "have no point p inside the circumference of any triange" in {
    val vertices = Seq((0,0), (1,0), (0,1), (1,0), (0.5, 0.5))
    val delaunayTriangulation = DelaunayTriangulator.triangulate(vertices)
  }
}
