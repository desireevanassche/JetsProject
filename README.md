# Jets Project

### Description
This program is designed to read a fleet of jets from a text file into an array utilizing a buffered reader while simultaneously applying knowledge of concepts such as polymorphism, interfaces, inheritance, and abstract classes.

The Airfield class employs a buffered reader to read in Jets.txt, split the contents of the file into Strings, and convert the literals into Strings by parsing them. The Jets object is abstract and cannot be instantiated, the text file is organized into the array by subclasses of the Jets object: FighterJet, CargoPlane, and ImplJet.

At the time of the program's launch, the Airfield is populated with the fleet of subclass Jets created through the process described above, and a menu is presented to the user. This menu allows the user to loop through a wide range of tasks and interact with the Jet fleet until the user decides to quit the program.

1. List fleet
2. Fly all jets
3. View the fastest Jet
4. View jet with the longest range
5. Load all Cargo Jets
6. Dogfight!
7. Add a jet to Fleet
8. Remove a Jet from the Fleet
9. Quit


### Technologies Used
* Encapsulation
* Inhertiance
* Constructors
* Buffered Reader & File Reader
* Polymorphism
* Abstract Superclass
* Interfaces
* Parsing
* IO Exception
* Array Lists
* Switch Menus
* Java Utility Scanner
* Eclipse
* Zoom TA Hours

### Lesson Learned

### Abstract Classes cannot be Instantiated
Early into this project, I made multiple attempts to instantiate the Jet object, and each time eclipse would flag it. The message reading "Jets cannot be instantiated." The first time, I wrote it off as a mistake on my part and tried to rework the code, which resulted in the same error message. I then referenced my notes from last week, curious what I was missing, and there it was. Abstract classes can be subclasses but they may not be instantiated. Once I gathered the necessary information it was quite clear that I needed to create new objects of the subclasses CargoPlane and FighterJet and assign the parsed data from the text file to those items before organizing them into the ArrayList.

### Keep in DRY
Don't repeat yourself is something we have been taught to reduce repetition of code. It has been an aim since first learning about it in class but in many ways, I was not sure how to avoid repetition. With this program I found that to be quite easy by creating a vast majority of the methods utilized inside of the Airfield and calling them into the JetsApplication when necessary. I was able to restructure the same ForEach loop multiple times throughout the methods to get the results I desired without reinventing the wheel. 

### Creating the Code with the User in Mind
After meeting all of the desired outcomes of this project I went back through to improve readability. In doing so I considered nesting the menu into another loop and offering the user the ability to decide if they would like to see it again before it popped back up. I then took a step back and asked myself, who will be using this program and found the answer was instructors who want to test if it is working properly in a timely and efficient manner. Considering that they have many of these projects to test, I decided that my time would be best spent improving other areas of the project, and possibly at a later date, I will return to add this feature if it is what best suits the user.
