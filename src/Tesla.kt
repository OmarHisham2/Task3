class Tesla : Car() {
     override fun getFuelType() {
        println("Tesla cars' fuel type is : Electricity")
    }

    init {
        model = "Tesla"
    }
}