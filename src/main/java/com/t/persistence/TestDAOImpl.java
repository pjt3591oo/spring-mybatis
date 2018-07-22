package com.t.persistence;

import java.util.List;
import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import com.t.domain.TestVO;

@Repository
public class TestDAOImpl implements TestDAO{

	@Inject
	private SqlSession sqlSession;
	
	private static final String namespace = "com.t.mapper.TestMapper";
	
	@Override
	public String getTime() {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(namespace+ ".getTime");
	}

	@Override
	public void insertMember(TestVO vo) {
		// TODO Auto-generated method stub
		sqlSession.insert(namespace+".insertMember", vo);
	}

//	@Override
//	public List selectTestAll() {
//		return sqlSession.selectList(namespace+".selectTestAll");
//	}
}
