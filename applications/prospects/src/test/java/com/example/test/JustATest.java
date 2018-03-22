package com.example.test;


import org.junit.Assert;
import org.junit.ClassRule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.cloud.contract.stubrunner.junit.StubRunnerRule;
import org.springframework.test.context.junit4.SpringRunner;
import spock.lang.Shared;

@RunWith(SpringRunner.class)
public class JustATest {


//    @ClassRule
//    @Shared
//    StubRunnerRule rule = new StubRunnerRule()
//            .repoRoot("http://some_url")
//            .downloadStub("a.b.c", "loanIssuance")
//            .downloadStub("a.b.c:fraudDetectionServer")
//            .withMappingsOutputFolder("target/outputmappings");

    @Test
    public void test()
    {

        Assert.assertTrue(true);

    }

}
