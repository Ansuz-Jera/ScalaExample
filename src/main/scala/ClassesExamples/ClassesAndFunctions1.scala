package ClassesExamples



/*
Classes, Functions, Traits

  Problem 1: Write a Scala program and use the Tuple type to represent a shopping cart item
with the following properties: a name, a price, and a quantity bought. Thereafter, use a
case class to represent the above shopping cart item. You can use the following shopping cart
item as an example: A packet of rice at $10.99 and quantity bought is 5.

  Problema 1: Escribir un programa en Scala y usar una variable de tipo 'tuple' para representar
un item de un carrito de compras con las siguientes propiedades: un nombre, un precio, y el stock
disponible. Después use una 'case class' para representar el item del carrito de compras mencionado
anteriormente. Puede usar el siguiente item del carrito de compras como ejemplo: Paquete de arroz a
$10.99 con un stock de 5 unidades.
*/

object ClassesAndFunctions1 {
  def main(args: Array[String]): Unit = {
    //Solución usando Funciones
    val tupleItem: (String, Double, Int) = ("Paquete de arroz", 10.99, 5) //tupleItem(name, price, stock)
    println(s"Un ${tupleItem._1} con un precio de ${tupleItem._2}, y un stock de ${tupleItem._3}")

    //Solucion usando Clases
    val cartItem_1 =  ShoppingCartItem(
      name = "Paquete de arroz",
      price = 10.99,
      stock = 5
    )
    print(s"Un ${cartItem_1.name} con un precio de ${cartItem_1.price}, y un stock de ${cartItem_1.stock}")
  }
}

final case class ShoppingCartItem(name: String, price: Double, stock: Int){

}
