package employeeApp;

import employeeApp.enums.Plan;
import employeeApp.model.Company;
import employeeApp.model.Employee;
import employeeApp.model.Healthplan;

import java.util.Arrays;

public class Main
{
    private static void workWithData ()
    {
        Healthplan plan1 = new Healthplan(1, "A Sigorta", Plan.ADVANCE);
        Healthplan plan2 = new Healthplan(2, "B Sigorta", Plan.MEDIUM);

        System.out.println(plan1);
        System.out.println(plan2);

        String[] healthplans = new String[3];
        healthplans[0] = plan1.getName();
        healthplans[1] = plan2.getName();

        Employee employee = new Employee(1, "Emre",
                "emre.com", "1234", healthplans);

        employee.addHealthplan(0, "C Sigorta");
        employee.addHealthplan(2, "A Sigorta");
        employee.addHealthplan(2, "C Sigorta");
        employee.addHealthplan(3, "T Sigorta");
        System.out.println(Arrays.toString(employee.getHealthPlans()));

        System.out.println("**********************************");
        Company company = new Company(1, "Workintech",
                1000000000, new String[]{"Emre", null, null});

        company.addEmployee(0, "Ali ");
        company.addEmployee(2, "Emre");
        company.addEmployee(-1, "Emre");
        company.addEmployee(5, "Emre");

        System.out.println(Arrays.toString(company.getDeveloperNames()));
        System.out.println(company);

    }

    public static void main(String[] args)
    {
        workWithData();
    }
}
