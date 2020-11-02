package com.company;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;



public class JsonParse {

    public String parse(String str) throws ParseException {
        Object ob = new JSONParser().parse(str);
        JSONObject jsonObject = (JSONObject) ob;

        JSONObject jsonObject1 = (JSONObject) jsonObject.get("query");
        JSONObject jsonObject2 = (JSONObject) jsonObject.get("pages");

        String rawkey = jsonObject2.toString();
        int s = rawkey.indexOf(":") - 1;
        String key = rawkey.substring(2, s);

        JSONObject jsonObject3 = (JSONObject) jsonObject2.get(key);
        //JSONObject jsonobject3 = (JSONObject) jsonObject2.get("11111");

        String out = jsonObject3.get("extract").toString();

        return out;

    }
}
