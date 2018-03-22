package contracts

import org.springframework.cloud.contract.spec.Contract
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner



Contract.make {

    description(" /prospects end point allow consumers to submit Prospect " +
            "prior to applying for credit card.")

    request{
        method "POST"
        url "/prospects"

        body {

            name: anyNonBlankString()

            address: anyNonBlankString()

            social: anyNumber()

            dateOfBirth: anyNumber()

            phone: anyNumber()

        }
    }



    response{

        status 201

    }

}
