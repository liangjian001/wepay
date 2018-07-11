package com.wepay.business.outpatient;

import com.wepay.modle.entities.outpatient.HSfdEntity;
import com.wepay.modle.entities.outpatient.HSfdExample;
import com.wepay.modle.share.ResultInfo;

public interface OutpatientOrderService {
	ResultInfo getOutpatientOrderList(HSfdExample example);
	int getOutpatientOrderCount(HSfdExample example);
	ResultInfo updateOutpatientOrderInfo(HSfdEntity record, HSfdExample example);
}
