package pl.einstain.carrots;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;

public class Main {
	
	public static void main(String[] args) {
		try {
			czytajZPlikuBinarny();
			piszDoPlikuZnakowy();
			czytajZPlikuZnakowy();
			czytajZPlikuBuforowane();
			piszDoPlikuBuforowane();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void czytajZPlikuBinarny()
			throws IOException {
		InputStream in = null;
		try {
			in = new FileInputStream("plik.txt");
			System.out.println((char) in.read());
			System.out.println(Integer.valueOf(in.read()));
		} finally {
			in.close();
		}
	}
	
	public static void piszDoPlikuZnakowy()
			throws IOException {
		try (Writer out = new FileWriter("plik2.txt")) {
			out.write("Kot ma ale");
		}
	}
	
	public static void czytajZPlikuZnakowy()
		throws IOException {
		Reader reader = null;
		try {
			reader = new FileReader("plik2.txt");
			System.out.println(reader.read());
		} catch (IOException e) {
			throw e;
		} finally {
			reader.close();
		}
	}
	
	public static void czytajZPlikuBuforowane()
			throws IOException {
		Reader reader = new FileReader("plik2.txt");
		BufferedReader in = new BufferedReader(reader);
		System.out.println(in.readLine());
		in.close();
	}
	
	public static void piszDoPlikuBuforowane()
		throws IOException {
		OutputStream oStream = new FileOutputStream("plik3.txt");
		PrintWriter pw = new PrintWriter(oStream, true);
		pw.println("Tak jak w System.out.println(\"TEKST\");");
		pw.close();
	}
	

}
