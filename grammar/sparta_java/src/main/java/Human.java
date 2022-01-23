public class Human {
    String name;
    int age;
    int spead;
    int x,y;

    public Human(String name, int age, int spead, int x, int y) {
        this.name = name;
        this.age = age;
        this.spead = spead;
        this.x = x;
        this.y = y;
    }

    public Human(String name, int age, int spead) {
        this(name, age, spead, 0,0);
    }

    public String getLocation(){
        return "("+x+", "+y+")";
    }

    protected void printWhoAmI(){
        System.out.println("my name is"+name+", "+age+" aged.");
    }

}
