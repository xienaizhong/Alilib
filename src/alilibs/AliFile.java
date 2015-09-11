/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alilibs;

import java.io.File;
import java.io.IOException;
import java.util.List;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author a
 */
public class AliFile {
    
    public static List<String> getString(String url)
    {
        
        File f = new File(url);
        try {
            return FileUtils.readLines(f);
        } catch (IOException ex) {
            return  null ;
        }
        
        
        
        
    }
    
    
    //
    public static void append(String filename,List<String>list ) throws IOException
    {
        File f = new File(filename);
        FileUtils.writeLines(f, list, true);
        
        
        
    }
    
    public static void delete(String filename) throws IOException
    {
        File f = new File(filename);
        FileUtils.deleteQuietly(f);
        
        
        
    }
    
    public static boolean isExit(String filename)
    {
        
        File f = new File(filename);
        return  f.exists();
        
    }
    
    
}
