/**
 * Copyright (c) 2015, www.cubbery.com. All rights reserved.
 */
package com.cubbery.limit;

/**
 * <b>项目名</b>： rule-parent <br>
 * <b>包名称</b>： com.cubbery.limit <br>
 * <b>类名称</b>： CustomerRecordsImpl <br>
 * <b>类描述</b>： <br>
 * <b>创建人</b>： <a href="mailto:cubber@cubbery.com">cubber[百墨]</a> <br>
 * <b>修改人</b>： <br>
 * <b>创建时间</b>： 2015/12/21 <br>
 * <b>修改时间</b>： <br>
 * <b>修改备注</b>： <br>
 *
 * @version 1.0.0 <br>
 */
public class CustomerRecordsImpl implements CustomerRecords {
    private int day;
    private int mon;

    public CustomerRecordsImpl(int day, int mon) {
        this.day = day;
        this.mon = mon;
    }

    @Override
    public int queryMoth(String month, String bankCardNumber) {
        return mon;
    }

    @Override
    public int queryDay(String day, String bankCardNumber) {
        return this.day;
    }
}
