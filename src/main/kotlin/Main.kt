//SeanTheShe3p aka. Sean Widdowson
// MAD-105
//
//upload init 10.10 final
fun main(){
    var menuchoice = 1 //While loop for Menu
    while (menuchoice!=0){

        var name =""//variables for the user input
        var phone =""
        var address =""
        var sqft = 0.0
        var sen = "f"
        var senior = false
        var comname = ""
        var prop = 0

        println("Would you like to quote another customer? 1.) Residential 2.) Commercial 0.) Quit")

        menuchoice= readln().toInt()// user input
        if (menuchoice==1){
            println("Customer name?")
            name = readln().toString()
            println("Phone number?")
            phone = readln().toString()
            println("Address?")
            address = readln().toString()
            println("What is the sqft. of the property?")
            sqft = readln().toDouble()
            println("Are they senior? y or n")
            sen = readln().toString()
            if (sen=="y" || sen=="Y") {//booleanin'
                senior = true
            }
            else{
                senior = false
            }

            var customer1 = Residential(name, phone, address, sqft, senior)//THE CLASS DECLARATION
            println(customer1.calcRate())
        }

        else if (menuchoice==2){//opt 2...always a second option..
            println("Property name?")
            comname = readln().toString()
            println("Contact name?")
            name = readln().toString()
            println("Phone number?")
            phone = readln().toString()
            println("Address?")
            address = readln().toString()
            println("What is the total sqft?")
            sqft = readln().toDouble()
            println("How many properties?")
            prop = readln().toInt()

            var customer1 = Commercial(comname, name, phone, address, sqft, prop)// THA DECLARATION FOR COMMERCIAL QUOTES
            println(customer1.calcRate())
        }
    }
}
