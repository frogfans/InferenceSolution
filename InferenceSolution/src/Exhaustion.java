import java.util.Date;

public class Exhaustion {
	public void handler() {
		for (int a1 = 0; a1 < 4; a1++) {
			for (int a2 = 0; a2 < 4; a2++) {
				for (int a3 = 0; a3 < 4; a3++) {
					for (int a4 = 0; a4 < 4; a4++) {
						for (int a5 = 0; a5 < 4; a5++) {
							for (int a6 = 0; a6 < 4; a6++) {
								for (int a7 = 0; a7 < 4; a7++) {
									for (int a8 = 0; a8 < 4; a8++) {
										for (int a9 = 0; a9 < 4; a9++) {
											for (int a10 = 0; a10 < 4; a10++) {
												int[] is = new int[] { a1, a2, a3, a4, a5, a6, a7, a8, a9, a10 };
												if (q1(is) && q2(is) && q3(is) && q4(is) && q5(is) && q6(is) && q7(is)
														&& q8(is) && q9(is) && q10(is)) {
													output(is);
													return;
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	public boolean q1(int[] is) {
		return true;
	}

	public boolean q2(int[] is) {
		if (is[1] == 0) {
			if (is[4] == 2) {
				return true;
			}
		} else if (is[1] == 1) {
			if (is[4] == 3) {
				return true;
			}
		} else if (is[1] == 2) {
			if (is[4] == 0) {
				return true;
			}
		} else {
			if (is[4] == 1) {
				return true;
			}
		}
		return false;
	}

	public boolean q3(int[] is) {
		int[] options = new int[] { is[2], is[5], is[1], is[3] };
		// 不同的那个选项
		int defferentIndex = 0;
		// 找出选项几不同于其他三项
		if (options[0] == options[1]) {
			if (options[0] == options[2]) {
				defferentIndex = 3;
			} else {
				defferentIndex = 2;
			}
		} else {
			if (options[0] == options[2]) {
				defferentIndex = 1;
			} else {
				defferentIndex = 0;
			}
		}
		// 选项是否为第三题答案
		if (is[2] == defferentIndex) {
			return true;
		} else {
			return false;
		}
	}

	public boolean q4(int[] is) {
		if (is[3] == 0) {
			if (is[0] == is[4]) {
				return true;
			}
		} else if (is[3] == 1) {
			if (is[1] == is[6]) {
				return true;
			}
		} else if (is[3] == 2) {
			if (is[0] == is[8]) {
				return true;
			}
		} else {
			if (is[5] == is[9]) {
				return true;
			}
		}
		return false;
	}

	public boolean q5(int[] is) {
		if (is[4] == 0) {
			if (is[7] == 0) {
				return true;
			}
		} else if (is[4] == 1) {
			if (is[3] == 1) {
				return true;
			}
		} else if (is[4] == 2) {
			if (is[8] == 2) {
				return true;
			}
		} else {
			if (is[6] == 3) {
				return true;
			}
		}
		return false;
	}

	public boolean q6(int[] is) {
		if (is[5] == 0) {
			if (is[7] == is[1] && is[7] == is[3]) {
				return true;
			}
		} else if (is[5] == 1) {
			if (is[7] == is[0] && is[7] == is[5]) {
				return true;
			}
		} else if (is[5] == 2) {
			if (is[7] == is[2] && is[7] == is[9]) {
				return true;
			}
		} else {
			if (is[7] == is[4] && is[7] == is[8]) {
				return true;
			}
		}
		return false;
	}

	public boolean q7(int[] is) {
		// 统计次数最少的
		int[] counts = new int[] { 0, 0, 0, 0 };
		for (int i = 0; i < is.length; i++) {
			if (is[i] == 0) {
				counts[0] = counts[0] + 1;
			} else if (is[i] == 1) {
				counts[1] = counts[1] + 1;
			} else if (is[i] == 2) {
				counts[2] = counts[2] + 1;
			} else {
				counts[3] = counts[3] + 1;
			}
		}
		int minCount = 0;
		for (int i = 0; i < counts.length; i++) {
			if (counts[i] < counts[minCount]) {
				minCount = i;
			}
		}
		if (is[6] == 0) {
			if (minCount == 2) {
				return true;
			}
		} else if (is[6] == 1) {
			if (minCount == 1) {
				return true;
			}
		} else if (is[6] == 2) {
			if (minCount == 0) {
				return true;
			}
		} else {
			if (minCount == 3) {
				return true;
			}
		}
		return false;
	}

	public boolean q8(int[] is) {
		if (is[7] == 0) {
			if (Math.abs(is[6] - is[0]) > 1) {
				return true;
			}
		} else if (is[7] == 1) {
			if (Math.abs(is[4] - is[0]) > 1) {
				return true;
			}
		} else if (is[7] == 2) {
			if (Math.abs(is[1] - is[0]) > 1) {
				return true;
			}
		} else {
			if (Math.abs(is[9] - is[0]) > 1) {
				return true;
			}
		}
		return false;
	}

	public boolean q9(int[] is) {
		// 先考虑真假性
		if (is[0] == is[5]) {
			if (is[8] == 0) {
				if (is[5] != is[4]) {
					return true;
				}
			} else if (is[8] == 1) {
				if (is[9] != is[4]) {
					return true;
				}
			} else if (is[8] == 2) {
				if (is[1] != is[4]) {
					return true;
				}
			} else {
				if (is[8] != is[4]) {
					return true;
				}
			}
		} else {
			if (is[8] == 0) {
				if (is[5] == is[4]) {
					return true;
				}
			} else if (is[8] == 1) {
				if (is[9] == is[4]) {
					return true;
				}
			} else if (is[8] == 2) {
				if (is[1] == is[4]) {
					return true;
				}
			} else {
				if (is[8] == is[4]) {
					return true;
				}
			}
		}
		return false;
	}

	public boolean q10(int[] is) {
		// 统计次数
		int[] counts = new int[] { 0, 0, 0, 0 };
		for (int i = 0; i < is.length; i++) {
			if (is[i] == 0) {
				counts[0] = counts[0] + 1;
			} else if (is[i] == 1) {
				counts[1] = counts[1] + 1;
			} else if (is[i] == 2) {
				counts[2] = counts[2] + 1;
			} else {
				counts[3] = counts[3] + 1;
			}
		}
		int minCount = 0;
		int maxCount = 0;
		for (int i = 0; i < counts.length; i++) {
			if (counts[i] < counts[minCount]) {
				minCount = i;
			}
			if (counts[i] > counts[maxCount]) {
				maxCount = i;
			}
		}
		if (is[9] == 0) {
			if (counts[maxCount] - counts[minCount] == 3) {
				return true;
			}
		} else if (is[9] == 1) {
			if (counts[maxCount] - counts[minCount] == 2) {
				return true;
			}
		} else if (is[9] == 2) {
			if (counts[maxCount] - counts[minCount] == 4) {
				return true;
			}
		} else {
			if (counts[maxCount] - counts[minCount] == 1) {
				return true;
			}
		}
		return false;
	}

	public void output(int[] is) {
		System.out.print("Answer:\t");
		for (int i = 0; i < is.length; i++) {
			switch (is[i]) {
			case 0:
				System.out.print('A');
				break;
			case 1:
				System.out.print('B');
				break;
			case 2:
				System.out.print('C');
				break;
			case 3:
				System.out.print('D');
				break;
			default:
				break;
			}
		}
		System.out.println();
	}

	public void test() {
		int[] is = new int[] { 1, 2, 0, 2, 0, 2, 3, 0, 1, 0 };
		System.out.println("q1:" + q1(is));
		System.out.println("q2:" + q2(is));
		System.out.println("q3:" + q3(is));
		System.out.println("q4:" + q4(is));
		System.out.println("q5:" + q5(is));
		System.out.println("q6:" + q6(is));
		System.out.println("q7:" + q7(is));
		System.out.println("q8:" + q8(is));
		System.out.println("q9:" + q9(is));
		System.out.println("q10:" + q10(is));
	}

	public static void main(String[] args) {
		Date start = new Date();
		System.out.println("Start:\t" + start);
		new Exhaustion().handler();
		Date stop = new Date();
		System.out.println("Stop:\t" + stop);
		System.out.println("Cost time:\t" + (stop.getTime() - start.getTime()) + "ms");
	}
}
