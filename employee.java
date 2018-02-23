public class Employee {
    private String fullName;
    private String numberPhone;
    private int photo;

    public Employee(){
        fullName ="";
        numberPhone="";
        photo = 0;
    }

    public Employee(String fullName, String numberPhone, int photo){
        this.fullName = fullName;
        this.numberPhone = numberPhone;
        this.photo = photo;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
