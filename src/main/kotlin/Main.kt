import java.io.IOException


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
            var name:String =""
            println("Customer name?")
            try {
            name = readln()!!.toString()
                if (name==""){
                    throw NullPointerException("Cannot be blank")
                }
            }
            catch (e:NullPointerException){
                while (name==""){
                    println("Customer name?")
                    name= readln()!!.toString()
                }
            }
            catch (e:Exception){

                println("Cannot be blank")
            }
            println("Phone number?")
            var phone:String = ""
            try {
                phone = readln()!!.toString()
                if (phone==""){
                    throw Exception("Cannot be blank")
                }
            } catch (e:Exception){
                while (phone=="") {
                    println("Cannot be blank, Phone number?")
                    phone = readln()!!.toString()
                }
            }
            println("Address?")
            var address:String=""
            try {
                address= readln()!!.toString()
                if (address==""){
                    throw Exception("Please enter an address")
                }
            }catch (e:Exception){
                while (address==""){
                    println("Cannot be blank, Address?")
                    address = readln()!!.toString()
                }
            }
            println("What is the sqft. of the property?")
            var sqft:Double = 0.0
            try {
                sqft = readln().toDouble()
                if (sqft==0.0){
                    throw Exception("Cannot be empty, enter a sqft.")
                }
            }catch (e:Exception){
                while (sqft==0.0){
                    println("Cannot be blank re-enter sqft")
                    sqft = readln()!!.toDouble()
                }
            }
            println("Are they senior? y or n")
            var sen:String= ""
            try{
                sen = readln()!!.toString()
                if (sen==""){
                    throw Exception("Required answer, please select Are they senior")
                }
            }catch (e:Exception){
                while (sen=="")
                    println("Cannot be blank, Are they senior? y or n")
                    sen = readln()!!.toString()
            }
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
            var comname:String =""
            println("Property name?")
            try {
                comname = readln()!!.toString()
                if (comname==""){
                    throw NullPointerException("Cannot be blank")
                }
            }
            catch (e:NullPointerException){
                while (comname==""){
                    println("Property name?")
                    comname= readln()!!.toString()
                }
            }
            catch (e:Exception){

                println("Cannot be blank")
            }
            println("Contact name?")
            try {
                name = readln()!!.toString()
                if (name==""){
                    throw NullPointerException("Cannot be blank")
                }
            }
            catch (e:NullPointerException){
                while (name==""){
                    println("Property name?")
                    name= readln()!!.toString()
                }
            }
            catch (e:Exception){

                println("Cannot be blank")
            }
            println("Phone number?")
            var phone:String = ""
            try {
                phone = readln()!!.toString()
                if (phone==""){
                    throw Exception("Cannot be blank")
                }
            } catch (e:Exception){
                while (phone=="") {
                    println("Cannot be blank, Phone number?")
                    phone = readln()!!.toString()
                }
            }
            println("Address?")
            var address:String=""
            try {
                address= readln()!!.toString()
                if (address==""){
                    throw Exception("Please enter an address")
                }
            }catch (e:Exception){
                while (address==""){
                    println("Cannot be blank, Address?")
                    address = readln()!!.toString()
                }
            }
            println("What is the sqft. of the property?")
            var sqft:Double = 0.0
            try {
                sqft = readln().toDouble()
                if (sqft==0.0){
                    throw Exception("Cannot be empty, enter a sqft.")
                }
            }catch (e:Exception){
                while (sqft==0.0){
                    println("Cannot be blank re-enter sqft")
                    sqft = readln()!!.toDouble()
                }
            }
            println("How many properties?")
            var prop:Int = 0
            try {
                prop = readln().toInt()
                if (prop==0){
                    throw Exception("Cannot be empty, enter a sqft.")
                }
            }catch (e:Exception){
                while (prop==0){
                    println("Cannot be blank re-enter sqft")
                    prop = readln()!!.toInt()
                }
            }
            var customer1 = Commercial(comname, name, phone, address, sqft, prop)// THE DECLARATION FOR COMMERCIAL QUOTES
            println(customer1.calcRate())
        }
    }
}
