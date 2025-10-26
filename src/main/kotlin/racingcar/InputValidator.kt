package racingcar

object InputValidator {
	fun validateMember(memberList: List<String>) {
		memberList.map { memberName ->
			when {
				memberName.isEmpty() -> throw IllegalArgumentException("참가자 이름은 비어있을 수 없습니다.")
				memberName.length > 5 -> throw IllegalArgumentException("참가자 이름은 5자 이하여야 합니다.")
				else -> memberName
			}
		}
	}

	fun validateTryCount(tryCount: Int) {
		if (tryCount < 1) throw IllegalArgumentException("시도 횟수는 0 이상의 정수여야 합니다.")
	}
}