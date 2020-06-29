package net.transitdata.gtfsRTNYCT;

import java.net.MalformedURLException;
import java.net.URL;

public class UrlHelper {

    private static String key = "14e90a034e4e548e6c7d57b6dea9be63";
    private static String baseUrlWithoutFeed = "http://datamine.mta.info/mta_esi.php?key=" + key + "&feed_id=";

    public static URL getFeedUrlFromFeedId(FeedId id){
        String urlString = baseUrlWithoutFeed + id.getValue();

        URL url = null;
        try {
            url = new URL(urlString);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return  url;
    }
}
