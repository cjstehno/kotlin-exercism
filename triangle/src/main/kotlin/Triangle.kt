class Triangle constructor(val a: Number, val b: Number, val c: Number) {

    init {
        exists()
        check(a, b, c)
        check(a, c, b)
        check(b, c, a)
    }

    val isEquilateral: Boolean
        get() {
            return a == b || b == c
        }

    val isIsosceles: Boolean
        get() {
            return a == b || a == c || b == c
        }

    val isScalene: Boolean
        get() {
            return a != b && a != c && b != c
        }

    private fun check(x: Number, y: Number, z: Number) {
        if (x.toDouble() + y.toDouble() < z.toDouble()) {
            throw IllegalArgumentException("$x + $y >= $z check failed.")
        }
    }

    private fun exists() {
        if (a.toDouble() + b.toDouble() + c.toDouble() == 0.0) {
            throw IllegalArgumentException("$a + $b + $c == 0 check failed.")
        }
    }
}