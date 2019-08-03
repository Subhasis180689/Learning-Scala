object DataStructureScala {
  println("Data Structures in Scala")             //> Data Structures in Scala
  
  val print_stuff = ("Picard","New EnterPrise","NCC-def")
                                                  //> print_stuff  : (String, String, String) = (Picard,New EnterPrise,NCC-def)
  println(print_stuff)                            //> (Picard,New EnterPrise,NCC-def)
  
  println(print_stuff._1)                         //> Picard
  println(print_stuff._2)                         //> New EnterPrise
  println(print_stuff._3)                         //> NCC-def
  
  //user readable format
  val keyvaluepair = "picard" -> "New value"      //> keyvaluepair  : (String, String) = (picard,New value)
  //not user readable format
  val keyvaluepair2= ("newkey","newvalue")        //> keyvaluepair2  : (String, String) = (newkey,newvalue)
  
  println(keyvaluepair._1)                        //> picard
  println(keyvaluepair._2)                        //> New value
  println(keyvaluepair2._1)                       //> newkey
  println(keyvaluepair2._2)                       //> newvalue
  
  // you can mix different types in a tuple
  val new_tuple=(123,"hello r u",true,'f')        //> new_tuple  : (Int, String, Boolean, Char) = (123,hello r u,true,f)
  
  //List different from tuple and actual collection of objects that has more functionanlity
  //Also it can hold items of different kinds
  // Its a single linked list under the hood
  
 val shipList=List("Enterprise","Dead","Deep Space")
                                                  //> shipList  : List[String] = List(Enterprise, Dead, Deep Space)
 println(shipList)                                //> List(Enterprise, Dead, Deep Space)
 
 println(shipList(1))                             //> Dead
 
 println(shipList.head)                           //> Enterprise
 println(shipList.tail)                           //> List(Dead, Deep Space)
 
 
 //range operator in List
 for (ran <- shipList)
 {
 println(ran)                                     //> Enterprise
                                                  //| Dead
                                                  //| Deep Space
 }
 
 //Map Function with inline Function
val reverseShip= shipList.map((r: String) => r.reverse)
                                                  //> reverseShip  : List[String] = List(esirpretnE, daeD, ecapS peeD)
 for (pr <- reverseShip) println(pr)              //> esirpretnE
                                                  //| daeD
                                                  //| ecapS peeD
                                                  
                                                  
//Reduce function
val numberList=List(1,4,7,8,10,3)                 //> numberList  : List[Int] = List(1, 4, 7, 8, 10, 3)
val sumList=numberList.reduce((x:Int,y:Int) => x+y)
                                                  //> sumList  : Int = 33
 val hate4=numberList.filter((x:Int) => x!=4)     //> hate4  : List[Int] = List(1, 7, 8, 10, 3)
val hate3=numberList.filter(_!=3)                 //> hate3  : List[Int] = List(1, 4, 7, 8, 10)


val numList= List(30,50,60,10,20,4,7,1)           //> numList  : List[Int] = List(30, 50, 60, 10, 20, 4, 7, 1)
val add2List=numList++numberList                  //> add2List  : List[Int] = List(30, 50, 60, 10, 20, 4, 7, 1, 1, 4, 7, 8, 10, 3
                                                  //| )

//More List methods
val reversedList=numList.reverse                  //> reversedList  : List[Int] = List(1, 7, 4, 20, 10, 60, 50, 30)
val sortedlist=numList.sorted                     //> sortedlist  : List[Int] = List(1, 4, 7, 10, 20, 30, 50, 60)
val distintvalue=add2List.distinct                //> distintvalue  : List[Int] = List(30, 50, 60, 10, 20, 4, 7, 1, 8, 3)
val maxValue=add2List.max                         //> maxValue  : Int = 60
val total=numList.sum                             //> total  : Int = 182
val hasThree=numberList.contains(3)               //> hasThree  : Boolean = true





}
