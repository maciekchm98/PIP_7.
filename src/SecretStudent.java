public class SecretStudent {
    private String name;
    private String surname;
    private int studentNumber;

    public SecretStudent(String name, String surname, int studentNumber) {
        this.name = name;
        this.surname = surname;
        this.studentNumber = studentNumber;
    }

    public void setName(String name) {
        if(!name.isEmpty()) {
            this.name = name;
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
}
