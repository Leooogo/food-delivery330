package untitled.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import untitled.StoreOwnerApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { StoreOwnerApplication.class })
public class CucumberSpingConfiguration {}
