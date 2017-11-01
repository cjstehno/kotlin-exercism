import java.text.DecimalFormat

class SpaceAge constructor(val ageInSeconds: Long) {

    fun onEarth(): Double {
        return age(1.0)
    }

    fun onMercury(): Double {
        return age(0.2408467)
    }

    fun onVenus(): Double {
        return age(0.61519726)
    }

    fun onMars(): Double {
        return age(1.8808158)
    }

    fun onJupiter(): Double {
        return age(11.862615)
    }

    fun onSaturn(): Double {
        return age(29.447498)
    }

    fun onUranus(): Double {
        return age(84.016846)
    }

    fun onNeptune(): Double {
        return age(164.79132)
    }

    private fun earth(): Double {
        return ageInSeconds / 31557600.0
    }

    private fun age(divisor: Double): Double {
        return trim(earth() / divisor)
    }

    private companion object {
        private val FORMAT = DecimalFormat("0.00")

        fun trim(number: Double): Double {
            return FORMAT.format(number).toDouble()
        }
    }
}