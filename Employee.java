class Employee {
  private String firstName;   // the first name of the employee
  private char middleInitial; // the middle initial
  private String lastName;    // the last name of the employee
  
  public Employee(String firstName, char middleInitial, String lastName)
  {
    this.firstName = firstName;
    this.middleInitial = middleInitial;
    this.lastName = lastName;
  }
  
  public String getFirstName() { return firstName; }
  public char getMiddleInitial() { return middleInitial;}
  public String getLastName() { return lastName; }
  


  public char getLastInitial(){
    return lastName.charAt(0);
  }

  public boolean hasDoubleName(){
    return (firstName.equals(lastName));
  }

  public int getNameLength(){
    return firstName.length() + 1 + lastName.length();
  }
 

 public String getFullName(){
   String x = firstName +" "+ middleInitial + ". " + lastName;
  return x.toUpperCase();
 }

 public String getMonogram(){
   String x = firstName.substring(0,1) + middleInitial + lastName.substring(0,1);
   return x.toLowerCase();
 }

 public void setMiddleInitial(char c){
   if (Character.isAlphabetic(c)){
     middleInitial = Character.toUpperCase(c);
   }

 }
}
