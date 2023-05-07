# Calculator
 A fully functional calculator with an easy-to-use user interface that contains buttons for digits, operators, and other uses. It allows the user to perform the basic arithmetic operations of addition, subtraction, multiplication, and division, as well as operations involving brackets and indices.

## Table of contents
* [Languages](#languages)
* [Libraries](#libraries)
* [Description of code](#description-of-code)
* [Illustrations](#illustrations)
* [Requirements and setup](#requirements-and-setup)
* [Known bugs](#known-bugs)
* [Find a bug?](#find-a-bug)
* [Credits](#credits)

## Languages
Java 8

## Libraries
* <span style ="font-family: Courier New">`androidx.appcompat:appcompat:1.6.1` </span>(for backwards compatibility of various user interface elements and widgets with older versions of Android)
* <span style ="font-family: Courier New">`androidx.constraintlayout:constraintlayout:2.1.4` </span>(for defining constraints between user interface elements and creating responsive user interfaces that adapt to different screen sizes)
* <span style ="font-family: Courier New">`MathParser.org-mXparser.jar` </span>(for parsing and evaluating mathematical expressions)
* <span style ="font-family: Courier New">`junit:junit:4.13.2` </span>(for unit testing)
* <span style ="font-family: Courier New">`androidx.test.ext:junit:1.1.5` </span>(for instrumented testing)
* <span style ="font-family: Courier New">`androidx.test.espresso:espresso-core:3.5.1` </span>(for UI testing)

## Description of code
### The <span style ="font-family: Courier New">`CalculatorActivity`</span> class
The <span style ="font-family: Courier New">`CalculatorActivity`</span> class extends <span style ="font-family: Courier New">`AppCompatActivity`</span>, which is the superclass for activities that use the <span style ="font-family: Courier New">`appcompat`</span> library. When <span style ="font-family: Courier New">`CalculatorActivity`</span> is created, the <span style ="font-family: Courier New">`onCreate`</span> method is called and sets the user interface to the one defined in <span style ="font-family: Courier New">`activity_calculator.xml`</span>. It also initialises an <span style ="font-family: Courier New">`EditText`</span> object to display the user's input, as well as the output that is calculated using the <span style ="font-family: Courier New">`Expression`</span> class from the <span style ="font-family: Courier New">`mXparser`</span> library. A <span style ="font-family: Courier New">`boolean`</span> class variable <span style ="font-family: Courier New">`calculationJustHappened`</span> keeps track of when a calculation just happened, allowing methods to work as intended and providing flexibility for future methods that may be implemented. I intend to create an 'Ans' button, and I imagine that the <span style ="font-family: Courier New">`calculationJustHappened`</span> class variable will be necessary for its associated method.

A series of methods (<span style ="font-family: Courier New">`oneButton`</span>, <span style ="font-family: Courier New">`twoButton`</span>, <span style ="font-family: Courier New">`divideButton`</span>, etc.) is defined, one for each button on the calculator. An <span style ="font-family: Courier New">`updateDisplayText`</span> method is called within the click listeners of most of the button methods in order to update the display.

## Illustrations
<img width="235" alt="Screenshot of calculator" src="https://user-images.githubusercontent.com/122983411/235888266-f981c0de-0dc7-46a2-a069-5451b8a4c295.png">

## Requirements and setup
Before using this app, there are some prerequisites that must be met. This section provides information about the requirements that need to be fulfilled in order to use this app.
### Operating System Requirements
This app can be run on any operating system that supports Java. This includes Windows, macOS, and Linux.
### Hardware Requirements
This app does not have any specific hardware requirements. It can run on any system that supports Java.
### Software Requirements
* Java Development Kit (JDK) version 8 or later installed on your computer. You can download the latest version of the JDK from the official Oracle website [here](https://www.oracle.com/java/technologies/downloads/).
* An Integrated Development Environment (IDE) such as Android Studio installed on your computer. Note that IDEs have their own requirements. You can find requirements for the Android Studio IDE [here](https://developer.android.com/studio/install?gclid=CjwKCAjwjMiiBhA4EiwAZe6jQ6JIVXEkxXTH3jSBnS3iT6wq3o8irNlSSfIroMs2__YxISpgDZlfvBoCiSYQAvD_BwE&gclsrc=aw.ds).

### Setting up the project
* Clone this repository to your local machine.
* Open the project in your preferred Java IDE (such as Android Studio).
* Run the program and start performing calculations!

## Known bugs
One issue I have found while using the calculator is that it evaluates `-x^2` to `x^2` for any value of `x`. For example, it would evaluate `-3^2` to `9` when in fact it is `-9`. If there are brackets around `x`, it evaluates it correctly. For example, it evaluates `-(3)^2` correctly to `-9`.

## Find a bug?
If you found an issue or would like to submit an improvement to this project, please submit an issue using the 'Issues' tab above. If you would like to submit a pull request, please reference the issue you created.

## Credits
This app is inspired by a tutorial from the YouTube channel [Practical Coding](https://www.youtube.com/watch?v=B5b-7uDtUp4&list=PLcSIMAULmMyd-d2gp50C-fPfnzCB523mZ&index=6).
