package com.office.portal.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.office.portal.entity.Course;
import com.office.portal.entity.EnquiryStatus;
import com.office.portal.repo.CourseRepository;
import com.office.portal.repo.EnquiryStatusRepository;

@Component
public class DataLoader implements ApplicationRunner{

	@Autowired
	private CourseRepository courseRepo;
	
	@Autowired
	private EnquiryStatusRepository enquiryStatusRepo;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		//insert records for non-transactional table "COURSES" 
		Course c1 = new Course();
		c1.setCourseName("Java Fullstack");
		courseRepo.save(c1);
		
		Course c2 = new Course();
		c2.setCourseName("Realtime Project");
		courseRepo.save(c2);
		
		Course c3 = new Course();
		c3.setCourseName("DevOps");
		courseRepo.save(c3);
		
		Course c4 = new Course();
		c4.setCourseName("AWS");
		courseRepo.save(c4);
		
		Course c5 = new Course();
		c5.setCourseName("Logical Programming");
		courseRepo.save(c5);
		
		Course c6 = new Course();
		c6.setCourseName("Angular JS");
		courseRepo.save(c6);
		
		Course c7 = new Course();
		c7.setCourseName("React JS");
		courseRepo.save(c7);
		
		
		
		//insert records for non-transactional table "ENQUIRY_STATUS" 
		EnquiryStatus e1 = new EnquiryStatus();
		e1.setEnquiryStatus("New");
		enquiryStatusRepo.save(e1);
		
		
		EnquiryStatus e2 = new EnquiryStatus();
		e2.setEnquiryStatus("Enrolled");
		enquiryStatusRepo.save(e2);
		
		EnquiryStatus e3 = new EnquiryStatus();
		e3.setEnquiryStatus("Lost");
		enquiryStatusRepo.save(e3);
		
		
		
		
		
		
	}

}
