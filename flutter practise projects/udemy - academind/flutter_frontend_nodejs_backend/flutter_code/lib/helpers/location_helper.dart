//blank api key
//get the api key from the static google maps service
const GOOGLE_API_KEY = '';

class LocationHelper {

  static String generateLocationPreviewImage({double latitude, double longitude}) {
    final value = "https://maps.googleapis.com/maps/api/staticmap?center=$latitude,$longitude&zoom=16&size=600x300&maptype=roadmap&markers=color:red%7Clabel:A%7C$latitude,$longitude&key=$GOOGLE_API_KEY";
    print("value : " + value);
    return value;
  }

}