import app.{Car, GreeterApplication, Person}
import org.scalatest.WordSpec

class GreeterApplicationTest extends WordSpec {

  "A Person" when {

    "created" should {

      "have properties" in {
        val person = new Person(20,"Surya")
        assert(person.name.equals("Surya"))
        assert(person.age.equals(20))
      }

      "can change the properties" in {
        val person = new Person(35,"Sriman")
        assert(person.name.equals("Sriman"))
        assert(person.age.equals(35))
      }
    }

  }


  "Greeter App" when {
    "Called" should {
      "Return name for app" in {
        assert(GreeterApplication.appName.equals("TestApp"))
      }
    }
    "matchPrice" should {
      "return 2000 for Maruti" in {
        assert(GreeterApplication.matchPrice(new Car(1000, "Maruti")).equals(2000))
      }
    }
  }


}
