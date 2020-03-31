import 'dart:convert';

import 'package:http/http.dart' as http;

class PostRequest {

  static const URL = 'http://10.0.2.2:3200/new_order';

  var values = {
    "food_name": "apple",
    "customer_name" : "jack",
    "food_qty" : 1
  };

//  static Future<http.Response> _post(String url, dynamic data) async {
//    final http.Response response = await http.Client().post(
//      url,
//      body: json.encode(data),
//      headers: {
//        'Content-Type': 'application/json',
//      },
//    );
//
//    if (response.statusCode >= 400) {
//      throw ('An error occurred: ' + response.body);
//    }
//
//
//    final jsonResponse = json.decode(response.body);
//    print(jsonResponse);
//    return jsonResponse;
//  }

  Future<http.Response> sendToNodeJsBackEnd() async {
    final response = await http.post(
      'http://10.0.2.2:3200/new_order',
      headers: <String, String>{
        'Content-Type': 'application/json; charset=UTF-8',
      },
      body: json.encode(values));
    print(response.body);
    return response;
//    final res = _post(URL,values);
//    print(res);
//    var url = 'http://127.0.0.1:3200/new_order';
//    var response = await http.post(url, body: {'name': 'doodle', 'color': 'blue'});
//    print('Response status: ${response.statusCode}');
//    print('Response body: ${response.body}');
//    return res;
  }

}
