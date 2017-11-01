class Acronym {

    companion object {
        fun generate(phrase: String): String {
            return phrase.split(Regex("[ -]")).joinToString(separator = "") { word ->
                if (isAllCaps(word)) {
                    word[0].toString()
                } else {
                    acronymize(word)
                }
            }
        }

        private fun acronymize(word: String): String = word.filterIndexed { idx, ch ->
            ch.isLetter() && (ch.isUpperCase() || (idx > 0 && word[idx - 1] == '-') || idx == 0)
        }.map(Char::toUpperCase).joinToString(separator = "")

        private fun isAllCaps(word: String): Boolean = word.all { !it.isLetter() || it.isUpperCase() }
    }
}