import java.util.ArrayList;
import java.util.List;

public class Values {

    private String name;
    private List<String> headers = new ArrayList<>();
    private List<List<String>> values = new ArrayList<>();

    public Values(String name, List<String> headers, List<List<String>> values) {
      this.name = name;
      this.headers = headers;
      this.values = values;
    }

    public Values(){}

    public String getName() {
        return name;
    }

    public List<String> getHeaders() {
        return headers;
    }

    public List<List<String>> getValues() {
        return values;
    }

    public void addHeader(String header){
        this.headers.add(header);
    }

    public void addValues(List<String> lista){
        this.values.add(lista);
    }

    public void addName(String name){
        this.name = name;
    }




    @Override
    public String toString() {
        return "Values{" +
                "name='" + name + '\'' +
                ", headers=" + headers +
                ", values=" + values +
                '}';
    }
}
