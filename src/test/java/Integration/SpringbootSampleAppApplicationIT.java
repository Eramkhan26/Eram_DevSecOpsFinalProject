package com.example.sample_java_assignment_app.integration;

import com.example.sample_java_assignment_app.SpringbootSampleAppApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes = SpringbootSampleAppApplication.class)
class SpringbootSampleAppApplicationIT {

    @Autowired
    SpringbootSampleAppApplication springbootSampleAppApplication;

    @Test
    void loginIntegrationTest() {
        String output = springbootSampleAppApplication.login("Heeloo");
        assertEquals("Please input your credentials for login...", output);
    }

    @Test
    void registerIntegrationTest() {
        String result = springbootSampleAppApplication.register("Mute");
        assertEquals("Please follow registration process...", result);
    }

    @Test
    void mainTest() {
        SpringbootSampleAppApplication.main(new String[]{

        });
    }
}
