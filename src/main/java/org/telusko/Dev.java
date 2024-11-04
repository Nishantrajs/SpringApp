package org.telusko;


public class Dev
{
    private Computer com;
    int age ;


    public Dev()
    {
        System.out.println("Dev Constuctor");
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public Computer getComp() {
        return com;
    }

    public void setComp(Computer com) {
        this.com = com;
    }

    public void build()
    {
        System.out.println("Working on Awesome Project");
        com.compile();
    }
}
