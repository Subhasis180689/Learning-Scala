object SubhasisLearningScala {
//This is an example of immutable variable
val hello : String = "hello There"                //> hello  : String = hello There
println(hello)                                    //> hello There

//mutable variable
var hellothr : String =" How r u"                 //> hellothr  : String = " How r u"
hellothr=hellothr + "!!"
println(hellothr)                                 //>  How r u!!

//immutable variable from immutable variable
val immutablehello=hello+"!! how r u!!"           //> immutablehello  : String = hello There!! how r u!!
println(immutablehello)                           //> hello There!! how r u!!

//Other types
val one : Int =1                                  //> one  : Int = 1
val truthval: Boolean=true                        //> truthval  : Boolean = true
val singlechar:Char='c'                           //> singlechar  : Char = c
val newdouble : Double=3.141                      //> newdouble  : Double = 3.141
val biggerint :Long=1234554561                    //> biggerint  : Long = 1234554561
val smallnumber :Byte=127                         //> smallnumber  : Byte = 127

//Here we can print all of these
println("here you go" + one+truthval+singlechar+newdouble+biggerint+smallnumber)
                                                  //> here you go1truec3.1411234554561127
// New formatting type in printf format
val pi : Float=3.1415926535f                      //> pi  : Float = 3.1415927
//no space allowed between variable and %
println(f"I can read this: $pi%.3f")              //> I can read this: 3.142
println(f"padding in integer $one%07d")           //> padding in integer 0000001

//Substituating variable in a print statement
println(s"Here you go with value of variable $one really $truthval")
                                                  //> Here you go with value of variable 1 really true
//Also i can put expressions in println
println(s"the value ${12+13}")                    //> the value 25

val theUltimateAnswer="To life, the universe, and everything 42"
                                                  //> theUltimateAnswer  : String = To life, the universe, and everything 42
val pattern=""".*([\d]+).*""".r                   //> pattern  : scala.util.matching.Regex = .*([\d]+).*
val pattern(answerstring)=theUltimateAnswer       //> answerstring  : String = 2
val answer=answerstring.toInt                     //> answer  : Int = 2
println("Here you go " + answer)                  //> Here you go 2

}
