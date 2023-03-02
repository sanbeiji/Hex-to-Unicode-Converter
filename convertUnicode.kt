fun main() {
  while (true) {
    println("Enter a hex value for a unicode character (e.g. 5B89):")
    val unicodeHexValue = readLine()
    if (unicodeHexValue?.isEmpty() == true) {
      println("We're done here.")
      break
    }
    println("The unicode value for $unicodeHexValue is ${
      convertUnicodeHexToCharacter(unicodeHexValue!! )
    }")
  }
}

fun convertUnicodeHexToCharacter(hex: String): String {
  val decimal = Integer.parseInt(hex, 16)
  return Character.toString(decimal)
}
