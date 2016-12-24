package cn.edu.bjtu.weibo.service.impl;

import cn.edu.bjtu.weibo.service.ReportUserService;
import cn.edu.bjtu.weibo.dao.ReportDAO;
import cn.edu.bjtu.weibo.dao.impl.ReportDaoImpl;

public class ReportUserServiceImpl implements ReportUserService{

	private ReportDAO report = null;
	
	public boolean ReportUser(String userId, String reportedUserId) {
		// TODO Auto-generated method stub
		
		report = new ReportDaoImpl();
		if(report.ReportUser(userId, reportedUserId) == true)
			return true;
		else
			return false;
	}

}
