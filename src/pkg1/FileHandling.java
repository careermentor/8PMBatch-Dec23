package pkg1;

import java.io.File;

import java.io.FileReader;
import java.io.FileWriter;

import java.util.Properties;

public class FileHandling 
{
	
	public static void readprop() throws Exception
	{
		//File f = new File("./TestData/test.properties");
		FileReader fr = new FileReader("./TestData/test.properties");
		
		Properties prop = new Properties();
		
		prop.load(fr);   //load into memeory
		
		System.out.println(prop.get("name"));
		
		System.out.println(prop.get("automation"));
		
		
		
		
	}

	public static void writedata() throws Exception
	{
		File f = new File("./TestData/xyz.txt");
		FileWriter fw = new FileWriter(f,true);
		
		fw.write("\nThis is forth line of the data");
		fw.flush();  //save
		fw.close();
		
	}
	
	public static void readdata() throws Exception
	{
		//File f = new File("C:\\Users\\Santosh\\Desktop\\abc.txt");   //file connection
		
		File f = new File("./TestData/abc.txt");
		
		FileReader fr = new FileReader(f);
		
				
		int r = fr.read();  //116//104
		
		
		
		while(r!=-1)    //116!=-1
		{
			System.out.print((char)r);
			r=fr.read();  //104
		}
		
	}
	
	
	public static void main(String[] args) throws Exception 
	{
	
		FileHandling.readprop();
	}

}