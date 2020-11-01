package com.company;

import java.net.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONString;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class Main {
    public static void main(String[] args) throws Exception {

        // Запрос
        Scanner input = new Scanner(System.in);
        System.out.print("Enter request");
        String query = input.nextLine();
        input.close();
        query = URLEncoder.encode(query, "UTF-8");

        //String query = "Perm";

        //Сcылка
        String targetUrl = "https://en.wikipedia.org/w/api.php?action=query&list=search&utf8=&format=json&srsearch=\"" + query + "\"";

        String line = "";
        String sumLine = "";

        //Соединение
        URL oracle = new URL(targetUrl);
        URLConnection yc = oracle.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(
                yc.getInputStream()));


        while ((line = in.readLine()) != null) {

            sumLine += line;
        }
        in.close();

        JSONObject responseObject0 = new JSONObject(sumLine);


//        JSONObject responseObject1 = (JSONObject) responseObject0.get("query");
//        JSONObject responseObject2 = (JSONObject) responseObject1.get("search");
//       JSONObject responseObject3 = (JSONObject) responseObject2.get("0");
//        String pageid = String.valueOf(responseObject3.get("pageid"));
//        String title = String.valueOf(responseObject3.get("title"));
//        String snippet = String.valueOf(responseObject3.get("snippet"));

//        {
//            "type": "object",
//                "properties": {
//            "a": {
//                "javaName": "b",
//                        "type": "string"
//            }
//        }
//        }

        GsonBuilder builder = new GsonBuilder();
          Gson gson = builder.create();
        Wiki a = gson.fromJson(sumLine, Wiki.class);

        for (Search b : a.getQuery().getSearch()) {
            System.out.println("Title "+ b.getTitle());
            System.out.println("Pageid "+ b.getPageId());
            System.out.println("Size " + b.getSize());
            System.out.println("Snippet " + b.getSnippet());
            System.out.println("Wordcount " + b.getWordcount()+"\n");
        }

        System.out.println("Результат поиска: \n" + responseObject0);

//        for ( int i=1; i<responseObject0.length(); i++) {
//
//            String pageId = responseObject0.getString("JSON.query.search."+i+".pageid");
//            String title = responseObject0.getString("JSON.query.search."+i+".title");
//            String snippet = responseObject0.getString("JSON.query.search."+i+".snippet");
//
//            System.out.println("query: \n" + i);
//            System.out.println("pageId: \n" + pageId);
//            System.out.println("title 3\n: " + title);
//            System.out.println("snippet 3\n: " + snippet);
//
//        }

    }



}
