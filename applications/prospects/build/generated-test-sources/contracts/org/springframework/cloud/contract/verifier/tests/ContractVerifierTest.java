package org.springframework.cloud.contract.verifier.tests;

import com.example.ContractVerifierBase;
import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;
import io.restassured.module.mockmvc.specification.MockMvcRequestSpecification;
import io.restassured.response.ResponseOptions;
import org.junit.Test;

import static com.toomuchcoding.jsonassert.JsonAssertion.assertThatJson;
import static io.restassured.module.mockmvc.RestAssuredMockMvc.*;
import static org.springframework.cloud.contract.verifier.assertion.SpringCloudContractAssertions.assertThat;

public class ContractVerifierTest extends ContractVerifierBase {

	@Test
	public void validate_propsect_add() throws Exception {
		// given:
			MockMvcRequestSpecification request = given()
					.body("");

		// when:
			ResponseOptions response = given().spec(request)
					.post("/prospects");

		// then:
			assertThat(response.statusCode()).isEqualTo(201);
	}

	@Test
	public void validate_propsect_delete() throws Exception {
		// given:
			MockMvcRequestSpecification request = given();

		// when:
			ResponseOptions response = given().spec(request)
					.delete("/prospects/test");

		// then:
			assertThat(response.statusCode()).isEqualTo(204);
	}

	@Test
	public void validate_propsect_get() throws Exception {
		// given:
			MockMvcRequestSpecification request = given();

		// when:
			ResponseOptions response = given().spec(request)
					.get("/prospects/test");

		// then:
			assertThat(response.statusCode()).isEqualTo(200);
	}

}
