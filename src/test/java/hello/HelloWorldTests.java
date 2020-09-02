package hello;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

public class HelloWorldTests {

	private ByteArrayOutputStream baos = new ByteArrayOutputStream();
	private PrintStream ps = new PrintStream(baos);

	@Before
	public void setup() {
		System.setOut(ps);
	}

	@Test
	public void shouldBeTwo() {
		int a = 1+1;
		system.out.println(a);

		assertThat(output(), containsString("2"));
	}

	@Test
	public void shouldPrintHelloWorldToConsole() {
		HelloWorld.main(new String[] { });

		assertThat(output(), containsString("oskour"));
	}

	private String output() {
		return new String(baos.toByteArray(), StandardCharsets.UTF_8);
	}
}
