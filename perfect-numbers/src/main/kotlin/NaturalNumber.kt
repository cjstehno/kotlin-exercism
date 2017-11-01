enum class Classification {
    DEFICIENT, PERFECT, ABUNDANT
}

fun classify(naturalNumber: Int): Classification {
    if (naturalNumber < 1) throw IllegalArgumentException()

    val aliquot = computeAliquot(naturalNumber)
    return when {
        aliquot == naturalNumber -> Classification.PERFECT
        aliquot > naturalNumber -> Classification.ABUNDANT
        else -> Classification.DEFICIENT
    }
}

private fun computeAliquot(number: Int): Int = (1 until number).fold(0, { agg, num ->
    when {
        number % num == 0 -> agg + num
        else -> agg
    }
})
