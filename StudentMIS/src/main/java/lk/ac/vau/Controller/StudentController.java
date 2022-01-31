package lk.ac.vau.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lk.ac.vau.Model.Student;
import lk.ac.vau.Service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@GetMapping
	public String getStudents (Model model)
	{
		model.addAttribute("students",service.getAll());
		return "student/index";
	}
	
	@GetMapping("/{id}")
	public String getStudent(@PathVariable("id") String id,Model model) {
		model.addAttribute("student", service.get(id));
		return "student/details";
	}
	
	@GetMapping("/create")
	public String viewAddStudent(Student student, Model model) {
		model.addAttribute("departments", service.getDepartments());
		return "student/create";
	}
	
	@PostMapping
	public String AddStudent(@Valid Student student,BindingResult result ,Model model) {
		if(result.hasErrors()) {
			model.addAttribute("departments", service.getDepartments());
			return "student/create";
		}
		service.add(student);
		return "redirect:/student";
	}
	
	@GetMapping("/update/{id}")
	public String viewUpdateStudent(@PathVariable("id") String id,Model model) {
		model.addAttribute("student", service.get(id));
		model.addAttribute("departments", service.getDepartments());
		return "student/update";
	}
	
	@PostMapping("update/{id}")
	public String updateStudent(@PathVariable("id") String id, @Valid Student student,BindingResult result ,Model model) {
		if(result.hasErrors()) {
			model.addAttribute("departments", service.getDepartments());
			return "student/update";
		}
		service.update(student);
		return "redirect:/student";
	}
	
	@GetMapping("/delete/{id}")
	public String viewDeleteStudent(@PathVariable("id") String id,Model model) {
		model.addAttribute("student", service.get(id));
		return "student/delete";
	}
	
	@PostMapping("/delete/{id}")
	public String deleteStudent(@PathVariable("id") String id, Student student/*,Model model*/) {
		service.delete(student);
		return "redirect:/student";
	}
	
}
