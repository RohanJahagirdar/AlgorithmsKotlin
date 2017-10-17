open class MinMaxSumKotlin {

    constructor() {}

    fun main() {
     //   var read = readLine()
        var arr = LongArray(5)

        for(i in 0..4) arr[i] =  readLine()!!.toLong()

        arr = bubbleSort(arr)

        for(j in arr)
            println(j)

    }

    fun bubbleSort(arr: LongArray): LongArray{
        var length = arr.size-1
        for(i in 0..length-1) {
            for(j in 0..length-i-1) {
             //   println(j)
            //    println("${arr[j]} :: ${arr[j+1]}")

                arr[j] = arr[j+1].also{arr[j+1] = arr[j]}
            }
        }

        return arr
    }
}