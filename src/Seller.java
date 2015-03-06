/**
 * Created by Martha on 06.03.15.
 */
public class Seller {

    // region Instance Fields
    private String name;
    private int age;
    private float sallary;

    // endregion

    // region Constructors

    public Seller(String name, int age, float sallary) {
        this.name = name;
        this.age = age;
        this.sallary = sallary;
    }

    // endregion

    // region Member Methods

    public void printInfo (){
        System.out.println(name + "\t" + age + "\t" + "Sallary" + "\t" + sallary);
    }

    // endregion

    // region Setters and Getters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getSallary() {
        return sallary;
    }

    public void setSallary(float sallary) {
        this.sallary = sallary;
    }

    // endregion
}
