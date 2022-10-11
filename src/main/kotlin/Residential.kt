import java.text.DecimalFormat

class Residential(customerName:String, customerPhone:String, customerAddress:String, squareFootage:Double, senior:Boolean): Customer(customerName,customerPhone,customerAddress, squareFootage){
    var customerName = ""
    var customerPhone = ""
    var customerAddress = ""
    var squareFootage = 0.0
    var senior = false
    init {
        this.customerName = customerName
        this.customerPhone = customerPhone
        this.customerAddress = customerAddress
        this.squareFootage = squareFootage
        this.senior = senior
    }
    fun calcRate(){
        var totalcost: Double = 0.0
        val dec = DecimalFormat("\$###,###,###.00")
        if (this.senior==false){
            totalcost = (this.squareFootage/1000)*6
            var finalcost = dec.format(totalcost)
            println("Residential Property "+this.customerName+"\n"+this.customerPhone+"\n"+this.customerAddress+"\nat a rate of $6 per 1000 sq. ft, the charge will be "+finalcost+".")
        }
        else if (this.senior == true){
            totalcost = ((this.squareFootage/1000)*5)*.85
            var finalcost = dec.format(totalcost)
            println("Residential Property "+this.customerName+"\n"+this.customerPhone+"\n"+this.customerAddress+"\nat a rate of $6 per 1000 sq. ft, minus our senior discount, the charge will be "+finalcost+".")
        }
    }
}