package com.codewars.kata_8_kyu.solution_050;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    private static final Map<String, String> greetings = new HashMap<>();
    static {
        greetings.put("english", "Welcome");
        greetings.put("czech", "Vitejte");
        greetings.put("danish", "Velkomst");
        greetings.put("dutch", "Welkom");
        greetings.put("estonian", "Tere tulemast");
        greetings.put("finnish", "Tervetuloa");
        greetings.put("flemish", "Welgekomen");
        greetings.put("french", "Bienvenue");
        greetings.put("german", "Willkommen");
        greetings.put("irish", "Failte");
        greetings.put("italian", "Benvenuto");
        greetings.put("latvian", "Gaidits");
        greetings.put("lithuanian", "Laukiamas");
        greetings.put("polish", "Witamy");
        greetings.put("spanish", "Bienvenido");
        greetings.put("swedish", "Valkommen");
        greetings.put("welsh", "Croeso");
    }
        public static String greet(String language){
            return greetings.getOrDefault(language, "Welcome");
        }

//        switch(language){
//            case "english" : return "Welcome";
//            case "czech" : return "Vitejte";
//            case "danish" : return "Velkomst";
//            case "dutch" : return "Welkom";
//            case "estonian" : return "Tere tulemast";
//            case "finnish" : return "Tervetuloa";
//            case "flemish" : return "Welgekomen";
//            case "french" : return "Bienvenue";
//            case "german" : return "Willkommen";
//            case "irish" : return "Failte";
//            case "italian" : return "Benvenuto";
//            case "latvian" : return "Gaidits";
//            case "lithuanian" : return "Laukiamas";
//            case "polish" : return "Witamy";
//            case "spanish" : return "Bienvenido";
//            case "swedish" : return "Valkommen";
//            case "welsh" : return "Croeso";
//            default: return "";
//        }

    }

