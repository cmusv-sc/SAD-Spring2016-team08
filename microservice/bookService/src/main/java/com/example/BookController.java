package com.example;
import java.net.*;
import java.io.*;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class BookController {
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/book")
    public String getWeather (@RequestParam(value = "bibkeys") String bibkeys) {
        restTemplate = new RestTemplate();
        StringBuilder builder = new StringBuilder();
        URL url = null;
        try {


            url = new URL("https://openlibrary.org/api/books?bibkeys=ISBN:"+bibkeys);

            URLConnection connection = url.openConnection();

            String line;
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            while ((line = reader.readLine()) != null) {
                builder.append(line);
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch(java.io.FileNotFoundException e){
            return "Please check the input format!";
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return builder.toString();
    }
}
