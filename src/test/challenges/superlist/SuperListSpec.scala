package challenges.superlist

import org.scalatest._
import Matchers._

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

    }
  }
}