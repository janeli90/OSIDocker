package com.osidocker.open.micro.draw.system;

import com.osidocker.open.micro.vo.CoreException;

/**
 * @Description:
 * @author: caoyj
 * @date: 2019年03月11日 14:57
 * @Copyright: © 麓山云
 */
@FunctionalInterface
public interface IGenerateGunsException {

    CoreException catchException();

}