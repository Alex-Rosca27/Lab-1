import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String delimitation = "===========================================================";
        System.out.println(delimitation);

        int[] numbers = {10, 5, 20, 25, 30, 40};
        System.out.println("The numbers of the array are: " + Arrays.toString(numbers));

        Arrays.sort(numbers);
        System.out.println("The numbers of the array are after sorting : " + Arrays.toString(numbers));

        int minValue = numbers[0];
        int maxValue = numbers[numbers.length - 1];
        int diffrence_Max_Min = maxValue - minValue;
        int secondMinValue = numbers[1];


        System.out.println("Maximum value is: " + maxValue);
        System.out.println("Minimum value is: " + minValue);
        System.out.println("The diffrence between Maximum and Minimum value is: " + diffrence_Max_Min);
        System.out.println("The second Minimum value is: " + secondMinValue);


        System.out.println(delimitation);
        System.out.println("");
        System.out.println("***The second method of resolving  task 1 and 2 ***");
        System.out.println("");
        System.out.println(delimitation);

        int[] numberOfArray = {30, 25, 50, 95, 10, 65, 85, 70};
        System.out.println("The numbers of the array are: " + Arrays.toString(numberOfArray));

        int max_Value = numberOfArray[0];
        int min_Value = numberOfArray[0];


        for (int i : numberOfArray)
            if (i > max_Value)
                max_Value = i;


        System.out.println("Max value of the array is : " + max_Value);


        for (int i : numberOfArray)
            if (i < min_Value)
                min_Value = i;


        System.out.println("Min value of the array is : " + min_Value);

        int diffrence_Max_Min2 = max_Value - min_Value;
        System.out.println("Diffrence of Max and Min of the array is : " + diffrence_Max_Min2);
        System.out.println(delimitation);

        int secondNumber = numberOfArray[0];

        for (int i : numberOfArray)
            if (i < secondNumber && i > min_Value)
                secondNumber = i;

        System.out.println("The second minimum value of the array is : " + secondNumber);
        System.out.println(delimitation);
        ArrayList<Employee> employeesOfTheCompany = new ArrayList<>();
        employeesOfTheCompany.add(new Employee("Alex", 23, "Lead", 5000));
        employeesOfTheCompany.add(new Employee("Valentin", 56, "Learning manager", 70000));
        employeesOfTheCompany.add(new Employee("Vasea", 33, "Safety", 4000));
        employeesOfTheCompany.add(new Employee("Anton", 44, "RME", 2500));
        employeesOfTheCompany.add(new Intern("Iura", 35, "ICQA", 15000));
        employeesOfTheCompany.add(new Intern("Angela", 54, " Clearring service ", 140000));
        employeesOfTheCompany.add(new Employee("Dorin", 36, "Lead pack", 7000));
        employeesOfTheCompany.add(new Intern("Dumitru", 37, " Stow", 4500));
        employeesOfTheCompany.add(new Employee("Adrian", 43, " Manager", 17000));
        employeesOfTheCompany.add(new Intern("Raul", 28, " Pick", 15000));

        for (Employee employee : employeesOfTheCompany) {

            if (employee instanceof Intern) {

                System.out.println("\nPresentation" + "\nName: " + employee.getNameEmployee() + "\nAge: " + employee.getAge() + "\nPosition in the Company: " + employee.getPositionEmployee() + "\nSalary: €" + employee.getSalaryOfEmployee());
            }

            else {

                System.out.println("\nPresentation" + "\nName: " + employee.getNameEmployee() + "\nAge: " + employee.getAge() + "\nPosition in the Company: " + employee.getPositionEmployee() + "\nSalary: €" + employee.getSalaryOfEmployee());
            }




        }


    }
}



