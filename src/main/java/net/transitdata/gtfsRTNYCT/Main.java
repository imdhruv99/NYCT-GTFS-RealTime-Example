package net.transitdata.gtfsRTNYCT;

import com.google.protobuf.ExtensionRegistry;
import com.google.transit.realtime.GtfsRealtime;
import com.google.transit.realtime.GtfsRealtimeNYCT;


import java.io.IOException;
import java.net.URL;

public class Main {

    public static void main(String args[]) throws IOException {
        ExtensionRegistry registry = ExtensionRegistry.newInstance();
        registry.add(GtfsRealtimeNYCT.nyctFeedHeader);
        registry.add(GtfsRealtimeNYCT.nyctStopTimeUpdate);
        registry.add(GtfsRealtimeNYCT.nyctTripDescriptor);

        URL url = UrlHelper.getFeedUrlFromFeedId(FeedId.BD);

        System.out.println("Getting Feed From : " + url.toString());

        GtfsRealtime.FeedMessage feed = GtfsRealtime.FeedMessage.parseFrom(url.openStream(), registry);


        if(feed != null) {
            feed.getEntityList().stream().filter(GtfsRealtime.FeedEntity::hasTripUpdate)
                    .forEach(entity -> {System.out.println(entity.getTripUpdate().toString());
                    });
        }
    }
}
