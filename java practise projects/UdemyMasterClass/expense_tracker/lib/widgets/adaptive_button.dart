import 'dart:io';

import 'package:flutter/material.dart';
import 'package:flutter/cupertino.dart';


Text textButton (textInput) => Text(textInput, style: TextStyle(fontWeight: FontWeight.bold));

class AdaptiveButton extends StatelessWidget {
  final String text;
  final Function handler;


  AdaptiveButton(this.text, this.handler);

  @override
  Widget build(BuildContext context) {
    return Platform.isIOS ?
    CupertinoButton(
      child: textButton(text),
      onPressed: handler,
    ) :
    FlatButton(
      textColor: Theme.of(context).primaryColor,
      child: textButton(text),
      onPressed: handler,
    );
  }
}
