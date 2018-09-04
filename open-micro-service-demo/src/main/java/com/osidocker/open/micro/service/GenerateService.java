/**
 * ==================================================================================
 * <p>
 * <p>
 * <p>
 * ==================================================================================
 */
package com.osidocker.open.micro.service;

import com.osidocker.open.micro.service.exceptions.PythonDataException;

/**
 * @公司名称: 深圳原型信息技术有限公司
 * @类功能说明：
 * @类修改者： caoyangjie
 * @类作者： caoyangjie
 * @创建日期： 15:00 2018/8/31
 * @修改说明：
 * @修改日期： 15:00 2018/8/31
 * @版本号： V1.0.0
 */
public interface GenerateService<Request,Response> {

    Response execute(Request request) throws PythonDataException;
}
