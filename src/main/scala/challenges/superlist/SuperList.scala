package challenges.superlist

class SuperList(val list: List[Int]) {
  require(list != null)

  def this(args: Int*) {
    this(args.toList)
  }
}