# cordova-fusedlocation
This is a Cordova/PhoneGap plugin that uses the Android Fused Location Provider.

I made this plugin to get better GeoLocation in [WeatherPerfect](https://twitter.com/weather_perfect).

## Usage:
```
cordova.plugins.FusedLocation.getLocation(success, error);

```

e.g.

```
cordova.plugins.FusedLocation.getLocation(function(pos) {
  console.log("LAT: " + data.lat + "LON: " + data.lon);
  }, function(errorMsg) {
  console.log(errorMsg);
});

```
