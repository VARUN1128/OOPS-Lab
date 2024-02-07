import java.io.*;

class ReadFile{
	public static void main(String args[]){
		String flname = args[0];
		FileInputStream fin;
		try{	
			fin = new FileInputStream(flname); 	
		}catch(FileNotFoundException e){
			System.out.println("The Specified File Does not Exist");
			return;
		}
		
		try{
			String inputVals;
			int val = fin.read();
			while(val != -1){
				System.out.print((char) val);
				val = fin.read();
			}
			System.out.println();
		}catch(IOException e){
		
			System.out.println("Error , Cannot read from file");	
		}finally {
			try {
				fin.close();
			}catch (IOException e ) {
				System.out.println("Unable To Close File");
				System.out.println(e);
			}
		}
		
	
		
	}
}
