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

    "when invoking lastThree()" should {

      "return the last three elements" in {
        val result = SuperList(List(1, 2, 3, 4, 5))
        result.lastThree() shouldBe List(3, 4, 5)
      }

      "return all elements when the SuperList has less than three elements" in {
        val result = SuperList(List(1, 2))
        result.lastThree() shouldBe List(1, 2)
      }

      "return an empty list when the SuperList has no elements" in {
        val result = SuperList(List.empty)
        result.lastThree() shouldBe List.empty
      }

    }
  }
}
