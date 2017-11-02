class HandshakeCalculator {

    companion object {
        fun calculateHandshake(value: Int): List<Signal> {
            val signals = mutableListOf<Signal>()

            if (isBitSet(value, 0)) signals += Signal.WINK
            if (isBitSet(value, 1)) signals += Signal.DOUBLE_BLINK
            if (isBitSet(value, 2)) signals += Signal.CLOSE_YOUR_EYES
            if (isBitSet(value, 3)) signals += Signal.JUMP
            if (isBitSet(value, 4)) signals.reverse()

            return signals
        }

        private fun isBitSet(value: Int, n: Int) = value.and(1.shl(n)) != 0
    }
}