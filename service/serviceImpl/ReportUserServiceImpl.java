package cn.edu.bjtu.weibo.service.impl;

import cn.edu.bjtu.weibo.service.ReportUserService;
import cn.edu.bjtu.weibo.dao.ReportDAO;
import cn.edu.bjtu.weibo.dao.impl.ReportDAOImpl;

public class ReportUserServiceImpl implements ReportUserService{

	private ReportDAO reportDAO = null;
	
	public boolean ReportUser(String userId, String reportedUserId) {
		// TODO Auto-generated method stub
		
		reportDAO = new ReportDAOImpl();
		if(reportDAO.ReportUser(userId, reportedUserId) == true)
			return true;
		else
			return false;
	}

}
