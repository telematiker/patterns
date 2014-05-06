package telematiker.structure.adapter;

public class NumeraryWalletImplementation implements NumeraryWallet, Adapter {

	private Integer value;

	public NumeraryWalletImplementation(Integer value) {
		this.value = value;
	}
	
	public <T> T adapt(Class<T> adapter) {
		if (adapter.equals(StringWallet.class))
		{
			return (T) new AdaptedStringWallet(this);
		}
		throw new RuntimeException("cannot be adapted");
	}


	public Integer getValue() {
		return value;
	}
	
	public class AdaptedStringWallet implements StringWallet{

		private NumeraryWalletImplementation numerayWallet;

		public AdaptedStringWallet(
				NumeraryWalletImplementation numeraryWalletImplementation) {
			this.numerayWallet = numeraryWalletImplementation;
		}

		public String getValue() {
			return numerayWallet.getValue().toString();
		}
		
	}

}
