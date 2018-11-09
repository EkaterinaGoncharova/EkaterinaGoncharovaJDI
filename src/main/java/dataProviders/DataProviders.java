package dataProviders;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import entities.MetalsAndColorsData;
import org.testng.annotations.DataProvider;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.Map;

public class DataProviders {

    @DataProvider
    public Object[] metalsAndColorsDataProvider() throws FileNotFoundException {
        JsonReader jsonReader = new JsonReader(new FileReader("src\\test\\resources\\metalsAndColorsDataSet.json"));
        Type typeToken = new TypeToken<Map<String, MetalsAndColorsData>>() {
        }.getType();
        Map<String, MetalsAndColorsData> map = new Gson().fromJson(jsonReader, typeToken);
        return map.values().toArray();
    }
}
