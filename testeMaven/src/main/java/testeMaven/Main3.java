package testeMaven;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

public class Main3 {

	public static void main(String[] args) throws IOException {
		Reader reader = Files.newBufferedReader(Paths.get("pessoas.csv"));
		CSVReader csvReader = new CSVReaderBuilder(reader).withSkipLines(1).build();
		List<String[]> pessoas = new ArrayList<String[]>();
		try {
			pessoas = csvReader.readAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		for (String[] p : pessoas)
			System.out.println("Nome : " + p[0] + " - Idade : " + p[1] + " - Email : " + p[2]);
	}

}
