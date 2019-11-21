import app.Car
import org.scalatest.WordSpec

class CarTest extends WordSpec {

  "Car object" when {
    "Created" should {
      "Return price for car" in {
        assert(Car.apply(1000,"Maruti").brand.equals("Maruti"))
      }
    }
  }
}
