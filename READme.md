
variable are two types
1.Primitive
2.reference

Variables must have type and name.
Variable name can start with a letter , _ or $ . it can't be a java reserved word.
primitive : 
byte x = 7;

Reference:
Dog mydog = new Dog();

Array are always objects , whether they are declared to hold primitives or object refernces.
Dog[] pets = new Dog[7];
pets[0] = new Dog();
pets[1] = new Dog();


Objects have state and behavior , represented by instance variables and methods.
Class is the blue print of the object
A method uses parameters , a caller passes arguments
Dog d = new Dog();
d.bark(3);

A method can return a specific type of value 
int giveSecret(){
return 42;
}

You can pass more than one variable to a method 
void takeTwo(int x , int y){
  int Z = x + y;
  System.out.println("Total is" + z);
}

Rather than accessing data directly we have to use setter and getter methods .
