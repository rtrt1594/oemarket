package oe.market.common.chabun.dao;

import oe.market.board.vo.OeBoardVO;
import oe.market.comm.vo.OeCommVO;
import oe.market.like.vo.OeLikeVO;
import oe.market.mem.vo.OeMemVO;

public interface OeChabunDAO {
	
	public OeMemVO getOeMemberChabun();
	public OeBoardVO getOeBoardChabun();
	public OeCommVO getOeCommChabun();
	public OeLikeVO getOeLikeChabun();
}
