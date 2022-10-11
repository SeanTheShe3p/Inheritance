//SeanTheShe3p aka. Sean Widdowson for MAD-105 10.10.21 fin
import java.text.DecimalFormat

class Commercial(propertyName:String, customerName:String, customerPhone:String, customerAddress:String, squareFootage:Double, numberOfProperties:Int): Customer(customerName,customerPhone,customerAddress, squareFootage){
    var propertyName= ""
    var customerName = ""
    var customerPhone = ""
    var customerAddress = ""
    var squareFootage = 0.0
    var numberOfProperties = 0// Commercial vars
    init {
        this.propertyName = propertyName //Useful Commercial vars
        this.customerName = customerName
        this.customerPhone = customerPhone
        this.customerAddress = customerAddress
        this.squareFootage = squareFootage
        this.numberOfProperties = numberOfProperties
    }
    fun calcRate(){
        var totalcost: Double = 0.0
        val dec = DecimalFormat("\$###,###,###.00")//WRITE THIS DOWN!!#!

        if (this.numberOfProperties==1){
            totalcost = (this.squareFootage/1000)*5//one
            var finalcost = dec.format(totalcost)
            println("Commercial Property "+this.propertyName+"\nContact: "+this.customerName+"\n"+this.customerPhone+"\n"+this.customerAddress+"\nat a rate of $5 per 1000 sq. ft, the charge will be "+finalcost+".")
        }
        else if (this.numberOfProperties >=2){//two or more
            totalcost = ((this.squareFootage/1000)*5)*.9
            var finalcost = dec.format(totalcost)
            println("Commercial Property "+this.propertyName+"\nContact: "+this.customerName+"\n"+this.customerPhone+"\n"+this.customerAddress+"\nat a rate of $5 per 1000 sq. ft, with a 10% discount, the charge will be "+finalcost+".")
        }
    }
}