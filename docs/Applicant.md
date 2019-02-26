
# Applicant

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.String** | The unique identifier for the applicant. Read-only. |  [optional]
**createdAt** | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | The date and time when this applicant was created. Read-only. |  [optional]
**deleteAt** | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | The date and time when this applicant is scheduled to be deleted. Read-only. |  [optional]
**href** | **kotlin.String** | The uri of this resource. Read-only. |  [optional]
**sandbox** | **kotlin.Boolean** | Read-only. |  [optional]
**title** | **kotlin.String** | The applicant’s title |  [optional]
**firstName** | **kotlin.String** | The applicant’s first name |  [optional]
**middleName** | **kotlin.String** | The applicant’s middle name(s) or initial |  [optional]
**lastName** | **kotlin.String** | The applicant’s surname |  [optional]
**email** | **kotlin.String** | The applicant’s email address. Required if doing a US check or a standard UK check. |  [optional]
**gender** | **kotlin.String** | The applicant’s gender. Valid values are male and female. |  [optional]
**dob** | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | The applicant’s date of birth |  [optional]
**telephone** | **kotlin.String** | The applicant’s landline phone number |  [optional]
**mobile** | **kotlin.String** | The applicant’s mobile phone number |  [optional]
**country** | **kotlin.String** | The country where this applicant will be checked. This must be a three-letter ISO code e.g. GBR or USA |  [optional]
**nationality** | **kotlin.String** | The applicant&#39;s nationality. This must be a three-letter ISO code e.g. GBR or USA |  [optional]
**mothersMaidenName** | **kotlin.String** | The applicant’s mothers maiden name |  [optional]
**countryOfBirth** | **kotlin.String** | The applicant’s country of birth |  [optional]
**townOfBirth** | **kotlin.String** | The applicant’s town of birth |  [optional]
**previousLastName** | **kotlin.String** | The applicant’s previous last name |  [optional]
**addresses** | [**kotlin.Array&lt;Address&gt;**](Address.md) |  |  [optional]
**idNumbers** | [**kotlin.Array&lt;IdNumber&gt;**](IdNumber.md) |  |  [optional]



