class SumOfMultiples {

    companion object {
        fun sum(multiples: Set<Int>, number: Int): Int {
            val items = mutableSetOf<Int>()

            (0 until number).forEach { n ->
                multiples.filter { n % it == 0 }.forEach { items += n }
            }

            return items.sum()
        }
    }
}