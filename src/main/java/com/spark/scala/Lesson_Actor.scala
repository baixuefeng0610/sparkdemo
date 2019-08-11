package com.spark.scala

import scala.actors.Actor

/**
 * Actor 是通信模型，Spark底层节点之间的通信就是使用的Akka,Akka是通信模型，Akka就是Actor实现的。
 * Actor向当于我们理解的线程，Thread。
 * 
 */

class MyActor extends Actor {
  def act(): Unit = {
    while(true){
      
    	receive{
    	  
      	case s:String => println("value is "+ s)
      	case _=>{
      		println("default...")
      	}
    	}
    }
  }
}

object Lesson_Actor {
  def main(args: Array[String]): Unit = {
    val actor = new MyActor()
    actor.start()
    actor ! 100
  }
}