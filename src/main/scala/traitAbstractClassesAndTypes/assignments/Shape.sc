abstract class Shape {
  def circumference: Double
  def area: Double
}

case class Rectangle(width: Double, height: Double) extends Shape {
  override def circumference: Double = width + height * 2

  override def area: Double = width * height
}

case class Circle(radius: Double) extends Shape {
  override def circumference: Double = 2 * Math.PI * radius

  override def area: Double = Math.PI * radius * radius
}