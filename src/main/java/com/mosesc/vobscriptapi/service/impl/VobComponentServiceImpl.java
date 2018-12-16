package com.mosesc.vobscriptapi.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mosesc.vobscriptapi.bo.InputComponentBo;
import com.mosesc.vobscriptapi.bo.OutputVobComponentBo;
import com.mosesc.vobscriptapi.entity.VobComponent;
import com.mosesc.vobscriptapi.exception.ValidateFailedException;
import com.mosesc.vobscriptapi.mapper.VobComponentMapper;
import com.mosesc.vobscriptapi.service.VobComponentService;
import com.mosesc.vobscriptapi.utils.ScriptsUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther mosesc
 * @date 12/14/18.
 */
@Service
public class VobComponentServiceImpl implements VobComponentService {

    @Autowired
    private VobComponentMapper vobComponentMapper;

    @Override
    public List<OutputVobComponentBo> listComponents() {
        List<VobComponent> components = vobComponentMapper.selectList(new QueryWrapper<>());
        List<OutputVobComponentBo> outputVobComponentBos = new ArrayList<>();
        if (components == null || components.size() == 0){
            return outputVobComponentBos;
        }
        components.forEach(component -> {
            OutputVobComponentBo outputVobComponentBo = new OutputVobComponentBo();
            BeanUtils.copyProperties(component, outputVobComponentBo);
            outputVobComponentBo.setParams(ScriptsUtil.initParams(component.getContent()));
            outputVobComponentBos.add(outputVobComponentBo);
        });
        return outputVobComponentBos;
    }

    @Override
    public void saveComponent(InputComponentBo component) {
        if (StringUtils.isEmpty(component.getName()) || StringUtils.isEmpty(component.getContent())){
            throw new ValidateFailedException("组件名和组件不能为空");
        }
        VobComponent vobComponent = new VobComponent();
        BeanUtils.copyProperties(component, vobComponent);
        vobComponentMapper.insert(vobComponent);
    }
}
