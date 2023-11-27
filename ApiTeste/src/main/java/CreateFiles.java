import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CreateFiles {

    public void cadastrarNomes(String nome, String sobrenome, String url){
        criarArquivo(url);

        try{
            List<String> existentes = linhasExistentes(url);
            String linha = nome + ";" + sobrenome + ";";
            existentes.add(linha);

            String todasLinhas = unicaLinha(existentes);
            FileWriter arquivo = new FileWriter(url);
            arquivo.write(todasLinhas);
            arquivo.close();

            // adicionar o csv
        }catch(Exception e){
            System.out.println("Error ao gerar o arquivo " + e.getMessage());
        }
    }

    // cria a csv
    public String unicaLinha(List<String> existentes){
        String unicaLinha = "";
        for (String linha : existentes){
            unicaLinha += linha + "\n";
        }
        return unicaLinha;
    }


    // Criar o arquivo
    public void criarArquivo(String url){
        try{
            File arquivo = new File(url);
            arquivo.createNewFile();

        } catch(Exception e){
            System.out.println("Erro ao criar o arquivo " + e.getMessage());
        }
    }

    // Verifica quantas linhas tem
    public List<String> linhasExistentes(String url){
        List<String> result = new ArrayList<>();
        try{
            Path path = Paths.get(url);
            result = Files.readAllLines(path);
        } catch(Exception e){
            System.out.println("Erro ao ler o arquivo " + e.getMessage());
        }
        return result;
    }
}
