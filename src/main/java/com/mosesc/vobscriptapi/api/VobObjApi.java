package com.mosesc.vobscriptapi.api;

import com.mosesc.vobscriptapi.bo.OutputVobObjBo;
import com.mosesc.vobscriptapi.service.VobObjService;
import com.mosesc.vobscriptapi.utils.JsonEntity;
import com.mosesc.vobscriptapi.utils.ResponseHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/public/api")
public class VobObjApi {
    @Autowired
    private VobObjService vobObjService;

    @GetMapping(value = "/vobObjs")
    public JsonEntity listVobObjs(){
        return ResponseHelper.createInstance(vobObjService.listObjs());
    }
}
