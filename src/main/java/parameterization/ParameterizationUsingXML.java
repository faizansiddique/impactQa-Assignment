package parameterization;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationUsingXML {

	@Test
	@Parameters({ "browser" })
	public void parameters(String browser) {

		System.out.println(browser);
	}
}
