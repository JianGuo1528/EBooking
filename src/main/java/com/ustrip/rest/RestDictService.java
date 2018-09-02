package com.ustrip.rest;

import com.ustrip.common.EBUtil;
import com.ustrip.common.RequestData;
import com.ustrip.common.UsiTripConstant;
import com.ustrip.delegate.TransactionDelegate;
import com.ustrip.entity.Dict;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.util.HashMap;
import java.util.Map;

@Service
@Path("")
public class RestDictService {
    @Autowired
    private TransactionDelegate transactionDelegate;

    @POST
    @Path("/hotel/addType")
    @Produces("application/json;charset=utf-8")
    public Response addType() {
        JSONObject jsonData = RequestData.getJSONData();
        Dict dict = EBUtil.jsonToBeanDateSerializer(jsonData.toString(), Dict.class, UsiTripConstant.DATE_PATTERN);
        Integer integer = transactionDelegate.transactionInsertType(dict);
        Map<String, Object> resultMap = new HashMap<String, Object>();
        resultMap.put("status", integer);
        return Response.status(Response.Status.OK).entity(resultMap).build();
    }
}
