package com.crest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadingWrtingSolutionForCrest implements FileReadingWriting {

	

	public static void main(String[] args) {
		FileReadingWriting fileReadingWriting=new FileReadingWrtingSolutionForCrest();
		System.out.println("----Started---");
		fileReadingWriting.processFile();
		System.out.println("----Ended---");
	}
	
	
	@Override
	public void processFile( ) {
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {

			String sCurrentLine;

			br = new BufferedReader(new FileReader("inputFile.txt"));
			bw = new BufferedWriter(new FileWriter("outputFile.txt"));
			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine.toUpperCase());
				bw.write(sCurrentLine.toUpperCase());
				bw.write("\n");
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
			try {
				if (bw != null)
					bw.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}

	}

}
