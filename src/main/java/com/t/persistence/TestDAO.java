package com.t.persistence;
import java.util.List;

import com.t.domain.TestVO;

public interface TestDAO {
	
	public String getTime();
//	public List selectTestAll();
	public void insertMember(TestVO vo);
}
