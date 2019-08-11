package com.spark.scala

/**
 * 1."_=>" 模式匹配中默认匹配，放在最后
 * 2.模式匹配不仅可以匹配值还可以匹配类型
 * 3.从上往下匹配，匹配上一个之后就不会继续往下匹配，匹配的过程中有值自动转换
 */
object Lesson_Match {
  def main(args: Array[String]): Unit = {
    val tuple = (1,"hello",'c',1.0,true)
    val iter = tuple.productIterator
    while(iter.hasNext){
      val one = iter.next()
      MatchTest(one)
    }
  }
  
  
  def MatchTest(o:Any) = {
    o match {
      case d:Double=>println("type is Double")
      case i:Int =>println("type is Int")
      case 1=>println("value is 1")
      case "hello"=>println("value is hello")
      case s:String => println("type is String")
      case _=> println("default...")
    }
  }
}