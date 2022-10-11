import java.text.DecimalFormat

class Commercial(propertyName:String, customerName:String, customerPhone:String, customerAddress:String, squareFootage:Double, numberOfProperties:Int): Customer(customerName,customerPhone,customerAddress, squareFootage){
    var propertyName= ""
    var customerName = ""
    var customerPhone = ""
    var customerAddress = ""
    var squareFootage = 0.0
    var numberOfProperties = 0
    init {
        this.propertyName = propertyName
        this.customerName = customerName
        this.customerPhone = customerPhone
        this.customerAddress = customerAddress
        this.squareFootage = squareFootage
        this.numberOfProperties = numberOfProperties
    }
    fun calcRate(){
        var totalcost: Double = 0.0
        val dec = DecimalFormat("\$###,###,###.00")
        if (this.numberOfProperties==1){
            totalcost = (this.squareFootage/1000)*5
            var finalcost = dec.format(totalcost)
            println("Commercial Property "+this.propertyName+"\nContact: "+this.customerName+"\n"+this.customerPhone+"\n"+this.customerAddress+"\nat a rate of $5 per 1000 sq. ft, the charge will be "+finalcost+".")
        }
        else if (this.numberOfProperties >=2){
            totalcost = ((this.squareFootage/1000)*5)*.9
            var finalcost = dec.format(totalcost)
            println("Commercial Property "+this.propertyName+"\nContact: "+this.customerName+"\n"+this.customerPhone+"\n"+this.customerAddress+"\nat a rate of $5 per 1000 sq. ft, with a 10% discount, the charge will be "+finalcost+".")
        }
    }
}