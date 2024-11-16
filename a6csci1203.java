Assignment 3:                 Given: 01/24/14    Due: 01/31/14
------------                                  Points: 10
Purpose: Modify the GoodDog and GoodDogTestDrive classes from 
         pg. 82 in the text.

Description:
-----------
Add the following additional instance variables/attributes to 
the class:
  - Name 
  - Breed
  - Color
  - Age
  
In your "TestDrive" code:
  1) make three dog variables/references
  2) create three dogs for those variables
  3) initialize the 3 dogs
  4) display all the attributes of all the dogs
     and have them demonstrate their bark
  
  - repeat the previous 4 steps with an array representing
    a pack of three dogs

Do not read any inputs, just produce the output. 

E-mail your source code to Otto.
* Read and follow the Email submission Guidelines on otto.*
                         Programming -> Otto email.
* Read and follow the Programming Guidelines posted on otto.*
                         Programming -> Programming guidelines
===============================================================
Assignment 4:                 Given: 02/08/14    Due: 02/13/14
------------                                  Points: 10
Purpose: Modify your assignment #3 code.

Description:
-----------
Improve your GoodDog class to:
  - Limit access/visibilty to all attributes
  - Provide getter & setter methods for all attributes
  - Provide a display( ) method that displays all the  
    attributes of the GoodDog
  - Provide a feed( ) method that is passed a value 
    to increase the size of the GoodDog
    
Have your TestDrive code:
  - Meet all requirements of assignment #3
  - Test the feed( ) method

Do not read any inputs, just produce the output. 

E-mail your source code to Otto.
* Read and follow the Email submission Guidelines on otto.*
                         Programming -> Otto email.
* Read and follow the Programming Guidelines posted on otto.*
                         Programming -> Programming guidelines
===============================================================
Assignment 5:                 Given: 02/22/14    Due: 02/27/14
------------                                  Points: 10
Purpose: Utilize an ArrayList and your GoodDog class.
         - Expand the list/set
         - Process the list/set
         - Shrink the list/set

Description:
-----------
Use an ArrayList to create a "pack" of GoodDog objects. Create an
ArrayList and add three GoodDog objects to the ArrayList. Display 
all the dogs in the ArrayList. Add two more dogs to the ArrayList 
and display all the dogs. Then remove the first and last dogs in 
the list, feed the dogs, then display all the remaining dogs.

Make sure:
  - Your dog class meets all the requirements of the previous
    assignment
  - That you fully display each dog's attributes and methods
  - Write a "TestDrive" class with a main to exercise your 
    GoodDog class 
    
  - Use this opportunity to "tune up" your GoodDog class
  
Do not read any inputs, just produce the output. 

E-mail your source code to Otto.
* Read and follow the Email submission Guidelines on otto.*
                         Programming -> Otto email.
* Read and follow the Programming Guidelines posted on otto.*
                         Programming -> Programming guidelines
===============================================================
Assignment 6:                 Given: 03/03/14    Due: 03/20/14
------------                                  Points: 10
Purpose: Create a Java class of your own design.

Description:

         Create a class in Java like the ur_Robot class 
         in Karel++. {If you are interested in a complete
         description of Karel++ find a copy of the Karel++
         book by Bergin. Polzin has some. Or visit the Csci 
         1203 page on Otto and look at the Karel++ notes.}
         
         Allow the five primitive instructions/messages to be 
         sent to an ur_Robot and have its state adjusted 
         properly. 
         
         Karel++ -like ur_Robot definition:
         
             class ur_Robot
             {
               void move( );           <- These must be present
               void turnLeft( );          ...as in Karel++.
               void pickBeeper( ); 
               void putBeeper( ); 
               void turnOff( ); 
             };

         Write a program that creates at least one of these 
         robots and exercises it by giving it the five 
         primitive instructions. Display its state before and 
         after it receives the instructions to illustrate that 
         it is functioning. 
         
         Introduce some print()/display() method(s) so that a 
         robot can display it's current state when requested.
         
         There will be no world for the program to function in 
         or run against. So you do not need to worry about 
         hitting walls or picking up beepers (except world 
         boundaries, which are always there.) The robot should  
         be sensitive to beepers in its bag and to the fact 
         that it cannot put down beepers that it does not have.

Note:
----
  There are several things that will need to be different from
  Karel++ in this Java version of an ur_Robot class:
  
  1) a task will be in a main()
  2) directions might not be East,West,North,South, but could be.
  3) there will be no world description (for now), just assume a
     default, empty world. {Assume beepers can be picked up, to
     make it possible to test pickBeeper( ).}
  4) no graphics (for now) - we just want a model
                           - graphics will come later
                           
  Use reasonable datatypes wherever possible. (Build some if 
  you need them.)
  
  Start small. Ex: Build a robot that can move( ).
    - Get something working soon. Then refine it and expand it.
    - Don't be afraid to redesign. (It's how you learn.)
    - Have a previous working model to retreat to
       
Ex:  This code is what a Karel++ type program might look 
--   like in Java given our current knowledge. (Note that 
     it does look a lot like an actual Karel++ program. )
      .
      .
      .
  public static void main(String args[])
  {
    UrRobot karel = new UrRobot();
    karel.setStreet(1);
    karel.setAvenue(1);
    karel.setBeepers(3);
    karel.setDirection(0);
  
    karel.move();
    karel.move();
  
    karel.turnLeft();
    karel.move();

    karel.pickBeeper();
    karel.pickBeeper();
    karel.pickBeeper();
    karel.putBeeper();

    karel.turnOff();
  }
  
OR//  

  public static void main(String args[])
  {
    UrRobot karel = new UrRobot();
    karel.setStreet(1);
    karel.setAvenue(1);
    karel.setBeepers(3);
    karel.setDirection(0);
  
    System.out.println("Initial position:");
    karel.display();
    System.out.println(karel);
    
    karel.move();
    karel.move();
    
    System.out.println();
    System.out.println("After 2 moves:");
    karel.display();
  
    karel.turnLeft();
    karel.move();
    
    System.out.println();
    System.out.println("After a turnLeft and a move:");
    karel.display();
    
    karel.pickBeeper();
    karel.pickBeeper();
    karel.pickBeeper();
    karel.putBeeper();
    
    karel.turnOff();
    
    System.out.println();
    System.out.println("After some beeper activity and a turnOff:");
    karel.display();
  }

      .
      .
      .
      
/*          Output:
  Initial position:
  Robot:
           Location: 1 st, 1 ave
          Direction: East
     Beepers in bag: 0
             On/Off: on
  =====================================
  St: 1,  Ave: 1, Dir: East, Bag: 0, on

  After 2 moves:
  Robot:
           Location: 1 st, 3 ave
          Direction: East
     Beepers in bag: 0
             On/Off: on
  =====================================

  After a turnLeft and a move:
  Robot:
           Location: 2 st, 3 ave
          Direction: North
     Beepers in bag: 0
             On/Off: on
  =====================================

  After some beeper activity and a turnOff:
  Robot:
           Location: 2 st, 3 ave
          Direction: North
     Beepers in bag: 2
             On/Off: off
  =====================================

*/
      






