package telematiker.structure.adapter;

import java.io.PrintStream;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

public class AdapterSpec {

	private static final Integer EXPECATED_VALUE = 100;

	@Test
	public void test1() {
		NumeraryWalletImplementation interfaceInstance = new NumeraryWalletImplementation(
				100);
		StringWallet adapt = interfaceInstance.adapt(StringWallet.class);
		Assert.assertNotNull(adapt);
	}

	@Test(expected = RuntimeException.class)
	public void test2() {
		NumeraryWalletImplementation interfaceInstance = new NumeraryWalletImplementation(
				100);
		interfaceInstance.adapt(Object.class);

	}

	@Test
	public void test3() {
		NumeraryWalletImplementation interfaceInstance = new NumeraryWalletImplementation(
				EXPECATED_VALUE);
		StringWallet adapt = interfaceInstance.adapt(StringWallet.class);
		String value = adapt.getValue();
		Assert.assertEquals(EXPECATED_VALUE.toString(), value);

	}

	@Test
	public void test4() {
		StringWallet interfaceInstance = new StringWalletImpl(
				EXPECATED_VALUE.toString());
		WalletPrinter printer = new WalletPrinter(interfaceInstance);

		Answer<Void> answer = new Answer<Void>() {

			public Void answer(InvocationOnMock invocation) throws Throwable {
				Assert.assertEquals(EXPECATED_VALUE.toString(),
						(String) invocation.getArguments()[0]);
				return null;
			}
		};

		printer.print(mockPrintStream(answer));

	}

	@Test
	public void test5() {
		NumeraryWalletImplementation interfaceInstance = new NumeraryWalletImplementation(
				EXPECATED_VALUE);
		WalletPrinter printer = new WalletPrinter(interfaceInstance);

		Answer<Void> answer = new Answer<Void>() {

			public Void answer(InvocationOnMock invocation) throws Throwable {
				Assert.assertEquals(EXPECATED_VALUE.toString(),
						(String) invocation.getArguments()[0]);
				return null;
			}
		};

		printer.print(mockPrintStream(answer));

	}

	public PrintStream mockPrintStream(Answer<Void> answer) {
		PrintStream stream = Mockito.mock(PrintStream.class);
		Mockito.doAnswer(answer).when(stream).println(Mockito.anyString());
		return stream;
	}

	@Test
	public void test6() {
		StringWallet interfaceInstance = new NumeraryWalletImplementation(
				EXPECATED_VALUE).adapt(StringWallet.class);
		WalletPrinter printer = new WalletPrinter(interfaceInstance);

		Answer<Void> answer = new Answer<Void>() {

			public Void answer(InvocationOnMock invocation) throws Throwable {
				Assert.assertEquals(EXPECATED_VALUE.toString(),
						(String) invocation.getArguments()[0]);
				return null;
			}
		};

		printer.print(mockPrintStream(answer));

	}
}
