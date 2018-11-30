package contracts.rest

org.springframework.cloud.contract.spec.Contract.make {
    request {
        method "POST"
        url "/upload"
        headers {
            contentType('multipart/form-data')
        }
        multipart(
                metadata: named(
                        name: value(stub(regex('.+')), test('metadata')),
                        content: value(stub(regex('.+')), test('''{"name": "donald", "hobby": "sleeping"}''')),
                        contentType: value(stub(regex(nonEmpty())), test('application/json'))
                ),
                file: named(
                        name: value(stub(regex('.+')), test('file')),
                        content: value(stub(regex('.+')), test([100, 117, 100, 97] as byte[]))
                )
        )
    }
    response {
        status 200
    }
}

