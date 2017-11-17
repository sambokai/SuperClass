class SuperList(i: Any*) {
  def lastThree() = i.slice(i.size - 3, i.size)
}

object SuperList {
  def apply(i: Any*): SuperList = new SuperList(i)
}


object test {

  def main(args: Array[String]): Unit = {
    var list = Seq(1, 2, 3, 4, 5)

    var superlist = new SuperList(list, list)
    var superlist2 = new SuperList(1, 2 , 3, 4, 5)
    var superlist3 = SuperList(list)
    var superlist4 = SuperList(1, 2, 3, 4, 5)


    println(superlist3.lastThree())
  }

}