// https://www.codewars.com/kata/663fe90a04bdcc6db4c091b9

fun snapshot(scene: String): String {
    if (scene.length < 11 || scene.none { it.isLetter() }) return scene

    val res = StringBuilder(scene)
    val last = scene.lastIndex

    val startIndex = when {
        scene[0].isLetter() || scene[1].isLetter() -> 0
        scene[last].isLetter() || scene[last - 1].isLetter() -> last - 10
        scene.contains('g') -> (scene.indexOf('g') - 5).coerceIn(0, last - 10)
        else -> return scene
    }

    setChar(startIndex, res)
    return res.toString()
}

private fun setChar(start: Int, res: StringBuilder) {
    res[start] = '['
    res[start + 1] = '['
    res[start + 5] = 'x'
    res[start + 9] = ']'
    res[start + 10] = ']'
}
