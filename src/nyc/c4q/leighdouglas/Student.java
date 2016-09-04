package nyc.c4q.leighdouglas;

/**
 * Created by leighdouglas on 9/4/16.
 */
public class Student {

    private String firstName;
    private String lastName;
    private int idNumber;
    private String favoriteFood;

    public Student(String firstName, String lastName, int idNumber, String favoriteFood){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.favoriteFood = favoriteFood;
    }

    public static boolean checkSameFavoriteFoods(Student student1, Student student2){
        boolean sameFavoriteFood = false;

        if (student1.getFavoriteFood().equalsIgnoreCase(student2.getFavoriteFood())){
            sameFavoriteFood = true;
        }
        return sameFavoriteFood;
    }

    public String getFavoriteFood(){
        return favoriteFood;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

}
