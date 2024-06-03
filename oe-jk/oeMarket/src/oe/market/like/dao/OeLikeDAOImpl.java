package oe.market.like.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import oe.market.like.vo.OeLikeVO;

@Repository
public class OeLikeDAOImpl implements OeLikeDAO {
	Logger logger = LogManager.getLogger(OeLikeDAOImpl.class);
	
	@Autowired(required=false)
	private SqlSession sqlSession;
	
	@Override
	public int oeLikeInsert(OeLikeVO ovo) {
		
		logger.info("oelikeInsert 진입 >>> : ");
		
		return (Integer)sqlSession.insert("oeLikeInsert", ovo);
	}

}
