
# CheckWithReportIds

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.String** | The unique identifier for the check. Read-only. |  [optional]
**createdAt** | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | The date and time when this check was created. Read-only. |  [optional]
**href** | **kotlin.String** | The uri of this resource. Read-only. |  [optional]
**status** | **kotlin.String** | The current state of the check in the checking process. Read-only. |  [optional]
**result** | **kotlin.String** | The overall result of the check, based on the results of the constituent reports. Read-only. |  [optional]
**downloadUri** | **kotlin.String** | A link to a PDF output of the check results. Append &#x60;.pdf&#x60; to get the pdf file. Read-only. |  [optional]
**formUri** | **kotlin.String** | A link to the applicant form, if the check is of type &#x60;standard&#x60;. Read-only. |  [optional]
**redirectUri** | **kotlin.String** | For &#x60;standard&#x60; checks, redirect to this URI when the applicant has submitted their data. Read-only. |  [optional]
**resultsUri** | **kotlin.String** | A link to the corresponding results page on the Onfido dashboard. |  [optional]
**type** | **kotlin.String** | The type of the check, &#x60;standard&#x60; or &#x60;express&#x60;. |  [optional]
**reportTypeGroups** | **kotlin.Array&lt;kotlin.String&gt;** | Array containing ids of the Report type groups being requested for. Write-only. |  [optional]
**tags** | **kotlin.Array&lt;kotlin.String&gt;** | Array of tags being assigned to this check. |  [optional]
**suppressFormEmails** | **kotlin.Boolean** | For standard checks, applicant form will not be automatically sent if this is set to true. You can manually send the form at any time after the check has been created, using the link found in the form_uri attribute of the check object. Write-only.  |  [optional]
**chargeApplicantForCheck** | **kotlin.Boolean** | For standard checks, applicants will be presented with a mandatory payment screen before they can submit the applicant form, if this is set to true. In this case, your account will not be charged. Write-only.  |  [optional]
**brandId** | **kotlin.String** | ID of the brand under which the check should be conducted. Write-only. |  [optional]
**async** | **kotlin.Boolean** | If this is set to true, we will queue checks for processing and return a response immediately. You can configure webhooks to notify you when the report is complete. Write-only.  |  [optional]
**reports** | **kotlin.Array&lt;kotlin.String&gt;** | An array of report ids. |  [optional]



