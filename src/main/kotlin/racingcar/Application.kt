package racingcar

fun main() {
	val racingCar = RacingCar()

	val (inputMembers, inputTryCount) = InputView.readInput()

	val members = InputParser.parseMembers(inputMembers)
	val tryCount = InputParser.parseTryCount(inputTryCount)

	InputValidator.validateMember(members)
	InputValidator.validateTryCount(tryCount)

	val cars = members.map { name ->
		Car(name)
	}


	racingCar.racingStart(cars, tryCount)
}
