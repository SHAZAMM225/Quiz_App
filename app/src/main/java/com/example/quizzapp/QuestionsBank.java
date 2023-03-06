package com.example.quizzapp;

import java.util.ArrayList;
import java.util.List;

public class QuestionsBank {

    final static List<QuestionList> javaQ(){

        List<QuestionList> questionListLists=new ArrayList<>();


        questionListLists.add(new QuestionList("What is the size of variable int ?",
                "16 bit","8 bit","32 bit","64 bit","32 bit",""));


        questionListLists.add(new QuestionList("whats of the  following is the default value of an instance variable?",
                "null","0","not assigned",
                "Depends upon the type of variable",
                "Depends upon the type of variable",""));

        questionListLists.add(new QuestionList("what is the default values of Boolean va variable ?",
                "true ","0","1",
                "false",
                "false",""));


        questionListLists.add(new QuestionList("What is the difference between an object and a class in Java ?",
                "An object is an instance of a class, while a class is a blueprint for creating objects.",
                "An object and a class are the same thing.",
                "A class is an instance of an object, while an object is a blueprint for creating classes.",
                "An object represents a variable, while a class represents a method.",
                "An object is an instance of a class, while a class is a blueprint for creating objects.",""));

        questionListLists.add(new QuestionList("What is the difference between an interface and a class in Java?",
                "An interface can have constructors, while a class cannot.",
                "A class can have static methods, while an interface cannot.",
                "A class can implement multiple interfaces, while a class can only inherit from one superclass.",
                "An interface can have instance variables, while a class cannot.",
                "A class can implement multiple interfaces, while a class can only inherit from one superclass.",""));

        questionListLists.add(new QuestionList("What is the purpose of the static keyword in Java?",
                "To indicate that a variable or method belongs to a class rather than an instance of a class.",
                "To indicate that a variable or method belongs to an instance of a class rather than the class itself.",
                "To indicate that a variable or method is public.",
                "To indicate that a variable or method is private.",
                "To indicate that a variable or method belongs to a class rather than an instance of a class.",""));


        return questionListLists;
    }

    final static List<QuestionList> swiftQ(){

        List<QuestionList> questionListLists=new ArrayList<>();


        questionListLists.add(new QuestionList("What keyword is used to define a constant in Swift??",
                "var ","let","const ","final","let",""));


        questionListLists.add(new QuestionList("Which of the following is NOT a data type in Swift?",
                "String","Float","Decimal",
                "Double","Decimal",""));

        questionListLists.add(new QuestionList("Which of the following is a valid way to create a dictionary in Swift?",
                "let dict = [1, \"one\", 2, \"two\"] ",
                "let dict = [\"one\": 1, \"two\": 2, \"three\": 3]",
                "let dict = {1: \"one\", 2: \"two\", 3: \"three\"}",
                "let dict = [1: \"one\", 2: \"two\", 3: \"three\"] ",
                "let dict = [1: \"one\", 2: \"two\", 3: \"three\"]",
                ""));


        questionListLists.add(new QuestionList("Which of the following is an example of inheritance in Swift?",
                "A class that conforms to a protocol.",
                "A class that implements a delegate.",
                " A class that extends another class with additional properties and methods.",
                "A class that is composed of multiple smaller classes.",
                "A class that extends another class with additional properties and methods.",
                ""));


        questionListLists.add(new QuestionList("What is the difference between a struct and a class in Swift?",
                "Structs are passed by reference, while classes are passed by value.",
                "Classes are passed by reference, while structs are passed by value.",
                "Structs can inherit from other classes, while classes cannot. ",
                "There is no difference between a struct and a class in Swift.",
                "Classes are passed by reference, while structs are passed by value.",
                ""));


        questionListLists.add(new QuestionList("What is a protocol in Swift?",
                "A data type that represents a list of values. ",
                "A type of loop that iterates over a sequence of values.",
                "A blueprint for a set of properties and methods that a type can implement. ",
                "A type of closure that takes no arguments.",
                "A blueprint for a set of properties and methods that a type can implement.",""));


        return questionListLists;
    }

