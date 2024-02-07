import java.io.*;

class DuplicateFile{
	public static void main(String args[]){
		String flnameIn = args[0];
		String flnameOut = args[1];
		FileInputStream fin;
		FileOutputStream fout;
		
		try{	
		
			fin = new FileInputStream(flnameIn); 
			fout =  new FileOutputStream(flnameOut);	
			
		}catch(FileNotFoundException e){
			System.out.println("The Specified File Does not Exist");
			return;
		}
		
		try{
			String inputVals;
			int val = fin.read();
			while(val != -1){
				//System.out.print((char) val);
				fout.write((char) val);
				val = fin.read();
			}
			System.out.println("Copying Contents Completed");
		}catch(IOException e){
		
			System.out.println("Error , Cannot read/write the file");	
		}finally {
			try {
				fin.close();
				fout.close();
			}catch (IOException e ) {
				System.out.println("Unable To Close File");
				System.out.println(e);
			}
		}
	}
}
