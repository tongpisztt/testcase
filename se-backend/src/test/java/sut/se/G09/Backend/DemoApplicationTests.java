package sut.se.G09.Backend;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.junit.Before;
import org.junit.Test;

import sut.se.G09.Backend.Entity.*;
import sut.se.G09.Backend.Repository.AgentAppointmentRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import java.util.Set;


@RunWith(SpringRunner.class)
//@SpringBootTest
@DataJpaTest
public class DemoApplicationTests {

	@Autowired private AgentAppointmentRepository agentAppointmentRepository;
	@Autowired private TestEntityManager entityManager;
	private Validator validator;

	@Before
	public void setup() {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		validator = factory.getValidator();
	}

	@Test
	public void testFirstNameCannotBeNull() {
		AgentAppointment a = new AgentAppointment();

		a.setAppointmentId(1L);
		a.setfName(null);
		a.setlName("Jundara");
		a.setAge(50);
		a.setTelNum("0885968462");
		a.setEmail("aaa@gmail.com");

		try {
			entityManager.persist(a);
			entityManager.flush();

			fail("Should not pass to this line");
		} catch(javax.validation.ConstraintViolationException e) {
			Set<ConstraintViolation<?>> violations = e.getConstraintViolations();
			assertEquals(violations.isEmpty(), false);
			assertEquals(violations.size(), 1);
		}
	}


	@Test
	public void testLastNameCannotBeNull() {
		AgentAppointment a = new AgentAppointment();
		a.setAppointmentId(1L);
		a.setfName("Prawut");
		a.setlName(null);
		a.setAge(50);
		a.setTelNum("0885968462");
		a.setEmail("aaa@gmail.com");
		try {
			entityManager.persist(a);
			entityManager.flush();

			fail("Should not pass to this line");
		} catch(javax.validation.ConstraintViolationException e) {
			Set<ConstraintViolation<?>> violations = e.getConstraintViolations();
			assertEquals(violations.isEmpty(), false);
			assertEquals(violations.size(), 1);
		}
	}

	@Test
	public void testLengthFNameNotEquals31(){
		AgentAppointment a = new AgentAppointment();
		a.setAppointmentId(1L);
		a.setfName("ประยุทธ์จันทร์อังคารพุธพฤหัสศุกร์");
		a.setlName("เสาร์อาทิตย์ติดบ้าน");
		a.setAge(60);
		a.setTelNum("0885968462");
		a.setEmail("aaa@gmail.com");
		try {
			entityManager.persist(a);
			entityManager.flush();

			fail("Should not pass to this line");
		} catch(javax.validation.ConstraintViolationException e) {
			Set<ConstraintViolation<?>> violations = e.getConstraintViolations();
			assertEquals(violations.isEmpty(), false);
			assertEquals(violations.size(), 1);
		}
	}

	@Test
	public void testLengthLNameNotEquals31(){
		AgentAppointment a = new AgentAppointment();
		a.setAppointmentId(1L);
		a.setfName("ประยุทธ์");
		a.setlName("จันทร์อังคารพุธพฤหัสศุกร์เสาร์อาทิตย์");
		a.setAge(60);
		a.setTelNum("0885968462");
		a.setEmail("aaa@gmail.com");
		try {
			entityManager.persist(a);
			entityManager.flush();

			fail("Should not pass to this line");
		} catch(javax.validation.ConstraintViolationException e) {
			Set<ConstraintViolation<?>> violations = e.getConstraintViolations();
			assertEquals(violations.isEmpty(), false);
			assertEquals(violations.size(), 1);
		}
	}

	@Test
	public void testTelNumberMustBeDigit(){
		AgentAppointment a = new AgentAppointment();
		a.setAppointmentId(1L);
		a.setfName("ประยุทธ์");
		a.setlName("จันทร์อังคาร");
		a.setAge(60);
		a.setTelNum("088FG68462");
		a.setEmail("aaa@gmail.com");
		try {
			entityManager.persist(a);
			entityManager.flush();

			fail("Should not pass to this line");
		} catch(javax.validation.ConstraintViolationException e) {
			Set<ConstraintViolation<?>> violations = e.getConstraintViolations();
			assertEquals(violations.isEmpty(), false);
			assertEquals(violations.size(), 1);
		}
	}

	@Test
	public void testAgeBetween2to3Digits(){
		AgentAppointment a = new AgentAppointment();
		a.setAppointmentId(1L);
		a.setfName("ประยุทธ์");
		a.setlName("จันทร์อังคาร");
		a.setAge(6);
		a.setTelNum("088FG68462");
		a.setEmail("aaa@gmail.com");
		try {
			entityManager.persist(a);
			entityManager.flush();

			fail("Should not pass to this line");
		} catch(javax.validation.ConstraintViolationException e) {
			Set<ConstraintViolation<?>> violations = e.getConstraintViolations();
			assertEquals(violations.isEmpty(), false);
			assertEquals(violations.size(), 1);
		}
	}



}

