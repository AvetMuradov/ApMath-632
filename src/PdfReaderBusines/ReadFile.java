package PdfReaderBusines;

import java.io.FileWriter;
import java.io.IOException;

import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;

public class ReadFile {

	public static void main(String[] args) {
		 try {
             
	            PdfReader reader = new PdfReader("C:/Users/user/Desktop/1.pdf");
	            System.out.println("This PDF has "+reader.getNumberOfPages()+" pages.");
//	            String page = PdfTextExtractor.getTextFromPage(reader, 2);
	            String page = PdfTextExtractor.getTextFromPage(reader, 5);
	            String[] test =  page.split("\r");
	            System.out.println("Page Content:\n\n"+page+"\n");
	            System.out.println("Is this document tampered: "+reader.isTampered());
	            System.out.println("Is this document encrypted: "+reader.isEncrypted());
	 
	            try {
	    			FileWriter wr = new FileWriter("12.txt",true);
	    			for(String a: test){
	    				wr.write(a + "\r");
	    			}
	    				wr.close();
	    		} catch (IOException e) {
	    			// TODO Auto-generated catch block
	    			e.printStackTrace();
	    		}
	    		
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	}

}
