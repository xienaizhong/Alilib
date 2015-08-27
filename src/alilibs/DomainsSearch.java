/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alilibs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author a
 */
public class DomainsSearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if(args.length==0)
        args = new String[]{".com","0"};
        
        String houzui  = args[0];
        int x = Integer.valueOf(args[1]);
        try {
            search(x,houzui);
        } catch (Exception ex) {
            Logger.getLogger(DomainsSearch.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
    }
    static PrintWriter pw = null ;
    public static void search(int c,String houzui) throws Exception
    {
        
        
        String path = System.getProperty("user.dir");
         pw = new PrintWriter(new FileOutputStream(new File(path+"/"+System.currentTimeMillis()+"result.txt")));
        
        
        
        
        List<String> list = new ArrayList<String>();
        String [] aaa = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","1","2","3","4","5","6","7","8","","9","0"};
        
        for(int i=0;i<aaa.length;i++)
        {
            
            list.add(aaa[i]);
        }
        
        
        int count = 0;

        
        
        
        for(int i=0;i<list.size();i++)
        {
            for(int j=0;j<list.size();j++)
            {
            for(int k=0;k<list.size();k++)
            {
                for(int l=0;l<list.size();l++)
            {
                count++ ; 
                
                //System.out.println(list.get(i)+""+list.get(j));
                
                if(count <c) continue ;
                
                
                //Thread.sleep(100);
                //http://whois.chinaz.com/ifis009900909.com
                

                
        
                //System.out.println("http://whois.chinaz.com/"+list.get(i)+""+list.get(j)+"fsaffasf.com");
                //http://panda.www.net.cn/cgi-bin/check.cgi?area_domain=
                
                gogo("http://whois.chinaz.com/"+list.get(i)+""+list.get(j)+list.get(k)+houzui,count);
        
        
        
        
                
                
                
                
            }
            
            }
            }
            
            
        }
        
        
        
        
        
        
        
    }
    
    
    
    public static void gogo(String url,int count)
    {
        String result2 = "";
                

                 result2 = HTTP.getString(url);
        if(result2.contains("该域名未被注册"))
        
        {
        System.out.println(url);
        pw.println(url);
        pw.flush();
        
        }
        else
        {
            System.out.println("-"+count);
            pw.println("-"+count);
            pw.flush();
        }
        
        
    }
}
