package com.spark.scala

case class Human(name:String,age:Int)


object Lesson_caseClass {
  def main(args: Array[String]): Unit = {
    val h1 =  Human("zhangsan",18)
		val h2 = new Human("zhangsan",18)
    println(h1.equals(h2))
  }
}