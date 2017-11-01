import java.lang.Math.abs

class Squares constructor(private val upTo: Int) {

    fun squareOfSum(): Int {
        val sum = (1..upTo).sum()
        return sum * sum
    }

    fun sumOfSquares(): Int {
        return (1..upTo).map { it * it }.sum()
    }

    fun difference(): Int {
        return abs(sumOfSquares() - squareOfSum())
    }
}