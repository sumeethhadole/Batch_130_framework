package Java_imp;

import java.net.HttpURLConnection;
import java.net.URL;
import java.io.IOException;

public class Sum_of_digits {

    public static void main(String[] args) {
        // Example URL (You should replace it with your actual URL)
        String link = "http://example.com";

        try {
            // Create a URL object from the string
            URL url = new URL(link);
            
            // Open a connection to the URL
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            
            // Set the request method to HEAD to only get the header info
            conn.setRequestMethod("HEAD");
            
            // Get the response code
            int status = conn.getResponseCode();
            
            // Print the status code
            System.out.println("Response Code: " + status);

        } catch (IOException e) {
            // Handle any IOExceptions
            e.printStackTrace();
        }
    }
}


