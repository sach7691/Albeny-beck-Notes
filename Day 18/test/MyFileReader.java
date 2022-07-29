import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


 class BadLineException extends Exception{

    private int line;
 
    public BadLineException(String msg,int line){
         
        super(msg);
        this.line = line;
    }

    public void setLine(int line){

        this.line = line;
    }

    public int getLine(){

        return line;
    }

    @Override
	public String toString(){
	
		return "Error Message : " + super.getMessage() + " | I am in line number : " + this.line;
	}
 

}

class MyFileReader{


public MyFileReader(){


  
}

      public static void main(String[] args){


         MyFileReader myFileReader = new MyFileReader();
         myFileReader.writeMyFile();
         myFileReader.readAndPrint();
         try{
         myFileReader.readMyFile();
         }
         catch(IOException io){

            System.out.println(io);
         }
         catch(BadLineException bl){

            System.out.println(bl.toString());
         }

    
      }

      //readMyFile method======================================================
      public void readMyFile()throws IOException,BadLineException{
      
        FileReader fr = new FileReader("ReadmeWrite.txt");
      
        BufferedReader br = new BufferedReader(fr);

          String word;

          int lines = 0;

          while ((word = br.readLine() ) != null){ //read until EOF

            if(word.startsWith("This is line: ")){

                System.out.println("Yes, Line starts with This is line:");

            }
            else{

                BadLineException ble = new BadLineException("This is line: is Not Exist",lines);

                throw ble;
            }

            lines ++;  
           }

           fr.close();
           br.close();

      }

      //writeMyFile method======================================================
      public void writeMyFile(){

        FileWriter fw = null;

        BufferedWriter bw = null;

        try{
          
          //FileWriter : used to write data (in characters) to files
          fw = new FileWriter("ReadmeWrite.txt");
      
          //BufferedWriter writes text to character output stream
          bw = new BufferedWriter(fw);
         
          //for loop to print until 99
         for(int x = 0 ; x < 100 ; x++){
          
            bw.append("This is line: " + x + "\n");

            fw.flush();
        }

        System.out.println("Successfully wrote to the file.");
    }

    catch(FileNotFoundException fe){

        System.out.println(fe);

    }

    catch(IOException io){

        System.out.println(io);
    }

    finally{

        try{
       
         bw.close();
  
        }
        catch(IOException io){

            System.out.println(io);
        }

      }
    
    }
      
      //readAndPrint method===============================================
      public void readAndPrint(){

        FileReader fr = null;

        BufferedReader br = null;

        try{
        //FileReader : reads character files and reading streams of characters
        fr = new FileReader("Readme.txt");
        
       //BufferedReader : reads any type of characters from input-stream (String,file etc)
        br = new BufferedReader(fr);

        StringBuffer sb =  new StringBuffer();

        String word;

        while ((word = br.readLine() ) != null){ //read until EOF
       
            sb.append(word);

        }

         System.out.println("Content Read : " +sb);

        }
        catch(FileNotFoundException fe){

            System.out.println(fe);

        }

        catch(IOException io){

            System.out.println(io);
        }

        finally{

            try{
                fr.close();
                br.close();
            }
            catch(IOException io){

                System.out.println(io);
            }

        }
        
    }


}