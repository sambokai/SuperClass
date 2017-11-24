package challenges.superlist

class SuperList(val list: List[Int]) {
  require(list != null)

  def this(args: Int*) {
    this(args.toList)
  }

  def lastThree(): List[Int] = list.slice(list.length - 3, list.length)

  def power(n: Int): List[Double] = list.map(math.pow(_, n))

  def primes(): List[Int] = list.filter(n => SuperList.isPrime(n))

  def partition(size: Int): List[List[Int]] = list.grouped(size).toList

  def superStar(): Map[Int, List[Char]] = {
    val STAR = '*'
    list.map(a => a -> List.fill(a)(STAR)).toMap
  }

}

object SuperList {

  def apply(list: List[Int]) = new SuperList(list)

  def apply(args: Int*) = new SuperList(args.toList)

  private[superlist] def isPrime(n: Int) = {
    if (n <= 1)
      false
    else if (n == 2)
      true
    else
      !(2 until n).exists(x => n % x == 0)
  }

}