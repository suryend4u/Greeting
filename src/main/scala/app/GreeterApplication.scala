package app

object GreeterApplication {
  val appName = "TestApp"

  def matchPrice(car: Car): Int = {

    car match {
      case Car(_,"Maruti") => car.price*2
      case Car(_,"Nano") => car.price*2
      case Car(_,"Audi") => car.price*2
      case Car(_,_) => 0
    }
  }


}
