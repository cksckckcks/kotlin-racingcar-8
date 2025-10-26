package racingcar

object OutputView {
	fun printRoundResult(cars: List<Car>) {
		cars.forEach { car ->
			println("${car.name} : ${"-".repeat(car.position)}")
		}
		println()
	}
}