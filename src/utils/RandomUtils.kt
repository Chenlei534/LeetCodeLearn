package utils

/**
 * 生成一个随机数
 */
fun getRandomNum(): Int {
    return (Math.random() * 99).toInt()
}

/**
 * 生成一个范围内的随机数
 * @param min 最小值
 * @param max 最大值
 */
fun getRandomNum(min: Int, max: Int): Int {
    return (Math.random() * (max - min) + min).toInt()
}

/**
 * 生成随机一维数组
 */
fun getArray(length: Int): IntArray? {
    val array = IntArray(length)
    for (i in array.indices) {
        array[i] = getRandomNum()
    }
    return array
}

/**
 * 生成随机二维数组
 */
fun getTwoArray(width: Int, height: Int): Array<IntArray>? {
    val array = Array(width){IntArray(height)}
    for (i in array.indices) {
        for (j in array[i].indices) {
            array[i][j] = getRandomNum()
        }
    }
    return array
}
