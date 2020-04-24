fun main(){
  
  //Hellow Kotlin
  val name  = "am"
  
  print("nama abdi $name. ")
  println("Abdi nuju belajar Kotlin ")
  
  //Data Type
  var kataPertama : String = "Dicoding"
  kataPertama = "Belajar di Dicoding"
  val lastWord = " is The Best"
  
  println (kataPertama + lastWord)
  
  //Data Type Character
  var am = 'A'
  val am1 = 'A'
  val m = 'M'
  
    
    print ("nama = "+ am++)
    print (m)
    print (am++)
    println (am1)
    
  //Data Type String
  val name1 = "am"
  for (char in name1){
    print("\n \t $char")
    print("\n \t \t $char")
    println("\n \t \t \t $char")
  }
  
  // Array
  val ArrarKu = arrayOf("Dicoding", "bareng", "Belajar")
  print(ArrarKu[2]) 
  print(ArrarKu[1])
  println( ArrarKu[0])
  
  //Function
  val saya = dataSaya(nama = "am", age =17)
  println(saya)
  
  //If Expression
  if (saya == name){
    println("itu saya")
  }else{
    println("bukan saya")
  } 
  
} 
  
 fun dataSaya(nama : String, age : Int):String{
   return "nama saya $nama, dan umur saya $age"
 }
