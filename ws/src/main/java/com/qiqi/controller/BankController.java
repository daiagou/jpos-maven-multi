package com.qiqi.controller;

import org.jpos.space.Space;
import org.jpos.space.SpaceFactory;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created with IntelliJ IDEA.
 * User: shaddiqa
 * Date: 9/4/13
 * Time: 10:43 AM
 * To change this template use File | Settings | File Templates.
 */
@Path("/bank")
public class BankController {

    private String DIRNAME = "deploy/";


    @GET
    @Path("/hello")
    @Produces(MediaType.APPLICATION_JSON)
    public Response hello(@Context HttpServletRequest request) {

        try {
            org.jpos.transaction.Context ctx = new org.jpos.transaction.Context();
            ctx.put("REQUEST", "hello");

            Space sp = SpaceFactory.getSpace();
            sp.out("TxnQueue1", ctx);
        } catch (Exception e) {
            e.printStackTrace();
        }


        return Response.status(Response.Status.OK).build();
    }

}
