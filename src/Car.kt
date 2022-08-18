open class Car {
    var model : String = ""
    var color : String = ""
    var speed : Int = 0
    open fun getFuelType() {}




    //Extra functions
    fun getModel() {println("The car's model is $model")}
    fun setC(C : String) {color = C} // Function to set Color for the Car
    fun setS(S : Int) {speed = S} // Function to set speed for the Car
    fun getSpeed() { println("The car's speed is $speed") } // Function to get speed of the Car
    fun getColor() { if (color != "" )
                        println("The car's color is $color")
        else
            println("No color is assigned to this car")
    } // Function to get Color of the Car
}