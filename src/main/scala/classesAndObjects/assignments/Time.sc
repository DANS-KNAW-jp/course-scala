case class Time(hours: Int, minutes: Int) {
  require(hours >= 0 && hours < 24, s"$hours : invalid hours")
  require(minutes >= 0 && minutes < 60, s"$minutes : invalid minutes")

  def < (that: Time) = hours < that.hours || minutes < that.hours
}


Time(1, 3) < Time(1,2)
Time(1, 3) < Time(1,4)
Time(-1, 3)

