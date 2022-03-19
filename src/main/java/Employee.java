public class Employee {
    public long id;
    public String firstName;
    public String lastName;
    public String country;
    public int age;

    public Employee() {
        // Пустой конструктор
    }

    public Employee(long id, String firstName, String lastName, String country, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.age = age;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Employee");
        sb.append("{");
        sb.append("id=");
        sb.append(id);
        sb.append(", ");
        sb.append("firstName=");
        sb.append("'" + firstName + "'");
        sb.append(", ");
        sb.append("lastName=");
        sb.append("'" + lastName + "'");
        sb.append(", ");
        sb.append("country=");
        sb.append("'" + country + "'");
        sb.append(", ");
        sb.append("age=");
        sb.append(age);
        sb.append("}");

        return sb.toString();
    }
}