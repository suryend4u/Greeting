import app.Person
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
  
}
