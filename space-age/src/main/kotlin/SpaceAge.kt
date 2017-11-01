class SpaceAge constructor(val ageInSeconds: Long) {

    private val earth: Double = ageInSeconds / 31557600.0

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

    private fun age(divisor: Double): Double {
        return Math.round(100.0 * earth / divisor) / 100.0
    }
}