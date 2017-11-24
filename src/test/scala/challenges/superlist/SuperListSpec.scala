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

    "when invoking power(n: Int)" should {
      "return a list with all elements of the superlist powered to n" in {
        val list = List(2, 4, 8)
        val result = SuperList(list)
        result.power(2) shouldBe List(4, 16, 64)
      }
    }

    "when invoking static method isPrime(n: Int)" should {
      "return true if a pime number is passed" in {
        SuperList.isPrime(3) shouldBe true
      }

      "return false if a non-prime number is passed" in {
        SuperList.isPrime(4) shouldBe false
      }

      "return false if a negative number is passed" in {
        SuperList.isPrime(-5) shouldBe false
      }

      "return false if zero is passed" in {
        SuperList.isPrime(0) shouldBe false
      }
    }

    "when invoking primes()" should {

      "return a list, with only the elements of a superlist that are prime numbers" in {
        val result = SuperList(List(1, 2, 3, 4, 5))

        result.primes() shouldBe List(2, 3, 5)
      }

      "return an empty list on an empty superlist" in {
        SuperList(List()).primes() shouldBe List.empty
      }
    }

    "when invoking partition(size: Int)" should {
      "return superlist, splitted in lists of predefined size" in {
        val list = List(1, 2, 3, 4)
        val result = SuperList(list)

        result.partition(2) shouldBe List(List(1, 2), List(3, 4))
      }

      "return empty list on an empty superlist" in {
        SuperList(List()).partition(2) shouldBe List.empty
      }

      "return smaller smaller last partition, if the number of elements in superlist is not divisible by 'size'-parameter" in {
        val list = List(1, 2, 3)
        val result = SuperList(list)

        result.partition(2) shouldBe List(List(1, 2), List(3))
      }

    }
  }
}
