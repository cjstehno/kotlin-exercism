class Luhn {

    companion object {
        fun isValid(number: String): Boolean {
            if (!number.all { it.isDigit() || it.isWhitespace() }) return false

            val sum = number.filter { it.isDigit() }
                .map { Integer.parseInt(it.toString()) }
                .asReversed()
                .mapIndexed { index, dig ->
                    if (index % 2 != 0) {
                        val doubled = dig * 2
                        if (doubled > 9) {
                            doubled - 9
                        } else {
                            doubled
                        }
                    } else {
                        dig
                    }
                }
                .sum()

            return (sum == 0 && number.count { it == '0' } > 1) || (sum != 0 && sum % 10 == 0)
        }
    }
}