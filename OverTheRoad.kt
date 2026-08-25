// https://www.codewars.com/kata/5f0ed36164f2bc00283aed07

import kotlin.math.ceil

fun overTheRoad(address: Int, n: Int): Int {
    val start = if (address % 2 == 0) 1 else 2
    return start + (2 * (n - ceil(address.toDouble() / 2))).toInt()
}
