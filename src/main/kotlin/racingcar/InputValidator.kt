package racingcar

object InputValidator {
	private const val MAX_NAME_LENGTH = 5
	private const val MIN_TRY_COUNT = 1

	fun validateMember(memberList: List<String>) {
		memberList.map { memberName ->
			when {
				memberName.isEmpty() -> throw IllegalArgumentException("참가자 이름은 비어있을 수 없습니다.")
				memberName.length > MAX_NAME_LENGTH -> throw IllegalArgumentException("참가자 이름은 ${MAX_NAME_LENGTH}자 이하여야 합니다.")
				else -> memberName
			}
		}
	}

	fun validateTryCount(tryCount: Int) {
		if (tryCount < MIN_TRY_COUNT) throw IllegalArgumentException("시도 횟수는 $MIN_TRY_COUNT 이상의 정수여야 합니다.")
	}
}