package racingcar

import camp.nextstep.edu.missionutils.Randoms.pickNumberInRange

class RacingCar {
	companion object {
		const val RANDOM_START_NUMBER = 0
		const val RANDOM_END_NUMBER = 9
	}

	fun racingStart(cars: List<Car>, tryRound: Int) {
		repeat(tryRound) {
			roundStart(cars)
		}
	}

	private fun roundStart(cars: List<Car>) {
		cars.forEach {
			val randomNumber = pickNumberInRange(RANDOM_START_NUMBER, RANDOM_END_NUMBER)
		}
	}
}