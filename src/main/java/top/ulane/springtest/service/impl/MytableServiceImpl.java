package top.ulane.springtest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import top.ulane.springtest.mapper.MytableDao;
import top.ulane.springtest.model.Mytable;
import top.ulane.springtest.service.MytableService;

@Service("mytableService")
public class MytableServiceImpl implements MytableService{

	@Autowired
    private MytableDao mytableDao;
    
    public int deleteByPrimaryKey(Integer id){
        return mytableDao.deleteByPrimaryKey(id);
    }

    public int insert(Mytable record){
        return mytableDao.insert(record);
    }

    public int insertSelective(Mytable record){
        return mytableDao.insertSelective(record);
    }

    public Mytable selectByPrimaryKey(Integer id){
        return mytableDao.selectByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(Mytable record){
        return mytableDao.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Mytable record){
        return mytableDao.updateByPrimaryKey(record);
    }

}
