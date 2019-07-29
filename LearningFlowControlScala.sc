object LearningFlowControlScala {
  println("Learning Flow Control: second-2")      //> Learning Flow Control: second-2
  if(1>3)
  println("static comparision")
  else
  println("Else part will execute as 1 is less than 3")
                                                  //> Else part will execute as 1 is less than 3
  if(1>3)
  {
  println("Multi line conditions")
  println("Multi line -2 conditions")
  }
  else
  {
  println("Multiline-Else part will execute as 1 is less than 3")
  println("Multiline-Else part will execute as 1 is less than 3")
  println("Multiline-Else part will execute as 1 is less than 3")
  }                                               //> Multiline-Else part will execute as 1 is less than 3
                                                  //| Multiline-Else part will execute as 1 is less than 3
                                                  //| Multiline-Else part will execute as 1 is less than 3
   //Switch Case statements:
   val num: Int=3                                 //> num  : Int = 3
   num match{
   case 1 => println("One")
   case 2 => println("Two")
   case 3 => println("Three")
   }                                              //> Three
   
   
    //for loop
   for (x<-7 to 19)
   {
   val square = x * x
   println(" here you have square of number " + square)
   }                                              //>  here you have square of number 49
                                                  //|  here you have square of number 64
                                                  //|  here you have square of number 81
                                                  //|  here you have square of number 100
                                                  //|  here you have square of number 121
                                                  //|  here you have square of number 144
                                                  //|  here you have square of number 169
                                                  //|  here you have square of number 196
                                                  //|  here you have square of number 225
                                                  //|  here you have square of number 256
                                                  //|  here you have square of number 289
                                                  //|  here you have square of number 324
                                                  //|  here you have square of number 361
 
 //While Loop
 var x=10                                         //> x  : Int = 10
 while(x > 1)
 {
 println("the Number list " + x)
 x-=1
 }                                                //> the Number list 10
                                                  //| the Number list 9
                                                  //| the Number list 8
                                                  //| the Number list 7
                                                  //| the Number list 6
                                                  //| the Number list 5
                                                  //| the Number list 4
                                                  //| the Number list 3
                                                  //| the Number list 2
//Do while loop
var y=0                                           //> y  : Int = 0
do {println(y); y+=1} while(y<=10)                //> 0
                                                  //| 1
                                                  //| 2
                                                  //| 3
                                                  //| 4
                                                  //| 5
                                                  //| 6
                                                  //| 7
                                                  //| 8
                                                  //| 9
                                                  //| 10

{val z=10; z+20}                                  //> res0: Int = 30
println({val z=10; z+20})                         //> 30
}
