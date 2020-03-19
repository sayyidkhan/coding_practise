import 'dart:convert';
import 'package:flutter/widgets.dart';
import  'package:http/http.dart' as http;

import '../models/http_exception.dart';

class Auth with ChangeNotifier {
  static const API_KEY = "AIzaSyBhKVbxyAPiOYSthzfAhsNs_9U-jSl-t_k";

  // token will expire
  String _token;
  DateTime _expiryDate;
  String _userId;

  bool get isAuth {
    return token != null;
  }

  String get token {
    if(_expiryDate != null &&
        _expiryDate.isAfter(DateTime.now()) &&
       _token != null
    ){
      return _token;
    }
    return null;
  }

  String get userId {
    return _userId;
  }

  Future<void> _autenticate(String email, String password,String urlSegment) async {
    final url = 'https://identitytoolkit.googleapis.com/v1/accounts:' + urlSegment + '?key=' + API_KEY;

    try{
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
      final responseData = json.decode(response.body);
      if(responseData['error'] != null){
        throw HttpException(responseData['error']['message']);
      }
      _token = responseData['idToken'];
      _userId = responseData['localId'];
      _expiryDate = DateTime.now().add(Duration(seconds: int.parse(responseData['expiresIn'])
      ));
      notifyListeners();
      print(json.decode(response.body));
    }
    catch(error) {
      throw error;
    }


  }

  Future<void> signUp(String email, String password) async {
    // signUp
    return _autenticate(email,password,"signUp");
  }

  Future<void> login(String email,String password) async {
    //signInWithPassword
    return _autenticate(email,password,"signInWithPassword");
  }

  void logout() {
    print("user logged out successfully");
    _token = null;
    _userId = null;
    _expiryDate = null;
    notifyListeners();
  }

}
