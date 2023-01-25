public class SecretStudent {
    private String name;
    private String surname;
    private int studentNumber;

    public SecretStudent(String name, String surname, int studentNumber) {
        this.name = name;
        this.surname = surname;
        this.studentNumber = studentNumber;
    }

    public void setName(String name2) {
        this.name=name2;
        if(!name.isEmpty()) {
            this.name = name2;
        }
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public String setName() {
        return name;}
}
