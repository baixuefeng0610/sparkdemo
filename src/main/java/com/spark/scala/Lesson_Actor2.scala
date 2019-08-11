package com.spark.scala

import scala.actors.Actor

case class Messge(actor:Actor,msg:String)

class MyActor1 extends Actor {
  def act(): Unit = {
    while(true){
    	receive{
    	case message:Messge => {
    		if(message.msg.equals("hello")){
    			println("hello")
    			message.actor ! "hi~"
    		}else if(message.msg.equals("could we have a date?")){
    			println("could we have a date?")
    			message.actor ! "yes!"
    			
    		}else if(message.msg.equals("ok ~")){
    			println("ok ~")
    			println("Let's go!")
    			
    		}
    	}
    	case _=>{
    		println("default...")
    	}
    	}
    }
  }
}

class MyActor2(actor:Actor) extends Actor {
  
  actor ! Messge(this,"hello")
  
  def act(): Unit = {
    while(true){
    	receive{
    	case s:String => {
    		if(s.equals("hi~")){
    			println("hi~")
    			actor ! Messge(this,"could we have a date?")
    		}else if(s.equals("yes!")){
    			println("yes!")
    			actor ! Messge(this,"ok ~")
    		}
    	}
    	case _=>{
    		println("default...")
    	}
    	}
    }
  }
}

object Lesson_Actor2 {
  def main(args: Array[String]): Unit = {
    val actor1 = new MyActor1() 
		val actor2 = new MyActor2(actor1) 
    actor1.start()
    actor2.start()
  }
}