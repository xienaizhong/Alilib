package alilibs ;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;


public class Mt5ToMC {

	public static void main(String[] args) throws IOException {
		
		String filename = "/Volumes/新加卷/mc data/XAGUSD.log";
		
		
		
		File file = new File(filename);
    	FileReader fr = new FileReader(file);
    	   BufferedReader bf = new BufferedReader(fr);
    	PrintWriter pw = new PrintWriter(new File(filename+".min"));
    	
    	   
    	boolean flag = false ;
    	String x="";
    	String result = "";
    	
    	while((x=bf.readLine())!=null)
    	{
    		
    		//System.out.println(x);
    		if(!x.contains("f u c k y o u ")) continue ;
    		
    		String[] strs = x.split("f u c k y o u ");
    		
    		//System.out.println(strs[1]);
    		result="";
    		for(char c : strs[1].toCharArray())
    		{
    			
    			flag = c=='0'||c=='1'||c=='2'||c=='3'||c=='4'||c=='5'||c=='6'||c=='7'||c=='8'||
    					c=='9'||c==':'||c=='/'||c==','||c=='.';
    			
    			
    			if(flag)
    			{
    				result += c ;
    			}
    			
    		}
    		
    		//
    		
    		pw.print(  result+"\r\n");
    		pw.flush();
    		
    		//return ;
    		
    	}
		
		pw.close();
		System.out.println("--------------OK---------------");
	}

}
