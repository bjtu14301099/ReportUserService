package cn.edu.bjtu.weibo.service.impl;

import cn.edu.bjtu.weibo.service.ReportUserService;
import cn.edu.bjtu.weibo.dao.ReportDAO;

@Service("reportUserService")
public class ReportUserServiceImpl implements ReportUserService{

	@Autowired
	ReportDAO reportDAO;
	
	@Override
	public boolean ReportUser(String userId, String reportedUserId) {
		// TODO Auto-generated method stub
		
		if(reportDAO.ReportUser(userId, reportedUserId) == true)
			return true;
		else
			return false;
	}

}
