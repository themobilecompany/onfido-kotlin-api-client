
# Report

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.String** | The unique identifier for the report. Read-only. |  [optional]
**createdAt** | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | The date and time at which the report was first initiated. Read-only. |  [optional]
**href** | **kotlin.String** | The API endpoint to retrieve the report. Read-only. |  [optional]
**status** | **kotlin.String** | The current state of the report in the checking process. Read-only. |  [optional]
**result** | **kotlin.String** | The result of the report. Read-only. |  [optional]
**subResult** | **kotlin.String** | The sub_result of the report. It gives a more detailed result for document reports only, and will be null otherwise. Read-only. |  [optional]
**breakdown** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) | The details of the report. This is specific to each type of report. Read-only. |  [optional]
**properties** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) | The properties associated with the report, if any. Read-only. |  [optional]
**name** | **kotlin.String** | The name of the report type. | 
**variant** | **kotlin.String** | The name of the report type variant, if required. |  [optional]
**options** | [**kotlin.Array&lt;ReportOption&gt;**](ReportOption.md) | List of Report Option objects. |  [optional]
**documents** | [**kotlin.Array&lt;ReportDocument&gt;**](ReportDocument.md) | Array of objects with document ids that were used in the Onfido engine. [ONLY USED IN A DOCUMENT CHECK] |  [optional]



