import java.time.LocalDate
import java.time.LocalDateTime
import java.time.temporal.ChronoUnit

class Gigasecond constructor(private val birthtime: LocalDateTime) {

    constructor(birthdate: LocalDate) : this(birthdate.atStartOfDay())

    val date: LocalDateTime
        get() {
            return birthtime.plus(1_000_000_000, ChronoUnit.SECONDS)
        }
}