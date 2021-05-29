/*
Problem 2: Write a Scala program and use a case class to define a shopping cart item.
Each shopping cart item should have the following properties, namely, a name, a price,
and a quantity bought. Create three shopping cart items for the following items:
10 vanilla ice cream at $2.99 each
3 chocolate biscuits at $3.99 each
5 cupcakes at $4.99 each

Use an appropriate data structure to store the above-mentioned shopping cart items.
Thereafter, define and use a method that will print out all items from a given shopping cart.
*/
case class ShoppingCartItem2(name: String, price: Double, stock: Int) {

}


object ClassesAndFunctions2 {
  def main(args: Array[String]): Unit = {
    val item_1 = ShoppingCartItem2("vanilla ice cream", 2.99, 10)
    val item_2 = ShoppingCartItem2("chocolate biscuits", 3.99, 3)
    val item_3 = ShoppingCartItem2("cupcakes", 4.99, 5)

    val basket = List(item_1, item_2, item_3)

    def showCartItems(basket: List[ShoppingCartItem2]){
      basket.foreach { item =>
        println(s"${item.stock} ${item.name} at $$${item.price} each")
      }
    }
    showCartItems(basket)
  }
}

