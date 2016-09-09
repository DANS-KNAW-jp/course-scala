case class Foo[A,B](S => [A,B])
case class Point(x: Int, y:Int) {

  def distanceTo(p: Point) = Math.sqrt(Math.pow(x - p.x,2)+Math.pow(y - p.y,2))
  override def toString = s"(x=$x,y=$y)"
}
//object Point {
//  def apply (x: Int, y:Int) = new Point(x,y)
//}

object Origin extends Point(0,0)
new Point(1,2).equals(new Point(1,2))
Origin.equals(Origin)
Point(1,2).distanceTo(Point(1,4))
