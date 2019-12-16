import 'package:flutter/material.dart';
import 'package:learning_state_management/models/product.dart';
import 'package:learning_state_management/widgets/product_item.dart';
import 'package:learning_state_management/widgets/products_grid.dart';

class ProductsOverviewScreen extends StatelessWidget {

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text("My Shop"),
      ),
      body: new ProductsGrid(),
    );
  }
}


