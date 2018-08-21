package common;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;

/**
 * 
 * @author fs
 * @version 1.0.0
 * @description 文件工具类
 * @date 2018年8月21日 上午10:47:52
 */
public class FileUtil {
	private static FTPClient ftpClient;
	
	
	
	public static void copyFile(String src,String target)
	{	
		File srcFile = new File(src);  
		   File targetFile = new File(target);  
		   try {  
		       InputStream in = new FileInputStream(srcFile);   
		       OutputStream out = new FileOutputStream(targetFile);  
		       byte[] bytes = new byte[1024];  
		       int len = -1;  
		       while((len=in.read(bytes))!=-1)
		       {  
		           out.write(bytes, 0, len);  
		       }  
		       in.close();  
		       out.close();  
		   } catch (FileNotFoundException e) {  
		       e.printStackTrace();  
		   } catch (IOException e) {  
		       e.printStackTrace();  
		   }  

	}
	
	public static List<String>  listFile(String path) {
		List<String> list = new ArrayList<String>();
		File file = new File(path);		//获取其file对象
		File[] fs = file.listFiles();	//遍历path下的文件和目录，放在File数组中
		for(File f:fs){					//遍历File[]数组
			if(!f.isDirectory()) {
				//若非目录(即文件)，则打印
				System.out.println(f);
				list.add(f.toString());
			}	
				
		}
		return list;

	}
	

	public static byte[] readStream(InputStream inStream) throws Exception {  
	    ByteArrayOutputStream outSteam = new ByteArrayOutputStream();  
	    byte[] buffer = new byte[1024];  
	    int len = -1;  
	    while ((len = inStream.read(buffer)) != -1) {  
	        outSteam.write(buffer, 0, len);  
	    }  
	    outSteam.close();  
	    inStream.close();  
	    return outSteam.toByteArray();  
	}  

}
