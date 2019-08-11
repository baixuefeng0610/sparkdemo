package com.spark.scala

object Lesson_collections {
  def main(args: Array[String]): Unit = {
    
    /**
     * tuple  元组
     *  tuple最多支持22个元素
     */
//    val tuple1 = new Tuple1("hello")
//    val tuple2 = Tuple2("hello",10)
//    println(tuple2.swap)
//    val tuple3 =  Tuple3(1,2,2.4)
//    println(tuple3._3)
//    val tuple5 = new Tuple5(1,'c',3,4,"hello")
//    val tuple6 = (1,2,3,4,5,6,7)
//    val tuple =  Tuple22(1,2,"hello",4,5,6,7,8,9,10,11,12,13,14,15,16,17,"world",19,20,21,22)
//    println(tuple._18)
//    val iter: Iterator[Any] = tuple.productIterator  
//    while(iter.hasNext){
//      println(iter.next())
//    }
    /**
     * map 
     * 
     * map 中每个元素就是一个二元组
     */
    
//    val map = Map(1->"a",2->"b",(3,"c"),(3,"d"))
    
//    val values = map.values
    
//    val keys: Iterable[Int] = map.keys
//    keys.foreach(println)
    //取值
//   val value :String = map.get(2).getOrElse("xxxx")
//    println(value)
//    map.foreach(println)
    
    /**
     * set  无序不重复
     * 
     */
//    val set = Set[Int](1,2,3,4,4,5)
//    set.foreach(println)
    
    
    /**
     * List
     * 
     * map:一对一
     * flatMap :一对多
     */
//    val list = List("hello world","hello bjsxt","hello scala")
//    val result = list.filter(line=>{
//      !line.equals("hello world")
//    })
//    result.foreach(println)
//    val result :List[Array[String]]= list.map(s=>{
//      s.split(" ")
//    })
//    
//    val result1 :List[String]= list.flatMap(s=>{
//      s.split(" ")
//    })
//    result1.foreach(println)
    
//    result.foreach(array=>{
//      println("***********")
//      array.foreach(println)
//    })
    
//    val list = List[Int](1,2,3,4,4)
//    list.foreach(println)
//    for(elem<-list){
//      println(elem)
//    }
    /**
     * Array
     */
//    val arr = Array[Int](1,2,3,4)
//    arr.foreach(println)
//    for(elem<-arr){
//      println(elem)
//    }
//    val arr = new Array[String](3)
//    
//    arr(0) ="a" 
//    arr(1) ="b" 
//    arr(2) ="c" 
//    arr.foreach(println)
    
  }
}