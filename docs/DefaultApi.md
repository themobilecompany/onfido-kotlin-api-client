# DefaultApi

All URIs are relative to *https://api.onfido.com/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelReport**](DefaultApi.md#cancelReport) | **POST** /checks/{check_id}/reports/{report_id}/cancel | This endpoint is for cancelling individual paused reports.
[**createApplicant**](DefaultApi.md#createApplicant) | **POST** /applicants | Create Applicant
[**createCheck**](DefaultApi.md#createCheck) | **POST** /applicants/{applicant_id}/checks | Create a check
[**createWebhook**](DefaultApi.md#createWebhook) | **POST** /webhooks | Create a webhook
[**destroyApplicant**](DefaultApi.md#destroyApplicant) | **DELETE** /applicants/{applicant_id} | Delete Applicant
[**downloadDocument**](DefaultApi.md#downloadDocument) | **GET** /applicants/{applicant_id}/documents/{document_id}/download | Download a documents raw data
[**downloadLivePhoto**](DefaultApi.md#downloadLivePhoto) | **GET** /live_photos/{live_photo_id}/download | Download live photo
[**downloadLiveVideo**](DefaultApi.md#downloadLiveVideo) | **GET** /live_videos/{live_video_id}/download | Download live video
[**findAddresses**](DefaultApi.md#findAddresses) | **GET** /addresses/pick | Search for addresses by postcode
[**findApplicant**](DefaultApi.md#findApplicant) | **GET** /applicants/{applicant_id} | Retrieve Applicant
[**findCheck**](DefaultApi.md#findCheck) | **GET** /applicants/{applicant_id}/checks/{check_id} | Retrieve a Check
[**findDocument**](DefaultApi.md#findDocument) | **GET** /applicants/{applicant_id}/documents/{document_id} | A single document can be retrieved by calling this endpoint with the document’s unique identifier.
[**findLivePhoto**](DefaultApi.md#findLivePhoto) | **GET** /live_photos/{live_photo_id} | Retrieve live photo
[**findLiveVideo**](DefaultApi.md#findLiveVideo) | **GET** /live_videos/{live_video_id} | Retrieve live video
[**findReport**](DefaultApi.md#findReport) | **GET** /checks/{check_id}/reports/{report_id} | A single report can be retrieved using this endpoint with the corresponding unique identifier.
[**findReportTypeGroup**](DefaultApi.md#findReportTypeGroup) | **GET** /report_type_groups/{report_type_group_id} | Retrieve single report type group object
[**findWebhook**](DefaultApi.md#findWebhook) | **GET** /webhooks/{webhook_id} | Retrieve a Webhook
[**listApplicants**](DefaultApi.md#listApplicants) | **GET** /applicants | List Applicants
[**listChecks**](DefaultApi.md#listChecks) | **GET** /applicants/{applicant_id}/checks | Retrieve Checks
[**listDocuments**](DefaultApi.md#listDocuments) | **GET** /applicants/{applicant_id}/documents | List documents
[**listLivePhotos**](DefaultApi.md#listLivePhotos) | **GET** /live_photos | List live photos
[**listLiveVideos**](DefaultApi.md#listLiveVideos) | **GET** /live_videos | List live videos
[**listReportTypeGroups**](DefaultApi.md#listReportTypeGroups) | **GET** /report_type_groups | Retrieve all report type groups
[**listReports**](DefaultApi.md#listReports) | **GET** /checks/{check_id}/reports | All the reports belonging to a particular check can be listed from this endpoint.
[**listWebhooks**](DefaultApi.md#listWebhooks) | **GET** /webhooks | List webhooks
[**restoreApplicant**](DefaultApi.md#restoreApplicant) | **POST** /applicants/{applicant_id}/restore | Restore Applicant
[**resumeCheck**](DefaultApi.md#resumeCheck) | **POST** /checks/{check_id}/resume | Resume a Check
[**resumeReport**](DefaultApi.md#resumeReport) | **POST** /checks/{check_id}/reports/{report_id}/resume | This endpoint is for resuming individual paused reports.
[**updateApplicant**](DefaultApi.md#updateApplicant) | **PUT** /applicants/{applicant_id} | Update Applicant
[**uploadDocument**](DefaultApi.md#uploadDocument) | **POST** /applicants/{applicant_id}/documents | Upload a document
[**uploadLivePhoto**](DefaultApi.md#uploadLivePhoto) | **POST** /live_photos | Upload live photo


<a name="cancelReport"></a>
# **cancelReport**
> cancelReport(checkId, reportId)

This endpoint is for cancelling individual paused reports.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val checkId : kotlin.String = checkId_example // kotlin.String | 
val reportId : kotlin.String = reportId_example // kotlin.String | 
try {
    apiInstance.cancelReport(checkId, reportId)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#cancelReport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#cancelReport")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **checkId** | **kotlin.String**|  | [default to null]
 **reportId** | **kotlin.String**|  | [default to null]

### Return type

null (empty response body)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createApplicant"></a>
# **createApplicant**
> Applicant createApplicant(applicant)

Create Applicant

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val applicant : Applicant =  // Applicant | 
try {
    val result : Applicant = apiInstance.createApplicant(applicant)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#createApplicant")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#createApplicant")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicant** | [**Applicant**](Applicant.md)|  |

### Return type

[**Applicant**](Applicant.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createCheck"></a>
# **createCheck**
> Check createCheck(applicantId, check)

Create a check

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val applicantId : kotlin.String = applicantId_example // kotlin.String | 
val check : Check =  // Check | 
try {
    val result : Check = apiInstance.createCheck(applicantId, check)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#createCheck")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#createCheck")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicantId** | **kotlin.String**|  | [default to null]
 **check** | [**Check**](Check.md)|  |

### Return type

[**Check**](Check.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createWebhook"></a>
# **createWebhook**
> Webhook createWebhook(webhook)

Create a webhook

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhook : Webhook =  // Webhook | 
try {
    val result : Webhook = apiInstance.createWebhook(webhook)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#createWebhook")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#createWebhook")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhook** | [**Webhook**](Webhook.md)|  |

### Return type

[**Webhook**](Webhook.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="destroyApplicant"></a>
# **destroyApplicant**
> destroyApplicant(applicantId)

Delete Applicant

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val applicantId : kotlin.String = applicantId_example // kotlin.String | 
try {
    apiInstance.destroyApplicant(applicantId)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#destroyApplicant")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#destroyApplicant")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicantId** | **kotlin.String**|  | [default to null]

### Return type

null (empty response body)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="downloadDocument"></a>
# **downloadDocument**
> java.io.File downloadDocument(applicantId, documentId)

Download a documents raw data

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val applicantId : kotlin.String = applicantId_example // kotlin.String | 
val documentId : kotlin.String = documentId_example // kotlin.String | 
try {
    val result : java.io.File = apiInstance.downloadDocument(applicantId, documentId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#downloadDocument")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#downloadDocument")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicantId** | **kotlin.String**|  | [default to null]
 **documentId** | **kotlin.String**|  | [default to null]

### Return type

[**java.io.File**](java.io.File.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*, application/json

<a name="downloadLivePhoto"></a>
# **downloadLivePhoto**
> java.io.File downloadLivePhoto(livePhotoId)

Download live photo

Live photos are downloaded using this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val livePhotoId : kotlin.String = livePhotoId_example // kotlin.String | The live photo’s unique identifier.
try {
    val result : java.io.File = apiInstance.downloadLivePhoto(livePhotoId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#downloadLivePhoto")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#downloadLivePhoto")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **livePhotoId** | **kotlin.String**| The live photo’s unique identifier. | [default to null]

### Return type

[**java.io.File**](java.io.File.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*, application/json

<a name="downloadLiveVideo"></a>
# **downloadLiveVideo**
> java.io.File downloadLiveVideo(liveVideoId)

Download live video

Live videos are downloaded using this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val liveVideoId : kotlin.String = liveVideoId_example // kotlin.String | The live video’s unique identifier.
try {
    val result : java.io.File = apiInstance.downloadLiveVideo(liveVideoId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#downloadLiveVideo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#downloadLiveVideo")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **liveVideoId** | **kotlin.String**| The live video’s unique identifier. | [default to null]

### Return type

[**java.io.File**](java.io.File.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*, application/json

<a name="findAddresses"></a>
# **findAddresses**
> GenericAddressesList findAddresses(postcode)

Search for addresses by postcode

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val postcode : kotlin.String = postcode_example // kotlin.String | 
try {
    val result : GenericAddressesList = apiInstance.findAddresses(postcode)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#findAddresses")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#findAddresses")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **postcode** | **kotlin.String**|  | [default to null]

### Return type

[**GenericAddressesList**](GenericAddressesList.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findApplicant"></a>
# **findApplicant**
> Applicant findApplicant(applicantId)

Retrieve Applicant

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val applicantId : kotlin.String = applicantId_example // kotlin.String | 
try {
    val result : Applicant = apiInstance.findApplicant(applicantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#findApplicant")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#findApplicant")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicantId** | **kotlin.String**|  | [default to null]

### Return type

[**Applicant**](Applicant.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findCheck"></a>
# **findCheck**
> CheckWithReportIds findCheck(applicantId, checkId)

Retrieve a Check

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val applicantId : kotlin.String = applicantId_example // kotlin.String | 
val checkId : kotlin.String = checkId_example // kotlin.String | 
try {
    val result : CheckWithReportIds = apiInstance.findCheck(applicantId, checkId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#findCheck")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#findCheck")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicantId** | **kotlin.String**|  | [default to null]
 **checkId** | **kotlin.String**|  | [default to null]

### Return type

[**CheckWithReportIds**](CheckWithReportIds.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findDocument"></a>
# **findDocument**
> Document findDocument(applicantId, documentId)

A single document can be retrieved by calling this endpoint with the document’s unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val applicantId : kotlin.String = applicantId_example // kotlin.String | 
val documentId : kotlin.String = documentId_example // kotlin.String | 
try {
    val result : Document = apiInstance.findDocument(applicantId, documentId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#findDocument")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#findDocument")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicantId** | **kotlin.String**|  | [default to null]
 **documentId** | **kotlin.String**|  | [default to null]

### Return type

[**Document**](Document.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findLivePhoto"></a>
# **findLivePhoto**
> LivePhoto findLivePhoto(livePhotoId)

Retrieve live photo

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val livePhotoId : kotlin.String = livePhotoId_example // kotlin.String | The live photo’s unique identifier.
try {
    val result : LivePhoto = apiInstance.findLivePhoto(livePhotoId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#findLivePhoto")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#findLivePhoto")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **livePhotoId** | **kotlin.String**| The live photo’s unique identifier. | [default to null]

### Return type

[**LivePhoto**](LivePhoto.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findLiveVideo"></a>
# **findLiveVideo**
> LiveVideo findLiveVideo(liveVideoId)

Retrieve live video

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val liveVideoId : kotlin.String = liveVideoId_example // kotlin.String | The live video’s unique identifier.
try {
    val result : LiveVideo = apiInstance.findLiveVideo(liveVideoId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#findLiveVideo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#findLiveVideo")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **liveVideoId** | **kotlin.String**| The live video’s unique identifier. | [default to null]

### Return type

[**LiveVideo**](LiveVideo.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findReport"></a>
# **findReport**
> Report findReport(checkId, reportId)

A single report can be retrieved using this endpoint with the corresponding unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val checkId : kotlin.String = checkId_example // kotlin.String | 
val reportId : kotlin.String = reportId_example // kotlin.String | 
try {
    val result : Report = apiInstance.findReport(checkId, reportId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#findReport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#findReport")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **checkId** | **kotlin.String**|  | [default to null]
 **reportId** | **kotlin.String**|  | [default to null]

### Return type

[**Report**](Report.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findReportTypeGroup"></a>
# **findReportTypeGroup**
> ReportTypeGroup findReportTypeGroup(reportTypeGroupId)

Retrieve single report type group object

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val reportTypeGroupId : kotlin.String = reportTypeGroupId_example // kotlin.String | 
try {
    val result : ReportTypeGroup = apiInstance.findReportTypeGroup(reportTypeGroupId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#findReportTypeGroup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#findReportTypeGroup")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportTypeGroupId** | **kotlin.String**|  | [default to null]

### Return type

[**ReportTypeGroup**](ReportTypeGroup.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findWebhook"></a>
# **findWebhook**
> Webhook findWebhook(webhookId)

Retrieve a Webhook

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val webhookId : kotlin.String = webhookId_example // kotlin.String | 
try {
    val result : Webhook = apiInstance.findWebhook(webhookId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#findWebhook")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#findWebhook")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookId** | **kotlin.String**|  | [default to null]

### Return type

[**Webhook**](Webhook.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listApplicants"></a>
# **listApplicants**
> ApplicantsList listApplicants(page, perPage, includeDeleted)

List Applicants

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val page : kotlin.Int = 56 // kotlin.Int | The page to return. The first page is `page=1`
val perPage : kotlin.Int = 56 // kotlin.Int | The number of objects per page.
val includeDeleted : kotlin.Boolean = true // kotlin.Boolean | Whether to also include applicants scheduled for deletion.
try {
    val result : ApplicantsList = apiInstance.listApplicants(page, perPage, includeDeleted)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#listApplicants")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#listApplicants")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **kotlin.Int**| The page to return. The first page is &#x60;page&#x3D;1&#x60; | [optional] [default to 1]
 **perPage** | **kotlin.Int**| The number of objects per page. | [optional] [default to 20]
 **includeDeleted** | **kotlin.Boolean**| Whether to also include applicants scheduled for deletion. | [optional] [default to false]

### Return type

[**ApplicantsList**](ApplicantsList.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listChecks"></a>
# **listChecks**
> ChecksList listChecks(applicantId, page, perPage)

Retrieve Checks

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val applicantId : kotlin.String = applicantId_example // kotlin.String | 
val page : kotlin.Int = 56 // kotlin.Int | The page to return. The first page is `page=1`.
val perPage : kotlin.Int = 56 // kotlin.Int | The number of objects per page.
try {
    val result : ChecksList = apiInstance.listChecks(applicantId, page, perPage)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#listChecks")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#listChecks")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicantId** | **kotlin.String**|  | [default to null]
 **page** | **kotlin.Int**| The page to return. The first page is &#x60;page&#x3D;1&#x60;. | [optional] [default to 1]
 **perPage** | **kotlin.Int**| The number of objects per page. | [optional] [default to 20]

### Return type

[**ChecksList**](ChecksList.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listDocuments"></a>
# **listDocuments**
> DocumentsList listDocuments(applicantId)

List documents

All documents belonging to an applicant can be listed from this endpoint

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val applicantId : kotlin.String = applicantId_example // kotlin.String | 
try {
    val result : DocumentsList = apiInstance.listDocuments(applicantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#listDocuments")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#listDocuments")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicantId** | **kotlin.String**|  | [default to null]

### Return type

[**DocumentsList**](DocumentsList.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listLivePhotos"></a>
# **listLivePhotos**
> LivePhotosList listLivePhotos(applicantId)

List live photos

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val applicantId : kotlin.String = applicantId_example // kotlin.String | The id of the applicant the live photos belong to.
try {
    val result : LivePhotosList = apiInstance.listLivePhotos(applicantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#listLivePhotos")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#listLivePhotos")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicantId** | **kotlin.String**| The id of the applicant the live photos belong to. | [default to null]

### Return type

[**LivePhotosList**](LivePhotosList.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listLiveVideos"></a>
# **listLiveVideos**
> LiveVideosList listLiveVideos(applicantId)

List live videos

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val applicantId : kotlin.String = applicantId_example // kotlin.String | The id of the applicant the live videos belong to.
try {
    val result : LiveVideosList = apiInstance.listLiveVideos(applicantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#listLiveVideos")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#listLiveVideos")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicantId** | **kotlin.String**| The id of the applicant the live videos belong to. | [default to null]

### Return type

[**LiveVideosList**](LiveVideosList.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listReportTypeGroups"></a>
# **listReportTypeGroups**
> ReportTypeGroupsList listReportTypeGroups()

Retrieve all report type groups

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
try {
    val result : ReportTypeGroupsList = apiInstance.listReportTypeGroups()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#listReportTypeGroups")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#listReportTypeGroups")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ReportTypeGroupsList**](ReportTypeGroupsList.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listReports"></a>
# **listReports**
> ReportsList listReports(checkId)

All the reports belonging to a particular check can be listed from this endpoint.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val checkId : kotlin.String = checkId_example // kotlin.String | 
try {
    val result : ReportsList = apiInstance.listReports(checkId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#listReports")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#listReports")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **checkId** | **kotlin.String**|  | [default to null]

### Return type

[**ReportsList**](ReportsList.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listWebhooks"></a>
# **listWebhooks**
> WebhooksList listWebhooks()

List webhooks

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
try {
    val result : WebhooksList = apiInstance.listWebhooks()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#listWebhooks")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#listWebhooks")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**WebhooksList**](WebhooksList.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="restoreApplicant"></a>
# **restoreApplicant**
> restoreApplicant(applicantId)

Restore Applicant

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val applicantId : kotlin.String = applicantId_example // kotlin.String | 
try {
    apiInstance.restoreApplicant(applicantId)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#restoreApplicant")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#restoreApplicant")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicantId** | **kotlin.String**|  | [default to null]

### Return type

null (empty response body)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="resumeCheck"></a>
# **resumeCheck**
> resumeCheck(checkId)

Resume a Check

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val checkId : kotlin.String = checkId_example // kotlin.String | 
try {
    apiInstance.resumeCheck(checkId)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#resumeCheck")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#resumeCheck")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **checkId** | **kotlin.String**|  | [default to null]

### Return type

null (empty response body)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="resumeReport"></a>
# **resumeReport**
> resumeReport(checkId, reportId)

This endpoint is for resuming individual paused reports.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val checkId : kotlin.String = checkId_example // kotlin.String | 
val reportId : kotlin.String = reportId_example // kotlin.String | 
try {
    apiInstance.resumeReport(checkId, reportId)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#resumeReport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#resumeReport")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **checkId** | **kotlin.String**|  | [default to null]
 **reportId** | **kotlin.String**|  | [default to null]

### Return type

null (empty response body)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateApplicant"></a>
# **updateApplicant**
> Applicant updateApplicant(applicantId, applicant)

Update Applicant

Allows updating of an applicant’s information before any checks are created. - Partial updates - Addresses and ID numbers present will replace existing ones - Same applicant validations to create applicant 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val applicantId : kotlin.String = applicantId_example // kotlin.String | 
val applicant : Applicant =  // Applicant | 
try {
    val result : Applicant = apiInstance.updateApplicant(applicantId, applicant)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#updateApplicant")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#updateApplicant")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicantId** | **kotlin.String**|  | [default to null]
 **applicant** | [**Applicant**](Applicant.md)|  |

### Return type

[**Applicant**](Applicant.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="uploadDocument"></a>
# **uploadDocument**
> Document uploadDocument(applicantId, type, file, side)

Upload a document

Documents are uploaded using this endpoint. Along with the file upload the relevant document type must be specified. Documents must be uploaded as a multipart form. The valid file types are: jpg, png and pdf. The file size must be between 2KB and 3MB. 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val applicantId : kotlin.String = applicantId_example // kotlin.String | 
val type : kotlin.String = type_example // kotlin.String | The type of document.
val file : java.io.File = BINARY_DATA_HERE // java.io.File | The file to be uploaded.
val side : kotlin.String = side_example // kotlin.String | Either the `front` or `back` of the document.
try {
    val result : Document = apiInstance.uploadDocument(applicantId, type, file, side)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#uploadDocument")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#uploadDocument")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicantId** | **kotlin.String**|  | [default to null]
 **type** | **kotlin.String**| The type of document. | [default to null]
 **file** | **java.io.File**| The file to be uploaded. | [default to null]
 **side** | **kotlin.String**| Either the &#x60;front&#x60; or &#x60;back&#x60; of the document. | [optional] [default to null]

### Return type

[**Document**](Document.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="uploadLivePhoto"></a>
# **uploadLivePhoto**
> LivePhoto uploadLivePhoto(applicantId, file, advancedValidation)

Upload live photo

You can upload live photos to this endpoint. Like document upload, files must be uploaded as a multipart form. Valid file types are jpg, png and pdf. The file size must be between 32KB and 10MB. Live photos are validated at the point of upload to check that they contain exactly one face. This validation can be disabled by setting the advanced_validation argument to false. 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val applicantId : kotlin.String = applicantId_example // kotlin.String | 
val file : java.io.File = BINARY_DATA_HERE // java.io.File | The file to be uploaded.
val advancedValidation : kotlin.Boolean = true // kotlin.Boolean | Validates that the live photo contains exactly one face.
try {
    val result : LivePhoto = apiInstance.uploadLivePhoto(applicantId, file, advancedValidation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#uploadLivePhoto")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#uploadLivePhoto")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicantId** | **kotlin.String**|  | [default to null]
 **file** | **java.io.File**| The file to be uploaded. | [default to null]
 **advancedValidation** | **kotlin.Boolean**| Validates that the live photo contains exactly one face. | [optional] [default to true]

### Return type

[**LivePhoto**](LivePhoto.md)

### Authorization

[Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

