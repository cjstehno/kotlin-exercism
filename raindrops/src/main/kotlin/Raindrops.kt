class Raindrops {

    companion object {
        fun convert(number: Int): String {
            val drops = mutableListOf<String>()

            if (number % 3 == 0) {
                drops.add("Pling")
            }

            if (number % 5 == 0) {
                drops.add("Plang")
            }

            if (number % 7 == 0) {
                drops.add("Plong")
            }

            if (drops.isEmpty()) {
                drops.add(number.toString())
            }

            return drops.joinToString(separator = "")
        }
    }
}