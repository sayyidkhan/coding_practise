import 'package:flutter/material.dart';
import 'package:learning_state_management/providers/products.dart';
import 'package:learning_state_management/screens/edit_product_screen.dart';
import 'package:learning_state_management/widgets/app_drawer.dart';
import 'package:learning_state_management/widgets/user_product_item.dart';
import 'package:provider/provider.dart';

class UserProductsScreen extends StatelessWidget {
  static const routeName = "/user-products";

  @override
  Widget build(BuildContext context) {
    final productsData = Provider.of<Products>(context);
    return Scaffold(
      appBar: AppBar(
        title: const Text("Your Products"),
        actions: <Widget>[
          IconButton(
            icon: const Icon(Icons.add),
            onPressed: () {
              Navigator.of(context).pushNamed(EditProductsScreen.routeName);
            },
          ),
        ],
      ),
      drawer: AppDrawer(),
      body: Padding(
        padding: EdgeInsets.all(8),
        child: ListView.builder(
          itemCount: productsData.items.length,
          itemBuilder: (_, i) => Column(
            children: <Widget>[
              UserProductItem(
                  productsData.items[i].title,
                  productsData.items[i].imageUrl
              ),
              Divider(),
            ],
          ),
        ),
      ),
    );
  }
}
