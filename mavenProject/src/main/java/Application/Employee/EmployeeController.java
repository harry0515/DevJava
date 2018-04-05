package Application.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/employee")
    public List<EmployeeEntity> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @RequestMapping("/employee/{id}")
    public EmployeeEntity getEmployee(@PathVariable String id){
        return employeeService.getEmployee(id);
    }
    @RequestMapping(method = RequestMethod.POST, value = "/employee")
    public void addEmployee(@RequestBody EmployeeEntity employee){
        employeeService.addEmployee(employee);
    }
    @RequestMapping(method=RequestMethod.DELETE, value ="/employee/{id}")
    public void deleteEmployee(@PathVariable String id){
        employeeService.deleteEmployee(id);
    }
    @RequestMapping(method = RequestMethod.PUT, value="/employee")
    public void updateEmployee(@RequestBody EmployeeEntity employee){
        employeeService.updateEmployee(employee);
    }
}
