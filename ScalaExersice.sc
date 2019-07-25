object ScalaExersice {
  println("Write Some code that takes the value of pi, doubles it and prints it with in a string with three decimal places of precision to the write")
                                                  //> Write Some code that takes the value of pi, doubles it and prints it with in
                                                  //|  a string with three decimal places of precision to the write
  val pivalue : Float = 3.1415926535f             //> pivalue  : Float = 3.1415927
  val doublepi : Double= pivalue*2                //> doublepi  : Double = 6.2831854820251465
  println(f"value till 3 places: $doublepi%.3f")  //> value till 3 places: 6.283
}
