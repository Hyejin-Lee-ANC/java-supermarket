# java-supermarket

A Java based shopping cart example that uses Gradle and JUnit.

### Overview

Our market carries 3 products, aptly named A, B and C that are implemented from an `AbstractProduct`. Each product class is required to implement a `getTotalPrice` method that takes in the number of items being purchased so that discounts can be applied. `AbstractProduct` also provides the ability to update the product's pricing dynamically.

To add new products to the supermarket, add them to the static `PRODUCT_MAP` list at the top of the `Supermarket` object. This will make them available to purchase during checkout.

To checkout from the supermarket, pass a string of purchases into `Supermarket.checkout()` and it will return the total cost of the items checked out.

For example,

```
Supermarket sm = new Supermarket();
int total = sm.checkout('ABCA');
```

Total in this case will be 120.

### Getting Started

This uses [Gradle](http://gradle.org/) for dependency and build management, but can be run directly from this directory without installing it using `gradlew`. 

To build run:

```
./gradlew build
```

To run the tests:

```
./gradlew test
```

To build the documentation:

```
./gradlew javadoc
```

Then open `build/docs/javadoc/index.html`.
