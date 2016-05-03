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
public class WeatherController {
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/weather")
    public String getWeather (@RequestParam(value = "zip", defaultValue = "") String zip) {
        restTemplate = new RestTemplate();
        StringBuilder builder = new StringBuilder();
        URL url = null;
        try {

            if(zip.equals("")) {
                url = new URL("http://www.myweather2.com/developer/forecast.ashx?uac=yppfPppFXa&query=44011&temp_unit=f&ws_unit=kph&output=json");
            }
            else{
                url = new URL("http://www.myweather2.com/developer/forecast.ashx?uac=yppfPppFXa&query="+zip+"&temp_unit=f&ws_unit=kph&output=json");
            }

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
