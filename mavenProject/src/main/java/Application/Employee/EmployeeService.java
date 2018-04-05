package Application.Employee;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
//    private List<EmployeeEntity> employees = new ArrayList<>(Arrays.asList(
//            new EmployeeEntity("1","Hari","Thalisetti","123@gmail.com","Sanjose"),
//            new EmployeeEntity("2","Pravarakhya","Chi","123e@gmail.com","Atlanta"),
//            new EmployeeEntity("3","Sai","Charan","c123@gmail.com","Atlanta")
//    ));

    public List<EmployeeEntity> getAllEmployees(){
        List<EmployeeEntity> employee = new ArrayList<>();
        for (EmployeeEntity emp:employeeRepository.findAll()) {
            employee.add(emp);
        }
        return employee;
    }

    public EmployeeEntity getEmployee(String id){
        return employeeRepository.findOne(id);
    }

    public void addEmployee(EmployeeEntity employee){
        employeeRepository.save(employee);

    }
    public void deleteEmployee(String id){
        employeeRepository.delete(id);
    }
    public void updateEmployee(EmployeeEntity employee){
        employeeRepository.save(employee);

    }

}
