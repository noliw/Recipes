** A data class lets you create abjects whose main purpose is to store data. 

** data objects are considered equal if their properties hold the same value

** their hashcode should also return the same value is they are equal

** the toString returns the value of each property not the address

** the behavior of the == is determined by the implementation of the equals function

** Every class inherits an equals, hashcode and to string function from the Any class because every class is a subclass of Any. These functions can be overridden

** The equals function tells you if two objects are considered 'equal'. By default, it returns true if it's used to test the same underlying object, and false if It's used to test separate objects

** The === operator lets you check whether two variables refer to the same underlying object irrespective of the object's type

** A data class lets you create objects whose main purpose is to store data. It automatically overrides the equals, hashcode, and to string functions, and it includes copy and componentN functions

** The data class equals function checks for equality by looking at each object's property values. If two  data objects hold the same data, the equals function returns true.

** The copy function lets you create a new copy of a data object altering some of its properties. The original object remains intact

** componentN functions let you destructure data objects into their component property values.

** A data class generates its functions by considering the properties defined in its primary constructor

** Rules:
        -> There must be a primary constructor
        -> The primary constructor must have one or more params
        -> Each param must be marked with var or val
        -> it cannot be open or abstract
