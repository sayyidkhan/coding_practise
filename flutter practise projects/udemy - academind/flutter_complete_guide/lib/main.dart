import 'package:flutter/material.dart';
import './question.dart';
import './answer.dart';

//void main() {
//    runApp(MyApp());
//}

void main() => runApp(MyApp());

class MyApp extends StatefulWidget {

  @override
  State<StatefulWidget> createState() {
    return _MyAppState();
  }

}

class _MyAppState extends State<MyApp> {
  var _questionIndex = 0;

  void _answerQuestion(){
    setState(() {
      _questionIndex += 1;
    });
    print(_questionIndex);
  }

  @override
  Widget build(BuildContext context) {

    var questions = [
      {
        'questionText' : 'what\'s your favourite color?',
        'answers' : ['Black','Red','Green','White'],
      },
      {
        'questionText' : 'what\'s your favourite animal?',
        'answers' : ['Rabiit','Snake','Elephant','Lion'],
      },
      {
        'questionText' : 'what\'s your favourite instructor?',
        'answers' : ['Max1','Max2','Max3','Max4'],
      },
      ];
    return MaterialApp(
      home:
      Scaffold(
        appBar: AppBar(
          title: Text("My First App"),
        ),
        body:
        Column(
          children: [
            Question( questions[_questionIndex]['questionText'] ),
            ...(questions[_questionIndex]['answers'] as List<String>)
                .map((answer) {
              return Answer(_answerQuestion,answer);
            }).toList()
          ],),
      ),
    );
  }

}
