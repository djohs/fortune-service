package io.pivotal;

import io.pivotal.fortune.FortuneController;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class BaseTestClass {

    @Autowired
    private FortuneController fortuneController;

    @Before
    public void setUp() {
        RestAssuredMockMvc.standaloneSetup(fortuneController);
    }

}
