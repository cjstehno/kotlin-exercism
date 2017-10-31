fun transcribeToRna(dna: String): String {
    return dna.map { ch ->
        when (ch ){
            'G' -> 'C'
            'C' -> 'G'
            'T' -> 'A'
            'A' -> 'U'
            else -> throw IllegalArgumentException()
        }
    }.joinToString(separator = "")
}
