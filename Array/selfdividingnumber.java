class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();

	for (int number = left; number <= right; number++) {
		if (number % 10 == 0) {
			continue;
		}
		int tmp = number;

		while (tmp > 0) {
			if ((tmp % 10 == 0) || (number % (tmp % 10)) != 0) {
				break;
			}

			tmp = tmp / 10;
		}

		if (tmp == 0) {
			result.add(number);
		}
	}

	return result;

    }
}