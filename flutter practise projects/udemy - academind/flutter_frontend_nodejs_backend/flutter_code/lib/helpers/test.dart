import 'signing.dart';

void main() {

  var result = new Signing(
      "https://maps.googleapis.com/maps/api/staticmap?center=1.3805267,103.749145&zoom=16&size=600x300&maptype=roadmap&markers=color:red%7Clabel:A%7C1.3805267,103.749145&key=AIzaSyCLwyea3K_qUa5NHjHK_g_40sDvKX7JZwE",
      "b5YBLHLguIOWB7TxtwqRq1I75_s=")
      .theResult;
  print(result);
}