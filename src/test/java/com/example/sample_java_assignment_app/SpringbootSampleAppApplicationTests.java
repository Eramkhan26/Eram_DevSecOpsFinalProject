package com.example.sample_java_assignment_app;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SpringbootSampleAppApplicationTests {

	@Test
	void testLoginMethod() {
        SpringbootSampleAppApplication obj=new SpringbootSampleAppApplication();
         String res=obj.login("Mute");
         assertEquals("Please input your credentials for login...",res);
	}

    @Test
    void testRegisterUser() {
        SpringbootSampleAppApplication obj=new SpringbootSampleAppApplication();
        String res=obj.register("Mute");
        assertEquals("Please follow registration process...",res);
    }
    @Test
    void mainTest() {
        SpringbootSampleAppApplication.main(new String[]{
        });
    }

}
