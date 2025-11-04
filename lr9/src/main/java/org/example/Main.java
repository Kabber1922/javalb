package org.example;
import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Map<String, Language> languageMap = new HashMap<>();

        languageMap.put("English", new English("Английский"));
        languageMap.put("French", new French("Французкий"));

        System.out.println("Ключи:");
        for (String key : languageMap.keySet()) {
            System.out.println(key);
        }
        System.out.println(languageMap);
    }
}