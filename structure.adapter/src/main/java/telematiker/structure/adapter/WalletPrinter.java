package telematiker.structure.adapter;

import java.io.PrintStream;

public class WalletPrinter {

	private StringWallet wallet;
	
	public WalletPrinter(StringWallet wallet) {
		this.wallet = wallet;
	}
	
	public WalletPrinter(NumeraryWalletImplementation wallet) {
		this.wallet = wallet.adapt(StringWallet.class);
	}
	
	public void print(PrintStream stream){
		String value = wallet.getValue();
		stream.println(value);
	}
	
}
