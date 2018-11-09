package entities;

import java.util.ArrayList;
import java.util.List;

public class MetalsAndColorsData {
    public Integer[] summary;
    public String[] elements;
    public String color;
    public String metals;
    public String[] vegetables;

    public static List<String> getTextList(MetalsAndColorsData data) {
        List<String> textList = new ArrayList<String>();
        textList.add("Summary: " + String.valueOf(data.summary[0] + data.summary[1]));
        textList.add("Elements: " + String.join(", ", data.elements));
        textList.add("Color: " + data.color);
        textList.add("Metal: " + data.metals);
        textList.add("Vegetables: " + String.join(", ", data.vegetables));
        return textList;
    }

}
