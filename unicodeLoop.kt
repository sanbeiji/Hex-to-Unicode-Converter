/**
 * Loop through a "reasonable" subset of Unicode and print the characters
 */

fun main() {
  for (hexValue in 0x000..0x13430) {
    print("0x$hexValue: ${ convert(hexValue!!)}, ")
  }
}

fun convert(hex: Int): String {
  val decimal = Integer.parseInt(hex.toString(), 16)
  return Character.toString(decimal)
}
