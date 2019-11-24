import 'package:flutter/material.dart';
import 'package:meals_app/widgets/main_drawer.dart';

class FiltersScreen extends StatefulWidget {
  static const routeName = "/filter-screen";

  @override
  _FiltersScreenState createState() => _FiltersScreenState();
}

class _FiltersScreenState extends State<FiltersScreen> {
  var _glutenFree = false;
  var _vegetarian = false;
  var _vegan = false;
  var _lactoseFree = false;

  Widget _buildSwitchListTile(
      String title,
      String description,
      bool currentValue,
      Function updateValue,
      ) {
    return SwitchListTile(
      title: Text(title),
      value: currentValue,
      subtitle: Text(description),
      onChanged: updateValue,
    );
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: Text("Your Filters"),),
      drawer: MainDrawer(),
      body: Column( children: <Widget>[

        Container(
          padding: EdgeInsets.all(20),
          child: Text(
            "Adjust your meal selection",
            style: Theme.of(context).textTheme.title,
          ),
        ),

        Expanded(child: ListView(
            children: <Widget>[

              _buildSwitchListTile(
                  "Gluten-Free",
                  "only include gluten-free meals",
                  _glutenFree,
                  (newValue) {
                    setState(() {
                      _glutenFree = newValue;
                    });
                  }),

              _buildSwitchListTile(
                  "Loctose-Free",
                  "only include lactose-free meals",
                  _lactoseFree,
                      (newValue) {
                    setState(() {
                      _lactoseFree = newValue;
                    });
                  }),

              _buildSwitchListTile(
                  "vegetarian",
                  "only include vegetarian meals",
                  _vegetarian,
                      (newValue) {
                    setState(() {
                      _vegetarian = newValue;
                    });
                  }),

              _buildSwitchListTile(
                  "vegan",
                  "only include vegan meals",
                  _vegan,
                      (newValue) {
                    setState(() {
                      _vegan = newValue;
                    });
                  }),

            ],
          ),
        ),

      ],
      ),
    );
  }
}
