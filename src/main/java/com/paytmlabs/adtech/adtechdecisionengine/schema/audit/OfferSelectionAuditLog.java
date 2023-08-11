/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.paytmlabs.adtech.adtechdecisionengine.schema.audit;

/** * Ad Tech Decision Engine audit log event Avro schema */
@org.apache.avro.specific.AvroGenerated
public interface OfferSelectionAuditLog {
  public static final org.apache.avro.Protocol PROTOCOL = org.apache.avro.Protocol.parse("{\"protocol\":\"OfferSelectionAuditLog\",\"namespace\":\"com.paytmlabs.adtech.adtechdecisionengine.schema.audit\",\"doc\":\"* Ad Tech Decision Engine audit log event Avro schema\",\"types\":[{\"type\":\"record\",\"name\":\"AuditLogEvent\",\"fields\":[{\"name\":\"request\",\"type\":{\"type\":\"record\",\"name\":\"Request\",\"fields\":[{\"name\":\"request_id\",\"type\":[\"string\",\"null\"]},{\"name\":\"transaction_id\",\"type\":\"string\"},{\"name\":\"transaction_source\",\"type\":\"string\"},{\"name\":\"user_id\",\"type\":\"string\"}]}},{\"name\":\"response\",\"type\":{\"type\":\"record\",\"name\":\"Response\",\"fields\":[{\"name\":\"selection_algorithm\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"SelectionAlgorithm\",\"symbols\":[\"INTERNAL\",\"INTERNAL_AOV\"]}],\"default\":null},{\"name\":\"offers\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"OfferResult\",\"fields\":[{\"name\":\"gratification_id\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"deal_product_id\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"app_name\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"ro_id\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"campaign_id\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"ad_set_id\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"campaign_category\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"campaign_objective\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"CampaignObjective\",\"symbols\":[\"OPEN_OFFER\",\"CLOSED_OFFER\",\"NONE\"]}],\"default\":null},{\"name\":\"campaign_priority\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"targeting_type\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"TargetingType\",\"symbols\":[\"SEGMENTED\",\"SEGMENTED_ROADBLOCK\",\"ROADBLOCK\"]}],\"default\":null},{\"name\":\"offer_content_type\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"OfferContentType\",\"symbols\":[\"MERCHANT_OFFER\"]}],\"default\":null},{\"name\":\"selection_type\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"SelectionType\",\"symbols\":[\"INTERNAL\",\"EXTERNAL\",\"INTERNAL_FALLBACK\"]}],\"default\":null},{\"name\":\"asset_sel_strategy\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"AssetSelectionStrategy\",\"symbols\":[\"SINGLE\",\"RANDOM\",\"PERFORMANCE_BASED\",\"EXTERNAL\",\"AOV\"]}],\"default\":null},{\"name\":\"ranking_details\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"RankingDetails\",\"fields\":[{\"name\":\"algo\",\"type\":{\"type\":\"enum\",\"name\":\"RankingAlgorithm\",\"symbols\":[\"RANDOM\",\"TEMP_TARGETED\",\"CAMPAIGN_ID\",\"CAMPAIGN_SCORES\",\"EXTERNAL\",\"COST_PER_DELIVERY\",\"AOV_VALUE\",\"NONE\"]}},{\"name\":\"score\",\"type\":[\"null\",\"float\"],\"default\":null},{\"name\":\"source_id\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"campaign_category\",\"type\":[\"null\",\"string\"],\"default\":null}]}],\"default\":null},{\"name\":\"advertiser_details\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"AdvertiserDetails\",\"fields\":[{\"name\":\"advertiser_id\",\"type\":\"long\"},{\"name\":\"advertiser_name\",\"type\":\"string\"}]}],\"default\":null},{\"name\":\"reservation_type\",\"type\":[\"null\",\"string\"],\"default\":null}]}}},{\"name\":\"split_tag\",\"type\":[\"null\",\"string\"],\"default\":null}]}},{\"name\":\"context\",\"type\":{\"type\":\"record\",\"name\":\"Context\",\"fields\":[{\"name\":\"available_deal_product_ids\",\"type\":[{\"type\":\"array\",\"items\":\"string\"},\"null\"]},{\"name\":\"audience_action\",\"type\":{\"type\":\"enum\",\"name\":\"FetchAction\",\"symbols\":[\"FETCHED\",\"NOT_FETCHED\",\"ERROR\"]}},{\"name\":\"quota_action\",\"type\":\"FetchAction\"},{\"name\":\"fetch_aov_action\",\"type\":[\"null\",\"FetchAction\"],\"default\":null},{\"name\":\"external_selection_action\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"ExternalSelectionAction\",\"symbols\":[\"NOT_PERFORMED\",\"COMPLETED\",\"NOT_COMPLETED\",\"ERROR\"]}],\"default\":null},{\"name\":\"associated_deal_product_ids\",\"type\":[{\"type\":\"array\",\"items\":\"string\"},\"null\"]},{\"name\":\"exceeded_quotas_details\",\"type\":[{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"ExceededQuotasDetails\",\"fields\":[{\"name\":\"ad_set_id\",\"type\":\"string\"},{\"name\":\"deal_product_id\",\"type\":\"string\"}]}},\"null\"]},{\"name\":\"aov_selection_percent\",\"type\":[\"null\",\"float\"],\"default\":null},{\"name\":\"campaign_priority_config\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"CampaignPriorityConfig\",\"symbols\":[\"EXTERNAL_HIGHEST_WINS\",\"MIXED_HIGHEST_WINS\"]}],\"default\":null},{\"name\":\"aov_details\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"AovDetail\",\"fields\":[{\"name\":\"campaign_id\",\"type\":\"long\"},{\"name\":\"campaign_priority\",\"type\":\"int\"},{\"name\":\"deal_product_id\",\"type\":\"string\"},{\"name\":\"ad_set_id\",\"type\":\"long\"},{\"name\":\"advertiser_type\",\"type\":{\"type\":\"enum\",\"name\":\"AdvertiserType\",\"symbols\":[\"INTERNAL\",\"EXTERNAL\"]}},{\"name\":\"yield_value\",\"type\":\"float\"},{\"name\":\"objective_worth\",\"type\":\"float\"},{\"name\":\"probability_of_objective\",\"type\":\"float\"},{\"name\":\"worth_value\",\"type\":\"float\"},{\"name\":\"worth_funnel_occurrence\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"yield_worth_factor\",\"type\":\"float\"},{\"name\":\"yield_funnel_occurrence\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"yield_prediction_metric\",\"type\":[\"null\",\"float\"],\"default\":null},{\"name\":\"aggregated_opportunity_value\",\"type\":\"float\"},{\"name\":\"acceleration_factor\",\"type\":\"float\"},{\"name\":\"pacing_factor\",\"type\":\"float\"},{\"name\":\"budget_spent\",\"type\":[\"null\",\"float\"],\"default\":null},{\"name\":\"percentage_budget_spent\",\"type\":[\"null\",\"float\"],\"default\":null},{\"name\":\"final_aggregated_opportunity_value\",\"type\":\"float\"},{\"name\":\"metric_used_for_yield_calculation\",\"type\":\"string\"},{\"name\":\"metric_used_for_worth_calculation\",\"type\":\"string\"},{\"name\":\"funnel_used_for_yield_calculation\",\"type\":\"string\"},{\"name\":\"funnel_used_for_worth_calculation\",\"type\":\"string\"},{\"name\":\"data_calculated_at\",\"type\":\"long\"},{\"name\":\"data_considered_upto\",\"type\":\"long\"}]}}],\"default\":null}]}},{\"name\":\"message\",\"type\":[\"string\",\"null\"]},{\"name\":\"producer_ts\",\"type\":\"long\"},{\"name\":\"reservation_context\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"ReservationContext\",\"fields\":[{\"name\":\"gratification\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"GratificationDetails\",\"fields\":[{\"name\":\"ads_funded\",\"type\":\"boolean\"},{\"name\":\"scratch_card\",\"type\":\"boolean\"},{\"name\":\"redemption_type\",\"type\":\"string\"},{\"name\":\"amount\",\"type\":\"double\"}]}}},{\"name\":\"segmentation_context\",\"type\":{\"type\":\"map\",\"values\":\"boolean\"}}]}]}]}],\"messages\":{}}");

  /** * Ad Tech Decision Engine audit log event Avro schema */
  @org.apache.avro.specific.AvroGenerated
  public interface Callback extends OfferSelectionAuditLog {
    public static final org.apache.avro.Protocol PROTOCOL = com.paytmlabs.adtech.adtechdecisionengine.schema.audit.OfferSelectionAuditLog.PROTOCOL;
  }
}