package dawidzapo.structural.composite.head;

import dawidzapo.structural.composite.department.Department;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HeadDepartment implements Department {
    private int id;
    private String name;
    List<Department> departments;

    public HeadDepartment(int id, String name) {
        this.id = id;
        this.name = name;
        this.departments = new ArrayList<>();
    }
    public void addDepartment(Department department){
        departments.add(department);
    }
    public void addDepartment(Department... departments){
        this.departments.addAll(Arrays.asList(departments));
    }
    public void removeDepartment(Department department){
        departments.remove(department);
    }

    @Override
    public void display() {
        for(var department : departments){
            department.display();
        }
    }
}
