package _05_vault;

public class JamesBond {
	int findCode(Vault v) {
		for (int i = 0; i < 100000000; i++) {
			if (v.tryCode(i) == true) {
				return i;
			}
		}
		return -1;
	}
}
