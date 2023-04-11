fun main() {
    var convertibleValue = 1000000
    for (i in 0 until convertibleValue) {
        println("$i in binary is ${i.toString(radix = 2)}, " +
                "in octal is ${i.toString(radix = 8)}, " +
                "and in hexadecimal is ${i.toString(radix = 16)}.")
    }
    println("$convertibleValue in binary is ${convertibleValue.toString(radix = 2)}, " +
            "in octal is ${convertibleValue.toString(radix = 8)}, " +
            "and in hexadecimal is ${convertibleValue.toString(radix = 16)}.")
}