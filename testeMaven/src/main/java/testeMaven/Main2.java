package testeMaven;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;

import testeMaven.entidades.Pessoa;

public class Main2 {

	public static void main(String[] args) throws IOException {
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(new Pessoa("Joao", 19, "joao@unoesc.edu.br"));
		pessoas.add(new Pessoa("Maria", 20, "maria@unoesc.edu.br"));
		Writer writer = Files.newBufferedWriter(Paths.get("pessoas2.csv"));
		StatefulBeanToCsv<Pessoa> beanToCsv = new StatefulBeanToCsvBuilder<Pessoa>(writer).build();
		try {
			beanToCsv.write(pessoas);
		} catch (Exception e) {
			e.printStackTrace();
		}
		writer.flush();
		writer.close();
	}

}
