class Animal 
{
  var Name: String = "Animal"
}

abstract class Class1 extends Animal
{
  var Type1: String = "Reptile"
  def information1(): String
  {
    println(" Type: " +Name);
    println(" Class:"+ Type1);
  }
}

abstract class Class2 extends Animal
{
  var Type2: String = "Bird"
  def information2(): String
  {
    println(" Type: " +Name);
    println(" Class:"+ Type2);
  }
}


abstract class Class3 extends Animal
{
  var Type3: String = "Amphibian"
  def information3(): String
  {
    println(" Type: " +Name);
    println(" Class:"+ Type3);
  }
}


abstract class Class4 extends Animal
{
  var Type4: String = "Fish"
  def information4(): String
  {
    println(" Type: " +Name);
    println(" Class:"+ Type4);
  }
}


abstract class Class5 extends Animal
{
  var Type5: String = "Mammal"
  def information5():String
  {
    println(" Type: " +Name);
    println(" Class:"+ Type5);
  }
}


abstract class SubClass1 extends Class5
{
  var SubType1: String = "Cat"
  def information5():String
  {
    println(" Type: " +Name);
    println(" Class:"+ Type5);
    println("Subcclass" +SubType1);
  }
}


abstract class SubClass2 extends Class5
{
  var SubType2: String = "Dog"
  def information5():String
  {
    println(" Type: " +Name);
    println(" Class:"+ Type5);
    println(" SubClass:" +SubType2);
  }
}


abstract class SubClass3 extends Class5
{
  var SubType3: String = "Primate"
  def information5():String
  {
    println(" Type:" +Name);
    println(" Class:"+ Type5);
    println(" SubClass: "+ SubType3);
  }
}





object Main
{
    def main(args: Array[String]): Unit = {

    }
  }