package racingcar

fun main() {
	val (inputMembers, inputTryCount) = InputView.readInput()

	val members = InputParser.parseMembers(inputMembers)
	val tryCount = InputParser.parseTryCount(inputTryCount)

	InputValidator.validateMember(members)
	InputValidator.validateTryCount(tryCount)

	val cars = members.map { name ->
		Car(name)
	}
	
	RacingCar.racingStart(cars, tryCount)
}
