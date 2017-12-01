== Copy the other notes ==


#### JavaFX ImageView:

The `ImageView` control must be added to the scene graph to be visible.  
It is represented by the class `javafx.scene.image.ImageView`

* The constructor of the `ImageView` class needs an instance of a `javafx.scene.image.Image` as parameter.
* The `Image` object represents the image to be displayed.




```
FileInputStream input = new FileInputStream("path/to/image.png");
Image image = new Image(input);
ImageView imageView = new ImageView(image);

// resize the image
imageView.setFitHeight(50);
imageView.setFitWidth(50);
```

* It is possible to use `ImageView` in both JavaFX `Label` and `Button`.  
Ths will cause the `Label` and `Button` to display the `ImageView` to the left of the text.


#### JavaFX Label:

The label control must be added to the scene graph to be visible.
The JavaFX Label control is represented by the class `javafx.scene.control.Label`

```
Label label = new Label("My Label");
```

##### Displaying Images in a Label:

The JavaFX `Label` class contains a constructor that can take a `Node` as extra parameter.
```
Label label = new Label("Label txt", imageView);
```


#### JavaFX Button:

The JavaFX Button control is represented by the class `javafx.scene.control.Button`.

```
Button button = new Button("My label");
```

* The second way to set the button text is calling the `setText()` method on the Button instance.
```
button.setText("Hey there");
```

* You can set the text size of the Button, by using the CSS property `-fx-text-size`.

* To enable text wrapping on the Button instance, we use `setWrapText(boolean)`.
```
button.setWrapText(true);
```

* One can set the button size with:
```
button.setMinWidth();
button.setMaxWidth();
button.setPrefWidth();

button.setMinHeight();
button.setMaxHeight();
button.setPrefWidth();

button.setMinSize(width, height);
button.setMaxSize(width, height));
button.setPrefSize(width, height));
```


##### Displaying Images in a Button:

Same as JavaFX Label:
```
Button button = new Button("button", imageView);
```


##### Button Events:

Attach an event listener to the Button instance:
```
button.setOnAction(new EventHandler() {
    @Override
    public void handle(ActionEvent actionEvent) {
        // do something
    }
});

button.setOnAction(actionEvent -> {
    // do something
});
```

##### Button Mnemonic:

A _mnemonic_ is a keyboard key which activates the button when pressed in conjunction with the **ALT** key.  
The mnemonic for a button is specified inside the button text.  
You mark which key is to be used as mnemonic by placing `_` in front of the character in the button text.
```
// must call this method first
button.setMnemonicParsin(true);
button.setText("_Click");
```

* Mnemonics are case insensitive.
* You can press ALT to show the mnemonic of the button in the button text.


##### Button CSS Styles:

The JavaFX Button control supports the following CSS styles:
```
-fx-boder-width
-fx-boder-color
-fx-background-color
-fx-font-size
-fx-text-fill

// to use one of them
button.setStyle("-fx-background-color: #ff0000; ");
```


#### JavaFX MenuButton:

The JavaFX MenuButton control show a list of menu options which the user can choose from.  
Represented by the class `javafx.scene.control.MenuButton`.

```
// start by creating menu items
MenuItem menuItem1 = new MenuItem("Option 1");
MenuItem menuItem2 = new MenuItem("Option 2");
MenuItem menuItem3 = new MenuItem("Option 3");

// create the MenuButton
// the graphic icon is set to null
MenuButton menuButton = new MenuButton("Options", null, menuItem1, menuItem2, menuItem3);
```

* The second `MenuButton` constructor parameter is a `Node` which is used as a graphic icon.  
We could use an `ImageView` to display an image in the `MenuButton`.

```
MenuItem menuItem1 = new MenuItem("Option 1");
MenuItem menuItem2 = new MenuItem("Option 2");
MenuItem menuItem3 = new MenuItem("Option 3");

FileInputStream input = new FileInputStream("resources/images/image.png");
Image image = new Image(input);
ImageView imageView = new ImageView(image);

MenuButton menuButton = new MenuButton("Options", imageView, menuItem1, menuItem2, menuItem3);
```


##### Responding to Item Selection:

To respond to when a user selects a menu item, we need to add **on action** event listener to the corresponding `MenuItem`.

```
MenuItem menuItem3 = new MenuItem("Option 3");

menuItem3.setOnAction(new EventHandler<ActionEvent>() {
    @Override
    public void handle(ActionEvent event) {
        System.out.println("Option 3 selected");
    }
});

// Or simply Lambda Expression
menuItem3.setOnAction(event -> {
    System.out.println("Option 3 selected");
});
```


#### JavaFx ToggleButton:


