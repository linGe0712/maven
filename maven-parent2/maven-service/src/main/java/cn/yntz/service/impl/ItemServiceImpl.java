package cn.yntz.service.impl;

import cn.yntz.dao.ItemDao;
import cn.yntz.domain.Items;
import cn.yntz.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @description:
 * @author: Baiyu
 * @modified By:
 * @version: 1.0
 */
@Service
@Transactional
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemDao itemDao;
    @Override
    public Items findOne(Integer id) {
        return itemDao.findOne(id);
    }
}