    final  static List<QuestionList> flutterQ(){

        List<QuestionList> questionListLists=new ArrayList<>();


        questionListLists.add(new QuestionList("What programming language is Flutter written in?",
                "Swift ","Java","Dart","Php","Dart",""));


        questionListLists.add(new QuestionList("What is the main building block of a Flutter app?",
                "Activities","ViewControllers","Widgets",
                "Fragments","Widgets",""));



        questionListLists.add(new QuestionList("What is the purpose of the build() method in a Flutter widget?",
                "To define the layout and appearance of the widget. ",
                "To handle user input and interaction with the widget.",
                " To define the business logic and data processing for the widget.",
                "To connect the widget to external APIs and data sources. ",
                "To define the layout and appearance of the widget.",
                ""));


        questionListLists.add(new QuestionList("Which of the following is an example of inheritance in Swift?",
                "A class that conforms to a protocol.",
                "A class that implements a delegate.",
                "A class that extends another class with additional properties and methods.",
                "A class that is composed of multiple smaller classes.",
                "A class that extends another class with additional properties and methods.",
                ""));


        questionListLists.add(new QuestionList("What is a Stateful widget in Flutter?",
                "A widget that is only created once during the lifetime of the app.",
                "Classes are passed by reference, while structs are passed by value.",
                "Structs can inherit from other classes, while classes cannot. ",
                "There is no difference between a struct and a class in Swift.",
                "Classes are passed by reference, while structs are passed by value.",
                ""));


        questionListLists.add(new QuestionList("What is a protocol in Swift?",
                "A data type that represents a list of values. ",
                "A widget that can change its state and update its appearance.",
                "A widget that represents a specific screen or view in the app. ",
                "A widget that provides a layout for other widgets.",
                "A widget that can change its state and update its appearance.",""));


        return questionListLists;
    }
    final static List<QuestionList> ReactNativeQ(){

        List<QuestionList> questionListLists=new ArrayList<>();


        questionListLists.add(new QuestionList("What programming language is used to write React Native apps?",
                "JavaScript","Java","Dart ","Php","JavaScript",""));


        questionListLists.add(new QuestionList("What is the purpose of the useState() hook in React Native?",
                "To handle user input and interaction with a component.",
                "To connect a component to external APIs and data sources",
                "To define the business logic and data processing for a component.",
                "To manage state within a functional component.","To manage state within a functional component.",""));



        questionListLists.add(new QuestionList(
                "What is the purpose of the build() method in a Flutter widget?",
                "To initialize the state of the component.",
                "To define the layout and appearance of the component.",
                "To handle user input and interaction with the component.",
                "To perform actions after the component has been mounted in the DOM.",
                "To perform actions after the component has been mounted in the DOM.",
                ""));


        questionListLists.add(new QuestionList("What is the purpose of the setState() method in a React Native component?",
                "To define the layout and appearance of the component.",
                "To handle user input and interaction with the component",
                "A To connect the component to external APIs and data sources.",
                "To update the state of the component and trigger a re-render.",
                "To update the state of the component and trigger a re-render.",
                ""));


        questionListLists.add(new QuestionList("What is the purpose of the useEffect() hook in a React Native component?",
                "To initialize the state of the component.",
                "To define the layout and appearance of the component.",
                "To handle user input and interaction with the component. ",
                "To perform side effects after the component has been mounted in the DOM.","To perform side effects after the component has been mounted in the DOM.",
                ""));


        questionListLists.add(new QuestionList("What is the difference between the FlatList and ScrollView components in React Native?",
                "The FlatList component is more efficient than the ScrollView component.",
                "The FlatList component is easier to use than the ScrollView component.",
                "The ScrollView component is used to display a single list of items, while the FlatList component is used to display a list of items with varying heights.",
                "There is no difference between the FlatList and ScrollView components in React Native.",
                "The ScrollView component is used to display a single list of items, while the FlatList component is used to display a list of items with varying heights.",""));


        return questionListLists;
    }



public static  List<QuestionList> getQuestions(String selectedTopicName)
{
    switch (selectedTopicName)
    {
        case "Java":
            return javaQ();
        case "Flutter":
            return flutterQ();
        case "React Native":
            return ReactNativeQ();
        case "Swift":
            return swiftQ();
        default:
            return javaQ();
    }
}



}
