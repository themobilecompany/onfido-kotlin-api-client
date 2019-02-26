
# Address

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**flatNumber** | **kotlin.String** | The flat number of this address |  [optional]
**buildingNumber** | **kotlin.String** | The building number of this address |  [optional]
**buildingName** | **kotlin.String** | The building name of this address |  [optional]
**street** | **kotlin.String** | The street of the applicant’s address |  [optional]
**subStreet** | **kotlin.String** | The sub-street of the applicant’s address |  [optional]
**town** | **kotlin.String** | The town of the applicant’s address |  [optional]
**postcode** | **kotlin.String** | The postcode or ZIP of the applicant’s address |  [optional]
**country** | **kotlin.String** | The 3 character ISO country code of this address. For example, GBR is the country code for the United Kingdom |  [optional]
**startDate** | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | The date the applicant started living at this address |  [optional]
**endDate** | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | The date the applicant left this address. If current residence, leave null |  [optional]
**state** | **kotlin.String** | The address state. US states must use the USPS abbreviation (see also ISO 3166-2:US), for example AK, CA, or TX. |  [optional]



