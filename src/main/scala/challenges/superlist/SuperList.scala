package challenges.superlist

class SuperList(val list: List[Int]) {
  require(list != null)

  def this(args: Int*) {
    this(args.toList)
  }

  def lastThree(): List[Int] = list.slice(list.length - 3, list.length)
}

object SuperList {

  def apply(list: List[Int]) = new SuperList(list)

  def apply(args: Int*) = new SuperList(args.toList)
}