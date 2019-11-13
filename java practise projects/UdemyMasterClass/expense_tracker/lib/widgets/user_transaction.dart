import 'package:expense_tracker/models/transaction.dart';
import 'package:expense_tracker/widgets/transaction_list.dart';
import 'package:flutter/material.dart';

import 'new_transaction.dart';

class UserTransactions extends StatefulWidget {
  @override
  _UserTransactionsState createState() => _UserTransactionsState();
}

class _UserTransactionsState extends State<UserTransactions> {

  final List<Transaction> _userTransaction = [
    Transaction(id: "t1",title: "new Shoes",amount: 69.99,date: DateTime.now()),
    Transaction(id: "t2",title: "weekly groceries",amount: 16.53,date: DateTime.now()),
  ];

  void _addNewTransaction(String txTitle,double txAmount){
    final newTx = Transaction(title: txTitle,amount: txAmount,date: DateTime.now(),id: DateTime.now().toString() );

    setState(() {
      _userTransaction.add(newTx);
    });

  }

  @override
  Widget build(BuildContext context) {
    return Column(
      children: <Widget>[
        NewTransaction(),
        TransactionList(_userTransaction),
      ],
    );
  }

}
