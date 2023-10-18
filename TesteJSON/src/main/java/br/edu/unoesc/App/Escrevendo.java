package br.edu.unoesc.App;

import java.io.FileWriter;
import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONObject;

import br.edu.unoesc.model.Aluno;

public class Escrevendo {
	public static void main(String[] args) throws Exception {
		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();
		aluno1.setId(1);
		aluno1.setNome("Otilia");
		aluno1.setSobrenome("Barbosa");
		aluno1.setIdade(20);
		aluno1.setNota(10.0);
		aluno2.setId(2);
		aluno2.setNome("Maria");
		aluno2.setSobrenome("Silva");
		aluno2.setIdade(25);
		aluno2.setNota(9.9);
		JSONObject jsonObj1 = new JSONObject();
		jsonObj1.put("id", aluno1.getId());
		jsonObj1.put("nome", aluno1.getNome());
		jsonObj1.put("sobrenome", aluno1.getSobrenome());
		jsonObj1.put("idade", aluno1.getIdade());
		jsonObj1.put("nota", aluno1.getNota());
		JSONObject jsonObj2 = new JSONObject();
		jsonObj2.put("id", aluno2.getId());
		jsonObj2.put("nome", aluno2.getNome());
		jsonObj2.put("sobrenome", aluno2.getSobrenome());
		jsonObj2.put("idade", aluno2.getIdade());
		jsonObj2.put("nota", aluno2.getNota());
		JSONArray jsonArray = new JSONArray();
		jsonArray.put(jsonObj1);
		jsonArray.put(jsonObj2);
		// System.out.println(jsonArray);
		FileWriter writeFile = null;
		try {
			writeFile = new FileWriter("saida.json");
			writeFile.write(jsonArray.toString());
			writeFile.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}