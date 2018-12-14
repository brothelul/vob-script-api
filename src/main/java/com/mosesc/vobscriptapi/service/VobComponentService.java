package com.mosesc.vobscriptapi.service;

import com.mosesc.vobscriptapi.bo.InputComponentBo;
import com.mosesc.vobscriptapi.bo.OutputVobComponentBo;
import com.mosesc.vobscriptapi.entity.VobComponent;

import java.util.List;

/**
 * @auther mosesc
 * @date 12/14/18.
 */
public interface VobComponentService {
    List<OutputVobComponentBo> listComponents();

    void saveComponent(InputComponentBo component);
}
