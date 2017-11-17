package challenges.superlist

import org.scalatest.Matchers._
import org.scalatest._

class SuperListSpec extends WordSpec {
  "A SuperList" should {
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
        val result = new SuperList(null)
      }
    }

    "wrap a list of ints" in {
      //given
      val list = List(1, 2, 3)

      //when
      val result = new SuperList(list)

      //then
      result.list shouldBe list
    }

    "wrap int parameters" in { //TODO: Better name?
      //when
      val result = new SuperList(1, 2, 3)

      //then
      result.list shouldBe List(1, 2, 3)
    }
  }
}
