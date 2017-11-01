class Raindrops {

    companion object {
        fun convert(number: Int): String {
            val drops = mutableListOf<String>()

            if (number % 3 == 0) drops += "Pling"
            if (number % 5 == 0) drops += "Plang"
            if (number % 7 == 0) drops += "Plong"
            if (drops.isEmpty()) drops += number.toString()

            return drops.joinToString(separator = "")
        }
    }
}