fun main(){
    arrayNames(arrayOf("Winfred", "Faith", "Anena", "Gumato"))
    createArray("Loresho", "Westlands", "Kileleshwa", "GreenFields")
    capitalizeArray(arrayOf("mumbai", "Jakarata", "Dodoma", "Kigali"))
    operationsArray(arrayOf(32,17, 4, 50, 158, 90,59))
    var z = stringConversion("Mango", "Banana", "Grapes")
    println(z.contentToString())

    var d= productArray(arrayOf(2,4, 6, 8, 10))
    println(d)

    var q= sumMixedArray(arrayOf(21,73.00, 2F, "wangari", 78F))
    println(q)

    var v= returnVowels(arrayOf('g','a', 't','h', 'o', 'n', 'i'))
    print(v)
}

fun arrayNames(names:Array<String>){
    println(names.first())
    println(names.size)
    names.forEach { x ->
    println(names.contentToString())}
    for (y in names) println(y)
    for (i in 1.rangeTo(10).step(2)) print(i)

    for(x in names) println(x.indices)



}

fun createArray(a:String, b:String, c:String, d:String){
    println(arrayOf(a, b, c ,d).contentToString())
}

fun capitalizeArray(cities:Array<String>){
    for (y in cities) println(y.capitalize())
}

fun operationsArray(numbers:Array<Int>){
     var sum = numbers[1].plus(numbers[3])
    println(sum)
    println(numbers.indexOf(158))
    println(numbers.sortedArray().contentToString())

}

fun stringConversion(name1:String, name2:String, name3: String):Array<String>{
    var y= arrayOf(name1, name2, name3)
    return y
}

fun productArray(digits:Array<Int>):Int{
      var product=1
      for (d in digits) product *= d
      return product

}

fun sumMixedArray(numbers: Array<Any>): Double{
    var sum = 0.00
    for (y in numbers)
    if(y== Double || y == Float)
    sum += numbers.toString().toDouble()
    return sum
}

fun returnVowels(letters: Array<Char>):Int{
    var vowel=0
    for (l in letters)
    if(l =='a' || l =='e'|| l =='i' || l =='o' ||l =='u')
        vowel++
    return vowel

}
