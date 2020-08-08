package com.HeartRate;

public class HeartRate{
    private String firstName;
    private String lastName;
    private int bDay, bMonth, bYear;

    // constructor
    public HeartRate(String firstName, String lastName, int bDay, int bMonth, int bYear){
        setFirstName(firstName);
        setLastName(lastName);
        setDay(bDay);
        setMonth(bMonth);
        setYear(bYear);
    }
    
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){

        this.lastName = lastName;
    }
    public void setDay(int bDay){

        this.bDay = bDay;
    }
    public void setMonth(int bMonth)
    {
        this.bMonth = bMonth;
    }
    public void setYear(int bYear){

        this.bYear = bYear;
    }
    // getters
    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName()
    {
        return lastName;
    }

    public int getbDay() {
        return bDay;
    }

    public int getbMonth() {
        return bMonth;
    }

    public int getbYear() {
        return bYear;
    }

    public int getAge(){
        return 2020-getbYear();
    }

    public int getMaxHeartRate(){
        return 220 - getAge();
    }


}