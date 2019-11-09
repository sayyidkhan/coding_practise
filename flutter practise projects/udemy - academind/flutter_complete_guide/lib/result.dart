import 'package:flutter/material.dart';

class Result extends StatelessWidget {
  final int resultScore;
  final Function resetHandler;

  Result(this.resultScore,this.resetHandler);

  String get resultPhrase {
    String resultText;
    if(resultScore <= 8){
      resultText = "you are awesome and innocent!";
    }
    else if(resultScore <= 12){
      resultText = "prtty likeable!";
    }
    else if(resultScore <= 16 ){
      resultText = "you are ... strange";
    }
    else{
      resultText = "you are so bad!";
    }
    return resultText;
  }

  @override
  Widget build(BuildContext context) {

    Text widgetComponentA() {
      return Text(
        resultPhrase,
        style: TextStyle(
          fontSize: 36,
          fontWeight: FontWeight.bold,
        ),
        textAlign:TextAlign.center,
      );
    }

    FlatButton widgetComponentB() {
      return FlatButton(
        child: Text("Restart Quiz!"),
        onPressed: resetHandler,
        textColor: Colors.blue,
      );
    }

    List<Widget> widgetList = <Widget>[
          widgetComponentA(),
          widgetComponentB(),
        ];

    return Center(
      child: Column(
        children:
        widgetList,
      ),
    );
  }




}