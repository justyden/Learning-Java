package NetworkAPI;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class GoogleMapAPI {
    String apikey;
    String serviceURL = "https://maps.googleapis.com/maps/api/geocode/json?&key=" + apikey;

    public void findAddress(String address) {
        URL url = null;
        try {
            String encaddress = URLEncoder.encode(address, StandardCharsets.UTF_8.toString());
            String urlSTR = serviceURL + "&address" + encaddress;
            System.out.println(urlSTR);
            url = new URL(urlSTR);
            URLConnection conn = url.openConnection();
            conn.setRequestProperty("Accept", "text/html");
            conn.setRequestProperty("Connection", "close");
            conn.setRequestProperty("Accept_Language", "en-US");
            conn.setRequestProperty("User_Agent", "");
            InputStream is = conn.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void postEx() {
    }
}
