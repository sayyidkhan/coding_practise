import 'package:flutter/material.dart';
import 'package:meals_app/widgets/main_drawer.dart';

import 'FavoritesScreen.dart';
import 'categories_screen.dart';

class TabsScreen extends StatefulWidget {
  @override
  _TabsScreenState createState() => _TabsScreenState();
}

class _TabsScreenState extends State<TabsScreen> {

  List<Map<String,Object>> _pages = [
    {'page':CategoriesScreen(), 'title': 'Categories'},
    {'page':FavoritesScreen(), 'title' : 'Favourites'},
  ];

  int _selectedPageIndex = 0;

  void _selectpage(int index) {
      setState(() {
        _selectedPageIndex =index;
      });
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
        appBar: AppBar(
          title: Text(_pages[_selectedPageIndex]['title']),
        ),
        drawer: MainDrawer(),
        body: _pages[_selectedPageIndex]['page'],
        bottomNavigationBar: BottomNavigationBar(
          onTap: _selectpage,
            backgroundColor: Theme.of(context).primaryColor,
            unselectedItemColor: Colors.white,
            selectedItemColor: Theme.of(context).accentColor,
            currentIndex: _selectedPageIndex,
            type: BottomNavigationBarType.fixed,
            items: [

              BottomNavigationBarItem(
                backgroundColor: Theme.of(context).primaryColor,
                icon: Icon(Icons.category),
                title: Text("Categories"),
              ),

              BottomNavigationBarItem(
                backgroundColor: Theme.of(context).primaryColor,
                icon: Icon(Icons.star),
                title: Text("Favourites"),
              ),

            ],
        ),
    );
  }
}
