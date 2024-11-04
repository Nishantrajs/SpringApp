package org.telusko;


public class Dev
{
    Laptop laptop;
    int age ;

    public Dev(Laptop laptop) {
        this.laptop = laptop;
        System.out.println("Dev Laptop parameterized constructor");
    }

    public Dev()
    {
        System.out.println("Dev Constuctor");
    }

    public Dev(int age) {
        this.age = age;
        System.out.println("Dev Parameterized Constructor");
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public Laptop getLaptop()
    {
        return laptop;
    }

    public void setLaptop(Laptop laptop)
    {
        this.laptop = laptop;
    }

    public void build()
    {
        System.out.println("Working on Awesome Project");
        laptop.compile();
    }
}
