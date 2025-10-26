package racingcar

object InputParser {
    private const val DELIMITER = ","

    fun parseMembers(members: String): List<String> {
        return members.split(DELIMITER)
    }

    fun parseTryCount(inputTryCount: String): Int {
        val tryCount = inputTryCount.toIntOrNull() ?: throw IllegalArgumentException("시도 횟수는 숫자여야 합니다.")

        return tryCount
    }
}