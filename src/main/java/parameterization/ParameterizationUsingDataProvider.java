package parameterization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParameterizationUsingDataProvider {

	@DataProvider
	public Object[][] getData() {

		Object[][] data = new Object[3][2];

		data[0][0] = "faizan6881@gmail.com";
		data[0][1] = "qwerty";

		data[1][0] = "msiddique@xavient.com";
		data[1][1] = "april@2020";

		data[2][0] = "mohdfaizan.siddique@telusinternational.com";
		data[2][1] = "march@2020";

		return data;

	}

	@Test(dataProvider = "getData")
	public void doLogin(String Username, String Password) {

		System.out.println(Username + "---" + Password);

	}

}
