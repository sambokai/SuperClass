package challenges.superlist

class SuperList(val list: List[Int]) {
  require(list != null)

  def this(args: Int*) {
    this(args.toList)
  }
}

object SuperList {

  def apply(list: List[Int]) = new SuperList(list)

  def apply(args: Int*) = new SuperList(args.toList)
}