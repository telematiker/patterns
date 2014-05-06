package telematiker.structure.adapter;

public class StringWalletImpl implements StringWallet {

	private String value;

	public StringWalletImpl(String value) {
		this.value = value;
	}

	public String getValue() {
		return this.value;
	}

}
