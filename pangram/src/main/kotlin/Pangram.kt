class Pangram {

    companion object {

        fun isPangram(text: String): Boolean {
            return text.filter(Char::isLetter).map(Char::toLowerCase).distinct().size >= 26
        }
    }
}