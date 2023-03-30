package untitled.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import untitled.HungerApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { HungerApplication.class })
public class CucumberSpingConfiguration {}
