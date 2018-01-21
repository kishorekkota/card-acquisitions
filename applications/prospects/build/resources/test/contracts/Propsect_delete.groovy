

import org.springframework.cloud.contract.spec.Contract

Contract.make {

    description(" /prospects/{id} end point allow consumers to delete Prospect ")

    request{
        method "DELETE"
        urlPath ("/prospects/test")


    }

    response{
        status 204
    }

}
