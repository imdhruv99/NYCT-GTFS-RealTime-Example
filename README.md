# NYCT-GTFS-RealTime-Example
- Example for using the NYCT GTFS-Realtime Subway feed in Java.

Usage:

1. Install the project under Maven

2. Set your MTA developer key as an environment variable with the name "MTA_KEY", or edit UrlHelper to include your API key.
Both IntelliJ and Eclipse offer the ability to set an environment variable in the "Run Configurations" dialog.

3. Run the Main.java class to see output.


# Using on another feed
- The onebusaway-gtfs-rt library will read from other GTFS-rt feeds that do not rely on extensions. 
In order to see the output of another feed, edit the Main class and change the 
URL (and, if necessary, the code from TripUpdates to VehiclePositions or Alerts) to the appropriate url. 
