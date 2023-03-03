fun main() {
  // input a starting and ending value
  println("Enter a starting number for the counter (less than 149186):")
  val startNumber = readLine()
  println("Enter a final number for the counter (no greater than 149186):")
  val endNumber = readLine()

  if (startNumber != null && endNumber != null) {
    // start the timer
    val start = System.currentTimeMillis()
    // build the unicode map
    var br = 1
    println("Running...")
    print("|   ")
    for (counter in startNumber.toInt()..endNumber.toInt()) {
      val hex = Integer.toHexString(counter)
      print("0x${hex.uppercase()}: " + convertHexToCharacter(hex) + "   |   ")
      if (br == 8) {
        println()
        print("|   ")
        br = 0
      }
      br++
    }
    // stop the timer
    val end = System.currentTimeMillis()
    println("Took ${end - start}ms to complete.")
  }
}

// Function to convert hex to characters
fun convertHexToCharacter(hex: String): Char {
  val hexValue = Integer.parseInt(hex, 16)
  return hexValue.toChar()
}
