object FunctionalProgramming {
  println("Functions in Scala")                   //> Functions in Scala
  
  def squareInt(x: Int): Int={
  x * x
  }                                               //> squareInt: (x: Int)Int
  
  def cubeInt(x: Int): Int={
  x * x * x
  }                                               //> cubeInt: (x: Int)Int
  
  //Functions can take parameter as other function
 // f name can be changed to anything
  def transformInt(x: Int, f: Int => Int): Int={
  f(x)
  }                                               //> transformInt: (x: Int, f: Int => Int)Int
  
  val result: Int=transformInt(3,cubeInt)         //> result  : Int = 27
  val result1: Int=transformInt(3,squareInt)      //> result1  : Int = 9
  println(result)                                 //> 27
  println(result1)                                //> 9
  
    // "Lambda functions", "anonymous functions", "function literals"
  // You can declare functions inline without even giving them a name
  // This happens a lot in Spark.
 transformInt(2, x=> x*x*x)                       //> res0: Int = 8
 transformInt(100,x=>x/2)                         //> res1: Int = 50
 transformInt(50,x=>{val y:Int=x+30;y*x})         //> res2: Int = 4000
    
    // EXERCISE
  // Strings have a built-in .toUpperCase method. For example, "foo".toUpperCase gives you back FOO.
  // Write a function that converts a string to upper-case, and use that function of a few test strings.
  // Then, do the same thing using a function literal instead of a separate, named function.
}
