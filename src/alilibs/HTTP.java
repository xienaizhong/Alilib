package alilibs ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.MultiThreadedHttpConnectionManager;
import org.apache.commons.httpclient.methods.GetMethod;


public class HTTP {

	private static HttpClient httpClient;

	public static String getString(String url) {
		MultiThreadedHttpConnectionManager connectionManager = new MultiThreadedHttpConnectionManager();
		if (httpClient == null)
			httpClient = new HttpClient(connectionManager);
		// if(httpClient==null) httpClient =new DefaultHttpClient();
		HttpMethod getMethod = new GetMethod(url);
                
                
                
                
                

		try {
			int response = httpClient.executeMethod(getMethod); // ����GET����

			//byte[] responseBody = getMethod.getResponseBodyAsStream();
			InputStream inputStream = getMethod.getResponseBodyAsStream(); 
			BufferedReader br = new BufferedReader(new InputStreamReader(inputStream)); 
			StringBuffer stringBuffer = new StringBuffer(); 
			String str= ""; 
			while((str = br.readLine()) != null)
			{ stringBuffer .append(str ); }

			return stringBuffer.toString();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return "errorerror_unknowcode";

	}

	public static byte[] getBin(String url) {
		MultiThreadedHttpConnectionManager connectionManager = new MultiThreadedHttpConnectionManager();
		if (httpClient == null)
			httpClient = new HttpClient(connectionManager);
		// if(httpClient==null) httpClient =new DefaultHttpClient();
		HttpMethod getMethod = new GetMethod(url);

		try {
			int response = httpClient.executeMethod(getMethod);
			byte[] responseBody = getMethod.getResponseBody();
			return responseBody;
		} catch (HttpException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

		return null;

	}

}
