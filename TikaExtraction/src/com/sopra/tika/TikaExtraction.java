package com.sopra.tika;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Base64;

import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.AutoDetectParser;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.Parser;
import org.apache.tika.sax.BodyContentHandler;

import org.xml.sax.SAXException;

public class TikaExtraction {
	
public static void main(final String[] args) throws IOException,SAXException, TikaException {

   //Assume sample.txt is in your current directory
   File file = new File("sample.pdf");
   Base64
   //parse method parameters
   Parser parser = new AutoDetectParser();
   BodyContentHandler handler = new BodyContentHandler();
   Metadata metadata = new Metadata();
   FileInputStream inputstream = new FileInputStream(file);
   ParseContext context = new ParseContext();
   
   //parsing
the file
   parser.parse(inputstream, handler, metadata, context);
   
   System.out.println("File content : " + handler.toString());
   
 //getting metadata of the document
   System.out.println("Metadata of the PDF:");
   String[] metadataNames = metadata.names();
   System.out.println("----------------------------------");
   System.out.println("----------------------------------");
   for(String name : metadataNames) {
      System.out.println(name+ " : " + metadata.get(name));
   }
   }
}