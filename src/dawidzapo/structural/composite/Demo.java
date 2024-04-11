package dawidzapo.structural.composite;

import dawidzapo.structural.composite.department.Department;
import dawidzapo.structural.composite.department.SingleDepartment;
import dawidzapo.structural.composite.head.HeadDepartment;

public class Demo {
    public static void main(String[] args) {
        Department financeDepartment = new SingleDepartment(1,"Finance");
        Department salesDepartment = new SingleDepartment(2,"Sales");
        Department managementDepartment = new SingleDepartment(3, "Department");

        HeadDepartment headDepartment = new HeadDepartment(4,"Head");
        headDepartment.addDepartment(salesDepartment, financeDepartment, managementDepartment);

        headDepartment.display();
    }
}
