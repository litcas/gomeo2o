/*
 * Copyright (c) 2015 杭州端点网络科技有限公司
 */

package io.terminus.ecp.event.category;

import io.terminus.ecp.event.common.IdsEvent;

import java.util.List;

/**
 * @author Effet
 */
public interface FrontCategoryEvent extends IdsEvent {

    /**
     * 前台类目 IDs
     */
    @Override
    List<Long> ids();
}