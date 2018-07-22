package com.t.t;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.t.domain.TestVO;
import com.t.persistence.TestDAO;
//import com.t.service.TestService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/*.xml" })
public class TestDAOTest {
	
	@Inject
	private TestDAO dao ;
	
//	@Inject 
//	private TestService service;
	
	@Test 
	public void testTime() throws Exception {
		System.out.println(dao.getTime());
	}
	
	@Test
	public void testInsertTest() throws Exception{
		TestVO vo1 = new TestVO();
//		TestVO vo2 = new TestVO();
		
		try {
			vo1.setId(123);
			vo1.setColumn1(1);
			vo1.setColumn2(2);
			vo1.setColumn3(3);
			vo1.setColumn4(4);
			vo1.setColumn5("5");
			vo1.setColumn6("6");
			vo1.setColumn7("7");
			vo1.setColumn8("8");
			vo1.setColumn9("9");
//			
//			vo2.setId(19);
//			vo2.setColumn1(1);
//			vo2.setColumn2(2);
//			vo2.setColumn3(3);
//			vo2.setColumn4(4);
//			vo2.setColumn5("5");
//			vo2.setColumn6("6");
//			vo2.setColumn7("7");
//			vo2.setColumn8("8");
//			vo2.setColumn9("9");
			
//			service.testDuplicateSave(vo1, vo2);
			dao.insertMember(vo1);
			System.out.println("success");
		}catch (Exception e) {
			System.out.println(e);	
		}
	}
}
