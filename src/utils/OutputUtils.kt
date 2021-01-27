package utils

/**
 * 控制台输出二维数组
 */
fun printTwoArray(array: Array<IntArray>) {
    for (i in array.indices) {
        for (j in array[i].indices) {
            print(array[i][j].toString())
            if (j == array[i].size - 1) {
                println()
            } else {
                print(", ")
            }
        }
    }
}

/**
 * 控制台输出一维数组，每个数字回车
 */
fun printlnArray(array: IntArray) {
    for (i in array.indices) {
        println(array[i])
    }
}

/**
 * 控制台输出一维数组，整行输出
 */
fun printArray(array: IntArray) {
    for (i in array.indices) {
        if (i != array.size - 1) {
            print(array[i].toString() + ", ")
        } else {
            println(array[i])
        }
    }
}
