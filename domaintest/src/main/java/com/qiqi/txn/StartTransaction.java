package com.qiqi.txn;

import org.jpos.transaction.Context;

/**
 * Created with IntelliJ IDEA.
 * User: shaddiqa
 * Date: 9/4/13
 * Time: 1:51 PM
 * To change this template use File | Settings | File Templates.
 */
public class StartTransaction extends BankTxnSupport {
    @Override
    protected int doPrepare(long id, Context ctx) throws Exception {


        String str = ctx.getString(REQUEST);


        System.out.println(str);

        return PREPARED | NO_JOIN;
    }


}
