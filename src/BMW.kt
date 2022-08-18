class BMW(override var model: String = "BMW", override var color: String, override var speed: Int) : Car {
     override fun getFuelType() {
        println("BMW cars' fuel type is : Gasoline")
    }
}