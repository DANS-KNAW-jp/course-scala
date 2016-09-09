class UnitConversion (f: Double) {
  def apply(v: Double) = v*f
}

object InchesToCentimeters extends UnitConversion(2.54){
  override def apply(v: Double) = super.apply(v)
}
new UnitConversion(2.54)(20.5)
InchesToCentimeters(20.5)