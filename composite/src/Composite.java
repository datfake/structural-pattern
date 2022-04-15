public class Composite {
    public static void main(String[] args) {
        Employee CEO = new Employee("aQuang", "Admin", 1000);
        Employee CTO = new Employee("aKien", "Admin", 2000);
        Employee talkBot = new Employee("aDuc", "AI", 5000);
        Employee bigData = new Employee("aTan", "Data", 5000);

        CEO.addEmployee(CTO);
        CTO.addEmployee(talkBot);
        CTO.addEmployee(bigData);
        System.out.println(CEO);

        for (Employee headEmployee : CEO.getSubordinates()) {
            System.out.println(headEmployee);

            for (Employee employee : headEmployee.getSubordinates()) {
                System.out.println(employee);
            }
        }
    }
}
