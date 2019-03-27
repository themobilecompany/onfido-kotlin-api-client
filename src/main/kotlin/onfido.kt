import org.openapitools.client.apis.DefaultApi
import org.openapitools.client.models.Check
import org.openapitools.client.models.Report

fun main(args: Array<String>) {
    var inProgressApplicant = "d3fef83d-cf19-4219-bf6d-e3b05508de7a"
    var completeApplicantId = "54266f58-fff3-40a5-ac8b-2c31c7fc1e97"
    var postmanApiLocalHeader = mapOf(Pair("Authorization", "Token token=test_cQ1tewFUQap0Vrw0mL5HOFkaINPBc-Td"), Pair("x-api-key", "d0cb7c07f38546709e6d46a34ae5f764"))

    var defaultApi = DefaultApi(basePath = "https://d1922422-5065-47e3-ac51-4d8bf189df33.mock.pstmn.io/v2/")

    var applicant =  defaultApi.findApplicant(inProgressApplicant, localVariableHeaders = postmanApiLocalHeader)

    println(applicant)

    val reports = java.util.ArrayList<Report>()

    reports.add(Report(name = "identity"))

    val check = Check(type = "express", reports = reports.toTypedArray())

    var checkResults = defaultApi.createCheck(inProgressApplicant, check = check, localVariableHeaders = postmanApiLocalHeader)


    println("check results" + checkResults)


}