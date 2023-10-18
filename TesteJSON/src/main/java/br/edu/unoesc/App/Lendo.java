package br.edu.unoesc.App;

import java.io.BufferedReader;

import org.json.JSONArray;
import org.json.JSONObject;

import br.edu.unoesc.model.Aluno;

public class Lendo {
	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		try {
// para json com um jsonArray
// String json =
//"[{\"nome\":\"Otilia\",\"id\":1,\"sobrenome\":\"Barbosa\"},{\"nome\":\"Maria\",\"id\":2,\"sobrenome\":\"Silva\"}]";
			java.io.FileReader fr = new java.io.FileReader("saida.json");
			java.io.BufferedReader br = new BufferedReader(fr);
			StringBuilder json = new StringBuilder();
			String line;
			while ((line = br.readLine()) != null) {
				json = json.append(line);
			}
			br.close();
			fr.close();
			JSONArray jsonArray = new JSONArray(json.toString());
			System.out.println(jsonArray);
			for (int x = 0; x < jsonArray.length(); x++) {
				JSONObject jsonObject = jsonArray.getJSONObject(x);
				aluno.setId(jsonObject.getInt("id"));
				aluno.setNome(jsonObject.getString("nome"));
				aluno.setSobrenome(jsonObject.getString("sobrenome"));
				aluno.setIdade(jsonObject.getInt("idade"));
				aluno.setNota(jsonObject.getDouble("nota"));
				System.out.println(aluno.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}