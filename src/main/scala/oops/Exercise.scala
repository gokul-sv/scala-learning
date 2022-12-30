package oops

import scala.language.postfixOps

object Exercise extends App {
  val author = new Writer("James", "Gosling", 1955)
  val novel = new Novel("Java", 1995, author)

  println(novel.authorAge())
  println(novel.isWrittenBy(author))
  //println(novel.copy(1996))
}

class Writer(val firstname: String, val surname: String, val year: Int) {
  def fullName(): String = s"$firstname $surname"
}

class Novel(val name: String, val yearOfRel: Int, val author: Writer) {
  def authorAge(): Int = yearOfRel - author.year
  def isWrittenBy(author: Writer): Boolean = this.author == author
  def copy(newYearOfRel: Int) : Novel = new Novel(name, newYearOfRel, author)
}
