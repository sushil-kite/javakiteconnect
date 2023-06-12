package com.zerodhatech.models;

import com.google.gson.annotations.SerializedName;

import java.util.Date;
import java.util.Map;

/**
*   A wrapper for order.
*/
public class Order {

    @SerializedName("exchange_order_id")
    public String exchangeOrderId;
    @SerializedName("disclosed_quantity")
    public String disclosedQuantity;
    @SerializedName("validity")
    public String validity;
    @SerializedName("tradingsymbol")
    public String tradingSymbol;
    @SerializedName("instrument_token")
    public String instrumentToken;
    @SerializedName("variety")
    public String orderVariety;
    @SerializedName("order_type")
    public String orderType;
    @SerializedName("trigger_price")
    public String triggerPrice;
    @SerializedName("status_message")
    public String statusMessage;
    @SerializedName("price")
    public String price;
    @SerializedName("status")
    public String status;
    @SerializedName("product")
    public String product;
    @SerializedName("placed_by")
    public String accountId;
    @SerializedName("exchange")
    public String exchange;
    @SerializedName("order_id")
    public String orderId;
    @SerializedName("pending_quantity")
    public String pendingQuantity;
    @SerializedName("order_timestamp")
    public Date orderTimestamp;
    @SerializedName("exchange_timestamp")
    public Date exchangeTimestamp;
    @SerializedName("exchange_update_timestamp")
    public Date exchangeUpdateTimestamp;
    @SerializedName("average_price")
    public String averagePrice;
    @SerializedName("transaction_type")
    public String transactionType;
    @SerializedName("filled_quantity")
    public String filledQuantity;
    @SerializedName("quantity")
    public String quantity;
    @SerializedName("parent_order_id")
    public String parentOrderId;
    @SerializedName("tag")
    public String tag;
    @SerializedName("guid")
    public String guid;
    @SerializedName("validity_ttl")
    public int validityTTL;
    @SerializedName("meta")
    public Map<String, Object> meta;
    @SerializedName("auction_number")
    public String auctionNumber;

    public String getExchangeOrderId() {
        return exchangeOrderId;
    }

    public void setExchangeOrderId(String exchangeOrderId) {
        this.exchangeOrderId = exchangeOrderId;
    }

    public String getDisclosedQuantity() {
        return disclosedQuantity;
    }

    public void setDisclosedQuantity(String disclosedQuantity) {
        this.disclosedQuantity = disclosedQuantity;
    }

    public String getValidity() {
        return validity;
    }

    public void setValidity(String validity) {
        this.validity = validity;
    }

    public String getTradingSymbol() {
        return tradingSymbol;
    }

    public void setTradingSymbol(String tradingSymbol) {
        this.tradingSymbol = tradingSymbol;
    }

    public String getInstrumentToken() {
        return instrumentToken;
    }

    public void setInstrumentToken(String instrumentToken) {
        this.instrumentToken = instrumentToken;
    }

    public String getOrderVariety() {
        return orderVariety;
    }

    public void setOrderVariety(String orderVariety) {
        this.orderVariety = orderVariety;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getTriggerPrice() {
        return triggerPrice;
    }

    public void setTriggerPrice(String triggerPrice) {
        this.triggerPrice = triggerPrice;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getPendingQuantity() {
        return pendingQuantity;
    }

    public void setPendingQuantity(String pendingQuantity) {
        this.pendingQuantity = pendingQuantity;
    }

    public Date getOrderTimestamp() {
        return orderTimestamp;
    }

    public void setOrderTimestamp(Date orderTimestamp) {
        this.orderTimestamp = orderTimestamp;
    }

    public Date getExchangeTimestamp() {
        return exchangeTimestamp;
    }

    public void setExchangeTimestamp(Date exchangeTimestamp) {
        this.exchangeTimestamp = exchangeTimestamp;
    }

    public Date getExchangeUpdateTimestamp() {
        return exchangeUpdateTimestamp;
    }

    public void setExchangeUpdateTimestamp(Date exchangeUpdateTimestamp) {
        this.exchangeUpdateTimestamp = exchangeUpdateTimestamp;
    }

    public String getAveragePrice() {
        return averagePrice;
    }

    public void setAveragePrice(String averagePrice) {
        this.averagePrice = averagePrice;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getFilledQuantity() {
        return filledQuantity;
    }

    public void setFilledQuantity(String filledQuantity) {
        this.filledQuantity = filledQuantity;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getParentOrderId() {
        return parentOrderId;
    }

    public void setParentOrderId(String parentOrderId) {
        this.parentOrderId = parentOrderId;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public int getValidityTTL() {
        return validityTTL;
    }

    public void setValidityTTL(int validityTTL) {
        this.validityTTL = validityTTL;
    }

    public Map<String, Object> getMeta() {
        return meta;
    }

    public void setMeta(Map<String, Object> meta) {
        this.meta = meta;
    }

    public String getAuctionNumber() {
        return auctionNumber;
    }

    public void setAuctionNumber(String auctionNumber) {
        this.auctionNumber = auctionNumber;
    }
}
