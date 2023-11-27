import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class main {

    public static void main(String[] args) throws Exception {
        List<Values> listValues = generateData(); // Simula a api
//        listValues.forEach(value -> System.out.println(value.getValues()));

        System.out.println();


//        for (Values value : listValues){
//
//            System.out.println(value.getName() + "\n");
//            List<String> headers = value.getHeaders();
//            List<String> headerCSV = new ArrayList<>();
//
//            StringJoiner joiner = new StringJoiner("; ");
//            for (String header : headers) {
//                joiner.add(header);
//            }
//            headerCSV.add(joiner.toString());
////
////            headerCSV.forEach(System.out::print);
////            headers.forEach(System.out::print);
//
//
////            List<List<String>> values = value.getValues();
////
////            List<String> valuesCSV = new ArrayList<>();
////
////            for (List<String> lista : values) {
////                for (String elemento : lista) {
////                    joiner.add(elemento);
////                }
////                valuesCSV.add(joiner.toString());
////            }
////
////            headerCSV.forEach(h -> System.out.print(h));
////
////            // Exibindo as linhas formatadas
////            for (String linha : valuesCSV) {
////                System.out.println(linha);
////            }
////            System.out.println();
//
//
//        }







    }

    public static List<Values> generateData(){
        List<String> headers = new ArrayList<>();
        headers.add("Header 01");
        headers.add("Header 02");
        headers.add("Header 03");

        List<String> subL01 = new ArrayList<>();
        subL01.add("Value 01");
        subL01.add("Value 02");
        subL01.add("Value 03");
        subL01.add("Value 04");
        subL01.add("Value 05");

        List<String> subL02 = new ArrayList<>();
        subL02.add("Value 01");
        subL02.add("Value 02");
        subL02.add("Value 03");
        subL02.add("Value 04");
        subL02.add("Value 05");

        List<List<String>> randomValues01 = new ArrayList<>();
        randomValues01.add(subL01);
        randomValues01.add(subL02);

        Values value01 =  new Values("Value 01", headers, randomValues01);
        Values value02 =  new Values("Value 02", headers, randomValues01);

        List<Values> listValues = new ArrayList<>();
        listValues.add(value01);
        listValues.add(value02);

        return listValues;
    }
}


