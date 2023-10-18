package testeMaven;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVWriter;

public class Main {

	public static void main(String[] args) throws IOException {

		String[] cabecalho = { "nome", "idade", "email" };
		List<String[]> linhas = new ArrayList<String[]>();
		linhas.add(new String[] { "Joao", "19", "joao@unoesc.edu.br" });
		linhas.add(new String[] { "Maria", "20", "maria@unoesc.edu.br" });
		linhas.add(new String[] { "Ana", "18", "ana@unoesc.edu.br" });
		
		
		Writer writer = Files.newBufferedWriter(Paths.get("pessoas.csv"));
		CSVWriter csvWriter = new CSVWriter(writer);

		csvWriter.writeNext(cabecalho);
		csvWriter.writeAll(linhas);

		csvWriter.flush();
		csvWriter.close();
		writer.close();
	}
}