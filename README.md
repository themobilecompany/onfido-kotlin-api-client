# org.openapitools.client - Kotlin client library for Onfido API

## Gradle Dependency:
```implementation 'kotlin-client:kotlin-onfido-client:0.0.1'```

## Artifactory location:
```http://212.204.244.152:8081/artifactory/webapp/#/artifacts/browse/tree/General/plugins-release-local/kotlin-client/kotlin-onfido-client/0.0.1/kotlin-onfido-client-0.0.1.jar```

## Requires

* Kotlin 1.3.11
* Gradle 5.1

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://api.onfido.com/v2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**cancelReport**](docs/DefaultApi.md#cancelreport) | **POST** /checks/{check_id}/reports/{report_id}/cancel | This endpoint is for cancelling individual paused reports.
*DefaultApi* | [**createApplicant**](docs/DefaultApi.md#createapplicant) | **POST** /applicants | Create Applicant
*DefaultApi* | [**createCheck**](docs/DefaultApi.md#createcheck) | **POST** /applicants/{applicant_id}/checks | Create a check
*DefaultApi* | [**createWebhook**](docs/DefaultApi.md#createwebhook) | **POST** /webhooks | Create a webhook
*DefaultApi* | [**destroyApplicant**](docs/DefaultApi.md#destroyapplicant) | **DELETE** /applicants/{applicant_id} | Delete Applicant
*DefaultApi* | [**downloadDocument**](docs/DefaultApi.md#downloaddocument) | **GET** /applicants/{applicant_id}/documents/{document_id}/download | Download a documents raw data
*DefaultApi* | [**downloadLivePhoto**](docs/DefaultApi.md#downloadlivephoto) | **GET** /live_photos/{live_photo_id}/download | Download live photo
*DefaultApi* | [**downloadLiveVideo**](docs/DefaultApi.md#downloadlivevideo) | **GET** /live_videos/{live_video_id}/download | Download live video
*DefaultApi* | [**findAddresses**](docs/DefaultApi.md#findaddresses) | **GET** /addresses/pick | Search for addresses by postcode
*DefaultApi* | [**findApplicant**](docs/DefaultApi.md#findapplicant) | **GET** /applicants/{applicant_id} | Retrieve Applicant
*DefaultApi* | [**findCheck**](docs/DefaultApi.md#findcheck) | **GET** /applicants/{applicant_id}/checks/{check_id} | Retrieve a Check
*DefaultApi* | [**findDocument**](docs/DefaultApi.md#finddocument) | **GET** /applicants/{applicant_id}/documents/{document_id} | A single document can be retrieved by calling this endpoint with the document’s unique identifier.
*DefaultApi* | [**findLivePhoto**](docs/DefaultApi.md#findlivephoto) | **GET** /live_photos/{live_photo_id} | Retrieve live photo
*DefaultApi* | [**findLiveVideo**](docs/DefaultApi.md#findlivevideo) | **GET** /live_videos/{live_video_id} | Retrieve live video
*DefaultApi* | [**findReport**](docs/DefaultApi.md#findreport) | **GET** /checks/{check_id}/reports/{report_id} | A single report can be retrieved using this endpoint with the corresponding unique identifier.
*DefaultApi* | [**findReportTypeGroup**](docs/DefaultApi.md#findreporttypegroup) | **GET** /report_type_groups/{report_type_group_id} | Retrieve single report type group object
*DefaultApi* | [**findWebhook**](docs/DefaultApi.md#findwebhook) | **GET** /webhooks/{webhook_id} | Retrieve a Webhook
*DefaultApi* | [**listApplicants**](docs/DefaultApi.md#listapplicants) | **GET** /applicants | List Applicants
*DefaultApi* | [**listChecks**](docs/DefaultApi.md#listchecks) | **GET** /applicants/{applicant_id}/checks | Retrieve Checks
*DefaultApi* | [**listDocuments**](docs/DefaultApi.md#listdocuments) | **GET** /applicants/{applicant_id}/documents | List documents
*DefaultApi* | [**listLivePhotos**](docs/DefaultApi.md#listlivephotos) | **GET** /live_photos | List live photos
*DefaultApi* | [**listLiveVideos**](docs/DefaultApi.md#listlivevideos) | **GET** /live_videos | List live videos
*DefaultApi* | [**listReportTypeGroups**](docs/DefaultApi.md#listreporttypegroups) | **GET** /report_type_groups | Retrieve all report type groups
*DefaultApi* | [**listReports**](docs/DefaultApi.md#listreports) | **GET** /checks/{check_id}/reports | All the reports belonging to a particular check can be listed from this endpoint.
*DefaultApi* | [**listWebhooks**](docs/DefaultApi.md#listwebhooks) | **GET** /webhooks | List webhooks
*DefaultApi* | [**restoreApplicant**](docs/DefaultApi.md#restoreapplicant) | **POST** /applicants/{applicant_id}/restore | Restore Applicant
*DefaultApi* | [**resumeCheck**](docs/DefaultApi.md#resumecheck) | **POST** /checks/{check_id}/resume | Resume a Check
*DefaultApi* | [**resumeReport**](docs/DefaultApi.md#resumereport) | **POST** /checks/{check_id}/reports/{report_id}/resume | This endpoint is for resuming individual paused reports.
*DefaultApi* | [**updateApplicant**](docs/DefaultApi.md#updateapplicant) | **PUT** /applicants/{applicant_id} | Update Applicant
*DefaultApi* | [**uploadDocument**](docs/DefaultApi.md#uploaddocument) | **POST** /applicants/{applicant_id}/documents | Upload a document
*DefaultApi* | [**uploadLivePhoto**](docs/DefaultApi.md#uploadlivephoto) | **POST** /live_photos | Upload live photo


<a name="documentation-for-models"></a>
## Documentation for Models

 - [org.openapitools.client.models.Address](docs/Address.md)
 - [org.openapitools.client.models.Applicant](docs/Applicant.md)
 - [org.openapitools.client.models.ApplicantsList](docs/ApplicantsList.md)
 - [org.openapitools.client.models.Check](docs/Check.md)
 - [org.openapitools.client.models.CheckCommon](docs/CheckCommon.md)
 - [org.openapitools.client.models.CheckWithReportIds](docs/CheckWithReportIds.md)
 - [org.openapitools.client.models.ChecksList](docs/ChecksList.md)
 - [org.openapitools.client.models.Document](docs/Document.md)
 - [org.openapitools.client.models.DocumentsList](docs/DocumentsList.md)
 - [org.openapitools.client.models.Error](docs/Error.md)
 - [org.openapitools.client.models.GenericAddress](docs/GenericAddress.md)
 - [org.openapitools.client.models.GenericAddressesList](docs/GenericAddressesList.md)
 - [org.openapitools.client.models.IdNumber](docs/IdNumber.md)
 - [org.openapitools.client.models.InlineObject](docs/InlineObject.md)
 - [org.openapitools.client.models.InlineObject1](docs/InlineObject1.md)
 - [org.openapitools.client.models.LivePhoto](docs/LivePhoto.md)
 - [org.openapitools.client.models.LivePhotosList](docs/LivePhotosList.md)
 - [org.openapitools.client.models.LiveVideo](docs/LiveVideo.md)
 - [org.openapitools.client.models.LiveVideosList](docs/LiveVideosList.md)
 - [org.openapitools.client.models.Report](docs/Report.md)
 - [org.openapitools.client.models.ReportDocument](docs/ReportDocument.md)
 - [org.openapitools.client.models.ReportOption](docs/ReportOption.md)
 - [org.openapitools.client.models.ReportType](docs/ReportType.md)
 - [org.openapitools.client.models.ReportTypeGroup](docs/ReportTypeGroup.md)
 - [org.openapitools.client.models.ReportTypeGroupsList](docs/ReportTypeGroupsList.md)
 - [org.openapitools.client.models.ReportsList](docs/ReportsList.md)
 - [org.openapitools.client.models.Webhook](docs/Webhook.md)
 - [org.openapitools.client.models.WebhooksList](docs/WebhooksList.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="Token"></a>
### Token

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header

