public class Cat
{
    private String name;
    private int age;

    public Cat(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    // add a getAge() getter below for
    // obtaining the Cat's age
    public int getAge(){
        return age;
    }



    // MODIFY this method so that the the Cat randomly
    // returns one of three different messages
    // (make any messages you want!) rather than always returning "meow".
    // Each message should have equal chance of being returned.
    public String speak()
    {
        int randomNum = (int) (Math.random()*3)+1;
        if (randomNum == 1) {
            return "mew!";
        }
        if (randomNum == 2) {
            return "meow!";
        }
        if (randomNum == 3) {
            return "mroooooooooooooooooooooooooow!";
        }
        return  "";
    }

    public void introduce()
    {
        System.out.println("Hello. My name is " + name + " and I am " + age + " years old. Now, mind your own business.");
    }
}