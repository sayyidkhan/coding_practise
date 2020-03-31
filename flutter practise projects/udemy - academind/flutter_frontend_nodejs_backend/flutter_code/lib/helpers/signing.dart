import 'dart:convert';
import 'package:crypto/crypto.dart';
import 'package:url/url.dart';

class Signing {
  String result;

  /**
   * Convert from 'web safe' base64 to true base64.
   *
   * @param  {string} safeEncodedString The code you want to translate
   * from a web safe form.
   * @return {string}
   */
  removeWebSafe(String safeEncodedString) {
    //return safeEncodedString.replace('/-/g', '+').replace('/_/g', '/');
    return safeEncodedString.replaceAll('-','+').replaceAll('_', '/');
  }


  /**
   * Convert from true base64 to 'web safe' base64
   *
   * @param  {string} encodedString The code you want to translate to a
   *                                web safe form.
   * @return {string}
   */
  makeWebSafe(String encodedString) {
    //return encodedString.replace(/\+/g, '-').replace(/\//g, '_');
    return encodedString.replaceAll('+', '-').replaceAll('/', '_');
  }

  /**
   * Takes a base64 code and decodes it.
   *
   * @param  {string} code The encoded data.
   * @return {string}
   */
  decodeBase64Hash(code) {
    // "new Buffer(...)" is deprecated. Use Buffer.from if it exists.
    //return Buffer.from ? Buffer.from(code, 'base64') : new Buffer(code, 'base64');
    return base64.decode(code);
  }

  /**
   * Takes a key and signs the data with it.
   *
   * @param  {string} key  Your unique secret key.
   * @param  {string} data The url to sign.
   * @return {string}
   */
  encodeBase64Hash(key, data) {
    var bytes = utf8.encode(data);

    var hmacSha1 = new Hmac(sha1, key); // HMAC-SHA256
    var digest = hmacSha1.convert(bytes).toString();
    return base64.decode(digest).toString();

    var hMacSha1 = new Hmac(sha1, key);
//    hMacSha1.update();
//    var hmac = new crypto.Hmac(crypto.sha1, key);
//    hmac.add();
//    hMac.add()
//    return crypto.createHmac('sha1', key).update(data).digest('base64');
  }
//
  /**
   * Sign a URL using a secret key.
   *
   * @param  {string} path   The url you want to sign.
   * @param  {string} secret Your unique secret key.
   * @return {string}
   */
  String sign(String path,String secret) {
    var uri = Url.parse(path);
    var safeSecret = decodeBase64Hash(removeWebSafe(secret));
    var hashedSignature = makeWebSafe(encodeBase64Hash(safeSecret, uri.path));
//    var hashedSingature1 =hashedSignature.toString().replaceAll("[", "").replaceAll("]", "");
//    List<String> hashedSingature2 = hashedSingature1.split(",");
//    List <int> hashedSingature3 = hashedSingature2.map(int.parse).toList();
//    var resultString = new String.fromCharCodes(hashedSingature3);
//    List<int> hashedSignature3 = hashedSingature2.map((data) => int.parse(data));

    print("resultString: " + hashedSignature.toString());
    return uri.toString() + '&signature=' + hashedSignature.toString();
  }

  Signing(String path,String secret){
    this.result = this.sign(path, secret);
  }

  String get theResult {
    return this.result;
  }

}