package _05_vault;

public class Vault {
	int code = 12423453;
	
	boolean tryCode(int c) {
		if (c == code) {
			return true;
		}else {
			return false;
		}
	}
}
