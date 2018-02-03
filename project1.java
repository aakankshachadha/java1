package class4;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.lang.NullPointerException;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

public class project1 {
	public static void main(String args[]) throws IOException{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter path of file");
		String s= scan.nextLine();
		FileInputStream in=new FileInputStream(s);
		try {
		int start;
		String path="";
		String path2="";
		while((start=in.read())!=10) {
			path=path+(char)start;
			
		}System.out.println(path.substring(0,path.length()-1));
		recursive(path.substring(0,path.length()-1));
		while((start=in.read())!=10) {
			path2=path2+(char)start;
		}System.out.println(path2);
		}
		catch(FileNotFoundException e) {
			System.out.println("file not found");
		}finally {
			if(in!=null) {
				in.close();
			}
		}

	
	}
	public static void recursive(String directory)
	{  
		String path2=new String();
	    File fout=new File(path2);
		ArrayList<File> list=new ArrayList<File>();
		Iterator itr=list.iterator();
		File file1=new File(directory);
		File[] files=file1.listFiles();
		for(File file:files) {
			if(file.isFile()) {
				list.add(file);
				
			}else if(file.isDirectory()){
					recursive(file.getAbsolutePath());
				}
			}
		while(itr.hasNext()) {
		 File file=(File)itr.next();
		 System.out.println(file.getName());
	
	
	}
	
}
}

					
		



 
        	 
//public static void recursive(File m)






