fun main() {
    var y=arrayofIntegers(arrayOf(3,4,5))
    println(y)
    var h=arrayofmixtype(arrayOf(34,56,7.8,6,9.7,6.6,"Maellisa", false, "Kevin"))
    println(h)
    var alf=arrayofchar(arrayOf('a', 'e','i','o','u','t', 'z', 'y'))
    println(alf)
    }
fun arrayofIntegers(num:Array<Int>):Int{
    var product=1
    num.forEach{num->
        product*=num
    }
    return product
}
fun arrayofmixtype(type:Array<Any>):Double{
    var sum=0.0
    type.forEach{type->
        if(type is Double || type is Float){
            sum +=type.toString().toDouble()
    }
}
    return sum

}
fun arrayofchar(vowel:Array<Char>):Int{
    var alf=0
    vowel.forEach{letter->
        if(letter=='a'|| letter=='e'|| letter=='i'|| letter=='o'|| letter=='u')
            alf++
    }
    return alf
    }
