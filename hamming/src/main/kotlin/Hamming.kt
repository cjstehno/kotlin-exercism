class Hamming {

    companion object {
        fun compute(strandA: String, strandB: String): Int {
            if (strandA.length != strandB.length) throw IllegalArgumentException("left and right strands must be of equal length.")

            return strandA.zip(strandB).fold(0, { acc, pair ->
                acc + if (pair.first == pair.second) 0 else 1
            })
        }
    }
}