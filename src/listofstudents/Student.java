package listofstudents;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shaim
 */
public class Student {
  private String name;
  private int id;
  private String DOB;
  
  private int maxHours;
  
  
  public Student()
  {
       this.id =0;
       this.name = "Not Set";
  }
  
  public Student(String givenName, int givenId)
  {
      this.name = givenName;
      this.id = givenId;
  }
  
  public void setName (String givenName)
  {
      this.name = givenName;
  }
  public String getName()
  {     
      return name;
  }
  
  public void setId(int givenId)
  {
      id = givenId;
  }
  /**
     * @ return the Id of the student
     */
  
  public int getId()
  {
      return 0;
  }
  
  ///getter and setter are removed

    /**
     * @return the maxHours
     */
    public int getMaxHours() {
        return maxHours;
    }

    /**
     * @param maxHours the maxHours to set
     */
    public void setMaxHours(int maxHours) {
        this.maxHours = maxHours;
    }
  
}
