class Tesla(override var model: String = "Tesla", override var color: String, override var speed: Int) : Car {



     override fun getFuelType() {
        println("Tesla cars' fuel type is : Electricity")
    }



}