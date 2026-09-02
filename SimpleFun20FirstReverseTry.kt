// https://www.codewars.com/kata/5886c6b2f3b6ae33dd0000be

fun firstReverseTry(arr: IntArray) : IntArray {
    if (arr.size < 2) return arr
    
    val lastValue = arr.last()
    arr[arr.lastIndex] = arr[0]
    arr[0] = lastValue
    return arr
}
