package com.osidocker.open.micro.rules

import com.osidocker.open.micro.IRuleService

/**
 * @公司名称: 深圳原型信息技术有限公司
 * @类功能说明 ：
 * @类修改者 ： caoyangjie
 * @类作者 ： caoyangjie
 * @创建日期 ： 16:52 2018/4/2
 * @修改说明 ：
 * @修改日期 ： 16:52 2018/4/2
 * @版本号 ： V1.0.0
 */
class RuleAService implements IRuleService<Integer,Integer> {

    @Override
    Integer run(Integer val) {
        return val * 100
    }
}