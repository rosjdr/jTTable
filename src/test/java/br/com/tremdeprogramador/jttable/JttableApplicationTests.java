package br.com.tremdeprogramador.jttable;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.tremdeprogramador.jttable.model.Teacher;

@SpringBootTest
class JttableApplicationTests {

	@Test
	void testTeacherCreation() {
		int[] constraints = {0, 0, 1,1,0,0,0,0,1,1};
		Teacher teacher = new Teacher("Rodrigo", 1L, constraints);
		assertEquals(teacher.toString(), "Teacher [id=1, name=Rodrigo, constraints= {0,0,1,1,0,0,0,0,1,1} ]");
	}

}
