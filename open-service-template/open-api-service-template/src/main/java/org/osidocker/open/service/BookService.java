/*
 *=======================================================================================
 *
 *
 *
 *
 *
 *
 *
 *
 *======================================================================================
 */
package org.osidocker.open.service;

/**
 * @类功能说明：
 * @类创建者： 曹杨杰
 * @类创建日期： 创建于：21:48 2017/5/7
 * @类修改说明：
 * @公司说明： 深圳原形信息技术有限公司
 * @类修改者： 曹杨杰
 * @类修改时间： 修改于：21:48 2017/5/7
 * @创建版本： V1.0.0
 */
public interface BookService {
    public <T> T getBook(Long skuId, Integer cat1, Integer cat2);
}