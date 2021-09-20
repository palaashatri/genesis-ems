package com.ltts.project.ems.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.ltts.project.ems.model.Employee;
import com.ltts.project.ems.service.EmployeeService;

@Controller
public class EmployeeController {
	/*package com.ltts.project.ems.controller;
	import java.time.LocalDate;
	import java.time.format.DateTimeFormatter;

	import javax.servlet.http.HttpServletRequest;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;
	import org.springframework.web.bind.annotation.RestController;
	import org.springframework.web.servlet.ModelAndView;

	import com.fasterxml.jackson.annotation.JsonCreator.Mode;
	import com.ltts.project.ems.dao.EmployeeDao;
	import com.ltts.project.ems.model.Employee;
	import com.ltts.project.ems.service.EmployeeDaoService;


	@RestController
	public class EmployeeController {

	@Autowired
	EmployeeDaoService service;
	

	@Autowired
	private EmployeeDao employeeDao;
	
	// view employee details
	@RequestMapping("/employees/{id}")
	public ModelAndView m1(@PathVariable(name = "id") int id){
		ModelAndView map = new ModelAndView("employeeProfile");
		map.addObject("id", id);
		map.addObject("service", service);

		return map;
	}
	
	// add new employee view
	@RequestMapping("/employees/new")
	public ModelAndView m2()
	{
		return new ModelAndView("addEmployee");
	}
	
	// adding the employee through form
	@RequestMapping(value="/insertEmployee",method = RequestMethod.POST)
	public ModelAndView m3(HttpServletRequest request)
	{
		ModelAndView mv=null;
		int id=Integer.parseInt(request.getParameter("eid"));
		String e_firstName=request.getParameter("fname");
		String e_lastName=request.getParameter("lname");
		String e_userName=request.getParameter("uname");
		String e_password=request.getParameter("password");
		
	
		//DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String doj=request.getParameter("doj");
		String dob=request.getParameter("dob");
		
		LocalDate e_doj=LocalDate.parse(doj);
		String e_gender=request.getParameter("gender");
		LocalDate e_dob=LocalDate.parse(dob);
		String e_role=request.getParameter("role");
		String e_imgUrl="Image goes here";
		int e_deptId=Integer.parseInt(request.getParameter("did"));
		String status="active";
        Employee e=new Employee(id,e_firstName,e_lastName,e_userName,e_password,e_doj,e_gender,e_dob,e_role,e_deptId,e_imgUrl,status);

		Employee e1=service.insertEmployee(e);
		System.out.println(e1);
	

		mv=new ModelAndView("success");
		return mv;
	}

	// to be looked : update employee
	// need to create restful route : "/employees/{id}/update"
	 @RequestMapping("updateEmployees")
		public ModelAndView m11() {
			
			return new ModelAndView("updateEmployees");
		}
		@RequestMapping(value="updateEmployee",method = RequestMethod.POST)
		public ModelAndView m6(HttpServletRequest request) {
			ModelAndView mv=null;
			int empId=Integer.parseInt(request.getParameter("mnum"));
			String firstName=request.getParameter("mname");
			String lastName=request.getParameter("lname");
			String userName=request.getParameter("uname");
			String password=request.getParameter("pass");
			DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy-MM-dd");
			String dateOfJoining=request.getParameter("doj");
			System.out.println(dateOfJoining+"&&&&");
			LocalDate ld=LocalDate.parse(dateOfJoining);
			String g=request.getParameter("gender");
			char gender=g.charAt(0);
			String dateOfBirth=request.getParameter("dob");
			System.out.println(dateOfBirth+"&&&&");
			LocalDate ld1=LocalDate.parse(dateOfBirth);
			String role=request.getParameter("role");
			int deptId=Integer.parseInt(request.getParameter("deptId"));
			Employee m=service.getEmployeeById(empId);
			m.setFirstName(firstName);
			m.setLastName(lastName);
			m.setUserName(userName);
			m.setPassword(password);
			//m.setDateOfJoining(dateOfJoining);
			m.setRole(role);
			//m.setGender(gender);
			m.setDepartmentId(deptId);
			m.setDateOfBirth(ld1);
			Employee m1=service.updateEmployee(m);
			mv=new ModelAndView("success");
			return mv;
		}
		
	@RequestMapping("/employees/{id}/setInactive")
	public ModelAndView m12(@PathVariable(name = "id") int id){
		Employee em = service.getEmployeeById(id);
		em.setIsActive("false");
		service.updateEmployee(em);
		ModelAndView mv = new ModelAndView("success");
		return mv;
	 }
	 }
	 */
		
	@Autowired
	EmployeeService employeeService;
	
    @GetMapping("/employees")

    	public String viewHomePage(Model model)
    	{
    		model.addAttribute("listEmployees",employeeService.getAllEmployees());
    		System.out.print(employeeService.getAllEmployees());
			return "employees";
    	}
     @GetMapping("/employees/new")
	 public String showNewEmployeeForm(Model model) {
		// create model attribute to bind form data
		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		return "new_employee";
	}
    @PostMapping("/saveEmployee")
	public String saveEmployee(@ModelAttribute("employee") Employee employee) {
		
		employeeService.saveEmployee(employee);
		return "redirect:/employees";
	}
    
    @GetMapping("/employees/{id}/update")
	public String showFormForUpdate(@PathVariable ( value = "id") int id, Model model) {
		
		
		Employee employee = employeeService.getEmployeeById(id);
		
		
		model.addAttribute("employee", employee);
		return "update_employee";
	}

	@GetMapping("/employees/{id}/setInactive")
	public String setInactive(@PathVariable(value = "id") int id){
		Employee employee = employeeService.getEmployeeById(id);
		employee.setIsActive("false");
		employeeService.saveEmployee(employee);
		return "redirect:/employees";
	}
    
    }
