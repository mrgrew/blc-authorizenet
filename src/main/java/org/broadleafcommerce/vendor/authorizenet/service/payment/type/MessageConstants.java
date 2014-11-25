/*
 * #%L
 * BroadleafCommerce Authorize.net
 * %%
 * Copyright (C) 2009 - 2014 Broadleaf Commerce
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package org.broadleafcommerce.vendor.authorizenet.service.payment.type;

import net.authorize.AuthNetField;

/**
 * @author Chad Harchar (charchar)
 */
public class MessageConstants {

    public static final String BLC_CID = "blc_cid";
    public static final String BLC_OID = "blc_oid";
    public static final String BLC_TPS = "blc_tps";
    public static final String BLC_SAVE_CARD = "blc_save_card";
    public static final String AUTHORIZENET_SERVER_URL = "authorizenet_server_url";
    public static final String REQ_AMOUNT = "req_amount";
    public static final String TRANSACTION_TIME = "transaction_time";
    
    /**
     * Used to save and pay with saved customer data
     */
    public static final String CUSTOMER_PROFILE_ID = AuthNetField.ELEMENT_CUSTOMER_PROFILE_ID.getFieldName();
    
    /**
     * Used to save and pay with customer data
     */
    public static final String PAYMENT_PROFILE_ID = AuthNetField.ELEMENT_CUSTOMER_PAYMENT_PROFILE_ID.getFieldName();
    
    /**
     * The transaction ID for the payment
     */
    public static final String TRANSACTION_ID = AuthNetField.X_TRANS_ID.getFieldName();
    
}
