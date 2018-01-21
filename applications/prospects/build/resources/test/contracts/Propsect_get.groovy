

import org.springframework.cloud.contract.spec.Contract

Contract.make {

    description(" /prospects end point allow consumers to submit Prospect " +
            "prior to applying for credit card.")

    request{
        method "GET"

        urlPath ("/prospects/test")
        //urlPath(String.)

        //url url($(consumer(regex('/prospects/[a-zA-Z0-9]+')), producer('/prospects/123456abcd')))
    }



    response{

        status 200

    }

}
