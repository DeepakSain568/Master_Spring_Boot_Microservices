package com.LearnSpringBoot.first.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.LearnSpringBoot.first.Utilities.*;


@Controller
public class ProjectController {
   
	@Autowired
	 TestBean testBean;
	
	public ProjectController( ) {
//		this.testBean = testBean;
		System.out.println("Project Controller Bean Created");
	}
	
	public void RunMethod() {
		TestBean bean = testBean;
	}
	
}
