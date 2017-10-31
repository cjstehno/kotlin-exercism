
class Pangram {

    companion object {

        fun isPangram(text: String) : Boolean {
            val set = mutableSetOf<Char>()

            text.toLowerCase().filter { ch -> ch.isLetter() }.forEach { ch -> set.add(ch) }

            return set.size >= 26
        }
    }
}