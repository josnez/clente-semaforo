package presentacion;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;

public class JSONReadFromTheFileTest {
    public static void main(String[] args) {
        JSONParser parser = new JSONParser();
        try {
            Object obj = parser.parse(new FileReader("src/datos/data13-41.json"));
            JSONObject jsonObject = (JSONObject)obj;
            JSONArray confs = (JSONArray)jsonObject.get("CONF");
            System.out.println("confs:");
            Iterator iterator = confs.iterator();
            ArrayList confsConexion = new ArrayList<JSONObject>();
            ArrayList confsDesconexion = new ArrayList<JSONObject>();
            ArrayList confsPlan = new ArrayList<JSONObject>();

            while (iterator.hasNext()) {
                String aux = iterator.next().toString();
                if(aux.indexOf('C')!=-1)
                    confsConexion.add(jsonObject.get(aux));
                else if (aux.indexOf('D')!=-1)
                    confsDesconexion.add(jsonObject.get(aux));
                else
                    confsPlan.add(jsonObject.get(aux));

            }
            System.out.println(confsConexion);
            System.out.println(confsDesconexion);
            System.out.println(confsPlan);

        } catch(Exception e) {
            e.printStackTrace();

        }
    }
}
