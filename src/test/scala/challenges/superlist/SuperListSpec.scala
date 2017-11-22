package challenges.superlist

import org.scalatest.Matchers._
import org.scalatest._

class SuperListSpec extends WordSpec {
  "A SuperList" should {
    "on instantiation" should {
      "wrap a non empty list on instantiation" in {
        // given
        val list = List(1, 2, 3)

        // when
        val result = new SuperList(list)

        // then
        result.list shouldBe list
      }

      "be able to wrap an empty list" in {
        // given
        val list = List.empty

        // when
        val result = new SuperList(list)

        // then
        result.list shouldBe list
      }

      "throw an exception if passing a null value" in {
        intercept[IllegalArgumentException] {
          new SuperList(null)
        }
      }

      "wrap int parameters" in {
        //when
        val result = new SuperList(1, 2, 3)

        //then
        result.list shouldBe List(1, 2, 3)
      }

      "instantiate wrapper without 'new' keyword and a List[Int] as parameter" in {
        val list = List(1, 2, 3)
        val result = SuperList(list)
        result.list shouldBe list
      }

      "instantiate wrapper without 'new' keyword and class parameters" in {
        val result = SuperList(1, 2, 3)
        println(result)
        result.list shouldBe List(1, 2, 3)
      }
    }


  }
}
