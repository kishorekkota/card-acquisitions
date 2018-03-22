package com.example;


import com.cloud.app.ProspectApplications;
import com.cloud.app.ProspectController;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;
import org.junit.ClassRule;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ProspectApplications.class, webEnvironment = SpringBootTest.WebEnvironment.NONE)

public abstract class ContractVerifierBase {



    @InjectMocks
    ProspectController controller;

    @Before
    public void setup()
    {

        RestAssuredMockMvc.standaloneSetup(controller);
    }

}
