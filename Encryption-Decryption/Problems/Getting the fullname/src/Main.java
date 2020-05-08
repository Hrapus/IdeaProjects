class User {

    public static void main(String[] args) {
        User katie = new User();
        katie.setFirstName(null);
        katie.setLastName(null);
        System.out.println(katie.getFullName());
    }


    private String firstName;
    private String lastName;

    public User() {
        this.firstName = "";
        this.lastName = "";
    }

    public void setFirstName(String firstName) {
        // write your code here
        if(firstName != null) {
            this.firstName = firstName;
        }        else this.firstName = "";
    }

    public void setLastName(String lastName) {
        // write your code here
        if (lastName != null) {
            this.lastName = lastName;
        }        else lastName = "";
    }

    public String getFullName() {
        // write your code here
        if (this.firstName.equals("") && (this.lastName.equals("")))
            return "Unknown";
        else return (firstName + " " + lastName).trim();
    }

}