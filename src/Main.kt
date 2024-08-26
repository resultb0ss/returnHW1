fun main() {

    val array = arrayOf(5,2,7,6,8,3,4,3)
    var result = checkLocal(array)
    println("Локальных минимумов в массиве: $result")
}

fun checkLocal (array: Array<Int>): Int {
    var countLocMin = 0
    for ( i in array.indices){
        if (i != 0 && i != array.size - 1 ){
            if (array[i] < array[i+1] && array[i] < array[i-1]){
                countLocMin++
            }
        }
    }
    return countLocMin
}
