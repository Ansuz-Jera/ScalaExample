package ClassesExamples.CaseClassesVsClasses

// Fuente: https://www.scala-exercises.org/scala_tutorial/classes_vs_case_classes#:~:text=We%20saw%20the%20main%20differences,values%20into%20a%20single%20value.&text=So%2C%20when%20we%20define%20a,methods%20and%20a%20companion%20object.

object Main {
  def main(args: Array[String]): Unit = {

    //Class
    //Con el mismo método de creación los valores de los elementos es diferente,
    val aliceAccount = new BankAccount
    val bobAccount = new BankAccount
    //Se puede modificar los valores de las clases

    //Case Class
    //Mientras que en este caso da valores iguales
    val c3 = Note("C", "Quarter", 3)
    //c3.name = "Juan" -> El valor es immutable
    val cThree = Note("C", "Quarter", 3)

    println(aliceAccount == bobAccount) //false
    println(c3 == cThree) //true

    //Esto le da una identidad a las Classes que no tienen las case classes

  }
}
