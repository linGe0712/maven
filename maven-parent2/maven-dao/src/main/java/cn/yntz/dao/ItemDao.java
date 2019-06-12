package cn.yntz.dao;

import cn.yntz.domain.Items;

/**
 * @description:
 * @author: Baiyu
 * @modified By:
 * @version: 1.0
 */
public interface ItemDao {
    Items findOne(Integer id);
}
