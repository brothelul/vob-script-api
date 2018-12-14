package com.mosesc.vobscriptapi.api;

import com.mosesc.vobscriptapi.bo.InputComponentBo;
import com.mosesc.vobscriptapi.service.VobComponentService;
import com.mosesc.vobscriptapi.utils.JsonEntity;
import com.mosesc.vobscriptapi.utils.ResponseHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @auther mosesc
 * @date 12/14/18.
 */
@RestController
@RequestMapping(value = "/public/api")
public class VobComponentApi {
    @Autowired
    private VobComponentService vobComponentService;

    @GetMapping(value = "/components")
    public JsonEntity listComponent(){
        return ResponseHelper.createInstance(vobComponentService.listComponents());
    }

    @PostMapping(value = "/component")
    public JsonEntity saveComponent(@RequestBody InputComponentBo component){
        vobComponentService.saveComponent(component);
        return ResponseHelper.createMessageInstance("创建成功");
    }
}
