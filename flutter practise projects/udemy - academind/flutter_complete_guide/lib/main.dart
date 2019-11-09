import 'package:flutter/material.dart';
import './quiz.dart';
import './result.dart';

void main() => runApp(MyApp());

class MyApp extends StatefulWidget {

  @override
  State<StatefulWidget> createState() {
    return _MyAppState();
  }

}

class _MyAppState extends State<MyApp> {
  var _questionIndex = 0;
  var _totalScore = 0;

  final _questions = const [
    {
      'questionText' : 'what\'s your favourite color?',
      'answers' : [
        {'text':'Black','score': 10},
        {'text':'red','score': 5},
        {'text':'green','score': 3},
        {'text':'white','score': 1},
      ],
    },
    {
      'questionText' : 'what\'s your favourite animal?',
      'answers' : [
        {'text':'rabbit','score': 10},
        {'text':'snake','score': 5},
        {'text':'tiger','score': 3},
        {'text':'lion','score': 1},
      ],
    },
    {
      'questionText' : 'what\'s your favourite instructor?',
      'answers' : [
        {'text':'max1','score': 1},
        {'text':'max2','score': 1},
        {'text':'max3','score': 1},
        {'text':'max4','score': 1},
      ],
    },
  ];

  void _resetQuiz() {
    setState(() {
      _questionIndex = 0;
      _totalScore = 0;
    });
  }

  void _answerQuestion(int score){
    _totalScore += score;
    String _currentScore = _totalScore.toString();
    setState(() {
      _questionIndex += 1;
    });
    print(_questionIndex);

    if (_questionIndex < _questions.length) {
      print("your current score " + _currentScore);
      print("We Have more questions!");
    }
    else if( identical(_questionIndex,_questions.length) ) {
      print("your total score: " + _currentScore);
    }
    else{

    }

  }

  @override
  Widget build(BuildContext context) {

    return MaterialApp(
      home:
      Scaffold(
        appBar: AppBar(
          title: Text("My First App"),
        ),
        body:
        (_questionIndex < _questions.length) ?
        Quiz(
          answerQuestion: _answerQuestion,
          questionIndex: _questionIndex,
          questions: _questions,
        )
            :
        Result(_totalScore, _resetQuiz),
      ),
    );
  }

}
