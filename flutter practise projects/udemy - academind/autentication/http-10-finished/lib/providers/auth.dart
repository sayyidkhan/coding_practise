import 'dart:convert';
import 'package:flutter/widgets.dart';
import  'package:http/http.dart' as http;

class Auth with ChangeNotifier {
  static const API_KEY = "AIzaSyBhKVbxyAPiOYSthzfAhsNs_9U-jSl-t_k";

  // token will expire
  String _token;
  DateTime _expiryDate;
  String _userId;

  Future<void> _autenticate(String email, String password,String urlSegment) async {
    final url = 'https://identitytoolkit.googleapis.com/v1/accounts:' + urlSegment + '?key=' + API_KEY;

    final response = await http.post(
      url,
      body: json.encode(
        {
          'email': email,
          'password': password,
          'returnSecureToken': true,
        },
      ),
    );
    print(json.decode(response.body));
  }

  Future<void> signUp(String email, String password) async {
    // signUp
    return _autenticate(email,password,"signUp");
  }

  Future<void> login(String email,String password) async {
    //signInWithPassword
    return _autenticate(email,password,"signInWithPassword");
  }

}
