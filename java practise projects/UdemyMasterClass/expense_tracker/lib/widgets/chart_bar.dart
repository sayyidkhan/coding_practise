import "package:flutter/material.dart";

class ChartBar extends StatelessWidget {
  final String label;
  final double spendingAmount;
  final double spedingPctOfTotal;


  ChartBar(this.label, this.spendingAmount, this.spedingPctOfTotal);

  @override
  Widget build(BuildContext context) {
    return Column(children: <Widget>[
      Text('\$${spendingAmount.toStringAsFixed(0)}'),
      SizedBox(height: 4,),
      Container(
        height: 60,
        width: 10,
        child: Stack(children: <Widget>[
          Container(
            decoration: BoxDecoration(
                border: Border.all(color: Colors.grey , width: 1.0 )),
                color: Color.fromRGBO(220,220,200,1),
                //borderRadius: BorderRadius.circular(20),
          ),
          FractionallySizedBox(
            heightFactor: spedingPctOfTotal,
            child: Container(
              decoration: BoxDecoration(
                  color: Theme.of(context).primaryColor),
            ),
          ),
        ],),
      ),
      SizedBox(height: 4,),
      Text(label),
    ],
    );
  }
}
