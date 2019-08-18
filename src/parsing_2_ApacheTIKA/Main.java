package parsing_2_ApacheTIKA;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.microsoft.ooxml.OOXMLParser;
import org.apache.tika.parser.pdf.PDFParser;
import org.apache.tika.sax.BodyContentHandler;
import org.xml.sax.SAXException;

public class Main {

	static int countOccurences(String string, String word) {
		String temp[] = string.split("[\\s\\W]+");
		int count = 0;
		for (int i = 0; i < temp.length; i++) {
			System.out.println(i + " : " + temp[i]);
			if (word.equals(temp[i])) {
				count++;
				System.out.println(i + " : " + temp[i] + " ===> " + count);
			}
		}

		return count;
	}

	public int seniorite(int count, String seniorite) {
		int score;
		if(seniorite == "DEBUTANT") {
			score = count;
		} else if (seniorite == "JUNIOR") {
			score = count/2;
		} else if (seniorite == "CONFIRME") {
			score = count/4;
		} else if (seniorite == "SENIOR") {
			score = count/6;
		} else {
			score = count/8;
		}
		return score;
	}

	public static void main(final String[] args) throws IOException, TikaException {
		
		String Text = "This is something JAVA,\nElse\tJAVA{\t test\nJAVA]JAVA=JAVA*\nTest";
		countOccurences(Text, "JAVA");

//		BodyContentHandler handler = new BodyContentHandler();
//		Metadata metadata = new Metadata();
//		FileInputStream inputstream = new FileInputStream(
//				new File("C:/Users/DELL/Documents/Projects/Workspace_sts/parsing_2_ApacheTIKA/resources/Resume.pdf"));
//		ParseContext pcontext = new ParseContext();
//
//		// parsing the document using PDF parser
//		PDFParser pdfparser = new PDFParser();
//		try {
//			pdfparser.parse(inputstream, handler, metadata, pcontext);
//		} catch (SAXException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		// getting the content of the document
//		System.out.println("\n\n\n\t" + countOccurences(handler.toString(), "C++") + "\n\n\n");
//		System.out.println("\n\n\n\t" + countOccurences(handler.toString(), "JAVA") + "\n\n\n");
//		System.out.println("\n\n\n\t" + countOccurences(handler.toString(), "JEE") + "\n\n\n");
//		System.out.println("\n\n\n\t" + countOccurences(handler.toString(), "HTML") + "\n\n\n");
//		System.out.println("\n\n\n\t" + countOccurences(handler.toString(), "CSS") + "\n\n\n");
//		System.out.println("\n\n\n\t" + countOccurences(handler.toString(), "COBOL") + "\n\n\n");
////		System.out.println("Contents of the PDF :" + handler.toString());
//
//		// getting metadata of the document
////		System.out.println("Metadata of the PDF:");
////		String[] metadataNames = metadata.names();
////
////		for (String name : metadataNames) {
////			System.out.println(name + " : " + metadata.get(name));
////		}
//
//		// detecting the file type
//		BodyContentHandler handler_2 = new BodyContentHandler();
//		Metadata metadata_2 = new Metadata();
//		FileInputStream inputstream_2 = new FileInputStream(new File("C:/Users/DELL/Documents/Projects/Workspace_sts/parsing_2_ApacheTIKA/resources/Resume.docx"));
//		ParseContext pcontext_2 = new ParseContext();
//
//		// OOXml parser
//		OOXMLParser msofficeparser = new OOXMLParser();
//		try {
//			msofficeparser.parse(inputstream_2, handler_2, metadata_2, pcontext_2);
//		} catch (SAXException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println("Contents of the document:" + handler_2.toString());
//		System.out.println("Metadata of the document:");
//		String[] metadataNames = metadata_2.names();
//
//		for (String name : metadataNames) {
//			System.out.println(name + ": " + metadata_2.get(name));
//		}

	}
}
