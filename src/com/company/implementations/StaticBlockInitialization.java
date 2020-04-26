package com.company.implementations;

/* Similar to eager initialization, except that instance of class
* is crated in the static block that provides option
* for exception handling
*/
public class StaticBlockInitialization {

  private static StaticBlockInitialization instance;

  // Private contructor to avoid client initialization
  private StaticBlockInitialization(){
  }

  // Static block initialization for exception handling
    static{
      try{
          instance = new StaticBlockInitialization();
      }catch (Exception e){
          throw new RuntimeException("Exception occured in creating singleton instance");
      }
  }

  // Get the singleton object
  public static StaticBlockInitialization getInstance(){
      return instance;
  }
}
