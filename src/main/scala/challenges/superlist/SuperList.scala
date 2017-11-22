package challenges.superlist

class SuperList(val list: List[Int]) {
  require(list != null)

  def this(args: Int*) {
    this(args.toList)
  }

  def lastThree(): List[Int] = list.slice(list.length - 3, list.length)

  def power(n: Int): List[Double] = list.map(math.pow(_, n))
}

object SuperList {

  def apply(list: List[Int]) = new SuperList(list)

  def apply(args: Int*) = new SuperList(args.toList)
}