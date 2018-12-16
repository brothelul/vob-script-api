package com.mosesc.vobscriptapi.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mosesc.vobscriptapi.bo.OutputVobObjBo;
import com.mosesc.vobscriptapi.entity.VobObj;
import com.mosesc.vobscriptapi.entity.VobObjMethods;
import com.mosesc.vobscriptapi.mapper.VobObjMapper;
import com.mosesc.vobscriptapi.mapper.VobObjMethodsMapper;
import com.mosesc.vobscriptapi.service.VobObjService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VobObjServiceImpl implements VobObjService {
    @Autowired
    private VobObjMapper vobObjMapper;
    @Autowired
    private VobObjMethodsMapper vobObjMethodsMapper;

    @Override
    public List<OutputVobObjBo> listObjs() {
        List<VobObj> vobObjs = vobObjMapper.selectList(new QueryWrapper<>());
        List<OutputVobObjBo> vobObjBos =new ArrayList<>();
        if (vobObjs == null || vobObjs.size() == 0){
            return vobObjBos;
        }
        vobObjs.forEach(vobObj -> {
            OutputVobObjBo vobObjBo = new OutputVobObjBo();
            vobObjBo.setObj(vobObj.getName());
            List<VobObjMethods> vobObjMethods = vobObjMethodsMapper.selectList(new QueryWrapper<VobObjMethods>().eq("obj_id", vobObj.getId()));
            List<String> methods = new ArrayList<>();
            vobObjBo.setMethods(methods);
            if (vobObjMethods != null || vobObjMethods.size() > 0){
                vobObjMethods.forEach(vobObjMethod -> {
                    methods.add(vobObjMethod.getMethod());
                });
            }
             vobObjBos.add(vobObjBo);
        });
        return vobObjBos;
    }
}
