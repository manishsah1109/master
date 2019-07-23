package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesfileCall {
	
	Properties prop=new Properties();
	public void properties() throws IOException{
	
	
	
try {
	FileInputStream fis=new FileInputStream("C:\\Adecco\\Eclipse\\PaytmEtoEFrameWork\\Resources\\data.properties");
	
	prop.load(fis);
	
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

	
	}

}
