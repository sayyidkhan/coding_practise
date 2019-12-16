import 'package:flutter/material.dart';
import 'package:learning_state_management/providers/product.dart';
import 'package:learning_state_management/providers/products.dart';
import 'package:learning_state_management/widgets/product_item.dart';
import 'package:learning_state_management/widgets/products_grid.dart';
import 'package:provider/provider.dart';

//enum are just ways to assign names to integers
enum FilterOptions {
  Favorites,
  All,
}

class ProductsOverviewScreen extends StatefulWidget {

  @override
  _ProductsOverviewScreenState createState() => _ProductsOverviewScreenState();
}

class _ProductsOverviewScreenState extends State<ProductsOverviewScreen> {
  bool _showOnlyFavorites = false;

  @override
  Widget build(BuildContext context) {
    final productsContainer = Provider.of<Products>(context, listen: false);

    return Scaffold(
      appBar: AppBar(
        title: Text("My Shop"),
        actions: <Widget>[
          PopupMenuButton(
            onSelected: (FilterOptions selectedValue) {
              setState(() {
                if(selectedValue == FilterOptions.Favorites){
                  _showOnlyFavorites = true;
                }
                else{
                  _showOnlyFavorites = false;
                }
              });
            },
            icon: Icon(Icons.more_vert,), itemBuilder: (_) => [
              PopupMenuItem(child: Text("Only Favourites"),value: FilterOptions.Favorites,),
              PopupMenuItem(child: Text("Show All"),value: FilterOptions.All,),
          ],
          ),
        ],
      ),
      body: ProductsGrid(_showOnlyFavorites),
    );
  }
}


